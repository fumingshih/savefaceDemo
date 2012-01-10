/*
 * Copyright (c) 2010 Mark Allen.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.restfb.types;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.ibm.adtech.jastor.Thing;
import com.restfb.Facebook;
import com.restfb.RDFUtils;
import com.restfb.types.Photo.Tag;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/video">Video Graph
 * API type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Video extends FacebookType {
  //added by Fuming Shih
  @Facebook
  private String picture;
  
  @Facebook("embed_html")
  private String embedHtml;
  @Facebook
  private String source;
  //
	
  @Facebook
  private String id;
  
  @Facebook
  private CategorizedFacebookType from;

  @Facebook
  private String message;

  @Facebook
  private String description;

  @Facebook
  private Integer length;

  @Facebook("created_time")
  private String createdTime;

  @Facebook("updated_time")
  private String updatedTime;
  
  @Facebook(contains = Tag.class)
  private List<Tag> tags = new ArrayList<Tag>();
  
  public static class Tag extends NamedFacebookType {
		@Facebook 
		private String name;

	    @Facebook("created_time")
	    private String createdTime;

	    /*
	     * Name of the tag
	     * @return Name of the tag
	     */
	    public String getName(){
	    	
	    	return name;
	    }

	    /**
	     * Date this tag was created.
	     * 
	     * @return Date this tag was created.
	     */
	    public Date getCreatedTime() {
	      return StringUtils.toDate(createdTime);
	    }
	  }
/**
 * The source of the video
 * @return source of the video
 */
  public String getSource(){
	return source;  
	  
  }
  /**
   * The embed html for the video
   * @return The embed html for the video
   */
  public String getEmbedHtml(){
	  return embedHtml;
  }
  /**
   * The picture of the video (a snapshot)
   * @return The snapshot picture of the video
   */
  public String getPicture(){
	  return picture;
  }
  
  /**
   * The id of the video
   * @return id of the video
   */
  public String getId(){
	  return id;
  }
  /**
   * An object containing the name and ID of the user who posted the video.
   * 
   * @return An object containing the name and ID of the user who posted the
   *         video.
   */
  public CategorizedFacebookType getFrom() {
    return from;
  }

  /**
   * The video title / caption.
   * 
   * @return The video title / caption.
   */
  public String getMessage() {
    return message;
  }

  /**
   * The long-form HTML description of the video.
   * 
   * @return The long-form HTML description of the video.
   */
  public String getDescription() {
    return description;
  }

  /**
   * The length of the video, in seconds.
   * 
   * @return The length of the video, in seconds.
   */
  public Integer getLength() {
    return length;
  }

  /**
   * The time the video was initially published.
   * 
   * @return The time the video was initially published.
   */
  public Date getCreatedTime() {
    return StringUtils.toDate(createdTime);
  }

  /**
   * The last time the video or its caption were updated.
   * 
   * @return The last time the video or its caption were updated.
   */
  public Date getUpdatedTime() {
    return StringUtils.toDate(updatedTime);
  }
  
  public List<Tag> getTags() {
	    return Collections.unmodifiableList(tags);
  }
  
  
  private edu.mit.dig.saveface.model.Video.Video videoRDF = null;
  
  public edu.mit.dig.saveface.model.Video.Video getRDFThing(){
	  return videoRDF;
	  
  }
  public void toRDF(Model model)throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
	  
	  //String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
	  //String FACEBOOK_BN = "http://foolme.csail.mit.edu/data/saveface/bn/"; //which means that this is has no corresponding facebook id to it
	  
	  String PORT = System.getProperty("port","2020");
	  String SERVER_NAME = System.getProperty("servername", "localhost");
	  String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	  String FACEBOOK_BN = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/bn/";	
	  
	  Class videoClass = this.getClass();
	  String video_id = this.getId();
	  Method[] methods = videoClass.getDeclaredMethods();
	
	  videoRDF = edu.mit.dig.saveface.model.Video.Factory.createVideo(FACEBOOK_PREFIX + video_id, model);
	  //clean up error triples created previously
	  model.remove(videoRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));

	  if(this.getMessage()!=null)
	  {	  
		  String label = this.getMessage();
		  model.add(videoRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label);
	  }			
	  Class videoRDFClass = videoRDF.getClass();
	  
		for(Method m : methods){
			Object o = null;
			String methodName = m.getName();
			String fieldName = methodName.substring(3);  
			if(!(methodName.equals("toRDF")|methodName.equals("getRDFThing")))
				o  = m.invoke(this, null);  
			Method rdfMethod;
			if(o!=null){
 
				if( o instanceof List){
					//deal with list of tags
					List list = (List)o;
					
					rdfMethod = videoRDFClass.getMethod("add"+fieldName, Thing.class);

					for(int i = 0; i< list.size(); i++){

						Object item = list.get(i); //this is a tag
						String id = Integer.toString (((com.restfb.types.Video.Tag) item).hashCode());
						Resource blankNode = model.createResource(FACEBOOK_BN + id);
						edu.mit.dig.saveface.model.VideoTag.Tag tag = edu.mit.dig.saveface.model.VideoTag.Factory.createTag(blankNode, model);
						//String tagName = (String) tag.getName().next();
						if(tag.getName().hasNext())
						{   
							String tagName = (String) tag.getName().next();
							model.add(tag.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"),tagName);
						}
						rdfMethod.invoke(videoRDF,  tag);
						//now read those items that within Tag block
						RDFUtils.populateInnerClass(model,item, tag);


					}
					
				}
				else{
					RDFUtils.readItem(model,o, videoRDF, fieldName);
				}
			}//end of o!=null 
 
		}//end of (for Method...)		
	}
}