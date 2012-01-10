

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
 * Implementation of {@link edu.mit.dig.saveface.model.foaf.Person}
 * Use the edu.mit.dig.saveface.model.foaf.Factory to create instances of this class.
 * <p>(URI: http://xmlns.com/foaf/0.1/Person)</p>
 * <br>
 */
public class PersonImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.foaf.Person {
	

	private static com.hp.hpl.jena.rdf.model.Property based__nearProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/based_near");
	private java.util.ArrayList based__near;
	private static com.hp.hpl.jena.rdf.model.Property statusProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/status");
	private java.util.ArrayList status;
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
	private static com.hp.hpl.jena.rdf.model.Property mbox__sha1sumProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/mbox_sha1sum");
	private java.util.ArrayList mbox__sha1sum;
	private static com.hp.hpl.jena.rdf.model.Property msnChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/msnChatID");
	private java.util.ArrayList msnChatID;
	private static com.hp.hpl.jena.rdf.model.Property mboxProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/mbox");
	private java.util.ArrayList mbox;
	private static com.hp.hpl.jena.rdf.model.Property creatorProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/creator");
	private java.util.ArrayList creator;
	private static com.hp.hpl.jena.rdf.model.Property accountProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/account");
	private java.util.ArrayList account;
	private static com.hp.hpl.jena.rdf.model.Property ageProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/age");
	private com.hp.hpl.jena.rdf.model.Literal age;
	private static com.hp.hpl.jena.rdf.model.Property birthdayProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/birthday");
	private com.hp.hpl.jena.rdf.model.Literal birthday;
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
	private static com.hp.hpl.jena.rdf.model.Property skypeIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/skypeID");
	private java.util.ArrayList skypeID;
	private static com.hp.hpl.jena.rdf.model.Property genderProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/gender");
	private com.hp.hpl.jena.rdf.model.Literal gender;
	private static com.hp.hpl.jena.rdf.model.Property madeProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/made");
	private java.util.ArrayList made;
	private static com.hp.hpl.jena.rdf.model.Property weblogProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/weblog");
	private java.util.ArrayList weblog;
	private static com.hp.hpl.jena.rdf.model.Property holdsAccountProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/holdsAccount");
	private java.util.ArrayList holdsAccount;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property labelProperty = ResourceFactory.createProperty("http://www.w3.org/2000/01/rdf-schema#label");
	private java.util.ArrayList label;
	private static com.hp.hpl.jena.rdf.model.Property publicationsProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/publications");
	private java.util.ArrayList publications;
	private static com.hp.hpl.jena.rdf.model.Property workInfoHomepageProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/workInfoHomepage");
	private java.util.ArrayList workInfoHomepage;
	private static com.hp.hpl.jena.rdf.model.Property surnameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/surname");
	private java.util.ArrayList surname;
	private static com.hp.hpl.jena.rdf.model.Property knowsProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/knows");
	private java.util.ArrayList knows;
	private static com.hp.hpl.jena.rdf.model.Property familyNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/familyName");
	private java.util.ArrayList familyName;
	private static com.hp.hpl.jena.rdf.model.Property lastNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/lastName");
	private java.util.ArrayList lastName;
	private static com.hp.hpl.jena.rdf.model.Property imgProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/img");
	private java.util.ArrayList img;
	private static com.hp.hpl.jena.rdf.model.Property firstNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/firstName");
	private java.util.ArrayList firstName;
	private static com.hp.hpl.jena.rdf.model.Property topic__interestProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/topic_interest");
	private java.util.ArrayList topic__interest;
	private static com.hp.hpl.jena.rdf.model.Property geekcodeProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/geekcode");
	private java.util.ArrayList geekcode;
	private static com.hp.hpl.jena.rdf.model.Property currentProjectProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/currentProject");
	private java.util.ArrayList currentProject;
	private static com.hp.hpl.jena.rdf.model.Property interestProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/interest");
	private java.util.ArrayList interest;
 

	PersonImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PersonImpl getPerson(Resource resource, Model model) throws JastorException {
		return new PersonImpl(resource, model);
	}
	    
	static PersonImpl createPerson(Resource resource, Model model) throws JastorException { 
		PersonImpl impl = new PersonImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Person.TYPE)))
			impl._model.add(impl._resource, RDF.type, Person.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, edu.mit.dig.saveface.model.foaf.Agent.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, edu.mit.dig.saveface.model.foaf.Agent.TYPE));     
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
		it = _model.listStatements(_resource,statusProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
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
		it = _model.listStatements(_resource,mbox__sha1sumProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,msnChatIDProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,mboxProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,creatorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,accountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,ageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,birthdayProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,skypeIDProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,genderProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,madeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,weblogProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,holdsAccountProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,publicationsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,workInfoHomepageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,surnameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,knowsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,familyNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lastNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,imgProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,firstNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,topic__interestProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,geekcodeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,currentProjectProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,interestProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.foaf.Person.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.foaf.Agent.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		status = null;
		icqChatID = null;
		fundedBy = null;
		dnaChecksum = null;
		title = null;
		phone = null;
		maker = null;
		mbox__sha1sum = null;
		msnChatID = null;
		mbox = null;
		creator = null;
		account = null;
		age = null;
		birthday = null;
		aimChatID = null;
		givenName = null;
		depiction = null;
		jabberID = null;
		page = null;
		skypeID = null;
		gender = null;
		made = null;
		weblog = null;
		holdsAccount = null;
		name = null;
		label = null;
		publications = null;
		workInfoHomepage = null;
		surname = null;
		knows = null;
		familyName = null;
		lastName = null;
		img = null;
		firstName = null;
		topic__interest = null;
		geekcode = null;
		currentProject = null;
		interest = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initStatus() throws JastorException {
		status = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, statusProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/status properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			status.add(literal);
		}
	}

	public java.util.Iterator getStatus() throws JastorException {
		if (status == null)
			initStatus();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(status,_resource,statusProperty,false);
	}

	public void addStatus(com.hp.hpl.jena.rdf.model.Literal status) throws JastorException {
		if (this.status == null)
			initStatus();
		if (this.status.contains(status))
			return;
		if (_model.contains(_resource, statusProperty, createLiteral(status)))
			return;
		this.status.add(status);
		_model.add(_resource, statusProperty, status);
	}
	
	public void removeStatus(com.hp.hpl.jena.rdf.model.Literal status) throws JastorException {
		if (this.status == null)
			initStatus();
		if (!this.status.contains(status))
			return;
		if (!_model.contains(_resource, statusProperty, createLiteral(status)))
			return;
		this.status.remove(status);
		_model.removeAll(_resource, statusProperty, createLiteral(status));
	}


	private void initIcqChatID() throws JastorException {
		icqChatID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, icqChatIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/icqChatID properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/fundedBy properties in Person model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/dnaChecksum properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/title properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/phone properties in Person model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/maker properties in Person model not a Resource", stmt.getObject());
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
		 

	private void initMbox__sha1sum() throws JastorException {
		mbox__sha1sum = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, mbox__sha1sumProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/mbox_sha1sum properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/msnChatID properties in Person model not a Literal", stmt.getObject());
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


	private void initMbox() throws JastorException {
		this.mbox = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, mboxProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/mbox properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing mbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.mbox.add(mbox);
			}
		}
	}

	public java.util.Iterator getMbox() throws JastorException {
		if (mbox == null)
			initMbox();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(mbox,_resource,mboxProperty,true);
	}

	public void addMbox(com.ibm.adtech.jastor.Thing mbox) throws JastorException {
		if (this.mbox == null)
			initMbox();
		if (this.mbox.contains(mbox)) {
			this.mbox.remove(mbox);
			this.mbox.add(mbox);
			return;
		}
		this.mbox.add(mbox);
		_model.add(_model.createStatement(_resource,mboxProperty,mbox.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addMbox() throws JastorException {
		com.ibm.adtech.jastor.Thing mbox = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.mbox == null)
			initMbox();
		this.mbox.add(mbox);
		_model.add(_model.createStatement(_resource,mboxProperty,mbox.resource()));
		return mbox;
	}
	
	public com.ibm.adtech.jastor.Thing addMbox(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing mbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.mbox == null)
			initMbox();
		if (this.mbox.contains(mbox))
			return mbox;
		this.mbox.add(mbox);
		_model.add(_model.createStatement(_resource,mboxProperty,mbox.resource()));
		return mbox;
	}
	
	public void removeMbox(com.ibm.adtech.jastor.Thing mbox) throws JastorException {
		if (this.mbox == null)
			initMbox();
		if (!this.mbox.contains(mbox))
			return;
		if (!_model.contains(_resource, mboxProperty, mbox.resource()))
			return;
		this.mbox.remove(mbox);
		_model.removeAll(_resource, mboxProperty, mbox.resource());
	}
		 

	private void initCreator() throws JastorException {
		this.creator = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, creatorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/creator properties in Person model not a Resource", stmt.getObject());
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
		 
	private void initBased__near() throws JastorException {
		this.based__near = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, based__nearProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/based_near properties in SpatialThing model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.SpatialThing based__near = edu.mit.dig.saveface.model.foaf.Factory.getSpatialThing(resource,_model);
				this.based__near.add(based__near);
			}
		}
	}

	public java.util.Iterator getBased__near() throws JastorException {
		if (based__near == null)
			initBased__near();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(based__near,_resource,based__nearProperty,true);
	}

	public void addBased__near(edu.mit.dig.saveface.model.geo.SpatialThing based__near) throws JastorException {
		if (this.based__near == null)
			initBased__near();
		if (this.based__near.contains(based__near)) {
			this.based__near.remove(based__near);
			this.based__near.add(based__near);
			return;
		}
		this.based__near.add(based__near);
		_model.add(_model.createStatement(_resource,based__nearProperty,based__near.resource()));
	}
	
	public edu.mit.dig.saveface.model.geo.SpatialThing addBased__near() throws JastorException {
		edu.mit.dig.saveface.model.geo.SpatialThing based__near = edu.mit.dig.saveface.model.geo.Factory.createSpatialThing(_model.createResource(),_model);
		if (this.based__near == null)
			initBased__near();
		this.based__near.add(based__near);
		_model.add(_model.createStatement(_resource,based__nearProperty,based__near.resource()));
		return based__near;
	}
	
	public edu.mit.dig.saveface.model.geo.SpatialThing addBased__near(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.geo.SpatialThing based__near = edu.mit.dig.saveface.model.geo.Factory.getSpatialThing(resource,_model);
		if (this.based__near == null)
			initBased__near();
		if (this.based__near.contains(based__near))
			return based__near;
		this.based__near.add(based__near);
		_model.add(_model.createStatement(_resource,based__nearProperty,based__near.resource()));
		return based__near;
	}
	
	public void removeBased__near(edu.mit.dig.saveface.model.geo.SpatialThing based__near) throws JastorException {
		if (this.based__near == null)
			initBased__near();
		if (!this.based__near.contains(based__near))
			return;
		if (!_model.contains(_resource, based__nearProperty, based__near.resource()))
			return;
		this.based__near.remove(based__near);
		_model.removeAll(_resource, based__nearProperty, based__near.resource());
	}

	
	private void initAccount() throws JastorException {
		this.account = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, accountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/account properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.OnlineAccount account = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
				this.account.add(account);
			}
		}
	}

	public java.util.Iterator getAccount() throws JastorException {
		if (account == null)
			initAccount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(account,_resource,accountProperty,true);
	}

	public void addAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount account) throws JastorException {
		if (this.account == null)
			initAccount();
		if (this.account.contains(account)) {
			this.account.remove(account);
			this.account.add(account);
			return;
		}
		this.account.add(account);
		_model.add(_model.createStatement(_resource,accountProperty,account.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addAccount() throws JastorException {
		edu.mit.dig.saveface.model.foaf.OnlineAccount account = edu.mit.dig.saveface.model.foaf.Factory.createOnlineAccount(_model.createResource(),_model);
		if (this.account == null)
			initAccount();
		this.account.add(account);
		_model.add(_model.createStatement(_resource,accountProperty,account.resource()));
		return account;
	}
	
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addAccount(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.OnlineAccount account = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
		if (this.account == null)
			initAccount();
		if (this.account.contains(account))
			return account;
		this.account.add(account);
		_model.add(_model.createStatement(_resource,accountProperty,account.resource()));
		return account;
	}
	
	public void removeAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount account) throws JastorException {
		if (this.account == null)
			initAccount();
		if (!this.account.contains(account))
			return;
		if (!_model.contains(_resource, accountProperty, account.resource()))
			return;
		this.account.remove(account);
		_model.removeAll(_resource, accountProperty, account.resource());
	}
		 
	public com.hp.hpl.jena.rdf.model.Literal getAge() throws JastorException {
		if (age != null)
			return age;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, ageProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": age getProperty() in edu.mit.dig.saveface.model.foaf.Person model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		age = literal;
		return literal;
	}
	
	public void setAge(com.hp.hpl.jena.rdf.model.Literal age) throws JastorException {
		if (_model.contains(_resource,ageProperty)) {
			_model.removeAll(_resource,ageProperty,null);
		}
		this.age = age;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (age != null) {
			_model.add(_model.createStatement(_resource,ageProperty, age));
		}	
	}

	public com.hp.hpl.jena.rdf.model.Literal getBirthday() throws JastorException {
		if (birthday != null)
			return birthday;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, birthdayProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": birthday getProperty() in edu.mit.dig.saveface.model.foaf.Person model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		birthday = literal;
		return literal;
	}
	
	public void setBirthday(com.hp.hpl.jena.rdf.model.Literal birthday) throws JastorException {
		if (_model.contains(_resource,birthdayProperty)) {
			_model.removeAll(_resource,birthdayProperty,null);
		}
		this.birthday = birthday;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (birthday != null) {
			_model.add(_model.createStatement(_resource,birthdayProperty, birthday));
		}	
	}


	private void initAimChatID() throws JastorException {
		aimChatID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, aimChatIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/aimChatID properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/givenName properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/depiction properties in Person model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/jabberID properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/page properties in Person model not a Resource", stmt.getObject());
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
		 

	private void initSkypeID() throws JastorException {
		skypeID = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, skypeIDProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/skypeID properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			skypeID.add(literal);
		}
	}

	public java.util.Iterator getSkypeID() throws JastorException {
		if (skypeID == null)
			initSkypeID();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(skypeID,_resource,skypeIDProperty,false);
	}

	public void addSkypeID(com.hp.hpl.jena.rdf.model.Literal skypeID) throws JastorException {
		if (this.skypeID == null)
			initSkypeID();
		if (this.skypeID.contains(skypeID))
			return;
		if (_model.contains(_resource, skypeIDProperty, createLiteral(skypeID)))
			return;
		this.skypeID.add(skypeID);
		_model.add(_resource, skypeIDProperty, skypeID);
	}
	
	public void removeSkypeID(com.hp.hpl.jena.rdf.model.Literal skypeID) throws JastorException {
		if (this.skypeID == null)
			initSkypeID();
		if (!this.skypeID.contains(skypeID))
			return;
		if (!_model.contains(_resource, skypeIDProperty, createLiteral(skypeID)))
			return;
		this.skypeID.remove(skypeID);
		_model.removeAll(_resource, skypeIDProperty, createLiteral(skypeID));
	}

	public com.hp.hpl.jena.rdf.model.Literal getGender() throws JastorException {
		if (gender != null)
			return gender;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, genderProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": gender getProperty() in edu.mit.dig.saveface.model.foaf.Person model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		gender = literal;
		return literal;
	}
	
	public void setGender(com.hp.hpl.jena.rdf.model.Literal gender) throws JastorException {
		if (_model.contains(_resource,genderProperty)) {
			_model.removeAll(_resource,genderProperty,null);
		}
		this.gender = gender;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (gender != null) {
			_model.add(_model.createStatement(_resource,genderProperty, gender));
		}	
	}


	private void initMade() throws JastorException {
		this.made = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, madeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/made properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing made = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.made.add(made);
			}
		}
	}

	public java.util.Iterator getMade() throws JastorException {
		if (made == null)
			initMade();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(made,_resource,madeProperty,true);
	}

	public void addMade(com.ibm.adtech.jastor.Thing made) throws JastorException {
		if (this.made == null)
			initMade();
		if (this.made.contains(made)) {
			this.made.remove(made);
			this.made.add(made);
			return;
		}
		this.made.add(made);
		_model.add(_model.createStatement(_resource,madeProperty,made.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addMade() throws JastorException {
		com.ibm.adtech.jastor.Thing made = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.made == null)
			initMade();
		this.made.add(made);
		_model.add(_model.createStatement(_resource,madeProperty,made.resource()));
		return made;
	}
	
	public com.ibm.adtech.jastor.Thing addMade(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing made = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.made == null)
			initMade();
		if (this.made.contains(made))
			return made;
		this.made.add(made);
		_model.add(_model.createStatement(_resource,madeProperty,made.resource()));
		return made;
	}
	
	public void removeMade(com.ibm.adtech.jastor.Thing made) throws JastorException {
		if (this.made == null)
			initMade();
		if (!this.made.contains(made))
			return;
		if (!_model.contains(_resource, madeProperty, made.resource()))
			return;
		this.made.remove(made);
		_model.removeAll(_resource, madeProperty, made.resource());
	}
		 

	private void initWeblog() throws JastorException {
		this.weblog = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, weblogProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/weblog properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Document weblog = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
				this.weblog.add(weblog);
			}
		}
	}

	public java.util.Iterator getWeblog() throws JastorException {
		if (weblog == null)
			initWeblog();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(weblog,_resource,weblogProperty,true);
	}

	public void addWeblog(edu.mit.dig.saveface.model.foaf.Document weblog) throws JastorException {
		if (this.weblog == null)
			initWeblog();
		if (this.weblog.contains(weblog)) {
			this.weblog.remove(weblog);
			this.weblog.add(weblog);
			return;
		}
		this.weblog.add(weblog);
		_model.add(_model.createStatement(_resource,weblogProperty,weblog.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addWeblog() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document weblog = edu.mit.dig.saveface.model.foaf.Factory.createDocument(_model.createResource(),_model);
		if (this.weblog == null)
			initWeblog();
		this.weblog.add(weblog);
		_model.add(_model.createStatement(_resource,weblogProperty,weblog.resource()));
		return weblog;
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addWeblog(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document weblog = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
		if (this.weblog == null)
			initWeblog();
		if (this.weblog.contains(weblog))
			return weblog;
		this.weblog.add(weblog);
		_model.add(_model.createStatement(_resource,weblogProperty,weblog.resource()));
		return weblog;
	}
	
	public void removeWeblog(edu.mit.dig.saveface.model.foaf.Document weblog) throws JastorException {
		if (this.weblog == null)
			initWeblog();
		if (!this.weblog.contains(weblog))
			return;
		if (!_model.contains(_resource, weblogProperty, weblog.resource()))
			return;
		this.weblog.remove(weblog);
		_model.removeAll(_resource, weblogProperty, weblog.resource());
	}
		 

	private void initHoldsAccount() throws JastorException {
		this.holdsAccount = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, holdsAccountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/holdsAccount properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
				this.holdsAccount.add(holdsAccount);
			}
		}
	}

	public java.util.Iterator getHoldsAccount() throws JastorException {
		if (holdsAccount == null)
			initHoldsAccount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(holdsAccount,_resource,holdsAccountProperty,true);
	}

	public void addHoldsAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount) throws JastorException {
		if (this.holdsAccount == null)
			initHoldsAccount();
		if (this.holdsAccount.contains(holdsAccount)) {
			this.holdsAccount.remove(holdsAccount);
			this.holdsAccount.add(holdsAccount);
			return;
		}
		this.holdsAccount.add(holdsAccount);
		_model.add(_model.createStatement(_resource,holdsAccountProperty,holdsAccount.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addHoldsAccount() throws JastorException {
		edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount = edu.mit.dig.saveface.model.foaf.Factory.createOnlineAccount(_model.createResource(),_model);
		if (this.holdsAccount == null)
			initHoldsAccount();
		this.holdsAccount.add(holdsAccount);
		_model.add(_model.createStatement(_resource,holdsAccountProperty,holdsAccount.resource()));
		return holdsAccount;
	}
	
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addHoldsAccount(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
		if (this.holdsAccount == null)
			initHoldsAccount();
		if (this.holdsAccount.contains(holdsAccount))
			return holdsAccount;
		this.holdsAccount.add(holdsAccount);
		_model.add(_model.createStatement(_resource,holdsAccountProperty,holdsAccount.resource()));
		return holdsAccount;
	}
	
	public void removeHoldsAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount) throws JastorException {
		if (this.holdsAccount == null)
			initHoldsAccount();
		if (!this.holdsAccount.contains(holdsAccount))
			return;
		if (!_model.contains(_resource, holdsAccountProperty, holdsAccount.resource()))
			return;
		this.holdsAccount.remove(holdsAccount);
		_model.removeAll(_resource, holdsAccountProperty, holdsAccount.resource());
	}
		 

	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/name properties in Person model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.w3.org/2000/01/rdf-schema#label properties in Person model not a Resource", stmt.getObject());
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
		 

	private void initPublications() throws JastorException {
		this.publications = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, publicationsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/publications properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Document publications = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
				this.publications.add(publications);
			}
		}
	}

	public java.util.Iterator getPublications() throws JastorException {
		if (publications == null)
			initPublications();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(publications,_resource,publicationsProperty,true);
	}

	public void addPublications(edu.mit.dig.saveface.model.foaf.Document publications) throws JastorException {
		if (this.publications == null)
			initPublications();
		if (this.publications.contains(publications)) {
			this.publications.remove(publications);
			this.publications.add(publications);
			return;
		}
		this.publications.add(publications);
		_model.add(_model.createStatement(_resource,publicationsProperty,publications.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addPublications() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document publications = edu.mit.dig.saveface.model.foaf.Factory.createDocument(_model.createResource(),_model);
		if (this.publications == null)
			initPublications();
		this.publications.add(publications);
		_model.add(_model.createStatement(_resource,publicationsProperty,publications.resource()));
		return publications;
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addPublications(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document publications = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
		if (this.publications == null)
			initPublications();
		if (this.publications.contains(publications))
			return publications;
		this.publications.add(publications);
		_model.add(_model.createStatement(_resource,publicationsProperty,publications.resource()));
		return publications;
	}
	
	public void removePublications(edu.mit.dig.saveface.model.foaf.Document publications) throws JastorException {
		if (this.publications == null)
			initPublications();
		if (!this.publications.contains(publications))
			return;
		if (!_model.contains(_resource, publicationsProperty, publications.resource()))
			return;
		this.publications.remove(publications);
		_model.removeAll(_resource, publicationsProperty, publications.resource());
	}
		 

	private void initWorkInfoHomepage() throws JastorException {
		this.workInfoHomepage = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, workInfoHomepageProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/workInfoHomepage properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Document workInfoHomepage = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
				this.workInfoHomepage.add(workInfoHomepage);
			}
		}
	}

	public java.util.Iterator getWorkInfoHomepage() throws JastorException {
		if (workInfoHomepage == null)
			initWorkInfoHomepage();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(workInfoHomepage,_resource,workInfoHomepageProperty,true);
	}

	public void addWorkInfoHomepage(edu.mit.dig.saveface.model.foaf.Document workInfoHomepage) throws JastorException {
		if (this.workInfoHomepage == null)
			initWorkInfoHomepage();
		if (this.workInfoHomepage.contains(workInfoHomepage)) {
			this.workInfoHomepage.remove(workInfoHomepage);
			this.workInfoHomepage.add(workInfoHomepage);
			return;
		}
		this.workInfoHomepage.add(workInfoHomepage);
		_model.add(_model.createStatement(_resource,workInfoHomepageProperty,workInfoHomepage.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addWorkInfoHomepage() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document workInfoHomepage = edu.mit.dig.saveface.model.foaf.Factory.createDocument(_model.createResource(),_model);
		if (this.workInfoHomepage == null)
			initWorkInfoHomepage();
		this.workInfoHomepage.add(workInfoHomepage);
		_model.add(_model.createStatement(_resource,workInfoHomepageProperty,workInfoHomepage.resource()));
		return workInfoHomepage;
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addWorkInfoHomepage(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document workInfoHomepage = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
		if (this.workInfoHomepage == null)
			initWorkInfoHomepage();
		if (this.workInfoHomepage.contains(workInfoHomepage))
			return workInfoHomepage;
		this.workInfoHomepage.add(workInfoHomepage);
		_model.add(_model.createStatement(_resource,workInfoHomepageProperty,workInfoHomepage.resource()));
		return workInfoHomepage;
	}
	
	public void removeWorkInfoHomepage(edu.mit.dig.saveface.model.foaf.Document workInfoHomepage) throws JastorException {
		if (this.workInfoHomepage == null)
			initWorkInfoHomepage();
		if (!this.workInfoHomepage.contains(workInfoHomepage))
			return;
		if (!_model.contains(_resource, workInfoHomepageProperty, workInfoHomepage.resource()))
			return;
		this.workInfoHomepage.remove(workInfoHomepage);
		_model.removeAll(_resource, workInfoHomepageProperty, workInfoHomepage.resource());
	}
		 

	private void initSurname() throws JastorException {
		surname = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, surnameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/surname properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			surname.add(literal);
		}
	}

	public java.util.Iterator getSurname() throws JastorException {
		if (surname == null)
			initSurname();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(surname,_resource,surnameProperty,false);
	}

	public void addSurname(com.hp.hpl.jena.rdf.model.Literal surname) throws JastorException {
		if (this.surname == null)
			initSurname();
		if (this.surname.contains(surname))
			return;
		if (_model.contains(_resource, surnameProperty, createLiteral(surname)))
			return;
		this.surname.add(surname);
		_model.add(_resource, surnameProperty, surname);
	}
	
	public void removeSurname(com.hp.hpl.jena.rdf.model.Literal surname) throws JastorException {
		if (this.surname == null)
			initSurname();
		if (!this.surname.contains(surname))
			return;
		if (!_model.contains(_resource, surnameProperty, createLiteral(surname)))
			return;
		this.surname.remove(surname);
		_model.removeAll(_resource, surnameProperty, createLiteral(surname));
	}


	private void initKnows() throws JastorException {
		this.knows = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, knowsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/knows properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Person knows = edu.mit.dig.saveface.model.foaf.Factory.getPerson(resource,_model);
				this.knows.add(knows);
			}
		}
	}

	public java.util.Iterator getKnows() throws JastorException {
		if (knows == null)
			initKnows();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(knows,_resource,knowsProperty,true);
	}

	public void addKnows(edu.mit.dig.saveface.model.foaf.Person knows) throws JastorException {
		if (this.knows == null)
			initKnows();
		if (this.knows.contains(knows)) {
			this.knows.remove(knows);
			this.knows.add(knows);
			return;
		}
		this.knows.add(knows);
		_model.add(_model.createStatement(_resource,knowsProperty,knows.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Person addKnows() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Person knows = edu.mit.dig.saveface.model.foaf.Factory.createPerson(_model.createResource(),_model);
		if (this.knows == null)
			initKnows();
		this.knows.add(knows);
		_model.add(_model.createStatement(_resource,knowsProperty,knows.resource()));
		return knows;
	}
	
	public edu.mit.dig.saveface.model.foaf.Person addKnows(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Person knows = edu.mit.dig.saveface.model.foaf.Factory.getPerson(resource,_model);
		if (this.knows == null)
			initKnows();
		if (this.knows.contains(knows))
			return knows;
		this.knows.add(knows);
		_model.add(_model.createStatement(_resource,knowsProperty,knows.resource()));
		return knows;
	}
	
	public void removeKnows(edu.mit.dig.saveface.model.foaf.Person knows) throws JastorException {
		if (this.knows == null)
			initKnows();
		if (!this.knows.contains(knows))
			return;
		if (!_model.contains(_resource, knowsProperty, knows.resource()))
			return;
		this.knows.remove(knows);
		_model.removeAll(_resource, knowsProperty, knows.resource());
	}
		 

	private void initFamilyName() throws JastorException {
		familyName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, familyNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/familyName properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			familyName.add(literal);
		}
	}

	public java.util.Iterator getFamilyName() throws JastorException {
		if (familyName == null)
			initFamilyName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(familyName,_resource,familyNameProperty,false);
	}

	public void addFamilyName(com.hp.hpl.jena.rdf.model.Literal familyName) throws JastorException {
		if (this.familyName == null)
			initFamilyName();
		if (this.familyName.contains(familyName))
			return;
		if (_model.contains(_resource, familyNameProperty, createLiteral(familyName)))
			return;
		this.familyName.add(familyName);
		_model.add(_resource, familyNameProperty, familyName);
	}
	
	public void removeFamilyName(com.hp.hpl.jena.rdf.model.Literal familyName) throws JastorException {
		if (this.familyName == null)
			initFamilyName();
		if (!this.familyName.contains(familyName))
			return;
		if (!_model.contains(_resource, familyNameProperty, createLiteral(familyName)))
			return;
		this.familyName.remove(familyName);
		_model.removeAll(_resource, familyNameProperty, createLiteral(familyName));
	}


	private void initLastName() throws JastorException {
		lastName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, lastNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/lastName properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			lastName.add(literal);
		}
	}

	public java.util.Iterator getLastName() throws JastorException {
		if (lastName == null)
			initLastName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(lastName,_resource,lastNameProperty,false);
	}

	public void addLastName(com.hp.hpl.jena.rdf.model.Literal lastName) throws JastorException {
		if (this.lastName == null)
			initLastName();
		if (this.lastName.contains(lastName))
			return;
		if (_model.contains(_resource, lastNameProperty, createLiteral(lastName)))
			return;
		this.lastName.add(lastName);
		_model.add(_resource, lastNameProperty, lastName);
	}
	
	public void removeLastName(com.hp.hpl.jena.rdf.model.Literal lastName) throws JastorException {
		if (this.lastName == null)
			initLastName();
		if (!this.lastName.contains(lastName))
			return;
		if (!_model.contains(_resource, lastNameProperty, createLiteral(lastName)))
			return;
		this.lastName.remove(lastName);
		_model.removeAll(_resource, lastNameProperty, createLiteral(lastName));
	}


	private void initImg() throws JastorException {
		this.img = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, imgProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/img properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Image img = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
				this.img.add(img);
			}
		}
	}

	public java.util.Iterator getImg() throws JastorException {
		if (img == null)
			initImg();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(img,_resource,imgProperty,true);
	}

	public void addImg(edu.mit.dig.saveface.model.foaf.Image img) throws JastorException {
		if (this.img == null)
			initImg();
		if (this.img.contains(img)) {
			this.img.remove(img);
			this.img.add(img);
			return;
		}
		this.img.add(img);
		_model.add(_model.createStatement(_resource,imgProperty,img.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Image addImg() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Image img = edu.mit.dig.saveface.model.foaf.Factory.createImage(_model.createResource(),_model);
		if (this.img == null)
			initImg();
		this.img.add(img);
		_model.add(_model.createStatement(_resource,imgProperty,img.resource()));
		return img;
	}
	
	public edu.mit.dig.saveface.model.foaf.Image addImg(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Image img = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
		if (this.img == null)
			initImg();
		if (this.img.contains(img))
			return img;
		this.img.add(img);
		_model.add(_model.createStatement(_resource,imgProperty,img.resource()));
		return img;
	}
	
	public void removeImg(edu.mit.dig.saveface.model.foaf.Image img) throws JastorException {
		if (this.img == null)
			initImg();
		if (!this.img.contains(img))
			return;
		if (!_model.contains(_resource, imgProperty, img.resource()))
			return;
		this.img.remove(img);
		_model.removeAll(_resource, imgProperty, img.resource());
	}
		 

	private void initFirstName() throws JastorException {
		firstName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, firstNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/firstName properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			firstName.add(literal);
		}
	}

	public java.util.Iterator getFirstName() throws JastorException {
		if (firstName == null)
			initFirstName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(firstName,_resource,firstNameProperty,false);
	}

	public void addFirstName(com.hp.hpl.jena.rdf.model.Literal firstName) throws JastorException {
		if (this.firstName == null)
			initFirstName();
		if (this.firstName.contains(firstName))
			return;
		if (_model.contains(_resource, firstNameProperty, createLiteral(firstName)))
			return;
		this.firstName.add(firstName);
		_model.add(_resource, firstNameProperty, firstName);
	}
	
	public void removeFirstName(com.hp.hpl.jena.rdf.model.Literal firstName) throws JastorException {
		if (this.firstName == null)
			initFirstName();
		if (!this.firstName.contains(firstName))
			return;
		if (!_model.contains(_resource, firstNameProperty, createLiteral(firstName)))
			return;
		this.firstName.remove(firstName);
		_model.removeAll(_resource, firstNameProperty, createLiteral(firstName));
	}


	private void initTopic__interest() throws JastorException {
		this.topic__interest = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, topic__interestProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/topic_interest properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing topic__interest = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.topic__interest.add(topic__interest);
			}
		}
	}

	public java.util.Iterator getTopic__interest() throws JastorException {
		if (topic__interest == null)
			initTopic__interest();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(topic__interest,_resource,topic__interestProperty,true);
	}

	public void addTopic__interest(com.ibm.adtech.jastor.Thing topic__interest) throws JastorException {
		if (this.topic__interest == null)
			initTopic__interest();
		if (this.topic__interest.contains(topic__interest)) {
			this.topic__interest.remove(topic__interest);
			this.topic__interest.add(topic__interest);
			return;
		}
		this.topic__interest.add(topic__interest);
		_model.add(_model.createStatement(_resource,topic__interestProperty,topic__interest.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addTopic__interest() throws JastorException {
		com.ibm.adtech.jastor.Thing topic__interest = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.topic__interest == null)
			initTopic__interest();
		this.topic__interest.add(topic__interest);
		_model.add(_model.createStatement(_resource,topic__interestProperty,topic__interest.resource()));
		return topic__interest;
	}
	
	public com.ibm.adtech.jastor.Thing addTopic__interest(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing topic__interest = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.topic__interest == null)
			initTopic__interest();
		if (this.topic__interest.contains(topic__interest))
			return topic__interest;
		this.topic__interest.add(topic__interest);
		_model.add(_model.createStatement(_resource,topic__interestProperty,topic__interest.resource()));
		return topic__interest;
	}
	
	public void removeTopic__interest(com.ibm.adtech.jastor.Thing topic__interest) throws JastorException {
		if (this.topic__interest == null)
			initTopic__interest();
		if (!this.topic__interest.contains(topic__interest))
			return;
		if (!_model.contains(_resource, topic__interestProperty, topic__interest.resource()))
			return;
		this.topic__interest.remove(topic__interest);
		_model.removeAll(_resource, topic__interestProperty, topic__interest.resource());
	}
		 

	private void initGeekcode() throws JastorException {
		geekcode = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, geekcodeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/geekcode properties in Person model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			geekcode.add(literal);
		}
	}

	public java.util.Iterator getGeekcode() throws JastorException {
		if (geekcode == null)
			initGeekcode();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(geekcode,_resource,geekcodeProperty,false);
	}

	public void addGeekcode(com.hp.hpl.jena.rdf.model.Literal geekcode) throws JastorException {
		if (this.geekcode == null)
			initGeekcode();
		if (this.geekcode.contains(geekcode))
			return;
		if (_model.contains(_resource, geekcodeProperty, createLiteral(geekcode)))
			return;
		this.geekcode.add(geekcode);
		_model.add(_resource, geekcodeProperty, geekcode);
	}
	
	public void removeGeekcode(com.hp.hpl.jena.rdf.model.Literal geekcode) throws JastorException {
		if (this.geekcode == null)
			initGeekcode();
		if (!this.geekcode.contains(geekcode))
			return;
		if (!_model.contains(_resource, geekcodeProperty, createLiteral(geekcode)))
			return;
		this.geekcode.remove(geekcode);
		_model.removeAll(_resource, geekcodeProperty, createLiteral(geekcode));
	}


	private void initCurrentProject() throws JastorException {
		this.currentProject = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, currentProjectProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/currentProject properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing currentProject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.currentProject.add(currentProject);
			}
		}
	}

	public java.util.Iterator getCurrentProject() throws JastorException {
		if (currentProject == null)
			initCurrentProject();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(currentProject,_resource,currentProjectProperty,true);
	}

	public void addCurrentProject(com.ibm.adtech.jastor.Thing currentProject) throws JastorException {
		if (this.currentProject == null)
			initCurrentProject();
		if (this.currentProject.contains(currentProject)) {
			this.currentProject.remove(currentProject);
			this.currentProject.add(currentProject);
			return;
		}
		this.currentProject.add(currentProject);
		_model.add(_model.createStatement(_resource,currentProjectProperty,currentProject.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addCurrentProject() throws JastorException {
		com.ibm.adtech.jastor.Thing currentProject = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.currentProject == null)
			initCurrentProject();
		this.currentProject.add(currentProject);
		_model.add(_model.createStatement(_resource,currentProjectProperty,currentProject.resource()));
		return currentProject;
	}
	
	public com.ibm.adtech.jastor.Thing addCurrentProject(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing currentProject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.currentProject == null)
			initCurrentProject();
		if (this.currentProject.contains(currentProject))
			return currentProject;
		this.currentProject.add(currentProject);
		_model.add(_model.createStatement(_resource,currentProjectProperty,currentProject.resource()));
		return currentProject;
	}
	
	public void removeCurrentProject(com.ibm.adtech.jastor.Thing currentProject) throws JastorException {
		if (this.currentProject == null)
			initCurrentProject();
		if (!this.currentProject.contains(currentProject))
			return;
		if (!_model.contains(_resource, currentProjectProperty, currentProject.resource()))
			return;
		this.currentProject.remove(currentProject);
		_model.removeAll(_resource, currentProjectProperty, currentProject.resource());
	}
		 

	private void initInterest() throws JastorException {
		this.interest = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, interestProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/interest properties in Person model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.foaf.Document interest = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
				this.interest.add(interest);
			}
		}
	}

	public java.util.Iterator getInterest() throws JastorException {
		if (interest == null)
			initInterest();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(interest,_resource,interestProperty,true);
	}

	public void addInterest(edu.mit.dig.saveface.model.foaf.Document interest) throws JastorException {
		if (this.interest == null)
			initInterest();
		if (this.interest.contains(interest)) {
			this.interest.remove(interest);
			this.interest.add(interest);
			return;
		}
		this.interest.add(interest);
		_model.add(_model.createStatement(_resource,interestProperty,interest.resource()));
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addInterest() throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document interest = edu.mit.dig.saveface.model.foaf.Factory.createDocument(_model.createResource(),_model);
		if (this.interest == null)
			initInterest();
		this.interest.add(interest);
		_model.add(_model.createStatement(_resource,interestProperty,interest.resource()));
		return interest;
	}
	
	public edu.mit.dig.saveface.model.foaf.Document addInterest(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.foaf.Document interest = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
		if (this.interest == null)
			initInterest();
		if (this.interest.contains(interest))
			return interest;
		this.interest.add(interest);
		_model.add(_model.createStatement(_resource,interestProperty,interest.resource()));
		return interest;
	}
	
	public void removeInterest(edu.mit.dig.saveface.model.foaf.Document interest) throws JastorException {
		if (this.interest == null)
			initInterest();
		if (!this.interest.contains(interest))
			return;
		if (!_model.contains(_resource, interestProperty, interest.resource()))
			return;
		this.interest.remove(interest);
		_model.removeAll(_resource, interestProperty, interest.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PersonListener))
			throw new IllegalArgumentException("ThingListener must be instance of PersonListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PersonListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PersonListener))
			throw new IllegalArgumentException("ThingListener must be instance of PersonListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(statusProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (status == null)
					try {
						initStatus();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!status.contains(literal))
					status.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForStatus;
					synchronized (listeners) {
						consumersForStatus = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForStatus.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.statusAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
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
						PersonListener listener=(PersonListener)iter.next();
						listener.icqChatIDAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.fundedByAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_fundedBy);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.dnaChecksumAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.titleAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.phoneAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_phone);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.makerAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_maker);
						}
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
						PersonListener listener=(PersonListener)iter.next();
						listener.mbox__sha1sumAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.msnChatIDAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mboxProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _mbox = null;
					try {
						_mbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (mbox == null) {
						try {
							initMbox();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!mbox.contains(_mbox))
						mbox.add(_mbox);
					if (listeners != null) {
						java.util.ArrayList consumersForMbox;
						synchronized (listeners) {
							consumersForMbox = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMbox.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.mboxAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_mbox);
						}
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
							PersonListener listener=(PersonListener)iter.next();
							listener.creatorAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_creator);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(accountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.OnlineAccount _account = null;
					try {
						_account = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (account == null) {
						try {
							initAccount();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!account.contains(_account))
						account.add(_account);
					if (listeners != null) {
						java.util.ArrayList consumersForAccount;
						synchronized (listeners) {
							consumersForAccount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAccount.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.accountAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_account);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(ageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				age = literal;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.ageChanged(edu.mit.dig.saveface.model.foaf.PersonImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(birthdayProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				birthday = literal;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.birthdayChanged(edu.mit.dig.saveface.model.foaf.PersonImpl.this);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.aimChatIDAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.givenNameAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.depictionAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_depiction);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.jabberIDAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.pageAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_page);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(skypeIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (skypeID == null)
					try {
						initSkypeID();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!skypeID.contains(literal))
					skypeID.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForSkypeID;
					synchronized (listeners) {
						consumersForSkypeID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSkypeID.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.skypeIDAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(genderProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				gender = literal;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.genderChanged(edu.mit.dig.saveface.model.foaf.PersonImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(madeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _made = null;
					try {
						_made = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (made == null) {
						try {
							initMade();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!made.contains(_made))
						made.add(_made);
					if (listeners != null) {
						java.util.ArrayList consumersForMade;
						synchronized (listeners) {
							consumersForMade = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMade.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.madeAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_made);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(weblogProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _weblog = null;
					try {
						_weblog = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (weblog == null) {
						try {
							initWeblog();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!weblog.contains(_weblog))
						weblog.add(_weblog);
					if (listeners != null) {
						java.util.ArrayList consumersForWeblog;
						synchronized (listeners) {
							consumersForWeblog = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForWeblog.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.weblogAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_weblog);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(holdsAccountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.OnlineAccount _holdsAccount = null;
					try {
						_holdsAccount = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (holdsAccount == null) {
						try {
							initHoldsAccount();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!holdsAccount.contains(_holdsAccount))
						holdsAccount.add(_holdsAccount);
					if (listeners != null) {
						java.util.ArrayList consumersForHoldsAccount;
						synchronized (listeners) {
							consumersForHoldsAccount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHoldsAccount.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.holdsAccountAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_holdsAccount);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.labelAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_label);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(publicationsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _publications = null;
					try {
						_publications = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (publications == null) {
						try {
							initPublications();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!publications.contains(_publications))
						publications.add(_publications);
					if (listeners != null) {
						java.util.ArrayList consumersForPublications;
						synchronized (listeners) {
							consumersForPublications = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPublications.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.publicationsAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_publications);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(workInfoHomepageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _workInfoHomepage = null;
					try {
						_workInfoHomepage = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (workInfoHomepage == null) {
						try {
							initWorkInfoHomepage();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!workInfoHomepage.contains(_workInfoHomepage))
						workInfoHomepage.add(_workInfoHomepage);
					if (listeners != null) {
						java.util.ArrayList consumersForWorkInfoHomepage;
						synchronized (listeners) {
							consumersForWorkInfoHomepage = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForWorkInfoHomepage.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.workInfoHomepageAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_workInfoHomepage);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(surnameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (surname == null)
					try {
						initSurname();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!surname.contains(literal))
					surname.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForSurname;
					synchronized (listeners) {
						consumersForSurname = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSurname.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.surnameAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(knowsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Person _knows = null;
					try {
						_knows = edu.mit.dig.saveface.model.foaf.Factory.getPerson(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (knows == null) {
						try {
							initKnows();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!knows.contains(_knows))
						knows.add(_knows);
					if (listeners != null) {
						java.util.ArrayList consumersForKnows;
						synchronized (listeners) {
							consumersForKnows = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForKnows.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.knowsAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_knows);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(familyNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (familyName == null)
					try {
						initFamilyName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!familyName.contains(literal))
					familyName.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForFamilyName;
					synchronized (listeners) {
						consumersForFamilyName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFamilyName.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.familyNameAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lastNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (lastName == null)
					try {
						initLastName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!lastName.contains(literal))
					lastName.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForLastName;
					synchronized (listeners) {
						consumersForLastName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLastName.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.lastNameAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(imgProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Image _img = null;
					try {
						_img = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (img == null) {
						try {
							initImg();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!img.contains(_img))
						img.add(_img);
					if (listeners != null) {
						java.util.ArrayList consumersForImg;
						synchronized (listeners) {
							consumersForImg = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForImg.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.imgAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_img);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(firstNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (firstName == null)
					try {
						initFirstName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!firstName.contains(literal))
					firstName.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForFirstName;
					synchronized (listeners) {
						consumersForFirstName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFirstName.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.firstNameAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(topic__interestProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _topic__interest = null;
					try {
						_topic__interest = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (topic__interest == null) {
						try {
							initTopic__interest();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!topic__interest.contains(_topic__interest))
						topic__interest.add(_topic__interest);
					if (listeners != null) {
						java.util.ArrayList consumersForTopic__interest;
						synchronized (listeners) {
							consumersForTopic__interest = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTopic__interest.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.topic__interestAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_topic__interest);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(geekcodeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (geekcode == null)
					try {
						initGeekcode();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!geekcode.contains(literal))
					geekcode.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForGeekcode;
					synchronized (listeners) {
						consumersForGeekcode = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGeekcode.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.geekcodeAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(currentProjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _currentProject = null;
					try {
						_currentProject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (currentProject == null) {
						try {
							initCurrentProject();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!currentProject.contains(_currentProject))
						currentProject.add(_currentProject);
					if (listeners != null) {
						java.util.ArrayList consumersForCurrentProject;
						synchronized (listeners) {
							consumersForCurrentProject = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCurrentProject.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.currentProjectAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_currentProject);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(interestProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _interest = null;
					try {
						_interest = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (interest == null) {
						try {
							initInterest();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!interest.contains(_interest))
						interest.add(_interest);
					if (listeners != null) {
						java.util.ArrayList consumersForInterest;
						synchronized (listeners) {
							consumersForInterest = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForInterest.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.interestAdded(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_interest);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(statusProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (status != null) {
					if (status.contains(literal))
						status.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForStatus;
					synchronized (listeners) {
						consumersForStatus = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForStatus.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.statusRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
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
						PersonListener listener=(PersonListener)iter.next();
						listener.icqChatIDRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.fundedByRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_fundedBy);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.dnaChecksumRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.titleRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.phoneRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_phone);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.makerRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_maker);
						}
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
						PersonListener listener=(PersonListener)iter.next();
						listener.mbox__sha1sumRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.msnChatIDRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mboxProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _mbox = null;
					if (mbox != null) {
						boolean found = false;
						for (int i=0;i<mbox.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) mbox.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_mbox = __item;
								break;
							}
						}
						if (found)
							mbox.remove(_mbox);
						else {
							try {
								_mbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_mbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMbox;
						synchronized (listeners) {
							consumersForMbox = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMbox.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.mboxRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_mbox);
						}
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
							PersonListener listener=(PersonListener)iter.next();
							listener.creatorRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_creator);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(accountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.OnlineAccount _account = null;
					if (account != null) {
						boolean found = false;
						for (int i=0;i<account.size();i++) {
							edu.mit.dig.saveface.model.foaf.OnlineAccount __item = (edu.mit.dig.saveface.model.foaf.OnlineAccount) account.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_account = __item;
								break;
							}
						}
						if (found)
							account.remove(_account);
						else {
							try {
								_account = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_account = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForAccount;
						synchronized (listeners) {
							consumersForAccount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAccount.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.accountRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_account);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(ageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (age != null && age.equals(literal))
					age = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.ageChanged(edu.mit.dig.saveface.model.foaf.PersonImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(birthdayProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (birthday != null && birthday.equals(literal))
					birthday = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.birthdayChanged(edu.mit.dig.saveface.model.foaf.PersonImpl.this);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.aimChatIDRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.givenNameRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.depictionRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_depiction);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.jabberIDRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.pageRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_page);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(skypeIDProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (skypeID != null) {
					if (skypeID.contains(literal))
						skypeID.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForSkypeID;
					synchronized (listeners) {
						consumersForSkypeID = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSkypeID.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.skypeIDRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(genderProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (gender != null && gender.equals(literal))
					gender = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.genderChanged(edu.mit.dig.saveface.model.foaf.PersonImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(madeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _made = null;
					if (made != null) {
						boolean found = false;
						for (int i=0;i<made.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) made.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_made = __item;
								break;
							}
						}
						if (found)
							made.remove(_made);
						else {
							try {
								_made = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_made = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMade;
						synchronized (listeners) {
							consumersForMade = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMade.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.madeRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_made);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(weblogProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _weblog = null;
					if (weblog != null) {
						boolean found = false;
						for (int i=0;i<weblog.size();i++) {
							edu.mit.dig.saveface.model.foaf.Document __item = (edu.mit.dig.saveface.model.foaf.Document) weblog.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_weblog = __item;
								break;
							}
						}
						if (found)
							weblog.remove(_weblog);
						else {
							try {
								_weblog = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_weblog = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForWeblog;
						synchronized (listeners) {
							consumersForWeblog = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForWeblog.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.weblogRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_weblog);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(holdsAccountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.OnlineAccount _holdsAccount = null;
					if (holdsAccount != null) {
						boolean found = false;
						for (int i=0;i<holdsAccount.size();i++) {
							edu.mit.dig.saveface.model.foaf.OnlineAccount __item = (edu.mit.dig.saveface.model.foaf.OnlineAccount) holdsAccount.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_holdsAccount = __item;
								break;
							}
						}
						if (found)
							holdsAccount.remove(_holdsAccount);
						else {
							try {
								_holdsAccount = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_holdsAccount = edu.mit.dig.saveface.model.foaf.Factory.getOnlineAccount(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHoldsAccount;
						synchronized (listeners) {
							consumersForHoldsAccount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHoldsAccount.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.holdsAccountRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_holdsAccount);
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
						PersonListener listener=(PersonListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
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
							PersonListener listener=(PersonListener)iter.next();
							listener.labelRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_label);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(publicationsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _publications = null;
					if (publications != null) {
						boolean found = false;
						for (int i=0;i<publications.size();i++) {
							edu.mit.dig.saveface.model.foaf.Document __item = (edu.mit.dig.saveface.model.foaf.Document) publications.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_publications = __item;
								break;
							}
						}
						if (found)
							publications.remove(_publications);
						else {
							try {
								_publications = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_publications = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPublications;
						synchronized (listeners) {
							consumersForPublications = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPublications.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.publicationsRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_publications);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(workInfoHomepageProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _workInfoHomepage = null;
					if (workInfoHomepage != null) {
						boolean found = false;
						for (int i=0;i<workInfoHomepage.size();i++) {
							edu.mit.dig.saveface.model.foaf.Document __item = (edu.mit.dig.saveface.model.foaf.Document) workInfoHomepage.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_workInfoHomepage = __item;
								break;
							}
						}
						if (found)
							workInfoHomepage.remove(_workInfoHomepage);
						else {
							try {
								_workInfoHomepage = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_workInfoHomepage = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForWorkInfoHomepage;
						synchronized (listeners) {
							consumersForWorkInfoHomepage = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForWorkInfoHomepage.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.workInfoHomepageRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_workInfoHomepage);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(surnameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (surname != null) {
					if (surname.contains(literal))
						surname.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForSurname;
					synchronized (listeners) {
						consumersForSurname = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSurname.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.surnameRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(knowsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Person _knows = null;
					if (knows != null) {
						boolean found = false;
						for (int i=0;i<knows.size();i++) {
							edu.mit.dig.saveface.model.foaf.Person __item = (edu.mit.dig.saveface.model.foaf.Person) knows.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_knows = __item;
								break;
							}
						}
						if (found)
							knows.remove(_knows);
						else {
							try {
								_knows = edu.mit.dig.saveface.model.foaf.Factory.getPerson(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_knows = edu.mit.dig.saveface.model.foaf.Factory.getPerson(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForKnows;
						synchronized (listeners) {
							consumersForKnows = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForKnows.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.knowsRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_knows);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(familyNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (familyName != null) {
					if (familyName.contains(literal))
						familyName.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForFamilyName;
					synchronized (listeners) {
						consumersForFamilyName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFamilyName.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.familyNameRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lastNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (lastName != null) {
					if (lastName.contains(literal))
						lastName.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForLastName;
					synchronized (listeners) {
						consumersForLastName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLastName.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.lastNameRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(imgProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Image _img = null;
					if (img != null) {
						boolean found = false;
						for (int i=0;i<img.size();i++) {
							edu.mit.dig.saveface.model.foaf.Image __item = (edu.mit.dig.saveface.model.foaf.Image) img.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_img = __item;
								break;
							}
						}
						if (found)
							img.remove(_img);
						else {
							try {
								_img = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_img = edu.mit.dig.saveface.model.foaf.Factory.getImage(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForImg;
						synchronized (listeners) {
							consumersForImg = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForImg.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.imgRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_img);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(firstNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (firstName != null) {
					if (firstName.contains(literal))
						firstName.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForFirstName;
					synchronized (listeners) {
						consumersForFirstName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFirstName.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.firstNameRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(topic__interestProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _topic__interest = null;
					if (topic__interest != null) {
						boolean found = false;
						for (int i=0;i<topic__interest.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) topic__interest.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_topic__interest = __item;
								break;
							}
						}
						if (found)
							topic__interest.remove(_topic__interest);
						else {
							try {
								_topic__interest = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_topic__interest = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForTopic__interest;
						synchronized (listeners) {
							consumersForTopic__interest = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTopic__interest.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.topic__interestRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_topic__interest);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(geekcodeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (geekcode != null) {
					if (geekcode.contains(literal))
						geekcode.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForGeekcode;
					synchronized (listeners) {
						consumersForGeekcode = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGeekcode.iterator();iter.hasNext();){
						PersonListener listener=(PersonListener)iter.next();
						listener.geekcodeRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(currentProjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _currentProject = null;
					if (currentProject != null) {
						boolean found = false;
						for (int i=0;i<currentProject.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) currentProject.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_currentProject = __item;
								break;
							}
						}
						if (found)
							currentProject.remove(_currentProject);
						else {
							try {
								_currentProject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_currentProject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForCurrentProject;
						synchronized (listeners) {
							consumersForCurrentProject = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCurrentProject.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.currentProjectRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_currentProject);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(interestProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.foaf.Document _interest = null;
					if (interest != null) {
						boolean found = false;
						for (int i=0;i<interest.size();i++) {
							edu.mit.dig.saveface.model.foaf.Document __item = (edu.mit.dig.saveface.model.foaf.Document) interest.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_interest = __item;
								break;
							}
						}
						if (found)
							interest.remove(_interest);
						else {
							try {
								_interest = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_interest = edu.mit.dig.saveface.model.foaf.Factory.getDocument(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForInterest;
						synchronized (listeners) {
							consumersForInterest = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForInterest.iterator();iter.hasNext();){
							PersonListener listener=(PersonListener)iter.next();
							listener.interestRemoved(edu.mit.dig.saveface.model.foaf.PersonImpl.this,_interest);
						}
					}
				}
				return;
			}
		}

	//}
	


}