

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Mailing List@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#MailingList)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://rdfs.org/sioc/types#MailMessage <br>
 * 	label : Mailing List@en <br>
 * 	comment : Describes an electronic mailing list.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface MailingList extends edu.mit.dig.saveface.model.sioc.Forum, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#MailingList");
	



}