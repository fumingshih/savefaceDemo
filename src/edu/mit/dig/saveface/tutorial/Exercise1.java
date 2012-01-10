package edu.mit.dig.saveface.tutorial;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookException;
import com.restfb.FacebookNetworkException;
import com.restfb.Parameter;
import com.restfb.RDFUtils;
import com.restfb.types.Album;
import com.restfb.types.Comment;
import com.restfb.types.Photo;
import com.restfb.types.User;


public class Exercise1 {

	/**
	 * @param args
	 */
	
	private static User rootuser;  
	private static User user; 
	private static FacebookClient facebookClient;
	private static Model model;
	
	/**
	 * Store rootuser's Facebook Stuff
	 */
	  
	private static List<Album> albums = new ArrayList<Album>();
	private static List<User> friends = new ArrayList<User>();
	private static List<Photo> photos  = new ArrayList<Photo>();
	private static List<Comment> comments = new ArrayList<Comment>();
	
	
	  /**
	   * Logger.
	   */
	private static final Logger logger = Logger.getLogger(Exercise1.class);
	
	public static void initModel(String directory, String id, String token) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		
		facebookClient = new DefaultFacebookClient(token);
		
		try{
			rootuser = facebookClient.fetchObject(id, User.class);
			}catch(Exception e){
				logger
		          .warn("An error occurred while making a GET request to get the user" + rootuser, e);
			}
		 
		String ngId = rootuser.getFirstName()+rootuser.getLastName();
 
		String mainNG = "urn:saveface:dataGraph:"+ngId;
 
		model = TDBFactory.createNamedModel(mainNG, directory);
		
		rootuser.toRDF(model);
  
		
	}
	
	public static void fetchAllPhotos(List<Album> albums) throws FacebookException, SecurityException, IllegalArgumentException, 
	NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		//try to fetch user's all photos in the album information
 
		//fetch the most recent 10 albums, some people have too many albums~
		for(int i = 0; i< albums.size(); i++){
			
			fetchPhotos(albums.get(i));
			if(i > 9)
				break;
		}

	}
	
	/**
	 * 
	 * @param album The album to fetch all the photos and comments of the album
	 * @throws FacebookException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void fetchPhotos(Album album)throws FacebookException, SecurityException, IllegalArgumentException, 
	NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		photos.clear();
		comments.clear();
		int fetchNum = 49;//get all the photos of each album, however, only fetch the first 50 photos in the album
		
				try{
			Connection <Photo> photoPage = facebookClient.fetchConnection(album.getId()+"/photos", Photo.class);
			RDFUtils.populateConnection(model, album, photoPage, "photos");
			//logDataSize(photoPage.getData(), album.getId()+"/photos");
			photos.addAll(photoPage.getData());
 
			int photoOffset = photos.size();
			while(photoPage.hasNext()){
				Connection<Photo> photoNextPage = facebookClient.fetchConnection(album.getId()+"/photos", Photo.class, Parameter.with("offset",photoOffset));
				if(photoNextPage.getData().size() == 0)
					break;
				photos.addAll(photoNextPage.getData());
				RDFUtils.populateConnection(model, album, photoNextPage, "photos");
 
				photoOffset = photos.size(); 
				if(photos.size() > fetchNum) //only get the first two pages, 
					break;
					
			}
			
			//get all the comments of this album
			Connection <Comment> commentPage = facebookClient.fetchConnection(album.getId()+"/comments", Comment.class);
			RDFUtils.populateConnection(model, album, commentPage, "comments");
		//	logDataSize(commentPage.getData(), album.getId()+"/comments");
			comments.addAll(commentPage.getData());
			int commentOffset = comments.size();
			while(commentPage.hasNext()){
				Connection<Comment> commentNextPage = facebookClient.fetchConnection(album.getId()+"/comments", Comment.class, Parameter.with("offset",commentOffset));
				if(commentNextPage.getData().size() == 0)
					break;
				comments.addAll(commentNextPage.getData());
				RDFUtils.populateConnection(model, album, commentNextPage, "comments");
				commentOffset = comments.size();
			}
		}catch(FacebookNetworkException e){
			if(logger.isDebugEnabled())
				logger.debug("not able to view photo and comment of this album:"+album.getId());
		}
		
		comments.clear(); //clear comments for the album, now used for photos
		//fetch all the comments of the photos in this album
		for (Photo photo:photos){
			try{
				Connection <Comment> commentPage = facebookClient.fetchConnection(photo.getId()+"/comments", Comment.class);
				
				RDFUtils.populateConnection(model, photo, commentPage, "comments");
			//	logDataSize(commentPage.getData(), photo.getId()+"/comments");
				comments.addAll(commentPage.getData());
				int photoCommentOffset = comments.size();
				while(commentPage.hasNext()){
					Connection<Comment> commentNextPage = facebookClient.fetchConnection(photo.getId()+"/comments", Comment.class, Parameter.with("offset",photoCommentOffset));
					if(commentNextPage.getData().size() == 0)
						break;
					comments.addAll(commentNextPage.getData());
					RDFUtils.populateConnection(model, photo, commentNextPage, "comments");
					photoCommentOffset = comments.size();
				}
			}catch(FacebookNetworkException e){
				if(logger.isDebugEnabled())
					logger.debug("not able to view photo and comment of this photo:" + photo.getId());
			}
				
		}
 
		
	}
	
	
	public static void fetchAlbums(User user) throws FacebookException, SecurityException, IllegalArgumentException, 
	NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		
		albums.clear();
		String userId = user.getId();
		try{
			Connection<Album> albumPage = facebookClient.fetchConnection(userId+"/albums", Album.class);
			RDFUtils.populateConnection(model, user, albumPage, "albums");
			//logDataSize(albumPage.getData(), userId+"/albums");
			albums.addAll(albumPage.getData());
			int albumOffset = albums.size();
			//note that sometimes a user has more than one page of albums(connection), need to iterate here 
			while(albumPage.hasNext()){
				Connection<Album> albumNextPage = facebookClient.fetchConnection(userId+"/albums", Album.class, Parameter.with("offset", albumOffset));
				if(albumNextPage.getData().size()==0)
					break;
				albums.addAll(albumNextPage.getData());
				RDFUtils.populateConnection(model, user, albumNextPage, "albums");
				albumOffset = albums.size();
				
			}
		}
		catch(FacebookNetworkException e){
			if(logger.isDebugEnabled())
				logger.debug("not able to fetch user's albums");
		}
		 
	}
	
	public static void fetchFriends(User user) throws FacebookException, SecurityException, 
	IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		String userId = user.getId();
		try{
			friends.clear();
			 
			Connection<User> friendPage = facebookClient.fetchConnection(userId+"/friends", User.class);
			//logDataSize(friendPage.getData(), userId+"/friends");
			RDFUtils.populateConnection(model, user, friendPage, "friends");
 
			friends.addAll(friendPage.getData());
			
			//note that some user has more that hundreds of friend, need to iterate through pages
			int friendOffset = friends.size();
			//int friendOffset = friendSize;
			while(friendPage.hasNext()){
				
				Connection<User> friendNextPage = facebookClient.fetchConnection(userId+"/friends", User.class,Parameter.with("offset", friendOffset));
				if(friendNextPage.getData().size()==0)
					break;
				friends.addAll(friendNextPage.getData());
				RDFUtils.populateConnection(model, user, friendNextPage, "friends");
				friendOffset = friends.size();
				
				
			}
		}catch(FacebookNetworkException e){
			if(logger.isDebugEnabled())
			logger.debug("not able to view this friend part");
		}
	}
	
	public static void main(String[] args) throws SecurityException, IllegalArgumentException, FacebookException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		/*
		 * Before you run, 
		 * 1) create a directory for RDF datastore 
		 * 2) login to your Facebook
		 * 3) go to http://developers.facebook.com/docs/reference/api/ ; click on one of the links to get the access_token  
		 */
		
		String directory = "/Users/fuming/tmp/saveface_demo";   //change this to your created directory
		//use your token obtained from Facebook, the token will expire after 1 hour
		String token = "AAAAAAITEghMBAI6lX5LZAkMRBXSas1XZBw0pYqdbF4o203OvZAU1CtEKca6IFJ25ToaRP7AePrqvNc5S5ZC19ZCwQSWTRqKGpJvDaDouECwZDZD";
		Exercise1.initModel(directory, "me", token);
	//	Exercise1.fetchFriends(rootuser);
		Exercise1.fetchAlbums(rootuser);
		Exercise1.fetchAllPhotos(albums);
		
		
		
		
		

	}

}
