

package edu.mit.dig.saveface.model.Video;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Video ontology class<br>
 * Use the edu.mit.dig.saveface.model.Video.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#Video)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Video extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Video.owl#Video");
	

	/**
	 * The Jena Property for tags 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#tags)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property tagsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#tags");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#createdTime");


	/**
	 * The Jena Property for from 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#from)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#from");


	/**
	 * The Jena Property for comments 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#comments)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#comments");


	/**
	 * The Jena Property for updatedTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#updatedTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#updatedTime");


	/**
	 * The Jena Property for embedHtml 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#embedHtml)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property embedHtmlProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#embedHtml");


	/**
	 * The Jena Property for picture 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#picture)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#picture");


	/**
	 * The Jena Property for length 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#length)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property lengthProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#length");


	/**
	 * The Jena Property for message 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#message)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#message");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#id");


	/**
	 * The Jena Property for source 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#source)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property sourceProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#source");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#description");




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
	 * Iterates through the 'embedHtml' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#embedHtmlProperty
	 */
	public java.util.Iterator getEmbedHtml() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'embedHtml' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#embedHtmlProperty
	 */
	public void addEmbedHtml(java.lang.String embedHtml) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'embedHtml' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#embedHtmlProperty
	 */
	public void removeEmbedHtml(java.lang.String embedHtml) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'length' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#lengthProperty
	 */
	public java.util.Iterator getLength() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'length' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#lengthProperty
	 */
	public void addLength(java.lang.Integer length) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'length' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#lengthProperty
	 */
	public void removeLength(java.lang.Integer length) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'message' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#messageProperty
	 */
	public java.util.Iterator getMessage() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'message' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#messageProperty
	 */
	public void addMessage(java.lang.String message) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'message' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#messageProperty
	 */
	public void removeMessage(java.lang.String message) throws com.ibm.adtech.jastor.JastorException;

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