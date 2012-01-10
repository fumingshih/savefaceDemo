

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Wiki@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#Wiki)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://rdfs.org/sioc/types#WikiArticle <br>
 * 	label : Wiki@en <br>
 * 	comment : Describes a wiki space.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface Wiki extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#Wiki");
	



}