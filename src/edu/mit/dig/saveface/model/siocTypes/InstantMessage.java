

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Instant Message@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#InstantMessage)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://rdfs.org/sioc/types#ChatChannel <br>
 * 	label : Instant Message@en <br>
 * 	comment : Describes an instant message, e.g. sent via Jabber.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface InstantMessage extends edu.mit.dig.saveface.model.sioc.Post, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#InstantMessage");
	



}