

package edu.mit.dig.saveflickr.model.Comment;

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
 * Implementation of {@link edu.mit.dig.saveflickr.model.Comment.Comment}
 * Use the edu.mit.dig.saveflickr.model.Comment.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#Comment)</p>
 * <br>
 */
public class CommentImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveflickr.model.Comment.Comment {
	

	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property authornameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#authorname");
	private java.util.ArrayList authorname;
	private static com.hp.hpl.jena.rdf.model.Property datecreateProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#datecreate");
	private java.util.ArrayList datecreate;
	private static com.hp.hpl.jena.rdf.model.Property authorProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#author");
	private java.util.ArrayList author;
	private static com.hp.hpl.jena.rdf.model.Property textProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#text");
	private java.util.ArrayList text;
	private static com.hp.hpl.jena.rdf.model.Property permalinkProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#permalink");
	private java.util.ArrayList permalink;
 

	CommentImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static CommentImpl getComment(Resource resource, Model model) throws JastorException {
		return new CommentImpl(resource, model);
	}
	    
	static CommentImpl createComment(Resource resource, Model model) throws JastorException { 
		CommentImpl impl = new CommentImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Comment.TYPE)))
			impl._model.add(impl._resource, RDF.type, Comment.TYPE);
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
    	edu.mit.dig.saveflickr.model.Comment.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,authornameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,datecreateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,authorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,textProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,permalinkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveflickr.model.Comment.Comment.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		id = null;
		authorname = null;
		datecreate = null;
		author = null;
		text = null;
		permalink = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#id properties in Comment model not a Literal", stmt.getObject());
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


	private void initAuthorname() throws JastorException {
		authorname = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, authornameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#authorname properties in Comment model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				authorname.add(obj);
		}
	}

	public java.util.Iterator getAuthorname() throws JastorException {
		if (authorname == null)
			initAuthorname();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(authorname,_resource,authornameProperty,false);
	}

	public void addAuthorname(java.lang.String authorname) throws JastorException {
		if (this.authorname == null)
			initAuthorname();
		if (this.authorname.contains(authorname))
			return;
		if (_model.contains(_resource, authornameProperty, createLiteral(authorname)))
			return;
		this.authorname.add(authorname);
		_model.add(_resource, authornameProperty, createLiteral(authorname));
	}
	
	public void removeAuthorname(java.lang.String authorname) throws JastorException {
		if (this.authorname == null)
			initAuthorname();
		if (!this.authorname.contains(authorname))
			return;
		if (!_model.contains(_resource, authornameProperty, createLiteral(authorname)))
			return;
		this.authorname.remove(authorname);
		_model.removeAll(_resource, authornameProperty, createLiteral(authorname));
	}


	private void initDatecreate() throws JastorException {
		datecreate = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, datecreateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#datecreate properties in Comment model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				datecreate.add(obj);
		}
	}

	public java.util.Iterator getDatecreate() throws JastorException {
		if (datecreate == null)
			initDatecreate();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(datecreate,_resource,datecreateProperty,false);
	}

	public void addDatecreate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime datecreate) throws JastorException {
		if (this.datecreate == null)
			initDatecreate();
		if (this.datecreate.contains(datecreate))
			return;
		if (_model.contains(_resource, datecreateProperty, createLiteral(datecreate)))
			return;
		this.datecreate.add(datecreate);
		_model.add(_resource, datecreateProperty, createLiteral(datecreate));
	}
	
	public void removeDatecreate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime datecreate) throws JastorException {
		if (this.datecreate == null)
			initDatecreate();
		if (!this.datecreate.contains(datecreate))
			return;
		if (!_model.contains(_resource, datecreateProperty, createLiteral(datecreate)))
			return;
		this.datecreate.remove(datecreate);
		_model.removeAll(_resource, datecreateProperty, createLiteral(datecreate));
	}


	private void initAuthor() throws JastorException {
		this.author = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, authorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#author properties in Comment model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing author = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.author.add(author);
			}
		}
	}

	public java.util.Iterator getAuthor() throws JastorException {
		if (author == null)
			initAuthor();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(author,_resource,authorProperty,true);
	}

	public void addAuthor(com.ibm.adtech.jastor.Thing author) throws JastorException {
		if (this.author == null)
			initAuthor();
		if (this.author.contains(author)) {
			this.author.remove(author);
			this.author.add(author);
			return;
		}
		this.author.add(author);
		_model.add(_model.createStatement(_resource,authorProperty,author.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addAuthor() throws JastorException {
		com.ibm.adtech.jastor.Thing author = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.author == null)
			initAuthor();
		this.author.add(author);
		_model.add(_model.createStatement(_resource,authorProperty,author.resource()));
		return author;
	}
	
	public com.ibm.adtech.jastor.Thing addAuthor(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing author = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.author == null)
			initAuthor();
		if (this.author.contains(author))
			return author;
		this.author.add(author);
		_model.add(_model.createStatement(_resource,authorProperty,author.resource()));
		return author;
	}
	
	public void removeAuthor(com.ibm.adtech.jastor.Thing author) throws JastorException {
		if (this.author == null)
			initAuthor();
		if (!this.author.contains(author))
			return;
		if (!_model.contains(_resource, authorProperty, author.resource()))
			return;
		this.author.remove(author);
		_model.removeAll(_resource, authorProperty, author.resource());
	}
		 

	private void initText() throws JastorException {
		text = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, textProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#text properties in Comment model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				text.add(obj);
		}
	}

	public java.util.Iterator getText() throws JastorException {
		if (text == null)
			initText();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(text,_resource,textProperty,false);
	}

	public void addText(java.lang.String text) throws JastorException {
		if (this.text == null)
			initText();
		if (this.text.contains(text))
			return;
		if (_model.contains(_resource, textProperty, createLiteral(text)))
			return;
		this.text.add(text);
		_model.add(_resource, textProperty, createLiteral(text));
	}
	
	public void removeText(java.lang.String text) throws JastorException {
		if (this.text == null)
			initText();
		if (!this.text.contains(text))
			return;
		if (!_model.contains(_resource, textProperty, createLiteral(text)))
			return;
		this.text.remove(text);
		_model.removeAll(_resource, textProperty, createLiteral(text));
	}


	private void initPermalink() throws JastorException {
		permalink = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, permalinkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Comment.owl#permalink properties in Comment model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				permalink.add(obj);
		}
	}

	public java.util.Iterator getPermalink() throws JastorException {
		if (permalink == null)
			initPermalink();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(permalink,_resource,permalinkProperty,false);
	}

	public void addPermalink(java.lang.String permalink) throws JastorException {
		if (this.permalink == null)
			initPermalink();
		if (this.permalink.contains(permalink))
			return;
		if (_model.contains(_resource, permalinkProperty, createLiteral(permalink)))
			return;
		this.permalink.add(permalink);
		_model.add(_resource, permalinkProperty, createLiteral(permalink));
	}
	
	public void removePermalink(java.lang.String permalink) throws JastorException {
		if (this.permalink == null)
			initPermalink();
		if (!this.permalink.contains(permalink))
			return;
		if (!_model.contains(_resource, permalinkProperty, createLiteral(permalink)))
			return;
		this.permalink.remove(permalink);
		_model.removeAll(_resource, permalinkProperty, createLiteral(permalink));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof CommentListener))
			throw new IllegalArgumentException("ThingListener must be instance of CommentListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((CommentListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof CommentListener))
			throw new IllegalArgumentException("ThingListener must be instance of CommentListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

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
						CommentListener listener=(CommentListener)iter.next();
						listener.idAdded(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(authornameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (authorname == null) {
					try {
						initAuthorname();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !authorname.contains(obj))
					authorname.add(obj);
				java.util.ArrayList consumersForAuthorname;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForAuthorname = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAuthorname.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.authornameAdded(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(datecreateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (datecreate == null) {
					try {
						initDatecreate();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !datecreate.contains(obj))
					datecreate.add(obj);
				java.util.ArrayList consumersForDatecreate;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDatecreate = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDatecreate.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.datecreateAdded(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(authorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _author = null;
					try {
						_author = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (author == null) {
						try {
							initAuthor();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!author.contains(_author))
						author.add(_author);
					if (listeners != null) {
						java.util.ArrayList consumersForAuthor;
						synchronized (listeners) {
							consumersForAuthor = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAuthor.iterator();iter.hasNext();){
							CommentListener listener=(CommentListener)iter.next();
							listener.authorAdded(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,_author);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(textProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (text == null) {
					try {
						initText();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !text.contains(obj))
					text.add(obj);
				java.util.ArrayList consumersForText;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForText = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForText.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.textAdded(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(permalinkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (permalink == null) {
					try {
						initPermalink();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !permalink.contains(obj))
					permalink.add(obj);
				java.util.ArrayList consumersForPermalink;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPermalink = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPermalink.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.permalinkAdded(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
						CommentListener listener=(CommentListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(authornameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (authorname != null) {
					if (authorname.contains(obj))
						authorname.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.authornameRemoved(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(datecreateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (datecreate != null) {
					if (datecreate.contains(obj))
						datecreate.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.datecreateRemoved(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(authorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _author = null;
					if (author != null) {
						boolean found = false;
						for (int i=0;i<author.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) author.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_author = __item;
								break;
							}
						}
						if (found)
							author.remove(_author);
						else {
							try {
								_author = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_author = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForAuthor;
						synchronized (listeners) {
							consumersForAuthor = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAuthor.iterator();iter.hasNext();){
							CommentListener listener=(CommentListener)iter.next();
							listener.authorRemoved(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,_author);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(textProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (text != null) {
					if (text.contains(obj))
						text.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.textRemoved(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(permalinkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (permalink != null) {
					if (permalink.contains(obj))
						permalink.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommentListener listener=(CommentListener)iter.next();
						listener.permalinkRemoved(edu.mit.dig.saveflickr.model.Comment.CommentImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}