

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Video Channel@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#VideoChannel)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://purl.org/dc/dcmitype/MovingImage <br>
 * 	label : Video Channel@en <br>
 * 	comment : Describes a channel for distributing videos (moving image) files, for example, a video podcast.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface VideoChannel extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#VideoChannel");
	



}