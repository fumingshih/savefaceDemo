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
 * href="http://developers.facebook.com/docs/reference/api/page">Page Graph API
 * type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Page extends CategorizedFacebookType {
  
  @Facebook("created_time")
  private  String createdTime;
	
  
  @Facebook
  private String website;
  
  @Facebook
  private String description;
  
  @Facebook
  private String category;
  @Facebook
  private String id;
  //*** added by Fuming
  @Facebook
  private String picture;

  @Facebook
  private String link;

  @Facebook 
  private String name;
  
  @Facebook
  private String username;

  @Facebook
  private String founded;

  @Facebook("company_overview")
  private String companyOverview;

  @Facebook
  private String mission;

  @Facebook
  private String products;

  @Facebook 
  private Long likes;
  /**
   * The website of the page
   * @return the page's website
   */
  public String getWebsite(){
	  return website;
  }
  /**
   * The created time of this page
   * @return The page's created time
   */
  public Date getCreatedTime() {
	    return StringUtils.toDate(createdTime);
  }
  
  /** 
   * The category of this page
   * @return The page's category
   */
  public String getCategory(){
	  return category;
	  
  }
  /**
   *  The name of this page
   */
  public String getName(){
	  
	  return name;
  }
  
  
  /**
   * The description of this page
   */
  public String getDescription(){
	  return description;
	  
  }
  /**
   * The id of this page
   * @return The page's id
   */
  public String getId(){
	  return id;
  }
  /**
   * The page's picture.
   * 
   * @return The page's picture.
   */
  public String getPicture() {
    return picture;
  }

  /**
   * The page's link.
   * 
   * @return The page's link.
   */
  public String getLink() {
    return link;
  }

  /**
   * The page's username.
   * 
   * @return The page's username.
   */
  public String getUsername() {
    return username;
  }

  /**
   * When the page was founded.
   * 
   * @return When the page was founded.
   */
  public String getFounded() {
    return founded;
  }

  /**
   * Overview of the page's company.
   * 
   * @return Overview of the page's company.
   */
  public String getCompanyOverview() {
    return companyOverview;
  }

  /**
   * The page's mission.
   * 
   * @return The page's mission.
   */
  public String getMission() {
    return mission;
  }

  /**
   * The page's products.
   * 
   * @return The page's products.
   */
  public String getProducts() {
    return products;
  }

  /**
   * The number of likes (fans) the page has.
   * 
   * @return The number of fans the page has.
   */
  public Long getLikes() {
    return likes;
  }
  
  private edu.mit.dig.saveface.model.Page.Page pageRDF = null;
  
  public edu.mit.dig.saveface.model.Page.Page getRDFThing(){
	  return pageRDF;
	  
  }
  public void toRDF(Model model)throws IllegalArgumentException, 
	IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException{
 
	  //String FACEBOOK_PREFIX = "http://foolme.csail.mit.edu/data/saveface/";
	  
	  String PORT = System.getProperty("port","2020");
	  String SERVER_NAME = System.getProperty("servername", "localhost");
	  String FACEBOOK_PREFIX = "http://"+ SERVER_NAME +":"+ PORT + "/data/saveface/";	
	  
	  Class pageClass = this.getClass();
	  String page_id = this.getId();
	  Method[] methods = pageClass.getDeclaredMethods();
	
	  pageRDF = edu.mit.dig.saveface.model.Page.Factory.createPage(FACEBOOK_PREFIX + page_id, model);
	  //clean up error triples created previously
	  model.remove(pageRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), model.createLiteral(""));

	  if(this.getName()!= null){
		  String label = this.getName();
		  model.add(pageRDF.resource(), model.createProperty("http://www.w3.org/2000/01/rdf-schema#label"), label);

	  }

		for(Method m : methods){
			Object o = null;
			String methodName = m.getName();
			String fieldName = methodName.substring(3);  
			if(!(methodName.equals("toRDF")|methodName.equals("getRDFThing")))
				o  = m.invoke(this, null);  
			if(o!=null){
 
					RDFUtils.readItem(model,o, pageRDF, fieldName);
 
			}//end of o!=null 
 
		}//end of (for Method...)
		
	}
}