

package edu.mit.dig.saveflickr.model.Photo;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Photo ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.Photo.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#Photo)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Photo extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#Photo");
	

	/**
	 * The Jena Property for lastUpdated 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#lastUpdated)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property lastUpdatedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#lastUpdated");


	/**
	 * The Jena Property for commentsCount 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#commentsCount)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsCountProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#commentsCount");


	/**
	 * The Jena Property for farm 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#farm)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property farmProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#farm");


	/**
	 * The Jena Property for tags 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#tags)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property tagsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#tags");


	/**
	 * The Jena Property for dateTaken 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateTaken)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property dateTakenProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateTaken");


	/**
	 * The Jena Property for addComment 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addComment)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property addCommentProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addComment");


	/**
	 * The Jena Property for originalformat 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalformat)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property originalformatProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalformat");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#description");


	/**
	 * The Jena Property for permissions 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#permissions)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property permissionsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#permissions");


	/**
	 * The Jena Property for notes 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#notes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property notesProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#notes");


	/**
	 * The Jena Property for geoData 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#geoData)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property geoDataProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#geoData");


	/**
	 * The Jena Property for server 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#server)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property serverProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#server");


	/**
	 * The Jena Property for datePosted 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#datePosted)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property datePostedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#datePosted");


	/**
	 * The Jena Property for license 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#license)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property licenseProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#license");


	/**
	 * The Jena Property for secret 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#secret)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property secretProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#secret");


	/**
	 * The Jena Property for addMeta 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addMeta)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property addMetaProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addMeta");


	/**
	 * The Jena Property for url 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#url)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property urlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#url");


	/**
	 * The Jena Property for owner 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#owner)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#owner");


	/**
	 * The Jena Property for dateAdded 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateAdded)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property dateAddedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateAdded");


	/**
	 * The Jena Property for title 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#title)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#title");


	/**
	 * The Jena Property for originalsecret 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalsecret)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property originalsecretProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalsecret");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#id");


	/**
	 * The Jena Property for comments 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#comments)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#comments");




	/**
	 * Iterates through the 'lastUpdated' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#lastUpdatedProperty
	 */
	public java.util.Iterator getLastUpdated() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'lastUpdated' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#lastUpdatedProperty
	 */
	public void addLastUpdated(com.hp.hpl.jena.datatypes.xsd.XSDDateTime lastUpdated) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'lastUpdated' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#lastUpdatedProperty
	 */
	public void removeLastUpdated(com.hp.hpl.jena.datatypes.xsd.XSDDateTime lastUpdated) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'commentsCount' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#commentsCountProperty
	 */
	public java.util.Iterator getCommentsCount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'commentsCount' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#commentsCountProperty
	 */
	public void addCommentsCount(java.lang.Integer commentsCount) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'commentsCount' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#commentsCountProperty
	 */
	public void removeCommentsCount(java.lang.Integer commentsCount) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'farm' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#farmProperty
	 */
	public java.util.Iterator getFarm() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'farm' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#farmProperty
	 */
	public void addFarm(java.lang.String farm) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'farm' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#farmProperty
	 */
	public void removeFarm(java.lang.String farm) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'tags' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#tagsProperty
	 */
	public java.util.Iterator getTags() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'tags' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#tagsProperty
	 */
	public void addTags(com.ibm.adtech.jastor.Thing tags) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'tags' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#tagsProperty
	 */
	public com.ibm.adtech.jastor.Thing addTags() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#tagsProperty
	 */
	public com.ibm.adtech.jastor.Thing addTags(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'tags' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#tagsProperty
	 */
	public void removeTags(com.ibm.adtech.jastor.Thing tags) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'dateTaken' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#dateTakenProperty
	 */
	public java.util.Iterator getDateTaken() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dateTaken' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dateTakenProperty
	 */
	public void addDateTaken(java.lang.String dateTaken) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dateTaken' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dateTakenProperty
	 */
	public void removeDateTaken(java.lang.String dateTaken) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'addComment' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Boolean}
	 * @see			#addCommentProperty
	 */
	public java.util.Iterator getAddComment() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'addComment' property value
	 * @param		{@link java.lang.Boolean}, the value to add
	 * @see			#addCommentProperty
	 */
	public void addAddComment(java.lang.Boolean addComment) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'addComment' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Boolean}, the value to remove
	 * @see			#addCommentProperty
	 */
	public void removeAddComment(java.lang.Boolean addComment) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'originalformat' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#originalformatProperty
	 */
	public java.util.Iterator getOriginalformat() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'originalformat' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#originalformatProperty
	 */
	public void addOriginalformat(java.lang.String originalformat) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'originalformat' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#originalformatProperty
	 */
	public void removeOriginalformat(java.lang.String originalformat) throws com.ibm.adtech.jastor.JastorException;

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
	 * Get an Iterator the 'permissions' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#permissionsProperty
	 */
	public java.util.Iterator getPermissions() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'permissions' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#permissionsProperty
	 */
	public void addPermissions(com.ibm.adtech.jastor.Thing permissions) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'permissions' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#permissionsProperty
	 */
	public com.ibm.adtech.jastor.Thing addPermissions() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#permissionsProperty
	 */
	public com.ibm.adtech.jastor.Thing addPermissions(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'permissions' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#permissionsProperty
	 */
	public void removePermissions(com.ibm.adtech.jastor.Thing permissions) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'notes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#notesProperty
	 */
	public java.util.Iterator getNotes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'notes' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#notesProperty
	 */
	public void addNotes(com.ibm.adtech.jastor.Thing notes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'notes' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#notesProperty
	 */
	public com.ibm.adtech.jastor.Thing addNotes() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#notesProperty
	 */
	public com.ibm.adtech.jastor.Thing addNotes(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'notes' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#notesProperty
	 */
	public void removeNotes(com.ibm.adtech.jastor.Thing notes) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'geoData' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#geoDataProperty
	 */
	public java.util.Iterator getGeoData() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'geoData' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#geoDataProperty
	 */
	public void addGeoData(com.ibm.adtech.jastor.Thing geoData) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'geoData' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#geoDataProperty
	 */
	public com.ibm.adtech.jastor.Thing addGeoData() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#geoDataProperty
	 */
	public com.ibm.adtech.jastor.Thing addGeoData(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'geoData' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#geoDataProperty
	 */
	public void removeGeoData(com.ibm.adtech.jastor.Thing geoData) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'server' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#serverProperty
	 */
	public java.util.Iterator getServer() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'server' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#serverProperty
	 */
	public void addServer(java.lang.String server) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'server' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#serverProperty
	 */
	public void removeServer(java.lang.String server) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'datePosted' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#datePostedProperty
	 */
	public java.util.Iterator getDatePosted() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'datePosted' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#datePostedProperty
	 */
	public void addDatePosted(java.lang.String datePosted) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'datePosted' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#datePostedProperty
	 */
	public void removeDatePosted(java.lang.String datePosted) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'license' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#licenseProperty
	 */
	public java.util.Iterator getLicense() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'license' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#licenseProperty
	 */
	public void addLicense(com.ibm.adtech.jastor.Thing license) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'license' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#licenseProperty
	 */
	public com.ibm.adtech.jastor.Thing addLicense() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#licenseProperty
	 */
	public com.ibm.adtech.jastor.Thing addLicense(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'license' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#licenseProperty
	 */
	public void removeLicense(com.ibm.adtech.jastor.Thing license) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'secret' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#secretProperty
	 */
	public java.util.Iterator getSecret() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'secret' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#secretProperty
	 */
	public void addSecret(java.lang.String secret) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'secret' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#secretProperty
	 */
	public void removeSecret(java.lang.String secret) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'addMeta' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Boolean}
	 * @see			#addMetaProperty
	 */
	public java.util.Iterator getAddMeta() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'addMeta' property value
	 * @param		{@link java.lang.Boolean}, the value to add
	 * @see			#addMetaProperty
	 */
	public void addAddMeta(java.lang.Boolean addMeta) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'addMeta' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Boolean}, the value to remove
	 * @see			#addMetaProperty
	 */
	public void removeAddMeta(java.lang.Boolean addMeta) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'dateAdded' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#dateAddedProperty
	 */
	public java.util.Iterator getDateAdded() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dateAdded' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dateAddedProperty
	 */
	public void addDateAdded(java.lang.String dateAdded) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dateAdded' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dateAddedProperty
	 */
	public void removeDateAdded(java.lang.String dateAdded) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'originalsecret' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#originalsecretProperty
	 */
	public java.util.Iterator getOriginalsecret() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'originalsecret' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#originalsecretProperty
	 */
	public void addOriginalsecret(java.lang.String originalsecret) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'originalsecret' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#originalsecretProperty
	 */
	public void removeOriginalsecret(java.lang.String originalsecret) throws com.ibm.adtech.jastor.JastorException;

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
		
}