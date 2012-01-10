

package edu.mit.dig.saveface.model.geo;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.geo.Point to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PointListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of lat has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param newValue the object representing the new value
	 */	
	public void latAdded(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of lat has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param oldValue the object representing the removed value
	 */	
	public void latRemoved(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of location has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param newValue the object representing the new value
	 */	
	public void locationAdded(edu.mit.dig.saveface.model.geo.Point source, edu.mit.dig.saveface.model.geo.SpatialThing newValue);

	/**
	 * Called when a value of location has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param oldValue the object representing the removed value
	 */
	public void locationRemoved(edu.mit.dig.saveface.model.geo.Point source, edu.mit.dig.saveface.model.geo.SpatialThing oldValue);
		
	/**
	 * Called when a value of alt has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param newValue the object representing the new value
	 */	
	public void altAdded(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of alt has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param oldValue the object representing the removed value
	 */	
	public void altRemoved(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of _long has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param newValue the object representing the new value
	 */	
	public void _longAdded(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of _long has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param oldValue the object representing the removed value
	 */	
	public void _longRemoved(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of lat__long has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param newValue the object representing the new value
	 */	
	public void lat__longAdded(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of lat__long has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.geo.Point
	 * @param oldValue the object representing the removed value
	 */	
	public void lat__longRemoved(edu.mit.dig.saveface.model.geo.Point source, com.hp.hpl.jena.rdf.model.Literal oldValue);

}