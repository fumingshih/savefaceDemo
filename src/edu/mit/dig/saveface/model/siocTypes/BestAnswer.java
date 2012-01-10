

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Best Answer@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#BestAnswer)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Best Answer@en <br>
 * 	comment : A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface BestAnswer extends edu.mit.dig.saveface.model.sioc.Post, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#BestAnswer");
	



}