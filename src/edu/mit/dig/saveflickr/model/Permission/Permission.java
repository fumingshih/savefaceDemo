

package edu.mit.dig.saveflickr.model.Permission;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Permission ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.Permission.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#Permission)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Permission extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#Permission");
	

	/**
	 * The Jena Property for friendFlag 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#friendFlag)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property friendFlagProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#friendFlag");


	/**
	 * The Jena Property for publicFlag 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#publicFlag)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property publicFlagProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#publicFlag");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#id");


	/**
	 * The Jena Property for familyFlag 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#familyFlag)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property familyFlagProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/Permission.owl#familyFlag");




	/**
	 * Iterates through the 'friendFlag' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Boolean}
	 * @see			#friendFlagProperty
	 */
	public java.util.Iterator getFriendFlag() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'friendFlag' property value
	 * @param		{@link java.lang.Boolean}, the value to add
	 * @see			#friendFlagProperty
	 */
	public void addFriendFlag(java.lang.Boolean friendFlag) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'friendFlag' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Boolean}, the value to remove
	 * @see			#friendFlagProperty
	 */
	public void removeFriendFlag(java.lang.Boolean friendFlag) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'publicFlag' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Boolean}
	 * @see			#publicFlagProperty
	 */
	public java.util.Iterator getPublicFlag() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'publicFlag' property value
	 * @param		{@link java.lang.Boolean}, the value to add
	 * @see			#publicFlagProperty
	 */
	public void addPublicFlag(java.lang.Boolean publicFlag) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'publicFlag' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Boolean}, the value to remove
	 * @see			#publicFlagProperty
	 */
	public void removePublicFlag(java.lang.Boolean publicFlag) throws com.ibm.adtech.jastor.JastorException;

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
	 * Iterates through the 'familyFlag' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Boolean}
	 * @see			#familyFlagProperty
	 */
	public java.util.Iterator getFamilyFlag() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'familyFlag' property value
	 * @param		{@link java.lang.Boolean}, the value to add
	 * @see			#familyFlagProperty
	 */
	public void addFamilyFlag(java.lang.Boolean familyFlag) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'familyFlag' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Boolean}, the value to remove
	 * @see			#familyFlagProperty
	 */
	public void removeFamilyFlag(java.lang.Boolean familyFlag) throws com.ibm.adtech.jastor.JastorException;

}