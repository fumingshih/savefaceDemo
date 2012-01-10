

package edu.mit.dig.saveface.model.Education;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Education.Education to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface EducationListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of type has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param newValue the object representing the new value
	 */	
	public void typeAdded(edu.mit.dig.saveface.model.Education.Education source, java.lang.String newValue);

	/**
	 * Called when a value of type has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param oldValue the object representing the removed value
	 */	
	public void typeRemoved(edu.mit.dig.saveface.model.Education.Education source, java.lang.String oldValue);

	/**
	 * Called when a value of year has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param newValue the object representing the new value
	 */	
	public void yearAdded(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of year has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param oldValue the object representing the removed value
	 */
	public void yearRemoved(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of school has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param newValue the object representing the new value
	 */	
	public void schoolAdded(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of school has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param oldValue the object representing the removed value
	 */
	public void schoolRemoved(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of degree has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param newValue the object representing the new value
	 */	
	public void degreeAdded(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of degree has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param oldValue the object representing the removed value
	 */
	public void degreeRemoved(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of concentration has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param newValue the object representing the new value
	 */	
	public void concentrationAdded(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of concentration has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Education.Education
	 * @param oldValue the object representing the removed value
	 */
	public void concentrationRemoved(edu.mit.dig.saveface.model.Education.Education source, com.ibm.adtech.jastor.Thing oldValue);
		
}