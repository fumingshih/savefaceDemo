

package edu.mit.dig.saveface.model.Post;

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
 * <p>(URI: http://www.foolme.csail.mit.edu/ns/saveface/post#)</p>
 * <br>
 * <br>
 * <br>
 */
public class Factory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of Post.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Post
	 * @param model the Jena Model.
	 */
	public static Post createPost(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.Post.PostImpl.createPost(resource,model);
	}
	
	/**
	 * Create a new instance of Post.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Post
	 * @param model the Jena Model.
	 */
	public static Post createPost(String uri, Model model) throws JastorException {
		Post obj = edu.mit.dig.saveface.model.Post.PostImpl.createPost(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Post.  Leaves the model unchanged.
	 * @param uri The uri of the Post
	 * @param model the Jena Model.
	 */
	public static Post getPost(String uri, Model model) throws JastorException {
		return getPost(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Post.  Leaves the model unchanged.
	 * @param resource The resource of the Post
	 * @param model the Jena Model.
	 */
	public static Post getPost(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.Post.Post.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.Post.PostImpl obj = (edu.mit.dig.saveface.model.Post.PostImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.Post.PostImpl.getPost(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Post for every resource in the model with rdf:Type http://www.foolme.csail.mit.edu/ns/saveface/Post.owl#Post
	 * @param model the Jena Model
	 * @return a List of Post
	 */
	public static java.util.List getAllPost(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Post.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPost(stmt.getSubject(),model));
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
		if (res.hasProperty(RDF.type,model.getResource("http://www.foolme.csail.mit.edu/ns/saveface/Post.owl#Post"))) {
			return getPost(res,model);
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
		if (type.equals(edu.mit.dig.saveface.model.Post.Post.TYPE)) {
			types.add(edu.mit.dig.saveface.model.Post.Post.class);
		}
		return types;
	}
}