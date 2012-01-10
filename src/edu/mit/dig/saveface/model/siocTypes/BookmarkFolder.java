

package edu.mit.dig.saveface.model.siocTypes;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Bookmark Folder@en ontology class<br>
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this interface.
 * <p>(URI: http://rdfs.org/sioc/types#BookmarkFolder)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	seeAlso : http://www.w3.org/2002/01/bookmark#Bookmark <br>
 * 	label : Bookmark Folder@en <br>
 * 	comment : Describes a shared collection of bookmarks.@en <br>
 * 	isDefinedBy : http://rdfs.org/sioc/types# <br>
 * <br>
 * <br>
 */
public interface BookmarkFolder extends edu.mit.dig.saveface.model.sioc.Container, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://rdfs.org/sioc/types#BookmarkFolder");
	



}