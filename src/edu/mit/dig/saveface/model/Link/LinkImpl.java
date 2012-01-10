

package edu.mit.dig.saveface.model.Link;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Link.Link}
 * Use the edu.mit.dig.saveface.model.Link.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Link.owl#Link)</p>
 * <br>
 */
public class LinkImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Link.Link {
	

	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property iconProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#icon");
	private java.util.ArrayList icon;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property messageProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#message");
	private java.util.ArrayList message;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property fromProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#from");
	private java.util.ArrayList from;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#picture");
	private java.util.ArrayList picture;
	private static com.hp.hpl.jena.rdf.model.Property commentProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#comment");
	private java.util.ArrayList comment;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property captionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Link.owl#caption");
	private java.util.ArrayList caption;
 

	LinkImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static LinkImpl getLink(Resource resource, Model model) throws JastorException {
		return new LinkImpl(resource, model);
	}
	    
	static LinkImpl createLink(Resource resource, Model model) throws JastorException { 
		LinkImpl impl = new LinkImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Link.TYPE)))
			impl._model.add(impl._resource, RDF.type, Link.TYPE);
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
    	edu.mit.dig.saveface.model.Link.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,iconProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,messageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fromProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,pictureProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,captionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Link.Link.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		link = null;
		icon = null;
		createdTime = null;
		message = null;
		description = null;
		from = null;
		name = null;
		picture = null;
		comment = null;
		id = null;
		caption = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#link properties in Link model not a Literal", stmt.getObject());
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


	private void initIcon() throws JastorException {
		icon = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, iconProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#icon properties in Link model not a Literal", stmt.getObject());
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


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#createdTime properties in Link model not a Literal", stmt.getObject());
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


	private void initMessage() throws JastorException {
		message = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, messageProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#message properties in Link model not a Literal", stmt.getObject());
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


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#description properties in Link model not a Literal", stmt.getObject());
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


	private void initFrom() throws JastorException {
		this.from = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, fromProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#from properties in Link model not a Resource", stmt.getObject());
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
		 

	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#name properties in Link model not a Literal", stmt.getObject());
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


	private void initPicture() throws JastorException {
		picture = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, pictureProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#picture properties in Link model not a Literal", stmt.getObject());
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


	private void initComment() throws JastorException {
		this.comment = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, commentProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#comment properties in Link model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#id properties in Link model not a Literal", stmt.getObject());
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


	private void initCaption() throws JastorException {
		caption = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, captionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Link.owl#caption properties in Link model not a Literal", stmt.getObject());
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
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof LinkListener))
			throw new IllegalArgumentException("ThingListener must be instance of LinkListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((LinkListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof LinkListener))
			throw new IllegalArgumentException("ThingListener must be instance of LinkListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

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
						LinkListener listener=(LinkListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.iconAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.messageAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
							LinkListener listener=(LinkListener)iter.next();
							listener.fromAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,_from);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.pictureAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
							LinkListener listener=(LinkListener)iter.next();
							listener.commentAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,_comment);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.captionAdded(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
						LinkListener listener=(LinkListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.iconRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.messageRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
							LinkListener listener=(LinkListener)iter.next();
							listener.fromRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,_from);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.pictureRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
							LinkListener listener=(LinkListener)iter.next();
							listener.commentRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,_comment);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
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
						LinkListener listener=(LinkListener)iter.next();
						listener.captionRemoved(edu.mit.dig.saveface.model.Link.LinkImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}