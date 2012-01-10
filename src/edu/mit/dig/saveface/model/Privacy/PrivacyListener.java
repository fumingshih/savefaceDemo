

package edu.mit.dig.saveface.model.Privacy;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Privacy.Privacy to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PrivacyListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of networks has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param newValue the object representing the new value
	 */	
	public void networksAdded(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String newValue);

	/**
	 * Called when a value of networks has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param oldValue the object representing the removed value
	 */	
	public void networksRemoved(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String oldValue);

	/**
	 * Called when a value of friends has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param newValue the object representing the new value
	 */	
	public void friendsAdded(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String newValue);

	/**
	 * Called when a value of friends has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param oldValue the object representing the removed value
	 */	
	public void friendsRemoved(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String oldValue);

	/**
	 * Called when a value of value has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param newValue the object representing the new value
	 */	
	public void valueAdded(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String newValue);

	/**
	 * Called when a value of value has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param oldValue the object representing the removed value
	 */	
	public void valueRemoved(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Privacy.Privacy
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.Privacy.Privacy source, java.lang.String oldValue);

}