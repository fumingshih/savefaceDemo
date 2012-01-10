

package edu.mit.dig.saveface.model.Page;

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
 * Implementation of {@link edu.mit.dig.saveface.model.Page.Page}
 * Use the edu.mit.dig.saveface.model.Page.Factory to create instances of this class.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#Page)</p>
 * <br>
 */
public class PageImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.Page.Page {
	

	private static com.hp.hpl.jena.rdf.model.Property usernameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#username");
	private java.util.ArrayList username;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property fanCountProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#fanCount");
	private java.util.ArrayList fanCount;
	private static com.hp.hpl.jena.rdf.model.Property companyOverviewProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#companyOverview");
	private java.util.ArrayList companyOverview;
	private static com.hp.hpl.jena.rdf.model.Property websiteProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#website");
	private java.util.ArrayList website;
	private static com.hp.hpl.jena.rdf.model.Property categoryProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#category");
	private java.util.ArrayList category;
	private static com.hp.hpl.jena.rdf.model.Property productsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#products");
	private java.util.ArrayList products;
	private static com.hp.hpl.jena.rdf.model.Property createdTimeProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#createdTime");
	private java.util.ArrayList createdTime;
	private static com.hp.hpl.jena.rdf.model.Property missionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#mission");
	private java.util.ArrayList mission;
	private static com.hp.hpl.jena.rdf.model.Property foundedProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#founded");
	private java.util.ArrayList founded;
	private static com.hp.hpl.jena.rdf.model.Property pictureProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#picture");
	private java.util.ArrayList picture;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#description");
	private java.util.ArrayList description;
 

	PageImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PageImpl getPage(Resource resource, Model model) throws JastorException {
		return new PageImpl(resource, model);
	}
	    
	static PageImpl createPage(Resource resource, Model model) throws JastorException { 
		PageImpl impl = new PageImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Page.TYPE)))
			impl._model.add(impl._resource, RDF.type, Page.TYPE);
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
    	edu.mit.dig.saveface.model.Page.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,usernameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fanCountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,companyOverviewProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,websiteProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,categoryProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,productsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,createdTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,missionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,foundedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,pictureProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.Page.Page.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		username = null;
		id = null;
		name = null;
		fanCount = null;
		companyOverview = null;
		website = null;
		category = null;
		products = null;
		createdTime = null;
		mission = null;
		founded = null;
		picture = null;
		link = null;
		description = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initUsername() throws JastorException {
		username = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, usernameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#username properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				username.add(obj);
		}
	}

	public java.util.Iterator getUsername() throws JastorException {
		if (username == null)
			initUsername();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(username,_resource,usernameProperty,false);
	}

	public void addUsername(java.lang.String username) throws JastorException {
		if (this.username == null)
			initUsername();
		if (this.username.contains(username))
			return;
		if (_model.contains(_resource, usernameProperty, createLiteral(username)))
			return;
		this.username.add(username);
		_model.add(_resource, usernameProperty, createLiteral(username));
	}
	
	public void removeUsername(java.lang.String username) throws JastorException {
		if (this.username == null)
			initUsername();
		if (!this.username.contains(username))
			return;
		if (!_model.contains(_resource, usernameProperty, createLiteral(username)))
			return;
		this.username.remove(username);
		_model.removeAll(_resource, usernameProperty, createLiteral(username));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#id properties in Page model not a Literal", stmt.getObject());
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


	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#name properties in Page model not a Literal", stmt.getObject());
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


	private void initFanCount() throws JastorException {
		fanCount = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, fanCountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#fanCount properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
			if (obj != null)
				fanCount.add(obj);
		}
	}

	public java.util.Iterator getFanCount() throws JastorException {
		if (fanCount == null)
			initFanCount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(fanCount,_resource,fanCountProperty,false);
	}

	public void addFanCount(java.lang.Long fanCount) throws JastorException {
		if (this.fanCount == null)
			initFanCount();
		if (this.fanCount.contains(fanCount))
			return;
		if (_model.contains(_resource, fanCountProperty, createLiteral(fanCount)))
			return;
		this.fanCount.add(fanCount);
		_model.add(_resource, fanCountProperty, createLiteral(fanCount));
	}
	
	public void removeFanCount(java.lang.Long fanCount) throws JastorException {
		if (this.fanCount == null)
			initFanCount();
		if (!this.fanCount.contains(fanCount))
			return;
		if (!_model.contains(_resource, fanCountProperty, createLiteral(fanCount)))
			return;
		this.fanCount.remove(fanCount);
		_model.removeAll(_resource, fanCountProperty, createLiteral(fanCount));
	}


	private void initCompanyOverview() throws JastorException {
		companyOverview = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, companyOverviewProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#companyOverview properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				companyOverview.add(obj);
		}
	}

	public java.util.Iterator getCompanyOverview() throws JastorException {
		if (companyOverview == null)
			initCompanyOverview();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(companyOverview,_resource,companyOverviewProperty,false);
	}

	public void addCompanyOverview(java.lang.String companyOverview) throws JastorException {
		if (this.companyOverview == null)
			initCompanyOverview();
		if (this.companyOverview.contains(companyOverview))
			return;
		if (_model.contains(_resource, companyOverviewProperty, createLiteral(companyOverview)))
			return;
		this.companyOverview.add(companyOverview);
		_model.add(_resource, companyOverviewProperty, createLiteral(companyOverview));
	}
	
	public void removeCompanyOverview(java.lang.String companyOverview) throws JastorException {
		if (this.companyOverview == null)
			initCompanyOverview();
		if (!this.companyOverview.contains(companyOverview))
			return;
		if (!_model.contains(_resource, companyOverviewProperty, createLiteral(companyOverview)))
			return;
		this.companyOverview.remove(companyOverview);
		_model.removeAll(_resource, companyOverviewProperty, createLiteral(companyOverview));
	}


	private void initWebsite() throws JastorException {
		website = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, websiteProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#website properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				website.add(obj);
		}
	}

	public java.util.Iterator getWebsite() throws JastorException {
		if (website == null)
			initWebsite();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(website,_resource,websiteProperty,false);
	}

	public void addWebsite(java.lang.String website) throws JastorException {
		if (this.website == null)
			initWebsite();
		if (this.website.contains(website))
			return;
		if (_model.contains(_resource, websiteProperty, createLiteral(website)))
			return;
		this.website.add(website);
		_model.add(_resource, websiteProperty, createLiteral(website));
	}
	
	public void removeWebsite(java.lang.String website) throws JastorException {
		if (this.website == null)
			initWebsite();
		if (!this.website.contains(website))
			return;
		if (!_model.contains(_resource, websiteProperty, createLiteral(website)))
			return;
		this.website.remove(website);
		_model.removeAll(_resource, websiteProperty, createLiteral(website));
	}


	private void initCategory() throws JastorException {
		category = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, categoryProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#category properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				category.add(obj);
		}
	}

	public java.util.Iterator getCategory() throws JastorException {
		if (category == null)
			initCategory();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(category,_resource,categoryProperty,false);
	}

	public void addCategory(java.lang.String category) throws JastorException {
		if (this.category == null)
			initCategory();
		if (this.category.contains(category))
			return;
		if (_model.contains(_resource, categoryProperty, createLiteral(category)))
			return;
		this.category.add(category);
		_model.add(_resource, categoryProperty, createLiteral(category));
	}
	
	public void removeCategory(java.lang.String category) throws JastorException {
		if (this.category == null)
			initCategory();
		if (!this.category.contains(category))
			return;
		if (!_model.contains(_resource, categoryProperty, createLiteral(category)))
			return;
		this.category.remove(category);
		_model.removeAll(_resource, categoryProperty, createLiteral(category));
	}


	private void initProducts() throws JastorException {
		products = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, productsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#products properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				products.add(obj);
		}
	}

	public java.util.Iterator getProducts() throws JastorException {
		if (products == null)
			initProducts();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(products,_resource,productsProperty,false);
	}

	public void addProducts(java.lang.String products) throws JastorException {
		if (this.products == null)
			initProducts();
		if (this.products.contains(products))
			return;
		if (_model.contains(_resource, productsProperty, createLiteral(products)))
			return;
		this.products.add(products);
		_model.add(_resource, productsProperty, createLiteral(products));
	}
	
	public void removeProducts(java.lang.String products) throws JastorException {
		if (this.products == null)
			initProducts();
		if (!this.products.contains(products))
			return;
		if (!_model.contains(_resource, productsProperty, createLiteral(products)))
			return;
		this.products.remove(products);
		_model.removeAll(_resource, productsProperty, createLiteral(products));
	}


	private void initCreatedTime() throws JastorException {
		createdTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, createdTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#createdTime properties in Page model not a Literal", stmt.getObject());
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


	private void initMission() throws JastorException {
		mission = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, missionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#mission properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				mission.add(obj);
		}
	}

	public java.util.Iterator getMission() throws JastorException {
		if (mission == null)
			initMission();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(mission,_resource,missionProperty,false);
	}

	public void addMission(java.lang.String mission) throws JastorException {
		if (this.mission == null)
			initMission();
		if (this.mission.contains(mission))
			return;
		if (_model.contains(_resource, missionProperty, createLiteral(mission)))
			return;
		this.mission.add(mission);
		_model.add(_resource, missionProperty, createLiteral(mission));
	}
	
	public void removeMission(java.lang.String mission) throws JastorException {
		if (this.mission == null)
			initMission();
		if (!this.mission.contains(mission))
			return;
		if (!_model.contains(_resource, missionProperty, createLiteral(mission)))
			return;
		this.mission.remove(mission);
		_model.removeAll(_resource, missionProperty, createLiteral(mission));
	}


	private void initFounded() throws JastorException {
		founded = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, foundedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#founded properties in Page model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				founded.add(obj);
		}
	}

	public java.util.Iterator getFounded() throws JastorException {
		if (founded == null)
			initFounded();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(founded,_resource,foundedProperty,false);
	}

	public void addFounded(java.lang.String founded) throws JastorException {
		if (this.founded == null)
			initFounded();
		if (this.founded.contains(founded))
			return;
		if (_model.contains(_resource, foundedProperty, createLiteral(founded)))
			return;
		this.founded.add(founded);
		_model.add(_resource, foundedProperty, createLiteral(founded));
	}
	
	public void removeFounded(java.lang.String founded) throws JastorException {
		if (this.founded == null)
			initFounded();
		if (!this.founded.contains(founded))
			return;
		if (!_model.contains(_resource, foundedProperty, createLiteral(founded)))
			return;
		this.founded.remove(founded);
		_model.removeAll(_resource, foundedProperty, createLiteral(founded));
	}


	private void initPicture() throws JastorException {
		picture = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, pictureProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#picture properties in Page model not a Literal", stmt.getObject());
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


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#link properties in Page model not a Literal", stmt.getObject());
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


	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.foolme.csail.mit.edu/ns/saveface/Page.owl#description properties in Page model not a Literal", stmt.getObject());
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
		if (!(listener instanceof PageListener))
			throw new IllegalArgumentException("ThingListener must be instance of PageListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PageListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PageListener))
			throw new IllegalArgumentException("ThingListener must be instance of PageListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(usernameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (username == null) {
					try {
						initUsername();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !username.contains(obj))
					username.add(obj);
				java.util.ArrayList consumersForUsername;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForUsername = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForUsername.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.usernameAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(fanCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (fanCount == null) {
					try {
						initFanCount();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !fanCount.contains(obj))
					fanCount.add(obj);
				java.util.ArrayList consumersForFanCount;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFanCount = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFanCount.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.fanCountAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.Long)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(companyOverviewProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (companyOverview == null) {
					try {
						initCompanyOverview();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !companyOverview.contains(obj))
					companyOverview.add(obj);
				java.util.ArrayList consumersForCompanyOverview;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCompanyOverview = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCompanyOverview.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.companyOverviewAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(websiteProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (website == null) {
					try {
						initWebsite();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !website.contains(obj))
					website.add(obj);
				java.util.ArrayList consumersForWebsite;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForWebsite = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForWebsite.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.websiteAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(categoryProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (category == null) {
					try {
						initCategory();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !category.contains(obj))
					category.add(obj);
				java.util.ArrayList consumersForCategory;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCategory = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCategory.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.categoryAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(productsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (products == null) {
					try {
						initProducts();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !products.contains(obj))
					products.add(obj);
				java.util.ArrayList consumersForProducts;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForProducts = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForProducts.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.productsAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.createdTimeAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(missionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (mission == null) {
					try {
						initMission();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !mission.contains(obj))
					mission.add(obj);
				java.util.ArrayList consumersForMission;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForMission = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMission.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.missionAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(foundedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (founded == null) {
					try {
						initFounded();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !founded.contains(obj))
					founded.add(obj);
				java.util.ArrayList consumersForFounded;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFounded = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFounded.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.foundedAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.pictureAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
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
						PageListener listener=(PageListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(usernameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (username != null) {
					if (username.contains(obj))
						username.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.usernameRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(fanCountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Long","http://www.w3.org/2001/XMLSchema#long");
				if (fanCount != null) {
					if (fanCount.contains(obj))
						fanCount.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.fanCountRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.Long)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(companyOverviewProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (companyOverview != null) {
					if (companyOverview.contains(obj))
						companyOverview.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.companyOverviewRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(websiteProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (website != null) {
					if (website.contains(obj))
						website.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.websiteRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(categoryProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (category != null) {
					if (category.contains(obj))
						category.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.categoryRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(productsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (products != null) {
					if (products.contains(obj))
						products.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.productsRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.createdTimeRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(missionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (mission != null) {
					if (mission.contains(obj))
						mission.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.missionRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(foundedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (founded != null) {
					if (founded.contains(obj))
						founded.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PageListener listener=(PageListener)iter.next();
						listener.foundedRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.pictureRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
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
						PageListener listener=(PageListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
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
						PageListener listener=(PageListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.Page.PageImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
		}

	//}
	


}