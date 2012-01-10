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
import java.util.List;

import com.hp.hpl.jena.rdf.model.Model;
import com.restfb.Facebook;
import com.restfb.RDFUtils;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/event">Event Graph
 * API type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Event extends NamedFacebookType {
  @Facebook("rsvp_status")
  private String rsvpStatus;
  //tried to fix the above for conneciton such as "me/events"
  @Facebook
  private String name;
	
  @Facebook
  private String id;
  @Facebook
  private NamedFacebookType owner;

  @Facebook
  private String description;

  @Facebook("start_time")
  private String startTime;

  @Facebook("end_time")
  private String endTime;

  @Facebook
  private String location;

  @Facebook
  private Venue venue;

  @Facebook
  private String privacy;

  @Facebook("updated_time")
  private String updatedTime;

  /**
   * An object containing the name and ID of the user who owns the event
   * 
   * @return An object containing the name and ID of the user who owns the
   *         event.
   */
  public NamedFacebookType getOwner() {
    return owner;
  }
  /**
   * The rsvp status of the event (only relevant to the user specified from connection call)
   */
  public String getRsvpStatus(){
	  return rsvpStatus;
  }
  /**
   * The name of the event
   */
  public String getName(){
	  return name;
  }
  /**
   * The id of the event on the FB's page
   */
  public String getId(){
	  
	  return id;
	  
  }
  /**
   * The long-form HTML description of the event.
   * 
   * @return The long-form HTML description of the event.
   */
  public String getDescription() {
    return description;
  }

  /**
   * The start time of the event.
   * 
   * @return The start time of the event.
   */
  public Date getStartTime() {
    return StringUtils.toDate(startTime);
  }

  /**
   * The end time of the event.
   * 
   * @return The end time of the event.
   */
  public Date getEndTime() {
    return StringUtils.toDate(endTime);
  }

  /**
   * The location for this event, a string name.
   * 
   * @return The location for this event, a string name.
   */
  public String getLocation() {
    return location;
  }

  /**
   * The location of this event, a structured address object.
   * 
   * @return The location of this event, a structured address object.
   */
  public Venue getVenue() {
    return venue;
  }

  /**
   * The visibility of this event. Can be 'OPEN', 'CLOSED', or 'SECRET'.
   * 
   * @return The visibility of this event. Can be 'OPEN', 'CLOSED', or 'SECRET'.
   */
  public String getPrivacy() {
    return privacy;
  }

  /**
   * The last time the event was updated.
   * 
   * @return The last time the event was updated.
   */
  public Date getUpdatedTime() {
    return StringUtils.toDate(updatedTime);
  }
  
  private edu.mit.dig.saveface.model.Event.Event eventRDF = null;
  
  public edu.mit.dig.saveface.model.Event.Event getRDFThing(){
	  return eventRDF;
	  
  }
  
  public void toRDF(Model model)throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
		//TODO: unsolved issues of rsvp field, if the query is through connection "me/events"
		//event's return values have no list
 
		//String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
	 	String PORT = System.getProperty("port","2020");
	  	String SERVER_NAME = System.getProperty("servername", "localhost");
	  	String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	  	
		Class eventClass = this.getClass();
		String event_id = this.getId();
		Method[] methods = eventClass.getDeclaredMethods();
	
		eventRDF = edu.mit.dig.saveface.model.Event.Factory.createEvent(FACEBOOK_PREFIX + event_id, model);
		//clean the old erro labels
		model.remove(eventRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));
		if(this.getName()!=null)
		{
			String label = this.getName();
			model.add(eventRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label);
		}
		
		Class photoRDFClass = eventRDF.getClass();
		
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
						; //there's no list in the return of event query, do nothing for now
 
					}
				}
				
				//item that's in the first level
				else{
					RDFUtils.readItem(model,o, eventRDF, fieldName);
				}
 
			}//end of o!=null
 
		}//end of (for Method...)
 
	}
}