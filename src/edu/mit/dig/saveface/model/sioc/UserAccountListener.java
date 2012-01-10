

package edu.mit.dig.saveface.model.sioc;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.sioc.UserAccount to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface UserAccountListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of feed has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void feedAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of feed has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void feedRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of account has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void accountAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of account has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void accountRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void linkRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of references has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void referencesAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of references has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void referencesRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void dateAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void dateRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of depiction has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void depictionAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of depiction has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void depictionRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__function has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void has__functionAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Role newValue);

	/**
	 * Called when a value of has__function has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void has__functionRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Role oldValue);
		
	/**
	 * Called when a value of last__reply__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void last__reply__dateAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__reply__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void last__reply__dateRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__owner has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void has__ownerAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__owner has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void has__ownerRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of num__replies has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void num__repliesAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, java.lang.String newValue);

	/**
	 * Called when a value of num__replies has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void num__repliesRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, java.lang.String oldValue);

	/**
	 * Called when a value of subject has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void subjectAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of subject has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void subjectRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of num__views has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void num__viewsAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, java.lang.String newValue);

	/**
	 * Called when a value of num__views has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void num__viewsRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of group__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void group__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of group__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void group__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of num__authors has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void num__authorsAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, java.lang.String newValue);

	/**
	 * Called when a value of num__authors has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void num__authorsRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, java.lang.String oldValue);

	/**
	 * Called when a value of has__creator has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void has__creatorAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__creator has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void has__creatorRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of note has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void noteAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of note has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void noteRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of related__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void related__toAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of related__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void related__toRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of links__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void links__toAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of links__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void links__toRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__space has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void has__spaceAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Space newValue);

	/**
	 * Called when a value of has__space has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void has__spaceRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Space oldValue);
		
	/**
	 * Called when a value of last__activity__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void last__activity__dateAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__activity__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void last__activity__dateRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of topic has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void topicAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of topic has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void topicRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__part has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void has__partAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__part has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void has__partRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of scope__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void scope__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Role newValue);

	/**
	 * Called when a value of scope__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void scope__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Role oldValue);
		
	/**
	 * Called when a value of title has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void titleAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of title has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void titleRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__group has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void has__groupAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__group has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void has__groupRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of follows has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void followsAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of follows has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void followsRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of subscriber__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void subscriber__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Container newValue);

	/**
	 * Called when a value of subscriber__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void subscriber__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Container oldValue);
		
	/**
	 * Called when a value of creator__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void creator__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of creator__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void creator__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of moderator__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void moderator__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Forum newValue);

	/**
	 * Called when a value of moderator__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void moderator__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Forum oldValue);
		
	/**
	 * Called when a value of email__sha1 has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void email__sha1Added(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of email__sha1 has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void email__sha1Removed(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of account__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void account__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Agent newValue);

	/**
	 * Called when a value of account__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void account__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Agent oldValue);
		
	/**
	 * Called when a value of first__name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void first__nameAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of first__name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void first__nameRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of member__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void member__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Usergroup newValue);

	/**
	 * Called when a value of member__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void member__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Usergroup oldValue);
		
	/**
	 * Called when a value of administrator__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void administrator__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Site newValue);

	/**
	 * Called when a value of administrator__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void administrator__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Site oldValue);
		
	/**
	 * Called when a value of modifier__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void modifier__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of modifier__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void modifier__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of owner__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void owner__ofAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of owner__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void owner__ofRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of last__name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void last__nameAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */	
	public void last__nameRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of email has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void emailAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of email has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void emailRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of avatar has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param newValue the object representing the new value
	 */	
	public void avatarAdded(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of avatar has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.UserAccount
	 * @param oldValue the object representing the removed value
	 */
	public void avatarRemoved(edu.mit.dig.saveface.model.sioc.UserAccount source, com.ibm.adtech.jastor.Thing oldValue);
		
}