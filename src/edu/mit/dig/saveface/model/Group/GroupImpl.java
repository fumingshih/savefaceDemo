

package edu.mit.dig.saveface.model.Group;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Group.Group}
 * Use the edu.mit.dig.saveface.model.Group.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#Group)</p>
 * <br>
 */
public class GroupImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Group.Group {
	

	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#owner");
	private java.util.ArrayList owner;
	private static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#privacy");
	private java.util.ArrayList privacy;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property venueProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#venue");
	private java.util.ArrayList venue;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#description");
	private java.util.ArrayList description;
 

	GroupImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static GroupImpl getGroup(Resource resource, Model model) throws JastorException {
		return new GroupImpl(resource, model);
	}
	    
	static GroupImpl createGroup(Resource resource, Model model) throws JastorException { 
		GroupImpl impl = new GroupImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Group.TYPE)))
			impl._model.add(impl._resource, RDF.type, Group.TYPE);
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
    	edu.mit.dig.saveface.model.Group.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,ownerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,privacyProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,venueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Group.Group.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		updatedTime = null;
		owner = null;
		privacy = null;
		link = null;
		venue = null;
		id = null;
		description = null;
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#updatedTime properties in Group model not a Literal", stmt.getObject());
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


	private void initOwner() throws JastorException {
		this.owner = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, ownerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#owner properties in Group model not a Resource", stmt.getObject());
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
		 

	private void initPrivacy() throws JastorException {
		privacy = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, privacyProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#privacy properties in Group model not a Literal", stmt.getObject());
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


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#link properties in Group model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				link.add(obj);
		}
	}

	public java.util.Iterator getLink() throws JastorException {
		if (link == null)
			initLink();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(link,_resource,linkProperty,false);
	}

	public void addLink(java.lang.String link) throws JastorException {
		if (this.link == null)
			initLink();
		if (this.link.contains(link))
			return;
		if (_model.contains(_resource, linkProperty, createLiteral(link)))
			return;
		this.link.add(link);
		_model.add(_resource, linkProperty, createLiteral(link));
	}
	
	public void removeLink(java.lang.String link) throws JastorException {
		if (this.link == null)
			initLink();
		if (!this.link.contains(link))
			return;
		if (!_model.contains(_resource, linkProperty, createLiteral(link)))
			return;
		this.link.remove(link);
		_model.removeAll(_resource, linkProperty, createLiteral(link));
	}


	private void initVenue() throws JastorException {
		this.venue = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, venueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#venue properties in Group model not a Resource", stmt.getObject());
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
		 

	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#id properties in Group model not a Literal", stmt.getObject());
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


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Group.owl#description properties in Group model not a Literal", stmt.getObject());
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
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof GroupListener))
			throw new IllegalArgumentException("ThingListener must be instance of GroupListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((GroupListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof GroupListener))
			throw new IllegalArgumentException("ThingListener must be instance of GroupListener"); 
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
						GroupListener listener=(GroupListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
							GroupListener listener=(GroupListener)iter.next();
							listener.ownerAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,_owner);
						}
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
						GroupListener listener=(GroupListener)iter.next();
						listener.privacyAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(linkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (link == null) {
					try {
						initLink();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !link.contains(obj))
					link.add(obj);
				java.util.ArrayList consumersForLink;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLink = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLink.iterator();iter.hasNext();){
						GroupListener listener=(GroupListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
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
							GroupListener listener=(GroupListener)iter.next();
							listener.venueAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,_venue);
						}
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
						GroupListener listener=(GroupListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
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
						GroupListener listener=(GroupListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
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
						GroupListener listener=(GroupListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
							GroupListener listener=(GroupListener)iter.next();
							listener.ownerRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,_owner);
						}
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
						GroupListener listener=(GroupListener)iter.next();
						listener.privacyRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(linkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (link != null) {
					if (link.contains(obj))
						link.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						GroupListener listener=(GroupListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
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
							GroupListener listener=(GroupListener)iter.next();
							listener.venueRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,_venue);
						}
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
						GroupListener listener=(GroupListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
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
						GroupListener listener=(GroupListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Group.GroupImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}