

package edu.mit.dig.saveface.model.Album;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Album.Album to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface AlbumListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of location has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void locationAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.String newValue);

	/**
	 * Called when a value of location has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void locationRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.String oldValue);

	/**
	 * Called when a value of comments has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void commentsAdded(edu.mit.dig.saveface.model.Album.Album source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of comments has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */
	public void commentsRemoved(edu.mit.dig.saveface.model.Album.Album source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.String oldValue);

	/**
	 * Called when a value of from has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void fromAdded(edu.mit.dig.saveface.model.Album.Album source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of from has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */
	public void fromRemoved(edu.mit.dig.saveface.model.Album.Album source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of updatedTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void updatedTimeAdded(edu.mit.dig.saveface.model.Album.Album source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of updatedTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void updatedTimeRemoved(edu.mit.dig.saveface.model.Album.Album source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.String newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void linkRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.String oldValue);

	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Album.Album source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Album.Album source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of photos has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void photosAdded(edu.mit.dig.saveface.model.Album.Album source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of photos has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */
	public void photosRemoved(edu.mit.dig.saveface.model.Album.Album source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of privacy has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void privacyAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.String newValue);

	/**
	 * Called when a value of privacy has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void privacyRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.String oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.String oldValue);

	/**
	 * Called when a value of count has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param newValue the object representing the new value
	 */	
	public void countAdded(edu.mit.dig.saveface.model.Album.Album source, java.lang.Long newValue);

	/**
	 * Called when a value of count has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Album.Album
	 * @param oldValue the object representing the removed value
	 */	
	public void countRemoved(edu.mit.dig.saveface.model.Album.Album source, java.lang.Long oldValue);

}