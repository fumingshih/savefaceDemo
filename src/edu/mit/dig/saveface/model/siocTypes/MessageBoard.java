

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Message Board@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#MessageBoard)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://rdfs.org/sioc/types#BoardPost <br>
 * 	label : Message Board@en <br>
 * 	comment : Describes a message board, also known as an online bulletin board or discussion forum.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface MessageBoard extends edu.mit.dig.saveface.model.sioc.Forum, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#MessageBoard");
	



}