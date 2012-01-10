

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Resume Bank@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#ResumeBank)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://captsolo.net/semweb/resume/cv.rdfs#Resume <br>
 * 	label : Resume Bank@en <br>
 * 	comment : Describes a collection of resumes.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface ResumeBank extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#ResumeBank");
	



}