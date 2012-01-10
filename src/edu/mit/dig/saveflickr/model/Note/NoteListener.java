

package edu.mit.dig.saveflickr.model.Note;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveflickr.model.Note.Note to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface NoteListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of text has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void textAdded(edu.mit.dig.saveflickr.model.Note.Note source, java.lang.String newValue);

	/**
	 * Called when a value of text has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void textRemoved(edu.mit.dig.saveflickr.model.Note.Note source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Note.Note
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveflickr.model.Note.Note source, java.lang.String newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveflickr.model.Note.Note
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveflickr.model.Note.Note source, java.lang.String oldValue);

}