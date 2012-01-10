

package edu.mit.dig.saveface.model.Note;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Note.Note to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface NoteListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of message has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void messageAdded(edu.mit.dig.saveface.model.Note.Note source, java.lang.String newValue);

	/**
	 * Called when a value of message has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void messageRemoved(edu.mit.dig.saveface.model.Note.Note source, java.lang.String oldValue);

	/**
	 * Called when a value of comment has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void commentAdded(edu.mit.dig.saveface.model.Note.Note source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of comment has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */
	public void commentRemoved(edu.mit.dig.saveface.model.Note.Note source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Note.Note source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Note.Note source, java.lang.String oldValue);

	/**
	 * Called when a value of updatedTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void updatedTimeAdded(edu.mit.dig.saveface.model.Note.Note source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of updatedTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void updatedTimeRemoved(edu.mit.dig.saveface.model.Note.Note source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of subject has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void subjectAdded(edu.mit.dig.saveface.model.Note.Note source, java.lang.String newValue);

	/**
	 * Called when a value of subject has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void subjectRemoved(edu.mit.dig.saveface.model.Note.Note source, java.lang.String oldValue);

	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Note.Note source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Note.Note source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of likes has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void likesAdded(edu.mit.dig.saveface.model.Note.Note source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of likes has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */
	public void likesRemoved(edu.mit.dig.saveface.model.Note.Note source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of icon has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void iconAdded(edu.mit.dig.saveface.model.Note.Note source, java.lang.String newValue);

	/**
	 * Called when a value of icon has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void iconRemoved(edu.mit.dig.saveface.model.Note.Note source, java.lang.String oldValue);

	/**
	 * Called when a value of from has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void fromAdded(edu.mit.dig.saveface.model.Note.Note source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of from has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */
	public void fromRemoved(edu.mit.dig.saveface.model.Note.Note source, com.ibm.adtech.jastor.Thing oldValue);
		
}