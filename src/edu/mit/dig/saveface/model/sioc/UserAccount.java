

package edu.mit.dig.saveface.model.sioc;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for User Account@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.sioc.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/ns#UserAccount)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : User Account@en <br>
 * 	comment : A user account in an online community site.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
 * <br>
 * <br>
 */
public interface UserAccount extends edu.mit.dig.saveface.model.sioc.OnlineAccount, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/ns#UserAccount");
	

	/**
	 * The Jena Property for follows 
	 * <p>(URI: http://rdfs.org/sioc/ns#follows)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : follows@en <br>
	 * 	comment : Indicates that one UserAccount follows another UserAccount (e.g. for microblog posts or other content item updates).@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property followsProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#follows");


	/**
	 * The Jena Property for subscriber__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#subscriber_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	seeAlso : http://rdfs.org/sioc/ns#feed <br>
	 * 	label : subscriber of@en <br>
	 * 	comment : A Container that a UserAccount is subscribed to.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property subscriber__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#subscriber_of");


	/**
	 * The Jena Property for creator__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#creator_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : creator of@en <br>
	 * 	comment : A resource that the UserAccount is a creator of.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property creator__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#creator_of");


	/**
	 * The Jena Property for moderator__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#moderator_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : moderator of@en <br>
	 * 	comment : A Forum that a UserAccount is a moderator of.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property moderator__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#moderator_of");


	/**
	 * The Jena Property for email__sha1 
	 * <p>(URI: http://rdfs.org/sioc/ns#email_sha1)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : email sha1@en <br>
	 * 	comment : An electronic mail address of the UserAccount, encoded using SHA1.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property email__sha1Property = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#email_sha1");


	/**
	 * The Jena Property for account__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#account_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : account of@en <br>
	 * 	comment : Refers to the foaf:Agent or foaf:Person who owns this sioc:UserAccount.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property account__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#account_of");


	/**
	 * The Jena Property for first__name 
	 * <p>(URI: http://rdfs.org/sioc/ns#first_name)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : first name@en <br>
	 * 	comment : First (real) name of this User. Synonyms include given name or christian name.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 * @version This property is deprecated. Use foaf:name or foaf:firstName from the FOAF vocabulary instead.
	 */
	public static com.hp.hpl.jena.rdf.model.Property first__nameProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#first_name");


	/**
	 * The Jena Property for member__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#member_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : member of@en <br>
	 * 	comment : A Usergroup that this UserAccount is a member of.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property member__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#member_of");


	/**
	 * The Jena Property for administrator__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#administrator_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : administrator of@en <br>
	 * 	comment : A Site that the UserAccount is an administrator of.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property administrator__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#administrator_of");


	/**
	 * The Jena Property for modifier__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#modifier_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : modifier of@en <br>
	 * 	comment : An Item that this UserAccount has modified.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property modifier__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#modifier_of");


	/**
	 * The Jena Property for owner__of 
	 * <p>(URI: http://rdfs.org/sioc/ns#owner_of)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : owner of@en <br>
	 * 	comment : A resource owned by a particular UserAccount, for example, a weblog or image gallery.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property owner__ofProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#owner_of");


	/**
	 * The Jena Property for last__name 
	 * <p>(URI: http://rdfs.org/sioc/ns#last_name)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : last name@en <br>
	 * 	comment : Last (real) name of this user. Synonyms include surname or family name.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 * @version This property is deprecated. Use foaf:name or foaf:surname from the FOAF vocabulary instead.
	 */
	public static com.hp.hpl.jena.rdf.model.Property last__nameProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#last_name");


	/**
	 * The Jena Property for email 
	 * <p>(URI: http://rdfs.org/sioc/ns#email)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : email@en <br>
	 * 	comment : An electronic mail address of the UserAccount.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property emailProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#email");


	/**
	 * The Jena Property for avatar 
	 * <p>(URI: http://rdfs.org/sioc/ns#avatar)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : avatar@en <br>
	 * 	comment : An image or depiction used to represent this UserAccount.@en <br>
	 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property avatarProperty = ResourceFactory.createProperty("http://rdfs.org/sioc/ns#avatar");


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
	 * The Jena Property for title 
	 * <p>(URI: http://purl.org/dc/terms/title)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/title");


	/**
	 * The Jena Property for date 
	 * <p>(URI: http://purl.org/dc/terms/date)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property dateProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/date");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://purl.org/dc/terms/description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/description");


	/**
	 * The Jena Property for references 
	 * <p>(URI: http://purl.org/dc/terms/references)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property referencesProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/references");


	/**
	 * The Jena Property for subject 
	 * <p>(URI: http://purl.org/dc/terms/subject)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property subjectProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/subject");


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
	 * The Jena Property for depiction 
	 * <p>(URI: http://xmlns.com/foaf/0.1/depiction)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property depictionProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/depiction");


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
	 * Get an Iterator the 'follows' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.UserAccount}
	 * @see			#followsProperty
	 */
	public java.util.Iterator getFollows() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'follows' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.UserAccount} to add
	 * @see			#followsProperty
	 */
	public void addFollows(edu.mit.dig.saveface.model.sioc.UserAccount follows) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'follows' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.UserAccount} created
	 * @see			#followsProperty
	 */
	public edu.mit.dig.saveface.model.sioc.UserAccount addFollows() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#UserAccount.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#followsProperty
	 */
	public edu.mit.dig.saveface.model.sioc.UserAccount addFollows(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'follows' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.UserAccount} to remove
	 * @see			#followsProperty
	 */
	public void removeFollows(edu.mit.dig.saveface.model.sioc.UserAccount follows) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'subscriber__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Container}
	 * @see			#subscriber__ofProperty
	 */
	public java.util.Iterator getSubscriber__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'subscriber__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Container} to add
	 * @see			#subscriber__ofProperty
	 */
	public void addSubscriber__of(edu.mit.dig.saveface.model.sioc.Container subscriber__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'subscriber__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Container} created
	 * @see			#subscriber__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Container addSubscriber__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Container.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#subscriber__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Container addSubscriber__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'subscriber__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Container} to remove
	 * @see			#subscriber__ofProperty
	 */
	public void removeSubscriber__of(edu.mit.dig.saveface.model.sioc.Container subscriber__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'creator__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#creator__ofProperty
	 */
	public java.util.Iterator getCreator__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'creator__of' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#creator__ofProperty
	 */
	public void addCreator__of(com.ibm.adtech.jastor.Thing creator__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'creator__of' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#creator__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addCreator__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#creator__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addCreator__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'creator__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#creator__ofProperty
	 */
	public void removeCreator__of(com.ibm.adtech.jastor.Thing creator__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'moderator__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Forum}
	 * @see			#moderator__ofProperty
	 */
	public java.util.Iterator getModerator__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'moderator__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Forum} to add
	 * @see			#moderator__ofProperty
	 */
	public void addModerator__of(edu.mit.dig.saveface.model.sioc.Forum moderator__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'moderator__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Forum} created
	 * @see			#moderator__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Forum addModerator__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Forum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#moderator__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Forum addModerator__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'moderator__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Forum} to remove
	 * @see			#moderator__ofProperty
	 */
	public void removeModerator__of(edu.mit.dig.saveface.model.sioc.Forum moderator__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'email__sha1' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#email__sha1Property
	 */
	public java.util.Iterator getEmail__sha1() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'email__sha1' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#email__sha1Property
	 */
	public void addEmail__sha1(com.hp.hpl.jena.rdf.model.Literal email__sha1) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'email__sha1' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#email__sha1Property
	 */
	public void removeEmail__sha1(com.hp.hpl.jena.rdf.model.Literal email__sha1) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'account__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Agent}
	 * @see			#account__ofProperty
	 */
	public java.util.Iterator getAccount__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'account__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Agent} to add
	 * @see			#account__ofProperty
	 */
	public void addAccount__of(edu.mit.dig.saveface.model.sioc.Agent account__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'account__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Agent} created
	 * @see			#account__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Agent addAccount__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Agent.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#account__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Agent addAccount__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'account__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Agent} to remove
	 * @see			#account__ofProperty
	 */
	public void removeAccount__of(edu.mit.dig.saveface.model.sioc.Agent account__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'first__name' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#first__nameProperty
	 */
	public java.util.Iterator getFirst__name() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'first__name' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#first__nameProperty
	 */
	public void addFirst__name(com.hp.hpl.jena.rdf.model.Literal first__name) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'first__name' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#first__nameProperty
	 */
	public void removeFirst__name(com.hp.hpl.jena.rdf.model.Literal first__name) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'member__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Usergroup}
	 * @see			#member__ofProperty
	 */
	public java.util.Iterator getMember__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'member__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Usergroup} to add
	 * @see			#member__ofProperty
	 */
	public void addMember__of(edu.mit.dig.saveface.model.sioc.Usergroup member__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'member__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Usergroup} created
	 * @see			#member__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Usergroup addMember__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Usergroup.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#member__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Usergroup addMember__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'member__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Usergroup} to remove
	 * @see			#member__ofProperty
	 */
	public void removeMember__of(edu.mit.dig.saveface.model.sioc.Usergroup member__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'administrator__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Site}
	 * @see			#administrator__ofProperty
	 */
	public java.util.Iterator getAdministrator__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'administrator__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Site} to add
	 * @see			#administrator__ofProperty
	 */
	public void addAdministrator__of(edu.mit.dig.saveface.model.sioc.Site administrator__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'administrator__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Site} created
	 * @see			#administrator__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Site addAdministrator__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Site.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#administrator__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Site addAdministrator__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'administrator__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Site} to remove
	 * @see			#administrator__ofProperty
	 */
	public void removeAdministrator__of(edu.mit.dig.saveface.model.sioc.Site administrator__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'modifier__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.sioc.Item}
	 * @see			#modifier__ofProperty
	 */
	public java.util.Iterator getModifier__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'modifier__of' property
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Item} to add
	 * @see			#modifier__ofProperty
	 */
	public void addModifier__of(edu.mit.dig.saveface.model.sioc.Item modifier__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'modifier__of' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.sioc.Item} created
	 * @see			#modifier__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Item addModifier__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://rdfs.org/sioc/ns#Item.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#modifier__ofProperty
	 */
	public edu.mit.dig.saveface.model.sioc.Item addModifier__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'modifier__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.sioc.Item} to remove
	 * @see			#modifier__ofProperty
	 */
	public void removeModifier__of(edu.mit.dig.saveface.model.sioc.Item modifier__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'owner__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#owner__ofProperty
	 */
	public java.util.Iterator getOwner__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'owner__of' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#owner__ofProperty
	 */
	public void addOwner__of(com.ibm.adtech.jastor.Thing owner__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'owner__of' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#owner__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addOwner__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#owner__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addOwner__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'owner__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#owner__ofProperty
	 */
	public void removeOwner__of(com.ibm.adtech.jastor.Thing owner__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'last__name' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#last__nameProperty
	 */
	public java.util.Iterator getLast__name() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'last__name' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#last__nameProperty
	 */
	public void addLast__name(com.hp.hpl.jena.rdf.model.Literal last__name) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'last__name' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#last__nameProperty
	 */
	public void removeLast__name(com.hp.hpl.jena.rdf.model.Literal last__name) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'email' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#emailProperty
	 */
	public java.util.Iterator getEmail() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'email' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#emailProperty
	 */
	public void addEmail(com.ibm.adtech.jastor.Thing email) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'email' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#emailProperty
	 */
	public com.ibm.adtech.jastor.Thing addEmail() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#emailProperty
	 */
	public com.ibm.adtech.jastor.Thing addEmail(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'email' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#emailProperty
	 */
	public void removeEmail(com.ibm.adtech.jastor.Thing email) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'avatar' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#avatarProperty
	 */
	public java.util.Iterator getAvatar() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'avatar' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#avatarProperty
	 */
	public void addAvatar(com.ibm.adtech.jastor.Thing avatar) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'avatar' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#avatarProperty
	 */
	public com.ibm.adtech.jastor.Thing addAvatar() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#avatarProperty
	 */
	public com.ibm.adtech.jastor.Thing addAvatar(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'avatar' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#avatarProperty
	 */
	public void removeAvatar(com.ibm.adtech.jastor.Thing avatar) throws com.ibm.adtech.jastor.JastorException;
		
}