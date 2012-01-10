

package edu.mit.dig.saveflickr.model.PhotoSet;

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
 * Implementation of {@link edu.mit.dig.saveflickr.model.PhotoSet.Photoset}
 * Use the edu.mit.dig.saveflickr.model.PhotoSet.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#Photoset)</p>
 * <br>
 */
public class PhotosetImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveflickr.model.PhotoSet.Photoset {
	

	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property photosProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#photos");
	private java.util.ArrayList photos;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#owner");
	private java.util.ArrayList owner;
	private static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#title");
	private java.util.ArrayList title;
	private static com.hp.hpl.jena.rdf.model.Property urlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#url");
	private java.util.ArrayList url;
 

	PhotosetImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PhotosetImpl getPhotoset(Resource resource, Model model) throws JastorException {
		return new PhotosetImpl(resource, model);
	}
	    
	static PhotosetImpl createPhotoset(Resource resource, Model model) throws JastorException { 
		PhotosetImpl impl = new PhotosetImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Photoset.TYPE)))
			impl._model.add(impl._resource, RDF.type, Photoset.TYPE);
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
    	edu.mit.dig.saveflickr.model.PhotoSet.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,photosProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,ownerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,titleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,urlProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveflickr.model.PhotoSet.Photoset.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		description = null;
		photos = null;
		id = null;
		owner = null;
		title = null;
		url = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#description properties in Photoset model not a Literal", stmt.getObject());
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


	private void initPhotos() throws JastorException {
		this.photos = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, photosProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#photos properties in Photoset model not a Resource", stmt.getObject());
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
		 

	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#id properties in Photoset model not a Literal", stmt.getObject());
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


	private void initOwner() throws JastorException {
		this.owner = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, ownerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#owner properties in Photoset model not a Resource", stmt.getObject());
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
		 

	private void initTitle() throws JastorException {
		title = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, titleProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#title properties in Photoset model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				title.add(obj);
		}
	}

	public java.util.Iterator getTitle() throws JastorException {
		if (title == null)
			initTitle();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(title,_resource,titleProperty,false);
	}

	public void addTitle(java.lang.String title) throws JastorException {
		if (this.title == null)
			initTitle();
		if (this.title.contains(title))
			return;
		if (_model.contains(_resource, titleProperty, createLiteral(title)))
			return;
		this.title.add(title);
		_model.add(_resource, titleProperty, createLiteral(title));
	}
	
	public void removeTitle(java.lang.String title) throws JastorException {
		if (this.title == null)
			initTitle();
		if (!this.title.contains(title))
			return;
		if (!_model.contains(_resource, titleProperty, createLiteral(title)))
			return;
		this.title.remove(title);
		_model.removeAll(_resource, titleProperty, createLiteral(title));
	}


	private void initUrl() throws JastorException {
		url = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, urlProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photoset.owl#url properties in Photoset model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				url.add(obj);
		}
	}

	public java.util.Iterator getUrl() throws JastorException {
		if (url == null)
			initUrl();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(url,_resource,urlProperty,false);
	}

	public void addUrl(java.lang.String url) throws JastorException {
		if (this.url == null)
			initUrl();
		if (this.url.contains(url))
			return;
		if (_model.contains(_resource, urlProperty, createLiteral(url)))
			return;
		this.url.add(url);
		_model.add(_resource, urlProperty, createLiteral(url));
	}
	
	public void removeUrl(java.lang.String url) throws JastorException {
		if (this.url == null)
			initUrl();
		if (!this.url.contains(url))
			return;
		if (!_model.contains(_resource, urlProperty, createLiteral(url)))
			return;
		this.url.remove(url);
		_model.removeAll(_resource, urlProperty, createLiteral(url));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PhotosetListener))
			throw new IllegalArgumentException("ThingListener must be instance of PhotosetListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PhotosetListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PhotosetListener))
			throw new IllegalArgumentException("ThingListener must be instance of PhotosetListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

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
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
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
							PhotosetListener listener=(PhotosetListener)iter.next();
							listener.photosAdded(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,_photos);
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
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.idAdded(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
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
							PhotosetListener listener=(PhotosetListener)iter.next();
							listener.ownerAdded(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,_owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(titleProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (title == null) {
					try {
						initTitle();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !title.contains(obj))
					title.add(obj);
				java.util.ArrayList consumersForTitle;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForTitle = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForTitle.iterator();iter.hasNext();){
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.titleAdded(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(urlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (url == null) {
					try {
						initUrl();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !url.contains(obj))
					url.add(obj);
				java.util.ArrayList consumersForUrl;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForUrl = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForUrl.iterator();iter.hasNext();){
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.urlAdded(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
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
							PhotosetListener listener=(PhotosetListener)iter.next();
							listener.photosRemoved(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,_photos);
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
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
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
							PhotosetListener listener=(PhotosetListener)iter.next();
							listener.ownerRemoved(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,_owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(titleProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (title != null) {
					if (title.contains(obj))
						title.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.titleRemoved(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(urlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (url != null) {
					if (url.contains(obj))
						url.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotosetListener listener=(PhotosetListener)iter.next();
						listener.urlRemoved(edu.mit.dig.saveflickr.model.PhotoSet.PhotosetImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}