

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Image Gallery@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#ImageGallery)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://www.w3.org/2003/12/exif/ns/IFD <br>
 * 	label : Image Gallery@en <br>
 * 	comment : Describes an image gallery, for example, a photo album.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface ImageGallery extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#ImageGallery");
	



}