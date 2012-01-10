

package edu.mit.dig.saveface.model.Tag;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Tag ontology class<br>
 * Use the edu.mit.dig.saveface.model.Tag.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Tag.owl#Tag)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Tag extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#Tag");
	

	/**
	 * The Jena Property for name 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Tag.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#name");


	/**
	 * The Jena Property for y 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Tag.owl#y)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property yProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#y");


	/**
	 * The Jena Property for x 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Tag.owl#x)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property xProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#x");


	/**
	 * The Jena Property for createdTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Tag.owl#createdTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#createdTime");




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
	 * Iterates through the 'y' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#yProperty
	 */
	public java.util.Iterator getY() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'y' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#yProperty
	 */
	public void addY(java.lang.Integer y) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'y' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#yProperty
	 */
	public void removeY(java.lang.Integer y) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'x' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#xProperty
	 */
	public java.util.Iterator getX() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'x' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#xProperty
	 */
	public void addX(java.lang.Integer x) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'x' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#xProperty
	 */
	public void removeX(java.lang.Integer x) throws com.ibm.adtech.jastor.JastorException;

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

}