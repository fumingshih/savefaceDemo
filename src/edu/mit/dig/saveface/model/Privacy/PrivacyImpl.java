

package edu.mit.dig.saveface.model.Privacy;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Privacy.Privacy}
 * Use the edu.mit.dig.saveface.model.Privacy.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#Privacy)</p>
 * <br>
 */
public class PrivacyImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Privacy.Privacy {
	

	private static com.hp.hpl.jena.rdf.model.Property networksProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#networks");
	private java.util.ArrayList networks;
	private static com.hp.hpl.jena.rdf.model.Property friendsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#friends");
	private java.util.ArrayList friends;
	private static com.hp.hpl.jena.rdf.model.Property valueProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#value");
	private java.util.ArrayList value;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#description");
	private java.util.ArrayList description;
 

	PrivacyImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PrivacyImpl getPrivacy(Resource resource, Model model) throws JastorException {
		return new PrivacyImpl(resource, model);
	}
	    
	static PrivacyImpl createPrivacy(Resource resource, Model model) throws JastorException { 
		PrivacyImpl impl = new PrivacyImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Privacy.TYPE)))
			impl._model.add(impl._resource, RDF.type, Privacy.TYPE);
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
    	edu.mit.dig.saveface.model.Privacy.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,networksProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,friendsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,valueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Privacy.Privacy.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		networks = null;
		friends = null;
		value = null;
		description = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initNetworks() throws JastorException {
		networks = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, networksProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#networks properties in Privacy model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				networks.add(obj);
		}
	}

	public java.util.Iterator getNetworks() throws JastorException {
		if (networks == null)
			initNetworks();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(networks,_resource,networksProperty,false);
	}

	public void addNetworks(java.lang.String networks) throws JastorException {
		if (this.networks == null)
			initNetworks();
		if (this.networks.contains(networks))
			return;
		if (_model.contains(_resource, networksProperty, createLiteral(networks)))
			return;
		this.networks.add(networks);
		_model.add(_resource, networksProperty, createLiteral(networks));
	}
	
	public void removeNetworks(java.lang.String networks) throws JastorException {
		if (this.networks == null)
			initNetworks();
		if (!this.networks.contains(networks))
			return;
		if (!_model.contains(_resource, networksProperty, createLiteral(networks)))
			return;
		this.networks.remove(networks);
		_model.removeAll(_resource, networksProperty, createLiteral(networks));
	}


	private void initFriends() throws JastorException {
		friends = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, friendsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#friends properties in Privacy model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				friends.add(obj);
		}
	}

	public java.util.Iterator getFriends() throws JastorException {
		if (friends == null)
			initFriends();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(friends,_resource,friendsProperty,false);
	}

	public void addFriends(java.lang.String friends) throws JastorException {
		if (this.friends == null)
			initFriends();
		if (this.friends.contains(friends))
			return;
		if (_model.contains(_resource, friendsProperty, createLiteral(friends)))
			return;
		this.friends.add(friends);
		_model.add(_resource, friendsProperty, createLiteral(friends));
	}
	
	public void removeFriends(java.lang.String friends) throws JastorException {
		if (this.friends == null)
			initFriends();
		if (!this.friends.contains(friends))
			return;
		if (!_model.contains(_resource, friendsProperty, createLiteral(friends)))
			return;
		this.friends.remove(friends);
		_model.removeAll(_resource, friendsProperty, createLiteral(friends));
	}


	private void initValue() throws JastorException {
		value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, valueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#value properties in Privacy model not a Literal", stmt.getObject());
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


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Privacy.owl#description properties in Privacy model not a Literal", stmt.getObject());
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
		if (!(listener instanceof PrivacyListener))
			throw new IllegalArgumentException("ThingListener must be instance of PrivacyListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PrivacyListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PrivacyListener))
			throw new IllegalArgumentException("ThingListener must be instance of PrivacyListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(networksProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (networks == null) {
					try {
						initNetworks();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !networks.contains(obj))
					networks.add(obj);
				java.util.ArrayList consumersForNetworks;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForNetworks = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForNetworks.iterator();iter.hasNext();){
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.networksAdded(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(friendsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (friends == null) {
					try {
						initFriends();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !friends.contains(obj))
					friends.add(obj);
				java.util.ArrayList consumersForFriends;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFriends = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFriends.iterator();iter.hasNext();){
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.friendsAdded(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
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
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.valueAdded(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
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
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(networksProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (networks != null) {
					if (networks.contains(obj))
						networks.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.networksRemoved(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(friendsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (friends != null) {
					if (friends.contains(obj))
						friends.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.friendsRemoved(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
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
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.valueRemoved(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
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
						PrivacyListener listener=(PrivacyListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Privacy.PrivacyImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}