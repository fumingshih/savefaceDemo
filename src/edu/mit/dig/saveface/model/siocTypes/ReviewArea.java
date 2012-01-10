

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Review Area@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#ReviewArea)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://www.isi.edu/webscripter/communityreview/abstract-review-o#Review, http://purl.org/stuff/rev#Review <br>
 * 	label : Review Area@en <br>
 * 	comment : Describes an area where reviews are posted.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface ReviewArea extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#ReviewArea");
	



}