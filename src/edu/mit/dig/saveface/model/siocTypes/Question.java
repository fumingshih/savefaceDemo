

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Question@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#Question)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Question@en <br>
 * 	comment : A Post that asks a Question.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface Question extends edu.mit.dig.saveface.model.sioc.Post, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#Question");
	



}