

package edu.mit.dig.saveface.model.Work;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Work ontology class<br>
 * Use the edu.mit.dig.saveface.model.Work.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#Work)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Work extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Work.owl#Work");
	

	/**
	 * The Jena Property for position 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#position)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property positionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#position");


	/**
	 * The Jena Property for employer 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#employer)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property employerProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#employer");


	/**
	 * The Jena Property for location 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#location)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#location");


	/**
	 * The Jena Property for startDate 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#startDate)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property startDateProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#startDate");


	/**
	 * The Jena Property for endDate 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#endDate)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property endDateProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#endDate");




	/**
	 * Get an Iterator the 'position' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#positionProperty
	 */
	public java.util.Iterator getPosition() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'position' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#positionProperty
	 */
	public void addPosition(com.ibm.adtech.jastor.Thing position) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'position' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#positionProperty
	 */
	public com.ibm.adtech.jastor.Thing addPosition() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#positionProperty
	 */
	public com.ibm.adtech.jastor.Thing addPosition(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'position' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#positionProperty
	 */
	public void removePosition(com.ibm.adtech.jastor.Thing position) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'employer' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#employerProperty
	 */
	public java.util.Iterator getEmployer() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'employer' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#employerProperty
	 */
	public void addEmployer(com.ibm.adtech.jastor.Thing employer) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'employer' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#employerProperty
	 */
	public com.ibm.adtech.jastor.Thing addEmployer() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#employerProperty
	 */
	public com.ibm.adtech.jastor.Thing addEmployer(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'employer' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#employerProperty
	 */
	public void removeEmployer(com.ibm.adtech.jastor.Thing employer) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'location' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#locationProperty
	 */
	public java.util.Iterator getLocation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'location' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#locationProperty
	 */
	public void addLocation(com.ibm.adtech.jastor.Thing location) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'location' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#locationProperty
	 */
	public com.ibm.adtech.jastor.Thing addLocation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#locationProperty
	 */
	public com.ibm.adtech.jastor.Thing addLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'location' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#locationProperty
	 */
	public void removeLocation(com.ibm.adtech.jastor.Thing location) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'startDate' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#startDateProperty
	 */
	public java.util.Iterator getStartDate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'startDate' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#startDateProperty
	 */
	public void addStartDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDate) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'startDate' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#startDateProperty
	 */
	public void removeStartDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDate) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'endDate' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#endDateProperty
	 */
	public java.util.Iterator getEndDate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'endDate' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#endDateProperty
	 */
	public void addEndDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDate) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'endDate' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#endDateProperty
	 */
	public void removeEndDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDate) throws com.ibm.adtech.jastor.JastorException;

}