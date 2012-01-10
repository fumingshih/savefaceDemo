

package edu.mit.dig.saveflickr.model.Comment;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.Comment.Comment to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface CommentListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String oldValue);

	/**
	 * Called when a value of authorname has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void authornameAdded(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String newValue);

	/**
	 * Called when a value of authorname has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void authornameRemoved(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String oldValue);

	/**
	 * Called when a value of datecreate has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void datecreateAdded(edu.mit.dig.saveflickr.model.Comment.Comment source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime newValue);

	/**
	 * Called when a value of datecreate has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void datecreateRemoved(edu.mit.dig.saveflickr.model.Comment.Comment source, com.hp.hpl.jena.datatypes.xsd.XSDDateTime oldValue);

	/**
	 * Called when a value of author has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void authorAdded(edu.mit.dig.saveflickr.model.Comment.Comment source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of author has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */
	public void authorRemoved(edu.mit.dig.saveflickr.model.Comment.Comment source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of text has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void textAdded(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String newValue);

	/**
	 * Called when a value of text has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void textRemoved(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String oldValue);

	/**
	 * Called when a value of permalink has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param newValue the object representing the new value
	 */	
	public void permalinkAdded(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String newValue);

	/**
	 * Called when a value of permalink has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Comment.Comment
	 * @param oldValue the object representing the removed value
	 */	
	public void permalinkRemoved(edu.mit.dig.saveflickr.model.Comment.Comment source, java.lang.String oldValue);

}