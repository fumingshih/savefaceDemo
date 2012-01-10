

package edu.mit.dig.saveflickr.model.User;

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
 * Implementation of {@link edu.mit.dig.saveflickr.model.User.User}
 * Use the edu.mit.dig.saveflickr.model.User.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#User)</p>
 * <br>
 */
public class UserImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveflickr.model.User.User {
	

	private static com.hp.hpl.jena.rdf.model.Property usernameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#username");
	private java.util.ArrayList username;
	private static com.hp.hpl.jena.rdf.model.Property profileurlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#profileurl");
	private java.util.ArrayList profileurl;
	private static com.hp.hpl.jena.rdf.model.Property realnameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#realname");
	private java.util.ArrayList realname;
	private static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#location");
	private java.util.ArrayList location;
	private static com.hp.hpl.jena.rdf.model.Property photosetProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photoset");
	private java.util.ArrayList photoset;
	private static com.hp.hpl.jena.rdf.model.Property contactsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#contacts");
	private java.util.ArrayList contacts;
	private static com.hp.hpl.jena.rdf.model.Property photosCountProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosCount");
	private java.util.ArrayList photosCount;
	private static com.hp.hpl.jena.rdf.model.Property familyProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#family");
	private java.util.ArrayList family;
	private static com.hp.hpl.jena.rdf.model.Property friendsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#friends");
	private java.util.ArrayList friends;
	private static com.hp.hpl.jena.rdf.model.Property photosurlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosurl");
	private java.util.ArrayList photosurl;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#id");
	private java.util.ArrayList id;
 

	UserImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static UserImpl getUser(Resource resource, Model model) throws JastorException {
		return new UserImpl(resource, model);
	}
	    
	static UserImpl createUser(Resource resource, Model model) throws JastorException { 
		UserImpl impl = new UserImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, User.TYPE)))
			impl._model.add(impl._resource, RDF.type, User.TYPE);
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
    	edu.mit.dig.saveflickr.model.User.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,usernameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,profileurlProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,realnameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,photosetProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,contactsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,photosCountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,familyProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,friendsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,photosurlProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveflickr.model.User.User.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		username = null;
		profileurl = null;
		realname = null;
		location = null;
		photoset = null;
		contacts = null;
		photosCount = null;
		family = null;
		friends = null;
		photosurl = null;
		id = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initUsername() throws JastorException {
		username = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, usernameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#username properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				username.add(obj);
		}
	}

	public java.util.Iterator getUsername() throws JastorException {
		if (username == null)
			initUsername();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(username,_resource,usernameProperty,false);
	}

	public void addUsername(java.lang.String username) throws JastorException {
		if (this.username == null)
			initUsername();
		if (this.username.contains(username))
			return;
		if (_model.contains(_resource, usernameProperty, createLiteral(username)))
			return;
		this.username.add(username);
		_model.add(_resource, usernameProperty, createLiteral(username));
	}
	
	public void removeUsername(java.lang.String username) throws JastorException {
		if (this.username == null)
			initUsername();
		if (!this.username.contains(username))
			return;
		if (!_model.contains(_resource, usernameProperty, createLiteral(username)))
			return;
		this.username.remove(username);
		_model.removeAll(_resource, usernameProperty, createLiteral(username));
	}


	private void initProfileurl() throws JastorException {
		profileurl = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, profileurlProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#profileurl properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				profileurl.add(obj);
		}
	}

	public java.util.Iterator getProfileurl() throws JastorException {
		if (profileurl == null)
			initProfileurl();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(profileurl,_resource,profileurlProperty,false);
	}

	public void addProfileurl(java.lang.String profileurl) throws JastorException {
		if (this.profileurl == null)
			initProfileurl();
		if (this.profileurl.contains(profileurl))
			return;
		if (_model.contains(_resource, profileurlProperty, createLiteral(profileurl)))
			return;
		this.profileurl.add(profileurl);
		_model.add(_resource, profileurlProperty, createLiteral(profileurl));
	}
	
	public void removeProfileurl(java.lang.String profileurl) throws JastorException {
		if (this.profileurl == null)
			initProfileurl();
		if (!this.profileurl.contains(profileurl))
			return;
		if (!_model.contains(_resource, profileurlProperty, createLiteral(profileurl)))
			return;
		this.profileurl.remove(profileurl);
		_model.removeAll(_resource, profileurlProperty, createLiteral(profileurl));
	}


	private void initRealname() throws JastorException {
		realname = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, realnameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#realname properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				realname.add(obj);
		}
	}

	public java.util.Iterator getRealname() throws JastorException {
		if (realname == null)
			initRealname();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(realname,_resource,realnameProperty,false);
	}

	public void addRealname(java.lang.String realname) throws JastorException {
		if (this.realname == null)
			initRealname();
		if (this.realname.contains(realname))
			return;
		if (_model.contains(_resource, realnameProperty, createLiteral(realname)))
			return;
		this.realname.add(realname);
		_model.add(_resource, realnameProperty, createLiteral(realname));
	}
	
	public void removeRealname(java.lang.String realname) throws JastorException {
		if (this.realname == null)
			initRealname();
		if (!this.realname.contains(realname))
			return;
		if (!_model.contains(_resource, realnameProperty, createLiteral(realname)))
			return;
		this.realname.remove(realname);
		_model.removeAll(_resource, realnameProperty, createLiteral(realname));
	}


	private void initLocation() throws JastorException {
		location = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#location properties in User model not a Literal", stmt.getObject());
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


	private void initPhotoset() throws JastorException {
		this.photoset = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, photosetProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photoset properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing photoset = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.photoset.add(photoset);
			}
		}
	}

	public java.util.Iterator getPhotoset() throws JastorException {
		if (photoset == null)
			initPhotoset();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(photoset,_resource,photosetProperty,true);
	}

	public void addPhotoset(com.ibm.adtech.jastor.Thing photoset) throws JastorException {
		if (this.photoset == null)
			initPhotoset();
		if (this.photoset.contains(photoset)) {
			this.photoset.remove(photoset);
			this.photoset.add(photoset);
			return;
		}
		this.photoset.add(photoset);
		_model.add(_model.createStatement(_resource,photosetProperty,photoset.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPhotoset() throws JastorException {
		com.ibm.adtech.jastor.Thing photoset = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.photoset == null)
			initPhotoset();
		this.photoset.add(photoset);
		_model.add(_model.createStatement(_resource,photosetProperty,photoset.resource()));
		return photoset;
	}
	
	public com.ibm.adtech.jastor.Thing addPhotoset(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing photoset = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.photoset == null)
			initPhotoset();
		if (this.photoset.contains(photoset))
			return photoset;
		this.photoset.add(photoset);
		_model.add(_model.createStatement(_resource,photosetProperty,photoset.resource()));
		return photoset;
	}
	
	public void removePhotoset(com.ibm.adtech.jastor.Thing photoset) throws JastorException {
		if (this.photoset == null)
			initPhotoset();
		if (!this.photoset.contains(photoset))
			return;
		if (!_model.contains(_resource, photosetProperty, photoset.resource()))
			return;
		this.photoset.remove(photoset);
		_model.removeAll(_resource, photosetProperty, photoset.resource());
	}
		 

	private void initContacts() throws JastorException {
		this.contacts = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, contactsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#contacts properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing contacts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.contacts.add(contacts);
			}
		}
	}

	public java.util.Iterator getContacts() throws JastorException {
		if (contacts == null)
			initContacts();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(contacts,_resource,contactsProperty,true);
	}

	public void addContacts(com.ibm.adtech.jastor.Thing contacts) throws JastorException {
		if (this.contacts == null)
			initContacts();
		if (this.contacts.contains(contacts)) {
			this.contacts.remove(contacts);
			this.contacts.add(contacts);
			return;
		}
		this.contacts.add(contacts);
		_model.add(_model.createStatement(_resource,contactsProperty,contacts.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addContacts() throws JastorException {
		com.ibm.adtech.jastor.Thing contacts = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.contacts == null)
			initContacts();
		this.contacts.add(contacts);
		_model.add(_model.createStatement(_resource,contactsProperty,contacts.resource()));
		return contacts;
	}
	
	public com.ibm.adtech.jastor.Thing addContacts(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing contacts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.contacts == null)
			initContacts();
		if (this.contacts.contains(contacts))
			return contacts;
		this.contacts.add(contacts);
		_model.add(_model.createStatement(_resource,contactsProperty,contacts.resource()));
		return contacts;
	}
	
	public void removeContacts(com.ibm.adtech.jastor.Thing contacts) throws JastorException {
		if (this.contacts == null)
			initContacts();
		if (!this.contacts.contains(contacts))
			return;
		if (!_model.contains(_resource, contactsProperty, contacts.resource()))
			return;
		this.contacts.remove(contacts);
		_model.removeAll(_resource, contactsProperty, contacts.resource());
	}
		 

	private void initPhotosCount() throws JastorException {
		photosCount = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, photosCountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosCount properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				photosCount.add(obj);
		}
	}

	public java.util.Iterator getPhotosCount() throws JastorException {
		if (photosCount == null)
			initPhotosCount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(photosCount,_resource,photosCountProperty,false);
	}

	public void addPhotosCount(java.lang.Integer photosCount) throws JastorException {
		if (this.photosCount == null)
			initPhotosCount();
		if (this.photosCount.contains(photosCount))
			return;
		if (_model.contains(_resource, photosCountProperty, createLiteral(photosCount)))
			return;
		this.photosCount.add(photosCount);
		_model.add(_resource, photosCountProperty, createLiteral(photosCount));
	}
	
	public void removePhotosCount(java.lang.Integer photosCount) throws JastorException {
		if (this.photosCount == null)
			initPhotosCount();
		if (!this.photosCount.contains(photosCount))
			return;
		if (!_model.contains(_resource, photosCountProperty, createLiteral(photosCount)))
			return;
		this.photosCount.remove(photosCount);
		_model.removeAll(_resource, photosCountProperty, createLiteral(photosCount));
	}


	private void initFamily() throws JastorException {
		this.family = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, familyProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#family properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing family = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.family.add(family);
			}
		}
	}

	public java.util.Iterator getFamily() throws JastorException {
		if (family == null)
			initFamily();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(family,_resource,familyProperty,true);
	}

	public void addFamily(com.ibm.adtech.jastor.Thing family) throws JastorException {
		if (this.family == null)
			initFamily();
		if (this.family.contains(family)) {
			this.family.remove(family);
			this.family.add(family);
			return;
		}
		this.family.add(family);
		_model.add(_model.createStatement(_resource,familyProperty,family.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addFamily() throws JastorException {
		com.ibm.adtech.jastor.Thing family = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.family == null)
			initFamily();
		this.family.add(family);
		_model.add(_model.createStatement(_resource,familyProperty,family.resource()));
		return family;
	}
	
	public com.ibm.adtech.jastor.Thing addFamily(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing family = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.family == null)
			initFamily();
		if (this.family.contains(family))
			return family;
		this.family.add(family);
		_model.add(_model.createStatement(_resource,familyProperty,family.resource()));
		return family;
	}
	
	public void removeFamily(com.ibm.adtech.jastor.Thing family) throws JastorException {
		if (this.family == null)
			initFamily();
		if (!this.family.contains(family))
			return;
		if (!_model.contains(_resource, familyProperty, family.resource()))
			return;
		this.family.remove(family);
		_model.removeAll(_resource, familyProperty, family.resource());
	}
		 

	private void initFriends() throws JastorException {
		this.friends = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, friendsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#friends properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.friends.add(friends);
			}
		}
	}

	public java.util.Iterator getFriends() throws JastorException {
		if (friends == null)
			initFriends();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(friends,_resource,friendsProperty,true);
	}

	public void addFriends(com.ibm.adtech.jastor.Thing friends) throws JastorException {
		if (this.friends == null)
			initFriends();
		if (this.friends.contains(friends)) {
			this.friends.remove(friends);
			this.friends.add(friends);
			return;
		}
		this.friends.add(friends);
		_model.add(_model.createStatement(_resource,friendsProperty,friends.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addFriends() throws JastorException {
		com.ibm.adtech.jastor.Thing friends = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.friends == null)
			initFriends();
		this.friends.add(friends);
		_model.add(_model.createStatement(_resource,friendsProperty,friends.resource()));
		return friends;
	}
	
	public com.ibm.adtech.jastor.Thing addFriends(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.friends == null)
			initFriends();
		if (this.friends.contains(friends))
			return friends;
		this.friends.add(friends);
		_model.add(_model.createStatement(_resource,friendsProperty,friends.resource()));
		return friends;
	}
	
	public void removeFriends(com.ibm.adtech.jastor.Thing friends) throws JastorException {
		if (this.friends == null)
			initFriends();
		if (!this.friends.contains(friends))
			return;
		if (!_model.contains(_resource, friendsProperty, friends.resource()))
			return;
		this.friends.remove(friends);
		_model.removeAll(_resource, friendsProperty, friends.resource());
	}
		 

	private void initPhotosurl() throws JastorException {
		photosurl = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, photosurlProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosurl properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				photosurl.add(obj);
		}
	}

	public java.util.Iterator getPhotosurl() throws JastorException {
		if (photosurl == null)
			initPhotosurl();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(photosurl,_resource,photosurlProperty,false);
	}

	public void addPhotosurl(java.lang.String photosurl) throws JastorException {
		if (this.photosurl == null)
			initPhotosurl();
		if (this.photosurl.contains(photosurl))
			return;
		if (_model.contains(_resource, photosurlProperty, createLiteral(photosurl)))
			return;
		this.photosurl.add(photosurl);
		_model.add(_resource, photosurlProperty, createLiteral(photosurl));
	}
	
	public void removePhotosurl(java.lang.String photosurl) throws JastorException {
		if (this.photosurl == null)
			initPhotosurl();
		if (!this.photosurl.contains(photosurl))
			return;
		if (!_model.contains(_resource, photosurlProperty, createLiteral(photosurl)))
			return;
		this.photosurl.remove(photosurl);
		_model.removeAll(_resource, photosurlProperty, createLiteral(photosurl));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/User.owl#id properties in User model not a Literal", stmt.getObject());
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
		if (!(listener instanceof UserListener))
			throw new IllegalArgumentException("ThingListener must be instance of UserListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((UserListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof UserListener))
			throw new IllegalArgumentException("ThingListener must be instance of UserListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(usernameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (username == null) {
					try {
						initUsername();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !username.contains(obj))
					username.add(obj);
				java.util.ArrayList consumersForUsername;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForUsername = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForUsername.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.usernameAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(profileurlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (profileurl == null) {
					try {
						initProfileurl();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !profileurl.contains(obj))
					profileurl.add(obj);
				java.util.ArrayList consumersForProfileurl;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForProfileurl = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForProfileurl.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.profileurlAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(realnameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (realname == null) {
					try {
						initRealname();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !realname.contains(obj))
					realname.add(obj);
				java.util.ArrayList consumersForRealname;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForRealname = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForRealname.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.realnameAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.locationAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosetProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _photoset = null;
					try {
						_photoset = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (photoset == null) {
						try {
							initPhotoset();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!photoset.contains(_photoset))
						photoset.add(_photoset);
					if (listeners != null) {
						java.util.ArrayList consumersForPhotoset;
						synchronized (listeners) {
							consumersForPhotoset = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhotoset.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.photosetAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,_photoset);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(contactsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _contacts = null;
					try {
						_contacts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (contacts == null) {
						try {
							initContacts();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!contacts.contains(_contacts))
						contacts.add(_contacts);
					if (listeners != null) {
						java.util.ArrayList consumersForContacts;
						synchronized (listeners) {
							consumersForContacts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForContacts.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.contactsAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,_contacts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (photosCount == null) {
					try {
						initPhotosCount();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !photosCount.contains(obj))
					photosCount.add(obj);
				java.util.ArrayList consumersForPhotosCount;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPhotosCount = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPhotosCount.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.photosCountAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(familyProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _family = null;
					try {
						_family = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (family == null) {
						try {
							initFamily();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!family.contains(_family))
						family.add(_family);
					if (listeners != null) {
						java.util.ArrayList consumersForFamily;
						synchronized (listeners) {
							consumersForFamily = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFamily.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.familyAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,_family);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(friendsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _friends = null;
					try {
						_friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (friends == null) {
						try {
							initFriends();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!friends.contains(_friends))
						friends.add(_friends);
					if (listeners != null) {
						java.util.ArrayList consumersForFriends;
						synchronized (listeners) {
							consumersForFriends = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFriends.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.friendsAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,_friends);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosurlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (photosurl == null) {
					try {
						initPhotosurl();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !photosurl.contains(obj))
					photosurl.add(obj);
				java.util.ArrayList consumersForPhotosurl;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPhotosurl = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPhotosurl.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.photosurlAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.idAdded(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(usernameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (username != null) {
					if (username.contains(obj))
						username.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.usernameRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(profileurlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (profileurl != null) {
					if (profileurl.contains(obj))
						profileurl.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.profileurlRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(realnameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (realname != null) {
					if (realname.contains(obj))
						realname.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.realnameRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.locationRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosetProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _photoset = null;
					if (photoset != null) {
						boolean found = false;
						for (int i=0;i<photoset.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) photoset.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_photoset = __item;
								break;
							}
						}
						if (found)
							photoset.remove(_photoset);
						else {
							try {
								_photoset = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_photoset = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPhotoset;
						synchronized (listeners) {
							consumersForPhotoset = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhotoset.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.photosetRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,_photoset);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(contactsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _contacts = null;
					if (contacts != null) {
						boolean found = false;
						for (int i=0;i<contacts.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) contacts.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_contacts = __item;
								break;
							}
						}
						if (found)
							contacts.remove(_contacts);
						else {
							try {
								_contacts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_contacts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForContacts;
						synchronized (listeners) {
							consumersForContacts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForContacts.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.contactsRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,_contacts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (photosCount != null) {
					if (photosCount.contains(obj))
						photosCount.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.photosCountRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(familyProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _family = null;
					if (family != null) {
						boolean found = false;
						for (int i=0;i<family.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) family.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_family = __item;
								break;
							}
						}
						if (found)
							family.remove(_family);
						else {
							try {
								_family = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_family = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForFamily;
						synchronized (listeners) {
							consumersForFamily = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFamily.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.familyRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,_family);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(friendsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _friends = null;
					if (friends != null) {
						boolean found = false;
						for (int i=0;i<friends.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) friends.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_friends = __item;
								break;
							}
						}
						if (found)
							friends.remove(_friends);
						else {
							try {
								_friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForFriends;
						synchronized (listeners) {
							consumersForFriends = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFriends.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.friendsRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,_friends);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosurlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (photosurl != null) {
					if (photosurl.contains(obj))
						photosurl.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.photosurlRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveflickr.model.User.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}