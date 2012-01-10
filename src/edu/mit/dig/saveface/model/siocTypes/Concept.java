

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Concept ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://www.w3.org/2008/05/skos#Concept)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Concept extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.w3.org/2008/05/skos#Concept");
	



}