

package edu.mit.dig.saveface.model.Comment;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Comment ontology class<br>
 * Use the edu.mit.dig.saveface.model.Comment.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Comment.owl#Comment)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Comment extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Comment.owl#Comment");
	

	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Comment.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Comment.owl#id");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Comment.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Comment.owl#createdTime");


	/**
	 * The Jena Property for from 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Comment.owl#from)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Comment.owl#from");


	/**
	 * The Jena Property for message 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Comment.owl#message)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Comment.owl#message");




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

}