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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.ibm.adtech.jastor.Thing;
import com.restfb.Facebook;
import com.restfb.RDFUtils;

 

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/user">User Graph API
 * type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class User extends NamedFacebookType {
 
  private edu.mit.dig.saveface.model.user.User userRDF = null;
  //fuming added id, becuase we need this for RDF URI
  @Facebook("id")
  private String id;

  @Facebook("first_name")
  private String firstName;

  @Facebook("last_name")
  private String lastName;

  @Facebook
  private String link;

  @Facebook
  private String about;

  @Facebook("relationship_status")
  private String relationshipStatus;

  @Facebook
  private String religion;

  @Facebook
  private String website;

  @Facebook
  private String birthday;

  @Facebook
  private String email;

  @Facebook
  private String picture;

  @Facebook
  private Double timezone;

  @Facebook
  private Boolean verified;

  @Facebook("updated_time")
  private String updatedTime;

  @Facebook
  private String gender;

  @Facebook
  private String political;

  @Facebook
  private String locale;

  @Facebook
  private NamedFacebookType hometown;

  @Facebook
  private NamedFacebookType location;

  @Facebook(value = "interested_in", contains = String.class)
  private List<String> interestedIn = new ArrayList<String>();

  @Facebook(contains = Work.class)
  private List<Work> work = new ArrayList<Work>();

  @Facebook(contains = Education.class)
  private List<Education> education = new ArrayList<Education>();

  @Facebook(value = "meeting_for", contains = String.class)
  private List<String> meetingFor = new ArrayList<String>();

  /**
   * Represents the <a
   * href="http://developers.facebook.com/docs/reference/api/user">Work Graph
   * API type</a>.
   * 
   * @author <a href="http://restfb.com">Mark Allen</a>
   */
  public static class Work {
    /**
     * Logger.
     */
    private static final Logger logger = Logger.getLogger(Work.class);

    // Facebook month-year only date format.
    // Example: 2007-03
    private static final String FACEBOOK_MONTH_YEAR_DATE_FORMAT = "yyyy-MM";

    @Facebook
    NamedFacebookType employer;

    @Facebook
    NamedFacebookType location;

    @Facebook
    NamedFacebookType position;

    @Facebook("start_date")
    private String startDate;

    @Facebook("end_date")
    private String endDate;

    /**
     * Returns a Java representation of a Facebook month-year {@code date}
     * string.
     * 
     * @param date
     *          Facebook month-year {@code date} string.
     * @return Java date representation of the given Facebook {@code date}
     *         string.
     * @throws IllegalArgumentException
     *           If the provided {@code date} isn't in the Facebook month-year
     *           date format.
     */
    protected Date toMonthYearDate(String date) throws IllegalArgumentException {

      if (date == null)
        return null;
      else if(date.equals("0000-00"))
		return null;
      try {
        return new SimpleDateFormat(FACEBOOK_MONTH_YEAR_DATE_FORMAT)
          .parse(date);
      } catch (ParseException e) {
        logger.warn("Unable to parse date '" + date + "' using format string '"
            + FACEBOOK_MONTH_YEAR_DATE_FORMAT + "', mapping as null", e);
      }

      return null;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
      return ReflectionUtils.hashCode(this);
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object that) {
      return ReflectionUtils.equals(this, that);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return ReflectionUtils.toString(this);
    }

    /**
     * The employer for this job.
     * 
     * @return The employer for this job.
     */
    public NamedFacebookType getEmployer() {
      return employer;
    }

    /**
     * The location of this job.
     * 
     * @return The location of this job.
     */
    public NamedFacebookType getLocation() {
      return location;
    }

    /**
     * Position held at this job.
     * 
     * @return Position held at this job.
     */
    public NamedFacebookType getPosition() {
      return position;
    }

    /**
     * Date this job was started.
     * 
     * @return Date this job was started.
     */
    public Date getStartDate() {
//    	if(startDate.equals("0000-00"))
//    		return null;
      return toMonthYearDate(startDate);
    }

    /**
     * Date this job ended.
     * 
     * @return Date this job ended.
     */
    public Date getEndDate() {

      return toMonthYearDate(endDate);
    }
  }

  /**
   * Represents the <a
   * href="http://developers.facebook.com/docs/reference/api/user">Education
   * Graph API type</a>.
   * 
   * @author <a href="http://restfb.com">Mark Allen</a>
   */
  public static class Education {
    @Facebook
    NamedFacebookType school;

    @Facebook
    NamedFacebookType year;

    @Facebook
    NamedFacebookType degree;
    
    @Facebook
    String type;

    @Facebook(value = "concentration", contains = NamedFacebookType.class)
    private List<NamedFacebookType> concentration =
        new ArrayList<NamedFacebookType>();

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
      return ReflectionUtils.hashCode(this);
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object that) {
      return ReflectionUtils.equals(this, that);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return ReflectionUtils.toString(this);
    }

    /**
     * The school name and ID.
     * 
     * @return The school name and ID.
     */
    public NamedFacebookType getSchool() {
      return school;
    }

    /**
     * Graduation year.
     * 
     * @return Graduation year.
     */
    public NamedFacebookType getYear() {
      return year;
    }

    /**
     * Degree acquired.
     * 
     * @return Degree acquired.
     */
    public NamedFacebookType getDegree() {
      return degree;
    }

    /**
     * Type of school
     */
    public String getType(){
    	return type;
    	
    }
    /**
     * Concentrations/minors.
     * 
     * @return Concentrations/minors.
     */
    public List<NamedFacebookType> getConcentration() {
      return Collections.unmodifiableList(concentration);
    }
    
    
  }
  /**
   * The user's id in Facebook
   * @return The user's id
   */
  public String getId(){
	  return id;
	  
  }
  /**
   * The user's first name
   * 
   * @return The user's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * The user's last name.
   * 
   * @return The user's last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * A link to the user's profile.
   * 
   * @return A link to the user's profile.
   */
  public String getLink() {
    return link;
  }

  /**
   * The user's blurb that appears under their profile picture.
   * 
   * @return The user's blurb that appears under their profile picture.
   */
  public String getAbout() {
    return about;
  }

  /**
   * The user's relationship status.
   * 
   * @return The user's relationship status.
   */
  public String getRelationshipStatus() {
    return relationshipStatus;
  }

  /**
   * The user's birthday.
   * 
   * @return The user's birthday.
   */
  public String getBirthday() {
    return birthday;
  }

  /**
   * The user's religion.
   * 
   * @return The user's religion.
   */
  public String getReligion() {
    return religion;
  }

  /**
   * A link to the user's personal website.
   * 
   * @return A link to the user's personal website.
   */
  public String getWebsite() {
    return website;
  }

  /**
   * The proxied or contact email address granted by the user.
   * 
   * @return The proxied or contact email address granted by the user.
   */
  public String getEmail() {
    return email;
  }

  /**
   * The user's profile picture URL.
   * 
   * @return The user's profile picture URL.
   */
  public String getPicture() {
    return picture;
  }

  /**
   * The user's timezone offset.
   * 
   * @return The user's timezone offset.
   */
  public Double getTimezone() {
    return timezone;
  }

  /**
   * Is the user verified?
   * 
   * @return User verification status.
   */
  public Boolean getVerified() {
    return verified;
  }

  /**
   * Date the user's profile was updated.
   * 
   * @return Date the user's profile was updated.
   */
  public Date getUpdatedTime() {
    return StringUtils.toDate(updatedTime);
  }

  /**
   * The user's gender.
   * 
   * @return The user's gender.
   */
  public String getGender() {
    return gender;
  }

  /**
   * The user's political affiliation.
   * 
   * @return The user's political affiliation.
   */
  public String getPolitical() {
    return political;
  }

  /**
   * The user's locale.
   * 
   * @return The user's locale.
   */
  public String getLocale() {
    return locale;
  }

  /**
   * The user's hometown.
   * 
   * @return The user's hometown.
   */
  public NamedFacebookType getHometown() {
    return hometown;
  }

  /**
   * The user's current location.
   * 
   * @return The user's current location.
   */
  public NamedFacebookType getLocation() {
    return location;
  }

  /**
   * The user's interests.
   * 
   * @return The user's interests.
   */
  public List<String> getInterestedIn() {
    return Collections.unmodifiableList(interestedIn);
  }

  /**
   * What genders the user is interested in meeting.
   * 
   * @return What genders the user is interested in meeting.
   */
  public List<String> getMeetingFor() {
    return Collections.unmodifiableList(meetingFor);
  }

  /**
   * A list of the work history from the user's profile
   * 
   * @return A list of the work history from the user's profile
   */
  public List<Work> getWork() {
    return Collections.unmodifiableList(work);
  }

  /**
   * A list of the education history from the user's profile
   * 
   * @return A list of the education history from the user's profile
   */
  public List<Education> getEducation() {
    return Collections.unmodifiableList(education);
  }
  public edu.mit.dig.saveface.model.user.User getRDFThing(){
	  return userRDF;
  }
  public void toRDF(Model model) throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
 
//		String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
//	    String FACEBOOK_BN = "http://foolme.csail.mit.edu/data/saveface/bn/"; //which means that this is has no corresponding facebook id to it
		
		String PORT = System.getProperty("port","2020");
		String SERVER_NAME = System.getProperty("servername", "localhost");
		String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
		String FACEBOOK_BN = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/bn/";	
	    
		Class _userClass = this.getClass();
		String user_id = this.getId();
 
		Method[] methods = _userClass.getDeclaredMethods();
		Method methodGetName = NamedFacebookType.class.getMethod("getName"); 
		List<Method> methodList = new ArrayList();
		for(Method m: methods){
			methodList.add(m);
		}
		methodList.add(methodGetName);
		userRDF = edu.mit.dig.saveface.model.user.Factory.createUser(FACEBOOK_PREFIX+user_id, model);
		//clean the old erro labels
		model.remove(userRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));
		model.remove(userRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral("null, null")); 
		if(this.getName()!=null)
		{
			String label = this.getName();
			model.add(userRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label);
		}
		Class userRDFClass = userRDF.getClass();
		
		for(Method m : methodList){
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
						
						if(!(first instanceof com.restfb.types.User.Work | first instanceof com.restfb.types.User.Education)){
							for (int i = 0; i < list.size(); i++){
								RDFUtils.readItem(model,list.get(i),userRDF,fieldName);
							}
						}
						else{
							//e.g. getEducation() returns a List<Education> 
							//get the id for the Item(BlandNode?), and create a property to link
							
							rdfMethod = userRDFClass.getMethod("add"+fieldName, Thing.class);
							for(int i = 0; i< list.size(); i++){

								Object item = list.get(i);
								//e.g. Education or Work
							   	//fix the problem generated by Blank Node, facebok has no id for inner class such as Work and Education (so far the only two cases)
						    	//we assign an id that's the hashcode of the object 
								if(item instanceof com.restfb.types.User.Work){
									String id = Integer.toString (((com.restfb.types.User.Work) item).hashCode());
									Resource blankNode = model.createResource(FACEBOOK_BN + id);
									
									edu.mit.dig.saveface.model.Work.Work work = edu.mit.dig.saveface.model.Work.Factory.createWork(blankNode, model);
 	 
									rdfMethod.invoke(userRDF,  work);
									//now read those items that are within the Education or Work block
									RDFUtils.populateInnerClass(model, item, work);
									

								}else{
									String id = Integer.toString(((com.restfb.types.User.Education) item).hashCode()); 
									Resource blankNode = model.createResource(FACEBOOK_BN + id);
									edu.mit.dig.saveface.model.Education.Education education = edu.mit.dig.saveface.model.Education.Factory.createEducation(blankNode, model);
									
 
									rdfMethod.invoke(userRDF,  education);
									RDFUtils.populateInnerClass(model, item, education);
								}

							}
							
						}
					}
				}
				
				//item that's in the first level
				else{
					RDFUtils.readItem(model,o, userRDF, fieldName);
				}
 
			}//end of o!=null
 
		}//end of (for Method...)
		
	}
}