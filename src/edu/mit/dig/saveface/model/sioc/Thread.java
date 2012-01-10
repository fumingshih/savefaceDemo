

package edu.mit.dig.saveface.model.sioc;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Thread@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.sioc.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/ns#Thread)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Thread@en <br>
 * 	comment : A container for a series of threaded discussion Posts or Items.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/ns# <br>
 * <br>
 * <br>
 */
public interface Thread extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/ns#Thread");
	

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




}