

package edu.mit.dig.saveface.model.user;

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
 * Implementation of {@link edu.mit.dig.saveface.model.user.User}
 * Use the edu.mit.dig.saveface.model.user.Factory to create instances of this class.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#User)</p>
 * <br>
 */
public class UserImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.user.User {
	

	private static com.hp.hpl.jena.rdf.model.Property quotesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#quotes");
	private java.util.ArrayList quotes;
	private static com.hp.hpl.jena.rdf.model.Property outboxProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#outbox");
	private java.util.ArrayList outbox;
	private static com.hp.hpl.jena.rdf.model.Property aboutProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#about");
	private java.util.ArrayList about;
	private static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#link");
	private java.util.ArrayList link;
	private static com.hp.hpl.jena.rdf.model.Property checkinsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#checkins");
	private java.util.ArrayList checkins;
	private static com.hp.hpl.jena.rdf.model.Property likesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#likes");
	private java.util.ArrayList likes;
	private static com.hp.hpl.jena.rdf.model.Property educationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#education");
	private java.util.ArrayList education;
	private static com.hp.hpl.jena.rdf.model.Property notesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#notes");
	private java.util.ArrayList notes;
	private static com.hp.hpl.jena.rdf.model.Property firstNameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#firstName");
	private java.util.ArrayList firstName;
	private static com.hp.hpl.jena.rdf.model.Property significantOtherProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#significantOther");
	private java.util.ArrayList significantOther;
	private static com.hp.hpl.jena.rdf.model.Property religionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#religion");
	private java.util.ArrayList religion;
	private static com.hp.hpl.jena.rdf.model.Property meetingForProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#meetingFor");
	private java.util.ArrayList meetingFor;
	private static com.hp.hpl.jena.rdf.model.Property albumsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#albums");
	private java.util.ArrayList albums;
	private static com.hp.hpl.jena.rdf.model.Property linksProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#links");
	private java.util.ArrayList links;
	private static com.hp.hpl.jena.rdf.model.Property websiteProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#website");
	private java.util.ArrayList website;
	private static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#location");
	private java.util.ArrayList location;
	private static com.hp.hpl.jena.rdf.model.Property verifiedProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#verified");
	private java.util.ArrayList verified;
	private static com.hp.hpl.jena.rdf.model.Property hometownProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#hometown");
	private java.util.ArrayList hometown;
	private static com.hp.hpl.jena.rdf.model.Property booksProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#books");
	private java.util.ArrayList books;
	private static com.hp.hpl.jena.rdf.model.Property postsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#posts");
	private java.util.ArrayList posts;
	private static com.hp.hpl.jena.rdf.model.Property localeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#locale");
	private java.util.ArrayList locale;
	private static com.hp.hpl.jena.rdf.model.Property interestsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#interests");
	private java.util.ArrayList interests;
	private static com.hp.hpl.jena.rdf.model.Property photosProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#photos");
	private java.util.ArrayList photos;
	private static com.hp.hpl.jena.rdf.model.Property politicalProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#political");
	private java.util.ArrayList political;
	private static com.hp.hpl.jena.rdf.model.Property emailProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#email");
	private java.util.ArrayList email;
	private static com.hp.hpl.jena.rdf.model.Property timezoneProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#timezone");
	private java.util.ArrayList timezone;
	private static com.hp.hpl.jena.rdf.model.Property lastNameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#lastName");
	private java.util.ArrayList lastName;
	private static com.hp.hpl.jena.rdf.model.Property televisionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#television");
	private java.util.ArrayList television;
	private static com.hp.hpl.jena.rdf.model.Property groupsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#groups");
	private java.util.ArrayList groups;
	private static com.hp.hpl.jena.rdf.model.Property workProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#work");
	private java.util.ArrayList work;
	private static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#updatedTime");
	private java.util.ArrayList updatedTime;
	private static com.hp.hpl.jena.rdf.model.Property videosProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#videos");
	private java.util.ArrayList videos;
	private static com.hp.hpl.jena.rdf.model.Property statusesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#statuses");
	private java.util.ArrayList statuses;
	private static com.hp.hpl.jena.rdf.model.Property inboxProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#inbox");
	private java.util.ArrayList inbox;
	private static com.hp.hpl.jena.rdf.model.Property accountsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#accounts");
	private java.util.ArrayList accounts;
	private static com.hp.hpl.jena.rdf.model.Property musicProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#music");
	private java.util.ArrayList music;
	private static com.hp.hpl.jena.rdf.model.Property friendsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#friends");
	private java.util.ArrayList friends;
	private static com.hp.hpl.jena.rdf.model.Property birthdayProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#birthday");
	private java.util.ArrayList birthday;
	private static com.hp.hpl.jena.rdf.model.Property moviesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#movies");
	private java.util.ArrayList movies;
	private static com.hp.hpl.jena.rdf.model.Property activitiesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#activities");
	private java.util.ArrayList activities;
	private static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#id");
	private java.util.ArrayList id;
	private static com.hp.hpl.jena.rdf.model.Property interestedInProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#interestedIn");
	private java.util.ArrayList interestedIn;
	private static com.hp.hpl.jena.rdf.model.Property feedProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#feed");
	private java.util.ArrayList feed;
	private static com.hp.hpl.jena.rdf.model.Property genderProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#gender");
	private java.util.ArrayList gender;
	private static com.hp.hpl.jena.rdf.model.Property bioProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#bio");
	private java.util.ArrayList bio;
	private static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#name");
	private java.util.ArrayList name;
	private static com.hp.hpl.jena.rdf.model.Property updatesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#updates");
	private java.util.ArrayList updates;
	private static com.hp.hpl.jena.rdf.model.Property attributionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#attribution");
	private java.util.ArrayList attribution;
	private static com.hp.hpl.jena.rdf.model.Property relationshipStatusProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#relationshipStatus");
	private java.util.ArrayList relationshipStatus;
	private static com.hp.hpl.jena.rdf.model.Property eventsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#events");
	private java.util.ArrayList events;
 

	UserImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static UserImpl getUser(Resource resource, Model model) throws JastorException {
		return new UserImpl(resource, model);
	}
	    
	static UserImpl createUser(Resource resource, Model model) throws JastorException { 
		UserImpl impl = new UserImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, User.TYPE)))
			impl._model.add(impl._resource, RDF.type, User.TYPE);
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
    	edu.mit.dig.saveface.model.user.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,quotesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,outboxProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,aboutProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,checkinsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,likesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,educationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,notesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,firstNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,significantOtherProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,religionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,meetingForProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,albumsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,linksProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,websiteProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,verifiedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hometownProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,booksProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,postsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,localeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,interestsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,photosProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,politicalProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,emailProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,timezoneProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lastNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,televisionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,groupsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,workProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatedTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,videosProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,statusesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,inboxProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,accountsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,musicProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,friendsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,birthdayProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,moviesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,activitiesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,interestedInProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,feedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,genderProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,bioProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,updatesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,attributionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,relationshipStatusProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,eventsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.user.User.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		quotes = null;
		outbox = null;
		about = null;
		link = null;
		checkins = null;
		likes = null;
		education = null;
		notes = null;
		firstName = null;
		significantOther = null;
		religion = null;
		meetingFor = null;
		albums = null;
		links = null;
		website = null;
		location = null;
		verified = null;
		hometown = null;
		books = null;
		posts = null;
		locale = null;
		interests = null;
		photos = null;
		political = null;
		email = null;
		timezone = null;
		lastName = null;
		television = null;
		groups = null;
		work = null;
		updatedTime = null;
		videos = null;
		statuses = null;
		inbox = null;
		accounts = null;
		music = null;
		friends = null;
		birthday = null;
		movies = null;
		activities = null;
		id = null;
		interestedIn = null;
		feed = null;
		gender = null;
		bio = null;
		name = null;
		updates = null;
		attribution = null;
		relationshipStatus = null;
		events = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initQuotes() throws JastorException {
		quotes = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, quotesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#quotes properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				quotes.add(obj);
		}
	}

	public java.util.Iterator getQuotes() throws JastorException {
		if (quotes == null)
			initQuotes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(quotes,_resource,quotesProperty,false);
	}

	public void addQuotes(java.lang.String quotes) throws JastorException {
		if (this.quotes == null)
			initQuotes();
		if (this.quotes.contains(quotes))
			return;
		if (_model.contains(_resource, quotesProperty, createLiteral(quotes)))
			return;
		this.quotes.add(quotes);
		_model.add(_resource, quotesProperty, createLiteral(quotes));
	}
	
	public void removeQuotes(java.lang.String quotes) throws JastorException {
		if (this.quotes == null)
			initQuotes();
		if (!this.quotes.contains(quotes))
			return;
		if (!_model.contains(_resource, quotesProperty, createLiteral(quotes)))
			return;
		this.quotes.remove(quotes);
		_model.removeAll(_resource, quotesProperty, createLiteral(quotes));
	}


	private void initOutbox() throws JastorException {
		this.outbox = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, outboxProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#outbox properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing outbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.outbox.add(outbox);
			}
		}
	}

	public java.util.Iterator getOutbox() throws JastorException {
		if (outbox == null)
			initOutbox();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(outbox,_resource,outboxProperty,true);
	}

	public void addOutbox(com.ibm.adtech.jastor.Thing outbox) throws JastorException {
		if (this.outbox == null)
			initOutbox();
		if (this.outbox.contains(outbox)) {
			this.outbox.remove(outbox);
			this.outbox.add(outbox);
			return;
		}
		this.outbox.add(outbox);
		_model.add(_model.createStatement(_resource,outboxProperty,outbox.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addOutbox() throws JastorException {
		com.ibm.adtech.jastor.Thing outbox = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.outbox == null)
			initOutbox();
		this.outbox.add(outbox);
		_model.add(_model.createStatement(_resource,outboxProperty,outbox.resource()));
		return outbox;
	}
	
	public com.ibm.adtech.jastor.Thing addOutbox(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing outbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.outbox == null)
			initOutbox();
		if (this.outbox.contains(outbox))
			return outbox;
		this.outbox.add(outbox);
		_model.add(_model.createStatement(_resource,outboxProperty,outbox.resource()));
		return outbox;
	}
	
	public void removeOutbox(com.ibm.adtech.jastor.Thing outbox) throws JastorException {
		if (this.outbox == null)
			initOutbox();
		if (!this.outbox.contains(outbox))
			return;
		if (!_model.contains(_resource, outboxProperty, outbox.resource()))
			return;
		this.outbox.remove(outbox);
		_model.removeAll(_resource, outboxProperty, outbox.resource());
	}
		 

	private void initAbout() throws JastorException {
		about = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, aboutProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#about properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				about.add(obj);
		}
	}

	public java.util.Iterator getAbout() throws JastorException {
		if (about == null)
			initAbout();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(about,_resource,aboutProperty,false);
	}

	public void addAbout(java.lang.String about) throws JastorException {
		if (this.about == null)
			initAbout();
		if (this.about.contains(about))
			return;
		if (_model.contains(_resource, aboutProperty, createLiteral(about)))
			return;
		this.about.add(about);
		_model.add(_resource, aboutProperty, createLiteral(about));
	}
	
	public void removeAbout(java.lang.String about) throws JastorException {
		if (this.about == null)
			initAbout();
		if (!this.about.contains(about))
			return;
		if (!_model.contains(_resource, aboutProperty, createLiteral(about)))
			return;
		this.about.remove(about);
		_model.removeAll(_resource, aboutProperty, createLiteral(about));
	}


	private void initLink() throws JastorException {
		link = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, linkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#link properties in User model not a Literal", stmt.getObject());
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


	private void initCheckins() throws JastorException {
		this.checkins = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, checkinsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#checkins properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing checkins = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.checkins.add(checkins);
			}
		}
	}

	public java.util.Iterator getCheckins() throws JastorException {
		if (checkins == null)
			initCheckins();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(checkins,_resource,checkinsProperty,true);
	}

	public void addCheckins(com.ibm.adtech.jastor.Thing checkins) throws JastorException {
		if (this.checkins == null)
			initCheckins();
		if (this.checkins.contains(checkins)) {
			this.checkins.remove(checkins);
			this.checkins.add(checkins);
			return;
		}
		this.checkins.add(checkins);
		_model.add(_model.createStatement(_resource,checkinsProperty,checkins.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addCheckins() throws JastorException {
		com.ibm.adtech.jastor.Thing checkins = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.checkins == null)
			initCheckins();
		this.checkins.add(checkins);
		_model.add(_model.createStatement(_resource,checkinsProperty,checkins.resource()));
		return checkins;
	}
	
	public com.ibm.adtech.jastor.Thing addCheckins(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing checkins = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.checkins == null)
			initCheckins();
		if (this.checkins.contains(checkins))
			return checkins;
		this.checkins.add(checkins);
		_model.add(_model.createStatement(_resource,checkinsProperty,checkins.resource()));
		return checkins;
	}
	
	public void removeCheckins(com.ibm.adtech.jastor.Thing checkins) throws JastorException {
		if (this.checkins == null)
			initCheckins();
		if (!this.checkins.contains(checkins))
			return;
		if (!_model.contains(_resource, checkinsProperty, checkins.resource()))
			return;
		this.checkins.remove(checkins);
		_model.removeAll(_resource, checkinsProperty, checkins.resource());
	}
		 

	private void initLikes() throws JastorException {
		this.likes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, likesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#likes properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.likes.add(likes);
			}
		}
	}

	public java.util.Iterator getLikes() throws JastorException {
		if (likes == null)
			initLikes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(likes,_resource,likesProperty,true);
	}

	public void addLikes(com.ibm.adtech.jastor.Thing likes) throws JastorException {
		if (this.likes == null)
			initLikes();
		if (this.likes.contains(likes)) {
			this.likes.remove(likes);
			this.likes.add(likes);
			return;
		}
		this.likes.add(likes);
		_model.add(_model.createStatement(_resource,likesProperty,likes.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLikes() throws JastorException {
		com.ibm.adtech.jastor.Thing likes = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.likes == null)
			initLikes();
		this.likes.add(likes);
		_model.add(_model.createStatement(_resource,likesProperty,likes.resource()));
		return likes;
	}
	
	public com.ibm.adtech.jastor.Thing addLikes(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.likes == null)
			initLikes();
		if (this.likes.contains(likes))
			return likes;
		this.likes.add(likes);
		_model.add(_model.createStatement(_resource,likesProperty,likes.resource()));
		return likes;
	}
	
	public void removeLikes(com.ibm.adtech.jastor.Thing likes) throws JastorException {
		if (this.likes == null)
			initLikes();
		if (!this.likes.contains(likes))
			return;
		if (!_model.contains(_resource, likesProperty, likes.resource()))
			return;
		this.likes.remove(likes);
		_model.removeAll(_resource, likesProperty, likes.resource());
	}
		 

	private void initEducation() throws JastorException {
		this.education = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, educationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#education properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing education = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.education.add(education);
			}
		}
	}

	public java.util.Iterator getEducation() throws JastorException {
		if (education == null)
			initEducation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(education,_resource,educationProperty,true);
	}

	public void addEducation(com.ibm.adtech.jastor.Thing education) throws JastorException {
		if (this.education == null)
			initEducation();
		if (this.education.contains(education)) {
			this.education.remove(education);
			this.education.add(education);
			return;
		}
		this.education.add(education);
		_model.add(_model.createStatement(_resource,educationProperty,education.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addEducation() throws JastorException {
		com.ibm.adtech.jastor.Thing education = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.education == null)
			initEducation();
		this.education.add(education);
		_model.add(_model.createStatement(_resource,educationProperty,education.resource()));
		return education;
	}
	
	public com.ibm.adtech.jastor.Thing addEducation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing education = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.education == null)
			initEducation();
		if (this.education.contains(education))
			return education;
		this.education.add(education);
		_model.add(_model.createStatement(_resource,educationProperty,education.resource()));
		return education;
	}
	
	public void removeEducation(com.ibm.adtech.jastor.Thing education) throws JastorException {
		if (this.education == null)
			initEducation();
		if (!this.education.contains(education))
			return;
		if (!_model.contains(_resource, educationProperty, education.resource()))
			return;
		this.education.remove(education);
		_model.removeAll(_resource, educationProperty, education.resource());
	}
		 

	private void initNotes() throws JastorException {
		this.notes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, notesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#notes properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.notes.add(notes);
			}
		}
	}

	public java.util.Iterator getNotes() throws JastorException {
		if (notes == null)
			initNotes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(notes,_resource,notesProperty,true);
	}

	public void addNotes(com.ibm.adtech.jastor.Thing notes) throws JastorException {
		if (this.notes == null)
			initNotes();
		if (this.notes.contains(notes)) {
			this.notes.remove(notes);
			this.notes.add(notes);
			return;
		}
		this.notes.add(notes);
		_model.add(_model.createStatement(_resource,notesProperty,notes.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addNotes() throws JastorException {
		com.ibm.adtech.jastor.Thing notes = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.notes == null)
			initNotes();
		this.notes.add(notes);
		_model.add(_model.createStatement(_resource,notesProperty,notes.resource()));
		return notes;
	}
	
	public com.ibm.adtech.jastor.Thing addNotes(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.notes == null)
			initNotes();
		if (this.notes.contains(notes))
			return notes;
		this.notes.add(notes);
		_model.add(_model.createStatement(_resource,notesProperty,notes.resource()));
		return notes;
	}
	
	public void removeNotes(com.ibm.adtech.jastor.Thing notes) throws JastorException {
		if (this.notes == null)
			initNotes();
		if (!this.notes.contains(notes))
			return;
		if (!_model.contains(_resource, notesProperty, notes.resource()))
			return;
		this.notes.remove(notes);
		_model.removeAll(_resource, notesProperty, notes.resource());
	}
		 

	private void initFirstName() throws JastorException {
		firstName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, firstNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#firstName properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				firstName.add(obj);
		}
	}

	public java.util.Iterator getFirstName() throws JastorException {
		if (firstName == null)
			initFirstName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(firstName,_resource,firstNameProperty,false);
	}

	public void addFirstName(java.lang.String firstName) throws JastorException {
		if (this.firstName == null)
			initFirstName();
		if (this.firstName.contains(firstName))
			return;
		if (_model.contains(_resource, firstNameProperty, createLiteral(firstName)))
			return;
		this.firstName.add(firstName);
		_model.add(_resource, firstNameProperty, createLiteral(firstName));
	}
	
	public void removeFirstName(java.lang.String firstName) throws JastorException {
		if (this.firstName == null)
			initFirstName();
		if (!this.firstName.contains(firstName))
			return;
		if (!_model.contains(_resource, firstNameProperty, createLiteral(firstName)))
			return;
		this.firstName.remove(firstName);
		_model.removeAll(_resource, firstNameProperty, createLiteral(firstName));
	}


	private void initSignificantOther() throws JastorException {
		significantOther = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, significantOtherProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#significantOther properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				significantOther.add(obj);
		}
	}

	public java.util.Iterator getSignificantOther() throws JastorException {
		if (significantOther == null)
			initSignificantOther();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(significantOther,_resource,significantOtherProperty,false);
	}

	public void addSignificantOther(java.lang.String significantOther) throws JastorException {
		if (this.significantOther == null)
			initSignificantOther();
		if (this.significantOther.contains(significantOther))
			return;
		if (_model.contains(_resource, significantOtherProperty, createLiteral(significantOther)))
			return;
		this.significantOther.add(significantOther);
		_model.add(_resource, significantOtherProperty, createLiteral(significantOther));
	}
	
	public void removeSignificantOther(java.lang.String significantOther) throws JastorException {
		if (this.significantOther == null)
			initSignificantOther();
		if (!this.significantOther.contains(significantOther))
			return;
		if (!_model.contains(_resource, significantOtherProperty, createLiteral(significantOther)))
			return;
		this.significantOther.remove(significantOther);
		_model.removeAll(_resource, significantOtherProperty, createLiteral(significantOther));
	}


	private void initReligion() throws JastorException {
		religion = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, religionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#religion properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				religion.add(obj);
		}
	}

	public java.util.Iterator getReligion() throws JastorException {
		if (religion == null)
			initReligion();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(religion,_resource,religionProperty,false);
	}

	public void addReligion(java.lang.String religion) throws JastorException {
		if (this.religion == null)
			initReligion();
		if (this.religion.contains(religion))
			return;
		if (_model.contains(_resource, religionProperty, createLiteral(religion)))
			return;
		this.religion.add(religion);
		_model.add(_resource, religionProperty, createLiteral(religion));
	}
	
	public void removeReligion(java.lang.String religion) throws JastorException {
		if (this.religion == null)
			initReligion();
		if (!this.religion.contains(religion))
			return;
		if (!_model.contains(_resource, religionProperty, createLiteral(religion)))
			return;
		this.religion.remove(religion);
		_model.removeAll(_resource, religionProperty, createLiteral(religion));
	}


	private void initMeetingFor() throws JastorException {
		meetingFor = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, meetingForProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#meetingFor properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				meetingFor.add(obj);
		}
	}

	public java.util.Iterator getMeetingFor() throws JastorException {
		if (meetingFor == null)
			initMeetingFor();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(meetingFor,_resource,meetingForProperty,false);
	}

	public void addMeetingFor(java.lang.String meetingFor) throws JastorException {
		if (this.meetingFor == null)
			initMeetingFor();
		if (this.meetingFor.contains(meetingFor))
			return;
		if (_model.contains(_resource, meetingForProperty, createLiteral(meetingFor)))
			return;
		this.meetingFor.add(meetingFor);
		_model.add(_resource, meetingForProperty, createLiteral(meetingFor));
	}
	
	public void removeMeetingFor(java.lang.String meetingFor) throws JastorException {
		if (this.meetingFor == null)
			initMeetingFor();
		if (!this.meetingFor.contains(meetingFor))
			return;
		if (!_model.contains(_resource, meetingForProperty, createLiteral(meetingFor)))
			return;
		this.meetingFor.remove(meetingFor);
		_model.removeAll(_resource, meetingForProperty, createLiteral(meetingFor));
	}


	private void initAlbums() throws JastorException {
		this.albums = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, albumsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#albums properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing albums = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.albums.add(albums);
			}
		}
	}

	public java.util.Iterator getAlbums() throws JastorException {
		if (albums == null)
			initAlbums();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(albums,_resource,albumsProperty,true);
	}

	public void addAlbums(com.ibm.adtech.jastor.Thing albums) throws JastorException {
		if (this.albums == null)
			initAlbums();
		if (this.albums.contains(albums)) {
			this.albums.remove(albums);
			this.albums.add(albums);
			return;
		}
		this.albums.add(albums);
		_model.add(_model.createStatement(_resource,albumsProperty,albums.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addAlbums() throws JastorException {
		com.ibm.adtech.jastor.Thing albums = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.albums == null)
			initAlbums();
		this.albums.add(albums);
		_model.add(_model.createStatement(_resource,albumsProperty,albums.resource()));
		return albums;
	}
	
	public com.ibm.adtech.jastor.Thing addAlbums(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing albums = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.albums == null)
			initAlbums();
		if (this.albums.contains(albums))
			return albums;
		this.albums.add(albums);
		_model.add(_model.createStatement(_resource,albumsProperty,albums.resource()));
		return albums;
	}
	
	public void removeAlbums(com.ibm.adtech.jastor.Thing albums) throws JastorException {
		if (this.albums == null)
			initAlbums();
		if (!this.albums.contains(albums))
			return;
		if (!_model.contains(_resource, albumsProperty, albums.resource()))
			return;
		this.albums.remove(albums);
		_model.removeAll(_resource, albumsProperty, albums.resource());
	}
		 

	private void initLinks() throws JastorException {
		this.links = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, linksProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#links properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing links = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.links.add(links);
			}
		}
	}

	public java.util.Iterator getLinks() throws JastorException {
		if (links == null)
			initLinks();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(links,_resource,linksProperty,true);
	}

	public void addLinks(com.ibm.adtech.jastor.Thing links) throws JastorException {
		if (this.links == null)
			initLinks();
		if (this.links.contains(links)) {
			this.links.remove(links);
			this.links.add(links);
			return;
		}
		this.links.add(links);
		_model.add(_model.createStatement(_resource,linksProperty,links.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addLinks() throws JastorException {
		com.ibm.adtech.jastor.Thing links = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.links == null)
			initLinks();
		this.links.add(links);
		_model.add(_model.createStatement(_resource,linksProperty,links.resource()));
		return links;
	}
	
	public com.ibm.adtech.jastor.Thing addLinks(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing links = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.links == null)
			initLinks();
		if (this.links.contains(links))
			return links;
		this.links.add(links);
		_model.add(_model.createStatement(_resource,linksProperty,links.resource()));
		return links;
	}
	
	public void removeLinks(com.ibm.adtech.jastor.Thing links) throws JastorException {
		if (this.links == null)
			initLinks();
		if (!this.links.contains(links))
			return;
		if (!_model.contains(_resource, linksProperty, links.resource()))
			return;
		this.links.remove(links);
		_model.removeAll(_resource, linksProperty, links.resource());
	}
		 

	private void initWebsite() throws JastorException {
		website = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, websiteProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#website properties in User model not a Literal", stmt.getObject());
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


	private void initLocation() throws JastorException {
		this.location = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#location properties in User model not a Resource", stmt.getObject());
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
		 

	private void initVerified() throws JastorException {
		verified = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, verifiedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#verified properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
			if (obj != null)
				verified.add(obj);
		}
	}

	public java.util.Iterator getVerified() throws JastorException {
		if (verified == null)
			initVerified();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(verified,_resource,verifiedProperty,false);
	}

	public void addVerified(java.lang.Boolean verified) throws JastorException {
		if (this.verified == null)
			initVerified();
		if (this.verified.contains(verified))
			return;
		if (_model.contains(_resource, verifiedProperty, createLiteral(verified)))
			return;
		this.verified.add(verified);
		_model.add(_resource, verifiedProperty, createLiteral(verified));
	}
	
	public void removeVerified(java.lang.Boolean verified) throws JastorException {
		if (this.verified == null)
			initVerified();
		if (!this.verified.contains(verified))
			return;
		if (!_model.contains(_resource, verifiedProperty, createLiteral(verified)))
			return;
		this.verified.remove(verified);
		_model.removeAll(_resource, verifiedProperty, createLiteral(verified));
	}


	private void initHometown() throws JastorException {
		this.hometown = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hometownProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#hometown properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing hometown = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.hometown.add(hometown);
			}
		}
	}

	public java.util.Iterator getHometown() throws JastorException {
		if (hometown == null)
			initHometown();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hometown,_resource,hometownProperty,true);
	}

	public void addHometown(com.ibm.adtech.jastor.Thing hometown) throws JastorException {
		if (this.hometown == null)
			initHometown();
		if (this.hometown.contains(hometown)) {
			this.hometown.remove(hometown);
			this.hometown.add(hometown);
			return;
		}
		this.hometown.add(hometown);
		_model.add(_model.createStatement(_resource,hometownProperty,hometown.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHometown() throws JastorException {
		com.ibm.adtech.jastor.Thing hometown = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.hometown == null)
			initHometown();
		this.hometown.add(hometown);
		_model.add(_model.createStatement(_resource,hometownProperty,hometown.resource()));
		return hometown;
	}
	
	public com.ibm.adtech.jastor.Thing addHometown(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing hometown = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.hometown == null)
			initHometown();
		if (this.hometown.contains(hometown))
			return hometown;
		this.hometown.add(hometown);
		_model.add(_model.createStatement(_resource,hometownProperty,hometown.resource()));
		return hometown;
	}
	
	public void removeHometown(com.ibm.adtech.jastor.Thing hometown) throws JastorException {
		if (this.hometown == null)
			initHometown();
		if (!this.hometown.contains(hometown))
			return;
		if (!_model.contains(_resource, hometownProperty, hometown.resource()))
			return;
		this.hometown.remove(hometown);
		_model.removeAll(_resource, hometownProperty, hometown.resource());
	}
		 

	private void initBooks() throws JastorException {
		this.books = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, booksProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#books properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing books = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.books.add(books);
			}
		}
	}

	public java.util.Iterator getBooks() throws JastorException {
		if (books == null)
			initBooks();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(books,_resource,booksProperty,true);
	}

	public void addBooks(com.ibm.adtech.jastor.Thing books) throws JastorException {
		if (this.books == null)
			initBooks();
		if (this.books.contains(books)) {
			this.books.remove(books);
			this.books.add(books);
			return;
		}
		this.books.add(books);
		_model.add(_model.createStatement(_resource,booksProperty,books.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addBooks() throws JastorException {
		com.ibm.adtech.jastor.Thing books = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.books == null)
			initBooks();
		this.books.add(books);
		_model.add(_model.createStatement(_resource,booksProperty,books.resource()));
		return books;
	}
	
	public com.ibm.adtech.jastor.Thing addBooks(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing books = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.books == null)
			initBooks();
		if (this.books.contains(books))
			return books;
		this.books.add(books);
		_model.add(_model.createStatement(_resource,booksProperty,books.resource()));
		return books;
	}
	
	public void removeBooks(com.ibm.adtech.jastor.Thing books) throws JastorException {
		if (this.books == null)
			initBooks();
		if (!this.books.contains(books))
			return;
		if (!_model.contains(_resource, booksProperty, books.resource()))
			return;
		this.books.remove(books);
		_model.removeAll(_resource, booksProperty, books.resource());
	}
		 

	private void initPosts() throws JastorException {
		this.posts = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, postsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#posts properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing posts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.posts.add(posts);
			}
		}
	}

	public java.util.Iterator getPosts() throws JastorException {
		if (posts == null)
			initPosts();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(posts,_resource,postsProperty,true);
	}

	public void addPosts(com.ibm.adtech.jastor.Thing posts) throws JastorException {
		if (this.posts == null)
			initPosts();
		if (this.posts.contains(posts)) {
			this.posts.remove(posts);
			this.posts.add(posts);
			return;
		}
		this.posts.add(posts);
		_model.add(_model.createStatement(_resource,postsProperty,posts.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPosts() throws JastorException {
		com.ibm.adtech.jastor.Thing posts = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.posts == null)
			initPosts();
		this.posts.add(posts);
		_model.add(_model.createStatement(_resource,postsProperty,posts.resource()));
		return posts;
	}
	
	public com.ibm.adtech.jastor.Thing addPosts(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing posts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.posts == null)
			initPosts();
		if (this.posts.contains(posts))
			return posts;
		this.posts.add(posts);
		_model.add(_model.createStatement(_resource,postsProperty,posts.resource()));
		return posts;
	}
	
	public void removePosts(com.ibm.adtech.jastor.Thing posts) throws JastorException {
		if (this.posts == null)
			initPosts();
		if (!this.posts.contains(posts))
			return;
		if (!_model.contains(_resource, postsProperty, posts.resource()))
			return;
		this.posts.remove(posts);
		_model.removeAll(_resource, postsProperty, posts.resource());
	}
		 

	private void initLocale() throws JastorException {
		locale = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, localeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#locale properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				locale.add(obj);
		}
	}

	public java.util.Iterator getLocale() throws JastorException {
		if (locale == null)
			initLocale();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(locale,_resource,localeProperty,false);
	}

	public void addLocale(java.lang.String locale) throws JastorException {
		if (this.locale == null)
			initLocale();
		if (this.locale.contains(locale))
			return;
		if (_model.contains(_resource, localeProperty, createLiteral(locale)))
			return;
		this.locale.add(locale);
		_model.add(_resource, localeProperty, createLiteral(locale));
	}
	
	public void removeLocale(java.lang.String locale) throws JastorException {
		if (this.locale == null)
			initLocale();
		if (!this.locale.contains(locale))
			return;
		if (!_model.contains(_resource, localeProperty, createLiteral(locale)))
			return;
		this.locale.remove(locale);
		_model.removeAll(_resource, localeProperty, createLiteral(locale));
	}


	private void initInterests() throws JastorException {
		this.interests = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, interestsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#interests properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing interests = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.interests.add(interests);
			}
		}
	}

	public java.util.Iterator getInterests() throws JastorException {
		if (interests == null)
			initInterests();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(interests,_resource,interestsProperty,true);
	}

	public void addInterests(com.ibm.adtech.jastor.Thing interests) throws JastorException {
		if (this.interests == null)
			initInterests();
		if (this.interests.contains(interests)) {
			this.interests.remove(interests);
			this.interests.add(interests);
			return;
		}
		this.interests.add(interests);
		_model.add(_model.createStatement(_resource,interestsProperty,interests.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addInterests() throws JastorException {
		com.ibm.adtech.jastor.Thing interests = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.interests == null)
			initInterests();
		this.interests.add(interests);
		_model.add(_model.createStatement(_resource,interestsProperty,interests.resource()));
		return interests;
	}
	
	public com.ibm.adtech.jastor.Thing addInterests(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing interests = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.interests == null)
			initInterests();
		if (this.interests.contains(interests))
			return interests;
		this.interests.add(interests);
		_model.add(_model.createStatement(_resource,interestsProperty,interests.resource()));
		return interests;
	}
	
	public void removeInterests(com.ibm.adtech.jastor.Thing interests) throws JastorException {
		if (this.interests == null)
			initInterests();
		if (!this.interests.contains(interests))
			return;
		if (!_model.contains(_resource, interestsProperty, interests.resource()))
			return;
		this.interests.remove(interests);
		_model.removeAll(_resource, interestsProperty, interests.resource());
	}
		 

	private void initPhotos() throws JastorException {
		this.photos = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, photosProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#photos properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.photos.add(photos);
			}
		}
	}

	public java.util.Iterator getPhotos() throws JastorException {
		if (photos == null)
			initPhotos();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(photos,_resource,photosProperty,true);
	}

	public void addPhotos(com.ibm.adtech.jastor.Thing photos) throws JastorException {
		if (this.photos == null)
			initPhotos();
		if (this.photos.contains(photos)) {
			this.photos.remove(photos);
			this.photos.add(photos);
			return;
		}
		this.photos.add(photos);
		_model.add(_model.createStatement(_resource,photosProperty,photos.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPhotos() throws JastorException {
		com.ibm.adtech.jastor.Thing photos = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.photos == null)
			initPhotos();
		this.photos.add(photos);
		_model.add(_model.createStatement(_resource,photosProperty,photos.resource()));
		return photos;
	}
	
	public com.ibm.adtech.jastor.Thing addPhotos(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.photos == null)
			initPhotos();
		if (this.photos.contains(photos))
			return photos;
		this.photos.add(photos);
		_model.add(_model.createStatement(_resource,photosProperty,photos.resource()));
		return photos;
	}
	
	public void removePhotos(com.ibm.adtech.jastor.Thing photos) throws JastorException {
		if (this.photos == null)
			initPhotos();
		if (!this.photos.contains(photos))
			return;
		if (!_model.contains(_resource, photosProperty, photos.resource()))
			return;
		this.photos.remove(photos);
		_model.removeAll(_resource, photosProperty, photos.resource());
	}
		 

	private void initPolitical() throws JastorException {
		political = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, politicalProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#political properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				political.add(obj);
		}
	}

	public java.util.Iterator getPolitical() throws JastorException {
		if (political == null)
			initPolitical();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(political,_resource,politicalProperty,false);
	}

	public void addPolitical(java.lang.String political) throws JastorException {
		if (this.political == null)
			initPolitical();
		if (this.political.contains(political))
			return;
		if (_model.contains(_resource, politicalProperty, createLiteral(political)))
			return;
		this.political.add(political);
		_model.add(_resource, politicalProperty, createLiteral(political));
	}
	
	public void removePolitical(java.lang.String political) throws JastorException {
		if (this.political == null)
			initPolitical();
		if (!this.political.contains(political))
			return;
		if (!_model.contains(_resource, politicalProperty, createLiteral(political)))
			return;
		this.political.remove(political);
		_model.removeAll(_resource, politicalProperty, createLiteral(political));
	}


	private void initEmail() throws JastorException {
		email = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, emailProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#email properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				email.add(obj);
		}
	}

	public java.util.Iterator getEmail() throws JastorException {
		if (email == null)
			initEmail();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(email,_resource,emailProperty,false);
	}

	public void addEmail(java.lang.String email) throws JastorException {
		if (this.email == null)
			initEmail();
		if (this.email.contains(email))
			return;
		if (_model.contains(_resource, emailProperty, createLiteral(email)))
			return;
		this.email.add(email);
		_model.add(_resource, emailProperty, createLiteral(email));
	}
	
	public void removeEmail(java.lang.String email) throws JastorException {
		if (this.email == null)
			initEmail();
		if (!this.email.contains(email))
			return;
		if (!_model.contains(_resource, emailProperty, createLiteral(email)))
			return;
		this.email.remove(email);
		_model.removeAll(_resource, emailProperty, createLiteral(email));
	}


	private void initTimezone() throws JastorException {
		timezone = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, timezoneProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#timezone properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
			if (obj != null)
				timezone.add(obj);
		}
	}

	public java.util.Iterator getTimezone() throws JastorException {
		if (timezone == null)
			initTimezone();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(timezone,_resource,timezoneProperty,false);
	}

	public void addTimezone(java.lang.Double timezone) throws JastorException {
		if (this.timezone == null)
			initTimezone();
		if (this.timezone.contains(timezone))
			return;
		if (_model.contains(_resource, timezoneProperty, createLiteral(timezone)))
			return;
		this.timezone.add(timezone);
		_model.add(_resource, timezoneProperty, createLiteral(timezone));
	}
	
	public void removeTimezone(java.lang.Double timezone) throws JastorException {
		if (this.timezone == null)
			initTimezone();
		if (!this.timezone.contains(timezone))
			return;
		if (!_model.contains(_resource, timezoneProperty, createLiteral(timezone)))
			return;
		this.timezone.remove(timezone);
		_model.removeAll(_resource, timezoneProperty, createLiteral(timezone));
	}


	private void initLastName() throws JastorException {
		lastName = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, lastNameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#lastName properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				lastName.add(obj);
		}
	}

	public java.util.Iterator getLastName() throws JastorException {
		if (lastName == null)
			initLastName();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(lastName,_resource,lastNameProperty,false);
	}

	public void addLastName(java.lang.String lastName) throws JastorException {
		if (this.lastName == null)
			initLastName();
		if (this.lastName.contains(lastName))
			return;
		if (_model.contains(_resource, lastNameProperty, createLiteral(lastName)))
			return;
		this.lastName.add(lastName);
		_model.add(_resource, lastNameProperty, createLiteral(lastName));
	}
	
	public void removeLastName(java.lang.String lastName) throws JastorException {
		if (this.lastName == null)
			initLastName();
		if (!this.lastName.contains(lastName))
			return;
		if (!_model.contains(_resource, lastNameProperty, createLiteral(lastName)))
			return;
		this.lastName.remove(lastName);
		_model.removeAll(_resource, lastNameProperty, createLiteral(lastName));
	}


	private void initTelevision() throws JastorException {
		this.television = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, televisionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#television properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing television = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.television.add(television);
			}
		}
	}

	public java.util.Iterator getTelevision() throws JastorException {
		if (television == null)
			initTelevision();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(television,_resource,televisionProperty,true);
	}

	public void addTelevision(com.ibm.adtech.jastor.Thing television) throws JastorException {
		if (this.television == null)
			initTelevision();
		if (this.television.contains(television)) {
			this.television.remove(television);
			this.television.add(television);
			return;
		}
		this.television.add(television);
		_model.add(_model.createStatement(_resource,televisionProperty,television.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addTelevision() throws JastorException {
		com.ibm.adtech.jastor.Thing television = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.television == null)
			initTelevision();
		this.television.add(television);
		_model.add(_model.createStatement(_resource,televisionProperty,television.resource()));
		return television;
	}
	
	public com.ibm.adtech.jastor.Thing addTelevision(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing television = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.television == null)
			initTelevision();
		if (this.television.contains(television))
			return television;
		this.television.add(television);
		_model.add(_model.createStatement(_resource,televisionProperty,television.resource()));
		return television;
	}
	
	public void removeTelevision(com.ibm.adtech.jastor.Thing television) throws JastorException {
		if (this.television == null)
			initTelevision();
		if (!this.television.contains(television))
			return;
		if (!_model.contains(_resource, televisionProperty, television.resource()))
			return;
		this.television.remove(television);
		_model.removeAll(_resource, televisionProperty, television.resource());
	}
		 

	private void initGroups() throws JastorException {
		this.groups = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, groupsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#groups properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing groups = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.groups.add(groups);
			}
		}
	}

	public java.util.Iterator getGroups() throws JastorException {
		if (groups == null)
			initGroups();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(groups,_resource,groupsProperty,true);
	}

	public void addGroups(com.ibm.adtech.jastor.Thing groups) throws JastorException {
		if (this.groups == null)
			initGroups();
		if (this.groups.contains(groups)) {
			this.groups.remove(groups);
			this.groups.add(groups);
			return;
		}
		this.groups.add(groups);
		_model.add(_model.createStatement(_resource,groupsProperty,groups.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addGroups() throws JastorException {
		com.ibm.adtech.jastor.Thing groups = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.groups == null)
			initGroups();
		this.groups.add(groups);
		_model.add(_model.createStatement(_resource,groupsProperty,groups.resource()));
		return groups;
	}
	
	public com.ibm.adtech.jastor.Thing addGroups(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing groups = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.groups == null)
			initGroups();
		if (this.groups.contains(groups))
			return groups;
		this.groups.add(groups);
		_model.add(_model.createStatement(_resource,groupsProperty,groups.resource()));
		return groups;
	}
	
	public void removeGroups(com.ibm.adtech.jastor.Thing groups) throws JastorException {
		if (this.groups == null)
			initGroups();
		if (!this.groups.contains(groups))
			return;
		if (!_model.contains(_resource, groupsProperty, groups.resource()))
			return;
		this.groups.remove(groups);
		_model.removeAll(_resource, groupsProperty, groups.resource());
	}
		 

	private void initWork() throws JastorException {
		this.work = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, workProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#work properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing work = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.work.add(work);
			}
		}
	}

	public java.util.Iterator getWork() throws JastorException {
		if (work == null)
			initWork();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(work,_resource,workProperty,true);
	}

	public void addWork(com.ibm.adtech.jastor.Thing work) throws JastorException {
		if (this.work == null)
			initWork();
		if (this.work.contains(work)) {
			this.work.remove(work);
			this.work.add(work);
			return;
		}
		this.work.add(work);
		_model.add(_model.createStatement(_resource,workProperty,work.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addWork() throws JastorException {
		com.ibm.adtech.jastor.Thing work = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.work == null)
			initWork();
		this.work.add(work);
		_model.add(_model.createStatement(_resource,workProperty,work.resource()));
		return work;
	}
	
	public com.ibm.adtech.jastor.Thing addWork(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing work = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.work == null)
			initWork();
		if (this.work.contains(work))
			return work;
		this.work.add(work);
		_model.add(_model.createStatement(_resource,workProperty,work.resource()));
		return work;
	}
	
	public void removeWork(com.ibm.adtech.jastor.Thing work) throws JastorException {
		if (this.work == null)
			initWork();
		if (!this.work.contains(work))
			return;
		if (!_model.contains(_resource, workProperty, work.resource()))
			return;
		this.work.remove(work);
		_model.removeAll(_resource, workProperty, work.resource());
	}
		 

	private void initUpdatedTime() throws JastorException {
		updatedTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, updatedTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#updatedTime properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
			if (obj != null)
				updatedTime.add(obj);
		}
	}

	public java.util.Iterator getUpdatedTime() throws JastorException {
		if (updatedTime == null)
			initUpdatedTime();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(updatedTime,_resource,updatedTimeProperty,false);
	}

	public void addUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws JastorException {
		if (this.updatedTime == null)
			initUpdatedTime();
		if (this.updatedTime.contains(updatedTime))
			return;
		if (_model.contains(_resource, updatedTimeProperty, createLiteral(updatedTime)))
			return;
		this.updatedTime.add(updatedTime);
		_model.add(_resource, updatedTimeProperty, createLiteral(updatedTime));
	}
	
	public void removeUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws JastorException {
		if (this.updatedTime == null)
			initUpdatedTime();
		if (!this.updatedTime.contains(updatedTime))
			return;
		if (!_model.contains(_resource, updatedTimeProperty, createLiteral(updatedTime)))
			return;
		this.updatedTime.remove(updatedTime);
		_model.removeAll(_resource, updatedTimeProperty, createLiteral(updatedTime));
	}


	private void initVideos() throws JastorException {
		this.videos = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, videosProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#videos properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing videos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.videos.add(videos);
			}
		}
	}

	public java.util.Iterator getVideos() throws JastorException {
		if (videos == null)
			initVideos();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(videos,_resource,videosProperty,true);
	}

	public void addVideos(com.ibm.adtech.jastor.Thing videos) throws JastorException {
		if (this.videos == null)
			initVideos();
		if (this.videos.contains(videos)) {
			this.videos.remove(videos);
			this.videos.add(videos);
			return;
		}
		this.videos.add(videos);
		_model.add(_model.createStatement(_resource,videosProperty,videos.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addVideos() throws JastorException {
		com.ibm.adtech.jastor.Thing videos = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.videos == null)
			initVideos();
		this.videos.add(videos);
		_model.add(_model.createStatement(_resource,videosProperty,videos.resource()));
		return videos;
	}
	
	public com.ibm.adtech.jastor.Thing addVideos(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing videos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.videos == null)
			initVideos();
		if (this.videos.contains(videos))
			return videos;
		this.videos.add(videos);
		_model.add(_model.createStatement(_resource,videosProperty,videos.resource()));
		return videos;
	}
	
	public void removeVideos(com.ibm.adtech.jastor.Thing videos) throws JastorException {
		if (this.videos == null)
			initVideos();
		if (!this.videos.contains(videos))
			return;
		if (!_model.contains(_resource, videosProperty, videos.resource()))
			return;
		this.videos.remove(videos);
		_model.removeAll(_resource, videosProperty, videos.resource());
	}
		 

	private void initStatuses() throws JastorException {
		this.statuses = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, statusesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#statuses properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing statuses = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.statuses.add(statuses);
			}
		}
	}

	public java.util.Iterator getStatuses() throws JastorException {
		if (statuses == null)
			initStatuses();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(statuses,_resource,statusesProperty,true);
	}

	public void addStatuses(com.ibm.adtech.jastor.Thing statuses) throws JastorException {
		if (this.statuses == null)
			initStatuses();
		if (this.statuses.contains(statuses)) {
			this.statuses.remove(statuses);
			this.statuses.add(statuses);
			return;
		}
		this.statuses.add(statuses);
		_model.add(_model.createStatement(_resource,statusesProperty,statuses.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addStatuses() throws JastorException {
		com.ibm.adtech.jastor.Thing statuses = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.statuses == null)
			initStatuses();
		this.statuses.add(statuses);
		_model.add(_model.createStatement(_resource,statusesProperty,statuses.resource()));
		return statuses;
	}
	
	public com.ibm.adtech.jastor.Thing addStatuses(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing statuses = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.statuses == null)
			initStatuses();
		if (this.statuses.contains(statuses))
			return statuses;
		this.statuses.add(statuses);
		_model.add(_model.createStatement(_resource,statusesProperty,statuses.resource()));
		return statuses;
	}
	
	public void removeStatuses(com.ibm.adtech.jastor.Thing statuses) throws JastorException {
		if (this.statuses == null)
			initStatuses();
		if (!this.statuses.contains(statuses))
			return;
		if (!_model.contains(_resource, statusesProperty, statuses.resource()))
			return;
		this.statuses.remove(statuses);
		_model.removeAll(_resource, statusesProperty, statuses.resource());
	}
		 

	private void initInbox() throws JastorException {
		this.inbox = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, inboxProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#inbox properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing inbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.inbox.add(inbox);
			}
		}
	}

	public java.util.Iterator getInbox() throws JastorException {
		if (inbox == null)
			initInbox();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(inbox,_resource,inboxProperty,true);
	}

	public void addInbox(com.ibm.adtech.jastor.Thing inbox) throws JastorException {
		if (this.inbox == null)
			initInbox();
		if (this.inbox.contains(inbox)) {
			this.inbox.remove(inbox);
			this.inbox.add(inbox);
			return;
		}
		this.inbox.add(inbox);
		_model.add(_model.createStatement(_resource,inboxProperty,inbox.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addInbox() throws JastorException {
		com.ibm.adtech.jastor.Thing inbox = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.inbox == null)
			initInbox();
		this.inbox.add(inbox);
		_model.add(_model.createStatement(_resource,inboxProperty,inbox.resource()));
		return inbox;
	}
	
	public com.ibm.adtech.jastor.Thing addInbox(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing inbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.inbox == null)
			initInbox();
		if (this.inbox.contains(inbox))
			return inbox;
		this.inbox.add(inbox);
		_model.add(_model.createStatement(_resource,inboxProperty,inbox.resource()));
		return inbox;
	}
	
	public void removeInbox(com.ibm.adtech.jastor.Thing inbox) throws JastorException {
		if (this.inbox == null)
			initInbox();
		if (!this.inbox.contains(inbox))
			return;
		if (!_model.contains(_resource, inboxProperty, inbox.resource()))
			return;
		this.inbox.remove(inbox);
		_model.removeAll(_resource, inboxProperty, inbox.resource());
	}
		 

	private void initAccounts() throws JastorException {
		this.accounts = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, accountsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#accounts properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing accounts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.accounts.add(accounts);
			}
		}
	}

	public java.util.Iterator getAccounts() throws JastorException {
		if (accounts == null)
			initAccounts();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(accounts,_resource,accountsProperty,true);
	}

	public void addAccounts(com.ibm.adtech.jastor.Thing accounts) throws JastorException {
		if (this.accounts == null)
			initAccounts();
		if (this.accounts.contains(accounts)) {
			this.accounts.remove(accounts);
			this.accounts.add(accounts);
			return;
		}
		this.accounts.add(accounts);
		_model.add(_model.createStatement(_resource,accountsProperty,accounts.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addAccounts() throws JastorException {
		com.ibm.adtech.jastor.Thing accounts = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.accounts == null)
			initAccounts();
		this.accounts.add(accounts);
		_model.add(_model.createStatement(_resource,accountsProperty,accounts.resource()));
		return accounts;
	}
	
	public com.ibm.adtech.jastor.Thing addAccounts(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing accounts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.accounts == null)
			initAccounts();
		if (this.accounts.contains(accounts))
			return accounts;
		this.accounts.add(accounts);
		_model.add(_model.createStatement(_resource,accountsProperty,accounts.resource()));
		return accounts;
	}
	
	public void removeAccounts(com.ibm.adtech.jastor.Thing accounts) throws JastorException {
		if (this.accounts == null)
			initAccounts();
		if (!this.accounts.contains(accounts))
			return;
		if (!_model.contains(_resource, accountsProperty, accounts.resource()))
			return;
		this.accounts.remove(accounts);
		_model.removeAll(_resource, accountsProperty, accounts.resource());
	}
		 

	private void initMusic() throws JastorException {
		this.music = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, musicProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#music properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing music = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.music.add(music);
			}
		}
	}

	public java.util.Iterator getMusic() throws JastorException {
		if (music == null)
			initMusic();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(music,_resource,musicProperty,true);
	}

	public void addMusic(com.ibm.adtech.jastor.Thing music) throws JastorException {
		if (this.music == null)
			initMusic();
		if (this.music.contains(music)) {
			this.music.remove(music);
			this.music.add(music);
			return;
		}
		this.music.add(music);
		_model.add(_model.createStatement(_resource,musicProperty,music.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addMusic() throws JastorException {
		com.ibm.adtech.jastor.Thing music = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.music == null)
			initMusic();
		this.music.add(music);
		_model.add(_model.createStatement(_resource,musicProperty,music.resource()));
		return music;
	}
	
	public com.ibm.adtech.jastor.Thing addMusic(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing music = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.music == null)
			initMusic();
		if (this.music.contains(music))
			return music;
		this.music.add(music);
		_model.add(_model.createStatement(_resource,musicProperty,music.resource()));
		return music;
	}
	
	public void removeMusic(com.ibm.adtech.jastor.Thing music) throws JastorException {
		if (this.music == null)
			initMusic();
		if (!this.music.contains(music))
			return;
		if (!_model.contains(_resource, musicProperty, music.resource()))
			return;
		this.music.remove(music);
		_model.removeAll(_resource, musicProperty, music.resource());
	}
		 

	private void initFriends() throws JastorException {
		this.friends = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, friendsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#friends properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.friends.add(friends);
			}
		}
	}

	public java.util.Iterator getFriends() throws JastorException {
		if (friends == null)
			initFriends();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(friends,_resource,friendsProperty,true);
	}

	public void addFriends(com.ibm.adtech.jastor.Thing friends) throws JastorException {
		if (this.friends == null)
			initFriends();
		if (this.friends.contains(friends)) {
			this.friends.remove(friends);
			this.friends.add(friends);
			return;
		}
		this.friends.add(friends);
		_model.add(_model.createStatement(_resource,friendsProperty,friends.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addFriends() throws JastorException {
		com.ibm.adtech.jastor.Thing friends = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.friends == null)
			initFriends();
		this.friends.add(friends);
		_model.add(_model.createStatement(_resource,friendsProperty,friends.resource()));
		return friends;
	}
	
	public com.ibm.adtech.jastor.Thing addFriends(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.friends == null)
			initFriends();
		if (this.friends.contains(friends))
			return friends;
		this.friends.add(friends);
		_model.add(_model.createStatement(_resource,friendsProperty,friends.resource()));
		return friends;
	}
	
	public void removeFriends(com.ibm.adtech.jastor.Thing friends) throws JastorException {
		if (this.friends == null)
			initFriends();
		if (!this.friends.contains(friends))
			return;
		if (!_model.contains(_resource, friendsProperty, friends.resource()))
			return;
		this.friends.remove(friends);
		_model.removeAll(_resource, friendsProperty, friends.resource());
	}
		 

	private void initBirthday() throws JastorException {
		birthday = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, birthdayProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#birthday properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				birthday.add(obj);
		}
	}

	public java.util.Iterator getBirthday() throws JastorException {
		if (birthday == null)
			initBirthday();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(birthday,_resource,birthdayProperty,false);
	}

	public void addBirthday(java.lang.String birthday) throws JastorException {
		if (this.birthday == null)
			initBirthday();
		if (this.birthday.contains(birthday))
			return;
		if (_model.contains(_resource, birthdayProperty, createLiteral(birthday)))
			return;
		this.birthday.add(birthday);
		_model.add(_resource, birthdayProperty, createLiteral(birthday));
	}
	
	public void removeBirthday(java.lang.String birthday) throws JastorException {
		if (this.birthday == null)
			initBirthday();
		if (!this.birthday.contains(birthday))
			return;
		if (!_model.contains(_resource, birthdayProperty, createLiteral(birthday)))
			return;
		this.birthday.remove(birthday);
		_model.removeAll(_resource, birthdayProperty, createLiteral(birthday));
	}


	private void initMovies() throws JastorException {
		this.movies = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, moviesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#movies properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing movies = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.movies.add(movies);
			}
		}
	}

	public java.util.Iterator getMovies() throws JastorException {
		if (movies == null)
			initMovies();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(movies,_resource,moviesProperty,true);
	}

	public void addMovies(com.ibm.adtech.jastor.Thing movies) throws JastorException {
		if (this.movies == null)
			initMovies();
		if (this.movies.contains(movies)) {
			this.movies.remove(movies);
			this.movies.add(movies);
			return;
		}
		this.movies.add(movies);
		_model.add(_model.createStatement(_resource,moviesProperty,movies.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addMovies() throws JastorException {
		com.ibm.adtech.jastor.Thing movies = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.movies == null)
			initMovies();
		this.movies.add(movies);
		_model.add(_model.createStatement(_resource,moviesProperty,movies.resource()));
		return movies;
	}
	
	public com.ibm.adtech.jastor.Thing addMovies(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing movies = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.movies == null)
			initMovies();
		if (this.movies.contains(movies))
			return movies;
		this.movies.add(movies);
		_model.add(_model.createStatement(_resource,moviesProperty,movies.resource()));
		return movies;
	}
	
	public void removeMovies(com.ibm.adtech.jastor.Thing movies) throws JastorException {
		if (this.movies == null)
			initMovies();
		if (!this.movies.contains(movies))
			return;
		if (!_model.contains(_resource, moviesProperty, movies.resource()))
			return;
		this.movies.remove(movies);
		_model.removeAll(_resource, moviesProperty, movies.resource());
	}
		 

	private void initActivities() throws JastorException {
		this.activities = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, activitiesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#activities properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing activities = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.activities.add(activities);
			}
		}
	}

	public java.util.Iterator getActivities() throws JastorException {
		if (activities == null)
			initActivities();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(activities,_resource,activitiesProperty,true);
	}

	public void addActivities(com.ibm.adtech.jastor.Thing activities) throws JastorException {
		if (this.activities == null)
			initActivities();
		if (this.activities.contains(activities)) {
			this.activities.remove(activities);
			this.activities.add(activities);
			return;
		}
		this.activities.add(activities);
		_model.add(_model.createStatement(_resource,activitiesProperty,activities.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addActivities() throws JastorException {
		com.ibm.adtech.jastor.Thing activities = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.activities == null)
			initActivities();
		this.activities.add(activities);
		_model.add(_model.createStatement(_resource,activitiesProperty,activities.resource()));
		return activities;
	}
	
	public com.ibm.adtech.jastor.Thing addActivities(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing activities = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.activities == null)
			initActivities();
		if (this.activities.contains(activities))
			return activities;
		this.activities.add(activities);
		_model.add(_model.createStatement(_resource,activitiesProperty,activities.resource()));
		return activities;
	}
	
	public void removeActivities(com.ibm.adtech.jastor.Thing activities) throws JastorException {
		if (this.activities == null)
			initActivities();
		if (!this.activities.contains(activities))
			return;
		if (!_model.contains(_resource, activitiesProperty, activities.resource()))
			return;
		this.activities.remove(activities);
		_model.removeAll(_resource, activitiesProperty, activities.resource());
	}
		 

	private void initId() throws JastorException {
		id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, idProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#id properties in User model not a Literal", stmt.getObject());
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


	private void initInterestedIn() throws JastorException {
		interestedIn = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, interestedInProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#interestedIn properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				interestedIn.add(obj);
		}
	}

	public java.util.Iterator getInterestedIn() throws JastorException {
		if (interestedIn == null)
			initInterestedIn();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(interestedIn,_resource,interestedInProperty,false);
	}

	public void addInterestedIn(java.lang.String interestedIn) throws JastorException {
		if (this.interestedIn == null)
			initInterestedIn();
		if (this.interestedIn.contains(interestedIn))
			return;
		if (_model.contains(_resource, interestedInProperty, createLiteral(interestedIn)))
			return;
		this.interestedIn.add(interestedIn);
		_model.add(_resource, interestedInProperty, createLiteral(interestedIn));
	}
	
	public void removeInterestedIn(java.lang.String interestedIn) throws JastorException {
		if (this.interestedIn == null)
			initInterestedIn();
		if (!this.interestedIn.contains(interestedIn))
			return;
		if (!_model.contains(_resource, interestedInProperty, createLiteral(interestedIn)))
			return;
		this.interestedIn.remove(interestedIn);
		_model.removeAll(_resource, interestedInProperty, createLiteral(interestedIn));
	}


	private void initFeed() throws JastorException {
		this.feed = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, feedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#feed properties in User model not a Resource", stmt.getObject());
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
		 

	private void initGender() throws JastorException {
		gender = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, genderProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#gender properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				gender.add(obj);
		}
	}

	public java.util.Iterator getGender() throws JastorException {
		if (gender == null)
			initGender();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(gender,_resource,genderProperty,false);
	}

	public void addGender(java.lang.String gender) throws JastorException {
		if (this.gender == null)
			initGender();
		if (this.gender.contains(gender))
			return;
		if (_model.contains(_resource, genderProperty, createLiteral(gender)))
			return;
		this.gender.add(gender);
		_model.add(_resource, genderProperty, createLiteral(gender));
	}
	
	public void removeGender(java.lang.String gender) throws JastorException {
		if (this.gender == null)
			initGender();
		if (!this.gender.contains(gender))
			return;
		if (!_model.contains(_resource, genderProperty, createLiteral(gender)))
			return;
		this.gender.remove(gender);
		_model.removeAll(_resource, genderProperty, createLiteral(gender));
	}


	private void initBio() throws JastorException {
		bio = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, bioProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#bio properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				bio.add(obj);
		}
	}

	public java.util.Iterator getBio() throws JastorException {
		if (bio == null)
			initBio();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(bio,_resource,bioProperty,false);
	}

	public void addBio(java.lang.String bio) throws JastorException {
		if (this.bio == null)
			initBio();
		if (this.bio.contains(bio))
			return;
		if (_model.contains(_resource, bioProperty, createLiteral(bio)))
			return;
		this.bio.add(bio);
		_model.add(_resource, bioProperty, createLiteral(bio));
	}
	
	public void removeBio(java.lang.String bio) throws JastorException {
		if (this.bio == null)
			initBio();
		if (!this.bio.contains(bio))
			return;
		if (!_model.contains(_resource, bioProperty, createLiteral(bio)))
			return;
		this.bio.remove(bio);
		_model.removeAll(_resource, bioProperty, createLiteral(bio));
	}


	private void initName() throws JastorException {
		name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#name properties in User model not a Literal", stmt.getObject());
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


	private void initUpdates() throws JastorException {
		this.updates = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, updatesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#updates properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing updates = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.updates.add(updates);
			}
		}
	}

	public java.util.Iterator getUpdates() throws JastorException {
		if (updates == null)
			initUpdates();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(updates,_resource,updatesProperty,true);
	}

	public void addUpdates(com.ibm.adtech.jastor.Thing updates) throws JastorException {
		if (this.updates == null)
			initUpdates();
		if (this.updates.contains(updates)) {
			this.updates.remove(updates);
			this.updates.add(updates);
			return;
		}
		this.updates.add(updates);
		_model.add(_model.createStatement(_resource,updatesProperty,updates.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addUpdates() throws JastorException {
		com.ibm.adtech.jastor.Thing updates = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.updates == null)
			initUpdates();
		this.updates.add(updates);
		_model.add(_model.createStatement(_resource,updatesProperty,updates.resource()));
		return updates;
	}
	
	public com.ibm.adtech.jastor.Thing addUpdates(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing updates = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.updates == null)
			initUpdates();
		if (this.updates.contains(updates))
			return updates;
		this.updates.add(updates);
		_model.add(_model.createStatement(_resource,updatesProperty,updates.resource()));
		return updates;
	}
	
	public void removeUpdates(com.ibm.adtech.jastor.Thing updates) throws JastorException {
		if (this.updates == null)
			initUpdates();
		if (!this.updates.contains(updates))
			return;
		if (!_model.contains(_resource, updatesProperty, updates.resource()))
			return;
		this.updates.remove(updates);
		_model.removeAll(_resource, updatesProperty, updates.resource());
	}
		 

	private void initAttribution() throws JastorException {
		attribution = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, attributionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#attribution properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				attribution.add(obj);
		}
	}

	public java.util.Iterator getAttribution() throws JastorException {
		if (attribution == null)
			initAttribution();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(attribution,_resource,attributionProperty,false);
	}

	public void addAttribution(java.lang.String attribution) throws JastorException {
		if (this.attribution == null)
			initAttribution();
		if (this.attribution.contains(attribution))
			return;
		if (_model.contains(_resource, attributionProperty, createLiteral(attribution)))
			return;
		this.attribution.add(attribution);
		_model.add(_resource, attributionProperty, createLiteral(attribution));
	}
	
	public void removeAttribution(java.lang.String attribution) throws JastorException {
		if (this.attribution == null)
			initAttribution();
		if (!this.attribution.contains(attribution))
			return;
		if (!_model.contains(_resource, attributionProperty, createLiteral(attribution)))
			return;
		this.attribution.remove(attribution);
		_model.removeAll(_resource, attributionProperty, createLiteral(attribution));
	}


	private void initRelationshipStatus() throws JastorException {
		relationshipStatus = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, relationshipStatusProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#relationshipStatus properties in User model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				relationshipStatus.add(obj);
		}
	}

	public java.util.Iterator getRelationshipStatus() throws JastorException {
		if (relationshipStatus == null)
			initRelationshipStatus();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(relationshipStatus,_resource,relationshipStatusProperty,false);
	}

	public void addRelationshipStatus(java.lang.String relationshipStatus) throws JastorException {
		if (this.relationshipStatus == null)
			initRelationshipStatus();
		if (this.relationshipStatus.contains(relationshipStatus))
			return;
		if (_model.contains(_resource, relationshipStatusProperty, createLiteral(relationshipStatus)))
			return;
		this.relationshipStatus.add(relationshipStatus);
		_model.add(_resource, relationshipStatusProperty, createLiteral(relationshipStatus));
	}
	
	public void removeRelationshipStatus(java.lang.String relationshipStatus) throws JastorException {
		if (this.relationshipStatus == null)
			initRelationshipStatus();
		if (!this.relationshipStatus.contains(relationshipStatus))
			return;
		if (!_model.contains(_resource, relationshipStatusProperty, createLiteral(relationshipStatus)))
			return;
		this.relationshipStatus.remove(relationshipStatus);
		_model.removeAll(_resource, relationshipStatusProperty, createLiteral(relationshipStatus));
	}


	private void initEvents() throws JastorException {
		this.events = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, eventsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://foolme.csail.mit.edu/ns/saveface/User.owl#events properties in User model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing events = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.events.add(events);
			}
		}
	}

	public java.util.Iterator getEvents() throws JastorException {
		if (events == null)
			initEvents();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(events,_resource,eventsProperty,true);
	}

	public void addEvents(com.ibm.adtech.jastor.Thing events) throws JastorException {
		if (this.events == null)
			initEvents();
		if (this.events.contains(events)) {
			this.events.remove(events);
			this.events.add(events);
			return;
		}
		this.events.add(events);
		_model.add(_model.createStatement(_resource,eventsProperty,events.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addEvents() throws JastorException {
		com.ibm.adtech.jastor.Thing events = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.events == null)
			initEvents();
		this.events.add(events);
		_model.add(_model.createStatement(_resource,eventsProperty,events.resource()));
		return events;
	}
	
	public com.ibm.adtech.jastor.Thing addEvents(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing events = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.events == null)
			initEvents();
		if (this.events.contains(events))
			return events;
		this.events.add(events);
		_model.add(_model.createStatement(_resource,eventsProperty,events.resource()));
		return events;
	}
	
	public void removeEvents(com.ibm.adtech.jastor.Thing events) throws JastorException {
		if (this.events == null)
			initEvents();
		if (!this.events.contains(events))
			return;
		if (!_model.contains(_resource, eventsProperty, events.resource()))
			return;
		this.events.remove(events);
		_model.removeAll(_resource, eventsProperty, events.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof UserListener))
			throw new IllegalArgumentException("ThingListener must be instance of UserListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((UserListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof UserListener))
			throw new IllegalArgumentException("ThingListener must be instance of UserListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(quotesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (quotes == null) {
					try {
						initQuotes();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !quotes.contains(obj))
					quotes.add(obj);
				java.util.ArrayList consumersForQuotes;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForQuotes = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForQuotes.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.quotesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(outboxProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _outbox = null;
					try {
						_outbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (outbox == null) {
						try {
							initOutbox();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!outbox.contains(_outbox))
						outbox.add(_outbox);
					if (listeners != null) {
						java.util.ArrayList consumersForOutbox;
						synchronized (listeners) {
							consumersForOutbox = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForOutbox.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.outboxAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_outbox);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(aboutProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (about == null) {
					try {
						initAbout();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !about.contains(obj))
					about.add(obj);
				java.util.ArrayList consumersForAbout;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForAbout = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAbout.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.aboutAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.linkAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(checkinsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _checkins = null;
					try {
						_checkins = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (checkins == null) {
						try {
							initCheckins();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!checkins.contains(_checkins))
						checkins.add(_checkins);
					if (listeners != null) {
						java.util.ArrayList consumersForCheckins;
						synchronized (listeners) {
							consumersForCheckins = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCheckins.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.checkinsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_checkins);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(likesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _likes = null;
					try {
						_likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (likes == null) {
						try {
							initLikes();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!likes.contains(_likes))
						likes.add(_likes);
					if (listeners != null) {
						java.util.ArrayList consumersForLikes;
						synchronized (listeners) {
							consumersForLikes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLikes.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.likesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_likes);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(educationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _education = null;
					try {
						_education = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (education == null) {
						try {
							initEducation();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!education.contains(_education))
						education.add(_education);
					if (listeners != null) {
						java.util.ArrayList consumersForEducation;
						synchronized (listeners) {
							consumersForEducation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEducation.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.educationAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_education);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(notesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _notes = null;
					try {
						_notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (notes == null) {
						try {
							initNotes();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!notes.contains(_notes))
						notes.add(_notes);
					if (listeners != null) {
						java.util.ArrayList consumersForNotes;
						synchronized (listeners) {
							consumersForNotes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForNotes.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.notesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_notes);
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
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (firstName == null) {
					try {
						initFirstName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !firstName.contains(obj))
					firstName.add(obj);
				java.util.ArrayList consumersForFirstName;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForFirstName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForFirstName.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.firstNameAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(significantOtherProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (significantOther == null) {
					try {
						initSignificantOther();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !significantOther.contains(obj))
					significantOther.add(obj);
				java.util.ArrayList consumersForSignificantOther;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForSignificantOther = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForSignificantOther.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.significantOtherAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(religionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (religion == null) {
					try {
						initReligion();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !religion.contains(obj))
					religion.add(obj);
				java.util.ArrayList consumersForReligion;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForReligion = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForReligion.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.religionAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(meetingForProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (meetingFor == null) {
					try {
						initMeetingFor();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !meetingFor.contains(obj))
					meetingFor.add(obj);
				java.util.ArrayList consumersForMeetingFor;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForMeetingFor = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMeetingFor.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.meetingForAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(albumsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _albums = null;
					try {
						_albums = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (albums == null) {
						try {
							initAlbums();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!albums.contains(_albums))
						albums.add(_albums);
					if (listeners != null) {
						java.util.ArrayList consumersForAlbums;
						synchronized (listeners) {
							consumersForAlbums = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAlbums.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.albumsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_albums);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(linksProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _links = null;
					try {
						_links = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (links == null) {
						try {
							initLinks();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!links.contains(_links))
						links.add(_links);
					if (listeners != null) {
						java.util.ArrayList consumersForLinks;
						synchronized (listeners) {
							consumersForLinks = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLinks.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.linksAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_links);
						}
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
						UserListener listener=(UserListener)iter.next();
						listener.websiteAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
							UserListener listener=(UserListener)iter.next();
							listener.locationAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_location);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(verifiedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (verified == null) {
					try {
						initVerified();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !verified.contains(obj))
					verified.add(obj);
				java.util.ArrayList consumersForVerified;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForVerified = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForVerified.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.verifiedAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hometownProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _hometown = null;
					try {
						_hometown = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hometown == null) {
						try {
							initHometown();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hometown.contains(_hometown))
						hometown.add(_hometown);
					if (listeners != null) {
						java.util.ArrayList consumersForHometown;
						synchronized (listeners) {
							consumersForHometown = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHometown.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.hometownAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_hometown);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(booksProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _books = null;
					try {
						_books = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (books == null) {
						try {
							initBooks();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!books.contains(_books))
						books.add(_books);
					if (listeners != null) {
						java.util.ArrayList consumersForBooks;
						synchronized (listeners) {
							consumersForBooks = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBooks.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.booksAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_books);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(postsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _posts = null;
					try {
						_posts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (posts == null) {
						try {
							initPosts();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!posts.contains(_posts))
						posts.add(_posts);
					if (listeners != null) {
						java.util.ArrayList consumersForPosts;
						synchronized (listeners) {
							consumersForPosts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPosts.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.postsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_posts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(localeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (locale == null) {
					try {
						initLocale();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !locale.contains(obj))
					locale.add(obj);
				java.util.ArrayList consumersForLocale;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLocale = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLocale.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.localeAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(interestsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _interests = null;
					try {
						_interests = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (interests == null) {
						try {
							initInterests();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!interests.contains(_interests))
						interests.add(_interests);
					if (listeners != null) {
						java.util.ArrayList consumersForInterests;
						synchronized (listeners) {
							consumersForInterests = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForInterests.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.interestsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_interests);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _photos = null;
					try {
						_photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (photos == null) {
						try {
							initPhotos();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!photos.contains(_photos))
						photos.add(_photos);
					if (listeners != null) {
						java.util.ArrayList consumersForPhotos;
						synchronized (listeners) {
							consumersForPhotos = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhotos.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.photosAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_photos);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(politicalProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (political == null) {
					try {
						initPolitical();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !political.contains(obj))
					political.add(obj);
				java.util.ArrayList consumersForPolitical;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForPolitical = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForPolitical.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.politicalAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(emailProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (email == null) {
					try {
						initEmail();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !email.contains(obj))
					email.add(obj);
				java.util.ArrayList consumersForEmail;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForEmail = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForEmail.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.emailAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(timezoneProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
				if (timezone == null) {
					try {
						initTimezone();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !timezone.contains(obj))
					timezone.add(obj);
				java.util.ArrayList consumersForTimezone;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForTimezone = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForTimezone.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.timezoneAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.Double)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lastNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (lastName == null) {
					try {
						initLastName();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !lastName.contains(obj))
					lastName.add(obj);
				java.util.ArrayList consumersForLastName;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLastName = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLastName.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.lastNameAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(televisionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _television = null;
					try {
						_television = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (television == null) {
						try {
							initTelevision();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!television.contains(_television))
						television.add(_television);
					if (listeners != null) {
						java.util.ArrayList consumersForTelevision;
						synchronized (listeners) {
							consumersForTelevision = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTelevision.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.televisionAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_television);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(groupsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _groups = null;
					try {
						_groups = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (groups == null) {
						try {
							initGroups();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!groups.contains(_groups))
						groups.add(_groups);
					if (listeners != null) {
						java.util.ArrayList consumersForGroups;
						synchronized (listeners) {
							consumersForGroups = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGroups.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.groupsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_groups);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(workProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _work = null;
					try {
						_work = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (work == null) {
						try {
							initWork();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!work.contains(_work))
						work.add(_work);
					if (listeners != null) {
						java.util.ArrayList consumersForWork;
						synchronized (listeners) {
							consumersForWork = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForWork.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.workAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_work);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(updatedTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (updatedTime == null) {
					try {
						initUpdatedTime();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !updatedTime.contains(obj))
					updatedTime.add(obj);
				java.util.ArrayList consumersForUpdatedTime;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForUpdatedTime = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForUpdatedTime.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.updatedTimeAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(videosProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _videos = null;
					try {
						_videos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (videos == null) {
						try {
							initVideos();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!videos.contains(_videos))
						videos.add(_videos);
					if (listeners != null) {
						java.util.ArrayList consumersForVideos;
						synchronized (listeners) {
							consumersForVideos = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForVideos.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.videosAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_videos);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(statusesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _statuses = null;
					try {
						_statuses = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (statuses == null) {
						try {
							initStatuses();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!statuses.contains(_statuses))
						statuses.add(_statuses);
					if (listeners != null) {
						java.util.ArrayList consumersForStatuses;
						synchronized (listeners) {
							consumersForStatuses = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForStatuses.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.statusesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_statuses);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(inboxProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _inbox = null;
					try {
						_inbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (inbox == null) {
						try {
							initInbox();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!inbox.contains(_inbox))
						inbox.add(_inbox);
					if (listeners != null) {
						java.util.ArrayList consumersForInbox;
						synchronized (listeners) {
							consumersForInbox = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForInbox.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.inboxAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_inbox);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(accountsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _accounts = null;
					try {
						_accounts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (accounts == null) {
						try {
							initAccounts();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!accounts.contains(_accounts))
						accounts.add(_accounts);
					if (listeners != null) {
						java.util.ArrayList consumersForAccounts;
						synchronized (listeners) {
							consumersForAccounts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAccounts.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.accountsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_accounts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(musicProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _music = null;
					try {
						_music = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (music == null) {
						try {
							initMusic();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!music.contains(_music))
						music.add(_music);
					if (listeners != null) {
						java.util.ArrayList consumersForMusic;
						synchronized (listeners) {
							consumersForMusic = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMusic.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.musicAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_music);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(friendsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _friends = null;
					try {
						_friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (friends == null) {
						try {
							initFriends();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!friends.contains(_friends))
						friends.add(_friends);
					if (listeners != null) {
						java.util.ArrayList consumersForFriends;
						synchronized (listeners) {
							consumersForFriends = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFriends.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.friendsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_friends);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(birthdayProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (birthday == null) {
					try {
						initBirthday();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !birthday.contains(obj))
					birthday.add(obj);
				java.util.ArrayList consumersForBirthday;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForBirthday = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForBirthday.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.birthdayAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(moviesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _movies = null;
					try {
						_movies = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (movies == null) {
						try {
							initMovies();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!movies.contains(_movies))
						movies.add(_movies);
					if (listeners != null) {
						java.util.ArrayList consumersForMovies;
						synchronized (listeners) {
							consumersForMovies = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMovies.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.moviesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_movies);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(activitiesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _activities = null;
					try {
						_activities = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (activities == null) {
						try {
							initActivities();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!activities.contains(_activities))
						activities.add(_activities);
					if (listeners != null) {
						java.util.ArrayList consumersForActivities;
						synchronized (listeners) {
							consumersForActivities = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForActivities.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.activitiesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_activities);
						}
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
						UserListener listener=(UserListener)iter.next();
						listener.idAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(interestedInProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (interestedIn == null) {
					try {
						initInterestedIn();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !interestedIn.contains(obj))
					interestedIn.add(obj);
				java.util.ArrayList consumersForInterestedIn;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForInterestedIn = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForInterestedIn.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.interestedInAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
							UserListener listener=(UserListener)iter.next();
							listener.feedAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_feed);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(genderProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gender == null) {
					try {
						initGender();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !gender.contains(obj))
					gender.add(obj);
				java.util.ArrayList consumersForGender;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForGender = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGender.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.genderAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(bioProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (bio == null) {
					try {
						initBio();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !bio.contains(obj))
					bio.add(obj);
				java.util.ArrayList consumersForBio;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForBio = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForBio.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.bioAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.nameAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(updatesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _updates = null;
					try {
						_updates = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (updates == null) {
						try {
							initUpdates();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!updates.contains(_updates))
						updates.add(_updates);
					if (listeners != null) {
						java.util.ArrayList consumersForUpdates;
						synchronized (listeners) {
							consumersForUpdates = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForUpdates.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.updatesAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_updates);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(attributionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (attribution == null) {
					try {
						initAttribution();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !attribution.contains(obj))
					attribution.add(obj);
				java.util.ArrayList consumersForAttribution;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForAttribution = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForAttribution.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.attributionAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(relationshipStatusProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (relationshipStatus == null) {
					try {
						initRelationshipStatus();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !relationshipStatus.contains(obj))
					relationshipStatus.add(obj);
				java.util.ArrayList consumersForRelationshipStatus;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForRelationshipStatus = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForRelationshipStatus.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.relationshipStatusAdded(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(eventsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _events = null;
					try {
						_events = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (events == null) {
						try {
							initEvents();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!events.contains(_events))
						events.add(_events);
					if (listeners != null) {
						java.util.ArrayList consumersForEvents;
						synchronized (listeners) {
							consumersForEvents = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEvents.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.eventsAdded(edu.mit.dig.saveface.model.user.UserImpl.this,_events);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(quotesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (quotes != null) {
					if (quotes.contains(obj))
						quotes.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.quotesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(outboxProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _outbox = null;
					if (outbox != null) {
						boolean found = false;
						for (int i=0;i<outbox.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) outbox.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_outbox = __item;
								break;
							}
						}
						if (found)
							outbox.remove(_outbox);
						else {
							try {
								_outbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_outbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForOutbox;
						synchronized (listeners) {
							consumersForOutbox = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForOutbox.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.outboxRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_outbox);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(aboutProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (about != null) {
					if (about.contains(obj))
						about.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.aboutRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.linkRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(checkinsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _checkins = null;
					if (checkins != null) {
						boolean found = false;
						for (int i=0;i<checkins.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) checkins.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_checkins = __item;
								break;
							}
						}
						if (found)
							checkins.remove(_checkins);
						else {
							try {
								_checkins = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_checkins = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForCheckins;
						synchronized (listeners) {
							consumersForCheckins = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCheckins.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.checkinsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_checkins);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(likesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _likes = null;
					if (likes != null) {
						boolean found = false;
						for (int i=0;i<likes.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) likes.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_likes = __item;
								break;
							}
						}
						if (found)
							likes.remove(_likes);
						else {
							try {
								_likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_likes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLikes;
						synchronized (listeners) {
							consumersForLikes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLikes.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.likesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_likes);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(educationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _education = null;
					if (education != null) {
						boolean found = false;
						for (int i=0;i<education.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) education.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_education = __item;
								break;
							}
						}
						if (found)
							education.remove(_education);
						else {
							try {
								_education = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_education = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForEducation;
						synchronized (listeners) {
							consumersForEducation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEducation.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.educationRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_education);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(notesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _notes = null;
					if (notes != null) {
						boolean found = false;
						for (int i=0;i<notes.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) notes.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_notes = __item;
								break;
							}
						}
						if (found)
							notes.remove(_notes);
						else {
							try {
								_notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_notes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForNotes;
						synchronized (listeners) {
							consumersForNotes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForNotes.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.notesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_notes);
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
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (firstName != null) {
					if (firstName.contains(obj))
						firstName.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.firstNameRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(significantOtherProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (significantOther != null) {
					if (significantOther.contains(obj))
						significantOther.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.significantOtherRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(religionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (religion != null) {
					if (religion.contains(obj))
						religion.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.religionRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(meetingForProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (meetingFor != null) {
					if (meetingFor.contains(obj))
						meetingFor.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.meetingForRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(albumsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _albums = null;
					if (albums != null) {
						boolean found = false;
						for (int i=0;i<albums.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) albums.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_albums = __item;
								break;
							}
						}
						if (found)
							albums.remove(_albums);
						else {
							try {
								_albums = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_albums = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForAlbums;
						synchronized (listeners) {
							consumersForAlbums = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAlbums.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.albumsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_albums);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(linksProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _links = null;
					if (links != null) {
						boolean found = false;
						for (int i=0;i<links.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) links.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_links = __item;
								break;
							}
						}
						if (found)
							links.remove(_links);
						else {
							try {
								_links = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_links = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLinks;
						synchronized (listeners) {
							consumersForLinks = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLinks.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.linksRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_links);
						}
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
						UserListener listener=(UserListener)iter.next();
						listener.websiteRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
							UserListener listener=(UserListener)iter.next();
							listener.locationRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_location);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(verifiedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Boolean","http://www.w3.org/2001/XMLSchema#boolean");
				if (verified != null) {
					if (verified.contains(obj))
						verified.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.verifiedRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.Boolean)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hometownProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _hometown = null;
					if (hometown != null) {
						boolean found = false;
						for (int i=0;i<hometown.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) hometown.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hometown = __item;
								break;
							}
						}
						if (found)
							hometown.remove(_hometown);
						else {
							try {
								_hometown = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hometown = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHometown;
						synchronized (listeners) {
							consumersForHometown = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHometown.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.hometownRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_hometown);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(booksProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _books = null;
					if (books != null) {
						boolean found = false;
						for (int i=0;i<books.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) books.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_books = __item;
								break;
							}
						}
						if (found)
							books.remove(_books);
						else {
							try {
								_books = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_books = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBooks;
						synchronized (listeners) {
							consumersForBooks = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBooks.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.booksRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_books);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(postsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _posts = null;
					if (posts != null) {
						boolean found = false;
						for (int i=0;i<posts.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) posts.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_posts = __item;
								break;
							}
						}
						if (found)
							posts.remove(_posts);
						else {
							try {
								_posts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_posts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPosts;
						synchronized (listeners) {
							consumersForPosts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPosts.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.postsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_posts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(localeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (locale != null) {
					if (locale.contains(obj))
						locale.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.localeRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(interestsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _interests = null;
					if (interests != null) {
						boolean found = false;
						for (int i=0;i<interests.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) interests.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_interests = __item;
								break;
							}
						}
						if (found)
							interests.remove(_interests);
						else {
							try {
								_interests = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_interests = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForInterests;
						synchronized (listeners) {
							consumersForInterests = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForInterests.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.interestsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_interests);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(photosProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _photos = null;
					if (photos != null) {
						boolean found = false;
						for (int i=0;i<photos.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) photos.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_photos = __item;
								break;
							}
						}
						if (found)
							photos.remove(_photos);
						else {
							try {
								_photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_photos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPhotos;
						synchronized (listeners) {
							consumersForPhotos = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPhotos.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.photosRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_photos);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(politicalProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (political != null) {
					if (political.contains(obj))
						political.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.politicalRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(emailProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (email != null) {
					if (email.contains(obj))
						email.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.emailRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(timezoneProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Double","http://www.w3.org/2001/XMLSchema#double");
				if (timezone != null) {
					if (timezone.contains(obj))
						timezone.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.timezoneRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.Double)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lastNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (lastName != null) {
					if (lastName.contains(obj))
						lastName.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.lastNameRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(televisionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _television = null;
					if (television != null) {
						boolean found = false;
						for (int i=0;i<television.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) television.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_television = __item;
								break;
							}
						}
						if (found)
							television.remove(_television);
						else {
							try {
								_television = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_television = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForTelevision;
						synchronized (listeners) {
							consumersForTelevision = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForTelevision.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.televisionRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_television);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(groupsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _groups = null;
					if (groups != null) {
						boolean found = false;
						for (int i=0;i<groups.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) groups.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_groups = __item;
								break;
							}
						}
						if (found)
							groups.remove(_groups);
						else {
							try {
								_groups = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_groups = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGroups;
						synchronized (listeners) {
							consumersForGroups = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGroups.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.groupsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_groups);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(workProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _work = null;
					if (work != null) {
						boolean found = false;
						for (int i=0;i<work.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) work.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_work = __item;
								break;
							}
						}
						if (found)
							work.remove(_work);
						else {
							try {
								_work = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_work = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForWork;
						synchronized (listeners) {
							consumersForWork = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForWork.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.workRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_work);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(updatedTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (updatedTime != null) {
					if (updatedTime.contains(obj))
						updatedTime.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.updatedTimeRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(videosProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _videos = null;
					if (videos != null) {
						boolean found = false;
						for (int i=0;i<videos.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) videos.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_videos = __item;
								break;
							}
						}
						if (found)
							videos.remove(_videos);
						else {
							try {
								_videos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_videos = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForVideos;
						synchronized (listeners) {
							consumersForVideos = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForVideos.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.videosRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_videos);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(statusesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _statuses = null;
					if (statuses != null) {
						boolean found = false;
						for (int i=0;i<statuses.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) statuses.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_statuses = __item;
								break;
							}
						}
						if (found)
							statuses.remove(_statuses);
						else {
							try {
								_statuses = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_statuses = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForStatuses;
						synchronized (listeners) {
							consumersForStatuses = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForStatuses.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.statusesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_statuses);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(inboxProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _inbox = null;
					if (inbox != null) {
						boolean found = false;
						for (int i=0;i<inbox.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) inbox.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_inbox = __item;
								break;
							}
						}
						if (found)
							inbox.remove(_inbox);
						else {
							try {
								_inbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_inbox = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForInbox;
						synchronized (listeners) {
							consumersForInbox = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForInbox.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.inboxRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_inbox);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(accountsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _accounts = null;
					if (accounts != null) {
						boolean found = false;
						for (int i=0;i<accounts.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) accounts.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_accounts = __item;
								break;
							}
						}
						if (found)
							accounts.remove(_accounts);
						else {
							try {
								_accounts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_accounts = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForAccounts;
						synchronized (listeners) {
							consumersForAccounts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForAccounts.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.accountsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_accounts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(musicProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _music = null;
					if (music != null) {
						boolean found = false;
						for (int i=0;i<music.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) music.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_music = __item;
								break;
							}
						}
						if (found)
							music.remove(_music);
						else {
							try {
								_music = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_music = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMusic;
						synchronized (listeners) {
							consumersForMusic = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMusic.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.musicRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_music);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(friendsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _friends = null;
					if (friends != null) {
						boolean found = false;
						for (int i=0;i<friends.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) friends.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_friends = __item;
								break;
							}
						}
						if (found)
							friends.remove(_friends);
						else {
							try {
								_friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_friends = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForFriends;
						synchronized (listeners) {
							consumersForFriends = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForFriends.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.friendsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_friends);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(birthdayProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (birthday != null) {
					if (birthday.contains(obj))
						birthday.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.birthdayRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(moviesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _movies = null;
					if (movies != null) {
						boolean found = false;
						for (int i=0;i<movies.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) movies.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_movies = __item;
								break;
							}
						}
						if (found)
							movies.remove(_movies);
						else {
							try {
								_movies = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_movies = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMovies;
						synchronized (listeners) {
							consumersForMovies = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMovies.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.moviesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_movies);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(activitiesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _activities = null;
					if (activities != null) {
						boolean found = false;
						for (int i=0;i<activities.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) activities.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_activities = __item;
								break;
							}
						}
						if (found)
							activities.remove(_activities);
						else {
							try {
								_activities = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_activities = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForActivities;
						synchronized (listeners) {
							consumersForActivities = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForActivities.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.activitiesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_activities);
						}
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
						UserListener listener=(UserListener)iter.next();
						listener.idRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(interestedInProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (interestedIn != null) {
					if (interestedIn.contains(obj))
						interestedIn.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.interestedInRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
							UserListener listener=(UserListener)iter.next();
							listener.feedRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_feed);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(genderProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gender != null) {
					if (gender.contains(obj))
						gender.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.genderRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(bioProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (bio != null) {
					if (bio.contains(obj))
						bio.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.bioRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
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
						UserListener listener=(UserListener)iter.next();
						listener.nameRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(updatesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _updates = null;
					if (updates != null) {
						boolean found = false;
						for (int i=0;i<updates.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) updates.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_updates = __item;
								break;
							}
						}
						if (found)
							updates.remove(_updates);
						else {
							try {
								_updates = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_updates = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForUpdates;
						synchronized (listeners) {
							consumersForUpdates = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForUpdates.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.updatesRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_updates);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(attributionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (attribution != null) {
					if (attribution.contains(obj))
						attribution.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.attributionRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(relationshipStatusProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (relationshipStatus != null) {
					if (relationshipStatus.contains(obj))
						relationshipStatus.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						UserListener listener=(UserListener)iter.next();
						listener.relationshipStatusRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(eventsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _events = null;
					if (events != null) {
						boolean found = false;
						for (int i=0;i<events.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) events.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_events = __item;
								break;
							}
						}
						if (found)
							events.remove(_events);
						else {
							try {
								_events = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_events = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForEvents;
						synchronized (listeners) {
							consumersForEvents = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEvents.iterator();iter.hasNext();){
							UserListener listener=(UserListener)iter.next();
							listener.eventsRemoved(edu.mit.dig.saveface.model.user.UserImpl.this,_events);
						}
					}
				}
				return;
			}
		}

	//}
	


}