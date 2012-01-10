

package edu.mit.dig.saveflickr.model.User;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for User ontology class<br>
 * Use the edu.mit.dig.saveflickr.model.User.Factory to create instances of this interface.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#User)</p>
 * <br>
 * <br>
 * <br>
 */
public interface User extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#User");
	

	/**
	 * The Jena Property for username 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#username)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property usernameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#username");


	/**
	 * The Jena Property for profileurl 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#profileurl)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property profileurlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#profileurl");


	/**
	 * The Jena Property for realname 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#realname)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property realnameProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#realname");


	/**
	 * The Jena Property for location 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#location)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property locationProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#location");


	/**
	 * The Jena Property for photoset 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photoset)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property photosetProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photoset");


	/**
	 * The Jena Property for contacts 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#contacts)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property contactsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#contacts");


	/**
	 * The Jena Property for photosCount 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosCount)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property photosCountProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosCount");


	/**
	 * The Jena Property for family 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#family)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property familyProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#family");


	/**
	 * The Jena Property for friends 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#friends)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property friendsProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#friends");


	/**
	 * The Jena Property for photosurl 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosurl)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property photosurlProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#photosurl");


	/**
	 * The Jena Property for id 
	 * <p>(URI: http://www.foolme.csail.mit.edu/ns/flickr/User.owl#id)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property idProperty = ResourceFactory.createProperty("http://www.foolme.csail.mit.edu/ns/flickr/User.owl#id");




	/**
	 * Iterates through the 'username' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#usernameProperty
	 */
	public java.util.Iterator getUsername() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'username' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#usernameProperty
	 */
	public void addUsername(java.lang.String username) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'username' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#usernameProperty
	 */
	public void removeUsername(java.lang.String username) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'profileurl' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#profileurlProperty
	 */
	public java.util.Iterator getProfileurl() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'profileurl' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#profileurlProperty
	 */
	public void addProfileurl(java.lang.String profileurl) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'profileurl' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#profileurlProperty
	 */
	public void removeProfileurl(java.lang.String profileurl) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'realname' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#realnameProperty
	 */
	public java.util.Iterator getRealname() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'realname' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#realnameProperty
	 */
	public void addRealname(java.lang.String realname) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'realname' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#realnameProperty
	 */
	public void removeRealname(java.lang.String realname) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'location' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#locationProperty
	 */
	public java.util.Iterator getLocation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'location' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#locationProperty
	 */
	public void addLocation(java.lang.String location) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'location' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#locationProperty
	 */
	public void removeLocation(java.lang.String location) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'photoset' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#photosetProperty
	 */
	public java.util.Iterator getPhotoset() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'photoset' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#photosetProperty
	 */
	public void addPhotoset(com.ibm.adtech.jastor.Thing photoset) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'photoset' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#photosetProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhotoset() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#photosetProperty
	 */
	public com.ibm.adtech.jastor.Thing addPhotoset(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'photoset' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#photosetProperty
	 */
	public void removePhotoset(com.ibm.adtech.jastor.Thing photoset) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'contacts' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#contactsProperty
	 */
	public java.util.Iterator getContacts() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'contacts' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#contactsProperty
	 */
	public void addContacts(com.ibm.adtech.jastor.Thing contacts) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'contacts' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#contactsProperty
	 */
	public com.ibm.adtech.jastor.Thing addContacts() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#contactsProperty
	 */
	public com.ibm.adtech.jastor.Thing addContacts(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'contacts' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#contactsProperty
	 */
	public void removeContacts(com.ibm.adtech.jastor.Thing contacts) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'photosCount' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#photosCountProperty
	 */
	public java.util.Iterator getPhotosCount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'photosCount' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#photosCountProperty
	 */
	public void addPhotosCount(java.lang.Integer photosCount) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'photosCount' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#photosCountProperty
	 */
	public void removePhotosCount(java.lang.Integer photosCount) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'family' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#familyProperty
	 */
	public java.util.Iterator getFamily() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'family' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#familyProperty
	 */
	public void addFamily(com.ibm.adtech.jastor.Thing family) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'family' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#familyProperty
	 */
	public com.ibm.adtech.jastor.Thing addFamily() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#familyProperty
	 */
	public com.ibm.adtech.jastor.Thing addFamily(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'family' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#familyProperty
	 */
	public void removeFamily(com.ibm.adtech.jastor.Thing family) throws com.ibm.adtech.jastor.JastorException;
		
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
	 * Iterates through the 'photosurl' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#photosurlProperty
	 */
	public java.util.Iterator getPhotosurl() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'photosurl' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#photosurlProperty
	 */
	public void addPhotosurl(java.lang.String photosurl) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'photosurl' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#photosurlProperty
	 */
	public void removePhotosurl(java.lang.String photosurl) throws com.ibm.adtech.jastor.JastorException;

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

}