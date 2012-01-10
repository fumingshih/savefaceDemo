package com.restfb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.hp.hpl.jena.datatypes.xsd.XSDDateTime;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.ibm.adtech.jastor.Thing;
import com.restfb.types.Comment;
import com.restfb.types.FacebookType;
import com.restfb.types.NamedFacebookType;

import edu.mit.dig.saveface.model.Action.Action;
import edu.mit.dig.saveface.model.Education.Education;
import edu.mit.dig.saveface.model.Privacy.Privacy;
import edu.mit.dig.saveface.model.Tag.Tag;
import edu.mit.dig.saveface.model.Venue.Venue;
import edu.mit.dig.saveface.model.Work.Work;
import edu.mit.dig.saveface.model.user.Factory;
import edu.mit.dig.saveface.model.Comment.*;

public class RDFUtils {
	/*
	 * Help to populate rdf into Jena RDF model
	 */
// For persistant storage
 
	private static Model model ; 
 
//	private static String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
//    private static String FACEBOOK_BN = "http://foolme.csail.mit.edu/data/saveface/bn/";
	private static String PORT = System.getProperty("port","2020");
	private static String SERVER_NAME = System.getProperty("servername", "localhost");
	private static String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	private static String FACEBOOK_BN = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/bn/";	
	
	public static Model getModel (){
		return model;
		
	}
	public static void initModel(Model m){
		model = m;
		
	}
	
	/** 
	 *  Help to populate all the connection of an object of some fb.type
	 * @param model The Jena model
	 * @param item The RestFB FacebookType object, that has connection
	 * @param connection The RestFB Connection object which holds the connecting items
	 * @param connectName The relationship name of this conneciton (for "me/friends", it is "friends)
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static <T> void populateConnection(Model model, Object item, Connection<T> connection, String connectName) throws SecurityException, 
	NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		//this only populate the connected item for that connection page
		//example, if the connection is returned by fectchConnection("me/friends")
		List<T> data = new ArrayList<T>();
 
		if(connection.getData().size() == 0)
			return; //if the connection has no values, then do nothing
		
		data.addAll(connection.getData());
 
		for(T t : data){
			Class clazz = t.getClass();
			Method mRDFizer = clazz.getMethod("toRDF",com.hp.hpl.jena.rdf.model.Model.class);
			mRDFizer.invoke(t,model); //now we convert all RestFB objects in this connection to RDF object
//			model.write(System.out);
			Class clazz2 = item.getClass(); 
			Method getRDFThing = clazz2.getMethod("getRDFThing", null);
			Object rdfThing = getRDFThing.invoke(item, null); //now we have the ref to the RDFThing for this item (e.g Resource node of "me"))
			
			//get the Method 'add"connectName"'(e.g. addFriends), for example, for a model.User, we have addFriends
			Class classRDF = rdfThing.getClass();
			Method addMethod = classRDF.getMethod("add"+connectName.toUpperCase().charAt(0)+connectName.substring(1), Thing.class);

			
			//add the RDF resource Node of t(RDF object of the connection object which we just created), to rdfThing (the RDF resource of the item)
			Class connectedClass = t.getClass();
			Method getRDFThingForT = connectedClass.getMethod("getRDFThing", null);
			Object rdfT = getRDFThingForT.invoke(t,null);
			
			addMethod.invoke(rdfThing, rdfT);
			
		}
		
		
	}
    
    public static void populateInnerClass(Model model, Object item, com.ibm.adtech.jastor.Thing rdfThing ) throws IllegalArgumentException, 
    IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
    	//read all item's value into rdfThing
 
    	Method[] methodsOfInnerClass = item.getClass().getDeclaredMethods();
		for(Method mInner : methodsOfInnerClass){
			if(mInner.getName().substring(0, 3).equals("get")){
				
				String fieldInner = mInner.getName().substring(3);
				Object o  = mInner.invoke(item, null);
				if(o!=null){
					if(o instanceof List) // e.g. your Education could have more then one concentration!
						readInnerList(model, (List)o,rdfThing,fieldInner);
					else
						if(o!=null)
							readItem(model,o, rdfThing, fieldInner);
 				}
			}
		}
 
    }
    
    /*
     * Within property of inner class, use this to read list of item. E.g. Education-->concentration has many items
     */
 
    
    private static void readInnerList(Model model, List list, com.ibm.adtech.jastor.Thing rdfThing, String fieldName) throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    	for(Object o : list ){
    		readItem(model, o, rdfThing, fieldName);
    		
    	}
    	
    }

	//when creating XSDDatetime using Jena, Jena explicitly take time zone into consideration
	//we have to reverse the "timezone" effect here
    private static void fixTimeZone(Calendar calendar){
		
		calendar.set(Calendar.ZONE_OFFSET, 0);
		calendar.set(Calendar.DST_OFFSET, 0);  	
    }
  
 
    public static void readItem(Model model, Object o, com.ibm.adtech.jastor.Thing RDFThing, String fieldName) throws 
    SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
    	
    	Method rdfMethod;
    	Class RDFClass = RDFThing.getClass();
    	
		if (o instanceof com.restfb.types.NamedFacebookType){
				String fbId = ((NamedFacebookType)o).getId();
				//create a Jastor thing here for NameFacebookType
				Thing fbThing = Factory.createThing(FACEBOOK_PREFIX + fbId, model);
				Class paramType = com.ibm.adtech.jastor.Thing.class;
				rdfMethod = RDFClass.getMethod("add"+fieldName, paramType);
				
				rdfMethod.invoke(RDFThing, fbThing);
				
				//add name here to that node
				model.add(fbThing.resource(), model.createProperty("http://foolme.csail.mit.edu/ns/saveFace/Thing#name"), ((com.restfb.types.NamedFacebookType) o).getName());
				//add a label of this namedFacebookType
				String label = ((com.restfb.types.NamedFacebookType) o).getName();
				model.add(fbThing.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label==null?"":label);

				
				if(o.getClass().getName()=="CategorizedFacebookType"){ //add category to that node now, if it is a categorizedFacebookType
					if (((com.restfb.types.CategorizedFacebookType) o).getCategory()!=null)
						model.add(fbThing.resource(), model.createProperty("http://foolme.csail.mit.edu/ns/saveFace/Thing#category"),((com.restfb.types.CategorizedFacebookType) o).getCategory());
				
				}	
			}else if (o instanceof com.restfb.types.Venue){
				
				//for event's "venue",
				String id = Integer.toString(((com.restfb.types.Venue)o).hashCode());
				Resource blankNode = model.createResource(FACEBOOK_BN + id);
				Venue venue = edu.mit.dig.saveface.model.Venue.Factory.createVenue(blankNode, model);
				Class paramType = com.ibm.adtech.jastor.Thing.class;
				rdfMethod = RDFClass.getMethod("add"+fieldName, paramType);
				rdfMethod.invoke(RDFThing, venue);
				populateInnerClass(model, o, venue);
				
			}else if(o instanceof com.restfb.types.Post.Privacy){
				//to generate a id for privacy blank node, 
				//hashedString of the privacy block of content? 
				String id = Integer.toString(((com.restfb.types.Post.Privacy)o).hashCode());
				
				Resource blankNode = model.createResource(FACEBOOK_BN + id);
				Privacy privacy = edu.mit.dig.saveface.model.Privacy.Factory.createPrivacy(blankNode, model);
				Class paramType = com.ibm.adtech.jastor.Thing.class;
				rdfMethod = RDFClass.getMethod("add"+fieldName, paramType);
				rdfMethod.invoke(RDFThing, privacy);
				populateInnerClass(model,o, privacy);
				
			}
			else if (o instanceof com.restfb.types.Post.Comments){
				//Comments within post is a bit tricky, the returned value of post.comments is not a list type, but a
				//innerclass that has a 'data' field which is a list of "Comment", and a 'count' field 
				List<Comment> allComments = ((com.restfb.types.Post.Comments)o).getData();
				for(Comment c : allComments){
					String id = Integer.toString(((com.restfb.types.Comment)c).hashCode());
					Resource blankNode = model.createResource(FACEBOOK_BN + id);
					edu.mit.dig.saveface.model.Comment.Comment comment = 
						edu.mit.dig.saveface.model.Comment.Factory.createComment(blankNode, model);
					Class paramType = com.ibm.adtech.jastor.Thing.class;
					rdfMethod = RDFClass.getMethod("add"+fieldName, paramType);
					rdfMethod.invoke(RDFThing, comment);
					populateInnerClass(model,c, comment);
				}
				
				Long commentCount = ((com.restfb.types.Post.Comments)o).getCount();
				Class paramType = commentCount.getClass();
				rdfMethod = RDFClass.getMethod("addCommentsCount", paramType);
				rdfMethod.invoke(RDFThing, commentCount);
				
			
			}
		
			
							
			else if (o instanceof java.util.Date){
				 
				//deal with special translation between Date & com.hp.hpl.jena.datatypes.xsd.XSDDateTime
				//***when creating XSDDatetime using Jena, Jena explicitly take time zone into consideration
				//we have to reverse the "timezone" effect here
 
				Calendar calendar = Calendar.getInstance();
				calendar.setTime((Date)o);
    			//when creating XSDDatetime using Jena, Jena explicitly take time zone into consideration
				//we have to reverse the "timezone" effect here
				fixTimeZone(calendar);
				XSDDateTime datetime = new XSDDateTime(calendar);
				
				rdfMethod = RDFClass.getMethod("add"+fieldName, com.hp.hpl.jena.datatypes.xsd.XSDDateTime.class);
				rdfMethod.invoke(RDFThing, datetime);
			}
			
			//deal with other Java return type 
			else{
				Class classType = o.getClass();
				rdfMethod = RDFClass.getMethod("add"+fieldName, classType);
				rdfMethod.invoke(RDFThing, o);
			}
    	
    	
    }
	
}


