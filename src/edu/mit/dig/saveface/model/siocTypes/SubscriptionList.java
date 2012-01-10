

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Subscription List@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#SubscriptionList)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://atomowl.org/ontologies/atomrdf#Feed <br>
 * 	label : Subscription List@en <br>
 * 	comment : Describes a shared set of feed subscriptions.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface SubscriptionList extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#SubscriptionList");
	



}