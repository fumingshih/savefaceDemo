

package edu.mit.dig.saveface.model.foaf;

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
 * <p>(URI: http://xmlns.com/foaf/0.1/)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	title : Friend of a Friend (FOAF) vocabulary <br>
 * 	description : The Friend of a Friend (FOAF) RDF vocabulary, described using W3C RDF Schema and the Web Ontology Language. <br>
 * <br>
 */
public class Factory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of Person.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Person
	 * @param model the Jena Model.
	 */
	public static Person createPerson(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.PersonImpl.createPerson(resource,model);
	}
	
	/**
	 * Create a new instance of Person.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Person
	 * @param model the Jena Model.
	 */
	public static Person createPerson(String uri, Model model) throws JastorException {
		Person obj = edu.mit.dig.saveface.model.foaf.PersonImpl.createPerson(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Person.  Leaves the model unchanged.
	 * @param uri The uri of the Person
	 * @param model the Jena Model.
	 */
	public static Person getPerson(String uri, Model model) throws JastorException {
		return getPerson(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Person.  Leaves the model unchanged.
	 * @param resource The resource of the Person
	 * @param model the Jena Model.
	 */
	public static Person getPerson(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Person.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.PersonImpl obj = (edu.mit.dig.saveface.model.foaf.PersonImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.PersonImpl.getPerson(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Person for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Person
	 * @param model the Jena Model
	 * @return a List of Person
	 */
	public static java.util.List getAllPerson(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Person.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPerson(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Class.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Class
	 * @param model the Jena Model.
	 */
	public static Class createClass(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.ClassImpl.createClass(resource,model);
	}
	
	/**
	 * Create a new instance of Class.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Class
	 * @param model the Jena Model.
	 */
	public static Class createClass(String uri, Model model) throws JastorException {
		Class obj = edu.mit.dig.saveface.model.foaf.ClassImpl.createClass(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Class.  Leaves the model unchanged.
	 * @param uri The uri of the Class
	 * @param model the Jena Model.
	 */
	public static Class getClass(String uri, Model model) throws JastorException {
		return getClass(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Class.  Leaves the model unchanged.
	 * @param resource The resource of the Class
	 * @param model the Jena Model.
	 */
	public static Class getClass(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Class.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.ClassImpl obj = (edu.mit.dig.saveface.model.foaf.ClassImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.ClassImpl.getClass(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Class for every resource in the model with rdf:Type http://www.w3.org/2000/01/rdf-schema#Class
	 * @param model the Jena Model
	 * @return a List of Class
	 */
	public static java.util.List getAllClass(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Class.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getClass(stmt.getSubject(),model));
		}
		return list;
	}
	

//	/**
//	 * Create a new instance of Agent.  Adds the rdf:type property for the given resource to the model.
//	 * @param resource The resource of the Agent
//	 * @param model the Jena Model.
//	 */
//	public static Agent createAgent(Resource resource, Model model) throws JastorException {
//		return edu.mit.dig.saveface.model.foaf.AgentImpl.createAgent(resource,model);
//	}
//	
//	/**
//	 * Create a new instance of Agent.  Adds the rdf:type property for the given resource to the model.
//	 * @param uri The uri of the Agent
//	 * @param model the Jena Model.
//	 */
//	public static Agent createAgent(String uri, Model model) throws JastorException {
//		Agent obj = edu.mit.dig.saveface.model.foaf.AgentImpl.createAgent(model.createResource(uri), model);
//		return obj;
//	}
//	
//	/**
//	 * Create a new instance of Agent.  Leaves the model unchanged.
//	 * @param uri The uri of the Agent
//	 * @param model the Jena Model.
//	 */
//	public static Agent getAgent(String uri, Model model) throws JastorException {
//		return getAgent(model.createResource(uri),model);
//	}
//	
//	/**
//	 * Create a new instance of Agent.  Leaves the model unchanged.
//	 * @param resource The resource of the Agent
//	 * @param model the Jena Model.
//	 */
//	public static Agent getAgent(Resource resource, Model model) throws JastorException {
//		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Agent.class.hashCode()) + resource.toString();
//		edu.mit.dig.saveface.model.foaf.AgentImpl obj = (edu.mit.dig.saveface.model.foaf.AgentImpl)objects.get(code);
//		if (obj == null) {
//			obj = edu.mit.dig.saveface.model.foaf.AgentImpl.getAgent(resource, model);
//			if (obj == null)
//				return null;
//			objects.put(code, obj);
//		}
//		return obj;
//	}
//	
//	/**
//	 * Return an instance of Agent for every resource in the model with rdf:Type http://purl.org/dc/terms/Agent
//	 * @param model the Jena Model
//	 * @return a List of Agent
//	 */
//	public static java.util.List getAllAgent(Model model) throws JastorException {
//		StmtIterator it = model.listStatements(null,RDF.type,Agent.TYPE);
//		java.util.List list = new java.util.ArrayList();
//		while (it.hasNext()) {
//			Statement stmt = it.nextStatement();
//			list.add(getAgent(stmt.getSubject(),model));
//		}
//		return list;
//	}
//	

	/**
	 * Create a new instance of PersonalProfileDocument.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PersonalProfileDocument
	 * @param model the Jena Model.
	 */
	public static PersonalProfileDocument createPersonalProfileDocument(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.PersonalProfileDocumentImpl.createPersonalProfileDocument(resource,model);
	}
	
	/**
	 * Create a new instance of PersonalProfileDocument.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PersonalProfileDocument
	 * @param model the Jena Model.
	 */
	public static PersonalProfileDocument createPersonalProfileDocument(String uri, Model model) throws JastorException {
		PersonalProfileDocument obj = edu.mit.dig.saveface.model.foaf.PersonalProfileDocumentImpl.createPersonalProfileDocument(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of PersonalProfileDocument.  Leaves the model unchanged.
	 * @param uri The uri of the PersonalProfileDocument
	 * @param model the Jena Model.
	 */
	public static PersonalProfileDocument getPersonalProfileDocument(String uri, Model model) throws JastorException {
		return getPersonalProfileDocument(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of PersonalProfileDocument.  Leaves the model unchanged.
	 * @param resource The resource of the PersonalProfileDocument
	 * @param model the Jena Model.
	 */
	public static PersonalProfileDocument getPersonalProfileDocument(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.PersonalProfileDocument.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.PersonalProfileDocumentImpl obj = (edu.mit.dig.saveface.model.foaf.PersonalProfileDocumentImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.PersonalProfileDocumentImpl.getPersonalProfileDocument(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PersonalProfileDocument for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/PersonalProfileDocument
	 * @param model the Jena Model
	 * @return a List of PersonalProfileDocument
	 */
	public static java.util.List getAllPersonalProfileDocument(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,PersonalProfileDocument.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPersonalProfileDocument(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Project.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Project
	 * @param model the Jena Model.
	 */
	public static Project createProject(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.ProjectImpl.createProject(resource,model);
	}
	
	/**
	 * Create a new instance of Project.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Project
	 * @param model the Jena Model.
	 */
	public static Project createProject(String uri, Model model) throws JastorException {
		Project obj = edu.mit.dig.saveface.model.foaf.ProjectImpl.createProject(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Project.  Leaves the model unchanged.
	 * @param uri The uri of the Project
	 * @param model the Jena Model.
	 */
	public static Project getProject(String uri, Model model) throws JastorException {
		return getProject(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Project.  Leaves the model unchanged.
	 * @param resource The resource of the Project
	 * @param model the Jena Model.
	 */
	public static Project getProject(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Project.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.ProjectImpl obj = (edu.mit.dig.saveface.model.foaf.ProjectImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.ProjectImpl.getProject(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Project for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Project
	 * @param model the Jena Model
	 * @return a List of Project
	 */
	public static java.util.List getAllProject(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Project.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getProject(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of OnlineChatAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the OnlineChatAccount
	 * @param model the Jena Model.
	 */
	public static OnlineChatAccount createOnlineChatAccount(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.OnlineChatAccountImpl.createOnlineChatAccount(resource,model);
	}
	
	/**
	 * Create a new instance of OnlineChatAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the OnlineChatAccount
	 * @param model the Jena Model.
	 */
	public static OnlineChatAccount createOnlineChatAccount(String uri, Model model) throws JastorException {
		OnlineChatAccount obj = edu.mit.dig.saveface.model.foaf.OnlineChatAccountImpl.createOnlineChatAccount(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of OnlineChatAccount.  Leaves the model unchanged.
	 * @param uri The uri of the OnlineChatAccount
	 * @param model the Jena Model.
	 */
	public static OnlineChatAccount getOnlineChatAccount(String uri, Model model) throws JastorException {
		return getOnlineChatAccount(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of OnlineChatAccount.  Leaves the model unchanged.
	 * @param resource The resource of the OnlineChatAccount
	 * @param model the Jena Model.
	 */
	public static OnlineChatAccount getOnlineChatAccount(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.OnlineChatAccount.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.OnlineChatAccountImpl obj = (edu.mit.dig.saveface.model.foaf.OnlineChatAccountImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.OnlineChatAccountImpl.getOnlineChatAccount(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of OnlineChatAccount for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/OnlineChatAccount
	 * @param model the Jena Model
	 * @return a List of OnlineChatAccount
	 */
	public static java.util.List getAllOnlineChatAccount(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,OnlineChatAccount.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getOnlineChatAccount(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of OnlineAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the OnlineAccount
	 * @param model the Jena Model.
	 */
	public static OnlineAccount createOnlineAccount(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.OnlineAccountImpl.createOnlineAccount(resource,model);
	}
	
	/**
	 * Create a new instance of OnlineAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the OnlineAccount
	 * @param model the Jena Model.
	 */
	public static OnlineAccount createOnlineAccount(String uri, Model model) throws JastorException {
		OnlineAccount obj = edu.mit.dig.saveface.model.foaf.OnlineAccountImpl.createOnlineAccount(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of OnlineAccount.  Leaves the model unchanged.
	 * @param uri The uri of the OnlineAccount
	 * @param model the Jena Model.
	 */
	public static OnlineAccount getOnlineAccount(String uri, Model model) throws JastorException {
		return getOnlineAccount(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of OnlineAccount.  Leaves the model unchanged.
	 * @param resource The resource of the OnlineAccount
	 * @param model the Jena Model.
	 */
	public static OnlineAccount getOnlineAccount(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.OnlineAccount.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.OnlineAccountImpl obj = (edu.mit.dig.saveface.model.foaf.OnlineAccountImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.OnlineAccountImpl.getOnlineAccount(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of OnlineAccount for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/OnlineAccount
	 * @param model the Jena Model
	 * @return a List of OnlineAccount
	 */
	public static java.util.List getAllOnlineAccount(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,OnlineAccount.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getOnlineAccount(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of _Thing.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing create_Thing(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf._ThingImpl.create_Thing(resource,model);
	}
	
	/**
	 * Create a new instance of _Thing.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing create_Thing(String uri, Model model) throws JastorException {
		_Thing obj = edu.mit.dig.saveface.model.foaf._ThingImpl.create_Thing(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of _Thing.  Leaves the model unchanged.
	 * @param uri The uri of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing get_Thing(String uri, Model model) throws JastorException {
		return get_Thing(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of _Thing.  Leaves the model unchanged.
	 * @param resource The resource of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing get_Thing(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf._Thing.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf._ThingImpl obj = (edu.mit.dig.saveface.model.foaf._ThingImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf._ThingImpl.get_Thing(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of _Thing for every resource in the model with rdf:Type http://www.w3.org/2002/07/owl#Thing
	 * @param model the Jena Model
	 * @return a List of _Thing
	 */
	public static java.util.List getAll_Thing(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,_Thing.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(get_Thing(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Agent.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Agent
	 * @param model the Jena Model.
	 */
	public static Agent createAgent(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.AgentImpl.createAgent(resource,model);
	}
	
	/**
	 * Create a new instance of Agent.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Agent
	 * @param model the Jena Model.
	 */
	public static Agent createAgent(String uri, Model model) throws JastorException {
		Agent obj = edu.mit.dig.saveface.model.foaf.AgentImpl.createAgent(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Agent.  Leaves the model unchanged.
	 * @param uri The uri of the Agent
	 * @param model the Jena Model.
	 */
	public static Agent getAgent(String uri, Model model) throws JastorException {
		return getAgent(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Agent.  Leaves the model unchanged.
	 * @param resource The resource of the Agent
	 * @param model the Jena Model.
	 */
	public static Agent getAgent(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Agent.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.AgentImpl obj = (edu.mit.dig.saveface.model.foaf.AgentImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.AgentImpl.getAgent(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Agent for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Agent
	 * @param model the Jena Model
	 * @return a List of Agent
	 */
	public static java.util.List getAllAgent(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Agent.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAgent(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SpatialThing.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing createSpatialThing(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.SpatialThingImpl.createSpatialThing(resource,model);
	}
	
	/**
	 * Create a new instance of SpatialThing.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing createSpatialThing(String uri, Model model) throws JastorException {
		SpatialThing obj = edu.mit.dig.saveface.model.foaf.SpatialThingImpl.createSpatialThing(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SpatialThing.  Leaves the model unchanged.
	 * @param uri The uri of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing getSpatialThing(String uri, Model model) throws JastorException {
		return getSpatialThing(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SpatialThing.  Leaves the model unchanged.
	 * @param resource The resource of the SpatialThing
	 * @param model the Jena Model.
	 */
	public static SpatialThing getSpatialThing(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.SpatialThing.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.SpatialThingImpl obj = (edu.mit.dig.saveface.model.foaf.SpatialThingImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.SpatialThingImpl.getSpatialThing(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SpatialThing for every resource in the model with rdf:Type http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing
	 * @param model the Jena Model
	 * @return a List of SpatialThing
	 */
	public static java.util.List getAllSpatialThing(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SpatialThing.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSpatialThing(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Group.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Group
	 * @param model the Jena Model.
	 */
	public static Group createGroup(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.GroupImpl.createGroup(resource,model);
	}
	
	/**
	 * Create a new instance of Group.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Group
	 * @param model the Jena Model.
	 */
	public static Group createGroup(String uri, Model model) throws JastorException {
		Group obj = edu.mit.dig.saveface.model.foaf.GroupImpl.createGroup(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Group.  Leaves the model unchanged.
	 * @param uri The uri of the Group
	 * @param model the Jena Model.
	 */
	public static Group getGroup(String uri, Model model) throws JastorException {
		return getGroup(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Group.  Leaves the model unchanged.
	 * @param resource The resource of the Group
	 * @param model the Jena Model.
	 */
	public static Group getGroup(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Group.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.GroupImpl obj = (edu.mit.dig.saveface.model.foaf.GroupImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.GroupImpl.getGroup(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Group for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Group
	 * @param model the Jena Model
	 * @return a List of Group
	 */
	public static java.util.List getAllGroup(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Group.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGroup(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of OnlineGamingAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the OnlineGamingAccount
	 * @param model the Jena Model.
	 */
	public static OnlineGamingAccount createOnlineGamingAccount(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.createOnlineGamingAccount(resource,model);
	}
	
	/**
	 * Create a new instance of OnlineGamingAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the OnlineGamingAccount
	 * @param model the Jena Model.
	 */
	public static OnlineGamingAccount createOnlineGamingAccount(String uri, Model model) throws JastorException {
		OnlineGamingAccount obj = edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.createOnlineGamingAccount(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of OnlineGamingAccount.  Leaves the model unchanged.
	 * @param uri The uri of the OnlineGamingAccount
	 * @param model the Jena Model.
	 */
	public static OnlineGamingAccount getOnlineGamingAccount(String uri, Model model) throws JastorException {
		return getOnlineGamingAccount(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of OnlineGamingAccount.  Leaves the model unchanged.
	 * @param resource The resource of the OnlineGamingAccount
	 * @param model the Jena Model.
	 */
	public static OnlineGamingAccount getOnlineGamingAccount(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.OnlineGamingAccount.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl obj = (edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.OnlineGamingAccountImpl.getOnlineGamingAccount(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of OnlineGamingAccount for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/OnlineGamingAccount
	 * @param model the Jena Model
	 * @return a List of OnlineGamingAccount
	 */
	public static java.util.List getAllOnlineGamingAccount(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,OnlineGamingAccount.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getOnlineGamingAccount(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of OnlineEcommerceAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the OnlineEcommerceAccount
	 * @param model the Jena Model.
	 */
	public static OnlineEcommerceAccount createOnlineEcommerceAccount(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccountImpl.createOnlineEcommerceAccount(resource,model);
	}
	
	/**
	 * Create a new instance of OnlineEcommerceAccount.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the OnlineEcommerceAccount
	 * @param model the Jena Model.
	 */
	public static OnlineEcommerceAccount createOnlineEcommerceAccount(String uri, Model model) throws JastorException {
		OnlineEcommerceAccount obj = edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccountImpl.createOnlineEcommerceAccount(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of OnlineEcommerceAccount.  Leaves the model unchanged.
	 * @param uri The uri of the OnlineEcommerceAccount
	 * @param model the Jena Model.
	 */
	public static OnlineEcommerceAccount getOnlineEcommerceAccount(String uri, Model model) throws JastorException {
		return getOnlineEcommerceAccount(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of OnlineEcommerceAccount.  Leaves the model unchanged.
	 * @param resource The resource of the OnlineEcommerceAccount
	 * @param model the Jena Model.
	 */
	public static OnlineEcommerceAccount getOnlineEcommerceAccount(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccount.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccountImpl obj = (edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccountImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccountImpl.getOnlineEcommerceAccount(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of OnlineEcommerceAccount for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/OnlineEcommerceAccount
	 * @param model the Jena Model
	 * @return a List of OnlineEcommerceAccount
	 */
	public static java.util.List getAllOnlineEcommerceAccount(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,OnlineEcommerceAccount.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getOnlineEcommerceAccount(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Document.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Document
	 * @param model the Jena Model.
	 */
	public static Document createDocument(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.DocumentImpl.createDocument(resource,model);
	}
	
	/**
	 * Create a new instance of Document.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Document
	 * @param model the Jena Model.
	 */
	public static Document createDocument(String uri, Model model) throws JastorException {
		Document obj = edu.mit.dig.saveface.model.foaf.DocumentImpl.createDocument(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Document.  Leaves the model unchanged.
	 * @param uri The uri of the Document
	 * @param model the Jena Model.
	 */
	public static Document getDocument(String uri, Model model) throws JastorException {
		return getDocument(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Document.  Leaves the model unchanged.
	 * @param resource The resource of the Document
	 * @param model the Jena Model.
	 */
	public static Document getDocument(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Document.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.DocumentImpl obj = (edu.mit.dig.saveface.model.foaf.DocumentImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.DocumentImpl.getDocument(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Document for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Document
	 * @param model the Jena Model
	 * @return a List of Document
	 */
	public static java.util.List getAllDocument(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Document.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDocument(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of LabelProperty.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the LabelProperty
	 * @param model the Jena Model.
	 */
	public static LabelProperty createLabelProperty(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.LabelPropertyImpl.createLabelProperty(resource,model);
	}
	
	/**
	 * Create a new instance of LabelProperty.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the LabelProperty
	 * @param model the Jena Model.
	 */
	public static LabelProperty createLabelProperty(String uri, Model model) throws JastorException {
		LabelProperty obj = edu.mit.dig.saveface.model.foaf.LabelPropertyImpl.createLabelProperty(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of LabelProperty.  Leaves the model unchanged.
	 * @param uri The uri of the LabelProperty
	 * @param model the Jena Model.
	 */
	public static LabelProperty getLabelProperty(String uri, Model model) throws JastorException {
		return getLabelProperty(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of LabelProperty.  Leaves the model unchanged.
	 * @param resource The resource of the LabelProperty
	 * @param model the Jena Model.
	 */
	public static LabelProperty getLabelProperty(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.LabelProperty.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.LabelPropertyImpl obj = (edu.mit.dig.saveface.model.foaf.LabelPropertyImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.LabelPropertyImpl.getLabelProperty(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of LabelProperty for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/LabelProperty
	 * @param model the Jena Model
	 * @return a List of LabelProperty
	 */
	public static java.util.List getAllLabelProperty(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,LabelProperty.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getLabelProperty(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Organization.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Organization
	 * @param model the Jena Model.
	 */
	public static Organization createOrganization(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.OrganizationImpl.createOrganization(resource,model);
	}
	
	/**
	 * Create a new instance of Organization.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Organization
	 * @param model the Jena Model.
	 */
	public static Organization createOrganization(String uri, Model model) throws JastorException {
		Organization obj = edu.mit.dig.saveface.model.foaf.OrganizationImpl.createOrganization(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Organization.  Leaves the model unchanged.
	 * @param uri The uri of the Organization
	 * @param model the Jena Model.
	 */
	public static Organization getOrganization(String uri, Model model) throws JastorException {
		return getOrganization(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Organization.  Leaves the model unchanged.
	 * @param resource The resource of the Organization
	 * @param model the Jena Model.
	 */
	public static Organization getOrganization(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Organization.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.OrganizationImpl obj = (edu.mit.dig.saveface.model.foaf.OrganizationImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.OrganizationImpl.getOrganization(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Organization for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Organization
	 * @param model the Jena Model
	 * @return a List of Organization
	 */
	public static java.util.List getAllOrganization(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Organization.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getOrganization(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Image.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Image
	 * @param model the Jena Model.
	 */
	public static Image createImage(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.foaf.ImageImpl.createImage(resource,model);
	}
	
	/**
	 * Create a new instance of Image.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Image
	 * @param model the Jena Model.
	 */
	public static Image createImage(String uri, Model model) throws JastorException {
		Image obj = edu.mit.dig.saveface.model.foaf.ImageImpl.createImage(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Image.  Leaves the model unchanged.
	 * @param uri The uri of the Image
	 * @param model the Jena Model.
	 */
	public static Image getImage(String uri, Model model) throws JastorException {
		return getImage(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Image.  Leaves the model unchanged.
	 * @param resource The resource of the Image
	 * @param model the Jena Model.
	 */
	public static Image getImage(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.foaf.Image.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.foaf.ImageImpl obj = (edu.mit.dig.saveface.model.foaf.ImageImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.foaf.ImageImpl.getImage(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Image for every resource in the model with rdf:Type http://xmlns.com/foaf/0.1/Image
	 * @param model the Jena Model
	 * @return a List of Image
	 */
	public static java.util.List getAllImage(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Image.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getImage(stmt.getSubject(),model));
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
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Image"))) {
			return getImage(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Organization"))) {
			return getOrganization(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/LabelProperty"))) {
			return getLabelProperty(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/OnlineEcommerceAccount"))) {
			return getOnlineEcommerceAccount(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/OnlineGamingAccount"))) {
			return getOnlineGamingAccount(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Group"))) {
			return getGroup(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing"))) {
			return getSpatialThing(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2002/07/owl#Thing"))) {
			return get_Thing(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/OnlineChatAccount"))) {
			return getOnlineChatAccount(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/OnlineAccount"))) {
			return getOnlineAccount(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Project"))) {
			return getProject(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/PersonalProfileDocument"))) {
			return getPersonalProfileDocument(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Document"))) {
			return getDocument(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://purl.org/dc/terms/Agent"))) {
			return getAgent(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2000/01/rdf-schema#Class"))) {
			return getClass(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Person"))) {
			return getPerson(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://xmlns.com/foaf/0.1/Agent"))) {
			return getAgent(res,model);
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
		if (type.equals(edu.mit.dig.saveface.model.foaf.Image.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Image.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Organization.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Organization.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.LabelProperty.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.LabelProperty.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccount.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.OnlineEcommerceAccount.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.OnlineGamingAccount.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.OnlineGamingAccount.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Group.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Group.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.SpatialThing.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.SpatialThing.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf._Thing.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf._Thing.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.OnlineChatAccount.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.OnlineChatAccount.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.OnlineAccount.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.OnlineAccount.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Project.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Project.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.PersonalProfileDocument.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.PersonalProfileDocument.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Document.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Document.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Agent.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Agent.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Class.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Class.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Person.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Person.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.foaf.Agent.TYPE)) {
			types.add(edu.mit.dig.saveface.model.foaf.Agent.class);
		}
		return types;
	}
}