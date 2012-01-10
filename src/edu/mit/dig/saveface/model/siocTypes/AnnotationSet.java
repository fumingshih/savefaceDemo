

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Annotation Set@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#AnnotationSet)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://www.w3.org/2000/10/annotation-ns#Annotation <br>
 * 	label : Annotation Set@en <br>
 * 	comment : Describes a set of annotations, for example, those created by a particular user or related to a particular topic.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface AnnotationSet extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#AnnotationSet");
	



}