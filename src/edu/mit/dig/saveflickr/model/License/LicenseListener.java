

package edu.mit.dig.saveflickr.model.License;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.License.License to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface LicenseListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.License.License
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveflickr.model.License.License source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.License.License
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveflickr.model.License.License source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.License.License
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.License.License source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.License.License
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.License.License source, java.lang.String oldValue);

	/**
	 * Called when a value of url has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.License.License
	 * @param newValue the object representing the new value
	 */	
	public void urlAdded(edu.mit.dig.saveflickr.model.License.License source, java.lang.String newValue);

	/**
	 * Called when a value of url has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.License.License
	 * @param oldValue the object representing the removed value
	 */	
	public void urlRemoved(edu.mit.dig.saveflickr.model.License.License source, java.lang.String oldValue);

}