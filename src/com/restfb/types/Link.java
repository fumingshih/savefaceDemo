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

import com.hp.hpl.jena.rdf.model.Model;
import com.restfb.Facebook;
import com.restfb.RDFUtils;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/link">Link Graph API
 * type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Link extends NamedFacebookType {
  @Facebook
  private String id;
  @Facebook
  private NamedFacebookType from;

  @Facebook
  private String message;

  @Facebook
  private String picture;

  @Facebook
  private String link;

  @Facebook
  private String description;

  @Facebook
  private String icon;

  /**
   * The id of the link
   * @return The id of the link
   */
  public String getId(){
	  return id;
  }
  /**
   * An object containing the name and ID of the user who posted the link.
   * 
   * @return An object containing the name and ID of the user who posted the
   *         link.
   */
  public NamedFacebookType getFrom() {
    return from;
  }

  /**
   * The link message content.
   * 
   * @return The link message content.
   */
  public String getMessage() {
    return message;
  }

  /**
   * The picture associated with the link.
   * 
   * @return The picture associated with the link.
   */
  public String getPicture() {
    return picture;
  }

  /**
   * The actual URL that was shared.
   * 
   * @return The actual URL that was shared.
   */
  public String getLink() {
    return link;
  }

  /**
   * The link description.
   * 
   * @return The link description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * The link icon.
   * 
   * @return The link icon.
   */
  public String getIcon() {
    return icon;
  }
  
  private edu.mit.dig.saveface.model.Link.Link linkRDF = null;
  
  public edu.mit.dig.saveface.model.Link.Link getRDFThing(){
	  return linkRDF;
	  
  }
  
  public void toRDF(Model model)throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
 
	  //String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
	  String PORT = System.getProperty("port","2020");
	  String SERVER_NAME = System.getProperty("servername", "localhost");
	  String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	  
	  Class linkClass = this.getClass();
	  String page_id = this.getId();
	  Method[] methods = linkClass.getDeclaredMethods();
	
	  linkRDF = edu.mit.dig.saveface.model.Link.Factory.createLink(FACEBOOK_PREFIX + page_id, model);
	  //clean up error triples created previously
	  model.remove(linkRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));

	  if(this.getMessage()!=null){
		  String label = this.getMessage();
		  model.add(linkRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label==null?"":label);

	  }

		for(Method m : methods){
			Object o = null;
			String methodName = m.getName();
			String fieldName = methodName.substring(3);  
			
			if(!(methodName.equals("toRDF")|methodName.equals("getRDFThing")))
				o  = m.invoke(this, null);  
			
			if(o!=null){
					RDFUtils.readItem(model,o, linkRDF, fieldName);
 
			}//end of o!=null 
 
		}//end of (for Method...)		
		
	}
}