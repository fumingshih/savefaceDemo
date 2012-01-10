

package edu.mit.dig.saveface.model.Education;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Education.Education}
 * Use the edu.mit.dig.saveface.model.Education.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Education.owl#Education)</p>
 * <br>
 */
public class EducationImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Education.Education {
	

	private static com.hp.hpl.jena.rdf.model.Property typeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#type");
	private java.util.ArrayList type;
	private static com.hp.hpl.jena.rdf.model.Property yearProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#year");
	private java.util.ArrayList year;
	private static com.hp.hpl.jena.rdf.model.Property schoolProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#school");
	private java.util.ArrayList school;
	private static com.hp.hpl.jena.rdf.model.Property degreeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#degree");
	private java.util.ArrayList degree;
	private static com.hp.hpl.jena.rdf.model.Property concentrationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Education.owl#concentration");
	private java.util.ArrayList concentration;
 

	EducationImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static EducationImpl getEducation(Resource resource, Model model) throws JastorException {
		return new EducationImpl(resource, model);
	}
	    
	static EducationImpl createEducation(Resource resource, Model model) throws JastorException { 
		EducationImpl impl = new EducationImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Education.TYPE)))
			impl._model.add(impl._resource, RDF.type, Education.TYPE);
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
    	edu.mit.dig.saveface.model.Education.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,typeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,yearProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,schoolProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,degreeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,concentrationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Education.Education.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		type = null;
		year = null;
		school = null;
		degree = null;
		concentration = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initType() throws JastorException {
		type = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, typeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Education.owl#type properties in Education model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				type.add(obj);
		}
	}

	public java.util.Iterator getType() throws JastorException {
		if (type == null)
			initType();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(type,_resource,typeProperty,false);
	}

	public void addType(java.lang.String type) throws JastorException {
		if (this.type == null)
			initType();
		if (this.type.contains(type))
			return;
		if (_model.contains(_resource, typeProperty, createLiteral(type)))
			return;
		this.type.add(type);
		_model.add(_resource, typeProperty, createLiteral(type));
	}
	
	public void removeType(java.lang.String type) throws JastorException {
		if (this.type == null)
			initType();
		if (!this.type.contains(type))
			return;
		if (!_model.contains(_resource, typeProperty, createLiteral(type)))
			return;
		this.type.remove(type);
		_model.removeAll(_resource, typeProperty, createLiteral(type));
	}


	private void initYear() throws JastorException {
		this.year = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, yearProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Education.owl#year properties in Education model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing year = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.year.add(year);
			}
		}
	}

	public java.util.Iterator getYear() throws JastorException {
		if (year == null)
			initYear();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(year,_resource,yearProperty,true);
	}

	public void addYear(com.ibm.adtech.jastor.Thing year) throws JastorException {
		if (this.year == null)
			initYear();
		if (this.year.contains(year)) {
			this.year.remove(year);
			this.year.add(year);
			return;
		}
		this.year.add(year);
		_model.add(_model.createStatement(_resource,yearProperty,year.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addYear() throws JastorException {
		com.ibm.adtech.jastor.Thing year = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.year == null)
			initYear();
		this.year.add(year);
		_model.add(_model.createStatement(_resource,yearProperty,year.resource()));
		return year;
	}
	
	public com.ibm.adtech.jastor.Thing addYear(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing year = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.year == null)
			initYear();
		if (this.year.contains(year))
			return year;
		this.year.add(year);
		_model.add(_model.createStatement(_resource,yearProperty,year.resource()));
		return year;
	}
	
	public void removeYear(com.ibm.adtech.jastor.Thing year) throws JastorException {
		if (this.year == null)
			initYear();
		if (!this.year.contains(year))
			return;
		if (!_model.contains(_resource, yearProperty, year.resource()))
			return;
		this.year.remove(year);
		_model.removeAll(_resource, yearProperty, year.resource());
	}
		 

	private void initSchool() throws JastorException {
		this.school = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, schoolProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Education.owl#school properties in Education model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing school = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.school.add(school);
			}
		}
	}

	public java.util.Iterator getSchool() throws JastorException {
		if (school == null)
			initSchool();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(school,_resource,schoolProperty,true);
	}

	public void addSchool(com.ibm.adtech.jastor.Thing school) throws JastorException {
		if (this.school == null)
			initSchool();
		if (this.school.contains(school)) {
			this.school.remove(school);
			this.school.add(school);
			return;
		}
		this.school.add(school);
		_model.add(_model.createStatement(_resource,schoolProperty,school.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addSchool() throws JastorException {
		com.ibm.adtech.jastor.Thing school = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.school == null)
			initSchool();
		this.school.add(school);
		_model.add(_model.createStatement(_resource,schoolProperty,school.resource()));
		return school;
	}
	
	public com.ibm.adtech.jastor.Thing addSchool(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing school = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.school == null)
			initSchool();
		if (this.school.contains(school))
			return school;
		this.school.add(school);
		_model.add(_model.createStatement(_resource,schoolProperty,school.resource()));
		return school;
	}
	
	public void removeSchool(com.ibm.adtech.jastor.Thing school) throws JastorException {
		if (this.school == null)
			initSchool();
		if (!this.school.contains(school))
			return;
		if (!_model.contains(_resource, schoolProperty, school.resource()))
			return;
		this.school.remove(school);
		_model.removeAll(_resource, schoolProperty, school.resource());
	}
		 

	private void initDegree() throws JastorException {
		this.degree = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, degreeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Education.owl#degree properties in Education model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing degree = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.degree.add(degree);
			}
		}
	}

	public java.util.Iterator getDegree() throws JastorException {
		if (degree == null)
			initDegree();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(degree,_resource,degreeProperty,true);
	}

	public void addDegree(com.ibm.adtech.jastor.Thing degree) throws JastorException {
		if (this.degree == null)
			initDegree();
		if (this.degree.contains(degree)) {
			this.degree.remove(degree);
			this.degree.add(degree);
			return;
		}
		this.degree.add(degree);
		_model.add(_model.createStatement(_resource,degreeProperty,degree.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addDegree() throws JastorException {
		com.ibm.adtech.jastor.Thing degree = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.degree == null)
			initDegree();
		this.degree.add(degree);
		_model.add(_model.createStatement(_resource,degreeProperty,degree.resource()));
		return degree;
	}
	
	public com.ibm.adtech.jastor.Thing addDegree(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing degree = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.degree == null)
			initDegree();
		if (this.degree.contains(degree))
			return degree;
		this.degree.add(degree);
		_model.add(_model.createStatement(_resource,degreeProperty,degree.resource()));
		return degree;
	}
	
	public void removeDegree(com.ibm.adtech.jastor.Thing degree) throws JastorException {
		if (this.degree == null)
			initDegree();
		if (!this.degree.contains(degree))
			return;
		if (!_model.contains(_resource, degreeProperty, degree.resource()))
			return;
		this.degree.remove(degree);
		_model.removeAll(_resource, degreeProperty, degree.resource());
	}
		 

	private void initConcentration() throws JastorException {
		this.concentration = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, concentrationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/Education.owl#concentration properties in Education model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing concentration = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.concentration.add(concentration);
			}
		}
	}

	public java.util.Iterator getConcentration() throws JastorException {
		if (concentration == null)
			initConcentration();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(concentration,_resource,concentrationProperty,true);
	}

	public void addConcentration(com.ibm.adtech.jastor.Thing concentration) throws JastorException {
		if (this.concentration == null)
			initConcentration();
		if (this.concentration.contains(concentration)) {
			this.concentration.remove(concentration);
			this.concentration.add(concentration);
			return;
		}
		this.concentration.add(concentration);
		_model.add(_model.createStatement(_resource,concentrationProperty,concentration.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addConcentration() throws JastorException {
		com.ibm.adtech.jastor.Thing concentration = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.concentration == null)
			initConcentration();
		this.concentration.add(concentration);
		_model.add(_model.createStatement(_resource,concentrationProperty,concentration.resource()));
		return concentration;
	}
	
	public com.ibm.adtech.jastor.Thing addConcentration(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing concentration = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.concentration == null)
			initConcentration();
		if (this.concentration.contains(concentration))
			return concentration;
		this.concentration.add(concentration);
		_model.add(_model.createStatement(_resource,concentrationProperty,concentration.resource()));
		return concentration;
	}
	
	public void removeConcentration(com.ibm.adtech.jastor.Thing concentration) throws JastorException {
		if (this.concentration == null)
			initConcentration();
		if (!this.concentration.contains(concentration))
			return;
		if (!_model.contains(_resource, concentrationProperty, concentration.resource()))
			return;
		this.concentration.remove(concentration);
		_model.removeAll(_resource, concentrationProperty, concentration.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof EducationListener))
			throw new IllegalArgumentException("ThingListener must be instance of EducationListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((EducationListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof EducationListener))
			throw new IllegalArgumentException("ThingListener must be instance of EducationListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(typeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (type == null) {
					try {
						initType();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !type.contains(obj))
					type.add(obj);
				java.util.ArrayList consumersForType;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForType = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForType.iterator();iter.hasNext();){
						EducationListener listener=(EducationListener)iter.next();
						listener.typeAdded(edu.mit.dig.saveface.model.Education.EducationImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(yearProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _year = null;
					try {
						_year = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (year == null) {
						try {
							initYear();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!year.contains(_year))
						year.add(_year);
					if (listeners != null) {
						java.util.ArrayList consumersForYear;
						synchronized (listeners) {
							consumersForYear = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForYear.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.yearAdded(edu.mit.dig.saveface.model.Education.EducationImpl.this,_year);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(schoolProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _school = null;
					try {
						_school = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (school == null) {
						try {
							initSchool();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!school.contains(_school))
						school.add(_school);
					if (listeners != null) {
						java.util.ArrayList consumersForSchool;
						synchronized (listeners) {
							consumersForSchool = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForSchool.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.schoolAdded(edu.mit.dig.saveface.model.Education.EducationImpl.this,_school);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(degreeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _degree = null;
					try {
						_degree = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (degree == null) {
						try {
							initDegree();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!degree.contains(_degree))
						degree.add(_degree);
					if (listeners != null) {
						java.util.ArrayList consumersForDegree;
						synchronized (listeners) {
							consumersForDegree = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDegree.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.degreeAdded(edu.mit.dig.saveface.model.Education.EducationImpl.this,_degree);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(concentrationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _concentration = null;
					try {
						_concentration = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (concentration == null) {
						try {
							initConcentration();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!concentration.contains(_concentration))
						concentration.add(_concentration);
					if (listeners != null) {
						java.util.ArrayList consumersForConcentration;
						synchronized (listeners) {
							consumersForConcentration = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForConcentration.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.concentrationAdded(edu.mit.dig.saveface.model.Education.EducationImpl.this,_concentration);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(typeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (type != null) {
					if (type.contains(obj))
						type.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						EducationListener listener=(EducationListener)iter.next();
						listener.typeRemoved(edu.mit.dig.saveface.model.Education.EducationImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(yearProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _year = null;
					if (year != null) {
						boolean found = false;
						for (int i=0;i<year.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) year.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_year = __item;
								break;
							}
						}
						if (found)
							year.remove(_year);
						else {
							try {
								_year = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_year = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForYear;
						synchronized (listeners) {
							consumersForYear = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForYear.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.yearRemoved(edu.mit.dig.saveface.model.Education.EducationImpl.this,_year);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(schoolProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _school = null;
					if (school != null) {
						boolean found = false;
						for (int i=0;i<school.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) school.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_school = __item;
								break;
							}
						}
						if (found)
							school.remove(_school);
						else {
							try {
								_school = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_school = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForSchool;
						synchronized (listeners) {
							consumersForSchool = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForSchool.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.schoolRemoved(edu.mit.dig.saveface.model.Education.EducationImpl.this,_school);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(degreeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _degree = null;
					if (degree != null) {
						boolean found = false;
						for (int i=0;i<degree.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) degree.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_degree = __item;
								break;
							}
						}
						if (found)
							degree.remove(_degree);
						else {
							try {
								_degree = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_degree = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForDegree;
						synchronized (listeners) {
							consumersForDegree = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDegree.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.degreeRemoved(edu.mit.dig.saveface.model.Education.EducationImpl.this,_degree);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(concentrationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _concentration = null;
					if (concentration != null) {
						boolean found = false;
						for (int i=0;i<concentration.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) concentration.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_concentration = __item;
								break;
							}
						}
						if (found)
							concentration.remove(_concentration);
						else {
							try {
								_concentration = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_concentration = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForConcentration;
						synchronized (listeners) {
							consumersForConcentration = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForConcentration.iterator();iter.hasNext();){
							EducationListener listener=(EducationListener)iter.next();
							listener.concentrationRemoved(edu.mit.dig.saveface.model.Education.EducationImpl.this,_concentration);
						}
					}
				}
				return;
			}
		}

	//}
	


}