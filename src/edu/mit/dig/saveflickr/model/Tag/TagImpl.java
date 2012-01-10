

package edu.mit.dig.saveflickr.model.Tag;

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
 * Implementation of {@link edu.mit.dig.saveflickr.model.Tag.Tag}
 * Use the edu.mit.dig.saveflickr.model.Tag.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#Tag)</p>
 * <br>
 */
public class TagImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveflickr.model.Tag.Tag {
	

	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property authorProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#author");
	private java.util.ArrayList author;
	private static com.hp.hpl.jena.rdf.model.Property rawProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#raw");
	private java.util.ArrayList raw;
	private static com.hp.hpl.jena.rdf.model.Property valueProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#value");
	private java.util.ArrayList value;
 

	TagImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static TagImpl getTag(Resource resource, Model model) throws JastorException {
		return new TagImpl(resource, model);
	}
	    
	static TagImpl createTag(Resource resource, Model model) throws JastorException { 
		TagImpl impl = new TagImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Tag.TYPE)))
			impl._model.add(impl._resource, RDF.type, Tag.TYPE);
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
    	edu.mit.dig.saveflickr.model.Tag.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,authorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,rawProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,valueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveflickr.model.Tag.Tag.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		id = null;
		author = null;
		raw = null;
		value = null;
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#id properties in Tag model not a Literal", stmt.getObject());
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


	private void initAuthor() throws JastorException {
		this.author = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, authorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#author properties in Tag model not a Resource", stmt.getObject());
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
		 

	private void initRaw() throws JastorException {
		raw = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, rawProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#raw properties in Tag model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				raw.add(obj);
		}
	}

	public java.util.Iterator getRaw() throws JastorException {
		if (raw == null)
			initRaw();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(raw,_resource,rawProperty,false);
	}

	public void addRaw(java.lang.String raw) throws JastorException {
		if (this.raw == null)
			initRaw();
		if (this.raw.contains(raw))
			return;
		if (_model.contains(_resource, rawProperty, createLiteral(raw)))
			return;
		this.raw.add(raw);
		_model.add(_resource, rawProperty, createLiteral(raw));
	}
	
	public void removeRaw(java.lang.String raw) throws JastorException {
		if (this.raw == null)
			initRaw();
		if (!this.raw.contains(raw))
			return;
		if (!_model.contains(_resource, rawProperty, createLiteral(raw)))
			return;
		this.raw.remove(raw);
		_model.removeAll(_resource, rawProperty, createLiteral(raw));
	}


	private void initValue() throws JastorException {
		value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, valueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Tag.owl#value properties in Tag model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				value.add(obj);
		}
	}

	public java.util.Iterator getValue() throws JastorException {
		if (value == null)
			initValue();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(value,_resource,valueProperty,false);
	}

	public void addValue(java.lang.String value) throws JastorException {
		if (this.value == null)
			initValue();
		if (this.value.contains(value))
			return;
		if (_model.contains(_resource, valueProperty, createLiteral(value)))
			return;
		this.value.add(value);
		_model.add(_resource, valueProperty, createLiteral(value));
	}
	
	public void removeValue(java.lang.String value) throws JastorException {
		if (this.value == null)
			initValue();
		if (!this.value.contains(value))
			return;
		if (!_model.contains(_resource, valueProperty, createLiteral(value)))
			return;
		this.value.remove(value);
		_model.removeAll(_resource, valueProperty, createLiteral(value));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof TagListener))
			throw new IllegalArgumentException("ThingListener must be instance of TagListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((TagListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof TagListener))
			throw new IllegalArgumentException("ThingListener must be instance of TagListener"); 
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
						TagListener listener=(TagListener)iter.next();
						listener.idAdded(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,(java.lang.String)obj);
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
							TagListener listener=(TagListener)iter.next();
							listener.authorAdded(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,_author);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(rawProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (raw == null) {
					try {
						initRaw();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !raw.contains(obj))
					raw.add(obj);
				java.util.ArrayList consumersForRaw;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForRaw = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForRaw.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.rawAdded(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(valueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (value == null) {
					try {
						initValue();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !value.contains(obj))
					value.add(obj);
				java.util.ArrayList consumersForValue;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForValue = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForValue.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.valueAdded(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,(java.lang.String)obj);
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
						TagListener listener=(TagListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,(java.lang.String)obj);
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
							TagListener listener=(TagListener)iter.next();
							listener.authorRemoved(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,_author);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(rawProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (raw != null) {
					if (raw.contains(obj))
						raw.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.rawRemoved(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(valueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (value != null) {
					if (value.contains(obj))
						value.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.valueRemoved(edu.mit.dig.saveflickr.model.Tag.TagImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}