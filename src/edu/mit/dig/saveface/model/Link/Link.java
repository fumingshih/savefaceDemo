

package edu.mit.dig.saveface.model.Link;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Link ontology class<br>
 * Use the edu.mit.dig.saveface.model.Link.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#Link)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Link extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Link.owl#Link");
	

	/**
	 * The Jena Property for link 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#link");


	/**
	 * The Jena Property for icon 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#icon)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#icon");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#createdTime");


	/**
	 * The Jena Property for message 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#message)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#message");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#description");


	/**
	 * The Jena Property for from 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#from)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#from");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#name");


	/**
	 * The Jena Property for picture 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#picture)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#picture");


	/**
	 * The Jena Property for comment 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#comment)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#comment");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#id");


	/**
	 * The Jena Property for caption 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#caption)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property captionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#caption");




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
	 * Get an Iterator the 'comment' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#commentProperty
	 */
	public java.util.Iterator getComment() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'comment' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#commentProperty
	 */
	public void addComment(com.ibm.adtech.jastor.Thing comment) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'comment' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#commentProperty
	 */
	public com.ibm.adtech.jastor.Thing addComment() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#commentProperty
	 */
	public com.ibm.adtech.jastor.Thing addComment(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'comment' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#commentProperty
	 */
	public void removeComment(com.ibm.adtech.jastor.Thing comment) throws com.ibm.adtech.jastor.JastorException;
		
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

}