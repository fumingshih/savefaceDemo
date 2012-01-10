

package edu.mit.dig.saveface.model.Note;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Note.Note}
 * Use the edu.mit.dig.saveface.model.Note.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Note.owl#Note)</p>
 * <br>
 */
public class NoteImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Note.Note {
	

	private static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#message");
	private java.util.ArrayList message;
	private static com.hp.hpl.jena.rdf.model.Property commentProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#comment");
	private java.util.ArrayList comment;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property subjectProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#subject");
	private java.util.ArrayList subject;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property likesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#likes");
	private java.util.ArrayList likes;
	private static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#icon");
	private java.util.ArrayList icon;
	private static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Note.owl#from");
	private java.util.ArrayList from;
 

	NoteImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static NoteImpl getNote(Resource resource, Model model) throws JastorException {
		return new NoteImpl(resource, model);
	}
	    
	static NoteImpl createNote(Resource resource, Model model) throws JastorException { 
		NoteImpl impl = new NoteImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Note.TYPE)))
			impl._model.add(impl._resource, RDF.type, Note.TYPE);
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
    	edu.mit.dig.saveface.model.Note.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,messageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,subjectProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,likesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,iconProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fromProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Note.Note.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		message = null;
		comment = null;
		id = null;
		updatedTime = null;
		subject = null;
		createdTime = null;
		likes = null;
		icon = null;
		from = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initMessage() throws JastorException {
		message = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, messageProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#message properties in Note model not a Literal", stmt.getObject());
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


	private void initComment() throws JastorException {
		this.comment = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, commentProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#comment properties in Note model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing comment = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.comment.add(comment);
			}
		}
	}

	public java.util.Iterator getComment() throws JastorException {
		if (comment == null)
			initComment();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(comment,_resource,commentProperty,true);
	}

	public void addComment(com.ibm.adtech.jastor.Thing comment) throws JastorException {
		if (this.comment == null)
			initComment();
		if (this.comment.contains(comment)) {
			this.comment.remove(comment);
			this.comment.add(comment);
			return;
		}
		this.comment.add(comment);
		_model.add(_model.createStatement(_resource,commentProperty,comment.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addComment() throws JastorException {
		com.ibm.adtech.jastor.Thing comment = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.comment == null)
			initComment();
		this.comment.add(comment);
		_model.add(_model.createStatement(_resource,commentProperty,comment.resource()));
		return comment;
	}
	
	public com.ibm.adtech.jastor.Thing addComment(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing comment = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.comment == null)
			initComment();
		if (this.comment.contains(comment))
			return comment;
		this.comment.add(comment);
		_model.add(_model.createStatement(_resource,commentProperty,comment.resource()));
		return comment;
	}
	
	public void removeComment(com.ibm.adtech.jastor.Thing comment) throws JastorException {
		if (this.comment == null)
			initComment();
		if (!this.comment.contains(comment))
			return;
		if (!_model.contains(_resource, commentProperty, comment.resource()))
			return;
		this.comment.remove(comment);
		_model.removeAll(_resource, commentProperty, comment.resource());
	}
		 

	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#id properties in Note model not a Literal", stmt.getObject());
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


	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#updatedTime properties in Note model not a Literal", stmt.getObject());
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


	private void initSubject() throws JastorException {
		subject = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, subjectProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#subject properties in Note model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				subject.add(obj);
		}
	}

	public java.util.Iterator getSubject() throws JastorException {
		if (subject == null)
			initSubject();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(subject,_resource,subjectProperty,false);
	}

	public void addSubject(java.lang.String subject) throws JastorException {
		if (this.subject == null)
			initSubject();
		if (this.subject.contains(subject))
			return;
		if (_model.contains(_resource, subjectProperty, createLiteral(subject)))
			return;
		this.subject.add(subject);
		_model.add(_resource, subjectProperty, createLiteral(subject));
	}
	
	public void removeSubject(java.lang.String subject) throws JastorException {
		if (this.subject == null)
			initSubject();
		if (!this.subject.contains(subject))
			return;
		if (!_model.contains(_resource, subjectProperty, createLiteral(subject)))
			return;
		this.subject.remove(subject);
		_model.removeAll(_resource, subjectProperty, createLiteral(subject));
	}


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#createdTime properties in Note model not a Literal", stmt.getObject());
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


	private void initLikes() throws JastorException {
		this.likes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, likesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#likes properties in Note model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.likes.add(likes);
			}
		}
	}

	public java.util.Iterator getLikes() throws JastorException {
		if (likes == null)
			initLikes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(likes,_resource,likesProperty,true);
	}

	public void addLikes(com.ibm.adtech.jastor.Thing likes) throws JastorException {
		if (this.likes == null)
			initLikes();
		if (this.likes.contains(likes)) {
			this.likes.remove(likes);
			this.likes.add(likes);
			return;
		}
		this.likes.add(likes);
		_model.add(_model.createStatement(_resource,likesProperty,likes.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLikes() throws JastorException {
		com.ibm.adtech.jastor.Thing likes = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.likes == null)
			initLikes();
		this.likes.add(likes);
		_model.add(_model.createStatement(_resource,likesProperty,likes.resource()));
		return likes;
	}
	
	public com.ibm.adtech.jastor.Thing addLikes(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.likes == null)
			initLikes();
		if (this.likes.contains(likes))
			return likes;
		this.likes.add(likes);
		_model.add(_model.createStatement(_resource,likesProperty,likes.resource()));
		return likes;
	}
	
	public void removeLikes(com.ibm.adtech.jastor.Thing likes) throws JastorException {
		if (this.likes == null)
			initLikes();
		if (!this.likes.contains(likes))
			return;
		if (!_model.contains(_resource, likesProperty, likes.resource()))
			return;
		this.likes.remove(likes);
		_model.removeAll(_resource, likesProperty, likes.resource());
	}
		 

	private void initIcon() throws JastorException {
		icon = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, iconProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#icon properties in Note model not a Literal", stmt.getObject());
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


	private void initFrom() throws JastorException {
		this.from = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, fromProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Note.owl#from properties in Note model not a Resource", stmt.getObject());
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
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof NoteListener))
			throw new IllegalArgumentException("ThingListener must be instance of NoteListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((NoteListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof NoteListener))
			throw new IllegalArgumentException("ThingListener must be instance of NoteListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

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
						NoteListener listener=(NoteListener)iter.next();
						listener.messageAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _comment = null;
					try {
						_comment = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (comment == null) {
						try {
							initComment();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!comment.contains(_comment))
						comment.add(_comment);
					if (listeners != null) {
						java.util.ArrayList consumersForComment;
						synchronized (listeners) {
							consumersForComment = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForComment.iterator();iter.hasNext();){
							NoteListener listener=(NoteListener)iter.next();
							listener.commentAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,_comment);
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
						NoteListener listener=(NoteListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
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
						NoteListener listener=(NoteListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(subjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (subject == null) {
					try {
						initSubject();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !subject.contains(obj))
					subject.add(obj);
				java.util.ArrayList consumersForSubject;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForSubject = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSubject.iterator();iter.hasNext();){
						NoteListener listener=(NoteListener)iter.next();
						listener.subjectAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
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
						NoteListener listener=(NoteListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(likesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _likes = null;
					try {
						_likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (likes == null) {
						try {
							initLikes();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!likes.contains(_likes))
						likes.add(_likes);
					if (listeners != null) {
						java.util.ArrayList consumersForLikes;
						synchronized (listeners) {
							consumersForLikes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLikes.iterator();iter.hasNext();){
							NoteListener listener=(NoteListener)iter.next();
							listener.likesAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,_likes);
						}
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
						NoteListener listener=(NoteListener)iter.next();
						listener.iconAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
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
							NoteListener listener=(NoteListener)iter.next();
							listener.fromAdded(edu.mit.dig.saveface.model.Note.NoteImpl.this,_from);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
						NoteListener listener=(NoteListener)iter.next();
						listener.messageRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _comment = null;
					if (comment != null) {
						boolean found = false;
						for (int i=0;i<comment.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) comment.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_comment = __item;
								break;
							}
						}
						if (found)
							comment.remove(_comment);
						else {
							try {
								_comment = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_comment = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForComment;
						synchronized (listeners) {
							consumersForComment = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForComment.iterator();iter.hasNext();){
							NoteListener listener=(NoteListener)iter.next();
							listener.commentRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,_comment);
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
						NoteListener listener=(NoteListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
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
						NoteListener listener=(NoteListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(subjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (subject != null) {
					if (subject.contains(obj))
						subject.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						NoteListener listener=(NoteListener)iter.next();
						listener.subjectRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
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
						NoteListener listener=(NoteListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(likesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _likes = null;
					if (likes != null) {
						boolean found = false;
						for (int i=0;i<likes.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) likes.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_likes = __item;
								break;
							}
						}
						if (found)
							likes.remove(_likes);
						else {
							try {
								_likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLikes;
						synchronized (listeners) {
							consumersForLikes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLikes.iterator();iter.hasNext();){
							NoteListener listener=(NoteListener)iter.next();
							listener.likesRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,_likes);
						}
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
						NoteListener listener=(NoteListener)iter.next();
						listener.iconRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,(java.lang.String)obj);
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
							NoteListener listener=(NoteListener)iter.next();
							listener.fromRemoved(edu.mit.dig.saveface.model.Note.NoteImpl.this,_from);
						}
					}
				}
				return;
			}
		}

	//}
	


}