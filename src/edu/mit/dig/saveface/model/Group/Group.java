

package edu.mit.dig.saveface.model.Group;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Group ontology class<br>
 * Use the edu.mit.dig.saveface.model.Group.Factory to create instances of this interface.
 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#Group)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Group extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://foolme.csail.mit.edu/ns/saveface/Group.owl#Group");
	

	/**
	 * The Jena Property for updatedTime 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#updatedTime)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property updatedTimeProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#updatedTime");


	/**
	 * The Jena Property for owner 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#owner)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property ownerProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#owner");


	/**
	 * The Jena Property for privacy 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#privacy)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property privacyProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#privacy");


	/**
	 * The Jena Property for link 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#link)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property linkProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#link");


	/**
	 * The Jena Property for venue 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#venue)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property venueProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#venue");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#id");


	/**
	 * The Jena Property for description 
	 * <p>(URI: http://foolme.csail.mit.edu/ns/saveface/Group.owl#description)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property descriptionProperty = ResourceFactory.createProperty("http://foolme.csail.mit.edu/ns/saveface/Group.owl#description");




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
	 * Get an Iterator the 'owner' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#ownerProperty
	 */
	public java.util.Iterator getOwner() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'owner' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#ownerProperty
	 */
	public void addOwner(com.ibm.adtech.jastor.Thing owner) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'owner' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#ownerProperty
	 */
	public com.ibm.adtech.jastor.Thing addOwner() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#ownerProperty
	 */
	public com.ibm.adtech.jastor.Thing addOwner(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'owner' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#ownerProperty
	 */
	public void removeOwner(com.ibm.adtech.jastor.Thing owner) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'privacy' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#privacyProperty
	 */
	public java.util.Iterator getPrivacy() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'privacy' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#privacyProperty
	 */
	public void addPrivacy(java.lang.String privacy) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'privacy' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#privacyProperty
	 */
	public void removePrivacy(java.lang.String privacy) throws com.ibm.adtech.jastor.JastorException;

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
	 * Get an Iterator the 'venue' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#venueProperty
	 */
	public java.util.Iterator getVenue() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'venue' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#venueProperty
	 */
	public void addVenue(com.ibm.adtech.jastor.Thing venue) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'venue' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#venueProperty
	 */
	public com.ibm.adtech.jastor.Thing addVenue() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#venueProperty
	 */
	public com.ibm.adtech.jastor.Thing addVenue(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'venue' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#venueProperty
	 */
	public void removeVenue(com.ibm.adtech.jastor.Thing venue) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Iterates through the 'description' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#descriptionProperty
	 */
	public java.util.Iterator getDescription() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'description' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#descriptionProperty
	 */
	public void addDescription(java.lang.String description) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'description' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#descriptionProperty
	 */
	public void removeDescription(java.lang.String description) throws com.ibm.adtech.jastor.JastorException;

}