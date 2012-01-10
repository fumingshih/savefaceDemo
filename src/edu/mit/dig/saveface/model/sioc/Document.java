

package edu.mit.dig.saveface.model.sioc;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Document ontology class<br>
 * Use the edu.mit.dig.saveface.model.sioc.Factory to create instances of this interface.
 * <p>(URI: http://xmlns.com/foaf/0.1/Document)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Document extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://xmlns.com/foaf/0.1/Document");
	

	/**
	 * The Jena Property for feed 
	 * <p>(URI: http://rdfs.org/sioc/ns#feed)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : feed@en <br>
	 * 	comment : A feed (e.g. RSS, Atom, etc.) pertaining to this resource (e.g. for a Forum, Site, UserAccount, etc.).@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property feedProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#feed");


	/**
	 * The Jena Property for part__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#part_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : part of@en <br>
	 * 	comment : A resource that the subject is a part of.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 * @version This property is deprecated. Use dcterms:isPartOf from the Dublin Core ontology instead.
	 */
	public static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#part_of");


	/**
	 * The Jena Property for account 
	 * <p>(URI: http://xmlns.com/foaf/0.1/account)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property accountProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/account");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://rdfs.org/sioc/ns#link)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : link@en <br>
	 * 	comment : A URI of a document which contains this SIOC object.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#link");


	/**
	 * The Jena Property for references 
	 * <p>(URI: http://purl.org/dc/terms/references)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property referencesProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/references");


	/**
	 * The Jena Property for date 
	 * <p>(URI: http://purl.org/dc/terms/date)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property dateProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/date");


	/**
	 * The Jena Property for depiction 
	 * <p>(URI: http://xmlns.com/foaf/0.1/depiction)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property depictionProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/depiction");


	/**
	 * The Jena Property for has__function 
	 * <p>(URI: http://rdfs.org/sioc/ns#has_function)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has function@en <br>
	 * 	comment : A Role that this UserAccount has.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__functionProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_function");


	/**
	 * The Jena Property for last__reply__date 
	 * <p>(URI: http://rdfs.org/sioc/ns#last_reply_date)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : last reply date@en <br>
	 * 	comment : The date and time of the last reply Post or Comment, which could be associated with a starter Item or Post or with a Thread, and expressed in ISO 8601 format.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property last__reply__dateProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#last_reply_date");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://rdfs.org/sioc/ns#name)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : name@en <br>
	 * 	comment : The name of a SIOC concept instance, e.g. a username for a UserAccount, group name for a Usergroup, etc.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#name");


	/**
	 * The Jena Property for has__owner 
	 * <p>(URI: http://rdfs.org/sioc/ns#has_owner)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has owner@en <br>
	 * 	comment : A UserAccount that this resource is owned by.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__ownerProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_owner");


	/**
	 * The Jena Property for num__replies 
	 * <p>(URI: http://rdfs.org/sioc/ns#num_replies)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : num replies@en <br>
	 * 	comment : The number of replies that this Item, Thread, Post, etc. has. Useful for when the reply structure is absent.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property num__repliesProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#num_replies");


	/**
	 * The Jena Property for subject 
	 * <p>(URI: http://purl.org/dc/terms/subject)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property subjectProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/subject");


	/**
	 * The Jena Property for num__views 
	 * <p>(URI: http://rdfs.org/sioc/ns#num_views)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : num views@en <br>
	 * 	comment : The number of times this Item, Thread, UserAccount profile, etc. has been viewed.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property num__viewsProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#num_views");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://rdfs.org/sioc/ns#id)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : id@en <br>
	 * 	comment : An identifier of a SIOC concept instance. For example, a user ID. Must be unique for instances of each type of SIOC concept within the same site.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#id");


	/**
	 * The Jena Property for group__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#group_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : group of@en <br>
	 * <br>  
	 * @version This property has been renamed. Use sioc:usergroup_of instead.
	 */
	public static com.hp.hpl.jena.rdf.model.Property group__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#group_of");


	/**
	 * The Jena Property for num__authors 
	 * <p>(URI: http://rdfs.org/sioc/ns#num_authors)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : num authors@en <br>
	 * 	comment : The number of unique authors (UserAccounts and unregistered posters) who have contributed to this Item, Thread, Post, etc.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property num__authorsProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#num_authors");


	/**
	 * The Jena Property for has__creator 
	 * <p>(URI: http://rdfs.org/sioc/ns#has_creator)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has creator@en <br>
	 * 	comment : This is the UserAccount that made this resource.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__creatorProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_creator");


	/**
	 * The Jena Property for note 
	 * <p>(URI: http://rdfs.org/sioc/ns#note)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : note@en <br>
	 * 	comment : A note associated with this resource, for example, if it has been edited by a UserAccount.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property noteProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#note");


	/**
	 * The Jena Property for related__to 
	 * <p>(URI: http://rdfs.org/sioc/ns#related_to)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : related to@en <br>
	 * 	comment : Related Posts for this Post, perhaps determined implicitly from topics or references.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property related__toProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#related_to");


	/**
	 * The Jena Property for links__to 
	 * <p>(URI: http://rdfs.org/sioc/ns#links_to)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : links to@en <br>
	 * 	comment : Links extracted from hyperlinks within a SIOC concept, e.g. Post or Site.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property links__toProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#links_to");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://purl.org/dc/terms/description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/description");


	/**
	 * The Jena Property for has__space 
	 * <p>(URI: http://rdfs.org/sioc/ns#has_space)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has space@en <br>
	 * 	comment : A data Space which this resource is a part of.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__spaceProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_space");


	/**
	 * The Jena Property for last__activity__date 
	 * <p>(URI: http://rdfs.org/sioc/ns#last_activity_date)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : last activity date@en <br>
	 * 	comment : The date and time of the last activity associated with a SIOC concept instance, and expressed in ISO 8601 format. This could be due to a reply Post or Comment, a modification to an Item, etc.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property last__activity__dateProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#last_activity_date");


	/**
	 * The Jena Property for topic 
	 * <p>(URI: http://rdfs.org/sioc/ns#topic)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : topic@en <br>
	 * 	comment : A topic of interest, linking to the appropriate URI, e.g. in the Open Directory Project or of a SKOS category.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property topicProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#topic");


	/**
	 * The Jena Property for has__part 
	 * <p>(URI: http://rdfs.org/sioc/ns#has_part)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has part@en <br>
	 * 	comment : An resource that is a part of this subject.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 * @version This property is deprecated. Use dcterms:hasPart from the Dublin Core ontology instead.
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__partProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_part");


	/**
	 * The Jena Property for scope__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#scope_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : scope of@en <br>
	 * 	comment : A Role that has a scope of this resource.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property scope__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#scope_of");


	/**
	 * The Jena Property for title 
	 * <p>(URI: http://purl.org/dc/terms/title)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/title");


	/**
	 * The Jena Property for has__group 
	 * <p>(URI: http://rdfs.org/sioc/ns#has_group)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has group@en <br>
	 * <br>  
	 * @version This property has been renamed. Use sioc:has_usergroup instead.
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__groupProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#has_group");




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
	 * Get an Iterator the 'part__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#part__ofProperty
	 */
	public java.util.Iterator getPart__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'part__of' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#part__ofProperty
	 */
	public void addPart__of(com.ibm.adtech.jastor.Thing part__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'part__of' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#part__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addPart__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#part__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addPart__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'part__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#part__ofProperty
	 */
	public void removePart__of(com.ibm.adtech.jastor.Thing part__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'account' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#accountProperty
	 */
	public java.util.Iterator getAccount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'account' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#accountProperty
	 */
	public void addAccount(com.ibm.adtech.jastor.Thing account) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'account' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#accountProperty
	 */
	public com.ibm.adtech.jastor.Thing addAccount() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#accountProperty
	 */
	public com.ibm.adtech.jastor.Thing addAccount(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'account' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#accountProperty
	 */
	public void removeAccount(com.ibm.adtech.jastor.Thing account) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'link' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#linkProperty
	 */
	public java.util.Iterator getLink() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'link' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#linkProperty
	 */
	public void addLink(com.ibm.adtech.jastor.Thing link) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'link' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#linkProperty
	 */
	public com.ibm.adtech.jastor.Thing addLink() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#linkProperty
	 */
	public com.ibm.adtech.jastor.Thing addLink(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'link' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#linkProperty
	 */
	public void removeLink(com.ibm.adtech.jastor.Thing link) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'references' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#referencesProperty
	 */
	public java.util.Iterator getReferences() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'references' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#referencesProperty
	 */
	public void addReferences(com.ibm.adtech.jastor.Thing references) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'references' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#referencesProperty
	 */
	public com.ibm.adtech.jastor.Thing addReferences() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#referencesProperty
	 */
	public com.ibm.adtech.jastor.Thing addReferences(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'references' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#referencesProperty
	 */
	public void removeReferences(com.ibm.adtech.jastor.Thing references) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'date' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#dateProperty
	 */
	public java.util.Iterator getDate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'date' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#dateProperty
	 */
	public void addDate(com.hp.hpl.jena.rdf.model.Literal date) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'date' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#dateProperty
	 */
	public void removeDate(com.hp.hpl.jena.rdf.model.Literal date) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'depiction' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#depictionProperty
	 */
	public java.util.Iterator getDepiction() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'depiction' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#depictionProperty
	 */
	public void addDepiction(com.ibm.adtech.jastor.Thing depiction) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'depiction' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#depictionProperty
	 */
	public com.ibm.adtech.jastor.Thing addDepiction() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#depictionProperty
	 */
	public com.ibm.adtech.jastor.Thing addDepiction(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'depiction' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#depictionProperty
	 */
	public void removeDepiction(com.ibm.adtech.jastor.Thing depiction) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__function' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Role}
	 * @see			#has__functionProperty
	 */
	public java.util.Iterator getHas__function() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__function' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Role} to add
	 * @see			#has__functionProperty
	 */
	public void addHas__function(edu.mit.dig.saveface.model.sioc.Role has__function) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__function' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Role} created
	 * @see			#has__functionProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Role addHas__function() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Role.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__functionProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Role addHas__function(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__function' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Role} to remove
	 * @see			#has__functionProperty
	 */
	public void removeHas__function(edu.mit.dig.saveface.model.sioc.Role has__function) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'last__reply__date' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#last__reply__dateProperty
	 */
	public java.util.Iterator getLast__reply__date() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'last__reply__date' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#last__reply__dateProperty
	 */
	public void addLast__reply__date(com.hp.hpl.jena.rdf.model.Literal last__reply__date) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'last__reply__date' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#last__reply__dateProperty
	 */
	public void removeLast__reply__date(com.hp.hpl.jena.rdf.model.Literal last__reply__date) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'name' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#nameProperty
	 */
	public java.util.Iterator getName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'name' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#nameProperty
	 */
	public void addName(com.hp.hpl.jena.rdf.model.Literal name) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'name' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#nameProperty
	 */
	public void removeName(com.hp.hpl.jena.rdf.model.Literal name) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'has__owner' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.UserAccount}
	 * @see			#has__ownerProperty
	 */
	public java.util.Iterator getHas__owner() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__owner' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.UserAccount} to add
	 * @see			#has__ownerProperty
	 */
	public void addHas__owner(edu.mit.dig.saveface.model.sioc.UserAccount has__owner) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__owner' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.UserAccount} created
	 * @see			#has__ownerProperty
	 */
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__owner() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#UserAccount.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__ownerProperty
	 */
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__owner(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__owner' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.UserAccount} to remove
	 * @see			#has__ownerProperty
	 */
	public void removeHas__owner(edu.mit.dig.saveface.model.sioc.UserAccount has__owner) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'num__replies' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#num__repliesProperty
	 */
	public java.util.Iterator getNum__replies() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'num__replies' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#num__repliesProperty
	 */
	public void addNum__replies(java.lang.String num__replies) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'num__replies' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#num__repliesProperty
	 */
	public void removeNum__replies(java.lang.String num__replies) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'subject' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#subjectProperty
	 */
	public java.util.Iterator getSubject() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'subject' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#subjectProperty
	 */
	public void addSubject(com.ibm.adtech.jastor.Thing subject) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'subject' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#subjectProperty
	 */
	public com.ibm.adtech.jastor.Thing addSubject() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#subjectProperty
	 */
	public com.ibm.adtech.jastor.Thing addSubject(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'subject' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#subjectProperty
	 */
	public void removeSubject(com.ibm.adtech.jastor.Thing subject) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'num__views' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#num__viewsProperty
	 */
	public java.util.Iterator getNum__views() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'num__views' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#num__viewsProperty
	 */
	public void addNum__views(java.lang.String num__views) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'num__views' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#num__viewsProperty
	 */
	public void removeNum__views(java.lang.String num__views) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'id' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#idProperty
	 */
	public java.util.Iterator getId() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'id' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#idProperty
	 */
	public void addId(com.hp.hpl.jena.rdf.model.Literal id) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'id' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#idProperty
	 */
	public void removeId(com.hp.hpl.jena.rdf.model.Literal id) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'group__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#group__ofProperty
	 */
	public java.util.Iterator getGroup__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'group__of' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#group__ofProperty
	 */
	public void addGroup__of(com.ibm.adtech.jastor.Thing group__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'group__of' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#group__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addGroup__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#group__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addGroup__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'group__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#group__ofProperty
	 */
	public void removeGroup__of(com.ibm.adtech.jastor.Thing group__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'num__authors' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#num__authorsProperty
	 */
	public java.util.Iterator getNum__authors() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'num__authors' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#num__authorsProperty
	 */
	public void addNum__authors(java.lang.String num__authors) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'num__authors' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#num__authorsProperty
	 */
	public void removeNum__authors(java.lang.String num__authors) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'has__creator' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.UserAccount}
	 * @see			#has__creatorProperty
	 */
	public java.util.Iterator getHas__creator() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__creator' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.UserAccount} to add
	 * @see			#has__creatorProperty
	 */
	public void addHas__creator(edu.mit.dig.saveface.model.sioc.UserAccount has__creator) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__creator' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.UserAccount} created
	 * @see			#has__creatorProperty
	 */
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__creator() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#UserAccount.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__creatorProperty
	 */
	public edu.mit.dig.saveface.model.sioc.UserAccount addHas__creator(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__creator' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.UserAccount} to remove
	 * @see			#has__creatorProperty
	 */
	public void removeHas__creator(edu.mit.dig.saveface.model.sioc.UserAccount has__creator) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'note' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#noteProperty
	 */
	public java.util.Iterator getNote() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'note' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#noteProperty
	 */
	public void addNote(com.hp.hpl.jena.rdf.model.Literal note) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'note' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#noteProperty
	 */
	public void removeNote(com.hp.hpl.jena.rdf.model.Literal note) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'related__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#related__toProperty
	 */
	public java.util.Iterator getRelated__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'related__to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#related__toProperty
	 */
	public void addRelated__to(com.ibm.adtech.jastor.Thing related__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'related__to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#related__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addRelated__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#related__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addRelated__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'related__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#related__toProperty
	 */
	public void removeRelated__to(com.ibm.adtech.jastor.Thing related__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'links__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#links__toProperty
	 */
	public java.util.Iterator getLinks__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'links__to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#links__toProperty
	 */
	public void addLinks__to(com.ibm.adtech.jastor.Thing links__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'links__to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#links__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addLinks__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#links__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addLinks__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'links__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#links__toProperty
	 */
	public void removeLinks__to(com.ibm.adtech.jastor.Thing links__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'description' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#descriptionProperty
	 */
	public java.util.Iterator getDescription() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'description' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#descriptionProperty
	 */
	public void addDescription(com.hp.hpl.jena.rdf.model.Literal description) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'description' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#descriptionProperty
	 */
	public void removeDescription(com.hp.hpl.jena.rdf.model.Literal description) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'has__space' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Space}
	 * @see			#has__spaceProperty
	 */
	public java.util.Iterator getHas__space() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__space' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Space} to add
	 * @see			#has__spaceProperty
	 */
	public void addHas__space(edu.mit.dig.saveface.model.sioc.Space has__space) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__space' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Space} created
	 * @see			#has__spaceProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Space addHas__space() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Space.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__spaceProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Space addHas__space(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__space' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Space} to remove
	 * @see			#has__spaceProperty
	 */
	public void removeHas__space(edu.mit.dig.saveface.model.sioc.Space has__space) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'last__activity__date' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#last__activity__dateProperty
	 */
	public java.util.Iterator getLast__activity__date() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'last__activity__date' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#last__activity__dateProperty
	 */
	public void addLast__activity__date(com.hp.hpl.jena.rdf.model.Literal last__activity__date) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'last__activity__date' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#last__activity__dateProperty
	 */
	public void removeLast__activity__date(com.hp.hpl.jena.rdf.model.Literal last__activity__date) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'topic' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#topicProperty
	 */
	public java.util.Iterator getTopic() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'topic' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#topicProperty
	 */
	public void addTopic(com.ibm.adtech.jastor.Thing topic) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'topic' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#topicProperty
	 */
	public com.ibm.adtech.jastor.Thing addTopic() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#topicProperty
	 */
	public com.ibm.adtech.jastor.Thing addTopic(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'topic' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#topicProperty
	 */
	public void removeTopic(com.ibm.adtech.jastor.Thing topic) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__part' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#has__partProperty
	 */
	public java.util.Iterator getHas__part() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__part' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#has__partProperty
	 */
	public void addHas__part(com.ibm.adtech.jastor.Thing has__part) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__part' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#has__partProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__part() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__partProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__part(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__part' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#has__partProperty
	 */
	public void removeHas__part(com.ibm.adtech.jastor.Thing has__part) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'scope__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Role}
	 * @see			#scope__ofProperty
	 */
	public java.util.Iterator getScope__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'scope__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Role} to add
	 * @see			#scope__ofProperty
	 */
	public void addScope__of(edu.mit.dig.saveface.model.sioc.Role scope__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'scope__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Role} created
	 * @see			#scope__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Role addScope__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Role.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#scope__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Role addScope__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'scope__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Role} to remove
	 * @see			#scope__ofProperty
	 */
	public void removeScope__of(edu.mit.dig.saveface.model.sioc.Role scope__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'title' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#titleProperty
	 */
	public java.util.Iterator getTitle() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'title' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#titleProperty
	 */
	public void addTitle(com.hp.hpl.jena.rdf.model.Literal title) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'title' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#titleProperty
	 */
	public void removeTitle(com.hp.hpl.jena.rdf.model.Literal title) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'has__group' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#has__groupProperty
	 */
	public java.util.Iterator getHas__group() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__group' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#has__groupProperty
	 */
	public void addHas__group(com.ibm.adtech.jastor.Thing has__group) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__group' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#has__groupProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__group() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__groupProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__group(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__group' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#has__groupProperty
	 */
	public void removeHas__group(com.ibm.adtech.jastor.Thing has__group) throws com.ibm.adtech.jastor.JastorException;
		
}