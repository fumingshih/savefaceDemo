

package edu.mit.dig.saveface.model.Video;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Video.Video}
 * Use the edu.mit.dig.saveface.model.Video.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Video.owl#Video)</p>
 * <br>
 */
public class VideoImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Video.Video {
	

	private static com.hp.hpl.jena.rdf.model.Property tagsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#tags");
	private java.util.ArrayList tags;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#from");
	private java.util.ArrayList from;
	private static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#comments");
	private java.util.ArrayList comments;
	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property embedHtmlProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#embedHtml");
	private java.util.ArrayList embedHtml;
	private static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#picture");
	private java.util.ArrayList picture;
	private static com.hp.hpl.jena.rdf.model.Property lengthProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#length");
	private java.util.ArrayList length;
	private static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#message");
	private java.util.ArrayList message;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property sourceProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#source");
	private java.util.ArrayList source;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Video.owl#description");
	private java.util.ArrayList description;
 

	VideoImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static VideoImpl getVideo(Resource resource, Model model) throws JastorException {
		return new VideoImpl(resource, model);
	}
	    
	static VideoImpl createVideo(Resource resource, Model model) throws JastorException { 
		VideoImpl impl = new VideoImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Video.TYPE)))
			impl._model.add(impl._resource, RDF.type, Video.TYPE);
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
    	edu.mit.dig.saveface.model.Video.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,tagsProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,commentsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,embedHtmlProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,pictureProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lengthProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,messageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Video.Video.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		tags = null;
		createdTime = null;
		from = null;
		comments = null;
		updatedTime = null;
		embedHtml = null;
		picture = null;
		length = null;
		message = null;
		id = null;
		source = null;
		description = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initTags() throws JastorException {
		this.tags = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, tagsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#tags properties in Video model not a Resource", stmt.getObject());
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
		 

	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#createdTime properties in Video model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#from properties in Video model not a Resource", stmt.getObject());
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
		 

	private void initComments() throws JastorException {
		this.comments = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, commentsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#comments properties in Video model not a Resource", stmt.getObject());
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
		 

	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#updatedTime properties in Video model not a Literal", stmt.getObject());
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


	private void initEmbedHtml() throws JastorException {
		embedHtml = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, embedHtmlProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#embedHtml properties in Video model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				embedHtml.add(obj);
		}
	}

	public java.util.Iterator getEmbedHtml() throws JastorException {
		if (embedHtml == null)
			initEmbedHtml();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(embedHtml,_resource,embedHtmlProperty,false);
	}

	public void addEmbedHtml(java.lang.String embedHtml) throws JastorException {
		if (this.embedHtml == null)
			initEmbedHtml();
		if (this.embedHtml.contains(embedHtml))
			return;
		if (_model.contains(_resource, embedHtmlProperty, createLiteral(embedHtml)))
			return;
		this.embedHtml.add(embedHtml);
		_model.add(_resource, embedHtmlProperty, createLiteral(embedHtml));
	}
	
	public void removeEmbedHtml(java.lang.String embedHtml) throws JastorException {
		if (this.embedHtml == null)
			initEmbedHtml();
		if (!this.embedHtml.contains(embedHtml))
			return;
		if (!_model.contains(_resource, embedHtmlProperty, createLiteral(embedHtml)))
			return;
		this.embedHtml.remove(embedHtml);
		_model.removeAll(_resource, embedHtmlProperty, createLiteral(embedHtml));
	}


	private void initPicture() throws JastorException {
		picture = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, pictureProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#picture properties in Video model not a Literal", stmt.getObject());
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


	private void initLength() throws JastorException {
		length = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, lengthProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#length properties in Video model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				length.add(obj);
		}
	}

	public java.util.Iterator getLength() throws JastorException {
		if (length == null)
			initLength();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(length,_resource,lengthProperty,false);
	}

	public void addLength(java.lang.Integer length) throws JastorException {
		if (this.length == null)
			initLength();
		if (this.length.contains(length))
			return;
		if (_model.contains(_resource, lengthProperty, createLiteral(length)))
			return;
		this.length.add(length);
		_model.add(_resource, lengthProperty, createLiteral(length));
	}
	
	public void removeLength(java.lang.Integer length) throws JastorException {
		if (this.length == null)
			initLength();
		if (!this.length.contains(length))
			return;
		if (!_model.contains(_resource, lengthProperty, createLiteral(length)))
			return;
		this.length.remove(length);
		_model.removeAll(_resource, lengthProperty, createLiteral(length));
	}


	private void initMessage() throws JastorException {
		message = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, messageProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#message properties in Video model not a Literal", stmt.getObject());
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


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#id properties in Video model not a Literal", stmt.getObject());
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


	private void initSource() throws JastorException {
		source = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, sourceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#source properties in Video model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Video.owl#description properties in Video model not a Literal", stmt.getObject());
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
		if (!(listener instanceof VideoListener))
			throw new IllegalArgumentException("ThingListener must be instance of VideoListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((VideoListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof VideoListener))
			throw new IllegalArgumentException("ThingListener must be instance of VideoListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

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
							VideoListener listener=(VideoListener)iter.next();
							listener.tagsAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,_tags);
						}
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
						VideoListener listener=(VideoListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
							VideoListener listener=(VideoListener)iter.next();
							listener.fromAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,_from);
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
							VideoListener listener=(VideoListener)iter.next();
							listener.commentsAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,_comments);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(embedHtmlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (embedHtml == null) {
					try {
						initEmbedHtml();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !embedHtml.contains(obj))
					embedHtml.add(obj);
				java.util.ArrayList consumersForEmbedHtml;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForEmbedHtml = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForEmbedHtml.iterator();iter.hasNext();){
						VideoListener listener=(VideoListener)iter.next();
						listener.embedHtmlAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.pictureAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lengthProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (length == null) {
					try {
						initLength();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !length.contains(obj))
					length.add(obj);
				java.util.ArrayList consumersForLength;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLength = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLength.iterator();iter.hasNext();){
						VideoListener listener=(VideoListener)iter.next();
						listener.lengthAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.Integer)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.messageAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.sourceAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
							VideoListener listener=(VideoListener)iter.next();
							listener.tagsRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,_tags);
						}
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
						VideoListener listener=(VideoListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
							VideoListener listener=(VideoListener)iter.next();
							listener.fromRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,_from);
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
							VideoListener listener=(VideoListener)iter.next();
							listener.commentsRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,_comments);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(embedHtmlProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (embedHtml != null) {
					if (embedHtml.contains(obj))
						embedHtml.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VideoListener listener=(VideoListener)iter.next();
						listener.embedHtmlRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.pictureRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lengthProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (length != null) {
					if (length.contains(obj))
						length.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VideoListener listener=(VideoListener)iter.next();
						listener.lengthRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.Integer)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.messageRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.sourceRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
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
						VideoListener listener=(VideoListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Video.VideoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}