

package edu.mit.dig.saveface.model.user;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for User ontology class<br>
 * Use the edu.mit.dig.saveface.model.User.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#User)</p>
 * <br>
 * <br>
 * <br>
 */
public interface User extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/User.owl#User");
	

	/**
	 * The Jena Property for quotes 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#quotes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property quotesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#quotes");


	/**
	 * The Jena Property for outbox 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#outbox)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property outboxProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#outbox");


	/**
	 * The Jena Property for about 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#about)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property aboutProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#about");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#link");


	/**
	 * The Jena Property for checkins 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#checkins)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property checkinsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#checkins");


	/**
	 * The Jena Property for likes 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#likes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property likesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#likes");


	/**
	 * The Jena Property for education 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#education)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property educationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#education");


	/**
	 * The Jena Property for notes 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#notes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property notesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#notes");


	/**
	 * The Jena Property for firstName 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#firstName)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property firstNameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#firstName");


	/**
	 * The Jena Property for significantOther 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#significantOther)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property significantOtherProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#significantOther");


	/**
	 * The Jena Property for religion 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#religion)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property religionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#religion");


	/**
	 * The Jena Property for meetingFor 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#meetingFor)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property meetingForProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#meetingFor");


	/**
	 * The Jena Property for albums 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#albums)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property albumsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#albums");


	/**
	 * The Jena Property for links 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#links)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linksProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#links");


	/**
	 * The Jena Property for website 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#website)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property websiteProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#website");


	/**
	 * The Jena Property for location 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#location)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#location");


	/**
	 * The Jena Property for verified 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#verified)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property verifiedProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#verified");


	/**
	 * The Jena Property for hometown 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#hometown)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hometownProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#hometown");


	/**
	 * The Jena Property for books 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#books)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property booksProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#books");


	/**
	 * The Jena Property for posts 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#posts)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property postsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#posts");


	/**
	 * The Jena Property for locale 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#locale)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property localeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#locale");


	/**
	 * The Jena Property for interests 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#interests)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property interestsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#interests");


	/**
	 * The Jena Property for photos 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#photos)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property photosProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#photos");


	/**
	 * The Jena Property for political 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#political)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property politicalProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#political");


	/**
	 * The Jena Property for email 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#email)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property emailProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#email");


	/**
	 * The Jena Property for timezone 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#timezone)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property timezoneProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#timezone");


	/**
	 * The Jena Property for lastName 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#lastName)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property lastNameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#lastName");


	/**
	 * The Jena Property for television 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#television)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property televisionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#television");


	/**
	 * The Jena Property for groups 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#groups)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property groupsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#groups");


	/**
	 * The Jena Property for work 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#work)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property workProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#work");


	/**
	 * The Jena Property for updatedTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#updatedTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#updatedTime");


	/**
	 * The Jena Property for videos 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#videos)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property videosProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#videos");


	/**
	 * The Jena Property for statuses 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#statuses)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property statusesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#statuses");


	/**
	 * The Jena Property for inbox 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#inbox)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property inboxProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#inbox");


	/**
	 * The Jena Property for accounts 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#accounts)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property accountsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#accounts");


	/**
	 * The Jena Property for music 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#music)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property musicProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#music");


	/**
	 * The Jena Property for friends 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#friends)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property friendsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#friends");


	/**
	 * The Jena Property for birthday 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#birthday)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property birthdayProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#birthday");


	/**
	 * The Jena Property for movies 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#movies)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property moviesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#movies");


	/**
	 * The Jena Property for activities 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#activities)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property activitiesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#activities");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#id");


	/**
	 * The Jena Property for interestedIn 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#interestedIn)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property interestedInProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#interestedIn");


	/**
	 * The Jena Property for feed 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#feed)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property feedProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#feed");


	/**
	 * The Jena Property for gender 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#gender)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property genderProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#gender");


	/**
	 * The Jena Property for bio 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#bio)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property bioProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#bio");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#name)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#name");


	/**
	 * The Jena Property for updates 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#updates)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatesProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#updates");


	/**
	 * The Jena Property for attribution 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#attribution)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property attributionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#attribution");


	/**
	 * The Jena Property for relationshipStatus 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#relationshipStatus)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property relationshipStatusProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#relationshipStatus");


	/**
	 * The Jena Property for events 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/User.owl#events)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property eventsProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/User.owl#events");




	/**
	 * Iterates through the 'quotes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#quotesProperty
	 */
	public java.util.Iterator getQuotes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'quotes' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#quotesProperty
	 */
	public void addQuotes(java.lang.String quotes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'quotes' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#quotesProperty
	 */
	public void removeQuotes(java.lang.String quotes) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'outbox' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#outboxProperty
	 */
	public java.util.Iterator getOutbox() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'outbox' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#outboxProperty
	 */
	public void addOutbox(com.ibm.adtech.jastor.Thing outbox) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'outbox' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#outboxProperty
	 */
	public com.ibm.adtech.jastor.Thing addOutbox() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#outboxProperty
	 */
	public com.ibm.adtech.jastor.Thing addOutbox(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'outbox' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#outboxProperty
	 */
	public void removeOutbox(com.ibm.adtech.jastor.Thing outbox) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'about' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#aboutProperty
	 */
	public java.util.Iterator getAbout() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'about' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#aboutProperty
	 */
	public void addAbout(java.lang.String about) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'about' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#aboutProperty
	 */
	public void removeAbout(java.lang.String about) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'link' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#linkProperty
	 */
	public java.util.Iterator getLink() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'link' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#linkProperty
	 */
	public void addLink(java.lang.String link) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'link' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#linkProperty
	 */
	public void removeLink(java.lang.String link) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'checkins' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#checkinsProperty
	 */
	public java.util.Iterator getCheckins() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'checkins' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#checkinsProperty
	 */
	public void addCheckins(com.ibm.adtech.jastor.Thing checkins) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'checkins' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#checkinsProperty
	 */
	public com.ibm.adtech.jastor.Thing addCheckins() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#checkinsProperty
	 */
	public com.ibm.adtech.jastor.Thing addCheckins(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'checkins' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#checkinsProperty
	 */
	public void removeCheckins(com.ibm.adtech.jastor.Thing checkins) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'likes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#likesProperty
	 */
	public java.util.Iterator getLikes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'likes' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#likesProperty
	 */
	public void addLikes(com.ibm.adtech.jastor.Thing likes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'likes' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#likesProperty
	 */
	public com.ibm.adtech.jastor.Thing addLikes() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#likesProperty
	 */
	public com.ibm.adtech.jastor.Thing addLikes(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'likes' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#likesProperty
	 */
	public void removeLikes(com.ibm.adtech.jastor.Thing likes) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'education' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#educationProperty
	 */
	public java.util.Iterator getEducation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'education' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#educationProperty
	 */
	public void addEducation(com.ibm.adtech.jastor.Thing education) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'education' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#educationProperty
	 */
	public com.ibm.adtech.jastor.Thing addEducation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#educationProperty
	 */
	public com.ibm.adtech.jastor.Thing addEducation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'education' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#educationProperty
	 */
	public void removeEducation(com.ibm.adtech.jastor.Thing education) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'notes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#notesProperty
	 */
	public java.util.Iterator getNotes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'notes' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#notesProperty
	 */
	public void addNotes(com.ibm.adtech.jastor.Thing notes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'notes' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#notesProperty
	 */
	public com.ibm.adtech.jastor.Thing addNotes() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#notesProperty
	 */
	public com.ibm.adtech.jastor.Thing addNotes(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'notes' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#notesProperty
	 */
	public void removeNotes(com.ibm.adtech.jastor.Thing notes) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'firstName' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#firstNameProperty
	 */
	public java.util.Iterator getFirstName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'firstName' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#firstNameProperty
	 */
	public void addFirstName(java.lang.String firstName) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'firstName' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#firstNameProperty
	 */
	public void removeFirstName(java.lang.String firstName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'significantOther' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#significantOtherProperty
	 */
	public java.util.Iterator getSignificantOther() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'significantOther' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#significantOtherProperty
	 */
	public void addSignificantOther(java.lang.String significantOther) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'significantOther' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#significantOtherProperty
	 */
	public void removeSignificantOther(java.lang.String significantOther) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'religion' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#religionProperty
	 */
	public java.util.Iterator getReligion() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'religion' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#religionProperty
	 */
	public void addReligion(java.lang.String religion) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'religion' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#religionProperty
	 */
	public void removeReligion(java.lang.String religion) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'meetingFor' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#meetingForProperty
	 */
	public java.util.Iterator getMeetingFor() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'meetingFor' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#meetingForProperty
	 */
	public void addMeetingFor(java.lang.String meetingFor) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'meetingFor' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#meetingForProperty
	 */
	public void removeMeetingFor(java.lang.String meetingFor) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'albums' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#albumsProperty
	 */
	public java.util.Iterator getAlbums() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'albums' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#albumsProperty
	 */
	public void addAlbums(com.ibm.adtech.jastor.Thing albums) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'albums' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#albumsProperty
	 */
	public com.ibm.adtech.jastor.Thing addAlbums() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#albumsProperty
	 */
	public com.ibm.adtech.jastor.Thing addAlbums(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'albums' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#albumsProperty
	 */
	public void removeAlbums(com.ibm.adtech.jastor.Thing albums) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'links' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#linksProperty
	 */
	public java.util.Iterator getLinks() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'links' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#linksProperty
	 */
	public void addLinks(com.ibm.adtech.jastor.Thing links) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'links' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#linksProperty
	 */
	public com.ibm.adtech.jastor.Thing addLinks() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#linksProperty
	 */
	public com.ibm.adtech.jastor.Thing addLinks(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'links' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#linksProperty
	 */
	public void removeLinks(com.ibm.adtech.jastor.Thing links) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'website' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#websiteProperty
	 */
	public java.util.Iterator getWebsite() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'website' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#websiteProperty
	 */
	public void addWebsite(java.lang.String website) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'website' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#websiteProperty
	 */
	public void removeWebsite(java.lang.String website) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'location' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#locationProperty
	 */
	public java.util.Iterator getLocation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'location' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#locationProperty
	 */
	public void addLocation(com.ibm.adtech.jastor.Thing location) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'location' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#locationProperty
	 */
	public com.ibm.adtech.jastor.Thing addLocation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#locationProperty
	 */
	public com.ibm.adtech.jastor.Thing addLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'location' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#locationProperty
	 */
	public void removeLocation(com.ibm.adtech.jastor.Thing location) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'verified' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Boolean}
	 * @see			#verifiedProperty
	 */
	public java.util.Iterator getVerified() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'verified' property value
	 * @param		{@link java.lang.Boolean}, the value to add
	 * @see			#verifiedProperty
	 */
	public void addVerified(java.lang.Boolean verified) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'verified' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Boolean}, the value to remove
	 * @see			#verifiedProperty
	 */
	public void removeVerified(java.lang.Boolean verified) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hometown' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#hometownProperty
	 */
	public java.util.Iterator getHometown() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hometown' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#hometownProperty
	 */
	public void addHometown(com.ibm.adtech.jastor.Thing hometown) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hometown' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#hometownProperty
	 */
	public com.ibm.adtech.jastor.Thing addHometown() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hometownProperty
	 */
	public com.ibm.adtech.jastor.Thing addHometown(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hometown' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#hometownProperty
	 */
	public void removeHometown(com.ibm.adtech.jastor.Thing hometown) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'books' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#booksProperty
	 */
	public java.util.Iterator getBooks() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'books' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#booksProperty
	 */
	public void addBooks(com.ibm.adtech.jastor.Thing books) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'books' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#booksProperty
	 */
	public com.ibm.adtech.jastor.Thing addBooks() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#booksProperty
	 */
	public com.ibm.adtech.jastor.Thing addBooks(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'books' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#booksProperty
	 */
	public void removeBooks(com.ibm.adtech.jastor.Thing books) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'posts' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#postsProperty
	 */
	public java.util.Iterator getPosts() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'posts' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#postsProperty
	 */
	public void addPosts(com.ibm.adtech.jastor.Thing posts) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'posts' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#postsProperty
	 */
	public com.ibm.adtech.jastor.Thing addPosts() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#postsProperty
	 */
	public com.ibm.adtech.jastor.Thing addPosts(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'posts' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#postsProperty
	 */
	public void removePosts(com.ibm.adtech.jastor.Thing posts) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'locale' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#localeProperty
	 */
	public java.util.Iterator getLocale() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'locale' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#localeProperty
	 */
	public void addLocale(java.lang.String locale) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'locale' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#localeProperty
	 */
	public void removeLocale(java.lang.String locale) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'interests' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#interestsProperty
	 */
	public java.util.Iterator getInterests() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'interests' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#interestsProperty
	 */
	public void addInterests(com.ibm.adtech.jastor.Thing interests) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'interests' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#interestsProperty
	 */
	public com.ibm.adtech.jastor.Thing addInterests() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#interestsProperty
	 */
	public com.ibm.adtech.jastor.Thing addInterests(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'interests' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#interestsProperty
	 */
	public void removeInterests(com.ibm.adtech.jastor.Thing interests) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'photos' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#photosProperty
	 */
	public java.util.Iterator getPhotos() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'photos' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#photosProperty
	 */
	public void addPhotos(com.ibm.adtech.jastor.Thing photos) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'photos' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#photosProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhotos() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#photosProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhotos(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'photos' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#photosProperty
	 */
	public void removePhotos(com.ibm.adtech.jastor.Thing photos) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'political' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#politicalProperty
	 */
	public java.util.Iterator getPolitical() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'political' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#politicalProperty
	 */
	public void addPolitical(java.lang.String political) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'political' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#politicalProperty
	 */
	public void removePolitical(java.lang.String political) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'email' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#emailProperty
	 */
	public java.util.Iterator getEmail() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'email' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#emailProperty
	 */
	public void addEmail(java.lang.String email) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'email' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#emailProperty
	 */
	public void removeEmail(java.lang.String email) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'timezone' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Double}
	 * @see			#timezoneProperty
	 */
	public java.util.Iterator getTimezone() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'timezone' property value
	 * @param		{@link java.lang.Double}, the value to add
	 * @see			#timezoneProperty
	 */
	public void addTimezone(java.lang.Double timezone) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'timezone' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Double}, the value to remove
	 * @see			#timezoneProperty
	 */
	public void removeTimezone(java.lang.Double timezone) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'lastName' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#lastNameProperty
	 */
	public java.util.Iterator getLastName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'lastName' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#lastNameProperty
	 */
	public void addLastName(java.lang.String lastName) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'lastName' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#lastNameProperty
	 */
	public void removeLastName(java.lang.String lastName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'television' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#televisionProperty
	 */
	public java.util.Iterator getTelevision() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'television' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#televisionProperty
	 */
	public void addTelevision(com.ibm.adtech.jastor.Thing television) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'television' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#televisionProperty
	 */
	public com.ibm.adtech.jastor.Thing addTelevision() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#televisionProperty
	 */
	public com.ibm.adtech.jastor.Thing addTelevision(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'television' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#televisionProperty
	 */
	public void removeTelevision(com.ibm.adtech.jastor.Thing television) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'groups' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#groupsProperty
	 */
	public java.util.Iterator getGroups() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'groups' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#groupsProperty
	 */
	public void addGroups(com.ibm.adtech.jastor.Thing groups) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'groups' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#groupsProperty
	 */
	public com.ibm.adtech.jastor.Thing addGroups() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#groupsProperty
	 */
	public com.ibm.adtech.jastor.Thing addGroups(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'groups' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#groupsProperty
	 */
	public void removeGroups(com.ibm.adtech.jastor.Thing groups) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'work' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#workProperty
	 */
	public java.util.Iterator getWork() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'work' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#workProperty
	 */
	public void addWork(com.ibm.adtech.jastor.Thing work) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'work' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#workProperty
	 */
	public com.ibm.adtech.jastor.Thing addWork() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#workProperty
	 */
	public com.ibm.adtech.jastor.Thing addWork(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'work' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#workProperty
	 */
	public void removeWork(com.ibm.adtech.jastor.Thing work) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'updatedTime' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#updatedTimeProperty
	 */
	public java.util.Iterator getUpdatedTime() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'updatedTime' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to add
	 * @see			#updatedTimeProperty
	 */
	public void addUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'updatedTime' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}, the value to remove
	 * @see			#updatedTimeProperty
	 */
	public void removeUpdatedTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime updatedTime) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'videos' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#videosProperty
	 */
	public java.util.Iterator getVideos() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'videos' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#videosProperty
	 */
	public void addVideos(com.ibm.adtech.jastor.Thing videos) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'videos' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#videosProperty
	 */
	public com.ibm.adtech.jastor.Thing addVideos() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#videosProperty
	 */
	public com.ibm.adtech.jastor.Thing addVideos(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'videos' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#videosProperty
	 */
	public void removeVideos(com.ibm.adtech.jastor.Thing videos) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'statuses' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#statusesProperty
	 */
	public java.util.Iterator getStatuses() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'statuses' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#statusesProperty
	 */
	public void addStatuses(com.ibm.adtech.jastor.Thing statuses) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'statuses' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#statusesProperty
	 */
	public com.ibm.adtech.jastor.Thing addStatuses() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#statusesProperty
	 */
	public com.ibm.adtech.jastor.Thing addStatuses(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'statuses' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#statusesProperty
	 */
	public void removeStatuses(com.ibm.adtech.jastor.Thing statuses) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'inbox' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#inboxProperty
	 */
	public java.util.Iterator getInbox() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'inbox' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#inboxProperty
	 */
	public void addInbox(com.ibm.adtech.jastor.Thing inbox) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'inbox' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#inboxProperty
	 */
	public com.ibm.adtech.jastor.Thing addInbox() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#inboxProperty
	 */
	public com.ibm.adtech.jastor.Thing addInbox(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'inbox' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#inboxProperty
	 */
	public void removeInbox(com.ibm.adtech.jastor.Thing inbox) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'accounts' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#accountsProperty
	 */
	public java.util.Iterator getAccounts() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'accounts' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#accountsProperty
	 */
	public void addAccounts(com.ibm.adtech.jastor.Thing accounts) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'accounts' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#accountsProperty
	 */
	public com.ibm.adtech.jastor.Thing addAccounts() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#accountsProperty
	 */
	public com.ibm.adtech.jastor.Thing addAccounts(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'accounts' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#accountsProperty
	 */
	public void removeAccounts(com.ibm.adtech.jastor.Thing accounts) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'music' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#musicProperty
	 */
	public java.util.Iterator getMusic() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'music' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#musicProperty
	 */
	public void addMusic(com.ibm.adtech.jastor.Thing music) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'music' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#musicProperty
	 */
	public com.ibm.adtech.jastor.Thing addMusic() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#musicProperty
	 */
	public com.ibm.adtech.jastor.Thing addMusic(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'music' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#musicProperty
	 */
	public void removeMusic(com.ibm.adtech.jastor.Thing music) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'friends' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#friendsProperty
	 */
	public java.util.Iterator getFriends() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'friends' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#friendsProperty
	 */
	public void addFriends(com.ibm.adtech.jastor.Thing friends) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'friends' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#friendsProperty
	 */
	public com.ibm.adtech.jastor.Thing addFriends() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#friendsProperty
	 */
	public com.ibm.adtech.jastor.Thing addFriends(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'friends' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#friendsProperty
	 */
	public void removeFriends(com.ibm.adtech.jastor.Thing friends) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'birthday' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#birthdayProperty
	 */
	public java.util.Iterator getBirthday() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'birthday' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#birthdayProperty
	 */
	public void addBirthday(java.lang.String birthday) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'birthday' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#birthdayProperty
	 */
	public void removeBirthday(java.lang.String birthday) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'movies' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#moviesProperty
	 */
	public java.util.Iterator getMovies() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'movies' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#moviesProperty
	 */
	public void addMovies(com.ibm.adtech.jastor.Thing movies) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'movies' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#moviesProperty
	 */
	public com.ibm.adtech.jastor.Thing addMovies() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#moviesProperty
	 */
	public com.ibm.adtech.jastor.Thing addMovies(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'movies' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#moviesProperty
	 */
	public void removeMovies(com.ibm.adtech.jastor.Thing movies) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'activities' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#activitiesProperty
	 */
	public java.util.Iterator getActivities() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'activities' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#activitiesProperty
	 */
	public void addActivities(com.ibm.adtech.jastor.Thing activities) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'activities' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#activitiesProperty
	 */
	public com.ibm.adtech.jastor.Thing addActivities() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#activitiesProperty
	 */
	public com.ibm.adtech.jastor.Thing addActivities(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'activities' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#activitiesProperty
	 */
	public void removeActivities(com.ibm.adtech.jastor.Thing activities) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'id' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#idProperty
	 */
	public java.util.Iterator getId() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'id' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#idProperty
	 */
	public void addId(java.lang.String id) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'id' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#idProperty
	 */
	public void removeId(java.lang.String id) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'interestedIn' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#interestedInProperty
	 */
	public java.util.Iterator getInterestedIn() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'interestedIn' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#interestedInProperty
	 */
	public void addInterestedIn(java.lang.String interestedIn) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'interestedIn' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#interestedInProperty
	 */
	public void removeInterestedIn(java.lang.String interestedIn) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'feed' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#feedProperty
	 */
	public java.util.Iterator getFeed() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'feed' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#feedProperty
	 */
	public void addFeed(com.ibm.adtech.jastor.Thing feed) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'feed' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#feedProperty
	 */
	public com.ibm.adtech.jastor.Thing addFeed() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#feedProperty
	 */
	public com.ibm.adtech.jastor.Thing addFeed(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'feed' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#feedProperty
	 */
	public void removeFeed(com.ibm.adtech.jastor.Thing feed) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'gender' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#genderProperty
	 */
	public java.util.Iterator getGender() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'gender' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#genderProperty
	 */
	public void addGender(java.lang.String gender) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'gender' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#genderProperty
	 */
	public void removeGender(java.lang.String gender) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'bio' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#bioProperty
	 */
	public java.util.Iterator getBio() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'bio' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#bioProperty
	 */
	public void addBio(java.lang.String bio) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'bio' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#bioProperty
	 */
	public void removeBio(java.lang.String bio) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'name' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#nameProperty
	 */
	public java.util.Iterator getName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'name' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#nameProperty
	 */
	public void addName(java.lang.String name) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'name' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#nameProperty
	 */
	public void removeName(java.lang.String name) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'updates' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#updatesProperty
	 */
	public java.util.Iterator getUpdates() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'updates' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#updatesProperty
	 */
	public void addUpdates(com.ibm.adtech.jastor.Thing updates) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'updates' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#updatesProperty
	 */
	public com.ibm.adtech.jastor.Thing addUpdates() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#updatesProperty
	 */
	public com.ibm.adtech.jastor.Thing addUpdates(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'updates' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#updatesProperty
	 */
	public void removeUpdates(com.ibm.adtech.jastor.Thing updates) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'attribution' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#attributionProperty
	 */
	public java.util.Iterator getAttribution() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'attribution' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#attributionProperty
	 */
	public void addAttribution(java.lang.String attribution) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'attribution' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#attributionProperty
	 */
	public void removeAttribution(java.lang.String attribution) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'relationshipStatus' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#relationshipStatusProperty
	 */
	public java.util.Iterator getRelationshipStatus() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'relationshipStatus' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#relationshipStatusProperty
	 */
	public void addRelationshipStatus(java.lang.String relationshipStatus) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'relationshipStatus' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#relationshipStatusProperty
	 */
	public void removeRelationshipStatus(java.lang.String relationshipStatus) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'events' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#eventsProperty
	 */
	public java.util.Iterator getEvents() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'events' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#eventsProperty
	 */
	public void addEvents(com.ibm.adtech.jastor.Thing events) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'events' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#eventsProperty
	 */
	public com.ibm.adtech.jastor.Thing addEvents() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#eventsProperty
	 */
	public com.ibm.adtech.jastor.Thing addEvents(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'events' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#eventsProperty
	 */
	public void removeEvents(com.ibm.adtech.jastor.Thing events) throws com.ibm.adtech.jastor.JastorException;
		
}