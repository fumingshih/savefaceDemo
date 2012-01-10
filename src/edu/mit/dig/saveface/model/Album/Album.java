

package edu.mit.dig.saveface.model.Album;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Album ontology class<br>
 * Use the edu.mit.dig.saveface.model.Album.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#Album)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Album extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Album.owl#Album");
	

	/**
	 * The Jena Property for location 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#location)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#location");


	/**
	 * The Jena Property for comments 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#comments)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#comments");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#id");


	/**
	 * The Jena Property for from 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#from)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#from");


	/**
	 * The Jena Property for updatedTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#updatedTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#updatedTime");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#link");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#createdTime");


	/**
	 * The Jena Property for photos 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#photos)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property photosProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#photos");


	/**
	 * The Jena Property for privacy 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#privacy)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#privacy");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#description");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#name");


	/**
	 * The Jena Property for count 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#count)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property countProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#count");




	/**
	 * Iterates through the 'location' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#locationProperty
	 */
	public java.util.Iterator getLocation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'location' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#locationProperty
	 */
	public void addLocation(java.lang.String location) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'location' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#locationProperty
	 */
	public void removeLocation(java.lang.String location) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'comments' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#commentsProperty
	 */
	public java.util.Iterator getComments() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'comments' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#commentsProperty
	 */
	public void addComments(com.ibm.adtech.jastor.Thing comments) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'comments' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#commentsProperty
	 */
	public com.ibm.adtech.jastor.Thing addComments() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#commentsProperty
	 */
	public com.ibm.adtech.jastor.Thing addComments(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'comments' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#commentsProperty
	 */
	public void removeComments(com.ibm.adtech.jastor.Thing comments) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Get an Iterator the 'from' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#fromProperty
	 */
	public java.util.Iterator getFrom() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'from' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#fromProperty
	 */
	public void addFrom(com.ibm.adtech.jastor.Thing from) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'from' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#fromProperty
	 */
	public com.ibm.adtech.jastor.Thing addFrom() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#fromProperty
	 */
	public com.ibm.adtech.jastor.Thing addFrom(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'from' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#fromProperty
	 */
	public void removeFrom(com.ibm.adtech.jastor.Thing from) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'updatedTime' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#updatedTimeProperty
	 */
	public java.util.Iterator getUpdatedTime() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'updatedTime' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#updatedTimeProperty
	 */
	public void addUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'updatedTime' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#updatedTimeProperty
	 */
	public void removeUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'privacy' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#privacyProperty
	 */
	public java.util.Iterator getPrivacy() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'privacy' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#privacyProperty
	 */
	public void addPrivacy(java.lang.String privacy) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'privacy' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#privacyProperty
	 */
	public void removePrivacy(java.lang.String privacy) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'count' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Long}
	 * @see			#countProperty
	 */
	public java.util.Iterator getCount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'count' property value
	 * @param		{@link java.lang.Long}, the value to add
	 * @see			#countProperty
	 */
	public void addCount(java.lang.Long count) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'count' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Long}, the value to remove
	 * @see			#countProperty
	 */
	public void removeCount(java.lang.Long count) throws com.ibm.adtech.jastor.JastorException;

}