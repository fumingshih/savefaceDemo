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

import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.ibm.adtech.jastor.Thing;
import com.restfb.Facebook;
import com.restfb.RDFUtils;

import edu.mit.dig.saveface.model.Tag.Tag;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/photo">Photo Graph
 * API type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Photo extends NamedFacebookType {
  @Facebook
  private String id;
  @Facebook
  private String name;
 // ***** Above added by Fuming Shih
  @Facebook
  private CategorizedFacebookType from;

  @Facebook
  private String picture;

  @Facebook
  private String source;

  @Facebook
  private Integer height;

  @Facebook
  private Integer width;

  @Facebook
  private String link;

  @Facebook
  private String icon;

  @Facebook("created_time")
  private String createdTime;

  @Facebook("updated_time")
  private String updatedTime;

  @Facebook(contains = Tag.class)
  private List<Tag> tags = new ArrayList<Tag>();

  /**
   * Represents the <a
   * href="http://developers.facebook.com/docs/reference/api/photo">Tag Graph
   * API type</a>.
   * 
   * @author <a href="http://restfb.com">Mark Allen</a>
   * @since 1.5
   */
  public static class Tag extends NamedFacebookType {
	@Facebook 
	private String name;
	
    @Facebook
    private Integer x;

    @Facebook
    private Integer y;

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
     * X coordinate (as a percentage of distance from left vs. width).
     * 
     * @return X coordinate (as a percentage of distance from left vs. width).
     */
    public Integer getX() {
      return x;
    }

    /**
     * Y coordinate (as a percentage of distance from top vs. height).
     * 
     * @return Y coordinate (as a percentage of distance from top vs. height).
     */
    public Integer getY() {
      return y;
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
 * The id of the photo
 */
  public String getId(){
	  return id;
	  
  }
  /**
   * The name of the photo
   */
  public String getName(){
	  return name;
  }
  /**
   * An object containing the name and ID of the user who posted the photo.
   * 
   * @return An object containing the name and ID of the user who posted the
   *         photo.
   */
  public CategorizedFacebookType getFrom() {
    return from;
  }

  /**
   * The album-sized view of the photo.
   * 
   * @return The album-sized view of the photo.
   */
  public String getPicture() {
    return picture;
  }

  /**
   * The full-sized source of the photo.
   * 
   * @return The full-sized source of the photo.
   */
  public String getSource() {
    return source;
  }

  /**
   * The height of the photo, in pixels.
   * 
   * @return The height of the photo, in pixels.
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * The width of the photo, in pixels.
   * 
   * @return The width of the photo, in pixels.
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * A link to the photo on Facebook.
   * 
   * @return A link to the photo on Facebook.
   */
  public String getLink() {
    return link;
  }

  /**
   * The icon-sized source of the photo.
   * 
   * @return The icon-sized source of the photo.
   */
  public String getIcon() {
    return icon;
  }

  /**
   * The time the photo was initially published.
   * 
   * @return The time the photo was initially published.
   */
  public Date getCreatedTime() {
    return StringUtils.toDate(createdTime);
  }

  /**
   * The last time the photo or its caption was updated.
   * 
   * @return The last time the photo or its caption was updated.
   */
  public Date getUpdatedTime() {
    return StringUtils.toDate(updatedTime);
  }

  /**
   * An array containing the users and their positions in this photo. The x and
   * y coordinates are percentages from the left and top edges of the photo,
   * respectively.
   * 
   * @return An array containing the users and their positions in this photo.
   *         The x and y coordinates are percentages from the left and top edges
   *         of the photo, respectively.
   */
  public List<Tag> getTags() {
    return Collections.unmodifiableList(tags);
  }
  
  
  private edu.mit.dig.saveface.model.Photo.Photo photoRDF = null;
  
  public edu.mit.dig.saveface.model.Photo.Photo getRDFThing(){
	  return photoRDF;
	  
  }
  public void toRDF(Model model) throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
 
		//String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
		//String FACEBOOK_BN = "http://foolme.csail.mit.edu/data/saveface/bn/"; //which means that this is has no corresponding facebook id to it
		
	 	String PORT = System.getProperty("port","2020");
	  	String SERVER_NAME = System.getProperty("servername", "localhost");
	  	String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	  	String FACEBOOK_BN = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/bn/";	
		
		
		Class photoClass = this.getClass();
		String photo_id = this.getId();
		Method[] methods = photoClass.getDeclaredMethods();
	
		photoRDF = edu.mit.dig.saveface.model.Photo.Factory.createPhoto(FACEBOOK_PREFIX + photo_id, model);
		  //clean up error triples created previously
		model.remove(photoRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));

		if(this.getName()!=null){
			String label = this.getName();
			model.add(photoRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"),  label);
		}
		Class photoRDFClass = photoRDF.getClass();
		
		for(Method m : methods){
			Object o = null;
			String methodName = m.getName();
			String fieldName = methodName.substring(3); //getFirstName --> FirstName ; now we invoke RDF's addFirstName
			if(!(methodName.equals("toRDF")|methodName.equals("getRDFThing")))
				o  = m.invoke(this, null); //get the object of the method (Object o = getId())
			Method rdfMethod;
			if(o!=null){

				//deal with return type that's a List
				if( o instanceof List){
					List list = (List)o;
					if(list.size()>0){
						Object first = list.get(0);
						
						if(!(first instanceof com.restfb.types.Photo.Tag)){
							for (int i = 0; i < list.size(); i++){
								RDFUtils.readItem(model,list.get(i),photoRDF,fieldName);
							}
						}
						else{
 
							
							rdfMethod = photoRDFClass.getMethod("add"+fieldName, Thing.class);

							for(int i = 0; i< list.size(); i++){

								Object item = list.get(i); //this is a tag
								String id = Integer.toString (((com.restfb.types.Photo.Tag) item).hashCode());
								Resource blankNode = model.createResource(FACEBOOK_BN + id);
								edu.mit.dig.saveface.model.Tag.Tag tag = edu.mit.dig.saveface.model.Tag.Factory.createTag(blankNode, model);
								//String tagName = (String) tag.getName().next();
								if(tag.getName().hasNext())
								{   
									String tagName = (String) tag.getName().next();
									model.add(tag.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"),tagName);
								}
								rdfMethod.invoke(photoRDF,  tag);
								//now read those items that within Tag block
								RDFUtils.populateInnerClass(model,item, tag);
 

							}
							
						}
					}
				}
				
				//item that's in the first level
				else{
					RDFUtils.readItem(model,o, photoRDF, fieldName);
				}
 
			}//end of o!=null
 
		}//end of (for Method...)
 
		
	}
}