

package edu.mit.dig.saveface.model.Post;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Post ontology class<br>
 * Use the edu.mit.dig.saveface.model.Post.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Post.owl#Post)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Post extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Post.owl#Post");
	

	/**
	 * The Jena Property for likes 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#likes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property likesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#likes");


	/**
	 * The Jena Property for from 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#from)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#from");


	/**
	 * The Jena Property for commentsCount 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#commentsCount)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsCountProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#commentsCount");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#createdTime");


	/**
	 * The Jena Property for to 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#to)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property toProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#to");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#name");


	/**
	 * The Jena Property for updatedTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#updatedTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#updatedTime");


	/**
	 * The Jena Property for icon 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#icon)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#icon");


	/**
	 * The Jena Property for type 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#type)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property typeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#type");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#id");


	/**
	 * The Jena Property for message 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#message)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#message");


	/**
	 * The Jena Property for actions 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#actions)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property actionsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#actions");


	/**
	 * The Jena Property for picture 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#picture)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#picture");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#link");


	/**
	 * The Jena Property for caption 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#caption)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property captionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#caption");


	/**
	 * The Jena Property for privacy 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#privacy)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#privacy");


	/**
	 * The Jena Property for comments 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#comments)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#comments");


	/**
	 * The Jena Property for source 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#source)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property sourceProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#source");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#description");


	/**
	 * The Jena Property for attribution 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#attribution)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property attributionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#attribution");




	/**
	 * Iterates through the 'likes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Long}
	 * @see			#likesProperty
	 */
	public java.util.Iterator getLikes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'likes' property value
	 * @param		{@link java.lang.Long}, the value to add
	 * @see			#likesProperty
	 */
	public void addLikes(java.lang.Long likes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'likes' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Long}, the value to remove
	 * @see			#likesProperty
	 */
	public void removeLikes(java.lang.Long likes) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'commentsCount' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Long}
	 * @see			#commentsCountProperty
	 */
	public java.util.Iterator getCommentsCount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'commentsCount' property value
	 * @param		{@link java.lang.Long}, the value to add
	 * @see			#commentsCountProperty
	 */
	public void addCommentsCount(java.lang.Long commentsCount) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'commentsCount' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Long}, the value to remove
	 * @see			#commentsCountProperty
	 */
	public void removeCommentsCount(java.lang.Long commentsCount) throws com.ibm.adtech.jastor.JastorException;

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
	 * Get an Iterator the 'to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#toProperty
	 */
	public java.util.Iterator getTo() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#toProperty
	 */
	public void addTo(com.ibm.adtech.jastor.Thing to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#toProperty
	 */
	public com.ibm.adtech.jastor.Thing addTo() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#toProperty
	 */
	public com.ibm.adtech.jastor.Thing addTo(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#toProperty
	 */
	public void removeTo(com.ibm.adtech.jastor.Thing to) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Iterates through the 'type' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#typeProperty
	 */
	public java.util.Iterator getType() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'type' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#typeProperty
	 */
	public void addType(java.lang.String type) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'type' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#typeProperty
	 */
	public void removeType(java.lang.String type) throws com.ibm.adtech.jastor.JastorException;

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
	 * Get an Iterator the 'actions' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#actionsProperty
	 */
	public java.util.Iterator getActions() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'actions' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#actionsProperty
	 */
	public void addActions(com.ibm.adtech.jastor.Thing actions) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'actions' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#actionsProperty
	 */
	public com.ibm.adtech.jastor.Thing addActions() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#actionsProperty
	 */
	public com.ibm.adtech.jastor.Thing addActions(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'actions' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#actionsProperty
	 */
	public void removeActions(com.ibm.adtech.jastor.Thing actions) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Iterates through the 'caption' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#captionProperty
	 */
	public java.util.Iterator getCaption() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'caption' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#captionProperty
	 */
	public void addCaption(java.lang.String caption) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'caption' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#captionProperty
	 */
	public void removeCaption(java.lang.String caption) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'privacy' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#privacyProperty
	 */
	public java.util.Iterator getPrivacy() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'privacy' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#privacyProperty
	 */
	public void addPrivacy(com.ibm.adtech.jastor.Thing privacy) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'privacy' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#privacyProperty
	 */
	public com.ibm.adtech.jastor.Thing addPrivacy() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#privacyProperty
	 */
	public com.ibm.adtech.jastor.Thing addPrivacy(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'privacy' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#privacyProperty
	 */
	public void removePrivacy(com.ibm.adtech.jastor.Thing privacy) throws com.ibm.adtech.jastor.JastorException;
		
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

	/**
	 * Iterates through the 'attribution' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#attributionProperty
	 */
	public java.util.Iterator getAttribution() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'attribution' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#attributionProperty
	 */
	public void addAttribution(java.lang.String attribution) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'attribution' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#attributionProperty
	 */
	public void removeAttribution(java.lang.String attribution) throws com.ibm.adtech.jastor.JastorException;

}