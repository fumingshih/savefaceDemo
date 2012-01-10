

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Mail Message@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#MailMessage)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://rdfs.org/sioc/types#MailingList <br>
 * 	label : Mail Message@en <br>
 * 	comment : Describes an electronic mail message, e.g. a post sent to a mailing list.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface MailMessage extends edu.mit.dig.saveface.model.sioc.Post, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#MailMessage");
	



}