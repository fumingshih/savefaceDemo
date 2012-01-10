

package edu.mit.dig.saveface.model.foaf;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of edu.mit.dig.saveface.model.foaf.Group to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface GroupListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of status has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void statusAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of status has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void statusRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of icqChatID has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void icqChatIDAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of icqChatID has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void icqChatIDRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of fundedBy has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void fundedByAdded(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of fundedBy has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void fundedByRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of dnaChecksum has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void dnaChecksumAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of dnaChecksum has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void dnaChecksumRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of title has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void titleAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of title has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void titleRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of phone has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void phoneAdded(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of phone has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void phoneRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of maker has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void makerAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Agent newValue);

	/**
	 * Called when a value of maker has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void makerRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Agent oldValue);
		
	/**
	 * Called when a value of mbox__sha1sum has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void mbox__sha1sumAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of mbox__sha1sum has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void mbox__sha1sumRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of msnChatID has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void msnChatIDAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of msnChatID has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void msnChatIDRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of mbox has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void mboxAdded(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of mbox has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void mboxRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of creator has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void creatorAdded(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of creator has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void creatorRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of account has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void accountAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.OnlineAccount newValue);

	/**
	 * Called when a value of account has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void accountRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.OnlineAccount oldValue);
		
	/**
	 * Called when age has changed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 */
	public void ageChanged(edu.mit.dig.saveface.model.foaf.Group source);

	/**
	 * Called when birthday has changed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 */
	public void birthdayChanged(edu.mit.dig.saveface.model.foaf.Group source);

	/**
	 * Called when a value of aimChatID has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void aimChatIDAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of aimChatID has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void aimChatIDRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of givenName has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void givenNameAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of givenName has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void givenNameRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of depiction has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void depictionAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Image newValue);

	/**
	 * Called when a value of depiction has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void depictionRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Image oldValue);
		
	/**
	 * Called when a value of jabberID has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void jabberIDAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of jabberID has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void jabberIDRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of page has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void pageAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Document newValue);

	/**
	 * Called when a value of page has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void pageRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Document oldValue);
		
	/**
	 * Called when a value of skypeID has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void skypeIDAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of skypeID has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void skypeIDRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when gender has changed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 */
	public void genderChanged(edu.mit.dig.saveface.model.foaf.Group source);

	/**
	 * Called when a value of made has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void madeAdded(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of made has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void madeRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of weblog has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void weblogAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Document newValue);

	/**
	 * Called when a value of weblog has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void weblogRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Document oldValue);
		
	/**
	 * Called when a value of holdsAccount has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void holdsAccountAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.OnlineAccount newValue);

	/**
	 * Called when a value of holdsAccount has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void holdsAccountRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.OnlineAccount oldValue);
		
	/**
	 * Called when a value of name has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void nameAdded(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of name has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */	
	public void nameRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of label has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void labelAdded(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of label has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void labelRemoved(edu.mit.dig.saveface.model.foaf.Group source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of member has been added
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param newValue the object representing the new value
	 */	
	public void memberAdded(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Agent newValue);

	/**
	 * Called when a value of member has been removed
	 * @param source the affected instance of edu.mit.dig.saveface.model.foaf.Group
	 * @param oldValue the object representing the removed value
	 */
	public void memberRemoved(edu.mit.dig.saveface.model.foaf.Group source, edu.mit.dig.saveface.model.foaf.Agent oldValue);
		
}