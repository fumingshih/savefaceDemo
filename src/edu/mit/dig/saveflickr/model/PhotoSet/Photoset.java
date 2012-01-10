

package edu.mit.dig.saveflickr.model.PhotoSet;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Photoset ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.PhotoSet.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#Photoset)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Photoset extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#Photoset");
	

	/**
	 * The Jena Property for description 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#description");


	/**
	 * The Jena Property for photos 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#photos)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property photosProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#photos");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#id");


	/**
	 * The Jena Property for owner 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#owner)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#owner");


	/**
	 * The Jena Property for title 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#title)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#title");


	/**
	 * The Jena Property for url 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#url)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property urlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#url");




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

	/**
	 * Get an Iterator the 'photos' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#photosProperty
	 */
	public java.util.Iterator getPhotos() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'photos' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#photosProperty
	 */
	public void addPhotos(com.ibm.adtech.jastor.Thing photos) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'photos' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#photosProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhotos() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#photosProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhotos(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'photos' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#photosProperty
	 */
	public void removePhotos(com.ibm.adtech.jastor.Thing photos) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Get an Iterator the 'owner' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#ownerProperty
	 */
	public java.util.Iterator getOwner() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'owner' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#ownerProperty
	 */
	public void addOwner(com.ibm.adtech.jastor.Thing owner) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'owner' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#ownerProperty
	 */
	public com.ibm.adtech.jastor.Thing addOwner() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#ownerProperty
	 */
	public com.ibm.adtech.jastor.Thing addOwner(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'owner' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#ownerProperty
	 */
	public void removeOwner(com.ibm.adtech.jastor.Thing owner) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'title' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#titleProperty
	 */
	public java.util.Iterator getTitle() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'title' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#titleProperty
	 */
	public void addTitle(java.lang.String title) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'title' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#titleProperty
	 */
	public void removeTitle(java.lang.String title) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'url' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#urlProperty
	 */
	public java.util.Iterator getUrl() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'url' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#urlProperty
	 */
	public void addUrl(java.lang.String url) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'url' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#urlProperty
	 */
	public void removeUrl(java.lang.String url) throws com.ibm.adtech.jastor.JastorException;

}