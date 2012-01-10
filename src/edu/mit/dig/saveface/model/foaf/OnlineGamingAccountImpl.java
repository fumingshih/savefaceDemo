

package edu.mit.dig.saveface.model.foaf;

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
 * Implementation of {@link edu.mit.dig.saveface.model.foaf.OnlineGamingAccount}
 * Use the edu.mit.dig.saveface.model.foaf.Factory to create instances of this class.
 * <p>(URI: http://xmlns.com/foaf/0.1/OnlineGamingAccount)</p>
 * <br>
 */
public class OnlineGamingAccountImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.foaf.OnlineGamingAccount {
	

	private static com.hp.hpl.jena.rdf.model.Property icqChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/icqChatID");
	private java.util.ArrayList icqChatID;
	private static com.hp.hpl.jena.rdf.model.Property fundedByProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/fundedBy");
	private java.util.ArrayList fundedBy;
	private static com.hp.hpl.jena.rdf.model.Property dnaChecksumProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/dnaChecksum");
	private java.util.ArrayList dnaChecksum;
	private static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/title");
	private java.util.ArrayList title;
	private static com.hp.hpl.jena.rdf.model.Property phoneProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/phone");
	private java.util.ArrayList phone;
	private static com.hp.hpl.jena.rdf.model.Property makerProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/maker");
	private java.util.ArrayList maker;
	private static com.hp.hpl.jena.rdf.model.Property accountNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/accountName");
	private java.util.ArrayList accountName;
	private static com.hp.hpl.jena.rdf.model.Property mbox__sha1sumProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/mbox_sha1sum");
	private java.util.ArrayList mbox__sha1sum;
	private static com.hp.hpl.jena.rdf.model.Property msnChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/msnChatID");
	private java.util.ArrayList msnChatID;
	private static com.hp.hpl.jena.rdf.model.Property creatorProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/creator");
	private java.util.ArrayList creator;
	private static com.hp.hpl.jena.rdf.model.Property aimChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/aimChatID");
	private java.util.ArrayList aimChatID;
	private static com.hp.hpl.jena.rdf.model.Property givenNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/givenName");
	private java.util.ArrayList givenName;
	private static com.hp.hpl.jena.rdf.model.Property depictionProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/depiction");
	private java.util.ArrayList depiction;
	private static com.hp.hpl.jena.rdf.model.Property jabberIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/jabberID");
	private java.util.ArrayList jabberID;
	private static com.hp.hpl.jena.rdf.model.Property pageProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/page");
	private java.util.ArrayList page;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property labelProperty = ResourceFactory.createProperty("http://www.w3.org/2000/01/rdf-schema#label");
	private java.util.ArrayList label;
 

	OnlineGamingAccountImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static OnlineGamingAccountImpl getOnlineGamingAccount(Resource resource, Model model) throws JastorException {
		return new OnlineGamingAccountImpl(resource, model);
	}
	    
	static OnlineGamingAccountImpl createOnlineGamingAccount(Resource resource, Model model) throws JastorException { 
		OnlineGamingAccountImpl impl = new OnlineGamingAccountImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, OnlineGamingAccount.TYPE)))
			impl._model.add(impl._resource, RDF.type, OnlineGamingAccount.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, edu.mit.dig.saveface.model.foaf.OnlineAccount.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, edu.mit.dig.saveface.model.foaf.OnlineAccount.TYPE));     
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	edu.mit.dig.saveface.model.foaf.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,icqChatIDProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,fundedByProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dnaChecksumProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,titleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,phoneProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,makerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,accountNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,mbox__sha1sumProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,msnChatIDProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,creatorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,aimChatIDProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,givenNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,depictionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,jabberIDProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,pageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,labelProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.foaf.OnlineGamingAccount.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.foaf.OnlineAccount.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		icqChatID = null;
		fundedBy = null;
		dnaChecksum = null;
		title = null;
		phone = null;
		maker = null;
		accountName = null;
		mbox__sha1sum = null;
		msnChatID = null;
		creator = null;
		aimChatID = null;
		givenName = null;
		depiction = null;
		jabberID = null;
		page = null;
		name = null;
		label = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initIcqChatID() throws JastorException {
		icqChatID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, icqChatIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/icqChatID properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			icqChatID.add(literal);
		}
	}

	public java.util.Iterator getIcqChatID() throws JastorException {
		if (icqChatID == null)
			initIcqChatID();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(icqChatID,_resource,icqChatIDProperty,false);
	}

	public void addIcqChatID(com.hp.hpl.jena.rdf.model.Literal icqChatID) throws JastorException {
		if (this.icqChatID == null)
			initIcqChatID();
		if (this.icqChatID.contains(icqChatID))
			return;
		if (_model.contains(_resource, icqChatIDProperty, createLiteral(icqChatID)))
			return;
		this.icqChatID.add(icqChatID);
		_model.add(_resource, icqChatIDProperty, icqChatID);
	}
	
	public void removeIcqChatID(com.hp.hpl.jena.rdf.model.Literal icqChatID) throws JastorException {
		if (this.icqChatID == null)
			initIcqChatID();
		if (!this.icqChatID.contains(icqChatID))
			return;
		if (!_model.contains(_resource, icqChatIDProperty, createLiteral(icqChatID)))
			return;
		this.icqChatID.remove(icqChatID);
		_model.removeAll(_resource, icqChatIDProperty, createLiteral(icqChatID));
	}


	private void initFundedBy() throws JastorException {
		this.fundedBy = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, fundedByProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/fundedBy properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing fundedBy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.fundedBy.add(fundedBy);
			}
		}
	}

	public java.util.Iterator getFundedBy() throws JastorException {
		if (fundedBy == null)
			initFundedBy();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(fundedBy,_resource,fundedByProperty,true);
	}

	public void addFundedBy(com.ibm.adtech.jastor.Thing fundedBy) throws JastorException {
		if (this.fundedBy == null)
			initFundedBy();
		if (this.fundedBy.contains(fundedBy)) {
			this.fundedBy.remove(fundedBy);
			this.fundedBy.add(fundedBy);
			return;
		}
		this.fundedBy.add(fundedBy);
		_model.add(_model.createStatement(_resource,fundedByProperty,fundedBy.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addFundedBy() throws JastorException {
		com.ibm.adtech.jastor.Thing fundedBy = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.fundedBy == null)
			initFundedBy();
		this.fundedBy.add(fundedBy);
		_model.add(_model.createStatement(_resource,fundedByProperty,fundedBy.resource()));
		return fundedBy;
	}
	
	public com.ibm.adtech.jastor.Thing addFundedBy(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing fundedBy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.fundedBy == null)
			initFundedBy();
		if (this.fundedBy.contains(fundedBy))
			return fundedBy;
		this.fundedBy.add(fundedBy);
		_model.add(_model.createStatement(_resource,fundedByProperty,fundedBy.resource()));
		return fundedBy;
	}
	
	public void removeFundedBy(com.ibm.adtech.jastor.Thing fundedBy) throws JastorException {
		if (this.fundedBy == null)
			initFundedBy();
		if (!this.fundedBy.contains(fundedBy))
			return;
		if (!_model.contains(_resource, fundedByProperty, fundedBy.resource()))
			return;
		this.fundedBy.remove(fundedBy);
		_model.removeAll(_resource, fundedByProperty, fundedBy.resource());
	}
		 

	private void initDnaChecksum() throws JastorException {
		dnaChecksum = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dnaChecksumProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/dnaChecksum properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			dnaChecksum.add(literal);
		}
	}

	public java.util.Iterator getDnaChecksum() throws JastorException {
		if (dnaChecksum == null)
			initDnaChecksum();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(dnaChecksum,_resource,dnaChecksumProperty,false);
	}

	public void addDnaChecksum(com.hp.hpl.jena.rdf.model.Literal dnaChecksum) throws JastorException {
		if (this.dnaChecksum == null)
			initDnaChecksum();
		if (this.dnaChecksum.contains(dnaChecksum))
			return;
		if (_model.contains(_resource, dnaChecksumProperty, createLiteral(dnaChecksum)))
			return;
		this.dnaChecksum.add(dnaChecksum);
		_model.add(_resource, dnaChecksumProperty, dnaChecksum);
	}
	
	public void removeDnaChecksum(com.hp.hpl.jena.rdf.model.Literal dnaChecksum) throws JastorException {
		if (this.dnaChecksum == null)
			initDnaChecksum();
		if (!this.dnaChecksum.contains(dnaChecksum))
			return;
		if (!_model.contains(_resource, dnaChecksumProperty, createLiteral(dnaChecksum)))
			return;
		this.dnaChecksum.remove(dnaChecksum);
		_model.removeAll(_resource, dnaChecksumProperty, createLiteral(dnaChecksum));
	}


	private void initTitle() throws JastorException {
		title = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, titleProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/title properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			title.add(literal);
		}
	}

	public java.util.Iterator getTitle() throws JastorException {
		if (title == null)
			initTitle();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(title,_resource,titleProperty,false);
	}

	public void addTitle(com.hp.hpl.jena.rdf.model.Literal title) throws JastorException {
		if (this.title == null)
			initTitle();
		if (this.title.contains(title))
			return;
		if (_model.contains(_resource, titleProperty, createLiteral(title)))
			return;
		this.title.add(title);
		_model.add(_resource, titleProperty, title);
	}
	
	public void removeTitle(com.hp.hpl.jena.rdf.model.Literal title) throws JastorException {
		if (this.title == null)
			initTitle();
		if (!this.title.contains(title))
			return;
		if (!_model.contains(_resource, titleProperty, createLiteral(title)))
			return;
		this.title.remove(title);
		_model.removeAll(_resource, titleProperty, createLiteral(title));
	}


	private void initPhone() throws JastorException {
		this.phone = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, phoneProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/phone properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing phone = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.phone.add(phone);
			}
		}
	}

	public java.util.Iterator getPhone() throws JastorException {
		if (phone == null)
			initPhone();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(phone,_resource,phoneProperty,true);
	}

	public void addPhone(com.ibm.adtech.jastor.Thing phone) throws JastorException {
		if (this.phone == null)
			initPhone();
		if (this.phone.contains(phone)) {
			this.phone.remove(phone);
			this.phone.add(phone);
			return;
		}
		this.phone.add(phone);
		_model.add(_model.createStatement(_resource,phoneProperty,phone.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPhone() throws JastorException {
		com.ibm.adtech.jastor.Thing phone = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.phone == null)
			initPhone();
		this.phone.add(phone);
		_model.add(_model.createStatement(_resource,phoneProperty,phone.resource()));
		return phone;
	}
	
	public com.ibm.adtech.jastor.Thing addPhone(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing phone = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.phone == null)
			initPhone();
		if (this.phone.contains(phone))
			return phone;
		this.phone.add(phone);
		_model.add(_model.createStatement(_resource,phoneProperty,phone.resource()));
		return phone;
	}
	
	public void removePhone(com.ibm.adtech.jastor.Thing phone) throws JastorException {
		if (this.phone == null)
			initPhone();
		if (!this.phone.contains(phone))
			return;
		if (!_model.contains(_resource, phoneProperty, phone.resource()))
			return;
		this.phone.remove(phone);
		_model.removeAll(_resource, phoneProperty, phone.resource());
	}
		 

	private void initMaker() throws JastorException {
		this.maker = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, makerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/maker properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Agent maker = edu.mit.dig.saveface.model.foaf.Factory.getAgent(resource,_model);
				this.maker.add(maker);
			}
		}
	}

	public java.util.Iterator getMaker() throws JastorException {
		if (maker == null)
			initMaker();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(maker,_resource,makerProperty,true);
	}

	public void addMaker(edu.mit.dig.saveface.model.foaf.Agent maker) throws JastorException {
		if (this.maker == null)
			initMaker();
		if (this.maker.contains(maker)) {
			this.maker.remove(maker);
			this.maker.add(maker);
			return;
		}
		this.maker.add(maker);
		_model.add(_model.createStatement(_resource,makerProperty,maker.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Agent addMaker() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Agent maker = edu.mit.dig.saveface.model.foaf.Factory.createAgent(_model.createResource(),_model);
		if (this.maker == null)
			initMaker();
		this.maker.add(maker);
		_model.add(_model.createStatement(_resource,makerProperty,maker.resource()));
		return maker;
	}
	
	public edu.mit.dig.saveface.model.foaf.Agent addMaker(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Agent maker = edu.mit.dig.saveface.model.foaf.Factory.getAgent(resource,_model);
		if (this.maker == null)
			initMaker();
		if (this.maker.contains(maker))
			return maker;
		this.maker.add(maker);
		_model.add(_model.createStatement(_resource,makerProperty,maker.resource()));
		return maker;
	}
	
	public void removeMaker(edu.mit.dig.saveface.model.foaf.Agent maker) throws JastorException {
		if (this.maker == null)
			initMaker();
		if (!this.maker.contains(maker))
			return;
		if (!_model.contains(_resource, makerProperty, maker.resource()))
			return;
		this.maker.remove(maker);
		_model.removeAll(_resource, makerProperty, maker.resource());
	}
		 

	private void initAccountName() throws JastorException {
		accountName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, accountNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/accountName properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			accountName.add(literal);
		}
	}

	public java.util.Iterator getAccountName() throws JastorException {
		if (accountName == null)
			initAccountName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(accountName,_resource,accountNameProperty,false);
	}

	public void addAccountName(com.hp.hpl.jena.rdf.model.Literal accountName) throws JastorException {
		if (this.accountName == null)
			initAccountName();
		if (this.accountName.contains(accountName))
			return;
		if (_model.contains(_resource, accountNameProperty, createLiteral(accountName)))
			return;
		this.accountName.add(accountName);
		_model.add(_resource, accountNameProperty, accountName);
	}
	
	public void removeAccountName(com.hp.hpl.jena.rdf.model.Literal accountName) throws JastorException {
		if (this.accountName == null)
			initAccountName();
		if (!this.accountName.contains(accountName))
			return;
		if (!_model.contains(_resource, accountNameProperty, createLiteral(accountName)))
			return;
		this.accountName.remove(accountName);
		_model.removeAll(_resource, accountNameProperty, createLiteral(accountName));
	}


	private void initMbox__sha1sum() throws JastorException {
		mbox__sha1sum = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, mbox__sha1sumProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/mbox_sha1sum properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			mbox__sha1sum.add(literal);
		}
	}

	public java.util.Iterator getMbox__sha1sum() throws JastorException {
		if (mbox__sha1sum == null)
			initMbox__sha1sum();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(mbox__sha1sum,_resource,mbox__sha1sumProperty,false);
	}

	public void addMbox__sha1sum(com.hp.hpl.jena.rdf.model.Literal mbox__sha1sum) throws JastorException {
		if (this.mbox__sha1sum == null)
			initMbox__sha1sum();
		if (this.mbox__sha1sum.contains(mbox__sha1sum))
			return;
		if (_model.contains(_resource, mbox__sha1sumProperty, createLiteral(mbox__sha1sum)))
			return;
		this.mbox__sha1sum.add(mbox__sha1sum);
		_model.add(_resource, mbox__sha1sumProperty, mbox__sha1sum);
	}
	
	public void removeMbox__sha1sum(com.hp.hpl.jena.rdf.model.Literal mbox__sha1sum) throws JastorException {
		if (this.mbox__sha1sum == null)
			initMbox__sha1sum();
		if (!this.mbox__sha1sum.contains(mbox__sha1sum))
			return;
		if (!_model.contains(_resource, mbox__sha1sumProperty, createLiteral(mbox__sha1sum)))
			return;
		this.mbox__sha1sum.remove(mbox__sha1sum);
		_model.removeAll(_resource, mbox__sha1sumProperty, createLiteral(mbox__sha1sum));
	}


	private void initMsnChatID() throws JastorException {
		msnChatID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, msnChatIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/msnChatID properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			msnChatID.add(literal);
		}
	}

	public java.util.Iterator getMsnChatID() throws JastorException {
		if (msnChatID == null)
			initMsnChatID();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(msnChatID,_resource,msnChatIDProperty,false);
	}

	public void addMsnChatID(com.hp.hpl.jena.rdf.model.Literal msnChatID) throws JastorException {
		if (this.msnChatID == null)
			initMsnChatID();
		if (this.msnChatID.contains(msnChatID))
			return;
		if (_model.contains(_resource, msnChatIDProperty, createLiteral(msnChatID)))
			return;
		this.msnChatID.add(msnChatID);
		_model.add(_resource, msnChatIDProperty, msnChatID);
	}
	
	public void removeMsnChatID(com.hp.hpl.jena.rdf.model.Literal msnChatID) throws JastorException {
		if (this.msnChatID == null)
			initMsnChatID();
		if (!this.msnChatID.contains(msnChatID))
			return;
		if (!_model.contains(_resource, msnChatIDProperty, createLiteral(msnChatID)))
			return;
		this.msnChatID.remove(msnChatID);
		_model.removeAll(_resource, msnChatIDProperty, createLiteral(msnChatID));
	}


	private void initCreator() throws JastorException {
		this.creator = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, creatorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/creator properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing creator = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.creator.add(creator);
			}
		}
	}

	public java.util.Iterator getCreator() throws JastorException {
		if (creator == null)
			initCreator();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(creator,_resource,creatorProperty,true);
	}

	public void addCreator(com.ibm.adtech.jastor.Thing creator) throws JastorException {
		if (this.creator == null)
			initCreator();
		if (this.creator.contains(creator)) {
			this.creator.remove(creator);
			this.creator.add(creator);
			return;
		}
		this.creator.add(creator);
		_model.add(_model.createStatement(_resource,creatorProperty,creator.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addCreator() throws JastorException {
		com.ibm.adtech.jastor.Thing creator = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.creator == null)
			initCreator();
		this.creator.add(creator);
		_model.add(_model.createStatement(_resource,creatorProperty,creator.resource()));
		return creator;
	}
	
	public com.ibm.adtech.jastor.Thing addCreator(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing creator = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.creator == null)
			initCreator();
		if (this.creator.contains(creator))
			return creator;
		this.creator.add(creator);
		_model.add(_model.createStatement(_resource,creatorProperty,creator.resource()));
		return creator;
	}
	
	public void removeCreator(com.ibm.adtech.jastor.Thing creator) throws JastorException {
		if (this.creator == null)
			initCreator();
		if (!this.creator.contains(creator))
			return;
		if (!_model.contains(_resource, creatorProperty, creator.resource()))
			return;
		this.creator.remove(creator);
		_model.removeAll(_resource, creatorProperty, creator.resource());
	}
		 

	private void initAimChatID() throws JastorException {
		aimChatID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, aimChatIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/aimChatID properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			aimChatID.add(literal);
		}
	}

	public java.util.Iterator getAimChatID() throws JastorException {
		if (aimChatID == null)
			initAimChatID();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(aimChatID,_resource,aimChatIDProperty,false);
	}

	public void addAimChatID(com.hp.hpl.jena.rdf.model.Literal aimChatID) throws JastorException {
		if (this.aimChatID == null)
			initAimChatID();
		if (this.aimChatID.contains(aimChatID))
			return;
		if (_model.contains(_resource, aimChatIDProperty, createLiteral(aimChatID)))
			return;
		this.aimChatID.add(aimChatID);
		_model.add(_resource, aimChatIDProperty, aimChatID);
	}
	
	public void removeAimChatID(com.hp.hpl.jena.rdf.model.Literal aimChatID) throws JastorException {
		if (this.aimChatID == null)
			initAimChatID();
		if (!this.aimChatID.contains(aimChatID))
			return;
		if (!_model.contains(_resource, aimChatIDProperty, createLiteral(aimChatID)))
			return;
		this.aimChatID.remove(aimChatID);
		_model.removeAll(_resource, aimChatIDProperty, createLiteral(aimChatID));
	}


	private void initGivenName() throws JastorException {
		givenName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, givenNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/givenName properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			givenName.add(literal);
		}
	}

	public java.util.Iterator getGivenName() throws JastorException {
		if (givenName == null)
			initGivenName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(givenName,_resource,givenNameProperty,false);
	}

	public void addGivenName(com.hp.hpl.jena.rdf.model.Literal givenName) throws JastorException {
		if (this.givenName == null)
			initGivenName();
		if (this.givenName.contains(givenName))
			return;
		if (_model.contains(_resource, givenNameProperty, createLiteral(givenName)))
			return;
		this.givenName.add(givenName);
		_model.add(_resource, givenNameProperty, givenName);
	}
	
	public void removeGivenName(com.hp.hpl.jena.rdf.model.Literal givenName) throws JastorException {
		if (this.givenName == null)
			initGivenName();
		if (!this.givenName.contains(givenName))
			return;
		if (!_model.contains(_resource, givenNameProperty, createLiteral(givenName)))
			return;
		this.givenName.remove(givenName);
		_model.removeAll(_resource, givenNameProperty, createLiteral(givenName));
	}


	private void initDepiction() throws JastorException {
		this.depiction = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, depictionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/depiction properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Image depiction = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
				this.depiction.add(depiction);
			}
		}
	}

	public java.util.Iterator getDepiction() throws JastorException {
		if (depiction == null)
			initDepiction();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(depiction,_resource,depictionProperty,true);
	}

	public void addDepiction(edu.mit.dig.saveface.model.foaf.Image depiction) throws JastorException {
		if (this.depiction == null)
			initDepiction();
		if (this.depiction.contains(depiction)) {
			this.depiction.remove(depiction);
			this.depiction.add(depiction);
			return;
		}
		this.depiction.add(depiction);
		_model.add(_model.createStatement(_resource,depictionProperty,depiction.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Image addDepiction() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Image depiction = edu.mit.dig.saveface.model.foaf.Factory.createImage(_model.createResource(),_model);
		if (this.depiction == null)
			initDepiction();
		this.depiction.add(depiction);
		_model.add(_model.createStatement(_resource,depictionProperty,depiction.resource()));
		return depiction;
	}
	
	public edu.mit.dig.saveface.model.foaf.Image addDepiction(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Image depiction = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
		if (this.depiction == null)
			initDepiction();
		if (this.depiction.contains(depiction))
			return depiction;
		this.depiction.add(depiction);
		_model.add(_model.createStatement(_resource,depictionProperty,depiction.resource()));
		return depiction;
	}
	
	public void removeDepiction(edu.mit.dig.saveface.model.foaf.Image depiction) throws JastorException {
		if (this.depiction == null)
			initDepiction();
		if (!this.depiction.contains(depiction))
			return;
		if (!_model.contains(_resource, depictionProperty, depiction.resource()))
			return;
		this.depiction.remove(depiction);
		_model.removeAll(_resource, depictionProperty, depiction.resource());
	}
		 

	private void initJabberID() throws JastorException {
		jabberID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, jabberIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/jabberID properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			jabberID.add(literal);
		}
	}

	public java.util.Iterator getJabberID() throws JastorException {
		if (jabberID == null)
			initJabberID();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(jabberID,_resource,jabberIDProperty,false);
	}

	public void addJabberID(com.hp.hpl.jena.rdf.model.Literal jabberID) throws JastorException {
		if (this.jabberID == null)
			initJabberID();
		if (this.jabberID.contains(jabberID))
			return;
		if (_model.contains(_resource, jabberIDProperty, createLiteral(jabberID)))
			return;
		this.jabberID.add(jabberID);
		_model.add(_resource, jabberIDProperty, jabberID);
	}
	
	public void removeJabberID(com.hp.hpl.jena.rdf.model.Literal jabberID) throws JastorException {
		if (this.jabberID == null)
			initJabberID();
		if (!this.jabberID.contains(jabberID))
			return;
		if (!_model.contains(_resource, jabberIDProperty, createLiteral(jabberID)))
			return;
		this.jabberID.remove(jabberID);
		_model.removeAll(_resource, jabberIDProperty, createLiteral(jabberID));
	}


	private void initPage() throws JastorException {
		this.page = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, pageProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/page properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Document page = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
				this.page.add(page);
			}
		}
	}

	public java.util.Iterator getPage() throws JastorException {
		if (page == null)
			initPage();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(page,_resource,pageProperty,true);
	}

	public void addPage(edu.mit.dig.saveface.model.foaf.Document page) throws JastorException {
		if (this.page == null)
			initPage();
		if (this.page.contains(page)) {
			this.page.remove(page);
			this.page.add(page);
			return;
		}
		this.page.add(page);
		_model.add(_model.createStatement(_resource,pageProperty,page.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addPage() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document page = edu.mit.dig.saveface.model.foaf.Factory.createDocument(_model.createResource(),_model);
		if (this.page == null)
			initPage();
		this.page.add(page);
		_model.add(_model.createStatement(_resource,pageProperty,page.resource()));
		return page;
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addPage(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document page = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
		if (this.page == null)
			initPage();
		if (this.page.contains(page))
			return page;
		this.page.add(page);
		_model.add(_model.createStatement(_resource,pageProperty,page.resource()));
		return page;
	}
	
	public void removePage(edu.mit.dig.saveface.model.foaf.Document page) throws JastorException {
		if (this.page == null)
			initPage();
		if (!this.page.contains(page))
			return;
		if (!_model.contains(_resource, pageProperty, page.resource()))
			return;
		this.page.remove(page);
		_model.removeAll(_resource, pageProperty, page.resource());
	}
		 

	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/name properties in OnlineGamingAccount model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			name.add(literal);
		}
	}

	public java.util.Iterator getName() throws JastorException {
		if (name == null)
			initName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(name,_resource,nameProperty,false);
	}

	public void addName(com.hp.hpl.jena.rdf.model.Literal name) throws JastorException {
		if (this.name == null)
			initName();
		if (this.name.contains(name))
			return;
		if (_model.contains(_resource, nameProperty, createLiteral(name)))
			return;
		this.name.add(name);
		_model.add(_resource, nameProperty, name);
	}
	
	public void removeName(com.hp.hpl.jena.rdf.model.Literal name) throws JastorException {
		if (this.name == null)
			initName();
		if (!this.name.contains(name))
			return;
		if (!_model.contains(_resource, nameProperty, createLiteral(name)))
			return;
		this.name.remove(name);
		_model.removeAll(_resource, nameProperty, createLiteral(name));
	}


	private void initLabel() throws JastorException {
		this.label = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, labelProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2000/01/rdf-schema#label properties in OnlineGamingAccount model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing label = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.label.add(label);
			}
		}
	}

	public java.util.Iterator getLabel() throws JastorException {
		if (label == null)
			initLabel();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(label,_resource,labelProperty,true);
	}

	public void addLabel(com.ibm.adtech.jastor.Thing label) throws JastorException {
		if (this.label == null)
			initLabel();
		if (this.label.contains(label)) {
			this.label.remove(label);
			this.label.add(label);
			return;
		}
		this.label.add(label);
		_model.add(_model.createStatement(_resource,labelProperty,label.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLabel() throws JastorException {
		com.ibm.adtech.jastor.Thing label = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.label == null)
			initLabel();
		this.label.add(label);
		_model.add(_model.createStatement(_resource,labelProperty,label.resource()));
		return label;
	}
	
	public com.ibm.adtech.jastor.Thing addLabel(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing label = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.label == null)
			initLabel();
		if (this.label.contains(label))
			return label;
		this.label.add(label);
		_model.add(_model.createStatement(_resource,labelProperty,label.resource()));
		return label;
	}
	
	public void removeLabel(com.ibm.adtech.jastor.Thing label) throws JastorException {
		if (this.label == null)
			initLabel();
		if (!this.label.contains(label))
			return;
		if (!_model.contains(_resource, labelProperty, label.resource()))
			return;
		this.label.remove(label);
		_model.removeAll(_resource, labelProperty, label.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof OnlineGamingAccountListener))
			throw new IllegalArgumentException("ThingListener must be instance of OnlineGamingAccountListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((OnlineGamingAccountListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof OnlineGamingAccountListener))
			throw new IllegalArgumentException("ThingListener must be instance of OnlineGamingAccountListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(icqChatIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (icqChatID == null)
					try {
						initIcqChatID();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!icqChatID.contains(literal))
					icqChatID.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForIcqChatID;
					synchronized (listeners) {
						consumersForIcqChatID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForIcqChatID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.icqChatIDAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(fundedByProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _fundedBy = null;
					try {
						_fundedBy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (fundedBy == null) {
						try {
							initFundedBy();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!fundedBy.contains(_fundedBy))
						fundedBy.add(_fundedBy);
					if (listeners != null) {
						java.util.ArrayList consumersForFundedBy;
						synchronized (listeners) {
							consumersForFundedBy = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFundedBy.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.fundedByAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_fundedBy);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dnaChecksumProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (dnaChecksum == null)
					try {
						initDnaChecksum();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!dnaChecksum.contains(literal))
					dnaChecksum.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForDnaChecksum;
					synchronized (listeners) {
						consumersForDnaChecksum = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDnaChecksum.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.dnaChecksumAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(titleProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (title == null)
					try {
						initTitle();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!title.contains(literal))
					title.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForTitle;
					synchronized (listeners) {
						consumersForTitle = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForTitle.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.titleAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(phoneProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _phone = null;
					try {
						_phone = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (phone == null) {
						try {
							initPhone();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!phone.contains(_phone))
						phone.add(_phone);
					if (listeners != null) {
						java.util.ArrayList consumersForPhone;
						synchronized (listeners) {
							consumersForPhone = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhone.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.phoneAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_phone);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(makerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Agent _maker = null;
					try {
						_maker = edu.mit.dig.saveface.model.foaf.Factory.getAgent(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (maker == null) {
						try {
							initMaker();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!maker.contains(_maker))
						maker.add(_maker);
					if (listeners != null) {
						java.util.ArrayList consumersForMaker;
						synchronized (listeners) {
							consumersForMaker = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMaker.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.makerAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_maker);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(accountNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (accountName == null)
					try {
						initAccountName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!accountName.contains(literal))
					accountName.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForAccountName;
					synchronized (listeners) {
						consumersForAccountName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAccountName.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.accountNameAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mbox__sha1sumProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (mbox__sha1sum == null)
					try {
						initMbox__sha1sum();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!mbox__sha1sum.contains(literal))
					mbox__sha1sum.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForMbox__sha1sum;
					synchronized (listeners) {
						consumersForMbox__sha1sum = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMbox__sha1sum.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.mbox__sha1sumAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(msnChatIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (msnChatID == null)
					try {
						initMsnChatID();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!msnChatID.contains(literal))
					msnChatID.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForMsnChatID;
					synchronized (listeners) {
						consumersForMsnChatID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMsnChatID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.msnChatIDAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(creatorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _creator = null;
					try {
						_creator = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (creator == null) {
						try {
							initCreator();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!creator.contains(_creator))
						creator.add(_creator);
					if (listeners != null) {
						java.util.ArrayList consumersForCreator;
						synchronized (listeners) {
							consumersForCreator = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCreator.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.creatorAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_creator);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(aimChatIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (aimChatID == null)
					try {
						initAimChatID();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!aimChatID.contains(literal))
					aimChatID.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForAimChatID;
					synchronized (listeners) {
						consumersForAimChatID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAimChatID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.aimChatIDAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(givenNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (givenName == null)
					try {
						initGivenName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!givenName.contains(literal))
					givenName.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForGivenName;
					synchronized (listeners) {
						consumersForGivenName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGivenName.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.givenNameAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(depictionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Image _depiction = null;
					try {
						_depiction = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (depiction == null) {
						try {
							initDepiction();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!depiction.contains(_depiction))
						depiction.add(_depiction);
					if (listeners != null) {
						java.util.ArrayList consumersForDepiction;
						synchronized (listeners) {
							consumersForDepiction = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDepiction.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.depictionAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_depiction);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(jabberIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (jabberID == null)
					try {
						initJabberID();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!jabberID.contains(literal))
					jabberID.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForJabberID;
					synchronized (listeners) {
						consumersForJabberID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForJabberID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.jabberIDAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(pageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _page = null;
					try {
						_page = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (page == null) {
						try {
							initPage();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!page.contains(_page))
						page.add(_page);
					if (listeners != null) {
						java.util.ArrayList consumersForPage;
						synchronized (listeners) {
							consumersForPage = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPage.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.pageAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_page);
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
				if (name == null)
					try {
						initName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!name.contains(literal))
					name.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForName;
					synchronized (listeners) {
						consumersForName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForName.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(labelProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _label = null;
					try {
						_label = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (label == null) {
						try {
							initLabel();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!label.contains(_label))
						label.add(_label);
					if (listeners != null) {
						java.util.ArrayList consumersForLabel;
						synchronized (listeners) {
							consumersForLabel = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLabel.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.labelAdded(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_label);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(icqChatIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (icqChatID != null) {
					if (icqChatID.contains(literal))
						icqChatID.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForIcqChatID;
					synchronized (listeners) {
						consumersForIcqChatID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForIcqChatID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.icqChatIDRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(fundedByProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _fundedBy = null;
					if (fundedBy != null) {
						boolean found = false;
						for (int i=0;i<fundedBy.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) fundedBy.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_fundedBy = __item;
								break;
							}
						}
						if (found)
							fundedBy.remove(_fundedBy);
						else {
							try {
								_fundedBy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_fundedBy = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForFundedBy;
						synchronized (listeners) {
							consumersForFundedBy = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFundedBy.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.fundedByRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_fundedBy);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dnaChecksumProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (dnaChecksum != null) {
					if (dnaChecksum.contains(literal))
						dnaChecksum.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForDnaChecksum;
					synchronized (listeners) {
						consumersForDnaChecksum = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDnaChecksum.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.dnaChecksumRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(titleProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (title != null) {
					if (title.contains(literal))
						title.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForTitle;
					synchronized (listeners) {
						consumersForTitle = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForTitle.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.titleRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(phoneProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _phone = null;
					if (phone != null) {
						boolean found = false;
						for (int i=0;i<phone.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) phone.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_phone = __item;
								break;
							}
						}
						if (found)
							phone.remove(_phone);
						else {
							try {
								_phone = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_phone = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPhone;
						synchronized (listeners) {
							consumersForPhone = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhone.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.phoneRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_phone);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(makerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Agent _maker = null;
					if (maker != null) {
						boolean found = false;
						for (int i=0;i<maker.size();i++) {
							edu.mit.dig.saveface.model.foaf.Agent __item = (edu.mit.dig.saveface.model.foaf.Agent) maker.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_maker = __item;
								break;
							}
						}
						if (found)
							maker.remove(_maker);
						else {
							try {
								_maker = edu.mit.dig.saveface.model.foaf.Factory.getAgent(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_maker = edu.mit.dig.saveface.model.foaf.Factory.getAgent(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMaker;
						synchronized (listeners) {
							consumersForMaker = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMaker.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.makerRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_maker);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(accountNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (accountName != null) {
					if (accountName.contains(literal))
						accountName.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForAccountName;
					synchronized (listeners) {
						consumersForAccountName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAccountName.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.accountNameRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mbox__sha1sumProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (mbox__sha1sum != null) {
					if (mbox__sha1sum.contains(literal))
						mbox__sha1sum.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForMbox__sha1sum;
					synchronized (listeners) {
						consumersForMbox__sha1sum = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMbox__sha1sum.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.mbox__sha1sumRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(msnChatIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (msnChatID != null) {
					if (msnChatID.contains(literal))
						msnChatID.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForMsnChatID;
					synchronized (listeners) {
						consumersForMsnChatID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMsnChatID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.msnChatIDRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(creatorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _creator = null;
					if (creator != null) {
						boolean found = false;
						for (int i=0;i<creator.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) creator.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_creator = __item;
								break;
							}
						}
						if (found)
							creator.remove(_creator);
						else {
							try {
								_creator = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_creator = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForCreator;
						synchronized (listeners) {
							consumersForCreator = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCreator.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.creatorRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_creator);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(aimChatIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (aimChatID != null) {
					if (aimChatID.contains(literal))
						aimChatID.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForAimChatID;
					synchronized (listeners) {
						consumersForAimChatID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAimChatID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.aimChatIDRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(givenNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (givenName != null) {
					if (givenName.contains(literal))
						givenName.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForGivenName;
					synchronized (listeners) {
						consumersForGivenName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGivenName.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.givenNameRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(depictionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Image _depiction = null;
					if (depiction != null) {
						boolean found = false;
						for (int i=0;i<depiction.size();i++) {
							edu.mit.dig.saveface.model.foaf.Image __item = (edu.mit.dig.saveface.model.foaf.Image) depiction.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_depiction = __item;
								break;
							}
						}
						if (found)
							depiction.remove(_depiction);
						else {
							try {
								_depiction = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_depiction = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForDepiction;
						synchronized (listeners) {
							consumersForDepiction = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDepiction.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.depictionRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_depiction);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(jabberIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (jabberID != null) {
					if (jabberID.contains(literal))
						jabberID.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForJabberID;
					synchronized (listeners) {
						consumersForJabberID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForJabberID.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.jabberIDRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(pageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _page = null;
					if (page != null) {
						boolean found = false;
						for (int i=0;i<page.size();i++) {
							edu.mit.dig.saveface.model.foaf.Document __item = (edu.mit.dig.saveface.model.foaf.Document) page.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_page = __item;
								break;
							}
						}
						if (found)
							page.remove(_page);
						else {
							try {
								_page = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_page = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPage;
						synchronized (listeners) {
							consumersForPage = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPage.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.pageRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_page);
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
				if (name != null) {
					if (name.contains(literal))
						name.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForName;
					synchronized (listeners) {
						consumersForName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForName.iterator();iter.hasNext();){
						OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(labelProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _label = null;
					if (label != null) {
						boolean found = false;
						for (int i=0;i<label.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) label.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_label = __item;
								break;
							}
						}
						if (found)
							label.remove(_label);
						else {
							try {
								_label = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_label = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLabel;
						synchronized (listeners) {
							consumersForLabel = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLabel.iterator();iter.hasNext();){
							OnlineGamingAccountListener listener=(OnlineGamingAccountListener)iter.next();
							listener.labelRemoved(edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.this,_label);
						}
					}
				}
				return;
			}
		}

	//}
	


}