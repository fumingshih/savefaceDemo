

package edu.mit.dig.saveflickr.model.Tag;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.Tag.Tag to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface TagListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.Tag.Tag source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.Tag.Tag source, java.lang.String oldValue);

	/**
	 * Called when a value of author has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void authorAdded(edu.mit.dig.saveflickr.model.Tag.Tag source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of author has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */
	public void authorRemoved(edu.mit.dig.saveflickr.model.Tag.Tag source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of raw has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void rawAdded(edu.mit.dig.saveflickr.model.Tag.Tag source, java.lang.String newValue);

	/**
	 * Called when a value of raw has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void rawRemoved(edu.mit.dig.saveflickr.model.Tag.Tag source, java.lang.String oldValue);

	/**
	 * Called when a value of value has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param newValue the object representing the new value
	 */	
	public void valueAdded(edu.mit.dig.saveflickr.model.Tag.Tag source, java.lang.String newValue);

	/**
	 * Called when a value of value has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Tag.Tag
	 * @param oldValue the object representing the removed value
	 */	
	public void valueRemoved(edu.mit.dig.saveflickr.model.Tag.Tag source, java.lang.String oldValue);

}