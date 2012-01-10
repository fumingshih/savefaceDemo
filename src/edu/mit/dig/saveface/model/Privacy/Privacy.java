

package edu.mit.dig.saveface.model.Privacy;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Privacy ontology class<br>
 * Use the edu.mit.dig.saveface.model.Privacy.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Privacy.owl#Privacy)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Privacy extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/saveface/Privacy.owl#Privacy");
	

	/**
	 * The Jena Property for networks 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#networks)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property networksProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#networks");


	/**
	 * The Jena Property for friends 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#friends)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property friendsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#friends");


	/**
	 * The Jena Property for value 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property valueProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#value");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#description");




	/**
	 * Iterates through the 'networks' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#networksProperty
	 */
	public java.util.Iterator getNetworks() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'networks' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#networksProperty
	 */
	public void addNetworks(java.lang.String networks) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'networks' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#networksProperty
	 */
	public void removeNetworks(java.lang.String networks) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'friends' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#friendsProperty
	 */
	public java.util.Iterator getFriends() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'friends' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#friendsProperty
	 */
	public void addFriends(java.lang.String friends) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'friends' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#friendsProperty
	 */
	public void removeFriends(java.lang.String friends) throws com.ibm.adtech.jastor.JastorException;

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