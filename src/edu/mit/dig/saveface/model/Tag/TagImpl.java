

package edu.mit.dig.saveface.model.Tag;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Tag.Tag}
 * Use the edu.mit.dig.saveface.model.Tag.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Tag.owl#Tag)</p>
 * <br>
 */
public class TagImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Tag.Tag {
	

	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property yProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#y");
	private java.util.ArrayList y;
	private static com.hp.hpl.jena.rdf.model.Property xProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#x");
	private java.util.ArrayList x;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Tag.owl#createdTime");
	private java.util.ArrayList createdTime;
 

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
    	edu.mit.dig.saveface.model.Tag.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,yProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,xProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Tag.Tag.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		name = null;
		y = null;
		x = null;
		createdTime = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Tag.owl#name properties in Tag model not a Literal", stmt.getObject());
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


	private void initY() throws JastorException {
		y = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, yProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Tag.owl#y properties in Tag model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				y.add(obj);
		}
	}

	public java.util.Iterator getY() throws JastorException {
		if (y == null)
			initY();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(y,_resource,yProperty,false);
	}

	public void addY(java.lang.Integer y) throws JastorException {
		if (this.y == null)
			initY();
		if (this.y.contains(y))
			return;
		if (_model.contains(_resource, yProperty, createLiteral(y)))
			return;
		this.y.add(y);
		_model.add(_resource, yProperty, createLiteral(y));
	}
	
	public void removeY(java.lang.Integer y) throws JastorException {
		if (this.y == null)
			initY();
		if (!this.y.contains(y))
			return;
		if (!_model.contains(_resource, yProperty, createLiteral(y)))
			return;
		this.y.remove(y);
		_model.removeAll(_resource, yProperty, createLiteral(y));
	}


	private void initX() throws JastorException {
		x = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, xProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Tag.owl#x properties in Tag model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				x.add(obj);
		}
	}

	public java.util.Iterator getX() throws JastorException {
		if (x == null)
			initX();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(x,_resource,xProperty,false);
	}

	public void addX(java.lang.Integer x) throws JastorException {
		if (this.x == null)
			initX();
		if (this.x.contains(x))
			return;
		if (_model.contains(_resource, xProperty, createLiteral(x)))
			return;
		this.x.add(x);
		_model.add(_resource, xProperty, createLiteral(x));
	}
	
	public void removeX(java.lang.Integer x) throws JastorException {
		if (this.x == null)
			initX();
		if (!this.x.contains(x))
			return;
		if (!_model.contains(_resource, xProperty, createLiteral(x)))
			return;
		this.x.remove(x);
		_model.removeAll(_resource, xProperty, createLiteral(x));
	}


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Tag.owl#createdTime properties in Tag model not a Literal", stmt.getObject());
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
						TagListener listener=(TagListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Tag.TagImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(yProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (y == null) {
					try {
						initY();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !y.contains(obj))
					y.add(obj);
				java.util.ArrayList consumersForY;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForY = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForY.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.yAdded(edu.mit.dig.saveface.model.Tag.TagImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(xProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (x == null) {
					try {
						initX();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !x.contains(obj))
					x.add(obj);
				java.util.ArrayList consumersForX;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForX = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForX.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.xAdded(edu.mit.dig.saveface.model.Tag.TagImpl.this,(java.lang.Integer)obj);
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
						TagListener listener=(TagListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Tag.TagImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
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
						TagListener listener=(TagListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Tag.TagImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(yProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (y != null) {
					if (y.contains(obj))
						y.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.yRemoved(edu.mit.dig.saveface.model.Tag.TagImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(xProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (x != null) {
					if (x.contains(obj))
						x.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						TagListener listener=(TagListener)iter.next();
						listener.xRemoved(edu.mit.dig.saveface.model.Tag.TagImpl.this,(java.lang.Integer)obj);
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
						TagListener listener=(TagListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Tag.TagImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
		}

	//}
	


}