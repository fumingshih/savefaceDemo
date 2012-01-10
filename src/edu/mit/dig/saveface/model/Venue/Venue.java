

package edu.mit.dig.saveface.model.Venue;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Venue ontology class<br>
 * Use the edu.mit.dig.saveface.model.Venue.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Venue.owl#Venue)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Venue extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#Venue");
	

	/**
	 * The Jena Property for street 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#street)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property streetProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#street");


	/**
	 * The Jena Property for longitude 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#longitude)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property longitudeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#longitude");


	/**
	 * The Jena Property for state 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#state)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property stateProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#state");


	/**
	 * The Jena Property for country 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#country)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property countryProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#country");


	/**
	 * The Jena Property for city 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#city)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property cityProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#city");


	/**
	 * The Jena Property for latitude 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#latitude)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property latitudeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#latitude");




	/**
	 * Iterates through the 'street' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#streetProperty
	 */
	public java.util.Iterator getStreet() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'street' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#streetProperty
	 */
	public void addStreet(java.lang.String street) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'street' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#streetProperty
	 */
	public void removeStreet(java.lang.String street) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'longitude' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Double}
	 * @see			#longitudeProperty
	 */
	public java.util.Iterator getLongitude() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'longitude' property value
	 * @param		{@link java.lang.Double}, the value to add
	 * @see			#longitudeProperty
	 */
	public void addLongitude(java.lang.Double longitude) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'longitude' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Double}, the value to remove
	 * @see			#longitudeProperty
	 */
	public void removeLongitude(java.lang.Double longitude) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'state' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#stateProperty
	 */
	public java.util.Iterator getState() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'state' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#stateProperty
	 */
	public void addState(java.lang.String state) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'state' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#stateProperty
	 */
	public void removeState(java.lang.String state) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'country' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#countryProperty
	 */
	public java.util.Iterator getCountry() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'country' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#countryProperty
	 */
	public void addCountry(java.lang.String country) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'country' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#countryProperty
	 */
	public void removeCountry(java.lang.String country) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'city' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#cityProperty
	 */
	public java.util.Iterator getCity() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'city' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#cityProperty
	 */
	public void addCity(java.lang.String city) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'city' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#cityProperty
	 */
	public void removeCity(java.lang.String city) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'latitude' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Double}
	 * @see			#latitudeProperty
	 */
	public java.util.Iterator getLatitude() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'latitude' property value
	 * @param		{@link java.lang.Double}, the value to add
	 * @see			#latitudeProperty
	 */
	public void addLatitude(java.lang.Double latitude) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'latitude' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Double}, the value to remove
	 * @see			#latitudeProperty
	 */
	public void removeLatitude(java.lang.Double latitude) throws com.ibm.adtech.jastor.JastorException;

}