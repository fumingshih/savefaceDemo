

package edu.mit.dig.saveface.model.Page;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.Page.Page to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PageListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of username has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void usernameAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of username has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void usernameRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of fanCount has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void fanCountAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.Long newValue);

	/**
	 * Called when a value of fanCount has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void fanCountRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.Long oldValue);

	/**
	 * Called when a value of companyOverview has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void companyOverviewAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of companyOverview has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void companyOverviewRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of website has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void websiteAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of website has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void websiteRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of category has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void categoryAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of category has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void categoryRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of products has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void productsAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of products has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void productsRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of createdTime has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void createdTimeAdded(edu.mit.dig.saveface.model.Page.Page source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of createdTime has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void createdTimeRemoved(edu.mit.dig.saveface.model.Page.Page source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of mission has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void missionAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of mission has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void missionRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of founded has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void foundedAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of founded has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void foundedRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of picture has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void pictureAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of picture has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void pictureRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void linkRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.Page.Page source, java.lang.String newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.Page.Page
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.Page.Page source, java.lang.String oldValue);

}