

package edu.mit.dig.saveface.model.Event;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Event.Event}
 * Use the edu.mit.dig.saveface.model.Event.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Event.owl#Event)</p>
 * <br>
 */
public class EventImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Event.Event {
	

	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#privacy");
	private java.util.ArrayList privacy;
	private static com.hp.hpl.jena.rdf.model.Property startTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#startTime");
	private java.util.ArrayList startTime;
	private static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#location");
	private java.util.ArrayList location;
	private static com.hp.hpl.jena.rdf.model.Property endTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#endTime");
	private java.util.ArrayList endTime;
	private static com.hp.hpl.jena.rdf.model.Property rsvpStatusProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#rsvpStatus");
	private java.util.ArrayList rsvpStatus;
	private static com.hp.hpl.jena.rdf.model.Property venueProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#venue");
	private java.util.ArrayList venue;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#owner");
	private java.util.ArrayList owner;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Event.owl#id");
	private java.util.ArrayList id;
 

	EventImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static EventImpl getEvent(Resource resource, Model model) throws JastorException {
		return new EventImpl(resource, model);
	}
	    
	static EventImpl createEvent(Resource resource, Model model) throws JastorException { 
		EventImpl impl = new EventImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Event.TYPE)))
			impl._model.add(impl._resource, RDF.type, Event.TYPE);
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
    	edu.mit.dig.saveface.model.Event.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,privacyProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,startTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,endTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,rsvpStatusProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,venueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,ownerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Event.Event.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		updatedTime = null;
		privacy = null;
		startTime = null;
		location = null;
		endTime = null;
		rsvpStatus = null;
		venue = null;
		name = null;
		owner = null;
		description = null;
		id = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#updatedTime properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				updatedTime.add(obj);
		}
	}

	public java.util.Iterator getUpdatedTime() throws JastorException {
		if (updatedTime == null)
			initUpdatedTime();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(updatedTime,_resource,updatedTimeProperty,false);
	}

	public void addUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws JastorException {
		if (this.updatedTime == null)
			initUpdatedTime();
		if (this.updatedTime.contains(updatedTime))
			return;
		if (_model.contains(_resource, updatedTimeProperty, createLiteral(updatedTime)))
			return;
		this.updatedTime.add(updatedTime);
		_model.add(_resource, updatedTimeProperty, createLiteral(updatedTime));
	}
	
	public void removeUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws JastorException {
		if (this.updatedTime == null)
			initUpdatedTime();
		if (!this.updatedTime.contains(updatedTime))
			return;
		if (!_model.contains(_resource, updatedTimeProperty, createLiteral(updatedTime)))
			return;
		this.updatedTime.remove(updatedTime);
		_model.removeAll(_resource, updatedTimeProperty, createLiteral(updatedTime));
	}


	private void initPrivacy() throws JastorException {
		privacy = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, privacyProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#privacy properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				privacy.add(obj);
		}
	}

	public java.util.Iterator getPrivacy() throws JastorException {
		if (privacy == null)
			initPrivacy();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(privacy,_resource,privacyProperty,false);
	}

	public void addPrivacy(java.lang.String privacy) throws JastorException {
		if (this.privacy == null)
			initPrivacy();
		if (this.privacy.contains(privacy))
			return;
		if (_model.contains(_resource, privacyProperty, createLiteral(privacy)))
			return;
		this.privacy.add(privacy);
		_model.add(_resource, privacyProperty, createLiteral(privacy));
	}
	
	public void removePrivacy(java.lang.String privacy) throws JastorException {
		if (this.privacy == null)
			initPrivacy();
		if (!this.privacy.contains(privacy))
			return;
		if (!_model.contains(_resource, privacyProperty, createLiteral(privacy)))
			return;
		this.privacy.remove(privacy);
		_model.removeAll(_resource, privacyProperty, createLiteral(privacy));
	}


	private void initStartTime() throws JastorException {
		startTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, startTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#startTime properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				startTime.add(obj);
		}
	}

	public java.util.Iterator getStartTime() throws JastorException {
		if (startTime == null)
			initStartTime();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(startTime,_resource,startTimeProperty,false);
	}

	public void addStartTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startTime) throws JastorException {
		if (this.startTime == null)
			initStartTime();
		if (this.startTime.contains(startTime))
			return;
		if (_model.contains(_resource, startTimeProperty, createLiteral(startTime)))
			return;
		this.startTime.add(startTime);
		_model.add(_resource, startTimeProperty, createLiteral(startTime));
	}
	
	public void removeStartTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startTime) throws JastorException {
		if (this.startTime == null)
			initStartTime();
		if (!this.startTime.contains(startTime))
			return;
		if (!_model.contains(_resource, startTimeProperty, createLiteral(startTime)))
			return;
		this.startTime.remove(startTime);
		_model.removeAll(_resource, startTimeProperty, createLiteral(startTime));
	}


	private void initLocation() throws JastorException {
		location = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#location properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				location.add(obj);
		}
	}

	public java.util.Iterator getLocation() throws JastorException {
		if (location == null)
			initLocation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(location,_resource,locationProperty,false);
	}

	public void addLocation(java.lang.String location) throws JastorException {
		if (this.location == null)
			initLocation();
		if (this.location.contains(location))
			return;
		if (_model.contains(_resource, locationProperty, createLiteral(location)))
			return;
		this.location.add(location);
		_model.add(_resource, locationProperty, createLiteral(location));
	}
	
	public void removeLocation(java.lang.String location) throws JastorException {
		if (this.location == null)
			initLocation();
		if (!this.location.contains(location))
			return;
		if (!_model.contains(_resource, locationProperty, createLiteral(location)))
			return;
		this.location.remove(location);
		_model.removeAll(_resource, locationProperty, createLiteral(location));
	}


	private void initEndTime() throws JastorException {
		endTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, endTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#endTime properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				endTime.add(obj);
		}
	}

	public java.util.Iterator getEndTime() throws JastorException {
		if (endTime == null)
			initEndTime();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(endTime,_resource,endTimeProperty,false);
	}

	public void addEndTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endTime) throws JastorException {
		if (this.endTime == null)
			initEndTime();
		if (this.endTime.contains(endTime))
			return;
		if (_model.contains(_resource, endTimeProperty, createLiteral(endTime)))
			return;
		this.endTime.add(endTime);
		_model.add(_resource, endTimeProperty, createLiteral(endTime));
	}
	
	public void removeEndTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endTime) throws JastorException {
		if (this.endTime == null)
			initEndTime();
		if (!this.endTime.contains(endTime))
			return;
		if (!_model.contains(_resource, endTimeProperty, createLiteral(endTime)))
			return;
		this.endTime.remove(endTime);
		_model.removeAll(_resource, endTimeProperty, createLiteral(endTime));
	}


	private void initRsvpStatus() throws JastorException {
		rsvpStatus = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, rsvpStatusProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#rsvpStatus properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				rsvpStatus.add(obj);
		}
	}

	public java.util.Iterator getRsvpStatus() throws JastorException {
		if (rsvpStatus == null)
			initRsvpStatus();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(rsvpStatus,_resource,rsvpStatusProperty,false);
	}

	public void addRsvpStatus(java.lang.String rsvpStatus) throws JastorException {
		if (this.rsvpStatus == null)
			initRsvpStatus();
		if (this.rsvpStatus.contains(rsvpStatus))
			return;
		if (_model.contains(_resource, rsvpStatusProperty, createLiteral(rsvpStatus)))
			return;
		this.rsvpStatus.add(rsvpStatus);
		_model.add(_resource, rsvpStatusProperty, createLiteral(rsvpStatus));
	}
	
	public void removeRsvpStatus(java.lang.String rsvpStatus) throws JastorException {
		if (this.rsvpStatus == null)
			initRsvpStatus();
		if (!this.rsvpStatus.contains(rsvpStatus))
			return;
		if (!_model.contains(_resource, rsvpStatusProperty, createLiteral(rsvpStatus)))
			return;
		this.rsvpStatus.remove(rsvpStatus);
		_model.removeAll(_resource, rsvpStatusProperty, createLiteral(rsvpStatus));
	}


	private void initVenue() throws JastorException {
		this.venue = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, venueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#venue properties in Event model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing venue = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.venue.add(venue);
			}
		}
	}

	public java.util.Iterator getVenue() throws JastorException {
		if (venue == null)
			initVenue();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(venue,_resource,venueProperty,true);
	}

	public void addVenue(com.ibm.adtech.jastor.Thing venue) throws JastorException {
		if (this.venue == null)
			initVenue();
		if (this.venue.contains(venue)) {
			this.venue.remove(venue);
			this.venue.add(venue);
			return;
		}
		this.venue.add(venue);
		_model.add(_model.createStatement(_resource,venueProperty,venue.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addVenue() throws JastorException {
		com.ibm.adtech.jastor.Thing venue = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.venue == null)
			initVenue();
		this.venue.add(venue);
		_model.add(_model.createStatement(_resource,venueProperty,venue.resource()));
		return venue;
	}
	
	public com.ibm.adtech.jastor.Thing addVenue(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing venue = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.venue == null)
			initVenue();
		if (this.venue.contains(venue))
			return venue;
		this.venue.add(venue);
		_model.add(_model.createStatement(_resource,venueProperty,venue.resource()));
		return venue;
	}
	
	public void removeVenue(com.ibm.adtech.jastor.Thing venue) throws JastorException {
		if (this.venue == null)
			initVenue();
		if (!this.venue.contains(venue))
			return;
		if (!_model.contains(_resource, venueProperty, venue.resource()))
			return;
		this.venue.remove(venue);
		_model.removeAll(_resource, venueProperty, venue.resource());
	}
		 

	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#name properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				name.add(obj);
		}
	}

	public java.util.Iterator getName() throws JastorException {
		if (name == null)
			initName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(name,_resource,nameProperty,false);
	}

	public void addName(java.lang.String name) throws JastorException {
		if (this.name == null)
			initName();
		if (this.name.contains(name))
			return;
		if (_model.contains(_resource, nameProperty, createLiteral(name)))
			return;
		this.name.add(name);
		_model.add(_resource, nameProperty, createLiteral(name));
	}
	
	public void removeName(java.lang.String name) throws JastorException {
		if (this.name == null)
			initName();
		if (!this.name.contains(name))
			return;
		if (!_model.contains(_resource, nameProperty, createLiteral(name)))
			return;
		this.name.remove(name);
		_model.removeAll(_resource, nameProperty, createLiteral(name));
	}


	private void initOwner() throws JastorException {
		this.owner = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, ownerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#owner properties in Event model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing owner = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.owner.add(owner);
			}
		}
	}

	public java.util.Iterator getOwner() throws JastorException {
		if (owner == null)
			initOwner();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(owner,_resource,ownerProperty,true);
	}

	public void addOwner(com.ibm.adtech.jastor.Thing owner) throws JastorException {
		if (this.owner == null)
			initOwner();
		if (this.owner.contains(owner)) {
			this.owner.remove(owner);
			this.owner.add(owner);
			return;
		}
		this.owner.add(owner);
		_model.add(_model.createStatement(_resource,ownerProperty,owner.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addOwner() throws JastorException {
		com.ibm.adtech.jastor.Thing owner = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.owner == null)
			initOwner();
		this.owner.add(owner);
		_model.add(_model.createStatement(_resource,ownerProperty,owner.resource()));
		return owner;
	}
	
	public com.ibm.adtech.jastor.Thing addOwner(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing owner = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.owner == null)
			initOwner();
		if (this.owner.contains(owner))
			return owner;
		this.owner.add(owner);
		_model.add(_model.createStatement(_resource,ownerProperty,owner.resource()));
		return owner;
	}
	
	public void removeOwner(com.ibm.adtech.jastor.Thing owner) throws JastorException {
		if (this.owner == null)
			initOwner();
		if (!this.owner.contains(owner))
			return;
		if (!_model.contains(_resource, ownerProperty, owner.resource()))
			return;
		this.owner.remove(owner);
		_model.removeAll(_resource, ownerProperty, owner.resource());
	}
		 

	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#description properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				description.add(obj);
		}
	}

	public java.util.Iterator getDescription() throws JastorException {
		if (description == null)
			initDescription();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(description,_resource,descriptionProperty,false);
	}

	public void addDescription(java.lang.String description) throws JastorException {
		if (this.description == null)
			initDescription();
		if (this.description.contains(description))
			return;
		if (_model.contains(_resource, descriptionProperty, createLiteral(description)))
			return;
		this.description.add(description);
		_model.add(_resource, descriptionProperty, createLiteral(description));
	}
	
	public void removeDescription(java.lang.String description) throws JastorException {
		if (this.description == null)
			initDescription();
		if (!this.description.contains(description))
			return;
		if (!_model.contains(_resource, descriptionProperty, createLiteral(description)))
			return;
		this.description.remove(description);
		_model.removeAll(_resource, descriptionProperty, createLiteral(description));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Event.owl#id properties in Event model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				id.add(obj);
		}
	}

	public java.util.Iterator getId() throws JastorException {
		if (id == null)
			initId();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(id,_resource,idProperty,false);
	}

	public void addId(java.lang.String id) throws JastorException {
		if (this.id == null)
			initId();
		if (this.id.contains(id))
			return;
		if (_model.contains(_resource, idProperty, createLiteral(id)))
			return;
		this.id.add(id);
		_model.add(_resource, idProperty, createLiteral(id));
	}
	
	public void removeId(java.lang.String id) throws JastorException {
		if (this.id == null)
			initId();
		if (!this.id.contains(id))
			return;
		if (!_model.contains(_resource, idProperty, createLiteral(id)))
			return;
		this.id.remove(id);
		_model.removeAll(_resource, idProperty, createLiteral(id));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof EventListener))
			throw new IllegalArgumentException("ThingListener must be instance of EventListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((EventListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof EventListener))
			throw new IllegalArgumentException("ThingListener must be instance of EventListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(updatedTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (updatedTime == null) {
					try {
						initUpdatedTime();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !updatedTime.contains(obj))
					updatedTime.add(obj);
				java.util.ArrayList consumersForUpdatedTime;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForUpdatedTime = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForUpdatedTime.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(privacyProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (privacy == null) {
					try {
						initPrivacy();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !privacy.contains(obj))
					privacy.add(obj);
				java.util.ArrayList consumersForPrivacy;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPrivacy = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPrivacy.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.privacyAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (startTime == null) {
					try {
						initStartTime();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !startTime.contains(obj))
					startTime.add(obj);
				java.util.ArrayList consumersForStartTime;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForStartTime = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForStartTime.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.startTimeAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(locationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (location == null) {
					try {
						initLocation();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !location.contains(obj))
					location.add(obj);
				java.util.ArrayList consumersForLocation;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLocation = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLocation.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.locationAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(endTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (endTime == null) {
					try {
						initEndTime();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !endTime.contains(obj))
					endTime.add(obj);
				java.util.ArrayList consumersForEndTime;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForEndTime = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForEndTime.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.endTimeAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(rsvpStatusProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (rsvpStatus == null) {
					try {
						initRsvpStatus();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !rsvpStatus.contains(obj))
					rsvpStatus.add(obj);
				java.util.ArrayList consumersForRsvpStatus;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForRsvpStatus = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForRsvpStatus.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.rsvpStatusAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(venueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _venue = null;
					try {
						_venue = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (venue == null) {
						try {
							initVenue();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!venue.contains(_venue))
						venue.add(_venue);
					if (listeners != null) {
						java.util.ArrayList consumersForVenue;
						synchronized (listeners) {
							consumersForVenue = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForVenue.iterator();iter.hasNext();){
							EventListener listener=(EventListener)iter.next();
							listener.venueAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,_venue);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(nameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (name == null) {
					try {
						initName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !name.contains(obj))
					name.add(obj);
				java.util.ArrayList consumersForName;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForName.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(ownerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _owner = null;
					try {
						_owner = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (owner == null) {
						try {
							initOwner();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!owner.contains(_owner))
						owner.add(_owner);
					if (listeners != null) {
						java.util.ArrayList consumersForOwner;
						synchronized (listeners) {
							consumersForOwner = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForOwner.iterator();iter.hasNext();){
							EventListener listener=(EventListener)iter.next();
							listener.ownerAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,_owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(descriptionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (description == null) {
					try {
						initDescription();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !description.contains(obj))
					description.add(obj);
				java.util.ArrayList consumersForDescription;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDescription = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDescription.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(idProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (id == null) {
					try {
						initId();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !id.contains(obj))
					id.add(obj);
				java.util.ArrayList consumersForId;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForId = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForId.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(updatedTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (updatedTime != null) {
					if (updatedTime.contains(obj))
						updatedTime.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(privacyProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (privacy != null) {
					if (privacy.contains(obj))
						privacy.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.privacyRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (startTime != null) {
					if (startTime.contains(obj))
						startTime.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.startTimeRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(locationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (location != null) {
					if (location.contains(obj))
						location.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.locationRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(endTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (endTime != null) {
					if (endTime.contains(obj))
						endTime.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.endTimeRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(rsvpStatusProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (rsvpStatus != null) {
					if (rsvpStatus.contains(obj))
						rsvpStatus.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.rsvpStatusRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(venueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _venue = null;
					if (venue != null) {
						boolean found = false;
						for (int i=0;i<venue.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) venue.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_venue = __item;
								break;
							}
						}
						if (found)
							venue.remove(_venue);
						else {
							try {
								_venue = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_venue = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForVenue;
						synchronized (listeners) {
							consumersForVenue = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForVenue.iterator();iter.hasNext();){
							EventListener listener=(EventListener)iter.next();
							listener.venueRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,_venue);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(nameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (name != null) {
					if (name.contains(obj))
						name.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(ownerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _owner = null;
					if (owner != null) {
						boolean found = false;
						for (int i=0;i<owner.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) owner.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_owner = __item;
								break;
							}
						}
						if (found)
							owner.remove(_owner);
						else {
							try {
								_owner = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_owner = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForOwner;
						synchronized (listeners) {
							consumersForOwner = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForOwner.iterator();iter.hasNext();){
							EventListener listener=(EventListener)iter.next();
							listener.ownerRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,_owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(descriptionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (description != null) {
					if (description.contains(obj))
						description.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(idProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (id != null) {
					if (id.contains(obj))
						id.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EventListener listener=(EventListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Event.EventImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}