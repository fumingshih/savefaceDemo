

package edu.mit.dig.saveface.model.Education;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Education ontology class<br>
 * Use the edu.mit.dig.saveface.model.Education.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#Education)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Education extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Education.owl#Education");
	

	/**
	 * The Jena Property for type 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#type)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property typeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#type");


	/**
	 * The Jena Property for year 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#year)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property yearProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#year");


	/**
	 * The Jena Property for school 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#school)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property schoolProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#school");


	/**
	 * The Jena Property for degree 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#degree)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property degreeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#degree");


	/**
	 * The Jena Property for concentration 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#concentration)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property concentrationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#concentration");




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
	 * Get an Iterator the 'year' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#yearProperty
	 */
	public java.util.Iterator getYear() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'year' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#yearProperty
	 */
	public void addYear(com.ibm.adtech.jastor.Thing year) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'year' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#yearProperty
	 */
	public com.ibm.adtech.jastor.Thing addYear() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#yearProperty
	 */
	public com.ibm.adtech.jastor.Thing addYear(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'year' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#yearProperty
	 */
	public void removeYear(com.ibm.adtech.jastor.Thing year) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'school' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#schoolProperty
	 */
	public java.util.Iterator getSchool() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'school' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#schoolProperty
	 */
	public void addSchool(com.ibm.adtech.jastor.Thing school) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'school' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#schoolProperty
	 */
	public com.ibm.adtech.jastor.Thing addSchool() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#schoolProperty
	 */
	public com.ibm.adtech.jastor.Thing addSchool(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'school' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#schoolProperty
	 */
	public void removeSchool(com.ibm.adtech.jastor.Thing school) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'degree' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#degreeProperty
	 */
	public java.util.Iterator getDegree() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'degree' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#degreeProperty
	 */
	public void addDegree(com.ibm.adtech.jastor.Thing degree) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'degree' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#degreeProperty
	 */
	public com.ibm.adtech.jastor.Thing addDegree() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#degreeProperty
	 */
	public com.ibm.adtech.jastor.Thing addDegree(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'degree' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#degreeProperty
	 */
	public void removeDegree(com.ibm.adtech.jastor.Thing degree) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'concentration' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#concentrationProperty
	 */
	public java.util.Iterator getConcentration() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'concentration' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#concentrationProperty
	 */
	public void addConcentration(com.ibm.adtech.jastor.Thing concentration) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'concentration' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#concentrationProperty
	 */
	public com.ibm.adtech.jastor.Thing addConcentration() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#concentrationProperty
	 */
	public com.ibm.adtech.jastor.Thing addConcentration(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'concentration' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#concentrationProperty
	 */
	public void removeConcentration(com.ibm.adtech.jastor.Thing concentration) throws com.ibm.adtech.jastor.JastorException;
		
}