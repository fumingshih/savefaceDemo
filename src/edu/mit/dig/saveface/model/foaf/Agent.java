

package edu.mit.dig.saveface.model.foaf;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Agent ontology class<br>
 * Use the edu.mit.dig.saveface.model.foaf.Factory to create instances of this interface.
 * <p>(URI: http://xmlns.com/foaf/0.1/Agent)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Agent <br>
 * 	comment : An agent (eg. person, group, software or physical artifact). <br>
 * <br>
 * <br>
 */
public interface Agent extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://xmlns.com/foaf/0.1/Agent");
	

	/**
	 * The Jena Property for status 
	 * <p>(URI: http://xmlns.com/foaf/0.1/status)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : status <br>
	 * 	comment : A string expressing what the user is happy for the general public (normally) to know about their current activity. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property statusProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/status");


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
	 * The Jena Property for mbox 
	 * <p>(URI: http://xmlns.com/foaf/0.1/mbox)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : personal mailbox <br>
	 * 	comment : A  personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that  there is (across time and change) at most one individual that ever has any particular value for foaf:mbox. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property mboxProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/mbox");


	/**
	 * The Jena Property for creator 
	 * <p>(URI: http://purl.org/dc/terms/creator)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property creatorProperty = ResourceFactory.createProperty("http://purl.org/dc/terms/creator");


	/**
	 * The Jena Property for account 
	 * <p>(URI: http://xmlns.com/foaf/0.1/account)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : account <br>
	 * 	comment : Indicates an account held by this agent. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property accountProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/account");


	/**
	 * The Jena Property for age 
	 * <p>(URI: http://xmlns.com/foaf/0.1/age)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : age <br>
	 * 	comment : The age in years of some agent. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property ageProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/age");


	/**
	 * The Jena Property for birthday 
	 * <p>(URI: http://xmlns.com/foaf/0.1/birthday)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : birthday <br>
	 * 	comment : The birthday of this Agent, represented in mm-dd string form, eg. '12-31'. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property birthdayProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/birthday");


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
	 * The Jena Property for skypeID 
	 * <p>(URI: http://xmlns.com/foaf/0.1/skypeID)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Skype ID <br>
	 * 	comment : A Skype ID <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property skypeIDProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/skypeID");


	/**
	 * The Jena Property for gender 
	 * <p>(URI: http://xmlns.com/foaf/0.1/gender)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : gender <br>
	 * 	comment : The gender of this Agent (typically but not necessarily 'male' or 'female'). <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property genderProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/gender");


	/**
	 * The Jena Property for made 
	 * <p>(URI: http://xmlns.com/foaf/0.1/made)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : made <br>
	 * 	comment : Something that was made by this agent. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property madeProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/made");


	/**
	 * The Jena Property for weblog 
	 * <p>(URI: http://xmlns.com/foaf/0.1/weblog)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : weblog <br>
	 * 	comment : A weblog of some thing (whether person, group, company etc.). <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property weblogProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/weblog");


	/**
	 * The Jena Property for holdsAccount 
	 * <p>(URI: http://xmlns.com/foaf/0.1/holdsAccount)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : account <br>
	 * 	comment : Indicates an account held by this agent. <br>
	 * 	isDefinedBy : http://xmlns.com/foaf/0.1/ <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property holdsAccountProperty = ResourceFactory.createProperty("http://xmlns.com/foaf/0.1/holdsAccount");


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
	 * The Jena Property for label 
	 * <p>(URI: http://www.w3.org/2000/01/rdf-schema#label)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property labelProperty = ResourceFactory.createProperty("http://www.w3.org/2000/01/rdf-schema#label");




	/**
	 * Iterates through the 'status' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#statusProperty
	 */
	public java.util.Iterator getStatus() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'status' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#statusProperty
	 */
	public void addStatus(com.hp.hpl.jena.rdf.model.Literal status) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'status' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#statusProperty
	 */
	public void removeStatus(com.hp.hpl.jena.rdf.model.Literal status) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'icqChatID' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#icqChatIDProperty
	 */
	public java.util.Iterator getIcqChatID() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'icqChatID' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#icqChatIDProperty
	 */
	public void addIcqChatID(com.hp.hpl.jena.rdf.model.Literal icqChatID) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'icqChatID' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#icqChatIDProperty
	 */
	public void removeIcqChatID(com.hp.hpl.jena.rdf.model.Literal icqChatID) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'fundedBy' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#fundedByProperty
	 */
	public java.util.Iterator getFundedBy() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'fundedBy' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#fundedByProperty
	 */
	public void addFundedBy(com.ibm.adtech.jastor.Thing fundedBy) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'fundedBy' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#fundedByProperty
	 */
	public com.ibm.adtech.jastor.Thing addFundedBy() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#fundedByProperty
	 */
	public com.ibm.adtech.jastor.Thing addFundedBy(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'fundedBy' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#fundedByProperty
	 */
	public void removeFundedBy(com.ibm.adtech.jastor.Thing fundedBy) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'dnaChecksum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#dnaChecksumProperty
	 */
	public java.util.Iterator getDnaChecksum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dnaChecksum' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#dnaChecksumProperty
	 */
	public void addDnaChecksum(com.hp.hpl.jena.rdf.model.Literal dnaChecksum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dnaChecksum' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#dnaChecksumProperty
	 */
	public void removeDnaChecksum(com.hp.hpl.jena.rdf.model.Literal dnaChecksum) throws com.ibm.adtech.jastor.JastorException;

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
	 * Get an Iterator the 'phone' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#phoneProperty
	 */
	public java.util.Iterator getPhone() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'phone' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#phoneProperty
	 */
	public void addPhone(com.ibm.adtech.jastor.Thing phone) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'phone' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#phoneProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhone() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#phoneProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhone(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'phone' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#phoneProperty
	 */
	public void removePhone(com.ibm.adtech.jastor.Thing phone) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'maker' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Agent}
	 * @see			#makerProperty
	 */
	public java.util.Iterator getMaker() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'maker' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Agent} to add
	 * @see			#makerProperty
	 */
	public void addMaker(edu.mit.dig.saveface.model.foaf.Agent maker) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'maker' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Agent} created
	 * @see			#makerProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Agent addMaker() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Agent.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#makerProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Agent addMaker(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'maker' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Agent} to remove
	 * @see			#makerProperty
	 */
	public void removeMaker(edu.mit.dig.saveface.model.foaf.Agent maker) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'mbox__sha1sum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#mbox__sha1sumProperty
	 */
	public java.util.Iterator getMbox__sha1sum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'mbox__sha1sum' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#mbox__sha1sumProperty
	 */
	public void addMbox__sha1sum(com.hp.hpl.jena.rdf.model.Literal mbox__sha1sum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'mbox__sha1sum' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#mbox__sha1sumProperty
	 */
	public void removeMbox__sha1sum(com.hp.hpl.jena.rdf.model.Literal mbox__sha1sum) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'msnChatID' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#msnChatIDProperty
	 */
	public java.util.Iterator getMsnChatID() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'msnChatID' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#msnChatIDProperty
	 */
	public void addMsnChatID(com.hp.hpl.jena.rdf.model.Literal msnChatID) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'msnChatID' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#msnChatIDProperty
	 */
	public void removeMsnChatID(com.hp.hpl.jena.rdf.model.Literal msnChatID) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'mbox' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#mboxProperty
	 */
	public java.util.Iterator getMbox() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'mbox' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#mboxProperty
	 */
	public void addMbox(com.ibm.adtech.jastor.Thing mbox) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'mbox' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#mboxProperty
	 */
	public com.ibm.adtech.jastor.Thing addMbox() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#mboxProperty
	 */
	public com.ibm.adtech.jastor.Thing addMbox(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'mbox' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#mboxProperty
	 */
	public void removeMbox(com.ibm.adtech.jastor.Thing mbox) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'creator' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#creatorProperty
	 */
	public java.util.Iterator getCreator() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'creator' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#creatorProperty
	 */
	public void addCreator(com.ibm.adtech.jastor.Thing creator) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'creator' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#creatorProperty
	 */
	public com.ibm.adtech.jastor.Thing addCreator() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#creatorProperty
	 */
	public com.ibm.adtech.jastor.Thing addCreator(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'creator' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#creatorProperty
	 */
	public void removeCreator(com.ibm.adtech.jastor.Thing creator) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'account' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.OnlineAccount}
	 * @see			#accountProperty
	 */
	public java.util.Iterator getAccount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'account' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.OnlineAccount} to add
	 * @see			#accountProperty
	 */
	public void addAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount account) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'account' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.OnlineAccount} created
	 * @see			#accountProperty
	 */
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addAccount() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/OnlineAccount.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#accountProperty
	 */
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addAccount(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'account' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.OnlineAccount} to remove
	 * @see			#accountProperty
	 */
	public void removeAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount account) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'age' property value
	 * @return		{@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#ageProperty
	 */
	public com.hp.hpl.jena.rdf.model.Literal getAge() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'age' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#ageProperty
	 */
	public void setAge(com.hp.hpl.jena.rdf.model.Literal age) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'birthday' property value
	 * @return		{@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#birthdayProperty
	 */
	public com.hp.hpl.jena.rdf.model.Literal getBirthday() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'birthday' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#birthdayProperty
	 */
	public void setBirthday(com.hp.hpl.jena.rdf.model.Literal birthday) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'aimChatID' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#aimChatIDProperty
	 */
	public java.util.Iterator getAimChatID() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'aimChatID' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#aimChatIDProperty
	 */
	public void addAimChatID(com.hp.hpl.jena.rdf.model.Literal aimChatID) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'aimChatID' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#aimChatIDProperty
	 */
	public void removeAimChatID(com.hp.hpl.jena.rdf.model.Literal aimChatID) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'givenName' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#givenNameProperty
	 */
	public java.util.Iterator getGivenName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'givenName' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#givenNameProperty
	 */
	public void addGivenName(com.hp.hpl.jena.rdf.model.Literal givenName) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'givenName' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#givenNameProperty
	 */
	public void removeGivenName(com.hp.hpl.jena.rdf.model.Literal givenName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'depiction' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Image}
	 * @see			#depictionProperty
	 */
	public java.util.Iterator getDepiction() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'depiction' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Image} to add
	 * @see			#depictionProperty
	 */
	public void addDepiction(edu.mit.dig.saveface.model.foaf.Image depiction) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'depiction' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Image} created
	 * @see			#depictionProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Image addDepiction() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Image.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#depictionProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Image addDepiction(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'depiction' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Image} to remove
	 * @see			#depictionProperty
	 */
	public void removeDepiction(edu.mit.dig.saveface.model.foaf.Image depiction) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'jabberID' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#jabberIDProperty
	 */
	public java.util.Iterator getJabberID() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'jabberID' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#jabberIDProperty
	 */
	public void addJabberID(com.hp.hpl.jena.rdf.model.Literal jabberID) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'jabberID' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#jabberIDProperty
	 */
	public void removeJabberID(com.hp.hpl.jena.rdf.model.Literal jabberID) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'page' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Document}
	 * @see			#pageProperty
	 */
	public java.util.Iterator getPage() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'page' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to add
	 * @see			#pageProperty
	 */
	public void addPage(edu.mit.dig.saveface.model.foaf.Document page) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'page' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Document} created
	 * @see			#pageProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addPage() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Document.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#pageProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addPage(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'page' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to remove
	 * @see			#pageProperty
	 */
	public void removePage(edu.mit.dig.saveface.model.foaf.Document page) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'skypeID' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#skypeIDProperty
	 */
	public java.util.Iterator getSkypeID() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'skypeID' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#skypeIDProperty
	 */
	public void addSkypeID(com.hp.hpl.jena.rdf.model.Literal skypeID) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'skypeID' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#skypeIDProperty
	 */
	public void removeSkypeID(com.hp.hpl.jena.rdf.model.Literal skypeID) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'gender' property value
	 * @return		{@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#genderProperty
	 */
	public com.hp.hpl.jena.rdf.model.Literal getGender() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'gender' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#genderProperty
	 */
	public void setGender(com.hp.hpl.jena.rdf.model.Literal gender) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'made' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#madeProperty
	 */
	public java.util.Iterator getMade() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'made' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#madeProperty
	 */
	public void addMade(com.ibm.adtech.jastor.Thing made) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'made' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#madeProperty
	 */
	public com.ibm.adtech.jastor.Thing addMade() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#madeProperty
	 */
	public com.ibm.adtech.jastor.Thing addMade(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'made' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#madeProperty
	 */
	public void removeMade(com.ibm.adtech.jastor.Thing made) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'weblog' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.Document}
	 * @see			#weblogProperty
	 */
	public java.util.Iterator getWeblog() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'weblog' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to add
	 * @see			#weblogProperty
	 */
	public void addWeblog(edu.mit.dig.saveface.model.foaf.Document weblog) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'weblog' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.Document} created
	 * @see			#weblogProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addWeblog() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/Document.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#weblogProperty
	 */
	public edu.mit.dig.saveface.model.foaf.Document addWeblog(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'weblog' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.Document} to remove
	 * @see			#weblogProperty
	 */
	public void removeWeblog(edu.mit.dig.saveface.model.foaf.Document weblog) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'holdsAccount' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link edu.mit.dig.saveface.model.foaf.OnlineAccount}
	 * @see			#holdsAccountProperty
	 */
	public java.util.Iterator getHoldsAccount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'holdsAccount' property
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.OnlineAccount} to add
	 * @see			#holdsAccountProperty
	 */
	public void addHoldsAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'holdsAccount' property
	 * @return		The anoymous {@link edu.mit.dig.saveface.model.foaf.OnlineAccount} created
	 * @see			#holdsAccountProperty
	 */
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addHoldsAccount() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://xmlns.com/foaf/0.1/OnlineAccount.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#holdsAccountProperty
	 */
	public edu.mit.dig.saveface.model.foaf.OnlineAccount addHoldsAccount(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'holdsAccount' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link edu.mit.dig.saveface.model.foaf.OnlineAccount} to remove
	 * @see			#holdsAccountProperty
	 */
	public void removeHoldsAccount(edu.mit.dig.saveface.model.foaf.OnlineAccount holdsAccount) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Get an Iterator the 'label' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#labelProperty
	 */
	public java.util.Iterator getLabel() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'label' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#labelProperty
	 */
	public void addLabel(com.ibm.adtech.jastor.Thing label) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'label' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#labelProperty
	 */
	public com.ibm.adtech.jastor.Thing addLabel() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#labelProperty
	 */
	public com.ibm.adtech.jastor.Thing addLabel(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'label' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#labelProperty
	 */
	public void removeLabel(com.ibm.adtech.jastor.Thing label) throws com.ibm.adtech.jastor.JastorException;
		
}