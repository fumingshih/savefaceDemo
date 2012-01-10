

package edu.mit.dig.saveflickr.model.Permission;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.Permission.Permission to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PermissionListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of friendFlag has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param newValue the object representing the new value
	 */	
	public void friendFlagAdded(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.Boolean newValue);

	/**
	 * Called when a value of friendFlag has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param oldValue the object representing the removed value
	 */	
	public void friendFlagRemoved(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.Boolean oldValue);

	/**
	 * Called when a value of publicFlag has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param newValue the object representing the new value
	 */	
	public void publicFlagAdded(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.Boolean newValue);

	/**
	 * Called when a value of publicFlag has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param oldValue the object representing the removed value
	 */	
	public void publicFlagRemoved(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.Boolean oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.String oldValue);

	/**
	 * Called when a value of familyFlag has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param newValue the object representing the new value
	 */	
	public void familyFlagAdded(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.Boolean newValue);

	/**
	 * Called when a value of familyFlag has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Permission.Permission
	 * @param oldValue the object representing the removed value
	 */	
	public void familyFlagRemoved(edu.mit.dig.saveflickr.model.Permission.Permission source, java.lang.Boolean oldValue);

}