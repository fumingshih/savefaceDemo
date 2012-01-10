

package edu.mit.dig.saveflickr.model.Comment;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Comment ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.Comment.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#Comment)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Comment extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#Comment");
	

	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#id");


	/**
	 * The Jena Property for authorname 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#authorname)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property authornameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#authorname");


	/**
	 * The Jena Property for datecreate 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#datecreate)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property datecreateProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#datecreate");


	/**
	 * The Jena Property for author 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#author)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property authorProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#author");


	/**
	 * The Jena Property for text 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#text)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property textProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#text");


	/**
	 * The Jena Property for permalink 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#permalink)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property permalinkProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#permalink");




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
	 * Iterates through the 'authorname' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#authornameProperty
	 */
	public java.util.Iterator getAuthorname() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'authorname' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#authornameProperty
	 */
	public void addAuthorname(java.lang.String authorname) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'authorname' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#authornameProperty
	 */
	public void removeAuthorname(java.lang.String authorname) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'datecreate' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#datecreateProperty
	 */
	public java.util.Iterator getDatecreate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'datecreate' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#datecreateProperty
	 */
	public void addDatecreate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime datecreate) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'datecreate' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#datecreateProperty
	 */
	public void removeDatecreate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime datecreate) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'author' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#authorProperty
	 */
	public java.util.Iterator getAuthor() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'author' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#authorProperty
	 */
	public void addAuthor(com.ibm.adtech.jastor.Thing author) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'author' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#authorProperty
	 */
	public com.ibm.adtech.jastor.Thing addAuthor() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#authorProperty
	 */
	public com.ibm.adtech.jastor.Thing addAuthor(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'author' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#authorProperty
	 */
	public void removeAuthor(com.ibm.adtech.jastor.Thing author) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'text' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#textProperty
	 */
	public java.util.Iterator getText() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'text' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#textProperty
	 */
	public void addText(java.lang.String text) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'text' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#textProperty
	 */
	public void removeText(java.lang.String text) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'permalink' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#permalinkProperty
	 */
	public java.util.Iterator getPermalink() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'permalink' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#permalinkProperty
	 */
	public void addPermalink(java.lang.String permalink) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'permalink' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#permalinkProperty
	 */
	public void removePermalink(java.lang.String permalink) throws com.ibm.adtech.jastor.JastorException;

}