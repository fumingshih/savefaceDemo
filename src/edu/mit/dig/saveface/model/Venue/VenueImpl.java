

package edu.mit.dig.saveface.model.Venue;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Venue.Venue}
 * Use the edu.mit.dig.saveface.model.Venue.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Venue.owl#Venue)</p>
 * <br>
 */
public class VenueImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Venue.Venue {
	

	private static com.hp.hpl.jena.rdf.model.Property streetProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#street");
	private java.util.ArrayList street;
	private static com.hp.hpl.jena.rdf.model.Property longitudeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#longitude");
	private java.util.ArrayList longitude;
	private static com.hp.hpl.jena.rdf.model.Property stateProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#state");
	private java.util.ArrayList state;
	private static com.hp.hpl.jena.rdf.model.Property countryProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#country");
	private java.util.ArrayList country;
	private static com.hp.hpl.jena.rdf.model.Property cityProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#city");
	private java.util.ArrayList city;
	private static com.hp.hpl.jena.rdf.model.Property latitudeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Venue.owl#latitude");
	private java.util.ArrayList latitude;
 

	VenueImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static VenueImpl getVenue(Resource resource, Model model) throws JastorException {
		return new VenueImpl(resource, model);
	}
	    
	static VenueImpl createVenue(Resource resource, Model model) throws JastorException { 
		VenueImpl impl = new VenueImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Venue.TYPE)))
			impl._model.add(impl._resource, RDF.type, Venue.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	edu.mit.dig.saveface.model.Venue.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,streetProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,longitudeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,stateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,countryProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,cityProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,latitudeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Venue.Venue.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		street = null;
		longitude = null;
		state = null;
		country = null;
		city = null;
		latitude = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initStreet() throws JastorException {
		street = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, streetProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Venue.owl#street properties in Venue model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				street.add(obj);
		}
	}

	public java.util.Iterator getStreet() throws JastorException {
		if (street == null)
			initStreet();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(street,_resource,streetProperty,false);
	}

	public void addStreet(java.lang.String street) throws JastorException {
		if (this.street == null)
			initStreet();
		if (this.street.contains(street))
			return;
		if (_model.contains(_resource, streetProperty, createLiteral(street)))
			return;
		this.street.add(street);
		_model.add(_resource, streetProperty, createLiteral(street));
	}
	
	public void removeStreet(java.lang.String street) throws JastorException {
		if (this.street == null)
			initStreet();
		if (!this.street.contains(street))
			return;
		if (!_model.contains(_resource, streetProperty, createLiteral(street)))
			return;
		this.street.remove(street);
		_model.removeAll(_resource, streetProperty, createLiteral(street));
	}


	private void initLongitude() throws JastorException {
		longitude = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, longitudeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Venue.owl#longitude properties in Venue model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
			if (obj != null)
				longitude.add(obj);
		}
	}

	public java.util.Iterator getLongitude() throws JastorException {
		if (longitude == null)
			initLongitude();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(longitude,_resource,longitudeProperty,false);
	}

	public void addLongitude(java.lang.Double longitude) throws JastorException {
		if (this.longitude == null)
			initLongitude();
		if (this.longitude.contains(longitude))
			return;
		if (_model.contains(_resource, longitudeProperty, createLiteral(longitude)))
			return;
		this.longitude.add(longitude);
		_model.add(_resource, longitudeProperty, createLiteral(longitude));
	}
	
	public void removeLongitude(java.lang.Double longitude) throws JastorException {
		if (this.longitude == null)
			initLongitude();
		if (!this.longitude.contains(longitude))
			return;
		if (!_model.contains(_resource, longitudeProperty, createLiteral(longitude)))
			return;
		this.longitude.remove(longitude);
		_model.removeAll(_resource, longitudeProperty, createLiteral(longitude));
	}


	private void initState() throws JastorException {
		state = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, stateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Venue.owl#state properties in Venue model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				state.add(obj);
		}
	}

	public java.util.Iterator getState() throws JastorException {
		if (state == null)
			initState();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(state,_resource,stateProperty,false);
	}

	public void addState(java.lang.String state) throws JastorException {
		if (this.state == null)
			initState();
		if (this.state.contains(state))
			return;
		if (_model.contains(_resource, stateProperty, createLiteral(state)))
			return;
		this.state.add(state);
		_model.add(_resource, stateProperty, createLiteral(state));
	}
	
	public void removeState(java.lang.String state) throws JastorException {
		if (this.state == null)
			initState();
		if (!this.state.contains(state))
			return;
		if (!_model.contains(_resource, stateProperty, createLiteral(state)))
			return;
		this.state.remove(state);
		_model.removeAll(_resource, stateProperty, createLiteral(state));
	}


	private void initCountry() throws JastorException {
		country = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, countryProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Venue.owl#country properties in Venue model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				country.add(obj);
		}
	}

	public java.util.Iterator getCountry() throws JastorException {
		if (country == null)
			initCountry();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(country,_resource,countryProperty,false);
	}

	public void addCountry(java.lang.String country) throws JastorException {
		if (this.country == null)
			initCountry();
		if (this.country.contains(country))
			return;
		if (_model.contains(_resource, countryProperty, createLiteral(country)))
			return;
		this.country.add(country);
		_model.add(_resource, countryProperty, createLiteral(country));
	}
	
	public void removeCountry(java.lang.String country) throws JastorException {
		if (this.country == null)
			initCountry();
		if (!this.country.contains(country))
			return;
		if (!_model.contains(_resource, countryProperty, createLiteral(country)))
			return;
		this.country.remove(country);
		_model.removeAll(_resource, countryProperty, createLiteral(country));
	}


	private void initCity() throws JastorException {
		city = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, cityProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Venue.owl#city properties in Venue model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				city.add(obj);
		}
	}

	public java.util.Iterator getCity() throws JastorException {
		if (city == null)
			initCity();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(city,_resource,cityProperty,false);
	}

	public void addCity(java.lang.String city) throws JastorException {
		if (this.city == null)
			initCity();
		if (this.city.contains(city))
			return;
		if (_model.contains(_resource, cityProperty, createLiteral(city)))
			return;
		this.city.add(city);
		_model.add(_resource, cityProperty, createLiteral(city));
	}
	
	public void removeCity(java.lang.String city) throws JastorException {
		if (this.city == null)
			initCity();
		if (!this.city.contains(city))
			return;
		if (!_model.contains(_resource, cityProperty, createLiteral(city)))
			return;
		this.city.remove(city);
		_model.removeAll(_resource, cityProperty, createLiteral(city));
	}


	private void initLatitude() throws JastorException {
		latitude = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, latitudeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Venue.owl#latitude properties in Venue model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
			if (obj != null)
				latitude.add(obj);
		}
	}

	public java.util.Iterator getLatitude() throws JastorException {
		if (latitude == null)
			initLatitude();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(latitude,_resource,latitudeProperty,false);
	}

	public void addLatitude(java.lang.Double latitude) throws JastorException {
		if (this.latitude == null)
			initLatitude();
		if (this.latitude.contains(latitude))
			return;
		if (_model.contains(_resource, latitudeProperty, createLiteral(latitude)))
			return;
		this.latitude.add(latitude);
		_model.add(_resource, latitudeProperty, createLiteral(latitude));
	}
	
	public void removeLatitude(java.lang.Double latitude) throws JastorException {
		if (this.latitude == null)
			initLatitude();
		if (!this.latitude.contains(latitude))
			return;
		if (!_model.contains(_resource, latitudeProperty, createLiteral(latitude)))
			return;
		this.latitude.remove(latitude);
		_model.removeAll(_resource, latitudeProperty, createLiteral(latitude));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof VenueListener))
			throw new IllegalArgumentException("ThingListener must be instance of VenueListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((VenueListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof VenueListener))
			throw new IllegalArgumentException("ThingListener must be instance of VenueListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(streetProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (street == null) {
					try {
						initStreet();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !street.contains(obj))
					street.add(obj);
				java.util.ArrayList consumersForStreet;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForStreet = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForStreet.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.streetAdded(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(longitudeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
				if (longitude == null) {
					try {
						initLongitude();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !longitude.contains(obj))
					longitude.add(obj);
				java.util.ArrayList consumersForLongitude;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLongitude = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLongitude.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.longitudeAdded(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.Double)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(stateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (state == null) {
					try {
						initState();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !state.contains(obj))
					state.add(obj);
				java.util.ArrayList consumersForState;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForState = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForState.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.stateAdded(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(countryProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (country == null) {
					try {
						initCountry();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !country.contains(obj))
					country.add(obj);
				java.util.ArrayList consumersForCountry;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCountry = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCountry.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.countryAdded(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(cityProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (city == null) {
					try {
						initCity();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !city.contains(obj))
					city.add(obj);
				java.util.ArrayList consumersForCity;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCity = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCity.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.cityAdded(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(latitudeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
				if (latitude == null) {
					try {
						initLatitude();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !latitude.contains(obj))
					latitude.add(obj);
				java.util.ArrayList consumersForLatitude;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLatitude = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLatitude.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.latitudeAdded(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.Double)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(streetProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (street != null) {
					if (street.contains(obj))
						street.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.streetRemoved(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(longitudeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
				if (longitude != null) {
					if (longitude.contains(obj))
						longitude.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.longitudeRemoved(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.Double)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(stateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (state != null) {
					if (state.contains(obj))
						state.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.stateRemoved(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(countryProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (country != null) {
					if (country.contains(obj))
						country.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.countryRemoved(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(cityProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (city != null) {
					if (city.contains(obj))
						city.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.cityRemoved(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(latitudeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
				if (latitude != null) {
					if (latitude.contains(obj))
						latitude.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VenueListener listener=(VenueListener)iter.next();
						listener.latitudeRemoved(edu.mit.dig.saveface.model.Venue.VenueImpl.this,(java.lang.Double)obj);
					}
				}
				return;
			}
		}

	//}
	


}