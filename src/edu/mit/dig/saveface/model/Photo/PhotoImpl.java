

package edu.mit.dig.saveface.model.Photo;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Photo.Photo}
 * Use the edu.mit.dig.saveface.model.Photo.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Photo.owl#Photo)</p>
 * <br>
 */
public class PhotoImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Photo.Photo {
	

	private static com.hp.hpl.jena.rdf.model.Property likeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#like");
	private java.util.ArrayList like;
	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property tagsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#tags");
	private java.util.ArrayList tags;
	private static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#picture");
	private java.util.ArrayList picture;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#comments");
	private java.util.ArrayList comments;
	private static com.hp.hpl.jena.rdf.model.Property heightProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#height");
	private java.util.ArrayList height;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#from");
	private java.util.ArrayList from;
	private static com.hp.hpl.jena.rdf.model.Property widthProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#width");
	private java.util.ArrayList width;
	private static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#icon");
	private java.util.ArrayList icon;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property sourceProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Photo.owl#source");
	private java.util.ArrayList source;
 

	PhotoImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PhotoImpl getPhoto(Resource resource, Model model) throws JastorException {
		return new PhotoImpl(resource, model);
	}
	    
	static PhotoImpl createPhoto(Resource resource, Model model) throws JastorException { 
		PhotoImpl impl = new PhotoImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Photo.TYPE)))
			impl._model.add(impl._resource, RDF.type, Photo.TYPE);
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
    	edu.mit.dig.saveface.model.Photo.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,likeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,tagsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,pictureProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,heightProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fromProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,widthProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,iconProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,sourceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Photo.Photo.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		like = null;
		updatedTime = null;
		tags = null;
		picture = null;
		id = null;
		comments = null;
		height = null;
		name = null;
		createdTime = null;
		from = null;
		width = null;
		icon = null;
		link = null;
		source = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLike() throws JastorException {
		this.like = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, likeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#like properties in Photo model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing like = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.like.add(like);
			}
		}
	}

	public java.util.Iterator getLike() throws JastorException {
		if (like == null)
			initLike();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(like,_resource,likeProperty,true);
	}

	public void addLike(com.ibm.adtech.jastor.Thing like) throws JastorException {
		if (this.like == null)
			initLike();
		if (this.like.contains(like)) {
			this.like.remove(like);
			this.like.add(like);
			return;
		}
		this.like.add(like);
		_model.add(_model.createStatement(_resource,likeProperty,like.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLike() throws JastorException {
		com.ibm.adtech.jastor.Thing like = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.like == null)
			initLike();
		this.like.add(like);
		_model.add(_model.createStatement(_resource,likeProperty,like.resource()));
		return like;
	}
	
	public com.ibm.adtech.jastor.Thing addLike(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing like = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.like == null)
			initLike();
		if (this.like.contains(like))
			return like;
		this.like.add(like);
		_model.add(_model.createStatement(_resource,likeProperty,like.resource()));
		return like;
	}
	
	public void removeLike(com.ibm.adtech.jastor.Thing like) throws JastorException {
		if (this.like == null)
			initLike();
		if (!this.like.contains(like))
			return;
		if (!_model.contains(_resource, likeProperty, like.resource()))
			return;
		this.like.remove(like);
		_model.removeAll(_resource, likeProperty, like.resource());
	}
		 

	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#updatedTime properties in Photo model not a Literal", stmt.getObject());
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


	private void initTags() throws JastorException {
		this.tags = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, tagsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#tags properties in Photo model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing tags = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.tags.add(tags);
			}
		}
	}

	public java.util.Iterator getTags() throws JastorException {
		if (tags == null)
			initTags();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(tags,_resource,tagsProperty,true);
	}

	public void addTags(com.ibm.adtech.jastor.Thing tags) throws JastorException {
		if (this.tags == null)
			initTags();
		if (this.tags.contains(tags)) {
			this.tags.remove(tags);
			this.tags.add(tags);
			return;
		}
		this.tags.add(tags);
		_model.add(_model.createStatement(_resource,tagsProperty,tags.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addTags() throws JastorException {
		com.ibm.adtech.jastor.Thing tags = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.tags == null)
			initTags();
		this.tags.add(tags);
		_model.add(_model.createStatement(_resource,tagsProperty,tags.resource()));
		return tags;
	}
	
	public com.ibm.adtech.jastor.Thing addTags(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing tags = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.tags == null)
			initTags();
		if (this.tags.contains(tags))
			return tags;
		this.tags.add(tags);
		_model.add(_model.createStatement(_resource,tagsProperty,tags.resource()));
		return tags;
	}
	
	public void removeTags(com.ibm.adtech.jastor.Thing tags) throws JastorException {
		if (this.tags == null)
			initTags();
		if (!this.tags.contains(tags))
			return;
		if (!_model.contains(_resource, tagsProperty, tags.resource()))
			return;
		this.tags.remove(tags);
		_model.removeAll(_resource, tagsProperty, tags.resource());
	}
		 

	private void initPicture() throws JastorException {
		picture = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, pictureProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#picture properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				picture.add(obj);
		}
	}

	public java.util.Iterator getPicture() throws JastorException {
		if (picture == null)
			initPicture();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(picture,_resource,pictureProperty,false);
	}

	public void addPicture(java.lang.String picture) throws JastorException {
		if (this.picture == null)
			initPicture();
		if (this.picture.contains(picture))
			return;
		if (_model.contains(_resource, pictureProperty, createLiteral(picture)))
			return;
		this.picture.add(picture);
		_model.add(_resource, pictureProperty, createLiteral(picture));
	}
	
	public void removePicture(java.lang.String picture) throws JastorException {
		if (this.picture == null)
			initPicture();
		if (!this.picture.contains(picture))
			return;
		if (!_model.contains(_resource, pictureProperty, createLiteral(picture)))
			return;
		this.picture.remove(picture);
		_model.removeAll(_resource, pictureProperty, createLiteral(picture));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#id properties in Photo model not a Literal", stmt.getObject());
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


	private void initComments() throws JastorException {
		this.comments = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, commentsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#comments properties in Photo model not a Resource", stmt.getObject());
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
		 

	private void initHeight() throws JastorException {
		height = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, heightProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#height properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				height.add(obj);
		}
	}

	public java.util.Iterator getHeight() throws JastorException {
		if (height == null)
			initHeight();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(height,_resource,heightProperty,false);
	}

	public void addHeight(java.lang.Integer height) throws JastorException {
		if (this.height == null)
			initHeight();
		if (this.height.contains(height))
			return;
		if (_model.contains(_resource, heightProperty, createLiteral(height)))
			return;
		this.height.add(height);
		_model.add(_resource, heightProperty, createLiteral(height));
	}
	
	public void removeHeight(java.lang.Integer height) throws JastorException {
		if (this.height == null)
			initHeight();
		if (!this.height.contains(height))
			return;
		if (!_model.contains(_resource, heightProperty, createLiteral(height)))
			return;
		this.height.remove(height);
		_model.removeAll(_resource, heightProperty, createLiteral(height));
	}


	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#name properties in Photo model not a Literal", stmt.getObject());
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


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#createdTime properties in Photo model not a Literal", stmt.getObject());
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


	private void initFrom() throws JastorException {
		this.from = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, fromProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#from properties in Photo model not a Resource", stmt.getObject());
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
		 

	private void initWidth() throws JastorException {
		width = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, widthProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#width properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				width.add(obj);
		}
	}

	public java.util.Iterator getWidth() throws JastorException {
		if (width == null)
			initWidth();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(width,_resource,widthProperty,false);
	}

	public void addWidth(java.lang.Integer width) throws JastorException {
		if (this.width == null)
			initWidth();
		if (this.width.contains(width))
			return;
		if (_model.contains(_resource, widthProperty, createLiteral(width)))
			return;
		this.width.add(width);
		_model.add(_resource, widthProperty, createLiteral(width));
	}
	
	public void removeWidth(java.lang.Integer width) throws JastorException {
		if (this.width == null)
			initWidth();
		if (!this.width.contains(width))
			return;
		if (!_model.contains(_resource, widthProperty, createLiteral(width)))
			return;
		this.width.remove(width);
		_model.removeAll(_resource, widthProperty, createLiteral(width));
	}


	private void initIcon() throws JastorException {
		icon = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, iconProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#icon properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				icon.add(obj);
		}
	}

	public java.util.Iterator getIcon() throws JastorException {
		if (icon == null)
			initIcon();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(icon,_resource,iconProperty,false);
	}

	public void addIcon(java.lang.String icon) throws JastorException {
		if (this.icon == null)
			initIcon();
		if (this.icon.contains(icon))
			return;
		if (_model.contains(_resource, iconProperty, createLiteral(icon)))
			return;
		this.icon.add(icon);
		_model.add(_resource, iconProperty, createLiteral(icon));
	}
	
	public void removeIcon(java.lang.String icon) throws JastorException {
		if (this.icon == null)
			initIcon();
		if (!this.icon.contains(icon))
			return;
		if (!_model.contains(_resource, iconProperty, createLiteral(icon)))
			return;
		this.icon.remove(icon);
		_model.removeAll(_resource, iconProperty, createLiteral(icon));
	}


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#link properties in Photo model not a Literal", stmt.getObject());
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


	private void initSource() throws JastorException {
		source = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, sourceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Photo.owl#source properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				source.add(obj);
		}
	}

	public java.util.Iterator getSource() throws JastorException {
		if (source == null)
			initSource();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(source,_resource,sourceProperty,false);
	}

	public void addSource(java.lang.String source) throws JastorException {
		if (this.source == null)
			initSource();
		if (this.source.contains(source))
			return;
		if (_model.contains(_resource, sourceProperty, createLiteral(source)))
			return;
		this.source.add(source);
		_model.add(_resource, sourceProperty, createLiteral(source));
	}
	
	public void removeSource(java.lang.String source) throws JastorException {
		if (this.source == null)
			initSource();
		if (!this.source.contains(source))
			return;
		if (!_model.contains(_resource, sourceProperty, createLiteral(source)))
			return;
		this.source.remove(source);
		_model.removeAll(_resource, sourceProperty, createLiteral(source));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PhotoListener))
			throw new IllegalArgumentException("ThingListener must be instance of PhotoListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PhotoListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PhotoListener))
			throw new IllegalArgumentException("ThingListener must be instance of PhotoListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(likeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _like = null;
					try {
						_like = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (like == null) {
						try {
							initLike();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!like.contains(_like))
						like.add(_like);
					if (listeners != null) {
						java.util.ArrayList consumersForLike;
						synchronized (listeners) {
							consumersForLike = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLike.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.likeAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_like);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(tagsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _tags = null;
					try {
						_tags = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (tags == null) {
						try {
							initTags();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!tags.contains(_tags))
						tags.add(_tags);
					if (listeners != null) {
						java.util.ArrayList consumersForTags;
						synchronized (listeners) {
							consumersForTags = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTags.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.tagsAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_tags);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(pictureProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (picture == null) {
					try {
						initPicture();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !picture.contains(obj))
					picture.add(obj);
				java.util.ArrayList consumersForPicture;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPicture = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPicture.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.pictureAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							PhotoListener listener=(PhotoListener)iter.next();
							listener.commentsAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_comments);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(heightProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (height == null) {
					try {
						initHeight();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !height.contains(obj))
					height.add(obj);
				java.util.ArrayList consumersForHeight;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHeight = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHeight.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.heightAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.Integer)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
							PhotoListener listener=(PhotoListener)iter.next();
							listener.fromAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_from);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(widthProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (width == null) {
					try {
						initWidth();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !width.contains(obj))
					width.add(obj);
				java.util.ArrayList consumersForWidth;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForWidth = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForWidth.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.widthAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(iconProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (icon == null) {
					try {
						initIcon();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !icon.contains(obj))
					icon.add(obj);
				java.util.ArrayList consumersForIcon;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForIcon = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForIcon.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.iconAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(sourceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (source == null) {
					try {
						initSource();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !source.contains(obj))
					source.add(obj);
				java.util.ArrayList consumersForSource;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForSource = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSource.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.sourceAdded(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(likeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _like = null;
					if (like != null) {
						boolean found = false;
						for (int i=0;i<like.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) like.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_like = __item;
								break;
							}
						}
						if (found)
							like.remove(_like);
						else {
							try {
								_like = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_like = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLike;
						synchronized (listeners) {
							consumersForLike = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLike.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.likeRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_like);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(tagsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _tags = null;
					if (tags != null) {
						boolean found = false;
						for (int i=0;i<tags.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) tags.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_tags = __item;
								break;
							}
						}
						if (found)
							tags.remove(_tags);
						else {
							try {
								_tags = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_tags = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForTags;
						synchronized (listeners) {
							consumersForTags = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTags.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.tagsRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_tags);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(pictureProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (picture != null) {
					if (picture.contains(obj))
						picture.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.pictureRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							PhotoListener listener=(PhotoListener)iter.next();
							listener.commentsRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_comments);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(heightProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (height != null) {
					if (height.contains(obj))
						height.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.heightRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.Integer)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
							PhotoListener listener=(PhotoListener)iter.next();
							listener.fromRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,_from);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(widthProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (width != null) {
					if (width.contains(obj))
						width.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.widthRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(iconProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (icon != null) {
					if (icon.contains(obj))
						icon.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.iconRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(sourceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (source != null) {
					if (source.contains(obj))
						source.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.sourceRemoved(edu.mit.dig.saveface.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}