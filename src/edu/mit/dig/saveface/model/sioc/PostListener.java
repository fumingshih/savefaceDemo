

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
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.sioc.Post to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PostListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of feed has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void feedAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of feed has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void feedRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of next__version has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void next__versionAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of next__version has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void next__versionRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of reply__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void reply__ofAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of reply__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void reply__ofRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of attachment has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void attachmentAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of attachment has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void attachmentRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of account has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void accountAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of account has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void accountRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of about has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void aboutAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of about has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void aboutRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of link has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void linkAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of link has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void linkRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of embeds__knowledge has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void embeds__knowledgeAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of embeds__knowledge has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void embeds__knowledgeRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of references has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void referencesAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of references has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void referencesRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__status has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__statusAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.siocAccess.Status newValue);

	/**
	 * Called when a value of has__status has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__statusRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.siocAccess.Status oldValue);
		
	/**
	 * Called when a value of date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void dateAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void dateRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of depiction has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void depictionAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of depiction has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void depictionRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__function has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__functionAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Role newValue);

	/**
	 * Called when a value of has__function has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__functionRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Role oldValue);
		
	/**
	 * Called when a value of previous__version has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void previous__versionAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of previous__version has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void previous__versionRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of last__reply__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void last__reply__dateAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__reply__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void last__reply__dateRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__owner has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__ownerAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__owner has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__ownerRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of num__replies has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void num__repliesAdded(edu.mit.dig.saveface.model.sioc.Post source, java.lang.String newValue);

	/**
	 * Called when a value of num__replies has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void num__repliesRemoved(edu.mit.dig.saveface.model.sioc.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of subject has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void subjectAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of subject has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void subjectRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of num__views has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void num__viewsAdded(edu.mit.dig.saveface.model.sioc.Post source, java.lang.String newValue);

	/**
	 * Called when a value of num__views has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void num__viewsRemoved(edu.mit.dig.saveface.model.sioc.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of id has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void idAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of id has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void idRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of group__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void group__ofAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of group__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void group__ofRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of num__authors has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void num__authorsAdded(edu.mit.dig.saveface.model.sioc.Post source, java.lang.String newValue);

	/**
	 * Called when a value of num__authors has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void num__authorsRemoved(edu.mit.dig.saveface.model.sioc.Post source, java.lang.String oldValue);

	/**
	 * Called when a value of has__creator has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__creatorAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__creator has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__creatorRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of note has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void noteAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of note has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void noteRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of content has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void contentAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of content has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void contentRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of related__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void related__toAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of related__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void related__toRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__discussion has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__discussionAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__discussion has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__discussionRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of next__by__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void next__by__dateAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of next__by__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void next__by__dateRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of ip__address has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void ip__addressAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of ip__address has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void ip__addressRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of links__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void links__toAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of links__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void links__toRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void descriptionAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void descriptionRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of addressed__to has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void addressed__toAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of addressed__to has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void addressed__toRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of previous__by__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void previous__by__dateAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of previous__by__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void previous__by__dateRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of latest__version has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void latest__versionAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of latest__version has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void latest__versionRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of has__modifier has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__modifierAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.UserAccount newValue);

	/**
	 * Called when a value of has__modifier has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__modifierRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.UserAccount oldValue);
		
	/**
	 * Called when a value of has__space has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__spaceAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Space newValue);

	/**
	 * Called when a value of has__space has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__spaceRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Space oldValue);
		
	/**
	 * Called when a value of last__activity__date has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void last__activity__dateAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of last__activity__date has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void last__activity__dateRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of topic has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void topicAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of topic has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void topicRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__part has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__partAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__part has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__partRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of scope__of has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void scope__ofAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Role newValue);

	/**
	 * Called when a value of scope__of has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void scope__ofRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Role oldValue);
		
	/**
	 * Called when a value of title has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void titleAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of title has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void titleRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__container has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__containerAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Container newValue);

	/**
	 * Called when a value of has__container has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__containerRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Container oldValue);
		
	/**
	 * Called when a value of has__group has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__groupAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__group has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__groupRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__reply has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void has__replyAdded(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item newValue);

	/**
	 * Called when a value of has__reply has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void has__replyRemoved(edu.mit.dig.saveface.model.sioc.Post source, edu.mit.dig.saveface.model.sioc.Item oldValue);
		
	/**
	 * Called when a value of ns1_title has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void ns1_titleAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of ns1_title has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void ns1_titleRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of content__encoded has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void content__encodedAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of content__encoded has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void content__encodedRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of modified__at has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void modified__atAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of modified__at has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void modified__atRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of ns1_description has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void ns1_descriptionAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of ns1_description has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void ns1_descriptionRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of ns1_subject has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void ns1_subjectAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of ns1_subject has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void ns1_subjectRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of reference has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void referenceAdded(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of reference has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */
	public void referenceRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of created__at has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param newValue the object representing the new value
	 */	
	public void created__atAdded(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of created__at has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.sioc.Post
	 * @param oldValue the object representing the removed value
	 */	
	public void created__atRemoved(edu.mit.dig.saveface.model.sioc.Post source, com.hp.hpl.jena.rdf.model.Literal oldValue);

}