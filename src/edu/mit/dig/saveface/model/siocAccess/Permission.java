

package edu.mit.dig.saveface.model.siocAccess;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Permission@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocAccess.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/access#Permission)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Permission@en <br>
 * 	comment : A Permission describes a type of action that can be performed on an object that is within the scope of a Role, e.g. a Site, Forum, etc.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/access# <br>
 * <br>
 * <br>
 */
public interface Permission extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/access#Permission");
	



}