

package edu.mit.dig.saveface.model.Action;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Action.Action to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface ActionListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Action.Action
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.Action.Action source, java.lang.String newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Action.Action
	 * @param oldValue the object representing the removed value
	 */	
	public void linkRemoved(edu.mit.dig.saveface.model.Action.Action source, java.lang.String oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Action.Action
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.Action.Action source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Action.Action
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.Action.Action source, java.lang.String oldValue);

}