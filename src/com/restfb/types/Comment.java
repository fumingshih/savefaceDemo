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
import java.util.Date;

import com.hp.hpl.jena.rdf.model.Model;
import com.restfb.Facebook;
import com.restfb.RDFUtils;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/event">Comment Graph
 * API type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Comment extends FacebookType {
  @Facebook 
  private String id;
  @Facebook
  private NamedFacebookType from;

  @Facebook
  private String message;

  @Facebook("created_time")
  private String createdTime;
  /**
   * The id of the comment
   * @return Id of the comment
   */
  public String getId(){
	  return id;
  }
  /**
   * User who posted the comment.
   * 
   * @return User who posted the comment.
   */
  public NamedFacebookType getFrom() {
    return from;
  }

  /**
   * Text contents of the comment.
   * 
   * @return Text contents of the comment.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Date on which the comment was created.
   * 
   * @return Date on which the comment was created.
   */
  public Date getCreatedTime() {
    return StringUtils.toDate(createdTime);
  }
  
  private edu.mit.dig.saveface.model.Comment.Comment commentRDF = null;
  
  public edu.mit.dig.saveface.model.Comment.Comment getRDFThing(){
	  return commentRDF;
	  
  }
  
   public void toRDF(Model model)throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
		//to test this method, we need to use connection in RestFB
 
		//String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
	 	String PORT = System.getProperty("port","2020");
	  	String SERVER_NAME = System.getProperty("servername", "localhost");
	  	String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
		
		Class commentClass = this.getClass();
		String comment_id = this.getId();
		Method[] methods = commentClass.getDeclaredMethods();
	
		commentRDF = edu.mit.dig.saveface.model.Comment.Factory.createComment(FACEBOOK_PREFIX + comment_id, model);
		if(this.getMessage()!=null){
			String label = this.getMessage();
			model.add(commentRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"),label);
		}
		for(Method m : methods){
			Object o = null;
			String methodName = m.getName();
			String fieldName = methodName.substring(3);  
			if(!(methodName.equals("toRDF")|methodName.equals("getRDFThing")))
				o  = m.invoke(this, null);  

			if(o!=null){
					RDFUtils.readItem(model,o, commentRDF, fieldName);
 
			}//end of o!=null 
 
		}//end of (for Method...)		
	}
}