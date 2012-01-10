

package edu.mit.dig.saveflickr.model.Photo;

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
 * Implementation of {@link edu.mit.dig.saveflickr.model.Photo.Photo}
 * Use the edu.mit.dig.saveflickr.model.Photo.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#Photo)</p>
 * <br>
 */
public class PhotoImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveflickr.model.Photo.Photo {
	

	private static com.hp.hpl.jena.rdf.model.Property lastUpdatedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#lastUpdated");
	private java.util.ArrayList lastUpdated;
	private static com.hp.hpl.jena.rdf.model.Property commentsCountProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#commentsCount");
	private java.util.ArrayList commentsCount;
	private static com.hp.hpl.jena.rdf.model.Property farmProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#farm");
	private java.util.ArrayList farm;
	private static com.hp.hpl.jena.rdf.model.Property tagsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#tags");
	private java.util.ArrayList tags;
	private static com.hp.hpl.jena.rdf.model.Property dateTakenProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateTaken");
	private java.util.ArrayList dateTaken;
	private static com.hp.hpl.jena.rdf.model.Property addCommentProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addComment");
	private java.util.ArrayList addComment;
	private static com.hp.hpl.jena.rdf.model.Property originalformatProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalformat");
	private java.util.ArrayList originalformat;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property permissionsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#permissions");
	private java.util.ArrayList permissions;
	private static com.hp.hpl.jena.rdf.model.Property notesProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#notes");
	private java.util.ArrayList notes;
	private static com.hp.hpl.jena.rdf.model.Property geoDataProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#geoData");
	private java.util.ArrayList geoData;
	private static com.hp.hpl.jena.rdf.model.Property serverProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#server");
	private java.util.ArrayList server;
	private static com.hp.hpl.jena.rdf.model.Property datePostedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#datePosted");
	private java.util.ArrayList datePosted;
	private static com.hp.hpl.jena.rdf.model.Property licenseProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#license");
	private java.util.ArrayList license;
	private static com.hp.hpl.jena.rdf.model.Property secretProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#secret");
	private java.util.ArrayList secret;
	private static com.hp.hpl.jena.rdf.model.Property addMetaProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addMeta");
	private java.util.ArrayList addMeta;
	private static com.hp.hpl.jena.rdf.model.Property urlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#url");
	private java.util.ArrayList url;
	private static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#owner");
	private java.util.ArrayList owner;
	private static com.hp.hpl.jena.rdf.model.Property dateAddedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateAdded");
	private java.util.ArrayList dateAdded;
	private static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#title");
	private java.util.ArrayList title;
	private static com.hp.hpl.jena.rdf.model.Property originalsecretProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalsecret");
	private java.util.ArrayList originalsecret;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property commentsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#comments");
	private java.util.ArrayList comments;
 

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
    	edu.mit.dig.saveflickr.model.Photo.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,lastUpdatedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentsCountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,farmProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,tagsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dateTakenProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,addCommentProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,originalformatProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,permissionsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,notesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,geoDataProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,serverProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,datePostedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,licenseProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,secretProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,addMetaProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,urlProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,ownerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dateAddedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,titleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,originalsecretProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveflickr.model.Photo.Photo.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		lastUpdated = null;
		commentsCount = null;
		farm = null;
		tags = null;
		dateTaken = null;
		addComment = null;
		originalformat = null;
		description = null;
		permissions = null;
		notes = null;
		geoData = null;
		server = null;
		datePosted = null;
		license = null;
		secret = null;
		addMeta = null;
		url = null;
		owner = null;
		dateAdded = null;
		title = null;
		originalsecret = null;
		id = null;
		comments = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLastUpdated() throws JastorException {
		lastUpdated = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, lastUpdatedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#lastUpdated properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				lastUpdated.add(obj);
		}
	}

	public java.util.Iterator getLastUpdated() throws JastorException {
		if (lastUpdated == null)
			initLastUpdated();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(lastUpdated,_resource,lastUpdatedProperty,false);
	}

	public void addLastUpdated(com.hp.hpl.jena.datatypes.xsd.XSDDateTime lastUpdated) throws JastorException {
		if (this.lastUpdated == null)
			initLastUpdated();
		if (this.lastUpdated.contains(lastUpdated))
			return;
		if (_model.contains(_resource, lastUpdatedProperty, createLiteral(lastUpdated)))
			return;
		this.lastUpdated.add(lastUpdated);
		_model.add(_resource, lastUpdatedProperty, createLiteral(lastUpdated));
	}
	
	public void removeLastUpdated(com.hp.hpl.jena.datatypes.xsd.XSDDateTime lastUpdated) throws JastorException {
		if (this.lastUpdated == null)
			initLastUpdated();
		if (!this.lastUpdated.contains(lastUpdated))
			return;
		if (!_model.contains(_resource, lastUpdatedProperty, createLiteral(lastUpdated)))
			return;
		this.lastUpdated.remove(lastUpdated);
		_model.removeAll(_resource, lastUpdatedProperty, createLiteral(lastUpdated));
	}


	private void initCommentsCount() throws JastorException {
		commentsCount = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, commentsCountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#commentsCount properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				commentsCount.add(obj);
		}
	}

	public java.util.Iterator getCommentsCount() throws JastorException {
		if (commentsCount == null)
			initCommentsCount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(commentsCount,_resource,commentsCountProperty,false);
	}

	public void addCommentsCount(java.lang.Integer commentsCount) throws JastorException {
		if (this.commentsCount == null)
			initCommentsCount();
		if (this.commentsCount.contains(commentsCount))
			return;
		if (_model.contains(_resource, commentsCountProperty, createLiteral(commentsCount)))
			return;
		this.commentsCount.add(commentsCount);
		_model.add(_resource, commentsCountProperty, createLiteral(commentsCount));
	}
	
	public void removeCommentsCount(java.lang.Integer commentsCount) throws JastorException {
		if (this.commentsCount == null)
			initCommentsCount();
		if (!this.commentsCount.contains(commentsCount))
			return;
		if (!_model.contains(_resource, commentsCountProperty, createLiteral(commentsCount)))
			return;
		this.commentsCount.remove(commentsCount);
		_model.removeAll(_resource, commentsCountProperty, createLiteral(commentsCount));
	}


	private void initFarm() throws JastorException {
		farm = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, farmProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#farm properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				farm.add(obj);
		}
	}

	public java.util.Iterator getFarm() throws JastorException {
		if (farm == null)
			initFarm();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(farm,_resource,farmProperty,false);
	}

	public void addFarm(java.lang.String farm) throws JastorException {
		if (this.farm == null)
			initFarm();
		if (this.farm.contains(farm))
			return;
		if (_model.contains(_resource, farmProperty, createLiteral(farm)))
			return;
		this.farm.add(farm);
		_model.add(_resource, farmProperty, createLiteral(farm));
	}
	
	public void removeFarm(java.lang.String farm) throws JastorException {
		if (this.farm == null)
			initFarm();
		if (!this.farm.contains(farm))
			return;
		if (!_model.contains(_resource, farmProperty, createLiteral(farm)))
			return;
		this.farm.remove(farm);
		_model.removeAll(_resource, farmProperty, createLiteral(farm));
	}


	private void initTags() throws JastorException {
		this.tags = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, tagsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#tags properties in Photo model not a Resource", stmt.getObject());
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
		 

	private void initDateTaken() throws JastorException {
		dateTaken = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dateTakenProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateTaken properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dateTaken.add(obj);
		}
	}

	public java.util.Iterator getDateTaken() throws JastorException {
		if (dateTaken == null)
			initDateTaken();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(dateTaken,_resource,dateTakenProperty,false);
	}

	public void addDateTaken(java.lang.String dateTaken) throws JastorException {
		if (this.dateTaken == null)
			initDateTaken();
		if (this.dateTaken.contains(dateTaken))
			return;
		if (_model.contains(_resource, dateTakenProperty, createLiteral(dateTaken)))
			return;
		this.dateTaken.add(dateTaken);
		_model.add(_resource, dateTakenProperty, createLiteral(dateTaken));
	}
	
	public void removeDateTaken(java.lang.String dateTaken) throws JastorException {
		if (this.dateTaken == null)
			initDateTaken();
		if (!this.dateTaken.contains(dateTaken))
			return;
		if (!_model.contains(_resource, dateTakenProperty, createLiteral(dateTaken)))
			return;
		this.dateTaken.remove(dateTaken);
		_model.removeAll(_resource, dateTakenProperty, createLiteral(dateTaken));
	}


	private void initAddComment() throws JastorException {
		addComment = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, addCommentProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addComment properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
			if (obj != null)
				addComment.add(obj);
		}
	}

	public java.util.Iterator getAddComment() throws JastorException {
		if (addComment == null)
			initAddComment();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(addComment,_resource,addCommentProperty,false);
	}

	public void addAddComment(java.lang.Boolean addComment) throws JastorException {
		if (this.addComment == null)
			initAddComment();
		if (this.addComment.contains(addComment))
			return;
		if (_model.contains(_resource, addCommentProperty, createLiteral(addComment)))
			return;
		this.addComment.add(addComment);
		_model.add(_resource, addCommentProperty, createLiteral(addComment));
	}
	
	public void removeAddComment(java.lang.Boolean addComment) throws JastorException {
		if (this.addComment == null)
			initAddComment();
		if (!this.addComment.contains(addComment))
			return;
		if (!_model.contains(_resource, addCommentProperty, createLiteral(addComment)))
			return;
		this.addComment.remove(addComment);
		_model.removeAll(_resource, addCommentProperty, createLiteral(addComment));
	}


	private void initOriginalformat() throws JastorException {
		originalformat = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, originalformatProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalformat properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				originalformat.add(obj);
		}
	}

	public java.util.Iterator getOriginalformat() throws JastorException {
		if (originalformat == null)
			initOriginalformat();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(originalformat,_resource,originalformatProperty,false);
	}

	public void addOriginalformat(java.lang.String originalformat) throws JastorException {
		if (this.originalformat == null)
			initOriginalformat();
		if (this.originalformat.contains(originalformat))
			return;
		if (_model.contains(_resource, originalformatProperty, createLiteral(originalformat)))
			return;
		this.originalformat.add(originalformat);
		_model.add(_resource, originalformatProperty, createLiteral(originalformat));
	}
	
	public void removeOriginalformat(java.lang.String originalformat) throws JastorException {
		if (this.originalformat == null)
			initOriginalformat();
		if (!this.originalformat.contains(originalformat))
			return;
		if (!_model.contains(_resource, originalformatProperty, createLiteral(originalformat)))
			return;
		this.originalformat.remove(originalformat);
		_model.removeAll(_resource, originalformatProperty, createLiteral(originalformat));
	}


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#description properties in Photo model not a Literal", stmt.getObject());
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


	private void initPermissions() throws JastorException {
		this.permissions = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, permissionsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#permissions properties in Photo model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing permissions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.permissions.add(permissions);
			}
		}
	}

	public java.util.Iterator getPermissions() throws JastorException {
		if (permissions == null)
			initPermissions();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(permissions,_resource,permissionsProperty,true);
	}

	public void addPermissions(com.ibm.adtech.jastor.Thing permissions) throws JastorException {
		if (this.permissions == null)
			initPermissions();
		if (this.permissions.contains(permissions)) {
			this.permissions.remove(permissions);
			this.permissions.add(permissions);
			return;
		}
		this.permissions.add(permissions);
		_model.add(_model.createStatement(_resource,permissionsProperty,permissions.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPermissions() throws JastorException {
		com.ibm.adtech.jastor.Thing permissions = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.permissions == null)
			initPermissions();
		this.permissions.add(permissions);
		_model.add(_model.createStatement(_resource,permissionsProperty,permissions.resource()));
		return permissions;
	}
	
	public com.ibm.adtech.jastor.Thing addPermissions(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing permissions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.permissions == null)
			initPermissions();
		if (this.permissions.contains(permissions))
			return permissions;
		this.permissions.add(permissions);
		_model.add(_model.createStatement(_resource,permissionsProperty,permissions.resource()));
		return permissions;
	}
	
	public void removePermissions(com.ibm.adtech.jastor.Thing permissions) throws JastorException {
		if (this.permissions == null)
			initPermissions();
		if (!this.permissions.contains(permissions))
			return;
		if (!_model.contains(_resource, permissionsProperty, permissions.resource()))
			return;
		this.permissions.remove(permissions);
		_model.removeAll(_resource, permissionsProperty, permissions.resource());
	}
		 

	private void initNotes() throws JastorException {
		this.notes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, notesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#notes properties in Photo model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.notes.add(notes);
			}
		}
	}

	public java.util.Iterator getNotes() throws JastorException {
		if (notes == null)
			initNotes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(notes,_resource,notesProperty,true);
	}

	public void addNotes(com.ibm.adtech.jastor.Thing notes) throws JastorException {
		if (this.notes == null)
			initNotes();
		if (this.notes.contains(notes)) {
			this.notes.remove(notes);
			this.notes.add(notes);
			return;
		}
		this.notes.add(notes);
		_model.add(_model.createStatement(_resource,notesProperty,notes.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addNotes() throws JastorException {
		com.ibm.adtech.jastor.Thing notes = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.notes == null)
			initNotes();
		this.notes.add(notes);
		_model.add(_model.createStatement(_resource,notesProperty,notes.resource()));
		return notes;
	}
	
	public com.ibm.adtech.jastor.Thing addNotes(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.notes == null)
			initNotes();
		if (this.notes.contains(notes))
			return notes;
		this.notes.add(notes);
		_model.add(_model.createStatement(_resource,notesProperty,notes.resource()));
		return notes;
	}
	
	public void removeNotes(com.ibm.adtech.jastor.Thing notes) throws JastorException {
		if (this.notes == null)
			initNotes();
		if (!this.notes.contains(notes))
			return;
		if (!_model.contains(_resource, notesProperty, notes.resource()))
			return;
		this.notes.remove(notes);
		_model.removeAll(_resource, notesProperty, notes.resource());
	}
		 

	private void initGeoData() throws JastorException {
		this.geoData = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, geoDataProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#geoData properties in Photo model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing geoData = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.geoData.add(geoData);
			}
		}
	}

	public java.util.Iterator getGeoData() throws JastorException {
		if (geoData == null)
			initGeoData();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(geoData,_resource,geoDataProperty,true);
	}

	public void addGeoData(com.ibm.adtech.jastor.Thing geoData) throws JastorException {
		if (this.geoData == null)
			initGeoData();
		if (this.geoData.contains(geoData)) {
			this.geoData.remove(geoData);
			this.geoData.add(geoData);
			return;
		}
		this.geoData.add(geoData);
		_model.add(_model.createStatement(_resource,geoDataProperty,geoData.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addGeoData() throws JastorException {
		com.ibm.adtech.jastor.Thing geoData = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.geoData == null)
			initGeoData();
		this.geoData.add(geoData);
		_model.add(_model.createStatement(_resource,geoDataProperty,geoData.resource()));
		return geoData;
	}
	
	public com.ibm.adtech.jastor.Thing addGeoData(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing geoData = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.geoData == null)
			initGeoData();
		if (this.geoData.contains(geoData))
			return geoData;
		this.geoData.add(geoData);
		_model.add(_model.createStatement(_resource,geoDataProperty,geoData.resource()));
		return geoData;
	}
	
	public void removeGeoData(com.ibm.adtech.jastor.Thing geoData) throws JastorException {
		if (this.geoData == null)
			initGeoData();
		if (!this.geoData.contains(geoData))
			return;
		if (!_model.contains(_resource, geoDataProperty, geoData.resource()))
			return;
		this.geoData.remove(geoData);
		_model.removeAll(_resource, geoDataProperty, geoData.resource());
	}
		 

	private void initServer() throws JastorException {
		server = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, serverProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#server properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				server.add(obj);
		}
	}

	public java.util.Iterator getServer() throws JastorException {
		if (server == null)
			initServer();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(server,_resource,serverProperty,false);
	}

	public void addServer(java.lang.String server) throws JastorException {
		if (this.server == null)
			initServer();
		if (this.server.contains(server))
			return;
		if (_model.contains(_resource, serverProperty, createLiteral(server)))
			return;
		this.server.add(server);
		_model.add(_resource, serverProperty, createLiteral(server));
	}
	
	public void removeServer(java.lang.String server) throws JastorException {
		if (this.server == null)
			initServer();
		if (!this.server.contains(server))
			return;
		if (!_model.contains(_resource, serverProperty, createLiteral(server)))
			return;
		this.server.remove(server);
		_model.removeAll(_resource, serverProperty, createLiteral(server));
	}


	private void initDatePosted() throws JastorException {
		datePosted = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, datePostedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#datePosted properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				datePosted.add(obj);
		}
	}

	public java.util.Iterator getDatePosted() throws JastorException {
		if (datePosted == null)
			initDatePosted();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(datePosted,_resource,datePostedProperty,false);
	}

	public void addDatePosted(java.lang.String datePosted) throws JastorException {
		if (this.datePosted == null)
			initDatePosted();
		if (this.datePosted.contains(datePosted))
			return;
		if (_model.contains(_resource, datePostedProperty, createLiteral(datePosted)))
			return;
		this.datePosted.add(datePosted);
		_model.add(_resource, datePostedProperty, createLiteral(datePosted));
	}
	
	public void removeDatePosted(java.lang.String datePosted) throws JastorException {
		if (this.datePosted == null)
			initDatePosted();
		if (!this.datePosted.contains(datePosted))
			return;
		if (!_model.contains(_resource, datePostedProperty, createLiteral(datePosted)))
			return;
		this.datePosted.remove(datePosted);
		_model.removeAll(_resource, datePostedProperty, createLiteral(datePosted));
	}


	private void initLicense() throws JastorException {
		this.license = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, licenseProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#license properties in Photo model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing license = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.license.add(license);
			}
		}
	}

	public java.util.Iterator getLicense() throws JastorException {
		if (license == null)
			initLicense();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(license,_resource,licenseProperty,true);
	}

	public void addLicense(com.ibm.adtech.jastor.Thing license) throws JastorException {
		if (this.license == null)
			initLicense();
		if (this.license.contains(license)) {
			this.license.remove(license);
			this.license.add(license);
			return;
		}
		this.license.add(license);
		_model.add(_model.createStatement(_resource,licenseProperty,license.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLicense() throws JastorException {
		com.ibm.adtech.jastor.Thing license = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.license == null)
			initLicense();
		this.license.add(license);
		_model.add(_model.createStatement(_resource,licenseProperty,license.resource()));
		return license;
	}
	
	public com.ibm.adtech.jastor.Thing addLicense(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing license = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.license == null)
			initLicense();
		if (this.license.contains(license))
			return license;
		this.license.add(license);
		_model.add(_model.createStatement(_resource,licenseProperty,license.resource()));
		return license;
	}
	
	public void removeLicense(com.ibm.adtech.jastor.Thing license) throws JastorException {
		if (this.license == null)
			initLicense();
		if (!this.license.contains(license))
			return;
		if (!_model.contains(_resource, licenseProperty, license.resource()))
			return;
		this.license.remove(license);
		_model.removeAll(_resource, licenseProperty, license.resource());
	}
		 

	private void initSecret() throws JastorException {
		secret = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, secretProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#secret properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				secret.add(obj);
		}
	}

	public java.util.Iterator getSecret() throws JastorException {
		if (secret == null)
			initSecret();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(secret,_resource,secretProperty,false);
	}

	public void addSecret(java.lang.String secret) throws JastorException {
		if (this.secret == null)
			initSecret();
		if (this.secret.contains(secret))
			return;
		if (_model.contains(_resource, secretProperty, createLiteral(secret)))
			return;
		this.secret.add(secret);
		_model.add(_resource, secretProperty, createLiteral(secret));
	}
	
	public void removeSecret(java.lang.String secret) throws JastorException {
		if (this.secret == null)
			initSecret();
		if (!this.secret.contains(secret))
			return;
		if (!_model.contains(_resource, secretProperty, createLiteral(secret)))
			return;
		this.secret.remove(secret);
		_model.removeAll(_resource, secretProperty, createLiteral(secret));
	}


	private void initAddMeta() throws JastorException {
		addMeta = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, addMetaProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#addMeta properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
			if (obj != null)
				addMeta.add(obj);
		}
	}

	public java.util.Iterator getAddMeta() throws JastorException {
		if (addMeta == null)
			initAddMeta();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(addMeta,_resource,addMetaProperty,false);
	}

	public void addAddMeta(java.lang.Boolean addMeta) throws JastorException {
		if (this.addMeta == null)
			initAddMeta();
		if (this.addMeta.contains(addMeta))
			return;
		if (_model.contains(_resource, addMetaProperty, createLiteral(addMeta)))
			return;
		this.addMeta.add(addMeta);
		_model.add(_resource, addMetaProperty, createLiteral(addMeta));
	}
	
	public void removeAddMeta(java.lang.Boolean addMeta) throws JastorException {
		if (this.addMeta == null)
			initAddMeta();
		if (!this.addMeta.contains(addMeta))
			return;
		if (!_model.contains(_resource, addMetaProperty, createLiteral(addMeta)))
			return;
		this.addMeta.remove(addMeta);
		_model.removeAll(_resource, addMetaProperty, createLiteral(addMeta));
	}


	private void initUrl() throws JastorException {
		url = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, urlProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#url properties in Photo model not a Literal", stmt.getObject());
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


	private void initOwner() throws JastorException {
		this.owner = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, ownerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#owner properties in Photo model not a Resource", stmt.getObject());
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
		 

	private void initDateAdded() throws JastorException {
		dateAdded = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dateAddedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#dateAdded properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dateAdded.add(obj);
		}
	}

	public java.util.Iterator getDateAdded() throws JastorException {
		if (dateAdded == null)
			initDateAdded();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(dateAdded,_resource,dateAddedProperty,false);
	}

	public void addDateAdded(java.lang.String dateAdded) throws JastorException {
		if (this.dateAdded == null)
			initDateAdded();
		if (this.dateAdded.contains(dateAdded))
			return;
		if (_model.contains(_resource, dateAddedProperty, createLiteral(dateAdded)))
			return;
		this.dateAdded.add(dateAdded);
		_model.add(_resource, dateAddedProperty, createLiteral(dateAdded));
	}
	
	public void removeDateAdded(java.lang.String dateAdded) throws JastorException {
		if (this.dateAdded == null)
			initDateAdded();
		if (!this.dateAdded.contains(dateAdded))
			return;
		if (!_model.contains(_resource, dateAddedProperty, createLiteral(dateAdded)))
			return;
		this.dateAdded.remove(dateAdded);
		_model.removeAll(_resource, dateAddedProperty, createLiteral(dateAdded));
	}


	private void initTitle() throws JastorException {
		title = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, titleProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#title properties in Photo model not a Literal", stmt.getObject());
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


	private void initOriginalsecret() throws JastorException {
		originalsecret = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, originalsecretProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#originalsecret properties in Photo model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				originalsecret.add(obj);
		}
	}

	public java.util.Iterator getOriginalsecret() throws JastorException {
		if (originalsecret == null)
			initOriginalsecret();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(originalsecret,_resource,originalsecretProperty,false);
	}

	public void addOriginalsecret(java.lang.String originalsecret) throws JastorException {
		if (this.originalsecret == null)
			initOriginalsecret();
		if (this.originalsecret.contains(originalsecret))
			return;
		if (_model.contains(_resource, originalsecretProperty, createLiteral(originalsecret)))
			return;
		this.originalsecret.add(originalsecret);
		_model.add(_resource, originalsecretProperty, createLiteral(originalsecret));
	}
	
	public void removeOriginalsecret(java.lang.String originalsecret) throws JastorException {
		if (this.originalsecret == null)
			initOriginalsecret();
		if (!this.originalsecret.contains(originalsecret))
			return;
		if (!_model.contains(_resource, originalsecretProperty, createLiteral(originalsecret)))
			return;
		this.originalsecret.remove(originalsecret);
		_model.removeAll(_resource, originalsecretProperty, createLiteral(originalsecret));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#id properties in Photo model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Photo.owl#comments properties in Photo model not a Resource", stmt.getObject());
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

			if (stmt.getPredicate().equals(lastUpdatedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (lastUpdated == null) {
					try {
						initLastUpdated();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !lastUpdated.contains(obj))
					lastUpdated.add(obj);
				java.util.ArrayList consumersForLastUpdated;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLastUpdated = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLastUpdated.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.lastUpdatedAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentsCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.commentsCountAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(farmProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (farm == null) {
					try {
						initFarm();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !farm.contains(obj))
					farm.add(obj);
				java.util.ArrayList consumersForFarm;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFarm = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFarm.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.farmAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							listener.tagsAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_tags);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dateTakenProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dateTaken == null) {
					try {
						initDateTaken();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dateTaken.contains(obj))
					dateTaken.add(obj);
				java.util.ArrayList consumersForDateTaken;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDateTaken = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDateTaken.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.dateTakenAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(addCommentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (addComment == null) {
					try {
						initAddComment();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !addComment.contains(obj))
					addComment.add(obj);
				java.util.ArrayList consumersForAddComment;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForAddComment = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAddComment.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.addCommentAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(originalformatProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (originalformat == null) {
					try {
						initOriginalformat();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !originalformat.contains(obj))
					originalformat.add(obj);
				java.util.ArrayList consumersForOriginalformat;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForOriginalformat = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForOriginalformat.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.originalformatAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(permissionsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _permissions = null;
					try {
						_permissions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (permissions == null) {
						try {
							initPermissions();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!permissions.contains(_permissions))
						permissions.add(_permissions);
					if (listeners != null) {
						java.util.ArrayList consumersForPermissions;
						synchronized (listeners) {
							consumersForPermissions = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPermissions.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.permissionsAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_permissions);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(notesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _notes = null;
					try {
						_notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (notes == null) {
						try {
							initNotes();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!notes.contains(_notes))
						notes.add(_notes);
					if (listeners != null) {
						java.util.ArrayList consumersForNotes;
						synchronized (listeners) {
							consumersForNotes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForNotes.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.notesAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_notes);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(geoDataProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _geoData = null;
					try {
						_geoData = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (geoData == null) {
						try {
							initGeoData();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!geoData.contains(_geoData))
						geoData.add(_geoData);
					if (listeners != null) {
						java.util.ArrayList consumersForGeoData;
						synchronized (listeners) {
							consumersForGeoData = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeoData.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.geoDataAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_geoData);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(serverProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (server == null) {
					try {
						initServer();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !server.contains(obj))
					server.add(obj);
				java.util.ArrayList consumersForServer;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForServer = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForServer.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.serverAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(datePostedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (datePosted == null) {
					try {
						initDatePosted();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !datePosted.contains(obj))
					datePosted.add(obj);
				java.util.ArrayList consumersForDatePosted;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDatePosted = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDatePosted.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.datePostedAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(licenseProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _license = null;
					try {
						_license = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (license == null) {
						try {
							initLicense();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!license.contains(_license))
						license.add(_license);
					if (listeners != null) {
						java.util.ArrayList consumersForLicense;
						synchronized (listeners) {
							consumersForLicense = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLicense.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.licenseAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_license);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(secretProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (secret == null) {
					try {
						initSecret();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !secret.contains(obj))
					secret.add(obj);
				java.util.ArrayList consumersForSecret;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForSecret = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSecret.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.secretAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(addMetaProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (addMeta == null) {
					try {
						initAddMeta();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !addMeta.contains(obj))
					addMeta.add(obj);
				java.util.ArrayList consumersForAddMeta;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForAddMeta = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAddMeta.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.addMetaAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.Boolean)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.urlAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							PhotoListener listener=(PhotoListener)iter.next();
							listener.ownerAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dateAddedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dateAdded == null) {
					try {
						initDateAdded();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dateAdded.contains(obj))
					dateAdded.add(obj);
				java.util.ArrayList consumersForDateAdded;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDateAdded = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDateAdded.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.dateAddedAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.titleAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(originalsecretProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (originalsecret == null) {
					try {
						initOriginalsecret();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !originalsecret.contains(obj))
					originalsecret.add(obj);
				java.util.ArrayList consumersForOriginalsecret;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForOriginalsecret = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForOriginalsecret.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.originalsecretAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						listener.idAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							listener.commentsAdded(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_comments);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(lastUpdatedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (lastUpdated != null) {
					if (lastUpdated.contains(obj))
						lastUpdated.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.lastUpdatedRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentsCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.commentsCountRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(farmProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (farm != null) {
					if (farm.contains(obj))
						farm.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.farmRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							listener.tagsRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_tags);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dateTakenProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dateTaken != null) {
					if (dateTaken.contains(obj))
						dateTaken.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.dateTakenRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(addCommentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (addComment != null) {
					if (addComment.contains(obj))
						addComment.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.addCommentRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(originalformatProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (originalformat != null) {
					if (originalformat.contains(obj))
						originalformat.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.originalformatRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(permissionsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _permissions = null;
					if (permissions != null) {
						boolean found = false;
						for (int i=0;i<permissions.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) permissions.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_permissions = __item;
								break;
							}
						}
						if (found)
							permissions.remove(_permissions);
						else {
							try {
								_permissions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_permissions = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPermissions;
						synchronized (listeners) {
							consumersForPermissions = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPermissions.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.permissionsRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_permissions);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(notesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _notes = null;
					if (notes != null) {
						boolean found = false;
						for (int i=0;i<notes.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) notes.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_notes = __item;
								break;
							}
						}
						if (found)
							notes.remove(_notes);
						else {
							try {
								_notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForNotes;
						synchronized (listeners) {
							consumersForNotes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForNotes.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.notesRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_notes);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(geoDataProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _geoData = null;
					if (geoData != null) {
						boolean found = false;
						for (int i=0;i<geoData.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) geoData.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_geoData = __item;
								break;
							}
						}
						if (found)
							geoData.remove(_geoData);
						else {
							try {
								_geoData = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_geoData = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeoData;
						synchronized (listeners) {
							consumersForGeoData = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeoData.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.geoDataRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_geoData);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(serverProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (server != null) {
					if (server.contains(obj))
						server.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.serverRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(datePostedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (datePosted != null) {
					if (datePosted.contains(obj))
						datePosted.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.datePostedRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(licenseProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _license = null;
					if (license != null) {
						boolean found = false;
						for (int i=0;i<license.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) license.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_license = __item;
								break;
							}
						}
						if (found)
							license.remove(_license);
						else {
							try {
								_license = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_license = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLicense;
						synchronized (listeners) {
							consumersForLicense = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLicense.iterator();iter.hasNext();){
							PhotoListener listener=(PhotoListener)iter.next();
							listener.licenseRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_license);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(secretProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (secret != null) {
					if (secret.contains(obj))
						secret.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.secretRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(addMetaProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (addMeta != null) {
					if (addMeta.contains(obj))
						addMeta.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.addMetaRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.Boolean)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.urlRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							PhotoListener listener=(PhotoListener)iter.next();
							listener.ownerRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dateAddedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dateAdded != null) {
					if (dateAdded.contains(obj))
						dateAdded.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.dateAddedRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						PhotoListener listener=(PhotoListener)iter.next();
						listener.titleRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(originalsecretProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (originalsecret != null) {
					if (originalsecret.contains(obj))
						originalsecret.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PhotoListener listener=(PhotoListener)iter.next();
						listener.originalsecretRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
						listener.idRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,(java.lang.String)obj);
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
							listener.commentsRemoved(edu.mit.dig.saveflickr.model.Photo.PhotoImpl.this,_comments);
						}
					}
				}
				return;
			}
		}

	//}
	


}