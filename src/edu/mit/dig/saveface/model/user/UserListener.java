

package edu.mit.dig.saveface.model.user;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.user.User to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface UserListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of quotes has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void quotesAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of quotes has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void quotesRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of outbox has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void outboxAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of outbox has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void outboxRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of about has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void aboutAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of about has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void aboutRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void linkRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of checkins has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void checkinsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of checkins has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void checkinsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of likes has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void likesAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of likes has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void likesRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of education has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void educationAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of education has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void educationRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of notes has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void notesAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of notes has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void notesRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of firstName has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void firstNameAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of firstName has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void firstNameRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of significantOther has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void significantOtherAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of significantOther has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void significantOtherRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of religion has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void religionAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of religion has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void religionRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of meetingFor has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void meetingForAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of meetingFor has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void meetingForRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of albums has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void albumsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of albums has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void albumsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of links has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void linksAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of links has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void linksRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of website has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void websiteAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of website has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void websiteRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of location has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void locationAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of location has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void locationRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of verified has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void verifiedAdded(edu.mit.dig.saveface.model.user.User source, java.lang.Boolean newValue);

	/**
	 * Called when a value of verified has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void verifiedRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.Boolean oldValue);

	/**
	 * Called when a value of hometown has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void hometownAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of hometown has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void hometownRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of books has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void booksAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of books has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void booksRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of posts has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void postsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of posts has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void postsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of locale has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void localeAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of locale has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void localeRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of interests has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void interestsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of interests has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void interestsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of photos has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void photosAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of photos has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void photosRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of political has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void politicalAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of political has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void politicalRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of email has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void emailAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of email has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void emailRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of timezone has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void timezoneAdded(edu.mit.dig.saveface.model.user.User source, java.lang.Double newValue);

	/**
	 * Called when a value of timezone has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void timezoneRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.Double oldValue);

	/**
	 * Called when a value of lastName has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void lastNameAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of lastName has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void lastNameRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of television has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void televisionAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of television has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void televisionRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of groups has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void groupsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of groups has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void groupsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of work has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void workAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of work has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void workRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of updatedTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void updatedTimeAdded(edu.mit.dig.saveface.model.user.User source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of updatedTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void updatedTimeRemoved(edu.mit.dig.saveface.model.user.User source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of videos has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void videosAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of videos has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void videosRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of statuses has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void statusesAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of statuses has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void statusesRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of inbox has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void inboxAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of inbox has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void inboxRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of accounts has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void accountsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of accounts has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void accountsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of music has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void musicAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of music has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void musicRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of friends has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void friendsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of friends has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void friendsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of birthday has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void birthdayAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of birthday has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void birthdayRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of movies has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void moviesAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of movies has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void moviesRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of activities has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void activitiesAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of activities has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void activitiesRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of interestedIn has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void interestedInAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of interestedIn has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void interestedInRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of feed has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void feedAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of feed has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void feedRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of gender has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void genderAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of gender has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void genderRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of bio has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void bioAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of bio has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void bioRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of updates has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void updatesAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of updates has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void updatesRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of attribution has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void attributionAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of attribution has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void attributionRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of relationshipStatus has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void relationshipStatusAdded(edu.mit.dig.saveface.model.user.User source, java.lang.String newValue);

	/**
	 * Called when a value of relationshipStatus has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */	
	public void relationshipStatusRemoved(edu.mit.dig.saveface.model.user.User source, java.lang.String oldValue);

	/**
	 * Called when a value of events has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param newValue the object representing the new value
	 */	
	public void eventsAdded(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of events has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.user.User
	 * @param oldValue the object representing the removed value
	 */
	public void eventsRemoved(edu.mit.dig.saveface.model.user.User source, com.ibm.adtech.jastor.Thing oldValue);
		
}