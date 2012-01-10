

package edu.mit.dig.saveflickr.model.Tag;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Tag ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.Tag.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#Tag)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Tag extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#Tag");
	

	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#id");


	/**
	 * The Jena Property for author 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#author)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property authorProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#author");


	/**
	 * The Jena Property for raw 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#raw)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property rawProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#raw");


	/**
	 * The Jena Property for value 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property valueProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#value");




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
	 * Iterates through the 'raw' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#rawProperty
	 */
	public java.util.Iterator getRaw() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'raw' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#rawProperty
	 */
	public void addRaw(java.lang.String raw) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'raw' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#rawProperty
	 */
	public void removeRaw(java.lang.String raw) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#valueProperty
	 */
	public java.util.Iterator getValue() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'value' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#valueProperty
	 */
	public void addValue(java.lang.String value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#valueProperty
	 */
	public void removeValue(java.lang.String value) throws com.ibm.adtech.jastor.JastorException;

}