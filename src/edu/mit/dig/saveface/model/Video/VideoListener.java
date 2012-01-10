

package edu.mit.dig.saveface.model.Video;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Video.Video to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface VideoListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of tags has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void tagsAdded(edu.mit.dig.saveface.model.Video.Video source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of tags has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */
	public void tagsRemoved(edu.mit.dig.saveface.model.Video.Video source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Video.Video source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Video.Video source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of from has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void fromAdded(edu.mit.dig.saveface.model.Video.Video source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of from has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */
	public void fromRemoved(edu.mit.dig.saveface.model.Video.Video source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of comments has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void commentsAdded(edu.mit.dig.saveface.model.Video.Video source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of comments has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */
	public void commentsRemoved(edu.mit.dig.saveface.model.Video.Video source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of updatedTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void updatedTimeAdded(edu.mit.dig.saveface.model.Video.Video source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of updatedTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void updatedTimeRemoved(edu.mit.dig.saveface.model.Video.Video source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of embedHtml has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void embedHtmlAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.String newValue);

	/**
	 * Called when a value of embedHtml has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void embedHtmlRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.String oldValue);

	/**
	 * Called when a value of picture has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void pictureAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.String newValue);

	/**
	 * Called when a value of picture has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void pictureRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.String oldValue);

	/**
	 * Called when a value of length has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void lengthAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.Integer newValue);

	/**
	 * Called when a value of length has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void lengthRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.Integer oldValue);

	/**
	 * Called when a value of message has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void messageAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.String newValue);

	/**
	 * Called when a value of message has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void messageRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.String oldValue);

	/**
	 * Called when a value of source has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void sourceAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.String newValue);

	/**
	 * Called when a value of source has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void sourceRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.Video.Video source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Video.Video
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.Video.Video source, java.lang.String oldValue);

}