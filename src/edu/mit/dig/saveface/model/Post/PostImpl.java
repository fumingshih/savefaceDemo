

package edu.mit.dig.saveface.model.Post;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Post.Post}
 * Use the edu.mit.dig.saveface.model.Post.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Post.owl#Post)</p>
 * <br>
 */
public class PostImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Post.Post {
	

	private static com.hp.hpl.jena.rdf.model.Property likesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#likes");
	private java.util.ArrayList likes;
	private static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#from");
	private java.util.ArrayList from;
	private static com.hp.hpl.jena.rdf.model.Property commentsCountProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#commentsCount");
	private java.util.ArrayList commentsCount;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property toProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#to");
	private java.util.ArrayList to;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#icon");
	private java.util.ArrayList icon;
	private static com.hp.hpl.jena.rdf.model.Property typeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#type");
	private java.util.ArrayList type;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#message");
	private java.util.ArrayList message;
	private static com.hp.hpl.jena.rdf.model.Property actionsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#actions");
	private java.util.ArrayList actions;
	private static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#picture");
	private java.util.ArrayList picture;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property captionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#caption");
	private java.util.ArrayList caption;
	private static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#privacy");
	private java.util.ArrayList privacy;
	private static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#comments");
	private java.util.ArrayList comments;
	private static com.hp.hpl.jena.rdf.model.Property sourceProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#source");
	private java.util.ArrayList source;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property attributionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Post.owl#attribution");
	private java.util.ArrayList attribution;
 

	PostImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PostImpl getPost(Resource resource, Model model) throws JastorException {
		return new PostImpl(resource, model);
	}
	    
	static PostImpl createPost(Resource resource, Model model) throws JastorException { 
		PostImpl impl = new PostImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Post.TYPE)))
			impl._model.add(impl._resource, RDF.type, Post.TYPE);
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
    	edu.mit.dig.saveface.model.Post.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,likesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fromProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentsCountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,iconProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,typeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,messageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,actionsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,pictureProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,captionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,privacyProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,sourceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,attributionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Post.Post.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		likes = null;
		from = null;
		commentsCount = null;
		createdTime = null;
		to = null;
		name = null;
		updatedTime = null;
		icon = null;
		type = null;
		id = null;
		message = null;
		actions = null;
		picture = null;
		link = null;
		caption = null;
		privacy = null;
		comments = null;
		source = null;
		description = null;
		attribution = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLikes() throws JastorException {
		likes = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, likesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#likes properties in Post model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
			if (obj != null)
				likes.add(obj);
		}
	}

	public java.util.Iterator getLikes() throws JastorException {
		if (likes == null)
			initLikes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(likes,_resource,likesProperty,false);
	}

	public void addLikes(java.lang.Long likes) throws JastorException {
		if (this.likes == null)
			initLikes();
		if (this.likes.contains(likes))
			return;
		if (_model.contains(_resource, likesProperty, createLiteral(likes)))
			return;
		this.likes.add(likes);
		_model.add(_resource, likesProperty, createLiteral(likes));
	}
	
	public void removeLikes(java.lang.Long likes) throws JastorException {
		if (this.likes == null)
			initLikes();
		if (!this.likes.contains(likes))
			return;
		if (!_model.contains(_resource, likesProperty, createLiteral(likes)))
			return;
		this.likes.remove(likes);
		_model.removeAll(_resource, likesProperty, createLiteral(likes));
	}


	private void initFrom() throws JastorException {
		this.from = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, fromProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#from properties in Post model not a Resource", stmt.getObject());
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
		 

	private void initCommentsCount() throws JastorException {
		commentsCount = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, commentsCountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#commentsCount properties in Post model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
			if (obj != null)
				commentsCount.add(obj);
		}
	}

	public java.util.Iterator getCommentsCount() throws JastorException {
		if (commentsCount == null)
			initCommentsCount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(commentsCount,_resource,commentsCountProperty,false);
	}

	public void addCommentsCount(java.lang.Long commentsCount) throws JastorException {
		if (this.commentsCount == null)
			initCommentsCount();
		if (this.commentsCount.contains(commentsCount))
			return;
		if (_model.contains(_resource, commentsCountProperty, createLiteral(commentsCount)))
			return;
		this.commentsCount.add(commentsCount);
		_model.add(_resource, commentsCountProperty, createLiteral(commentsCount));
	}
	
	public void removeCommentsCount(java.lang.Long commentsCount) throws JastorException {
		if (this.commentsCount == null)
			initCommentsCount();
		if (!this.commentsCount.contains(commentsCount))
			return;
		if (!_model.contains(_resource, commentsCountProperty, createLiteral(commentsCount)))
			return;
		this.commentsCount.remove(commentsCount);
		_model.removeAll(_resource, commentsCountProperty, createLiteral(commentsCount));
	}


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#createdTime properties in Post model not a Literal", stmt.getObject());
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


	private void initTo() throws JastorException {
		this.to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#to properties in Post model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.to.add(to);
			}
		}
	}

	public java.util.Iterator getTo() throws JastorException {
		if (to == null)
			initTo();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(to,_resource,toProperty,true);
	}

	public void addTo(com.ibm.adtech.jastor.Thing to) throws JastorException {
		if (this.to == null)
			initTo();
		if (this.to.contains(to)) {
			this.to.remove(to);
			this.to.add(to);
			return;
		}
		this.to.add(to);
		_model.add(_model.createStatement(_resource,toProperty,to.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addTo() throws JastorException {
		com.ibm.adtech.jastor.Thing to = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.to == null)
			initTo();
		this.to.add(to);
		_model.add(_model.createStatement(_resource,toProperty,to.resource()));
		return to;
	}
	
	public com.ibm.adtech.jastor.Thing addTo(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.to == null)
			initTo();
		if (this.to.contains(to))
			return to;
		this.to.add(to);
		_model.add(_model.createStatement(_resource,toProperty,to.resource()));
		return to;
	}
	
	public void removeTo(com.ibm.adtech.jastor.Thing to) throws JastorException {
		if (this.to == null)
			initTo();
		if (!this.to.contains(to))
			return;
		if (!_model.contains(_resource, toProperty, to.resource()))
			return;
		this.to.remove(to);
		_model.removeAll(_resource, toProperty, to.resource());
	}
		 

	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#name properties in Post model not a Literal", stmt.getObject());
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


	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#updatedTime properties in Post model not a Literal", stmt.getObject());
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


	private void initIcon() throws JastorException {
		icon = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, iconProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#icon properties in Post model not a Literal", stmt.getObject());
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


	private void initType() throws JastorException {
		type = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, typeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#type properties in Post model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				type.add(obj);
		}
	}

	public java.util.Iterator getType() throws JastorException {
		if (type == null)
			initType();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(type,_resource,typeProperty,false);
	}

	public void addType(java.lang.String type) throws JastorException {
		if (this.type == null)
			initType();
		if (this.type.contains(type))
			return;
		if (_model.contains(_resource, typeProperty, createLiteral(type)))
			return;
		this.type.add(type);
		_model.add(_resource, typeProperty, createLiteral(type));
	}
	
	public void removeType(java.lang.String type) throws JastorException {
		if (this.type == null)
			initType();
		if (!this.type.contains(type))
			return;
		if (!_model.contains(_resource, typeProperty, createLiteral(type)))
			return;
		this.type.remove(type);
		_model.removeAll(_resource, typeProperty, createLiteral(type));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#id properties in Post model not a Literal", stmt.getObject());
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


	private void initMessage() throws JastorException {
		message = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, messageProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#message properties in Post model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				message.add(obj);
		}
	}

	public java.util.Iterator getMessage() throws JastorException {
		if (message == null)
			initMessage();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(message,_resource,messageProperty,false);
	}

	public void addMessage(java.lang.String message) throws JastorException {
		if (this.message == null)
			initMessage();
		if (this.message.contains(message))
			return;
		if (_model.contains(_resource, messageProperty, createLiteral(message)))
			return;
		this.message.add(message);
		_model.add(_resource, messageProperty, createLiteral(message));
	}
	
	public void removeMessage(java.lang.String message) throws JastorException {
		if (this.message == null)
			initMessage();
		if (!this.message.contains(message))
			return;
		if (!_model.contains(_resource, messageProperty, createLiteral(message)))
			return;
		this.message.remove(message);
		_model.removeAll(_resource, messageProperty, createLiteral(message));
	}


	private void initActions() throws JastorException {
		this.actions = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, actionsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#actions properties in Post model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing actions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.actions.add(actions);
			}
		}
	}

	public java.util.Iterator getActions() throws JastorException {
		if (actions == null)
			initActions();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(actions,_resource,actionsProperty,true);
	}

	public void addActions(com.ibm.adtech.jastor.Thing actions) throws JastorException {
		if (this.actions == null)
			initActions();
		if (this.actions.contains(actions)) {
			this.actions.remove(actions);
			this.actions.add(actions);
			return;
		}
		this.actions.add(actions);
		_model.add(_model.createStatement(_resource,actionsProperty,actions.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addActions() throws JastorException {
		com.ibm.adtech.jastor.Thing actions = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.actions == null)
			initActions();
		this.actions.add(actions);
		_model.add(_model.createStatement(_resource,actionsProperty,actions.resource()));
		return actions;
	}
	
	public com.ibm.adtech.jastor.Thing addActions(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing actions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.actions == null)
			initActions();
		if (this.actions.contains(actions))
			return actions;
		this.actions.add(actions);
		_model.add(_model.createStatement(_resource,actionsProperty,actions.resource()));
		return actions;
	}
	
	public void removeActions(com.ibm.adtech.jastor.Thing actions) throws JastorException {
		if (this.actions == null)
			initActions();
		if (!this.actions.contains(actions))
			return;
		if (!_model.contains(_resource, actionsProperty, actions.resource()))
			return;
		this.actions.remove(actions);
		_model.removeAll(_resource, actionsProperty, actions.resource());
	}
		 

	private void initPicture() throws JastorException {
		picture = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, pictureProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#picture properties in Post model not a Literal", stmt.getObject());
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


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#link properties in Post model not a Literal", stmt.getObject());
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


	private void initCaption() throws JastorException {
		caption = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, captionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#caption properties in Post model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				caption.add(obj);
		}
	}

	public java.util.Iterator getCaption() throws JastorException {
		if (caption == null)
			initCaption();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(caption,_resource,captionProperty,false);
	}

	public void addCaption(java.lang.String caption) throws JastorException {
		if (this.caption == null)
			initCaption();
		if (this.caption.contains(caption))
			return;
		if (_model.contains(_resource, captionProperty, createLiteral(caption)))
			return;
		this.caption.add(caption);
		_model.add(_resource, captionProperty, createLiteral(caption));
	}
	
	public void removeCaption(java.lang.String caption) throws JastorException {
		if (this.caption == null)
			initCaption();
		if (!this.caption.contains(caption))
			return;
		if (!_model.contains(_resource, captionProperty, createLiteral(caption)))
			return;
		this.caption.remove(caption);
		_model.removeAll(_resource, captionProperty, createLiteral(caption));
	}


	private void initPrivacy() throws JastorException {
		this.privacy = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, privacyProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#privacy properties in Post model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing privacy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.privacy.add(privacy);
			}
		}
	}

	public java.util.Iterator getPrivacy() throws JastorException {
		if (privacy == null)
			initPrivacy();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(privacy,_resource,privacyProperty,true);
	}

	public void addPrivacy(com.ibm.adtech.jastor.Thing privacy) throws JastorException {
		if (this.privacy == null)
			initPrivacy();
		if (this.privacy.contains(privacy)) {
			this.privacy.remove(privacy);
			this.privacy.add(privacy);
			return;
		}
		this.privacy.add(privacy);
		_model.add(_model.createStatement(_resource,privacyProperty,privacy.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPrivacy() throws JastorException {
		com.ibm.adtech.jastor.Thing privacy = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.privacy == null)
			initPrivacy();
		this.privacy.add(privacy);
		_model.add(_model.createStatement(_resource,privacyProperty,privacy.resource()));
		return privacy;
	}
	
	public com.ibm.adtech.jastor.Thing addPrivacy(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing privacy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.privacy == null)
			initPrivacy();
		if (this.privacy.contains(privacy))
			return privacy;
		this.privacy.add(privacy);
		_model.add(_model.createStatement(_resource,privacyProperty,privacy.resource()));
		return privacy;
	}
	
	public void removePrivacy(com.ibm.adtech.jastor.Thing privacy) throws JastorException {
		if (this.privacy == null)
			initPrivacy();
		if (!this.privacy.contains(privacy))
			return;
		if (!_model.contains(_resource, privacyProperty, privacy.resource()))
			return;
		this.privacy.remove(privacy);
		_model.removeAll(_resource, privacyProperty, privacy.resource());
	}
		 

	private void initComments() throws JastorException {
		this.comments = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, commentsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#comments properties in Post model not a Resource", stmt.getObject());
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
		 

	private void initSource() throws JastorException {
		source = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, sourceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#source properties in Post model not a Literal", stmt.getObject());
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


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#description properties in Post model not a Literal", stmt.getObject());
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


	private void initAttribution() throws JastorException {
		attribution = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, attributionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Post.owl#attribution properties in Post model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				attribution.add(obj);
		}
	}

	public java.util.Iterator getAttribution() throws JastorException {
		if (attribution == null)
			initAttribution();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(attribution,_resource,attributionProperty,false);
	}

	public void addAttribution(java.lang.String attribution) throws JastorException {
		if (this.attribution == null)
			initAttribution();
		if (this.attribution.contains(attribution))
			return;
		if (_model.contains(_resource, attributionProperty, createLiteral(attribution)))
			return;
		this.attribution.add(attribution);
		_model.add(_resource, attributionProperty, createLiteral(attribution));
	}
	
	public void removeAttribution(java.lang.String attribution) throws JastorException {
		if (this.attribution == null)
			initAttribution();
		if (!this.attribution.contains(attribution))
			return;
		if (!_model.contains(_resource, attributionProperty, createLiteral(attribution)))
			return;
		this.attribution.remove(attribution);
		_model.removeAll(_resource, attributionProperty, createLiteral(attribution));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PostListener))
			throw new IllegalArgumentException("ThingListener must be instance of PostListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PostListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PostListener))
			throw new IllegalArgumentException("ThingListener must be instance of PostListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(likesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (likes == null) {
					try {
						initLikes();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !likes.contains(obj))
					likes.add(obj);
				java.util.ArrayList consumersForLikes;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLikes = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLikes.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.likesAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.Long)obj);
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
							PostListener listener=(PostListener)iter.next();
							listener.fromAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,_from);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentsCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (commentsCount == null) {
					try {
						initCommentsCount();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !commentsCount.contains(obj))
					commentsCount.add(obj);
				java.util.ArrayList consumersForCommentsCount;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCommentsCount = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCommentsCount.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.commentsCountAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.Long)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _to = null;
					try {
						_to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (to == null) {
						try {
							initTo();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!to.contains(_to))
						to.add(_to);
					if (listeners != null) {
						java.util.ArrayList consumersForTo;
						synchronized (listeners) {
							consumersForTo = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTo.iterator();iter.hasNext();){
							PostListener listener=(PostListener)iter.next();
							listener.toAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,_to);
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
						PostListener listener=(PostListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.iconAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(typeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (type == null) {
					try {
						initType();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !type.contains(obj))
					type.add(obj);
				java.util.ArrayList consumersForType;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForType = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForType.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.typeAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(messageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (message == null) {
					try {
						initMessage();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !message.contains(obj))
					message.add(obj);
				java.util.ArrayList consumersForMessage;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForMessage = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMessage.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.messageAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(actionsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _actions = null;
					try {
						_actions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (actions == null) {
						try {
							initActions();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!actions.contains(_actions))
						actions.add(_actions);
					if (listeners != null) {
						java.util.ArrayList consumersForActions;
						synchronized (listeners) {
							consumersForActions = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForActions.iterator();iter.hasNext();){
							PostListener listener=(PostListener)iter.next();
							listener.actionsAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,_actions);
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
						PostListener listener=(PostListener)iter.next();
						listener.pictureAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(captionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (caption == null) {
					try {
						initCaption();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !caption.contains(obj))
					caption.add(obj);
				java.util.ArrayList consumersForCaption;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCaption = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCaption.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.captionAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(privacyProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _privacy = null;
					try {
						_privacy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (privacy == null) {
						try {
							initPrivacy();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!privacy.contains(_privacy))
						privacy.add(_privacy);
					if (listeners != null) {
						java.util.ArrayList consumersForPrivacy;
						synchronized (listeners) {
							consumersForPrivacy = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPrivacy.iterator();iter.hasNext();){
							PostListener listener=(PostListener)iter.next();
							listener.privacyAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,_privacy);
						}
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
							PostListener listener=(PostListener)iter.next();
							listener.commentsAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,_comments);
						}
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
						PostListener listener=(PostListener)iter.next();
						listener.sourceAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(attributionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (attribution == null) {
					try {
						initAttribution();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !attribution.contains(obj))
					attribution.add(obj);
				java.util.ArrayList consumersForAttribution;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForAttribution = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAttribution.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.attributionAdded(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(likesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (likes != null) {
					if (likes.contains(obj))
						likes.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.likesRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.Long)obj);
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
							PostListener listener=(PostListener)iter.next();
							listener.fromRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,_from);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentsCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (commentsCount != null) {
					if (commentsCount.contains(obj))
						commentsCount.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.commentsCountRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.Long)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _to = null;
					if (to != null) {
						boolean found = false;
						for (int i=0;i<to.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) to.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_to = __item;
								break;
							}
						}
						if (found)
							to.remove(_to);
						else {
							try {
								_to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForTo;
						synchronized (listeners) {
							consumersForTo = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTo.iterator();iter.hasNext();){
							PostListener listener=(PostListener)iter.next();
							listener.toRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,_to);
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
						PostListener listener=(PostListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.iconRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(typeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (type != null) {
					if (type.contains(obj))
						type.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.typeRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(messageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (message != null) {
					if (message.contains(obj))
						message.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.messageRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(actionsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _actions = null;
					if (actions != null) {
						boolean found = false;
						for (int i=0;i<actions.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) actions.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_actions = __item;
								break;
							}
						}
						if (found)
							actions.remove(_actions);
						else {
							try {
								_actions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_actions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForActions;
						synchronized (listeners) {
							consumersForActions = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForActions.iterator();iter.hasNext();){
							PostListener listener=(PostListener)iter.next();
							listener.actionsRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,_actions);
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
						PostListener listener=(PostListener)iter.next();
						listener.pictureRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(captionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (caption != null) {
					if (caption.contains(obj))
						caption.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.captionRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(privacyProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _privacy = null;
					if (privacy != null) {
						boolean found = false;
						for (int i=0;i<privacy.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) privacy.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_privacy = __item;
								break;
							}
						}
						if (found)
							privacy.remove(_privacy);
						else {
							try {
								_privacy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_privacy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPrivacy;
						synchronized (listeners) {
							consumersForPrivacy = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPrivacy.iterator();iter.hasNext();){
							PostListener listener=(PostListener)iter.next();
							listener.privacyRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,_privacy);
						}
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
							PostListener listener=(PostListener)iter.next();
							listener.commentsRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,_comments);
						}
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
						PostListener listener=(PostListener)iter.next();
						listener.sourceRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
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
						PostListener listener=(PostListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(attributionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (attribution != null) {
					if (attribution.contains(obj))
						attribution.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PostListener listener=(PostListener)iter.next();
						listener.attributionRemoved(edu.mit.dig.saveface.model.Post.PostImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}