

package edu.mit.dig.saveflickr.model.Note;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Note ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.Note.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Note.owl#Note)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Note extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/Note.owl#Note");
	

	/**
	 * The Jena Property for text 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Note.owl#text)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property textProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Note.owl#text");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Note.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Note.owl#id");




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

}