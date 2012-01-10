

package edu.mit.dig.saveface.model.Comment;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Comment.Comment to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface CommentListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Comment.Comment source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Comment.Comment source, java.lang.String oldValue);

	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Comment.Comment source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Comment.Comment source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of from has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void fromAdded(edu.mit.dig.saveface.model.Comment.Comment source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of from has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */
	public void fromRemoved(edu.mit.dig.saveface.model.Comment.Comment source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of message has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void messageAdded(edu.mit.dig.saveface.model.Comment.Comment source, java.lang.String newValue);

	/**
	 * Called when a value of message has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void messageRemoved(edu.mit.dig.saveface.model.Comment.Comment source, java.lang.String oldValue);

}