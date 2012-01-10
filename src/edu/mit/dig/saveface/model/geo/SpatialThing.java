

package edu.mit.dig.saveface.model.geo;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for SpatialThing ontology class<br>
 * Use the edu.mit.dig.saveface.model.geo.Factory to create instances of this interface.
 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : SpatialThing <br>
 * 	comment : Anything with spatial extent, i.e. size, shape, or position.
 e.g. people, places, bowling balls, as well as abstract areas like cubes.
 <br>
 * <br>
 * <br>
 */
public interface SpatialThing extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing");
	

	/**
	 * The Jena Property for lat 
	 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#lat)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : latitude <br>
	 * 	comment : The WGS84 latitude of a SpatialThing (decimal degrees). <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property latProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#lat");


	/**
	 * The Jena Property for location 
	 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#location)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : location <br>
	 * 	comment : The relation between something and the point, 
 or other geometrical thing in space, where it is.  For example, the realtionship between
 a radio tower and a Point with a given lat and long.
 Or a relationship between a park and its outline as a closed arc of points, or a road and
 its location as a arc (a sequence of points).
 Clearly in practice there will be limit to the accuracy of any such statement, but one would expect
 an accuracy appropriate for the size of the object and uses such as mapping .
  <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#location");


	/**
	 * The Jena Property for alt 
	 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#alt)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : altitude <br>
	 * 	comment : The WGS84 altitude of a SpatialThing (decimal meters 
above the local reference ellipsoid). <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property altProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#alt");


	/**
	 * The Jena Property for _long 
	 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#long)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : longitude <br>
	 * 	comment : The WGS84 longitude of a SpatialThing (decimal degrees). <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property _longProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#long");


	/**
	 * The Jena Property for lat__long 
	 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#lat_long)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : lat/long <br>
	 * 	comment : A comma-separated representation of a latitude, longitude coordinate. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property lat__longProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#lat_long");




	/**
	 * Iterates through the 'lat' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#latProperty
	 */
	public java.util.Iterator getLat() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'lat' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#latProperty
	 */
	public void addLat(com.hp.hpl.jena.rdf.model.Literal lat) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'lat' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#latProperty
	 */
	public void removeLat(com.hp.hpl.jena.rdf.model.Literal lat) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'location' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.geo.SpatialThing}
	 * @see			#locationProperty
	 */
	public java.util.Iterator getLocation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'location' property
	 * @param		The {@link edu.mit.dig.saveface.model.geo.SpatialThing} to add
	 * @see			#locationProperty
	 */
	public void addLocation(edu.mit.dig.saveface.model.geo.SpatialThing location) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'location' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.geo.SpatialThing} created
	 * @see			#locationProperty
	 */
	public edu.mit.dig.saveface.model.geo.SpatialThing addLocation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#locationProperty
	 */
	public edu.mit.dig.saveface.model.geo.SpatialThing addLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'location' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.geo.SpatialThing} to remove
	 * @see			#locationProperty
	 */
	public void removeLocation(edu.mit.dig.saveface.model.geo.SpatialThing location) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'alt' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#altProperty
	 */
	public java.util.Iterator getAlt() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'alt' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#altProperty
	 */
	public void addAlt(com.hp.hpl.jena.rdf.model.Literal alt) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'alt' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#altProperty
	 */
	public void removeAlt(com.hp.hpl.jena.rdf.model.Literal alt) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the '_long' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#_longProperty
	 */
	public java.util.Iterator get_long() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a '_long' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#_longProperty
	 */
	public void add_long(com.hp.hpl.jena.rdf.model.Literal _long) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a '_long' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#_longProperty
	 */
	public void remove_long(com.hp.hpl.jena.rdf.model.Literal _long) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'lat__long' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#lat__longProperty
	 */
	public java.util.Iterator getLat__long() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'lat__long' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#lat__longProperty
	 */
	public void addLat__long(com.hp.hpl.jena.rdf.model.Literal lat__long) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'lat__long' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#lat__longProperty
	 */
	public void removeLat__long(com.hp.hpl.jena.rdf.model.Literal lat__long) throws com.ibm.adtech.jastor.JastorException;

}