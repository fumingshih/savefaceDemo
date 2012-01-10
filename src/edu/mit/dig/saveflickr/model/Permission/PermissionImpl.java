

package edu.mit.dig.saveflickr.model.Permission;

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
 * Implementation of {@link edu.mit.dig.saveflickr.model.Permission.Permission}
 * Use the edu.mit.dig.saveflickr.model.Permission.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#Permission)</p>
 * <br>
 */
public class PermissionImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveflickr.model.Permission.Permission {
	

	private static com.hp.hpl.jena.rdf.model.Property friendFlagProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#friendFlag");
	private java.util.ArrayList friendFlag;
	private static com.hp.hpl.jena.rdf.model.Property publicFlagProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#publicFlag");
	private java.util.ArrayList publicFlag;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property familyFlagProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#familyFlag");
	private java.util.ArrayList familyFlag;
 

	PermissionImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PermissionImpl getPermission(Resource resource, Model model) throws JastorException {
		return new PermissionImpl(resource, model);
	}
	    
	static PermissionImpl createPermission(Resource resource, Model model) throws JastorException { 
		PermissionImpl impl = new PermissionImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Permission.TYPE)))
			impl._model.add(impl._resource, RDF.type, Permission.TYPE);
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
    	edu.mit.dig.saveflickr.model.Permission.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,friendFlagProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,publicFlagProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,familyFlagProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveflickr.model.Permission.Permission.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		friendFlag = null;
		publicFlag = null;
		id = null;
		familyFlag = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initFriendFlag() throws JastorException {
		friendFlag = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, friendFlagProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#friendFlag properties in Permission model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
			if (obj != null)
				friendFlag.add(obj);
		}
	}

	public java.util.Iterator getFriendFlag() throws JastorException {
		if (friendFlag == null)
			initFriendFlag();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(friendFlag,_resource,friendFlagProperty,false);
	}

	public void addFriendFlag(java.lang.Boolean friendFlag) throws JastorException {
		if (this.friendFlag == null)
			initFriendFlag();
		if (this.friendFlag.contains(friendFlag))
			return;
		if (_model.contains(_resource, friendFlagProperty, createLiteral(friendFlag)))
			return;
		this.friendFlag.add(friendFlag);
		_model.add(_resource, friendFlagProperty, createLiteral(friendFlag));
	}
	
	public void removeFriendFlag(java.lang.Boolean friendFlag) throws JastorException {
		if (this.friendFlag == null)
			initFriendFlag();
		if (!this.friendFlag.contains(friendFlag))
			return;
		if (!_model.contains(_resource, friendFlagProperty, createLiteral(friendFlag)))
			return;
		this.friendFlag.remove(friendFlag);
		_model.removeAll(_resource, friendFlagProperty, createLiteral(friendFlag));
	}


	private void initPublicFlag() throws JastorException {
		publicFlag = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, publicFlagProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#publicFlag properties in Permission model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
			if (obj != null)
				publicFlag.add(obj);
		}
	}

	public java.util.Iterator getPublicFlag() throws JastorException {
		if (publicFlag == null)
			initPublicFlag();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(publicFlag,_resource,publicFlagProperty,false);
	}

	public void addPublicFlag(java.lang.Boolean publicFlag) throws JastorException {
		if (this.publicFlag == null)
			initPublicFlag();
		if (this.publicFlag.contains(publicFlag))
			return;
		if (_model.contains(_resource, publicFlagProperty, createLiteral(publicFlag)))
			return;
		this.publicFlag.add(publicFlag);
		_model.add(_resource, publicFlagProperty, createLiteral(publicFlag));
	}
	
	public void removePublicFlag(java.lang.Boolean publicFlag) throws JastorException {
		if (this.publicFlag == null)
			initPublicFlag();
		if (!this.publicFlag.contains(publicFlag))
			return;
		if (!_model.contains(_resource, publicFlagProperty, createLiteral(publicFlag)))
			return;
		this.publicFlag.remove(publicFlag);
		_model.removeAll(_resource, publicFlagProperty, createLiteral(publicFlag));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#id properties in Permission model not a Literal", stmt.getObject());
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


	private void initFamilyFlag() throws JastorException {
		familyFlag = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, familyFlagProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#familyFlag properties in Permission model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
			if (obj != null)
				familyFlag.add(obj);
		}
	}

	public java.util.Iterator getFamilyFlag() throws JastorException {
		if (familyFlag == null)
			initFamilyFlag();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(familyFlag,_resource,familyFlagProperty,false);
	}

	public void addFamilyFlag(java.lang.Boolean familyFlag) throws JastorException {
		if (this.familyFlag == null)
			initFamilyFlag();
		if (this.familyFlag.contains(familyFlag))
			return;
		if (_model.contains(_resource, familyFlagProperty, createLiteral(familyFlag)))
			return;
		this.familyFlag.add(familyFlag);
		_model.add(_resource, familyFlagProperty, createLiteral(familyFlag));
	}
	
	public void removeFamilyFlag(java.lang.Boolean familyFlag) throws JastorException {
		if (this.familyFlag == null)
			initFamilyFlag();
		if (!this.familyFlag.contains(familyFlag))
			return;
		if (!_model.contains(_resource, familyFlagProperty, createLiteral(familyFlag)))
			return;
		this.familyFlag.remove(familyFlag);
		_model.removeAll(_resource, familyFlagProperty, createLiteral(familyFlag));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PermissionListener))
			throw new IllegalArgumentException("ThingListener must be instance of PermissionListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PermissionListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PermissionListener))
			throw new IllegalArgumentException("ThingListener must be instance of PermissionListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(friendFlagProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (friendFlag == null) {
					try {
						initFriendFlag();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !friendFlag.contains(obj))
					friendFlag.add(obj);
				java.util.ArrayList consumersForFriendFlag;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFriendFlag = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFriendFlag.iterator();iter.hasNext();){
						PermissionListener listener=(PermissionListener)iter.next();
						listener.friendFlagAdded(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(publicFlagProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (publicFlag == null) {
					try {
						initPublicFlag();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !publicFlag.contains(obj))
					publicFlag.add(obj);
				java.util.ArrayList consumersForPublicFlag;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPublicFlag = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPublicFlag.iterator();iter.hasNext();){
						PermissionListener listener=(PermissionListener)iter.next();
						listener.publicFlagAdded(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.Boolean)obj);
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
						PermissionListener listener=(PermissionListener)iter.next();
						listener.idAdded(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(familyFlagProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (familyFlag == null) {
					try {
						initFamilyFlag();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !familyFlag.contains(obj))
					familyFlag.add(obj);
				java.util.ArrayList consumersForFamilyFlag;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFamilyFlag = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFamilyFlag.iterator();iter.hasNext();){
						PermissionListener listener=(PermissionListener)iter.next();
						listener.familyFlagAdded(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(friendFlagProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (friendFlag != null) {
					if (friendFlag.contains(obj))
						friendFlag.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PermissionListener listener=(PermissionListener)iter.next();
						listener.friendFlagRemoved(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(publicFlagProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (publicFlag != null) {
					if (publicFlag.contains(obj))
						publicFlag.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PermissionListener listener=(PermissionListener)iter.next();
						listener.publicFlagRemoved(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.Boolean)obj);
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
						PermissionListener listener=(PermissionListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(familyFlagProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (familyFlag != null) {
					if (familyFlag.contains(obj))
						familyFlag.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PermissionListener listener=(PermissionListener)iter.next();
						listener.familyFlagRemoved(edu.mit.dig.saveflickr.model.Permission.PermissionImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
		}

	//}
	


}