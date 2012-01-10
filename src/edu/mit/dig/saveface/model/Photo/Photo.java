

package edu.mit.dig.saveface.model.Photo;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Photo ontology class<br>
 * Use the edu.mit.dig.saveface.model.Photo.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Photo.owl#Photo)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Photo extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#Photo");
	

	/**
	 * The Jena Property for like 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#like)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property likeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#like");


	/**
	 * The Jena Property for updatedTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#updatedTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#updatedTime");


	/**
	 * The Jena Property for tags 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#tags)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property tagsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#tags");


	/**
	 * The Jena Property for picture 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#picture)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#picture");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#id");


	/**
	 * The Jena Property for comments 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#comments)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#comments");


	/**
	 * The Jena Property for height 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#height)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property heightProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#height");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#name");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#createdTime");


	/**
	 * The Jena Property for from 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#from)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#from");


	/**
	 * The Jena Property for width 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#width)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property widthProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#width");


	/**
	 * The Jena Property for icon 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#icon)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#icon");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#link");


	/**
	 * The Jena Property for source 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#source)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property sourceProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#source");




	/**
	 * Get an Iterator the 'like' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#likeProperty
	 */
	public java.util.Iterator getLike() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'like' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#likeProperty
	 */
	public void addLike(com.ibm.adtech.jastor.Thing like) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'like' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#likeProperty
	 */
	public com.ibm.adtech.jastor.Thing addLike() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#likeProperty
	 */
	public com.ibm.adtech.jastor.Thing addLike(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'like' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#likeProperty
	 */
	public void removeLike(com.ibm.adtech.jastor.Thing like) throws com.ibm.adtech.jastor.JastorException;
		
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
		
	/**
	 * Iterates through the 'height' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#heightProperty
	 */
	public java.util.Iterator getHeight() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'height' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#heightProperty
	 */
	public void addHeight(java.lang.Integer height) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'height' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#heightProperty
	 */
	public void removeHeight(java.lang.Integer height) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'width' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#widthProperty
	 */
	public java.util.Iterator getWidth() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'width' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#widthProperty
	 */
	public void addWidth(java.lang.Integer width) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'width' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#widthProperty
	 */
	public void removeWidth(java.lang.Integer width) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'icon' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#iconProperty
	 */
	public java.util.Iterator getIcon() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'icon' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#iconProperty
	 */
	public void addIcon(java.lang.String icon) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'icon' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#iconProperty
	 */
	public void removeIcon(java.lang.String icon) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'source' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#sourceProperty
	 */
	public java.util.Iterator getSource() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'source' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#sourceProperty
	 */
	public void addSource(java.lang.String source) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'source' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#sourceProperty
	 */
	public void removeSource(java.lang.String source) throws com.ibm.adtech.jastor.JastorException;

}