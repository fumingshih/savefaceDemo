

package edu.mit.dig.saveface.model.foaf;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Person ontology class<br>
 * Use the edu.mit.dig.saveface.model.foaf.Factory to create instances of this interface.
 * <p>(URI: http://xmlns.com/foaf/0.1/Person)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Person <br>
 * 	comment : A person. <br>
 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
 * <br>
 * <br>
 */
public interface Person extends edu.mit.dig.saveface.model.foaf.Agent, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://xmlns.com/foaf/0.1/Person");
	
	/**
	 * The Jena Property for based__near 
	 * <p>(URI: http://xmlns.com/foaf/0.1/based_near)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : based near <br>
	 * 	comment : A location that something is based near, for some broadly human notion of near. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property based__nearProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/based_near");



	/**
	 * The Jena Property for publications 
	 * <p>(URI: http://xmlns.com/foaf/0.1/publications)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : publications <br>
	 * 	comment : A link to the publications of this person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property publicationsProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/publications");


	/**
	 * The Jena Property for workInfoHomepage 
	 * <p>(URI: http://xmlns.com/foaf/0.1/workInfoHomepage)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : work info homepage <br>
	 * 	comment : A work info homepage of some person; a page about their work for some organization. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property workInfoHomepageProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/workInfoHomepage");


	/**
	 * The Jena Property for surname 
	 * <p>(URI: http://xmlns.com/foaf/0.1/surname)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Surname <br>
	 * 	comment : The surname of some person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property surnameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/surname");


	/**
	 * The Jena Property for knows 
	 * <p>(URI: http://xmlns.com/foaf/0.1/knows)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : knows <br>
	 * 	comment : A person known by this person (indicating some level of reciprocated interaction between the parties). <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property knowsProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/knows");


	/**
	 * The Jena Property for familyName 
	 * <p>(URI: http://xmlns.com/foaf/0.1/familyName)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : familyName <br>
	 * 	comment : The family name of some person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property familyNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/familyName");


	/**
	 * The Jena Property for lastName 
	 * <p>(URI: http://xmlns.com/foaf/0.1/lastName)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : lastName <br>
	 * 	comment : The last name of a person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property lastNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/lastName");


	/**
	 * The Jena Property for img 
	 * <p>(URI: http://xmlns.com/foaf/0.1/img)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : image <br>
	 * 	comment : An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage). <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property imgProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/img");


	/**
	 * The Jena Property for firstName 
	 * <p>(URI: http://xmlns.com/foaf/0.1/firstName)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : firstName <br>
	 * 	comment : The first name of a person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property firstNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/firstName");


	/**
	 * The Jena Property for topic__interest 
	 * <p>(URI: http://xmlns.com/foaf/0.1/topic_interest)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : interest_topic <br>
	 * 	comment : A thing of interest to this person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property topic__interestProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/topic_interest");


	/**
	 * The Jena Property for geekcode 
	 * <p>(URI: http://xmlns.com/foaf/0.1/geekcode)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : geekcode <br>
	 * 	comment : A textual geekcode for this person, see http://www.geekcode.com/geek.html <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property geekcodeProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/geekcode");


	/**
	 * The Jena Property for currentProject 
	 * <p>(URI: http://xmlns.com/foaf/0.1/currentProject)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : current project <br>
	 * 	comment : A current project this person works on. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property currentProjectProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/currentProject");


	/**
	 * The Jena Property for interest 
	 * <p>(URI: http://xmlns.com/foaf/0.1/interest)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : interest <br>
	 * 	comment : A page about a topic of interest to this person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property interestProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/interest");


	/**
	 * The Jena Property for name 
	 * <p>(URI: http://xmlns.com/foaf/0.1/name)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : name <br>
	 * 	comment : A name for some thing. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/name");


	/**
	 * The Jena Property for msnChatID 
	 * <p>(URI: http://xmlns.com/foaf/0.1/msnChatID)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : MSN chat ID <br>
	 * 	comment : An MSN chat ID <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property msnChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/msnChatID");


	/**
	 * The Jena Property for jabberID 
	 * <p>(URI: http://xmlns.com/foaf/0.1/jabberID)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : jabber ID <br>
	 * 	comment : A jabber ID for something. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property jabberIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/jabberID");


	/**
	 * The Jena Property for aimChatID 
	 * <p>(URI: http://xmlns.com/foaf/0.1/aimChatID)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : AIM chat ID <br>
	 * 	comment : An AIM chat ID <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property aimChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/aimChatID");


	/**
	 * The Jena Property for title 
	 * <p>(URI: http://xmlns.com/foaf/0.1/title)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : title <br>
	 * 	comment : Title (Mr, Mrs, Ms, Dr. etc) <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property titleProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/title");


	/**
	 * The Jena Property for givenName 
	 * <p>(URI: http://xmlns.com/foaf/0.1/givenName)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Given name <br>
	 * 	comment : The given name of some person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property givenNameProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/givenName");


	/**
	 * The Jena Property for dnaChecksum 
	 * <p>(URI: http://xmlns.com/foaf/0.1/dnaChecksum)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : DNA checksum <br>
	 * 	comment : A checksum for the DNA of some thing. Joke. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property dnaChecksumProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/dnaChecksum");


	/**
	 * The Jena Property for mbox__sha1sum 
	 * <p>(URI: http://xmlns.com/foaf/0.1/mbox_sha1sum)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : sha1sum of a personal mailbox URI name <br>
	 * 	comment : The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the  first owner of the mailbox. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property mbox__sha1sumProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/mbox_sha1sum");


	/**
	 * The Jena Property for icqChatID 
	 * <p>(URI: http://xmlns.com/foaf/0.1/icqChatID)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : ICQ chat ID <br>
	 * 	comment : An ICQ chat ID <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property icqChatIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/icqChatID");


	/**
	 * The Jena Property for creator 
	 * <p>(URI: http://purl.org/dc/terms/creator)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property creatorProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/creator");


	/**
	 * The Jena Property for depiction 
	 * <p>(URI: http://xmlns.com/foaf/0.1/depiction)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : depiction <br>
	 * 	comment : A depiction of some thing. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property depictionProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/depiction");


	/**
	 * The Jena Property for phone 
	 * <p>(URI: http://xmlns.com/foaf/0.1/phone)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : phone <br>
	 * 	comment : A phone,  specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel). <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property phoneProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/phone");


	/**
	 * The Jena Property for fundedBy 
	 * <p>(URI: http://xmlns.com/foaf/0.1/fundedBy)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : funded by <br>
	 * 	comment : An organization funding a project or person. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property fundedByProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/fundedBy");


	/**
	 * The Jena Property for maker 
	 * <p>(URI: http://xmlns.com/foaf/0.1/maker)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : maker <br>
	 * 	comment : An agent that  made this thing. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property makerProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/maker");


	/**
	 * The Jena Property for label 
	 * <p>(URI: http://www.w3.org/2000/01/rdf-schema#label)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property labelProperty = ResourceFactory.createProperty("http://www.w3.org/2000/01/rdf-schema#label");


	/**
	 * The Jena Property for page 
	 * <p>(URI: http://xmlns.com/foaf/0.1/page)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	comment : A page or document about this thing.  <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property pageProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/page");


	/**
	 * Get an Iterator the 'based__near' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.SpatialThing}
	 * @see			#based__nearProperty
	 */
	public java.util.Iterator getBased__near() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'based__near' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.SpatialThing} to add
	 * @see			#based__nearProperty
	 */
	public void addBased__near(edu.mit.dig.saveface.model.geo.SpatialThing based__near) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'based__near' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.SpatialThing} created
	 * @see			#based__nearProperty
	 */
	public edu.mit.dig.saveface.model.geo.SpatialThing addBased__near() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#based__nearProperty
	 */
	public edu.mit.dig.saveface.model.geo.SpatialThing addBased__near(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'based__near' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.SpatialThing} to remove
	 * @see			#based__nearProperty
	 */
	public void removeBased__near(edu.mit.dig.saveface.model.geo.SpatialThing based__near) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'publications' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Document}
	 * @see			#publicationsProperty
	 */
	public java.util.Iterator getPublications() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'publications' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to add
	 * @see			#publicationsProperty
	 */
	public void addPublications(edu.mit.dig.saveface.model.foaf.Document publications) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'publications' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Document} created
	 * @see			#publicationsProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addPublications() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Document.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#publicationsProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addPublications(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'publications' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to remove
	 * @see			#publicationsProperty
	 */
	public void removePublications(edu.mit.dig.saveface.model.foaf.Document publications) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'workInfoHomepage' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Document}
	 * @see			#workInfoHomepageProperty
	 */
	public java.util.Iterator getWorkInfoHomepage() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'workInfoHomepage' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to add
	 * @see			#workInfoHomepageProperty
	 */
	public void addWorkInfoHomepage(edu.mit.dig.saveface.model.foaf.Document workInfoHomepage) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'workInfoHomepage' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Document} created
	 * @see			#workInfoHomepageProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addWorkInfoHomepage() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Document.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#workInfoHomepageProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addWorkInfoHomepage(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'workInfoHomepage' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to remove
	 * @see			#workInfoHomepageProperty
	 */
	public void removeWorkInfoHomepage(edu.mit.dig.saveface.model.foaf.Document workInfoHomepage) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'surname' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#surnameProperty
	 */
	public java.util.Iterator getSurname() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'surname' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#surnameProperty
	 */
	public void addSurname(com.hp.hpl.jena.rdf.model.Literal surname) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'surname' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#surnameProperty
	 */
	public void removeSurname(com.hp.hpl.jena.rdf.model.Literal surname) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'knows' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Person}
	 * @see			#knowsProperty
	 */
	public java.util.Iterator getKnows() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'knows' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Person} to add
	 * @see			#knowsProperty
	 */
	public void addKnows(edu.mit.dig.saveface.model.foaf.Person knows) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'knows' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Person} created
	 * @see			#knowsProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Person addKnows() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Person.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#knowsProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Person addKnows(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'knows' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Person} to remove
	 * @see			#knowsProperty
	 */
	public void removeKnows(edu.mit.dig.saveface.model.foaf.Person knows) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'familyName' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#familyNameProperty
	 */
	public java.util.Iterator getFamilyName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'familyName' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#familyNameProperty
	 */
	public void addFamilyName(com.hp.hpl.jena.rdf.model.Literal familyName) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'familyName' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#familyNameProperty
	 */
	public void removeFamilyName(com.hp.hpl.jena.rdf.model.Literal familyName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'lastName' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#lastNameProperty
	 */
	public java.util.Iterator getLastName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'lastName' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#lastNameProperty
	 */
	public void addLastName(com.hp.hpl.jena.rdf.model.Literal lastName) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'lastName' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#lastNameProperty
	 */
	public void removeLastName(com.hp.hpl.jena.rdf.model.Literal lastName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'img' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Image}
	 * @see			#imgProperty
	 */
	public java.util.Iterator getImg() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'img' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Image} to add
	 * @see			#imgProperty
	 */
	public void addImg(edu.mit.dig.saveface.model.foaf.Image img) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'img' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Image} created
	 * @see			#imgProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Image addImg() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Image.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#imgProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Image addImg(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'img' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Image} to remove
	 * @see			#imgProperty
	 */
	public void removeImg(edu.mit.dig.saveface.model.foaf.Image img) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'firstName' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#firstNameProperty
	 */
	public java.util.Iterator getFirstName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'firstName' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#firstNameProperty
	 */
	public void addFirstName(com.hp.hpl.jena.rdf.model.Literal firstName) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'firstName' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#firstNameProperty
	 */
	public void removeFirstName(com.hp.hpl.jena.rdf.model.Literal firstName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'topic__interest' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#topic__interestProperty
	 */
	public java.util.Iterator getTopic__interest() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'topic__interest' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#topic__interestProperty
	 */
	public void addTopic__interest(com.ibm.adtech.jastor.Thing topic__interest) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'topic__interest' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#topic__interestProperty
	 */
	public com.ibm.adtech.jastor.Thing addTopic__interest() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#topic__interestProperty
	 */
	public com.ibm.adtech.jastor.Thing addTopic__interest(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'topic__interest' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#topic__interestProperty
	 */
	public void removeTopic__interest(com.ibm.adtech.jastor.Thing topic__interest) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'geekcode' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#geekcodeProperty
	 */
	public java.util.Iterator getGeekcode() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'geekcode' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#geekcodeProperty
	 */
	public void addGeekcode(com.hp.hpl.jena.rdf.model.Literal geekcode) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'geekcode' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#geekcodeProperty
	 */
	public void removeGeekcode(com.hp.hpl.jena.rdf.model.Literal geekcode) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'currentProject' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#currentProjectProperty
	 */
	public java.util.Iterator getCurrentProject() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'currentProject' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#currentProjectProperty
	 */
	public void addCurrentProject(com.ibm.adtech.jastor.Thing currentProject) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'currentProject' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#currentProjectProperty
	 */
	public com.ibm.adtech.jastor.Thing addCurrentProject() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#currentProjectProperty
	 */
	public com.ibm.adtech.jastor.Thing addCurrentProject(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'currentProject' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#currentProjectProperty
	 */
	public void removeCurrentProject(com.ibm.adtech.jastor.Thing currentProject) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'interest' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Document}
	 * @see			#interestProperty
	 */
	public java.util.Iterator getInterest() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'interest' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to add
	 * @see			#interestProperty
	 */
	public void addInterest(edu.mit.dig.saveface.model.foaf.Document interest) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'interest' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Document} created
	 * @see			#interestProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addInterest() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Document.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#interestProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addInterest(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'interest' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to remove
	 * @see			#interestProperty
	 */
	public void removeInterest(edu.mit.dig.saveface.model.foaf.Document interest) throws com.ibm.adtech.jastor.JastorException;
		
}