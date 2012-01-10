

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Audio Channel@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#AudioChannel)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://purl.org/dc/dcmitype/Sound <br>
 * 	label : Audio Channel@en <br>
 * 	comment : Describes a channel for distributing audio or sound files, for example, a podcast.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface AudioChannel extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#AudioChannel");
	



}