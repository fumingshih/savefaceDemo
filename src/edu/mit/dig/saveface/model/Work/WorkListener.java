

package edu.mit.dig.saveface.model.Work;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Work.Work to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface WorkListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of position has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param newValue the object representing the new value
	 */	
	public void positionAdded(edu.mit.dig.saveface.model.Work.Work source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of position has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param oldValue the object representing the removed value
	 */
	public void positionRemoved(edu.mit.dig.saveface.model.Work.Work source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of employer has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param newValue the object representing the new value
	 */	
	public void employerAdded(edu.mit.dig.saveface.model.Work.Work source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of employer has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param oldValue the object representing the removed value
	 */
	public void employerRemoved(edu.mit.dig.saveface.model.Work.Work source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of location has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param newValue the object representing the new value
	 */	
	public void locationAdded(edu.mit.dig.saveface.model.Work.Work source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of location has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param oldValue the object representing the removed value
	 */
	public void locationRemoved(edu.mit.dig.saveface.model.Work.Work source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of startDate has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param newValue the object representing the new value
	 */	
	public void startDateAdded(edu.mit.dig.saveface.model.Work.Work source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of startDate has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param oldValue the object representing the removed value
	 */	
	public void startDateRemoved(edu.mit.dig.saveface.model.Work.Work source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of endDate has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param newValue the object representing the new value
	 */	
	public void endDateAdded(edu.mit.dig.saveface.model.Work.Work source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of endDate has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Work.Work
	 * @param oldValue the object representing the removed value
	 */	
	public void endDateRemoved(edu.mit.dig.saveface.model.Work.Work source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

}