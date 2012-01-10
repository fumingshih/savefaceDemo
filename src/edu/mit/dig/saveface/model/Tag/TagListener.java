

package edu.mit.dig.saveface.model.Tag;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Tag.Tag to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface TagListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.Tag.Tag source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.Tag.Tag source, java.lang.String oldValue);

	/**
	 * Called when a value of y has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void yAdded(edu.mit.dig.saveface.model.Tag.Tag source, java.lang.Integer newValue);

	/**
	 * Called when a value of y has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void yRemoved(edu.mit.dig.saveface.model.Tag.Tag source, java.lang.Integer oldValue);

	/**
	 * Called when a value of x has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void xAdded(edu.mit.dig.saveface.model.Tag.Tag source, java.lang.Integer newValue);

	/**
	 * Called when a value of x has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void xRemoved(edu.mit.dig.saveface.model.Tag.Tag source, java.lang.Integer oldValue);

	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Tag.Tag source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Tag.Tag source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

}