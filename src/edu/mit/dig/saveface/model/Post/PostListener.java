

package edu.mit.dig.saveface.model.Post;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Post.Post to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PostListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of likes has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void likesAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.Long newValue);

	/**
	 * Called when a value of likes has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void likesRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.Long oldValue);

	/**
	 * Called when a value of from has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void fromAdded(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of from has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */
	public void fromRemoved(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of commentsCount has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void commentsCountAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.Long newValue);

	/**
	 * Called when a value of commentsCount has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void commentsCountRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.Long oldValue);

	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Post.Post source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Post.Post source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void toAdded(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */
	public void toRemoved(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of updatedTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void updatedTimeAdded(edu.mit.dig.saveface.model.Post.Post source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of updatedTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void updatedTimeRemoved(edu.mit.dig.saveface.model.Post.Post source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of icon has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void iconAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of icon has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void iconRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of type has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void typeAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of type has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void typeRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of message has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void messageAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of message has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void messageRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of actions has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void actionsAdded(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of actions has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */
	public void actionsRemoved(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of picture has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void pictureAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of picture has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void pictureRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void linkRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of caption has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void captionAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of caption has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void captionRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of privacy has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void privacyAdded(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of privacy has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */
	public void privacyRemoved(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of comments has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void commentsAdded(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of comments has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */
	public void commentsRemoved(edu.mit.dig.saveface.model.Post.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of source has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void sourceAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of source has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void sourceRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of attribution has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param newValue the object representing the new value
	 */	
	public void attributionAdded(edu.mit.dig.saveface.model.Post.Post source, java.lang.String newValue);

	/**
	 * Called when a value of attribution has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Post.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void attributionRemoved(edu.mit.dig.saveface.model.Post.Post source, java.lang.String oldValue);

}