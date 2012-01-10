

package edu.mit.dig.saveface.model.siocAccess;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Status@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocAccess.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/access#Status)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Status@en <br>
 * 	comment : A Status can be assign to content Item to indicate its publication status (e.g. public, draft, etc.). This class is used to define different types of status.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/access# <br>
 * <br>
 * <br>
 */
public interface Status extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/access#Status");
	



}