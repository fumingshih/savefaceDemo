

package edu.mit.dig.saveface.model.geo;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for point ontology class<br>
 * Use the edu.mit.dig.saveface.model.geo.Factory to create instances of this interface.
 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#Point)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : point <br>
 * 	comment : A point, typically described using a coordinate system relative to Earth, such as WGS84.
  ,  
Uniquely identified by lat/long/alt. i.e.

spaciallyIntersects(P1, P2) :- lat(P1, LAT), long(P1, LONG), alt(P1, ALT),
  lat(P2, LAT), long(P2, LONG), alt(P2, ALT).

sameThing(P1, P2) :- type(P1, Point), type(P2, Point), spaciallyIntersects(P1, P2).
   <br>
 * <br>
 * <br>
 */
public interface Point extends edu.mit.dig.saveface.model.geo.SpatialThing, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.w3.org/2003/01/geo/wgs84_pos#Point");
	

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




}