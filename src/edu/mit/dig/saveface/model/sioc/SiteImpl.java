

package edu.mit.dig.saveface.model.sioc;

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
 * Implementation of {@link edu.mit.dig.saveface.model.sioc.Site}
 * Use the edu.mit.dig.saveface.model.sioc.Factory to create instances of this class.
 * <p>(URI: http://rdfs.org/sioc/ns#Site)</p>
 * <br>
 */
public class SiteImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.sioc.Site {
	

	private static com.hp.hpl.jena.rdf.model.Property has__usergroupProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_usergroup");
	private java.util.ArrayList has__usergroup;
	private static com.hp.hpl.jena.rdf.model.Property feedProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#feed");
	private java.util.ArrayList feed;
	private static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#part_of");
	private java.util.ArrayList part__of;
	private static com.hp.hpl.jena.rdf.model.Property accountProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/account");
	private java.util.ArrayList account;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property referencesProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/references");
	private java.util.ArrayList references;
	private static com.hp.hpl.jena.rdf.model.Property dateProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/date");
	private java.util.ArrayList date;
	private static com.hp.hpl.jena.rdf.model.Property depictionProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/depiction");
	private java.util.ArrayList depiction;
	private static com.hp.hpl.jena.rdf.model.Property has__functionProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_function");
	private java.util.ArrayList has__function;
	private static com.hp.hpl.jena.rdf.model.Property last__reply__dateProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#last_reply_date");
	private java.util.ArrayList last__reply__date;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property has__ownerProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_owner");
	private java.util.ArrayList has__owner;
	private static com.hp.hpl.jena.rdf.model.Property num__repliesProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#num_replies");
	private java.util.ArrayList num__replies;
	private static com.hp.hpl.jena.rdf.model.Property subjectProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/subject");
	private java.util.ArrayList subject;
	private static com.hp.hpl.jena.rdf.model.Property num__viewsProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#num_views");
	private java.util.ArrayList num__views;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property group__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#group_of");
	private java.util.ArrayList group__of;
	private static com.hp.hpl.jena.rdf.model.Property num__authorsProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#num_authors");
	private java.util.ArrayList num__authors;
	private static com.hp.hpl.jena.rdf.model.Property has__creatorProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_creator");
	private java.util.ArrayList has__creator;
	private static com.hp.hpl.jena.rdf.model.Property noteProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#note");
	private java.util.ArrayList note;
	private static com.hp.hpl.jena.rdf.model.Property related__toProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#related_to");
	private java.util.ArrayList related__to;
	private static com.hp.hpl.jena.rdf.model.Property links__toProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#links_to");
	private java.util.ArrayList links__to;
	private static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/description");
	private java.util.ArrayList description;
	private static com.hp.hpl.jena.rdf.model.Property space__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#space_of");
	private java.util.ArrayList space__of;
	private static com.hp.hpl.jena.rdf.model.Property has__spaceProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_space");
	private java.util.ArrayList has__space;
	private static com.hp.hpl.jena.rdf.model.Property last__activity__dateProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#last_activity_date");
	private java.util.ArrayList last__activity__date;
	private static com.hp.hpl.jena.rdf.model.Property topicProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#topic");
	private java.util.ArrayList topic;
	private static com.hp.hpl.jena.rdf.model.Property has__partProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_part");
	private java.util.ArrayList has__part;
	private static com.hp.hpl.jena.rdf.model.Property scope__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#scope_of");
	private java.util.ArrayList scope__of;
	private static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/title");
	private java.util.ArrayList title;
	private static com.hp.hpl.jena.rdf.model.Property has__groupProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_group");
	private java.util.ArrayList has__group;
	private static com.hp.hpl.jena.rdf.model.Property host__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#host_of");
	private java.util.ArrayList host__of;
	private static com.hp.hpl.jena.rdf.model.Property has__administratorProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_administrator");
	private java.util.ArrayList has__administrator;
 

	SiteImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static SiteImpl getSite(Resource resource, Model model) throws JastorException {
		return new SiteImpl(resource, model);
	}
	    
	static SiteImpl createSite(Resource resource, Model model) throws JastorException { 
		SiteImpl impl = new SiteImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Site.TYPE)))
			impl._model.add(impl._resource, RDF.type, Site.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, edu.mit.dig.saveface.model.sioc.Space.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, edu.mit.dig.saveface.model.sioc.Space.TYPE));     
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	edu.mit.dig.saveface.model.sioc.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,has__usergroupProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,feedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,part__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,accountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,referencesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,depictionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__functionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,last__reply__dateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__ownerProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,num__repliesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,subjectProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,num__viewsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,group__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,num__authorsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__creatorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,noteProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,related__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,links__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,descriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,space__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__spaceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,last__activity__dateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,topicProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__partProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,scope__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,titleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__groupProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,host__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__administratorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.sioc.Site.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.sioc.Space.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		has__usergroup = null;
		feed = null;
		part__of = null;
		account = null;
		link = null;
		references = null;
		date = null;
		depiction = null;
		has__function = null;
		last__reply__date = null;
		name = null;
		has__owner = null;
		num__replies = null;
		subject = null;
		num__views = null;
		id = null;
		group__of = null;
		num__authors = null;
		has__creator = null;
		note = null;
		related__to = null;
		links__to = null;
		description = null;
		space__of = null;
		has__space = null;
		last__activity__date = null;
		topic = null;
		has__part = null;
		scope__of = null;
		title = null;
		has__group = null;
		host__of = null;
		has__administrator = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initHas__usergroup() throws JastorException {
		this.has__usergroup = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__usergroupProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_usergroup properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.Usergroup has__usergroup = edu.mit.dig.saveface.model.sioc.Factory.getUsergroup(resource,_model);
				this.has__usergroup.add(has__usergroup);
			}
		}
	}

	public java.util.Iterator getHas__usergroup() throws JastorException {
		if (has__usergroup == null)
			initHas__usergroup();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__usergroup,_resource,has__usergroupProperty,true);
	}

	public void addHas__usergroup(edu.mit.dig.saveface.model.sioc.Usergroup has__usergroup) throws JastorException {
		if (this.has__usergroup == null)
			initHas__usergroup();
		if (this.has__usergroup.contains(has__usergroup)) {
			this.has__usergroup.remove(has__usergroup);
			this.has__usergroup.add(has__usergroup);
			return;
		}
		this.has__usergroup.add(has__usergroup);
		_model.add(_model.createStatement(_resource,has__usergroupProperty,has__usergroup.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.Usergroup addHas__usergroup() throws JastorException {
		edu.mit.dig.saveface.model.sioc.Usergroup has__usergroup = edu.mit.dig.saveface.model.sioc.Factory.createUsergroup(_model.createResource(),_model);
		if (this.has__usergroup == null)
			initHas__usergroup();
		this.has__usergroup.add(has__usergroup);
		_model.add(_model.createStatement(_resource,has__usergroupProperty,has__usergroup.resource()));
		return has__usergroup;
	}
	
	public edu.mit.dig.saveface.model.sioc.Usergroup addHas__usergroup(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.Usergroup has__usergroup = edu.mit.dig.saveface.model.sioc.Factory.getUsergroup(resource,_model);
		if (this.has__usergroup == null)
			initHas__usergroup();
		if (this.has__usergroup.contains(has__usergroup))
			return has__usergroup;
		this.has__usergroup.add(has__usergroup);
		_model.add(_model.createStatement(_resource,has__usergroupProperty,has__usergroup.resource()));
		return has__usergroup;
	}
	
	public void removeHas__usergroup(edu.mit.dig.saveface.model.sioc.Usergroup has__usergroup) throws JastorException {
		if (this.has__usergroup == null)
			initHas__usergroup();
		if (!this.has__usergroup.contains(has__usergroup))
			return;
		if (!_model.contains(_resource, has__usergroupProperty, has__usergroup.resource()))
			return;
		this.has__usergroup.remove(has__usergroup);
		_model.removeAll(_resource, has__usergroupProperty, has__usergroup.resource());
	}
		 

	private void initFeed() throws JastorException {
		this.feed = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, feedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#feed properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing feed = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.feed.add(feed);
			}
		}
	}

	public java.util.Iterator getFeed() throws JastorException {
		if (feed == null)
			initFeed();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(feed,_resource,feedProperty,true);
	}

	public void addFeed(com.ibm.adtech.jastor.Thing feed) throws JastorException {
		if (this.feed == null)
			initFeed();
		if (this.feed.contains(feed)) {
			this.feed.remove(feed);
			this.feed.add(feed);
			return;
		}
		this.feed.add(feed);
		_model.add(_model.createStatement(_resource,feedProperty,feed.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addFeed() throws JastorException {
		com.ibm.adtech.jastor.Thing feed = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.feed == null)
			initFeed();
		this.feed.add(feed);
		_model.add(_model.createStatement(_resource,feedProperty,feed.resource()));
		return feed;
	}
	
	public com.ibm.adtech.jastor.Thing addFeed(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing feed = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.feed == null)
			initFeed();
		if (this.feed.contains(feed))
			return feed;
		this.feed.add(feed);
		_model.add(_model.createStatement(_resource,feedProperty,feed.resource()));
		return feed;
	}
	
	public void removeFeed(com.ibm.adtech.jastor.Thing feed) throws JastorException {
		if (this.feed == null)
			initFeed();
		if (!this.feed.contains(feed))
			return;
		if (!_model.contains(_resource, feedProperty, feed.resource()))
			return;
		this.feed.remove(feed);
		_model.removeAll(_resource, feedProperty, feed.resource());
	}
		 

	private void initPart__of() throws JastorException {
		this.part__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, part__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#part_of properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.part__of.add(part__of);
			}
		}
	}

	public java.util.Iterator getPart__of() throws JastorException {
		if (part__of == null)
			initPart__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(part__of,_resource,part__ofProperty,true);
	}

	public void addPart__of(com.ibm.adtech.jastor.Thing part__of) throws JastorException {
		if (this.part__of == null)
			initPart__of();
		if (this.part__of.contains(part__of)) {
			this.part__of.remove(part__of);
			this.part__of.add(part__of);
			return;
		}
		this.part__of.add(part__of);
		_model.add(_model.createStatement(_resource,part__ofProperty,part__of.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPart__of() throws JastorException {
		com.ibm.adtech.jastor.Thing part__of = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.part__of == null)
			initPart__of();
		this.part__of.add(part__of);
		_model.add(_model.createStatement(_resource,part__ofProperty,part__of.resource()));
		return part__of;
	}
	
	public com.ibm.adtech.jastor.Thing addPart__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.part__of == null)
			initPart__of();
		if (this.part__of.contains(part__of))
			return part__of;
		this.part__of.add(part__of);
		_model.add(_model.createStatement(_resource,part__ofProperty,part__of.resource()));
		return part__of;
	}
	
	public void removePart__of(com.ibm.adtech.jastor.Thing part__of) throws JastorException {
		if (this.part__of == null)
			initPart__of();
		if (!this.part__of.contains(part__of))
			return;
		if (!_model.contains(_resource, part__ofProperty, part__of.resource()))
			return;
		this.part__of.remove(part__of);
		_model.removeAll(_resource, part__ofProperty, part__of.resource());
	}
		 

	private void initAccount() throws JastorException {
		this.account = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, accountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/account properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing account = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.account.add(account);
			}
		}
	}

	public java.util.Iterator getAccount() throws JastorException {
		if (account == null)
			initAccount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(account,_resource,accountProperty,true);
	}

	public void addAccount(com.ibm.adtech.jastor.Thing account) throws JastorException {
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
	
	public com.ibm.adtech.jastor.Thing addAccount() throws JastorException {
		com.ibm.adtech.jastor.Thing account = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.account == null)
			initAccount();
		this.account.add(account);
		_model.add(_model.createStatement(_resource,accountProperty,account.resource()));
		return account;
	}
	
	public com.ibm.adtech.jastor.Thing addAccount(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing account = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.account == null)
			initAccount();
		if (this.account.contains(account))
			return account;
		this.account.add(account);
		_model.add(_model.createStatement(_resource,accountProperty,account.resource()));
		return account;
	}
	
	public void removeAccount(com.ibm.adtech.jastor.Thing account) throws JastorException {
		if (this.account == null)
			initAccount();
		if (!this.account.contains(account))
			return;
		if (!_model.contains(_resource, accountProperty, account.resource()))
			return;
		this.account.remove(account);
		_model.removeAll(_resource, accountProperty, account.resource());
	}
		 

	private void initLink() throws JastorException {
		this.link = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#link properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing link = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.link.add(link);
			}
		}
	}

	public java.util.Iterator getLink() throws JastorException {
		if (link == null)
			initLink();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(link,_resource,linkProperty,true);
	}

	public void addLink(com.ibm.adtech.jastor.Thing link) throws JastorException {
		if (this.link == null)
			initLink();
		if (this.link.contains(link)) {
			this.link.remove(link);
			this.link.add(link);
			return;
		}
		this.link.add(link);
		_model.add(_model.createStatement(_resource,linkProperty,link.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLink() throws JastorException {
		com.ibm.adtech.jastor.Thing link = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.link == null)
			initLink();
		this.link.add(link);
		_model.add(_model.createStatement(_resource,linkProperty,link.resource()));
		return link;
	}
	
	public com.ibm.adtech.jastor.Thing addLink(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing link = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.link == null)
			initLink();
		if (this.link.contains(link))
			return link;
		this.link.add(link);
		_model.add(_model.createStatement(_resource,linkProperty,link.resource()));
		return link;
	}
	
	public void removeLink(com.ibm.adtech.jastor.Thing link) throws JastorException {
		if (this.link == null)
			initLink();
		if (!this.link.contains(link))
			return;
		if (!_model.contains(_resource, linkProperty, link.resource()))
			return;
		this.link.remove(link);
		_model.removeAll(_resource, linkProperty, link.resource());
	}
		 

	private void initReferences() throws JastorException {
		this.references = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, referencesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/references properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing references = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.references.add(references);
			}
		}
	}

	public java.util.Iterator getReferences() throws JastorException {
		if (references == null)
			initReferences();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(references,_resource,referencesProperty,true);
	}

	public void addReferences(com.ibm.adtech.jastor.Thing references) throws JastorException {
		if (this.references == null)
			initReferences();
		if (this.references.contains(references)) {
			this.references.remove(references);
			this.references.add(references);
			return;
		}
		this.references.add(references);
		_model.add(_model.createStatement(_resource,referencesProperty,references.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addReferences() throws JastorException {
		com.ibm.adtech.jastor.Thing references = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.references == null)
			initReferences();
		this.references.add(references);
		_model.add(_model.createStatement(_resource,referencesProperty,references.resource()));
		return references;
	}
	
	public com.ibm.adtech.jastor.Thing addReferences(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing references = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.references == null)
			initReferences();
		if (this.references.contains(references))
			return references;
		this.references.add(references);
		_model.add(_model.createStatement(_resource,referencesProperty,references.resource()));
		return references;
	}
	
	public void removeReferences(com.ibm.adtech.jastor.Thing references) throws JastorException {
		if (this.references == null)
			initReferences();
		if (!this.references.contains(references))
			return;
		if (!_model.contains(_resource, referencesProperty, references.resource()))
			return;
		this.references.remove(references);
		_model.removeAll(_resource, referencesProperty, references.resource());
	}
		 

	private void initDate() throws JastorException {
		date = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/date properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			date.add(literal);
		}
	}

	public java.util.Iterator getDate() throws JastorException {
		if (date == null)
			initDate();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(date,_resource,dateProperty,false);
	}

	public void addDate(com.hp.hpl.jena.rdf.model.Literal date) throws JastorException {
		if (this.date == null)
			initDate();
		if (this.date.contains(date))
			return;
		if (_model.contains(_resource, dateProperty, createLiteral(date)))
			return;
		this.date.add(date);
		_model.add(_resource, dateProperty, date);
	}
	
	public void removeDate(com.hp.hpl.jena.rdf.model.Literal date) throws JastorException {
		if (this.date == null)
			initDate();
		if (!this.date.contains(date))
			return;
		if (!_model.contains(_resource, dateProperty, createLiteral(date)))
			return;
		this.date.remove(date);
		_model.removeAll(_resource, dateProperty, createLiteral(date));
	}


	private void initDepiction() throws JastorException {
		this.depiction = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, depictionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://xmlns.com/foaf/0.1/depiction properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing depiction = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.depiction.add(depiction);
			}
		}
	}

	public java.util.Iterator getDepiction() throws JastorException {
		if (depiction == null)
			initDepiction();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(depiction,_resource,depictionProperty,true);
	}

	public void addDepiction(com.ibm.adtech.jastor.Thing depiction) throws JastorException {
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
	
	public com.ibm.adtech.jastor.Thing addDepiction() throws JastorException {
		com.ibm.adtech.jastor.Thing depiction = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.depiction == null)
			initDepiction();
		this.depiction.add(depiction);
		_model.add(_model.createStatement(_resource,depictionProperty,depiction.resource()));
		return depiction;
	}
	
	public com.ibm.adtech.jastor.Thing addDepiction(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing depiction = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.depiction == null)
			initDepiction();
		if (this.depiction.contains(depiction))
			return depiction;
		this.depiction.add(depiction);
		_model.add(_model.createStatement(_resource,depictionProperty,depiction.resource()));
		return depiction;
	}
	
	public void removeDepiction(com.ibm.adtech.jastor.Thing depiction) throws JastorException {
		if (this.depiction == null)
			initDepiction();
		if (!this.depiction.contains(depiction))
			return;
		if (!_model.contains(_resource, depictionProperty, depiction.resource()))
			return;
		this.depiction.remove(depiction);
		_model.removeAll(_resource, depictionProperty, depiction.resource());
	}
		 

	private void initHas__function() throws JastorException {
		this.has__function = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__functionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_function properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.Role has__function = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
				this.has__function.add(has__function);
			}
		}
	}

	public java.util.Iterator getHas__function() throws JastorException {
		if (has__function == null)
			initHas__function();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__function,_resource,has__functionProperty,true);
	}

	public void addHas__function(edu.mit.dig.saveface.model.sioc.Role has__function) throws JastorException {
		if (this.has__function == null)
			initHas__function();
		if (this.has__function.contains(has__function)) {
			this.has__function.remove(has__function);
			this.has__function.add(has__function);
			return;
		}
		this.has__function.add(has__function);
		_model.add(_model.createStatement(_resource,has__functionProperty,has__function.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.Role addHas__function() throws JastorException {
		edu.mit.dig.saveface.model.sioc.Role has__function = edu.mit.dig.saveface.model.sioc.Factory.createRole(_model.createResource(),_model);
		if (this.has__function == null)
			initHas__function();
		this.has__function.add(has__function);
		_model.add(_model.createStatement(_resource,has__functionProperty,has__function.resource()));
		return has__function;
	}
	
	public edu.mit.dig.saveface.model.sioc.Role addHas__function(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.Role has__function = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
		if (this.has__function == null)
			initHas__function();
		if (this.has__function.contains(has__function))
			return has__function;
		this.has__function.add(has__function);
		_model.add(_model.createStatement(_resource,has__functionProperty,has__function.resource()));
		return has__function;
	}
	
	public void removeHas__function(edu.mit.dig.saveface.model.sioc.Role has__function) throws JastorException {
		if (this.has__function == null)
			initHas__function();
		if (!this.has__function.contains(has__function))
			return;
		if (!_model.contains(_resource, has__functionProperty, has__function.resource()))
			return;
		this.has__function.remove(has__function);
		_model.removeAll(_resource, has__functionProperty, has__function.resource());
	}
		 

	private void initLast__reply__date() throws JastorException {
		last__reply__date = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, last__reply__dateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#last_reply_date properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			last__reply__date.add(literal);
		}
	}

	public java.util.Iterator getLast__reply__date() throws JastorException {
		if (last__reply__date == null)
			initLast__reply__date();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(last__reply__date,_resource,last__reply__dateProperty,false);
	}

	public void addLast__reply__date(com.hp.hpl.jena.rdf.model.Literal last__reply__date) throws JastorException {
		if (this.last__reply__date == null)
			initLast__reply__date();
		if (this.last__reply__date.contains(last__reply__date))
			return;
		if (_model.contains(_resource, last__reply__dateProperty, createLiteral(last__reply__date)))
			return;
		this.last__reply__date.add(last__reply__date);
		_model.add(_resource, last__reply__dateProperty, last__reply__date);
	}
	
	public void removeLast__reply__date(com.hp.hpl.jena.rdf.model.Literal last__reply__date) throws JastorException {
		if (this.last__reply__date == null)
			initLast__reply__date();
		if (!this.last__reply__date.contains(last__reply__date))
			return;
		if (!_model.contains(_resource, last__reply__dateProperty, createLiteral(last__reply__date)))
			return;
		this.last__reply__date.remove(last__reply__date);
		_model.removeAll(_resource, last__reply__dateProperty, createLiteral(last__reply__date));
	}


	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#name properties in Site model not a Literal", stmt.getObject());
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


	private void initHas__owner() throws JastorException {
		this.has__owner = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__ownerProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_owner properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.UserAccount has__owner = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
				this.has__owner.add(has__owner);
			}
		}
	}

	public java.util.Iterator getHas__owner() throws JastorException {
		if (has__owner == null)
			initHas__owner();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__owner,_resource,has__ownerProperty,true);
	}

	public void addHas__owner(edu.mit.dig.saveface.model.sioc.UserAccount has__owner) throws JastorException {
		if (this.has__owner == null)
			initHas__owner();
		if (this.has__owner.contains(has__owner)) {
			this.has__owner.remove(has__owner);
			this.has__owner.add(has__owner);
			return;
		}
		this.has__owner.add(has__owner);
		_model.add(_model.createStatement(_resource,has__ownerProperty,has__owner.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__owner() throws JastorException {
		edu.mit.dig.saveface.model.sioc.UserAccount has__owner = edu.mit.dig.saveface.model.sioc.Factory.createUserAccount(_model.createResource(),_model);
		if (this.has__owner == null)
			initHas__owner();
		this.has__owner.add(has__owner);
		_model.add(_model.createStatement(_resource,has__ownerProperty,has__owner.resource()));
		return has__owner;
	}
	
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__owner(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.UserAccount has__owner = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
		if (this.has__owner == null)
			initHas__owner();
		if (this.has__owner.contains(has__owner))
			return has__owner;
		this.has__owner.add(has__owner);
		_model.add(_model.createStatement(_resource,has__ownerProperty,has__owner.resource()));
		return has__owner;
	}
	
	public void removeHas__owner(edu.mit.dig.saveface.model.sioc.UserAccount has__owner) throws JastorException {
		if (this.has__owner == null)
			initHas__owner();
		if (!this.has__owner.contains(has__owner))
			return;
		if (!_model.contains(_resource, has__ownerProperty, has__owner.resource()))
			return;
		this.has__owner.remove(has__owner);
		_model.removeAll(_resource, has__ownerProperty, has__owner.resource());
	}
		 

	private void initNum__replies() throws JastorException {
		num__replies = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, num__repliesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#num_replies properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
			if (obj != null)
				num__replies.add(obj);
		}
	}

	public java.util.Iterator getNum__replies() throws JastorException {
		if (num__replies == null)
			initNum__replies();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(num__replies,_resource,num__repliesProperty,false);
	}

	public void addNum__replies(java.lang.String num__replies) throws JastorException {
		if (this.num__replies == null)
			initNum__replies();
		if (this.num__replies.contains(num__replies))
			return;
		if (_model.contains(_resource, num__repliesProperty, createLiteral(num__replies)))
			return;
		this.num__replies.add(num__replies);
		_model.add(_resource, num__repliesProperty, createLiteral(num__replies));
	}
	
	public void removeNum__replies(java.lang.String num__replies) throws JastorException {
		if (this.num__replies == null)
			initNum__replies();
		if (!this.num__replies.contains(num__replies))
			return;
		if (!_model.contains(_resource, num__repliesProperty, createLiteral(num__replies)))
			return;
		this.num__replies.remove(num__replies);
		_model.removeAll(_resource, num__repliesProperty, createLiteral(num__replies));
	}


	private void initSubject() throws JastorException {
		this.subject = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, subjectProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/subject properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing subject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.subject.add(subject);
			}
		}
	}

	public java.util.Iterator getSubject() throws JastorException {
		if (subject == null)
			initSubject();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(subject,_resource,subjectProperty,true);
	}

	public void addSubject(com.ibm.adtech.jastor.Thing subject) throws JastorException {
		if (this.subject == null)
			initSubject();
		if (this.subject.contains(subject)) {
			this.subject.remove(subject);
			this.subject.add(subject);
			return;
		}
		this.subject.add(subject);
		_model.add(_model.createStatement(_resource,subjectProperty,subject.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addSubject() throws JastorException {
		com.ibm.adtech.jastor.Thing subject = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.subject == null)
			initSubject();
		this.subject.add(subject);
		_model.add(_model.createStatement(_resource,subjectProperty,subject.resource()));
		return subject;
	}
	
	public com.ibm.adtech.jastor.Thing addSubject(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing subject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.subject == null)
			initSubject();
		if (this.subject.contains(subject))
			return subject;
		this.subject.add(subject);
		_model.add(_model.createStatement(_resource,subjectProperty,subject.resource()));
		return subject;
	}
	
	public void removeSubject(com.ibm.adtech.jastor.Thing subject) throws JastorException {
		if (this.subject == null)
			initSubject();
		if (!this.subject.contains(subject))
			return;
		if (!_model.contains(_resource, subjectProperty, subject.resource()))
			return;
		this.subject.remove(subject);
		_model.removeAll(_resource, subjectProperty, subject.resource());
	}
		 

	private void initNum__views() throws JastorException {
		num__views = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, num__viewsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#num_views properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
			if (obj != null)
				num__views.add(obj);
		}
	}

	public java.util.Iterator getNum__views() throws JastorException {
		if (num__views == null)
			initNum__views();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(num__views,_resource,num__viewsProperty,false);
	}

	public void addNum__views(java.lang.String num__views) throws JastorException {
		if (this.num__views == null)
			initNum__views();
		if (this.num__views.contains(num__views))
			return;
		if (_model.contains(_resource, num__viewsProperty, createLiteral(num__views)))
			return;
		this.num__views.add(num__views);
		_model.add(_resource, num__viewsProperty, createLiteral(num__views));
	}
	
	public void removeNum__views(java.lang.String num__views) throws JastorException {
		if (this.num__views == null)
			initNum__views();
		if (!this.num__views.contains(num__views))
			return;
		if (!_model.contains(_resource, num__viewsProperty, createLiteral(num__views)))
			return;
		this.num__views.remove(num__views);
		_model.removeAll(_resource, num__viewsProperty, createLiteral(num__views));
	}


	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#id properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			id.add(literal);
		}
	}

	public java.util.Iterator getId() throws JastorException {
		if (id == null)
			initId();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(id,_resource,idProperty,false);
	}

	public void addId(com.hp.hpl.jena.rdf.model.Literal id) throws JastorException {
		if (this.id == null)
			initId();
		if (this.id.contains(id))
			return;
		if (_model.contains(_resource, idProperty, createLiteral(id)))
			return;
		this.id.add(id);
		_model.add(_resource, idProperty, id);
	}
	
	public void removeId(com.hp.hpl.jena.rdf.model.Literal id) throws JastorException {
		if (this.id == null)
			initId();
		if (!this.id.contains(id))
			return;
		if (!_model.contains(_resource, idProperty, createLiteral(id)))
			return;
		this.id.remove(id);
		_model.removeAll(_resource, idProperty, createLiteral(id));
	}


	private void initGroup__of() throws JastorException {
		this.group__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, group__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#group_of properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing group__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.group__of.add(group__of);
			}
		}
	}

	public java.util.Iterator getGroup__of() throws JastorException {
		if (group__of == null)
			initGroup__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(group__of,_resource,group__ofProperty,true);
	}

	public void addGroup__of(com.ibm.adtech.jastor.Thing group__of) throws JastorException {
		if (this.group__of == null)
			initGroup__of();
		if (this.group__of.contains(group__of)) {
			this.group__of.remove(group__of);
			this.group__of.add(group__of);
			return;
		}
		this.group__of.add(group__of);
		_model.add(_model.createStatement(_resource,group__ofProperty,group__of.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addGroup__of() throws JastorException {
		com.ibm.adtech.jastor.Thing group__of = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.group__of == null)
			initGroup__of();
		this.group__of.add(group__of);
		_model.add(_model.createStatement(_resource,group__ofProperty,group__of.resource()));
		return group__of;
	}
	
	public com.ibm.adtech.jastor.Thing addGroup__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing group__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.group__of == null)
			initGroup__of();
		if (this.group__of.contains(group__of))
			return group__of;
		this.group__of.add(group__of);
		_model.add(_model.createStatement(_resource,group__ofProperty,group__of.resource()));
		return group__of;
	}
	
	public void removeGroup__of(com.ibm.adtech.jastor.Thing group__of) throws JastorException {
		if (this.group__of == null)
			initGroup__of();
		if (!this.group__of.contains(group__of))
			return;
		if (!_model.contains(_resource, group__ofProperty, group__of.resource()))
			return;
		this.group__of.remove(group__of);
		_model.removeAll(_resource, group__ofProperty, group__of.resource());
	}
		 

	private void initNum__authors() throws JastorException {
		num__authors = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, num__authorsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#num_authors properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
			if (obj != null)
				num__authors.add(obj);
		}
	}

	public java.util.Iterator getNum__authors() throws JastorException {
		if (num__authors == null)
			initNum__authors();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(num__authors,_resource,num__authorsProperty,false);
	}

	public void addNum__authors(java.lang.String num__authors) throws JastorException {
		if (this.num__authors == null)
			initNum__authors();
		if (this.num__authors.contains(num__authors))
			return;
		if (_model.contains(_resource, num__authorsProperty, createLiteral(num__authors)))
			return;
		this.num__authors.add(num__authors);
		_model.add(_resource, num__authorsProperty, createLiteral(num__authors));
	}
	
	public void removeNum__authors(java.lang.String num__authors) throws JastorException {
		if (this.num__authors == null)
			initNum__authors();
		if (!this.num__authors.contains(num__authors))
			return;
		if (!_model.contains(_resource, num__authorsProperty, createLiteral(num__authors)))
			return;
		this.num__authors.remove(num__authors);
		_model.removeAll(_resource, num__authorsProperty, createLiteral(num__authors));
	}


	private void initHas__creator() throws JastorException {
		this.has__creator = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__creatorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_creator properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.UserAccount has__creator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
				this.has__creator.add(has__creator);
			}
		}
	}

	public java.util.Iterator getHas__creator() throws JastorException {
		if (has__creator == null)
			initHas__creator();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__creator,_resource,has__creatorProperty,true);
	}

	public void addHas__creator(edu.mit.dig.saveface.model.sioc.UserAccount has__creator) throws JastorException {
		if (this.has__creator == null)
			initHas__creator();
		if (this.has__creator.contains(has__creator)) {
			this.has__creator.remove(has__creator);
			this.has__creator.add(has__creator);
			return;
		}
		this.has__creator.add(has__creator);
		_model.add(_model.createStatement(_resource,has__creatorProperty,has__creator.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__creator() throws JastorException {
		edu.mit.dig.saveface.model.sioc.UserAccount has__creator = edu.mit.dig.saveface.model.sioc.Factory.createUserAccount(_model.createResource(),_model);
		if (this.has__creator == null)
			initHas__creator();
		this.has__creator.add(has__creator);
		_model.add(_model.createStatement(_resource,has__creatorProperty,has__creator.resource()));
		return has__creator;
	}
	
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__creator(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.UserAccount has__creator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
		if (this.has__creator == null)
			initHas__creator();
		if (this.has__creator.contains(has__creator))
			return has__creator;
		this.has__creator.add(has__creator);
		_model.add(_model.createStatement(_resource,has__creatorProperty,has__creator.resource()));
		return has__creator;
	}
	
	public void removeHas__creator(edu.mit.dig.saveface.model.sioc.UserAccount has__creator) throws JastorException {
		if (this.has__creator == null)
			initHas__creator();
		if (!this.has__creator.contains(has__creator))
			return;
		if (!_model.contains(_resource, has__creatorProperty, has__creator.resource()))
			return;
		this.has__creator.remove(has__creator);
		_model.removeAll(_resource, has__creatorProperty, has__creator.resource());
	}
		 

	private void initNote() throws JastorException {
		note = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, noteProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#note properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			note.add(literal);
		}
	}

	public java.util.Iterator getNote() throws JastorException {
		if (note == null)
			initNote();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(note,_resource,noteProperty,false);
	}

	public void addNote(com.hp.hpl.jena.rdf.model.Literal note) throws JastorException {
		if (this.note == null)
			initNote();
		if (this.note.contains(note))
			return;
		if (_model.contains(_resource, noteProperty, createLiteral(note)))
			return;
		this.note.add(note);
		_model.add(_resource, noteProperty, note);
	}
	
	public void removeNote(com.hp.hpl.jena.rdf.model.Literal note) throws JastorException {
		if (this.note == null)
			initNote();
		if (!this.note.contains(note))
			return;
		if (!_model.contains(_resource, noteProperty, createLiteral(note)))
			return;
		this.note.remove(note);
		_model.removeAll(_resource, noteProperty, createLiteral(note));
	}


	private void initRelated__to() throws JastorException {
		this.related__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, related__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#related_to properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing related__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.related__to.add(related__to);
			}
		}
	}

	public java.util.Iterator getRelated__to() throws JastorException {
		if (related__to == null)
			initRelated__to();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(related__to,_resource,related__toProperty,true);
	}

	public void addRelated__to(com.ibm.adtech.jastor.Thing related__to) throws JastorException {
		if (this.related__to == null)
			initRelated__to();
		if (this.related__to.contains(related__to)) {
			this.related__to.remove(related__to);
			this.related__to.add(related__to);
			return;
		}
		this.related__to.add(related__to);
		_model.add(_model.createStatement(_resource,related__toProperty,related__to.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addRelated__to() throws JastorException {
		com.ibm.adtech.jastor.Thing related__to = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.related__to == null)
			initRelated__to();
		this.related__to.add(related__to);
		_model.add(_model.createStatement(_resource,related__toProperty,related__to.resource()));
		return related__to;
	}
	
	public com.ibm.adtech.jastor.Thing addRelated__to(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing related__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.related__to == null)
			initRelated__to();
		if (this.related__to.contains(related__to))
			return related__to;
		this.related__to.add(related__to);
		_model.add(_model.createStatement(_resource,related__toProperty,related__to.resource()));
		return related__to;
	}
	
	public void removeRelated__to(com.ibm.adtech.jastor.Thing related__to) throws JastorException {
		if (this.related__to == null)
			initRelated__to();
		if (!this.related__to.contains(related__to))
			return;
		if (!_model.contains(_resource, related__toProperty, related__to.resource()))
			return;
		this.related__to.remove(related__to);
		_model.removeAll(_resource, related__toProperty, related__to.resource());
	}
		 

	private void initLinks__to() throws JastorException {
		this.links__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, links__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#links_to properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing links__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.links__to.add(links__to);
			}
		}
	}

	public java.util.Iterator getLinks__to() throws JastorException {
		if (links__to == null)
			initLinks__to();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(links__to,_resource,links__toProperty,true);
	}

	public void addLinks__to(com.ibm.adtech.jastor.Thing links__to) throws JastorException {
		if (this.links__to == null)
			initLinks__to();
		if (this.links__to.contains(links__to)) {
			this.links__to.remove(links__to);
			this.links__to.add(links__to);
			return;
		}
		this.links__to.add(links__to);
		_model.add(_model.createStatement(_resource,links__toProperty,links__to.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLinks__to() throws JastorException {
		com.ibm.adtech.jastor.Thing links__to = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.links__to == null)
			initLinks__to();
		this.links__to.add(links__to);
		_model.add(_model.createStatement(_resource,links__toProperty,links__to.resource()));
		return links__to;
	}
	
	public com.ibm.adtech.jastor.Thing addLinks__to(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing links__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.links__to == null)
			initLinks__to();
		if (this.links__to.contains(links__to))
			return links__to;
		this.links__to.add(links__to);
		_model.add(_model.createStatement(_resource,links__toProperty,links__to.resource()));
		return links__to;
	}
	
	public void removeLinks__to(com.ibm.adtech.jastor.Thing links__to) throws JastorException {
		if (this.links__to == null)
			initLinks__to();
		if (!this.links__to.contains(links__to))
			return;
		if (!_model.contains(_resource, links__toProperty, links__to.resource()))
			return;
		this.links__to.remove(links__to);
		_model.removeAll(_resource, links__toProperty, links__to.resource());
	}
		 

	private void initDescription() throws JastorException {
		description = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, descriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/description properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			description.add(literal);
		}
	}

	public java.util.Iterator getDescription() throws JastorException {
		if (description == null)
			initDescription();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(description,_resource,descriptionProperty,false);
	}

	public void addDescription(com.hp.hpl.jena.rdf.model.Literal description) throws JastorException {
		if (this.description == null)
			initDescription();
		if (this.description.contains(description))
			return;
		if (_model.contains(_resource, descriptionProperty, createLiteral(description)))
			return;
		this.description.add(description);
		_model.add(_resource, descriptionProperty, description);
	}
	
	public void removeDescription(com.hp.hpl.jena.rdf.model.Literal description) throws JastorException {
		if (this.description == null)
			initDescription();
		if (!this.description.contains(description))
			return;
		if (!_model.contains(_resource, descriptionProperty, createLiteral(description)))
			return;
		this.description.remove(description);
		_model.removeAll(_resource, descriptionProperty, createLiteral(description));
	}


	private void initSpace__of() throws JastorException {
		this.space__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, space__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#space_of properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing space__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.space__of.add(space__of);
			}
		}
	}

	public java.util.Iterator getSpace__of() throws JastorException {
		if (space__of == null)
			initSpace__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(space__of,_resource,space__ofProperty,true);
	}

	public void addSpace__of(com.ibm.adtech.jastor.Thing space__of) throws JastorException {
		if (this.space__of == null)
			initSpace__of();
		if (this.space__of.contains(space__of)) {
			this.space__of.remove(space__of);
			this.space__of.add(space__of);
			return;
		}
		this.space__of.add(space__of);
		_model.add(_model.createStatement(_resource,space__ofProperty,space__of.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addSpace__of() throws JastorException {
		com.ibm.adtech.jastor.Thing space__of = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.space__of == null)
			initSpace__of();
		this.space__of.add(space__of);
		_model.add(_model.createStatement(_resource,space__ofProperty,space__of.resource()));
		return space__of;
	}
	
	public com.ibm.adtech.jastor.Thing addSpace__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing space__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.space__of == null)
			initSpace__of();
		if (this.space__of.contains(space__of))
			return space__of;
		this.space__of.add(space__of);
		_model.add(_model.createStatement(_resource,space__ofProperty,space__of.resource()));
		return space__of;
	}
	
	public void removeSpace__of(com.ibm.adtech.jastor.Thing space__of) throws JastorException {
		if (this.space__of == null)
			initSpace__of();
		if (!this.space__of.contains(space__of))
			return;
		if (!_model.contains(_resource, space__ofProperty, space__of.resource()))
			return;
		this.space__of.remove(space__of);
		_model.removeAll(_resource, space__ofProperty, space__of.resource());
	}
		 

	private void initHas__space() throws JastorException {
		this.has__space = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__spaceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_space properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.Space has__space = edu.mit.dig.saveface.model.sioc.Factory.getSpace(resource,_model);
				this.has__space.add(has__space);
			}
		}
	}

	public java.util.Iterator getHas__space() throws JastorException {
		if (has__space == null)
			initHas__space();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__space,_resource,has__spaceProperty,true);
	}

	public void addHas__space(edu.mit.dig.saveface.model.sioc.Space has__space) throws JastorException {
		if (this.has__space == null)
			initHas__space();
		if (this.has__space.contains(has__space)) {
			this.has__space.remove(has__space);
			this.has__space.add(has__space);
			return;
		}
		this.has__space.add(has__space);
		_model.add(_model.createStatement(_resource,has__spaceProperty,has__space.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.Space addHas__space() throws JastorException {
		edu.mit.dig.saveface.model.sioc.Space has__space = edu.mit.dig.saveface.model.sioc.Factory.createSpace(_model.createResource(),_model);
		if (this.has__space == null)
			initHas__space();
		this.has__space.add(has__space);
		_model.add(_model.createStatement(_resource,has__spaceProperty,has__space.resource()));
		return has__space;
	}
	
	public edu.mit.dig.saveface.model.sioc.Space addHas__space(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.Space has__space = edu.mit.dig.saveface.model.sioc.Factory.getSpace(resource,_model);
		if (this.has__space == null)
			initHas__space();
		if (this.has__space.contains(has__space))
			return has__space;
		this.has__space.add(has__space);
		_model.add(_model.createStatement(_resource,has__spaceProperty,has__space.resource()));
		return has__space;
	}
	
	public void removeHas__space(edu.mit.dig.saveface.model.sioc.Space has__space) throws JastorException {
		if (this.has__space == null)
			initHas__space();
		if (!this.has__space.contains(has__space))
			return;
		if (!_model.contains(_resource, has__spaceProperty, has__space.resource()))
			return;
		this.has__space.remove(has__space);
		_model.removeAll(_resource, has__spaceProperty, has__space.resource());
	}
		 

	private void initLast__activity__date() throws JastorException {
		last__activity__date = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, last__activity__dateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#last_activity_date properties in Site model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			last__activity__date.add(literal);
		}
	}

	public java.util.Iterator getLast__activity__date() throws JastorException {
		if (last__activity__date == null)
			initLast__activity__date();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(last__activity__date,_resource,last__activity__dateProperty,false);
	}

	public void addLast__activity__date(com.hp.hpl.jena.rdf.model.Literal last__activity__date) throws JastorException {
		if (this.last__activity__date == null)
			initLast__activity__date();
		if (this.last__activity__date.contains(last__activity__date))
			return;
		if (_model.contains(_resource, last__activity__dateProperty, createLiteral(last__activity__date)))
			return;
		this.last__activity__date.add(last__activity__date);
		_model.add(_resource, last__activity__dateProperty, last__activity__date);
	}
	
	public void removeLast__activity__date(com.hp.hpl.jena.rdf.model.Literal last__activity__date) throws JastorException {
		if (this.last__activity__date == null)
			initLast__activity__date();
		if (!this.last__activity__date.contains(last__activity__date))
			return;
		if (!_model.contains(_resource, last__activity__dateProperty, createLiteral(last__activity__date)))
			return;
		this.last__activity__date.remove(last__activity__date);
		_model.removeAll(_resource, last__activity__dateProperty, createLiteral(last__activity__date));
	}


	private void initTopic() throws JastorException {
		this.topic = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, topicProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#topic properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing topic = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.topic.add(topic);
			}
		}
	}

	public java.util.Iterator getTopic() throws JastorException {
		if (topic == null)
			initTopic();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(topic,_resource,topicProperty,true);
	}

	public void addTopic(com.ibm.adtech.jastor.Thing topic) throws JastorException {
		if (this.topic == null)
			initTopic();
		if (this.topic.contains(topic)) {
			this.topic.remove(topic);
			this.topic.add(topic);
			return;
		}
		this.topic.add(topic);
		_model.add(_model.createStatement(_resource,topicProperty,topic.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addTopic() throws JastorException {
		com.ibm.adtech.jastor.Thing topic = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.topic == null)
			initTopic();
		this.topic.add(topic);
		_model.add(_model.createStatement(_resource,topicProperty,topic.resource()));
		return topic;
	}
	
	public com.ibm.adtech.jastor.Thing addTopic(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing topic = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.topic == null)
			initTopic();
		if (this.topic.contains(topic))
			return topic;
		this.topic.add(topic);
		_model.add(_model.createStatement(_resource,topicProperty,topic.resource()));
		return topic;
	}
	
	public void removeTopic(com.ibm.adtech.jastor.Thing topic) throws JastorException {
		if (this.topic == null)
			initTopic();
		if (!this.topic.contains(topic))
			return;
		if (!_model.contains(_resource, topicProperty, topic.resource()))
			return;
		this.topic.remove(topic);
		_model.removeAll(_resource, topicProperty, topic.resource());
	}
		 

	private void initHas__part() throws JastorException {
		this.has__part = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__partProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_part properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing has__part = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.has__part.add(has__part);
			}
		}
	}

	public java.util.Iterator getHas__part() throws JastorException {
		if (has__part == null)
			initHas__part();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__part,_resource,has__partProperty,true);
	}

	public void addHas__part(com.ibm.adtech.jastor.Thing has__part) throws JastorException {
		if (this.has__part == null)
			initHas__part();
		if (this.has__part.contains(has__part)) {
			this.has__part.remove(has__part);
			this.has__part.add(has__part);
			return;
		}
		this.has__part.add(has__part);
		_model.add(_model.createStatement(_resource,has__partProperty,has__part.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHas__part() throws JastorException {
		com.ibm.adtech.jastor.Thing has__part = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.has__part == null)
			initHas__part();
		this.has__part.add(has__part);
		_model.add(_model.createStatement(_resource,has__partProperty,has__part.resource()));
		return has__part;
	}
	
	public com.ibm.adtech.jastor.Thing addHas__part(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing has__part = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.has__part == null)
			initHas__part();
		if (this.has__part.contains(has__part))
			return has__part;
		this.has__part.add(has__part);
		_model.add(_model.createStatement(_resource,has__partProperty,has__part.resource()));
		return has__part;
	}
	
	public void removeHas__part(com.ibm.adtech.jastor.Thing has__part) throws JastorException {
		if (this.has__part == null)
			initHas__part();
		if (!this.has__part.contains(has__part))
			return;
		if (!_model.contains(_resource, has__partProperty, has__part.resource()))
			return;
		this.has__part.remove(has__part);
		_model.removeAll(_resource, has__partProperty, has__part.resource());
	}
		 

	private void initScope__of() throws JastorException {
		this.scope__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, scope__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#scope_of properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.Role scope__of = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
				this.scope__of.add(scope__of);
			}
		}
	}

	public java.util.Iterator getScope__of() throws JastorException {
		if (scope__of == null)
			initScope__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(scope__of,_resource,scope__ofProperty,true);
	}

	public void addScope__of(edu.mit.dig.saveface.model.sioc.Role scope__of) throws JastorException {
		if (this.scope__of == null)
			initScope__of();
		if (this.scope__of.contains(scope__of)) {
			this.scope__of.remove(scope__of);
			this.scope__of.add(scope__of);
			return;
		}
		this.scope__of.add(scope__of);
		_model.add(_model.createStatement(_resource,scope__ofProperty,scope__of.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.Role addScope__of() throws JastorException {
		edu.mit.dig.saveface.model.sioc.Role scope__of = edu.mit.dig.saveface.model.sioc.Factory.createRole(_model.createResource(),_model);
		if (this.scope__of == null)
			initScope__of();
		this.scope__of.add(scope__of);
		_model.add(_model.createStatement(_resource,scope__ofProperty,scope__of.resource()));
		return scope__of;
	}
	
	public edu.mit.dig.saveface.model.sioc.Role addScope__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.Role scope__of = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
		if (this.scope__of == null)
			initScope__of();
		if (this.scope__of.contains(scope__of))
			return scope__of;
		this.scope__of.add(scope__of);
		_model.add(_model.createStatement(_resource,scope__ofProperty,scope__of.resource()));
		return scope__of;
	}
	
	public void removeScope__of(edu.mit.dig.saveface.model.sioc.Role scope__of) throws JastorException {
		if (this.scope__of == null)
			initScope__of();
		if (!this.scope__of.contains(scope__of))
			return;
		if (!_model.contains(_resource, scope__ofProperty, scope__of.resource()))
			return;
		this.scope__of.remove(scope__of);
		_model.removeAll(_resource, scope__ofProperty, scope__of.resource());
	}
		 

	private void initTitle() throws JastorException {
		title = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, titleProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://purl.org/dc/terms/title properties in Site model not a Literal", stmt.getObject());
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


	private void initHas__group() throws JastorException {
		this.has__group = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__groupProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_group properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing has__group = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.has__group.add(has__group);
			}
		}
	}

	public java.util.Iterator getHas__group() throws JastorException {
		if (has__group == null)
			initHas__group();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__group,_resource,has__groupProperty,true);
	}

	public void addHas__group(com.ibm.adtech.jastor.Thing has__group) throws JastorException {
		if (this.has__group == null)
			initHas__group();
		if (this.has__group.contains(has__group)) {
			this.has__group.remove(has__group);
			this.has__group.add(has__group);
			return;
		}
		this.has__group.add(has__group);
		_model.add(_model.createStatement(_resource,has__groupProperty,has__group.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHas__group() throws JastorException {
		com.ibm.adtech.jastor.Thing has__group = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.has__group == null)
			initHas__group();
		this.has__group.add(has__group);
		_model.add(_model.createStatement(_resource,has__groupProperty,has__group.resource()));
		return has__group;
	}
	
	public com.ibm.adtech.jastor.Thing addHas__group(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing has__group = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.has__group == null)
			initHas__group();
		if (this.has__group.contains(has__group))
			return has__group;
		this.has__group.add(has__group);
		_model.add(_model.createStatement(_resource,has__groupProperty,has__group.resource()));
		return has__group;
	}
	
	public void removeHas__group(com.ibm.adtech.jastor.Thing has__group) throws JastorException {
		if (this.has__group == null)
			initHas__group();
		if (!this.has__group.contains(has__group))
			return;
		if (!_model.contains(_resource, has__groupProperty, has__group.resource()))
			return;
		this.has__group.remove(has__group);
		_model.removeAll(_resource, has__groupProperty, has__group.resource());
	}
		 

	private void initHost__of() throws JastorException {
		this.host__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, host__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#host_of properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.Forum host__of = edu.mit.dig.saveface.model.sioc.Factory.getForum(resource,_model);
				this.host__of.add(host__of);
			}
		}
	}

	public java.util.Iterator getHost__of() throws JastorException {
		if (host__of == null)
			initHost__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(host__of,_resource,host__ofProperty,true);
	}

	public void addHost__of(edu.mit.dig.saveface.model.sioc.Forum host__of) throws JastorException {
		if (this.host__of == null)
			initHost__of();
		if (this.host__of.contains(host__of)) {
			this.host__of.remove(host__of);
			this.host__of.add(host__of);
			return;
		}
		this.host__of.add(host__of);
		_model.add(_model.createStatement(_resource,host__ofProperty,host__of.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.Forum addHost__of() throws JastorException {
		edu.mit.dig.saveface.model.sioc.Forum host__of = edu.mit.dig.saveface.model.sioc.Factory.createForum(_model.createResource(),_model);
		if (this.host__of == null)
			initHost__of();
		this.host__of.add(host__of);
		_model.add(_model.createStatement(_resource,host__ofProperty,host__of.resource()));
		return host__of;
	}
	
	public edu.mit.dig.saveface.model.sioc.Forum addHost__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.Forum host__of = edu.mit.dig.saveface.model.sioc.Factory.getForum(resource,_model);
		if (this.host__of == null)
			initHost__of();
		if (this.host__of.contains(host__of))
			return host__of;
		this.host__of.add(host__of);
		_model.add(_model.createStatement(_resource,host__ofProperty,host__of.resource()));
		return host__of;
	}
	
	public void removeHost__of(edu.mit.dig.saveface.model.sioc.Forum host__of) throws JastorException {
		if (this.host__of == null)
			initHost__of();
		if (!this.host__of.contains(host__of))
			return;
		if (!_model.contains(_resource, host__ofProperty, host__of.resource()))
			return;
		this.host__of.remove(host__of);
		_model.removeAll(_resource, host__ofProperty, host__of.resource());
	}
		 

	private void initHas__administrator() throws JastorException {
		this.has__administrator = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__administratorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://rdfs.org/sioc/ns#has_administrator properties in Site model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				edu.mit.dig.saveface.model.sioc.UserAccount has__administrator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
				this.has__administrator.add(has__administrator);
			}
		}
	}

	public java.util.Iterator getHas__administrator() throws JastorException {
		if (has__administrator == null)
			initHas__administrator();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__administrator,_resource,has__administratorProperty,true);
	}

	public void addHas__administrator(edu.mit.dig.saveface.model.sioc.UserAccount has__administrator) throws JastorException {
		if (this.has__administrator == null)
			initHas__administrator();
		if (this.has__administrator.contains(has__administrator)) {
			this.has__administrator.remove(has__administrator);
			this.has__administrator.add(has__administrator);
			return;
		}
		this.has__administrator.add(has__administrator);
		_model.add(_model.createStatement(_resource,has__administratorProperty,has__administrator.resource()));
	}
	
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__administrator() throws JastorException {
		edu.mit.dig.saveface.model.sioc.UserAccount has__administrator = edu.mit.dig.saveface.model.sioc.Factory.createUserAccount(_model.createResource(),_model);
		if (this.has__administrator == null)
			initHas__administrator();
		this.has__administrator.add(has__administrator);
		_model.add(_model.createStatement(_resource,has__administratorProperty,has__administrator.resource()));
		return has__administrator;
	}
	
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__administrator(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		edu.mit.dig.saveface.model.sioc.UserAccount has__administrator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
		if (this.has__administrator == null)
			initHas__administrator();
		if (this.has__administrator.contains(has__administrator))
			return has__administrator;
		this.has__administrator.add(has__administrator);
		_model.add(_model.createStatement(_resource,has__administratorProperty,has__administrator.resource()));
		return has__administrator;
	}
	
	public void removeHas__administrator(edu.mit.dig.saveface.model.sioc.UserAccount has__administrator) throws JastorException {
		if (this.has__administrator == null)
			initHas__administrator();
		if (!this.has__administrator.contains(has__administrator))
			return;
		if (!_model.contains(_resource, has__administratorProperty, has__administrator.resource()))
			return;
		this.has__administrator.remove(has__administrator);
		_model.removeAll(_resource, has__administratorProperty, has__administrator.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof SiteListener))
			throw new IllegalArgumentException("ThingListener must be instance of SiteListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((SiteListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof SiteListener))
			throw new IllegalArgumentException("ThingListener must be instance of SiteListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(has__usergroupProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Usergroup _has__usergroup = null;
					try {
						_has__usergroup = edu.mit.dig.saveface.model.sioc.Factory.getUsergroup(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__usergroup == null) {
						try {
							initHas__usergroup();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__usergroup.contains(_has__usergroup))
						has__usergroup.add(_has__usergroup);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__usergroup;
						synchronized (listeners) {
							consumersForHas__usergroup = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__usergroup.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__usergroupAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__usergroup);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(feedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _feed = null;
					try {
						_feed = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (feed == null) {
						try {
							initFeed();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!feed.contains(_feed))
						feed.add(_feed);
					if (listeners != null) {
						java.util.ArrayList consumersForFeed;
						synchronized (listeners) {
							consumersForFeed = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFeed.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.feedAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_feed);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(part__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _part__of = null;
					try {
						_part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (part__of == null) {
						try {
							initPart__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!part__of.contains(_part__of))
						part__of.add(_part__of);
					if (listeners != null) {
						java.util.ArrayList consumersForPart__of;
						synchronized (listeners) {
							consumersForPart__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPart__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.part__ofAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_part__of);
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
					com.ibm.adtech.jastor.Thing _account = null;
					try {
						_account = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
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
							SiteListener listener=(SiteListener)iter.next();
							listener.accountAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_account);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(linkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _link = null;
					try {
						_link = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (link == null) {
						try {
							initLink();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!link.contains(_link))
						link.add(_link);
					if (listeners != null) {
						java.util.ArrayList consumersForLink;
						synchronized (listeners) {
							consumersForLink = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLink.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.linkAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_link);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(referencesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _references = null;
					try {
						_references = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (references == null) {
						try {
							initReferences();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!references.contains(_references))
						references.add(_references);
					if (listeners != null) {
						java.util.ArrayList consumersForReferences;
						synchronized (listeners) {
							consumersForReferences = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForReferences.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.referencesAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_references);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (date == null)
					try {
						initDate();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!date.contains(literal))
					date.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForDate;
					synchronized (listeners) {
						consumersForDate = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDate.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.dateAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(depictionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _depiction = null;
					try {
						_depiction = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
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
							SiteListener listener=(SiteListener)iter.next();
							listener.depictionAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_depiction);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__functionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Role _has__function = null;
					try {
						_has__function = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__function == null) {
						try {
							initHas__function();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__function.contains(_has__function))
						has__function.add(_has__function);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__function;
						synchronized (listeners) {
							consumersForHas__function = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__function.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__functionAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__function);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(last__reply__dateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (last__reply__date == null)
					try {
						initLast__reply__date();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!last__reply__date.contains(literal))
					last__reply__date.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForLast__reply__date;
					synchronized (listeners) {
						consumersForLast__reply__date = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLast__reply__date.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.last__reply__dateAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
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
						SiteListener listener=(SiteListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ownerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.UserAccount _has__owner = null;
					try {
						_has__owner = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__owner == null) {
						try {
							initHas__owner();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__owner.contains(_has__owner))
						has__owner.add(_has__owner);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__owner;
						synchronized (listeners) {
							consumersForHas__owner = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__owner.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__ownerAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(num__repliesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
				if (num__replies == null) {
					try {
						initNum__replies();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !num__replies.contains(obj))
					num__replies.add(obj);
				java.util.ArrayList consumersForNum__replies;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForNum__replies = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForNum__replies.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.num__repliesAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(subjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _subject = null;
					try {
						_subject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (subject == null) {
						try {
							initSubject();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!subject.contains(_subject))
						subject.add(_subject);
					if (listeners != null) {
						java.util.ArrayList consumersForSubject;
						synchronized (listeners) {
							consumersForSubject = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForSubject.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.subjectAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_subject);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(num__viewsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
				if (num__views == null) {
					try {
						initNum__views();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !num__views.contains(obj))
					num__views.add(obj);
				java.util.ArrayList consumersForNum__views;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForNum__views = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForNum__views.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.num__viewsAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(idProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (id == null)
					try {
						initId();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!id.contains(literal))
					id.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForId;
					synchronized (listeners) {
						consumersForId = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForId.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(group__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _group__of = null;
					try {
						_group__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (group__of == null) {
						try {
							initGroup__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!group__of.contains(_group__of))
						group__of.add(_group__of);
					if (listeners != null) {
						java.util.ArrayList consumersForGroup__of;
						synchronized (listeners) {
							consumersForGroup__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGroup__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.group__ofAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_group__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(num__authorsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
				if (num__authors == null) {
					try {
						initNum__authors();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !num__authors.contains(obj))
					num__authors.add(obj);
				java.util.ArrayList consumersForNum__authors;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForNum__authors = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForNum__authors.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.num__authorsAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__creatorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.UserAccount _has__creator = null;
					try {
						_has__creator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__creator == null) {
						try {
							initHas__creator();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__creator.contains(_has__creator))
						has__creator.add(_has__creator);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__creator;
						synchronized (listeners) {
							consumersForHas__creator = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__creator.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__creatorAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__creator);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(noteProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (note == null)
					try {
						initNote();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!note.contains(literal))
					note.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForNote;
					synchronized (listeners) {
						consumersForNote = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForNote.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.noteAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(related__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _related__to = null;
					try {
						_related__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (related__to == null) {
						try {
							initRelated__to();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!related__to.contains(_related__to))
						related__to.add(_related__to);
					if (listeners != null) {
						java.util.ArrayList consumersForRelated__to;
						synchronized (listeners) {
							consumersForRelated__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForRelated__to.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.related__toAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_related__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(links__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _links__to = null;
					try {
						_links__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (links__to == null) {
						try {
							initLinks__to();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!links__to.contains(_links__to))
						links__to.add(_links__to);
					if (listeners != null) {
						java.util.ArrayList consumersForLinks__to;
						synchronized (listeners) {
							consumersForLinks__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLinks__to.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.links__toAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_links__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(descriptionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (description == null)
					try {
						initDescription();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!description.contains(literal))
					description.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForDescription;
					synchronized (listeners) {
						consumersForDescription = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDescription.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.descriptionAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(space__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _space__of = null;
					try {
						_space__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (space__of == null) {
						try {
							initSpace__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!space__of.contains(_space__of))
						space__of.add(_space__of);
					if (listeners != null) {
						java.util.ArrayList consumersForSpace__of;
						synchronized (listeners) {
							consumersForSpace__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForSpace__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.space__ofAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_space__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__spaceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Space _has__space = null;
					try {
						_has__space = edu.mit.dig.saveface.model.sioc.Factory.getSpace(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__space == null) {
						try {
							initHas__space();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__space.contains(_has__space))
						has__space.add(_has__space);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__space;
						synchronized (listeners) {
							consumersForHas__space = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__space.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__spaceAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__space);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(last__activity__dateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (last__activity__date == null)
					try {
						initLast__activity__date();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!last__activity__date.contains(literal))
					last__activity__date.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForLast__activity__date;
					synchronized (listeners) {
						consumersForLast__activity__date = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLast__activity__date.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.last__activity__dateAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(topicProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _topic = null;
					try {
						_topic = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (topic == null) {
						try {
							initTopic();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!topic.contains(_topic))
						topic.add(_topic);
					if (listeners != null) {
						java.util.ArrayList consumersForTopic;
						synchronized (listeners) {
							consumersForTopic = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTopic.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.topicAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_topic);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__partProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__part = null;
					try {
						_has__part = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__part == null) {
						try {
							initHas__part();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__part.contains(_has__part))
						has__part.add(_has__part);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__part;
						synchronized (listeners) {
							consumersForHas__part = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__part.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__partAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__part);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(scope__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Role _scope__of = null;
					try {
						_scope__of = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (scope__of == null) {
						try {
							initScope__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!scope__of.contains(_scope__of))
						scope__of.add(_scope__of);
					if (listeners != null) {
						java.util.ArrayList consumersForScope__of;
						synchronized (listeners) {
							consumersForScope__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForScope__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.scope__ofAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_scope__of);
						}
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
						SiteListener listener=(SiteListener)iter.next();
						listener.titleAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__groupProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__group = null;
					try {
						_has__group = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__group == null) {
						try {
							initHas__group();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__group.contains(_has__group))
						has__group.add(_has__group);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__group;
						synchronized (listeners) {
							consumersForHas__group = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__group.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__groupAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__group);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(host__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Forum _host__of = null;
					try {
						_host__of = edu.mit.dig.saveface.model.sioc.Factory.getForum(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (host__of == null) {
						try {
							initHost__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!host__of.contains(_host__of))
						host__of.add(_host__of);
					if (listeners != null) {
						java.util.ArrayList consumersForHost__of;
						synchronized (listeners) {
							consumersForHost__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHost__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.host__ofAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_host__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__administratorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.UserAccount _has__administrator = null;
					try {
						_has__administrator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__administrator == null) {
						try {
							initHas__administrator();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__administrator.contains(_has__administrator))
						has__administrator.add(_has__administrator);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__administrator;
						synchronized (listeners) {
							consumersForHas__administrator = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__administrator.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__administratorAdded(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__administrator);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(has__usergroupProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Usergroup _has__usergroup = null;
					if (has__usergroup != null) {
						boolean found = false;
						for (int i=0;i<has__usergroup.size();i++) {
							edu.mit.dig.saveface.model.sioc.Usergroup __item = (edu.mit.dig.saveface.model.sioc.Usergroup) has__usergroup.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__usergroup = __item;
								break;
							}
						}
						if (found)
							has__usergroup.remove(_has__usergroup);
						else {
							try {
								_has__usergroup = edu.mit.dig.saveface.model.sioc.Factory.getUsergroup(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__usergroup = edu.mit.dig.saveface.model.sioc.Factory.getUsergroup(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__usergroup;
						synchronized (listeners) {
							consumersForHas__usergroup = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__usergroup.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__usergroupRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__usergroup);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(feedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _feed = null;
					if (feed != null) {
						boolean found = false;
						for (int i=0;i<feed.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) feed.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_feed = __item;
								break;
							}
						}
						if (found)
							feed.remove(_feed);
						else {
							try {
								_feed = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_feed = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForFeed;
						synchronized (listeners) {
							consumersForFeed = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFeed.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.feedRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_feed);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(part__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _part__of = null;
					if (part__of != null) {
						boolean found = false;
						for (int i=0;i<part__of.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) part__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_part__of = __item;
								break;
							}
						}
						if (found)
							part__of.remove(_part__of);
						else {
							try {
								_part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPart__of;
						synchronized (listeners) {
							consumersForPart__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPart__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.part__ofRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_part__of);
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
					com.ibm.adtech.jastor.Thing _account = null;
					if (account != null) {
						boolean found = false;
						for (int i=0;i<account.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) account.get(i);
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
								_account = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_account = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForAccount;
						synchronized (listeners) {
							consumersForAccount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAccount.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.accountRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_account);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(linkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _link = null;
					if (link != null) {
						boolean found = false;
						for (int i=0;i<link.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) link.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_link = __item;
								break;
							}
						}
						if (found)
							link.remove(_link);
						else {
							try {
								_link = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_link = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLink;
						synchronized (listeners) {
							consumersForLink = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLink.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.linkRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_link);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(referencesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _references = null;
					if (references != null) {
						boolean found = false;
						for (int i=0;i<references.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) references.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_references = __item;
								break;
							}
						}
						if (found)
							references.remove(_references);
						else {
							try {
								_references = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_references = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForReferences;
						synchronized (listeners) {
							consumersForReferences = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForReferences.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.referencesRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_references);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (date != null) {
					if (date.contains(literal))
						date.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForDate;
					synchronized (listeners) {
						consumersForDate = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDate.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.dateRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(depictionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _depiction = null;
					if (depiction != null) {
						boolean found = false;
						for (int i=0;i<depiction.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) depiction.get(i);
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
								_depiction = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_depiction = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForDepiction;
						synchronized (listeners) {
							consumersForDepiction = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDepiction.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.depictionRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_depiction);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__functionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Role _has__function = null;
					if (has__function != null) {
						boolean found = false;
						for (int i=0;i<has__function.size();i++) {
							edu.mit.dig.saveface.model.sioc.Role __item = (edu.mit.dig.saveface.model.sioc.Role) has__function.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__function = __item;
								break;
							}
						}
						if (found)
							has__function.remove(_has__function);
						else {
							try {
								_has__function = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__function = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__function;
						synchronized (listeners) {
							consumersForHas__function = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__function.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__functionRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__function);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(last__reply__dateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (last__reply__date != null) {
					if (last__reply__date.contains(literal))
						last__reply__date.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForLast__reply__date;
					synchronized (listeners) {
						consumersForLast__reply__date = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLast__reply__date.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.last__reply__dateRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
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
						SiteListener listener=(SiteListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ownerProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.UserAccount _has__owner = null;
					if (has__owner != null) {
						boolean found = false;
						for (int i=0;i<has__owner.size();i++) {
							edu.mit.dig.saveface.model.sioc.UserAccount __item = (edu.mit.dig.saveface.model.sioc.UserAccount) has__owner.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__owner = __item;
								break;
							}
						}
						if (found)
							has__owner.remove(_has__owner);
						else {
							try {
								_has__owner = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__owner = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__owner;
						synchronized (listeners) {
							consumersForHas__owner = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__owner.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__ownerRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__owner);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(num__repliesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
				if (num__replies != null) {
					if (num__replies.contains(obj))
						num__replies.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.num__repliesRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(subjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _subject = null;
					if (subject != null) {
						boolean found = false;
						for (int i=0;i<subject.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) subject.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_subject = __item;
								break;
							}
						}
						if (found)
							subject.remove(_subject);
						else {
							try {
								_subject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_subject = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForSubject;
						synchronized (listeners) {
							consumersForSubject = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForSubject.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.subjectRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_subject);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(num__viewsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
				if (num__views != null) {
					if (num__views.contains(obj))
						num__views.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.num__viewsRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(idProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (id != null) {
					if (id.contains(literal))
						id.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForId;
					synchronized (listeners) {
						consumersForId = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForId.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(group__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _group__of = null;
					if (group__of != null) {
						boolean found = false;
						for (int i=0;i<group__of.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) group__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_group__of = __item;
								break;
							}
						}
						if (found)
							group__of.remove(_group__of);
						else {
							try {
								_group__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_group__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGroup__of;
						synchronized (listeners) {
							consumersForGroup__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGroup__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.group__ofRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_group__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(num__authorsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#nonNegativeInteger");
				if (num__authors != null) {
					if (num__authors.contains(obj))
						num__authors.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.num__authorsRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__creatorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.UserAccount _has__creator = null;
					if (has__creator != null) {
						boolean found = false;
						for (int i=0;i<has__creator.size();i++) {
							edu.mit.dig.saveface.model.sioc.UserAccount __item = (edu.mit.dig.saveface.model.sioc.UserAccount) has__creator.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__creator = __item;
								break;
							}
						}
						if (found)
							has__creator.remove(_has__creator);
						else {
							try {
								_has__creator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__creator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__creator;
						synchronized (listeners) {
							consumersForHas__creator = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__creator.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__creatorRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__creator);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(noteProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (note != null) {
					if (note.contains(literal))
						note.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForNote;
					synchronized (listeners) {
						consumersForNote = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForNote.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.noteRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(related__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _related__to = null;
					if (related__to != null) {
						boolean found = false;
						for (int i=0;i<related__to.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) related__to.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_related__to = __item;
								break;
							}
						}
						if (found)
							related__to.remove(_related__to);
						else {
							try {
								_related__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_related__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForRelated__to;
						synchronized (listeners) {
							consumersForRelated__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForRelated__to.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.related__toRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_related__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(links__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _links__to = null;
					if (links__to != null) {
						boolean found = false;
						for (int i=0;i<links__to.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) links__to.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_links__to = __item;
								break;
							}
						}
						if (found)
							links__to.remove(_links__to);
						else {
							try {
								_links__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_links__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLinks__to;
						synchronized (listeners) {
							consumersForLinks__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLinks__to.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.links__toRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_links__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(descriptionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (description != null) {
					if (description.contains(literal))
						description.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForDescription;
					synchronized (listeners) {
						consumersForDescription = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDescription.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.descriptionRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(space__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _space__of = null;
					if (space__of != null) {
						boolean found = false;
						for (int i=0;i<space__of.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) space__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_space__of = __item;
								break;
							}
						}
						if (found)
							space__of.remove(_space__of);
						else {
							try {
								_space__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_space__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForSpace__of;
						synchronized (listeners) {
							consumersForSpace__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForSpace__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.space__ofRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_space__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__spaceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Space _has__space = null;
					if (has__space != null) {
						boolean found = false;
						for (int i=0;i<has__space.size();i++) {
							edu.mit.dig.saveface.model.sioc.Space __item = (edu.mit.dig.saveface.model.sioc.Space) has__space.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__space = __item;
								break;
							}
						}
						if (found)
							has__space.remove(_has__space);
						else {
							try {
								_has__space = edu.mit.dig.saveface.model.sioc.Factory.getSpace(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__space = edu.mit.dig.saveface.model.sioc.Factory.getSpace(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__space;
						synchronized (listeners) {
							consumersForHas__space = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__space.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__spaceRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__space);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(last__activity__dateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (last__activity__date != null) {
					if (last__activity__date.contains(literal))
						last__activity__date.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForLast__activity__date;
					synchronized (listeners) {
						consumersForLast__activity__date = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLast__activity__date.iterator();iter.hasNext();){
						SiteListener listener=(SiteListener)iter.next();
						listener.last__activity__dateRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(topicProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _topic = null;
					if (topic != null) {
						boolean found = false;
						for (int i=0;i<topic.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) topic.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_topic = __item;
								break;
							}
						}
						if (found)
							topic.remove(_topic);
						else {
							try {
								_topic = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_topic = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForTopic;
						synchronized (listeners) {
							consumersForTopic = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTopic.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.topicRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_topic);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__partProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__part = null;
					if (has__part != null) {
						boolean found = false;
						for (int i=0;i<has__part.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) has__part.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__part = __item;
								break;
							}
						}
						if (found)
							has__part.remove(_has__part);
						else {
							try {
								_has__part = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__part = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__part;
						synchronized (listeners) {
							consumersForHas__part = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__part.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__partRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__part);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(scope__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Role _scope__of = null;
					if (scope__of != null) {
						boolean found = false;
						for (int i=0;i<scope__of.size();i++) {
							edu.mit.dig.saveface.model.sioc.Role __item = (edu.mit.dig.saveface.model.sioc.Role) scope__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_scope__of = __item;
								break;
							}
						}
						if (found)
							scope__of.remove(_scope__of);
						else {
							try {
								_scope__of = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_scope__of = edu.mit.dig.saveface.model.sioc.Factory.getRole(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForScope__of;
						synchronized (listeners) {
							consumersForScope__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForScope__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.scope__ofRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_scope__of);
						}
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
						SiteListener listener=(SiteListener)iter.next();
						listener.titleRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__groupProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__group = null;
					if (has__group != null) {
						boolean found = false;
						for (int i=0;i<has__group.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) has__group.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__group = __item;
								break;
							}
						}
						if (found)
							has__group.remove(_has__group);
						else {
							try {
								_has__group = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__group = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__group;
						synchronized (listeners) {
							consumersForHas__group = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__group.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__groupRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__group);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(host__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.Forum _host__of = null;
					if (host__of != null) {
						boolean found = false;
						for (int i=0;i<host__of.size();i++) {
							edu.mit.dig.saveface.model.sioc.Forum __item = (edu.mit.dig.saveface.model.sioc.Forum) host__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_host__of = __item;
								break;
							}
						}
						if (found)
							host__of.remove(_host__of);
						else {
							try {
								_host__of = edu.mit.dig.saveface.model.sioc.Factory.getForum(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_host__of = edu.mit.dig.saveface.model.sioc.Factory.getForum(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHost__of;
						synchronized (listeners) {
							consumersForHost__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHost__of.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.host__ofRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_host__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__administratorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					edu.mit.dig.saveface.model.sioc.UserAccount _has__administrator = null;
					if (has__administrator != null) {
						boolean found = false;
						for (int i=0;i<has__administrator.size();i++) {
							edu.mit.dig.saveface.model.sioc.UserAccount __item = (edu.mit.dig.saveface.model.sioc.UserAccount) has__administrator.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__administrator = __item;
								break;
							}
						}
						if (found)
							has__administrator.remove(_has__administrator);
						else {
							try {
								_has__administrator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__administrator = edu.mit.dig.saveface.model.sioc.Factory.getUserAccount(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__administrator;
						synchronized (listeners) {
							consumersForHas__administrator = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__administrator.iterator();iter.hasNext();){
							SiteListener listener=(SiteListener)iter.next();
							listener.has__administratorRemoved(edu.mit.dig.saveface.model.sioc.SiteImpl.this,_has__administrator);
						}
					}
				}
				return;
			}
		}

	//}
	


}