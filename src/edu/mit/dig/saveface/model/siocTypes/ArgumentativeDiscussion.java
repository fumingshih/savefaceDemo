

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Argumentative Discussion@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#ArgumentativeDiscussion)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://purl.org/ibis#Idea <br>
 * 	label : Argumentative Discussion@en <br>
 * 	comment : Describes a discussion area where logical arguments can take place.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface ArgumentativeDiscussion extends edu.mit.dig.saveface.model.sioc.Forum, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#ArgumentativeDiscussion");
	



}