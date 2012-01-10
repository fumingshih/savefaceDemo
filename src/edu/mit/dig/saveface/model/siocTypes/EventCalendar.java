

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Event Calendar@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#EventCalendar)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://www.w3.org/2002/12/cal/icaltzd#VEVENT <br>
 * 	label : Event Calendar@en <br>
 * 	comment : Describes a calendar of events.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface EventCalendar extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#EventCalendar");
	



}