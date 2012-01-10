

package edu.mit.dig.saveflickr.model.PhotoSet;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.PhotoSet.Photoset to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PhotosetListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String oldValue);

	/**
	 * Called when a value of photos has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param newValue the object representing the new value
	 */	
	public void photosAdded(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of photos has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param oldValue the object representing the removed value
	 */
	public void photosRemoved(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String oldValue);

	/**
	 * Called when a value of owner has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param newValue the object representing the new value
	 */	
	public void ownerAdded(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of owner has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param oldValue the object representing the removed value
	 */
	public void ownerRemoved(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of title has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param newValue the object representing the new value
	 */	
	public void titleAdded(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String newValue);

	/**
	 * Called when a value of title has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param oldValue the object representing the removed value
	 */	
	public void titleRemoved(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String oldValue);

	/**
	 * Called when a value of url has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param newValue the object representing the new value
	 */	
	public void urlAdded(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String newValue);

	/**
	 * Called when a value of url has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.PhotoSet.Photoset
	 * @param oldValue the object representing the removed value
	 */	
	public void urlRemoved(edu.mit.dig.saveflickr.model.PhotoSet.Photoset source, java.lang.String oldValue);

}