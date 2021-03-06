

package edu.mit.dig.saveface.model.Album;

import com.ibm.adtech.jastor.*;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;

/**
 * Factory for instantiating objects for ontology classes in the  ontology.  The
 * get methods leave the model unchanged and return a Java view of the object in the model.  The create methods
 * may add certain baseline properties to the model such as rdf:type and any properties with hasValue restrictions.
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/album#)</p>
 * <br>
 * <br>
 * <br>
 */
public class Factory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of Album.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Album
	 * @param model the Jena Model.
	 */
	public static Album createAlbum(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.Album.AlbumImpl.createAlbum(resource,model);
	}
	
	/**
	 * Create a new instance of Album.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Album
	 * @param model the Jena Model.
	 */
	public static Album createAlbum(String uri, Model model) throws JastorException {
		Album obj = edu.mit.dig.saveface.model.Album.AlbumImpl.createAlbum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Album.  Leaves the model unchanged.
	 * @param uri The uri of the Album
	 * @param model the Jena Model.
	 */
	public static Album getAlbum(String uri, Model model) throws JastorException {
		return getAlbum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Album.  Leaves the model unchanged.
	 * @param resource The resource of the Album
	 * @param model the Jena Model.
	 */
	public static Album getAlbum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.Album.Album.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.Album.AlbumImpl obj = (edu.mit.dig.saveface.model.Album.AlbumImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.Album.AlbumImpl.getAlbum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Album for every resource in the model with rdf:Type http://foolme.csail.mit.edu/ns/saveface/Album.owl#Album
	 * @param model the Jena Model
	 * @return a List of Album
	 */
	public static java.util.List getAllAlbum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Album.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAlbum(stmt.getSubject(),model));
		}
		return list;
	}
	
	
	/**
	 * Returns an instance of an interface for the given Resource.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(com.hp.hpl.jena.rdf.model.Resource res, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		if (res.hasProperty(RDF.type,model.getResource("http://foolme.csail.mit.edu/ns/saveface/Album.owl#Album"))) {
			return getAlbum(res,model);
		}
		return new ThingImpl(res,model);
	}
	
	/**
	 * Returns an instance of an interface for the given Resource URI.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(String uri, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		return getThing(model.getResource(uri),model);
	}

	/**
	 * Return a list of compatible interfaces for the given type.  Searches through all ontology classes
	 * in the  ontology.  The list is sorted according to the topological sort
	 * of the class hierarchy
	 * @return a List of type java.lang.Class
	 */
	public static java.util.List listCompatibleInterfaces (com.hp.hpl.jena.rdf.model.Resource type) {
		java.util.List types = new java.util.ArrayList();
		if (type.equals(edu.mit.dig.saveface.model.Album.Album.TYPE)) {
			types.add(edu.mit.dig.saveface.model.Album.Album.class);
		}
		return types;
	}
}