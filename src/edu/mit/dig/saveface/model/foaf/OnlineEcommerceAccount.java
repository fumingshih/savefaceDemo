

package edu.mit.dig.saveface.model.foaf;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Online E-commerce Account ontology class<br>
 * Use the edu.mit.dig.saveface.model.foaf.Factory to create instances of this interface.
 * <p>(URI: http://xmlns.com/foaf/0.1/OnlineEcommerceAccount)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Online E-commerce Account <br>
 * 	comment : An online e-commerce account. <br>
 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
 * <br>
 * <br>
 */
public interface OnlineEcommerceAccount extends edu.mit.dig.saveface.model.foaf.OnlineAccount, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://xmlns.com/foaf/0.1/OnlineEcommerceAccount");
	

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




}