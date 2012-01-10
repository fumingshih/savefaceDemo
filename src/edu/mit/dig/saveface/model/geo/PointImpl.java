

package edu.mit.dig.saveface.model.geo;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
*/
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link edu.mit.dig.saveface.model.geo.Point}
 * Use the edu.mit.dig.saveface.model.geo.Factory to create instances of this class.
 * <p>(URI: http://www.w3.org/2003/01/geo/wgs84_pos#Point)</p>
 * <br>
 */
public class PointImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.geo.Point {
	

	private static com.hp.hpl.jena.rdf.model.Property latProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#lat");
	private java.util.ArrayList lat;
	private static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#location");
	private java.util.ArrayList location;
	private static com.hp.hpl.jena.rdf.model.Property altProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#alt");
	private java.util.ArrayList alt;
	private static com.hp.hpl.jena.rdf.model.Property _longProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#long");
	private java.util.ArrayList _long;
	private static com.hp.hpl.jena.rdf.model.Property lat__longProperty = ResourceFactory.createProperty("http://www.w3.org/2003/01/geo/wgs84_pos#lat_long");
	private java.util.ArrayList lat__long;
 

	PointImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PointImpl getPoint(Resource resource, Model model) throws JastorException {
		return new PointImpl(resource, model);
	}
	    
	static PointImpl createPoint(Resource resource, Model model) throws JastorException { 
		PointImpl impl = new PointImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Point.TYPE)))
			impl._model.add(impl._resource, RDF.type, Point.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, edu.mit.dig.saveface.model.geo.SpatialThing.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, edu.mit.dig.saveface.model.geo.SpatialThing.TYPE));     
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	edu.mit.dig.saveface.model.geo.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,latProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,altProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,_longProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lat__longProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.geo.Point.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.geo.SpatialThing.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		lat = null;
		location = null;
		alt = null;
		_long = null;
		lat__long = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLat() throws JastorException {
		lat = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, latProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2003/01/geo/wgs84_pos#lat properties in Point model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			lat.add(literal);
		}
	}

	public java.util.Iterator getLat() throws JastorException {
		if (lat == null)
			initLat();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(lat,_resource,latProperty,false);
	}

	public void addLat(com.hp.hpl.jena.rdf.model.Literal lat) throws JastorException {
		if (this.lat == null)
			initLat();
		if (this.lat.contains(lat))
			return;
		if (_model.contains(_resource, latProperty, createLiteral(lat)))
			return;
		this.lat.add(lat);
		_model.add(_resource, latProperty, lat);
	}
	
	public void removeLat(com.hp.hpl.jena.rdf.model.Literal lat) throws JastorException {
		if (this.lat == null)
			initLat();
		if (!this.lat.contains(lat))
			return;
		if (!_model.contains(_resource, latProperty, createLiteral(lat)))
			return;
		this.lat.remove(lat);
		_model.removeAll(_resource, latProperty, createLiteral(lat));
	}


	private void initLocation() throws JastorException {
		this.location = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2003/01/geo/wgs84_pos#location properties in Point model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.geo.SpatialThing location = edu.mit.dig.saveface.model.geo.Factory.getSpatialThing(resource,_model);
				this.location.add(location);
			}
		}
	}

	public java.util.Iterator getLocation() throws JastorException {
		if (location == null)
			initLocation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(location,_resource,locationProperty,true);
	}

	public void addLocation(edu.mit.dig.saveface.model.geo.SpatialThing location) throws JastorException {
		if (this.location == null)
			initLocation();
		if (this.location.contains(location)) {
			this.location.remove(location);
			this.location.add(location);
			return;
		}
		this.location.add(location);
		_model.add(_model.createStatement(_resource,locationProperty,location.resource()));
	}
	
	public edu.mit.dig.saveface.model.geo.SpatialThing addLocation() throws JastorException {
		edu.mit.dig.saveface.model.geo.SpatialThing location = edu.mit.dig.saveface.model.geo.Factory.createSpatialThing(_model.createResource(),_model);
		if (this.location == null)
			initLocation();
		this.location.add(location);
		_model.add(_model.createStatement(_resource,locationProperty,location.resource()));
		return location;
	}
	
	public edu.mit.dig.saveface.model.geo.SpatialThing addLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.geo.SpatialThing location = edu.mit.dig.saveface.model.geo.Factory.getSpatialThing(resource,_model);
		if (this.location == null)
			initLocation();
		if (this.location.contains(location))
			return location;
		this.location.add(location);
		_model.add(_model.createStatement(_resource,locationProperty,location.resource()));
		return location;
	}
	
	public void removeLocation(edu.mit.dig.saveface.model.geo.SpatialThing location) throws JastorException {
		if (this.location == null)
			initLocation();
		if (!this.location.contains(location))
			return;
		if (!_model.contains(_resource, locationProperty, location.resource()))
			return;
		this.location.remove(location);
		_model.removeAll(_resource, locationProperty, location.resource());
	}
		 

	private void initAlt() throws JastorException {
		alt = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, altProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2003/01/geo/wgs84_pos#alt properties in Point model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			alt.add(literal);
		}
	}

	public java.util.Iterator getAlt() throws JastorException {
		if (alt == null)
			initAlt();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(alt,_resource,altProperty,false);
	}

	public void addAlt(com.hp.hpl.jena.rdf.model.Literal alt) throws JastorException {
		if (this.alt == null)
			initAlt();
		if (this.alt.contains(alt))
			return;
		if (_model.contains(_resource, altProperty, createLiteral(alt)))
			return;
		this.alt.add(alt);
		_model.add(_resource, altProperty, alt);
	}
	
	public void removeAlt(com.hp.hpl.jena.rdf.model.Literal alt) throws JastorException {
		if (this.alt == null)
			initAlt();
		if (!this.alt.contains(alt))
			return;
		if (!_model.contains(_resource, altProperty, createLiteral(alt)))
			return;
		this.alt.remove(alt);
		_model.removeAll(_resource, altProperty, createLiteral(alt));
	}


	private void init_long() throws JastorException {
		_long = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, _longProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2003/01/geo/wgs84_pos#long properties in Point model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			_long.add(literal);
		}
	}

	public java.util.Iterator get_long() throws JastorException {
		if (_long == null)
			init_long();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(_long,_resource,_longProperty,false);
	}

	public void add_long(com.hp.hpl.jena.rdf.model.Literal _long) throws JastorException {
		if (this._long == null)
			init_long();
		if (this._long.contains(_long))
			return;
		if (_model.contains(_resource, _longProperty, createLiteral(_long)))
			return;
		this._long.add(_long);
		_model.add(_resource, _longProperty, _long);
	}
	
	public void remove_long(com.hp.hpl.jena.rdf.model.Literal _long) throws JastorException {
		if (this._long == null)
			init_long();
		if (!this._long.contains(_long))
			return;
		if (!_model.contains(_resource, _longProperty, createLiteral(_long)))
			return;
		this._long.remove(_long);
		_model.removeAll(_resource, _longProperty, createLiteral(_long));
	}


	private void initLat__long() throws JastorException {
		lat__long = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, lat__longProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2003/01/geo/wgs84_pos#lat_long properties in Point model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			lat__long.add(literal);
		}
	}

	public java.util.Iterator getLat__long() throws JastorException {
		if (lat__long == null)
			initLat__long();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(lat__long,_resource,lat__longProperty,false);
	}

	public void addLat__long(com.hp.hpl.jena.rdf.model.Literal lat__long) throws JastorException {
		if (this.lat__long == null)
			initLat__long();
		if (this.lat__long.contains(lat__long))
			return;
		if (_model.contains(_resource, lat__longProperty, createLiteral(lat__long)))
			return;
		this.lat__long.add(lat__long);
		_model.add(_resource, lat__longProperty, lat__long);
	}
	
	public void removeLat__long(com.hp.hpl.jena.rdf.model.Literal lat__long) throws JastorException {
		if (this.lat__long == null)
			initLat__long();
		if (!this.lat__long.contains(lat__long))
			return;
		if (!_model.contains(_resource, lat__longProperty, createLiteral(lat__long)))
			return;
		this.lat__long.remove(lat__long);
		_model.removeAll(_resource, lat__longProperty, createLiteral(lat__long));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PointListener))
			throw new IllegalArgumentException("ThingListener must be instance of PointListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PointListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PointListener))
			throw new IllegalArgumentException("ThingListener must be instance of PointListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(latProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (lat == null)
					try {
						initLat();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!lat.contains(literal))
					lat.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForLat;
					synchronized (listeners) {
						consumersForLat = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLat.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener.latAdded(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(locationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.geo.SpatialThing _location = null;
					try {
						_location = edu.mit.dig.saveface.model.geo.Factory.getSpatialThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (location == null) {
						try {
							initLocation();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!location.contains(_location))
						location.add(_location);
					if (listeners != null) {
						java.util.ArrayList consumersForLocation;
						synchronized (listeners) {
							consumersForLocation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLocation.iterator();iter.hasNext();){
							PointListener listener=(PointListener)iter.next();
							listener.locationAdded(edu.mit.dig.saveface.model.geo.PointImpl.this,_location);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(altProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (alt == null)
					try {
						initAlt();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!alt.contains(literal))
					alt.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForAlt;
					synchronized (listeners) {
						consumersForAlt = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAlt.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener.altAdded(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(_longProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (_long == null)
					try {
						init_long();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!_long.contains(literal))
					_long.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersFor_long;
					synchronized (listeners) {
						consumersFor_long = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersFor_long.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener._longAdded(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lat__longProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (lat__long == null)
					try {
						initLat__long();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!lat__long.contains(literal))
					lat__long.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForLat__long;
					synchronized (listeners) {
						consumersForLat__long = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLat__long.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener.lat__longAdded(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(latProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (lat != null) {
					if (lat.contains(literal))
						lat.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForLat;
					synchronized (listeners) {
						consumersForLat = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLat.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener.latRemoved(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(locationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.geo.SpatialThing _location = null;
					if (location != null) {
						boolean found = false;
						for (int i=0;i<location.size();i++) {
							edu.mit.dig.saveface.model.geo.SpatialThing __item = (edu.mit.dig.saveface.model.geo.SpatialThing) location.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_location = __item;
								break;
							}
						}
						if (found)
							location.remove(_location);
						else {
							try {
								_location = edu.mit.dig.saveface.model.geo.Factory.getSpatialThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_location = edu.mit.dig.saveface.model.geo.Factory.getSpatialThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLocation;
						synchronized (listeners) {
							consumersForLocation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLocation.iterator();iter.hasNext();){
							PointListener listener=(PointListener)iter.next();
							listener.locationRemoved(edu.mit.dig.saveface.model.geo.PointImpl.this,_location);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(altProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (alt != null) {
					if (alt.contains(literal))
						alt.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForAlt;
					synchronized (listeners) {
						consumersForAlt = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAlt.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener.altRemoved(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(_longProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (_long != null) {
					if (_long.contains(literal))
						_long.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersFor_long;
					synchronized (listeners) {
						consumersFor_long = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersFor_long.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener._longRemoved(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lat__longProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (lat__long != null) {
					if (lat__long.contains(literal))
						lat__long.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForLat__long;
					synchronized (listeners) {
						consumersForLat__long = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLat__long.iterator();iter.hasNext();){
						PointListener listener=(PointListener)iter.next();
						listener.lat__longRemoved(edu.mit.dig.saveface.model.geo.PointImpl.this,literal);
					}
				}
				return;
			}
		}

	//}
	


}