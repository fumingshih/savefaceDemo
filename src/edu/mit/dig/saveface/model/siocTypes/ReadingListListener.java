

package edu.mit.dig.saveface.model.siocTypes;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.siocTypes.ReadingList to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface ReadingListListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of last__item__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void last__item__dateAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__item__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void last__item__dateRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of feed has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void feedAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of feed has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void feedRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of account has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void accountAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of account has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void accountRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__subscriber has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__subscriberAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__subscriber has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__subscriberRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of has__parent has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__parentAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Container newValue);

	/**
	 * Called when a value of has__parent has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__parentRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Container oldValue);
		
	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void linkRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of references has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void referencesAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of references has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void referencesRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of parent__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void parent__ofAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Container newValue);

	/**
	 * Called when a value of parent__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void parent__ofRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Container oldValue);
		
	/**
	 * Called when a value of date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void dateAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void dateRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of depiction has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void depictionAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of depiction has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void depictionRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__function has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__functionAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Role newValue);

	/**
	 * Called when a value of has__function has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__functionRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Role oldValue);
		
	/**
	 * Called when a value of last__reply__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void last__reply__dateAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__reply__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void last__reply__dateRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__owner has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__ownerAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__owner has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__ownerRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of num__replies has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void num__repliesAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String newValue);

	/**
	 * Called when a value of num__replies has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void num__repliesRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String oldValue);

	/**
	 * Called when a value of subject has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void subjectAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of subject has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void subjectRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of num__views has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void num__viewsAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String newValue);

	/**
	 * Called when a value of num__views has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void num__viewsRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of group__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void group__ofAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of group__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void group__ofRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of num__authors has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void num__authorsAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String newValue);

	/**
	 * Called when a value of num__authors has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void num__authorsRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String oldValue);

	/**
	 * Called when a value of has__creator has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__creatorAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__creator has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__creatorRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of note has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void noteAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of note has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void noteRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of related__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void related__toAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of related__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void related__toRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of container__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void container__ofAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of container__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void container__ofRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of links__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void links__toAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of links__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void links__toRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of num__items has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void num__itemsAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String newValue);

	/**
	 * Called when a value of num__items has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void num__itemsRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, java.lang.String oldValue);

	/**
	 * Called when a value of has__space has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__spaceAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Space newValue);

	/**
	 * Called when a value of has__space has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__spaceRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Space oldValue);
		
	/**
	 * Called when a value of last__activity__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void last__activity__dateAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__activity__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void last__activity__dateRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of topic has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void topicAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of topic has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void topicRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__part has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__partAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__part has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__partRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of scope__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void scope__ofAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Role newValue);

	/**
	 * Called when a value of scope__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void scope__ofRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, edu.mit.dig.saveface.model.sioc.Role oldValue);
		
	/**
	 * Called when a value of title has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void titleAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of title has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */	
	public void titleRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__group has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param newValue the object representing the new value
	 */	
	public void has__groupAdded(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__group has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.siocTypes.ReadingList
	 * @param oldValue the object representing the removed value
	 */
	public void has__groupRemoved(edu.mit.dig.saveface.model.siocTypes.ReadingList source, com.ibm.adtech.jastor.Thing oldValue);
		
}