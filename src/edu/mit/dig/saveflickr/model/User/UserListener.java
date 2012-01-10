package edu.mit.dig.saveflickr.model.User;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.User.User to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface UserListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of username has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void usernameAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.String newValue);

	/**
	 * Called when a value of username has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void usernameRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.String oldValue);

	/**
	 * Called when a value of profileurl has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void profileurlAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.String newValue);

	/**
	 * Called when a value of profileurl has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void profileurlRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.String oldValue);

	/**
	 * Called when a value of realname has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void realnameAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.String newValue);

	/**
	 * Called when a value of realname has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void realnameRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.String oldValue);

	/**
	 * Called when a value of location has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void locationAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.String newValue);

	/**
	 * Called when a value of location has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void locationRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.String oldValue);

	/**
	 * Called when a value of photoset has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void photosetAdded(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of photoset has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */
	public void photosetRemoved(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of contacts has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void contactsAdded(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of contacts has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */
	public void contactsRemoved(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of photosCount has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void photosCountAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.Integer newValue);

	/**
	 * Called when a value of photosCount has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void photosCountRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.Integer oldValue);

	/**
	 * Called when a value of family has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void familyAdded(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of family has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */
	public void familyRemoved(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of friends has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void friendsAdded(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of friends has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */
	public void friendsRemoved(edu.mit.dig.saveflickr.model.User.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of photosurl has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void photosurlAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.String newValue);

	/**
	 * Called when a value of photosurl has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void photosurlRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.User.User source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.User.User
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.User.User source, java.lang.String oldValue);

}