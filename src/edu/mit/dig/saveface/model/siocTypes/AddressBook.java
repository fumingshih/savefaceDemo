

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Address Book@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#AddressBook)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://xmlns.com/foaf/0.1/Agent <br>
 * 	label : Address Book@en <br>
 * 	comment : Describes a collection of personal or organisational addresses.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface AddressBook extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#AddressBook");
	



}