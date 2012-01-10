

package edu.mit.dig.saveface.model.geo;

import com.ibm.adtech.jastor.*;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;

/**
 * Factory for instantiating objects for ontology classes in the  ontology.  The
 * get methods leave the model unchanged and return a Java view of the object in the model.  The create methods
 * may add certain baseline properties to the model such as rdf:type and any properties with hasValue restrictions.
 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : geo <br>
 * 	comment : 
Recent changes to this namespace:
$Log: wgs84_pos.rdf,v $
Revision 1.22  2009/04/20 15:00:30  timbl
Remove the time bits which have been deal with elsewhere eg in iCal.

Revision 1.21  2009/04/20 12:52:47  timbl
try again

Revision 1.20  2009/04/20 12:42:11  timbl
Add Event (edited ages ago and never checked in), and location (following discussion http://chatlogs.planetrdf.com/swig/2009-04-20#T12-36-09)

Revision 1.19  2009/04/20 12:36:31  timbl
Add Event (edited ages ago and never checked in), and location (following discussion http://chatlogs.planetrdf.com/swig/2009-04-20#T12-36-09)

Revision 1.18  2006/02/01 22:01:04  danbri
Clarified that lat and long are decimal degrees, and that alt is decimal metres about local reference ellipsoid

Revision 1.17  2004/02/06 17:38:12  danbri
Fixed a bad commit screwup

Revision 1.15  2003/04/19 11:24:08  danbri
Fixed the typo even more.

Revision 1.14  2003/04/19 11:16:56  danbri
fixed a typo

Revision 1.13  2003/02/19 22:27:27  connolly
relaxed domain constraints on lat/long/alt from Point to SpatialThing

Revision 1.12  2003/01/12 01:41:41  danbri
Trying local copy of XSLT doc.

Revision 1.11  2003/01/12 01:20:18  danbri
added a link to morten's xslt rdfs viewer.

Revision 1.10  2003/01/11 18:56:49  danbri
Removed datatype range from lat and long properties, since they would
have required each occurance of the property to mention the datatype.

Revision 1.9  2003/01/11 11:41:31  danbri
Another typo; repaired rdfs:Property to rdf:Property x4

Revision 1.8  2003/01/11 11:05:02  danbri
Added an rdfs:range for each lat/long/alt property,
http://www.w3.org/2001/XMLSchema#float

Revision 1.7  2003/01/10 20:25:16  danbri
Longer rdfs:comment for Point, trying to be Earth-centric and neutral about
coordinate system(s) at the same time. Feedback welcomed.

Revision 1.6  2003/01/10 20:18:30  danbri
Added CVS log comments into the RDF/XML as an rdfs:comment property of the
vocabulary. Note that this is not common practice (but seems both harmless
and potentially useful).


revision 1.5
date: 2003/01/10 20:14:31;  author: danbri;  state: Exp;  lines: +16 -5
Updated schema:
Added a dc:date, added url for more info. Changed the rdfs:label of the
namespace from gp to geo. Added a class Point, set as the rdfs:domain of
each property. Added XML comment on the lat_long property suggesting that
we might not need it (based on #rdfig commentary from implementors).

revision 1.4
date: 2003/01/10 20:01:07;  author: danbri;  state: Exp;  lines: +6 -5
Fixed typo; several rdfs:about attributes are now rdf:about. Thanks to MortenF in
#rdfig for catching this error.

revision 1.3
date: 2003/01/10 11:59:03;  author: danbri;  state: Exp;  lines: +4 -3
fixed buglet in vocab, added more wgs links

revision 1.2
date: 2003/01/10 11:01:11;  author: danbri;  state: Exp;  lines: +4 -4
Removed alt from the as-a-flat-string property, and switched from
space separated to comma separated.

revision 1.1
date: 2003/01/10 10:53:23;  author: danbri;  state: Exp;
basic geo vocab

 <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	title : WGS84 Geo Positioning: an RDF vocabulary <br>
 * 	description : A vocabulary for representing latitude, longitude and 
 altitude information in the WGS84 geodetic reference datum. 
 Version $Id: wgs84_pos.rdf,v 1.22 2009/04/20 15:00:30 timbl Exp $. See http://www.w3.org/2003/01/geo/ for more details. <br>
 * 	date : $Date: 2009/04/20 15:00:30 $ <br>
 * <br>
 */
public class Factory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of Point.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Point
	 * @param model the Jena Model.
	 */
	public static Point createPoint(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.geo.PointImpl.createPoint(resource,model);
	}
	
	/**
	 * Create a new instance of Point.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Point
	 * @param model the Jena Model.
	 */
	public static Point createPoint(String uri, Model model) throws JastorException {
		Point obj = edu.mit.dig.saveface.model.geo.PointImpl.createPoint(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Point.  Leaves the model unchanged.
	 * @param uri The uri of the Point
	 * @param model the Jena Model.
	 */
	public static Point getPoint(String uri, Model model) throws JastorException {
		return getPoint(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Point.  Leaves the model unchanged.
	 * @param resource The resource of the Point
	 * @param model the Jena Model.
	 */
	public static Point getPoint(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.geo.Point.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.geo.PointImpl obj = (edu.mit.dig.saveface.model.geo.PointImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.geo.PointImpl.getPoint(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Point for every resource in the model with rdf:Type http://www.w3.org/2003/01/geo/wgs84_pos#Point
	 * @param model the Jena Model
	 * @return a List of Point
	 */
	public static java.util.List getAllPoint(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Point.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPoint(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SpatialThing.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing createSpatialThing(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.geo.SpatialThingImpl.createSpatialThing(resource,model);
	}
	
	/**
	 * Create a new instance of SpatialThing.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing createSpatialThing(String uri, Model model) throws JastorException {
		SpatialThing obj = edu.mit.dig.saveface.model.geo.SpatialThingImpl.createSpatialThing(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SpatialThing.  Leaves the model unchanged.
	 * @param uri The uri of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing getSpatialThing(String uri, Model model) throws JastorException {
		return getSpatialThing(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SpatialThing.  Leaves the model unchanged.
	 * @param resource The resource of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing getSpatialThing(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.geo.SpatialThing.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.geo.SpatialThingImpl obj = (edu.mit.dig.saveface.model.geo.SpatialThingImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.geo.SpatialThingImpl.getSpatialThing(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SpatialThing for every resource in the model with rdf:Type http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing
	 * @param model the Jena Model
	 * @return a List of SpatialThing
	 */
	public static java.util.List getAllSpatialThing(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SpatialThing.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSpatialThing(stmt.getSubject(),model));
		}
		return list;
	}
	
	
	/**
	 * Returns an instance of an interface for the given Resource.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(com.hp.hpl.jena.rdf.model.Resource res, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2003/01/geo/wgs84_pos#Point"))) {
			return getPoint(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing"))) {
			return getSpatialThing(res,model);
		}
		return new ThingImpl(res,model);
	}
	
	/**
	 * Returns an instance of an interface for the given Resource URI.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(String uri, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		return getThing(model.getResource(uri),model);
	}

	/**
	 * Return a list of compatible interfaces for the given type.  Searches through all ontology classes
	 * in the  ontology.  The list is sorted according to the topological sort
	 * of the class hierarchy
	 * @return a List of type java.lang.Class
	 */
	public static java.util.List listCompatibleInterfaces (com.hp.hpl.jena.rdf.model.Resource type) {
		java.util.List types = new java.util.ArrayList();
		if (type.equals(edu.mit.dig.saveface.model.geo.Point.TYPE)) {
			types.add(edu.mit.dig.saveface.model.geo.Point.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.geo.SpatialThing.TYPE)) {
			types.add(edu.mit.dig.saveface.model.geo.SpatialThing.class);
		}
		return types;
	}
}