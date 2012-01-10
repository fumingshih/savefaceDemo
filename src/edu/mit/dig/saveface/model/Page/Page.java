

package edu.mit.dig.saveface.model.Page;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Page ontology class<br>
 * Use the edu.mit.dig.saveface.model.Page.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#Page)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Page extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#Page");
	

	/**
	 * The Jena Property for username 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#username)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property usernameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#username");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#id");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#name");


	/**
	 * The Jena Property for fanCount 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#fanCount)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fanCountProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#fanCount");


	/**
	 * The Jena Property for companyOverview 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#companyOverview)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property companyOverviewProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#companyOverview");


	/**
	 * The Jena Property for website 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#website)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property websiteProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#website");


	/**
	 * The Jena Property for category 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#category)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property categoryProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#category");


	/**
	 * The Jena Property for products 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#products)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property productsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#products");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#createdTime");


	/**
	 * The Jena Property for mission 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#mission)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property missionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#mission");


	/**
	 * The Jena Property for founded 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#founded)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property foundedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#founded");


	/**
	 * The Jena Property for picture 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#picture)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#picture");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#link");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#description");




	/**
	 * Iterates through the 'username' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#usernameProperty
	 */
	public java.util.Iterator getUsername() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'username' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#usernameProperty
	 */
	public void addUsername(java.lang.String username) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'username' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#usernameProperty
	 */
	public void removeUsername(java.lang.String username) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'id' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#idProperty
	 */
	public java.util.Iterator getId() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'id' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#idProperty
	 */
	public void addId(java.lang.String id) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'id' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#idProperty
	 */
	public void removeId(java.lang.String id) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'name' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#nameProperty
	 */
	public java.util.Iterator getName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'name' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#nameProperty
	 */
	public void addName(java.lang.String name) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'name' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#nameProperty
	 */
	public void removeName(java.lang.String name) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'fanCount' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Long}
	 * @see			#fanCountProperty
	 */
	public java.util.Iterator getFanCount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'fanCount' property value
	 * @param		{@link java.lang.Long}, the value to add
	 * @see			#fanCountProperty
	 */
	public void addFanCount(java.lang.Long fanCount) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'fanCount' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Long}, the value to remove
	 * @see			#fanCountProperty
	 */
	public void removeFanCount(java.lang.Long fanCount) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'companyOverview' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#companyOverviewProperty
	 */
	public java.util.Iterator getCompanyOverview() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'companyOverview' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#companyOverviewProperty
	 */
	public void addCompanyOverview(java.lang.String companyOverview) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'companyOverview' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#companyOverviewProperty
	 */
	public void removeCompanyOverview(java.lang.String companyOverview) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'website' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#websiteProperty
	 */
	public java.util.Iterator getWebsite() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'website' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#websiteProperty
	 */
	public void addWebsite(java.lang.String website) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'website' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#websiteProperty
	 */
	public void removeWebsite(java.lang.String website) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'category' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#categoryProperty
	 */
	public java.util.Iterator getCategory() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'category' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#categoryProperty
	 */
	public void addCategory(java.lang.String category) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'category' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#categoryProperty
	 */
	public void removeCategory(java.lang.String category) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'products' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#productsProperty
	 */
	public java.util.Iterator getProducts() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'products' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#productsProperty
	 */
	public void addProducts(java.lang.String products) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'products' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#productsProperty
	 */
	public void removeProducts(java.lang.String products) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'createdTime' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#createdTimeProperty
	 */
	public java.util.Iterator getCreatedTime() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'createdTime' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#createdTimeProperty
	 */
	public void addCreatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime createdTime) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'createdTime' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#createdTimeProperty
	 */
	public void removeCreatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime createdTime) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'mission' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#missionProperty
	 */
	public java.util.Iterator getMission() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'mission' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#missionProperty
	 */
	public void addMission(java.lang.String mission) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'mission' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#missionProperty
	 */
	public void removeMission(java.lang.String mission) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'founded' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#foundedProperty
	 */
	public java.util.Iterator getFounded() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'founded' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#foundedProperty
	 */
	public void addFounded(java.lang.String founded) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'founded' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#foundedProperty
	 */
	public void removeFounded(java.lang.String founded) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'picture' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#pictureProperty
	 */
	public java.util.Iterator getPicture() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'picture' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#pictureProperty
	 */
	public void addPicture(java.lang.String picture) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'picture' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#pictureProperty
	 */
	public void removePicture(java.lang.String picture) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'link' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#linkProperty
	 */
	public java.util.Iterator getLink() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'link' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#linkProperty
	 */
	public void addLink(java.lang.String link) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'link' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#linkProperty
	 */
	public void removeLink(java.lang.String link) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'description' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#descriptionProperty
	 */
	public java.util.Iterator getDescription() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'description' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#descriptionProperty
	 */
	public void addDescription(java.lang.String description) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'description' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#descriptionProperty
	 */
	public void removeDescription(java.lang.String description) throws com.ibm.adtech.jastor.JastorException;

}