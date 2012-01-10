

package edu.mit.dig.saveface.model.Work;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Work.Work}
 * Use the edu.mit.dig.saveface.model.Work.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Work.owl#Work)</p>
 * <br>
 */
public class WorkImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Work.Work {
	

	private static com.hp.hpl.jena.rdf.model.Property positionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#position");
	private java.util.ArrayList position;
	private static com.hp.hpl.jena.rdf.model.Property employerProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#employer");
	private java.util.ArrayList employer;
	private static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#location");
	private java.util.ArrayList location;
	private static com.hp.hpl.jena.rdf.model.Property startDateProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#startDate");
	private java.util.ArrayList startDate;
	private static com.hp.hpl.jena.rdf.model.Property endDateProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Work.owl#endDate");
	private java.util.ArrayList endDate;
 

	WorkImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static WorkImpl getWork(Resource resource, Model model) throws JastorException {
		return new WorkImpl(resource, model);
	}
	    
	static WorkImpl createWork(Resource resource, Model model) throws JastorException { 
		WorkImpl impl = new WorkImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Work.TYPE)))
			impl._model.add(impl._resource, RDF.type, Work.TYPE);
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
    	edu.mit.dig.saveface.model.Work.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,positionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,employerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,startDateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,endDateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Work.Work.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		position = null;
		employer = null;
		location = null;
		startDate = null;
		endDate = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initPosition() throws JastorException {
		this.position = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, positionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Work.owl#position properties in Work model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing position = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.position.add(position);
			}
		}
	}

	public java.util.Iterator getPosition() throws JastorException {
		if (position == null)
			initPosition();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(position,_resource,positionProperty,true);
	}

	public void addPosition(com.ibm.adtech.jastor.Thing position) throws JastorException {
		if (this.position == null)
			initPosition();
		if (this.position.contains(position)) {
			this.position.remove(position);
			this.position.add(position);
			return;
		}
		this.position.add(position);
		_model.add(_model.createStatement(_resource,positionProperty,position.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPosition() throws JastorException {
		com.ibm.adtech.jastor.Thing position = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.position == null)
			initPosition();
		this.position.add(position);
		_model.add(_model.createStatement(_resource,positionProperty,position.resource()));
		return position;
	}
	
	public com.ibm.adtech.jastor.Thing addPosition(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing position = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.position == null)
			initPosition();
		if (this.position.contains(position))
			return position;
		this.position.add(position);
		_model.add(_model.createStatement(_resource,positionProperty,position.resource()));
		return position;
	}
	
	public void removePosition(com.ibm.adtech.jastor.Thing position) throws JastorException {
		if (this.position == null)
			initPosition();
		if (!this.position.contains(position))
			return;
		if (!_model.contains(_resource, positionProperty, position.resource()))
			return;
		this.position.remove(position);
		_model.removeAll(_resource, positionProperty, position.resource());
	}
		 

	private void initEmployer() throws JastorException {
		this.employer = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, employerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Work.owl#employer properties in Work model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing employer = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.employer.add(employer);
			}
		}
	}

	public java.util.Iterator getEmployer() throws JastorException {
		if (employer == null)
			initEmployer();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(employer,_resource,employerProperty,true);
	}

	public void addEmployer(com.ibm.adtech.jastor.Thing employer) throws JastorException {
		if (this.employer == null)
			initEmployer();
		if (this.employer.contains(employer)) {
			this.employer.remove(employer);
			this.employer.add(employer);
			return;
		}
		this.employer.add(employer);
		_model.add(_model.createStatement(_resource,employerProperty,employer.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addEmployer() throws JastorException {
		com.ibm.adtech.jastor.Thing employer = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.employer == null)
			initEmployer();
		this.employer.add(employer);
		_model.add(_model.createStatement(_resource,employerProperty,employer.resource()));
		return employer;
	}
	
	public com.ibm.adtech.jastor.Thing addEmployer(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing employer = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.employer == null)
			initEmployer();
		if (this.employer.contains(employer))
			return employer;
		this.employer.add(employer);
		_model.add(_model.createStatement(_resource,employerProperty,employer.resource()));
		return employer;
	}
	
	public void removeEmployer(com.ibm.adtech.jastor.Thing employer) throws JastorException {
		if (this.employer == null)
			initEmployer();
		if (!this.employer.contains(employer))
			return;
		if (!_model.contains(_resource, employerProperty, employer.resource()))
			return;
		this.employer.remove(employer);
		_model.removeAll(_resource, employerProperty, employer.resource());
	}
		 

	private void initLocation() throws JastorException {
		this.location = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Work.owl#location properties in Work model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing location = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.location.add(location);
			}
		}
	}

	public java.util.Iterator getLocation() throws JastorException {
		if (location == null)
			initLocation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(location,_resource,locationProperty,true);
	}

	public void addLocation(com.ibm.adtech.jastor.Thing location) throws JastorException {
		if (this.location == null)
			initLocation();
		if (this.location.contains(location)) {
			this.location.remove(location);
			this.location.add(location);
			return;
		}
		this.location.add(location);
		_model.add(_model.createStatement(_resource,locationProperty,location.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLocation() throws JastorException {
		com.ibm.adtech.jastor.Thing location = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.location == null)
			initLocation();
		this.location.add(location);
		_model.add(_model.createStatement(_resource,locationProperty,location.resource()));
		return location;
	}
	
	public com.ibm.adtech.jastor.Thing addLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing location = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.location == null)
			initLocation();
		if (this.location.contains(location))
			return location;
		this.location.add(location);
		_model.add(_model.createStatement(_resource,locationProperty,location.resource()));
		return location;
	}
	
	public void removeLocation(com.ibm.adtech.jastor.Thing location) throws JastorException {
		if (this.location == null)
			initLocation();
		if (!this.location.contains(location))
			return;
		if (!_model.contains(_resource, locationProperty, location.resource()))
			return;
		this.location.remove(location);
		_model.removeAll(_resource, locationProperty, location.resource());
	}
		 

	private void initStartDate() throws JastorException {
		startDate = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, startDateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Work.owl#startDate properties in Work model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				startDate.add(obj);
		}
	}

	public java.util.Iterator getStartDate() throws JastorException {
		if (startDate == null)
			initStartDate();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(startDate,_resource,startDateProperty,false);
	}

	public void addStartDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDate) throws JastorException {
		if (this.startDate == null)
			initStartDate();
		if (this.startDate.contains(startDate))
			return;
		if (_model.contains(_resource, startDateProperty, createLiteral(startDate)))
			return;
		this.startDate.add(startDate);
		_model.add(_resource, startDateProperty, createLiteral(startDate));
	}
	
	public void removeStartDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDate) throws JastorException {
		if (this.startDate == null)
			initStartDate();
		if (!this.startDate.contains(startDate))
			return;
		if (!_model.contains(_resource, startDateProperty, createLiteral(startDate)))
			return;
		this.startDate.remove(startDate);
		_model.removeAll(_resource, startDateProperty, createLiteral(startDate));
	}


	private void initEndDate() throws JastorException {
		endDate = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, endDateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Work.owl#endDate properties in Work model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				endDate.add(obj);
		}
	}

	public java.util.Iterator getEndDate() throws JastorException {
		if (endDate == null)
			initEndDate();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(endDate,_resource,endDateProperty,false);
	}

	public void addEndDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDate) throws JastorException {
		if (this.endDate == null)
			initEndDate();
		if (this.endDate.contains(endDate))
			return;
		if (_model.contains(_resource, endDateProperty, createLiteral(endDate)))
			return;
		this.endDate.add(endDate);
		_model.add(_resource, endDateProperty, createLiteral(endDate));
	}
	
	public void removeEndDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDate) throws JastorException {
		if (this.endDate == null)
			initEndDate();
		if (!this.endDate.contains(endDate))
			return;
		if (!_model.contains(_resource, endDateProperty, createLiteral(endDate)))
			return;
		this.endDate.remove(endDate);
		_model.removeAll(_resource, endDateProperty, createLiteral(endDate));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof WorkListener))
			throw new IllegalArgumentException("ThingListener must be instance of WorkListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((WorkListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof WorkListener))
			throw new IllegalArgumentException("ThingListener must be instance of WorkListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(positionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _position = null;
					try {
						_position = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (position == null) {
						try {
							initPosition();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!position.contains(_position))
						position.add(_position);
					if (listeners != null) {
						java.util.ArrayList consumersForPosition;
						synchronized (listeners) {
							consumersForPosition = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPosition.iterator();iter.hasNext();){
							WorkListener listener=(WorkListener)iter.next();
							listener.positionAdded(edu.mit.dig.saveface.model.Work.WorkImpl.this,_position);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(employerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _employer = null;
					try {
						_employer = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (employer == null) {
						try {
							initEmployer();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!employer.contains(_employer))
						employer.add(_employer);
					if (listeners != null) {
						java.util.ArrayList consumersForEmployer;
						synchronized (listeners) {
							consumersForEmployer = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEmployer.iterator();iter.hasNext();){
							WorkListener listener=(WorkListener)iter.next();
							listener.employerAdded(edu.mit.dig.saveface.model.Work.WorkImpl.this,_employer);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(locationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _location = null;
					try {
						_location = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (location == null) {
						try {
							initLocation();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!location.contains(_location))
						location.add(_location);
					if (listeners != null) {
						java.util.ArrayList consumersForLocation;
						synchronized (listeners) {
							consumersForLocation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLocation.iterator();iter.hasNext();){
							WorkListener listener=(WorkListener)iter.next();
							listener.locationAdded(edu.mit.dig.saveface.model.Work.WorkImpl.this,_location);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startDateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (startDate == null) {
					try {
						initStartDate();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !startDate.contains(obj))
					startDate.add(obj);
				java.util.ArrayList consumersForStartDate;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForStartDate = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForStartDate.iterator();iter.hasNext();){
						WorkListener listener=(WorkListener)iter.next();
						listener.startDateAdded(edu.mit.dig.saveface.model.Work.WorkImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(endDateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (endDate == null) {
					try {
						initEndDate();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !endDate.contains(obj))
					endDate.add(obj);
				java.util.ArrayList consumersForEndDate;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForEndDate = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForEndDate.iterator();iter.hasNext();){
						WorkListener listener=(WorkListener)iter.next();
						listener.endDateAdded(edu.mit.dig.saveface.model.Work.WorkImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(positionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _position = null;
					if (position != null) {
						boolean found = false;
						for (int i=0;i<position.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) position.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_position = __item;
								break;
							}
						}
						if (found)
							position.remove(_position);
						else {
							try {
								_position = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_position = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPosition;
						synchronized (listeners) {
							consumersForPosition = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPosition.iterator();iter.hasNext();){
							WorkListener listener=(WorkListener)iter.next();
							listener.positionRemoved(edu.mit.dig.saveface.model.Work.WorkImpl.this,_position);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(employerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _employer = null;
					if (employer != null) {
						boolean found = false;
						for (int i=0;i<employer.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) employer.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_employer = __item;
								break;
							}
						}
						if (found)
							employer.remove(_employer);
						else {
							try {
								_employer = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_employer = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForEmployer;
						synchronized (listeners) {
							consumersForEmployer = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEmployer.iterator();iter.hasNext();){
							WorkListener listener=(WorkListener)iter.next();
							listener.employerRemoved(edu.mit.dig.saveface.model.Work.WorkImpl.this,_employer);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(locationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _location = null;
					if (location != null) {
						boolean found = false;
						for (int i=0;i<location.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) location.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_location = __item;
								break;
							}
						}
						if (found)
							location.remove(_location);
						else {
							try {
								_location = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_location = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLocation;
						synchronized (listeners) {
							consumersForLocation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLocation.iterator();iter.hasNext();){
							WorkListener listener=(WorkListener)iter.next();
							listener.locationRemoved(edu.mit.dig.saveface.model.Work.WorkImpl.this,_location);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startDateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (startDate != null) {
					if (startDate.contains(obj))
						startDate.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						WorkListener listener=(WorkListener)iter.next();
						listener.startDateRemoved(edu.mit.dig.saveface.model.Work.WorkImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(endDateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (endDate != null) {
					if (endDate.contains(obj))
						endDate.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						WorkListener listener=(WorkListener)iter.next();
						listener.endDateRemoved(edu.mit.dig.saveface.model.Work.WorkImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
		}

	//}
	


}