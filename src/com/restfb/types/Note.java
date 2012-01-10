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
 * href="http://developers.facebook.com/docs/reference/api/note">Note Graph API
 * type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Note extends FacebookType {
  @Facebook
  private NamedFacebookType from;

  @Facebook
  private String subject;

  @Facebook
  private String message;

  @Facebook
  private String icon;

  @Facebook("created_time")
  private String createdTime;

  @Facebook("updated_time")
  private String updatedTime;

  /**
   * The ID of the user who posted the note.
   * 
   * @return The ID of the user who posted the note.
   */
  public NamedFacebookType getFrom() {
    return from;
  }

  /**
   * The title of the note.
   * 
   * @return The title of the note.
   */
  public String getSubject() {
    return subject;
  }

  /**
   * The note content, an HTML string.
   * 
   * @return The note content, an HTML string.
   */
  public String getMessage() {
    return message;
  }

  /**
   * The note icon.
   * 
   * @return The note icon.
   */
  public String getIcon() {
    return icon;
  }

  /**
   * The time the note was initially published.
   * 
   * @return The time the note was initially published.
   */
  public Date getCreatedTime() {
    return StringUtils.toDate(createdTime);
  }

  /**
   * The time the note was last updated.
   * 
   * @return The time the note was last updated.
   */
  public Date getUpdatedTime() {
    return StringUtils.toDate(updatedTime);
  }
  
  private edu.mit.dig.saveface.model.Note.Note noteRDF = null;
  
  public edu.mit.dig.saveface.model.Note.Note getRDFThing(){
	  return noteRDF;
	  
  }
  public void toRDF(Model model)throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
 
	  //String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
	 String PORT = System.getProperty("port","2020");
	  String SERVER_NAME = System.getProperty("servername", "localhost");
	  String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	  
	  Class noteClass = this.getClass();
	  String note_id = this.getId();
	  Method[] methods = noteClass.getDeclaredMethods();
	
	  noteRDF = edu.mit.dig.saveface.model.Note.Factory.createNote(FACEBOOK_PREFIX + note_id, model);
	  //clean up error triples created previously
	  model.remove(noteRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));

	  if(this.getSubject()!=null){
		  String label = this.getSubject();
		  model.add(noteRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label);
	  }
		for(Method m : methods){
			Object o = null;
			String methodName = m.getName();
			String fieldName = methodName.substring(3);  
			if(!(methodName.equals("toRDF")|methodName.equals("getRDFThing")))
				o  = m.invoke(this, null);  
			if(o!=null){
 
					RDFUtils.readItem(model,o, noteRDF, fieldName);
 
			}//end of o!=null 
 
		}//end of (for Method...)		
				
		
	}
}