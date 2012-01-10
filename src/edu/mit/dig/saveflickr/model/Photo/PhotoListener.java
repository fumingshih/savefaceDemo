

package edu.mit.dig.saveflickr.model.Photo;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.Photo.Photo to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PhotoListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of lastUpdated has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void lastUpdatedAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of lastUpdated has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void lastUpdatedRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of commentsCount has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void commentsCountAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.Integer newValue);

	/**
	 * Called when a value of commentsCount has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void commentsCountRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.Integer oldValue);

	/**
	 * Called when a value of farm has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void farmAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of farm has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void farmRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of tags has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void tagsAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of tags has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void tagsRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of dateTaken has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void dateTakenAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of dateTaken has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void dateTakenRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of addComment has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void addCommentAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.Boolean newValue);

	/**
	 * Called when a value of addComment has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void addCommentRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.Boolean oldValue);

	/**
	 * Called when a value of originalformat has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void originalformatAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of originalformat has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void originalformatRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of permissions has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void permissionsAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of permissions has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void permissionsRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of notes has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void notesAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of notes has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void notesRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of geoData has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void geoDataAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of geoData has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void geoDataRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of server has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void serverAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of server has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void serverRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of datePosted has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void datePostedAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of datePosted has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void datePostedRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of license has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void licenseAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of license has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void licenseRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of secret has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void secretAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of secret has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void secretRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of addMeta has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void addMetaAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.Boolean newValue);

	/**
	 * Called when a value of addMeta has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void addMetaRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.Boolean oldValue);

	/**
	 * Called when a value of url has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void urlAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of url has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void urlRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of owner has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void ownerAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of owner has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void ownerRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of dateAdded has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void dateAddedAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of dateAdded has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void dateAddedRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of title has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void titleAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of title has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void titleRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of originalsecret has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void originalsecretAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of originalsecret has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void originalsecretRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, java.lang.String oldValue);

	/**
	 * Called when a value of comments has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param newValue the object representing the new value
	 */	
	public void commentsAdded(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of comments has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Photo.Photo
	 * @param oldValue the object representing the removed value
	 */
	public void commentsRemoved(edu.mit.dig.saveflickr.model.Photo.Photo source, com.ibm.adtech.jastor.Thing oldValue);
		
}