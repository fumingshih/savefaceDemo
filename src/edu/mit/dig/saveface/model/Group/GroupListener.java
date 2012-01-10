

package edu.mit.dig.saveface.model.Group;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Group.Group to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface GroupListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of updatedTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void updatedTimeAdded(edu.mit.dig.saveface.model.Group.Group source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of updatedTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void updatedTimeRemoved(edu.mit.dig.saveface.model.Group.Group source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of owner has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void ownerAdded(edu.mit.dig.saveface.model.Group.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of owner has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */
	public void ownerRemoved(edu.mit.dig.saveface.model.Group.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of privacy has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void privacyAdded(edu.mit.dig.saveface.model.Group.Group source, java.lang.String newValue);

	/**
	 * Called when a value of privacy has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void privacyRemoved(edu.mit.dig.saveface.model.Group.Group source, java.lang.String oldValue);

	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.Group.Group source, java.lang.String newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void linkRemoved(edu.mit.dig.saveface.model.Group.Group source, java.lang.String oldValue);

	/**
	 * Called when a value of venue has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void venueAdded(edu.mit.dig.saveface.model.Group.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of venue has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */
	public void venueRemoved(edu.mit.dig.saveface.model.Group.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Group.Group source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Group.Group source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.Group.Group source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Group.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.Group.Group source, java.lang.String oldValue);

}