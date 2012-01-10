

package edu.mit.dig.saveface.model.Album;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Album.Album}
 * Use the edu.mit.dig.saveface.model.Album.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Album.owl#Album)</p>
 * <br>
 */
public class AlbumImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Album.Album {
	

	private static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#location");
	private java.util.ArrayList location;
	private static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#comments");
	private java.util.ArrayList comments;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#from");
	private java.util.ArrayList from;
	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property photosProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#photos");
	private java.util.ArrayList photos;
	private static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#privacy");
	private java.util.ArrayList privacy;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property countProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Album.owl#count");
	private java.util.ArrayList count;
 

	AlbumImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static AlbumImpl getAlbum(Resource resource, Model model) throws JastorException {
		return new AlbumImpl(resource, model);
	}
	    
	static AlbumImpl createAlbum(Resource resource, Model model) throws JastorException { 
		AlbumImpl impl = new AlbumImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Album.TYPE)))
			impl._model.add(impl._resource, RDF.type, Album.TYPE);
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
    	edu.mit.dig.saveface.model.Album.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fromProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,photosProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,privacyProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,countProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Album.Album.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		location = null;
		comments = null;
		id = null;
		from = null;
		updatedTime = null;
		link = null;
		createdTime = null;
		photos = null;
		privacy = null;
		description = null;
		name = null;
		count = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLocation() throws JastorException {
		location = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#location properties in Album model not a Literal", stmt.getObject());
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


	private void initComments() throws JastorException {
		this.comments = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, commentsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#comments properties in Album model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing comments = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.comments.add(comments);
			}
		}
	}

	public java.util.Iterator getComments() throws JastorException {
		if (comments == null)
			initComments();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(comments,_resource,commentsProperty,true);
	}

	public void addComments(com.ibm.adtech.jastor.Thing comments) throws JastorException {
		if (this.comments == null)
			initComments();
		if (this.comments.contains(comments)) {
			this.comments.remove(comments);
			this.comments.add(comments);
			return;
		}
		this.comments.add(comments);
		_model.add(_model.createStatement(_resource,commentsProperty,comments.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addComments() throws JastorException {
		com.ibm.adtech.jastor.Thing comments = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.comments == null)
			initComments();
		this.comments.add(comments);
		_model.add(_model.createStatement(_resource,commentsProperty,comments.resource()));
		return comments;
	}
	
	public com.ibm.adtech.jastor.Thing addComments(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing comments = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.comments == null)
			initComments();
		if (this.comments.contains(comments))
			return comments;
		this.comments.add(comments);
		_model.add(_model.createStatement(_resource,commentsProperty,comments.resource()));
		return comments;
	}
	
	public void removeComments(com.ibm.adtech.jastor.Thing comments) throws JastorException {
		if (this.comments == null)
			initComments();
		if (!this.comments.contains(comments))
			return;
		if (!_model.contains(_resource, commentsProperty, comments.resource()))
			return;
		this.comments.remove(comments);
		_model.removeAll(_resource, commentsProperty, comments.resource());
	}
		 

	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#id properties in Album model not a Literal", stmt.getObject());
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


	private void initFrom() throws JastorException {
		this.from = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, fromProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#from properties in Album model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing from = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.from.add(from);
			}
		}
	}

	public java.util.Iterator getFrom() throws JastorException {
		if (from == null)
			initFrom();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(from,_resource,fromProperty,true);
	}

	public void addFrom(com.ibm.adtech.jastor.Thing from) throws JastorException {
		if (this.from == null)
			initFrom();
		if (this.from.contains(from)) {
			this.from.remove(from);
			this.from.add(from);
			return;
		}
		this.from.add(from);
		_model.add(_model.createStatement(_resource,fromProperty,from.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addFrom() throws JastorException {
		com.ibm.adtech.jastor.Thing from = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.from == null)
			initFrom();
		this.from.add(from);
		_model.add(_model.createStatement(_resource,fromProperty,from.resource()));
		return from;
	}
	
	public com.ibm.adtech.jastor.Thing addFrom(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing from = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.from == null)
			initFrom();
		if (this.from.contains(from))
			return from;
		this.from.add(from);
		_model.add(_model.createStatement(_resource,fromProperty,from.resource()));
		return from;
	}
	
	public void removeFrom(com.ibm.adtech.jastor.Thing from) throws JastorException {
		if (this.from == null)
			initFrom();
		if (!this.from.contains(from))
			return;
		if (!_model.contains(_resource, fromProperty, from.resource()))
			return;
		this.from.remove(from);
		_model.removeAll(_resource, fromProperty, from.resource());
	}
		 

	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#updatedTime properties in Album model not a Literal", stmt.getObject());
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


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#link properties in Album model not a Literal", stmt.getObject());
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


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#createdTime properties in Album model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				createdTime.add(obj);
		}
	}

	public java.util.Iterator getCreatedTime() throws JastorException {
		if (createdTime == null)
			initCreatedTime();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(createdTime,_resource,createdTimeProperty,false);
	}

	public void addCreatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime createdTime) throws JastorException {
		if (this.createdTime == null)
			initCreatedTime();
		if (this.createdTime.contains(createdTime))
			return;
		if (_model.contains(_resource, createdTimeProperty, createLiteral(createdTime)))
			return;
		this.createdTime.add(createdTime);
		_model.add(_resource, createdTimeProperty, createLiteral(createdTime));
	}
	
	public void removeCreatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime createdTime) throws JastorException {
		if (this.createdTime == null)
			initCreatedTime();
		if (!this.createdTime.contains(createdTime))
			return;
		if (!_model.contains(_resource, createdTimeProperty, createLiteral(createdTime)))
			return;
		this.createdTime.remove(createdTime);
		_model.removeAll(_resource, createdTimeProperty, createLiteral(createdTime));
	}


	private void initPhotos() throws JastorException {
		this.photos = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, photosProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#photos properties in Album model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.photos.add(photos);
			}
		}
	}

	public java.util.Iterator getPhotos() throws JastorException {
		if (photos == null)
			initPhotos();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(photos,_resource,photosProperty,true);
	}

	public void addPhotos(com.ibm.adtech.jastor.Thing photos) throws JastorException {
		if (this.photos == null)
			initPhotos();
		if (this.photos.contains(photos)) {
			this.photos.remove(photos);
			this.photos.add(photos);
			return;
		}
		this.photos.add(photos);
		_model.add(_model.createStatement(_resource,photosProperty,photos.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPhotos() throws JastorException {
		com.ibm.adtech.jastor.Thing photos = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.photos == null)
			initPhotos();
		this.photos.add(photos);
		_model.add(_model.createStatement(_resource,photosProperty,photos.resource()));
		return photos;
	}
	
	public com.ibm.adtech.jastor.Thing addPhotos(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.photos == null)
			initPhotos();
		if (this.photos.contains(photos))
			return photos;
		this.photos.add(photos);
		_model.add(_model.createStatement(_resource,photosProperty,photos.resource()));
		return photos;
	}
	
	public void removePhotos(com.ibm.adtech.jastor.Thing photos) throws JastorException {
		if (this.photos == null)
			initPhotos();
		if (!this.photos.contains(photos))
			return;
		if (!_model.contains(_resource, photosProperty, photos.resource()))
			return;
		this.photos.remove(photos);
		_model.removeAll(_resource, photosProperty, photos.resource());
	}
		 

	private void initPrivacy() throws JastorException {
		privacy = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, privacyProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#privacy properties in Album model not a Literal", stmt.getObject());
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


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#description properties in Album model not a Literal", stmt.getObject());
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


	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#name properties in Album model not a Literal", stmt.getObject());
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


	private void initCount() throws JastorException {
		count = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, countProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Album.owl#count properties in Album model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
			if (obj != null)
				count.add(obj);
		}
	}

	public java.util.Iterator getCount() throws JastorException {
		if (count == null)
			initCount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(count,_resource,countProperty,false);
	}

	public void addCount(java.lang.Long count) throws JastorException {
		if (this.count == null)
			initCount();
		if (this.count.contains(count))
			return;
		if (_model.contains(_resource, countProperty, createLiteral(count)))
			return;
		this.count.add(count);
		_model.add(_resource, countProperty, createLiteral(count));
	}
	
	public void removeCount(java.lang.Long count) throws JastorException {
		if (this.count == null)
			initCount();
		if (!this.count.contains(count))
			return;
		if (!_model.contains(_resource, countProperty, createLiteral(count)))
			return;
		this.count.remove(count);
		_model.removeAll(_resource, countProperty, createLiteral(count));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof AlbumListener))
			throw new IllegalArgumentException("ThingListener must be instance of AlbumListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((AlbumListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof AlbumListener))
			throw new IllegalArgumentException("ThingListener must be instance of AlbumListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.locationAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _comments = null;
					try {
						_comments = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (comments == null) {
						try {
							initComments();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!comments.contains(_comments))
						comments.add(_comments);
					if (listeners != null) {
						java.util.ArrayList consumersForComments;
						synchronized (listeners) {
							consumersForComments = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForComments.iterator();iter.hasNext();){
							AlbumListener listener=(AlbumListener)iter.next();
							listener.commentsAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,_comments);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(fromProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _from = null;
					try {
						_from = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (from == null) {
						try {
							initFrom();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!from.contains(_from))
						from.add(_from);
					if (listeners != null) {
						java.util.ArrayList consumersForFrom;
						synchronized (listeners) {
							consumersForFrom = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFrom.iterator();iter.hasNext();){
							AlbumListener listener=(AlbumListener)iter.next();
							listener.fromAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,_from);
						}
					}
				}
				return;
			}
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(createdTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (createdTime == null) {
					try {
						initCreatedTime();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !createdTime.contains(obj))
					createdTime.add(obj);
				java.util.ArrayList consumersForCreatedTime;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCreatedTime = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCreatedTime.iterator();iter.hasNext();){
						AlbumListener listener=(AlbumListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _photos = null;
					try {
						_photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (photos == null) {
						try {
							initPhotos();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!photos.contains(_photos))
						photos.add(_photos);
					if (listeners != null) {
						java.util.ArrayList consumersForPhotos;
						synchronized (listeners) {
							consumersForPhotos = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhotos.iterator();iter.hasNext();){
							AlbumListener listener=(AlbumListener)iter.next();
							listener.photosAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,_photos);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.privacyAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(countProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (count == null) {
					try {
						initCount();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !count.contains(obj))
					count.add(obj);
				java.util.ArrayList consumersForCount;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCount = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCount.iterator();iter.hasNext();){
						AlbumListener listener=(AlbumListener)iter.next();
						listener.countAdded(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.Long)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.locationRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _comments = null;
					if (comments != null) {
						boolean found = false;
						for (int i=0;i<comments.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) comments.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_comments = __item;
								break;
							}
						}
						if (found)
							comments.remove(_comments);
						else {
							try {
								_comments = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_comments = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForComments;
						synchronized (listeners) {
							consumersForComments = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForComments.iterator();iter.hasNext();){
							AlbumListener listener=(AlbumListener)iter.next();
							listener.commentsRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,_comments);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(fromProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _from = null;
					if (from != null) {
						boolean found = false;
						for (int i=0;i<from.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) from.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_from = __item;
								break;
							}
						}
						if (found)
							from.remove(_from);
						else {
							try {
								_from = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_from = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForFrom;
						synchronized (listeners) {
							consumersForFrom = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFrom.iterator();iter.hasNext();){
							AlbumListener listener=(AlbumListener)iter.next();
							listener.fromRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,_from);
						}
					}
				}
				return;
			}
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(createdTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (createdTime != null) {
					if (createdTime.contains(obj))
						createdTime.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AlbumListener listener=(AlbumListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _photos = null;
					if (photos != null) {
						boolean found = false;
						for (int i=0;i<photos.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) photos.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_photos = __item;
								break;
							}
						}
						if (found)
							photos.remove(_photos);
						else {
							try {
								_photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPhotos;
						synchronized (listeners) {
							consumersForPhotos = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhotos.iterator();iter.hasNext();){
							AlbumListener listener=(AlbumListener)iter.next();
							listener.photosRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,_photos);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.privacyRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
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
						AlbumListener listener=(AlbumListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(countProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (count != null) {
					if (count.contains(obj))
						count.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AlbumListener listener=(AlbumListener)iter.next();
						listener.countRemoved(edu.mit.dig.saveface.model.Album.AlbumImpl.this,(java.lang.Long)obj);
					}
				}
				return;
			}
		}

	//}
	


}