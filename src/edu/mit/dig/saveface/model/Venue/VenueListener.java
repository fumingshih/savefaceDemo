

package edu.mit.dig.saveface.model.Venue;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Venue.Venue to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface VenueListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of street has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param newValue the object representing the new value
	 */	
	public void streetAdded(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String newValue);

	/**
	 * Called when a value of street has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param oldValue the object representing the removed value
	 */	
	public void streetRemoved(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String oldValue);

	/**
	 * Called when a value of longitude has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param newValue the object representing the new value
	 */	
	public void longitudeAdded(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.Double newValue);

	/**
	 * Called when a value of longitude has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param oldValue the object representing the removed value
	 */	
	public void longitudeRemoved(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.Double oldValue);

	/**
	 * Called when a value of state has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param newValue the object representing the new value
	 */	
	public void stateAdded(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String newValue);

	/**
	 * Called when a value of state has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param oldValue the object representing the removed value
	 */	
	public void stateRemoved(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String oldValue);

	/**
	 * Called when a value of country has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param newValue the object representing the new value
	 */	
	public void countryAdded(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String newValue);

	/**
	 * Called when a value of country has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param oldValue the object representing the removed value
	 */	
	public void countryRemoved(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String oldValue);

	/**
	 * Called when a value of city has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param newValue the object representing the new value
	 */	
	public void cityAdded(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String newValue);

	/**
	 * Called when a value of city has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param oldValue the object representing the removed value
	 */	
	public void cityRemoved(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.String oldValue);

	/**
	 * Called when a value of latitude has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param newValue the object representing the new value
	 */	
	public void latitudeAdded(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.Double newValue);

	/**
	 * Called when a value of latitude has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Venue.Venue
	 * @param oldValue the object representing the removed value
	 */	
	public void latitudeRemoved(edu.mit.dig.saveface.model.Venue.Venue source, java.lang.Double oldValue);

}