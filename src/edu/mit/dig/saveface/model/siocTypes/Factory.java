

package edu.mit.dig.saveface.model.siocTypes;

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
 * <p>(URI: http://rdfs.org/sioc/type#)</p>
 * <br>
 * <br>
 * <br>
 */
public class Factory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of WikiArticle.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the WikiArticle
	 * @param model the Jena Model.
	 */
	public static WikiArticle createWikiArticle(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.WikiArticleImpl.createWikiArticle(resource,model);
	}
	
	/**
	 * Create a new instance of WikiArticle.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the WikiArticle
	 * @param model the Jena Model.
	 */
	public static WikiArticle createWikiArticle(String uri, Model model) throws JastorException {
		WikiArticle obj = edu.mit.dig.saveface.model.siocTypes.WikiArticleImpl.createWikiArticle(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of WikiArticle.  Leaves the model unchanged.
	 * @param uri The uri of the WikiArticle
	 * @param model the Jena Model.
	 */
	public static WikiArticle getWikiArticle(String uri, Model model) throws JastorException {
		return getWikiArticle(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of WikiArticle.  Leaves the model unchanged.
	 * @param resource The resource of the WikiArticle
	 * @param model the Jena Model.
	 */
	public static WikiArticle getWikiArticle(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.WikiArticle.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.WikiArticleImpl obj = (edu.mit.dig.saveface.model.siocTypes.WikiArticleImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.WikiArticleImpl.getWikiArticle(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of WikiArticle for every resource in the model with rdf:Type http://rdfs.org/sioc/types#WikiArticle
	 * @param model the Jena Model
	 * @return a List of WikiArticle
	 */
	public static java.util.List getAllWikiArticle(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,WikiArticle.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getWikiArticle(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ReviewArea.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ReviewArea
	 * @param model the Jena Model.
	 */
	public static ReviewArea createReviewArea(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ReviewAreaImpl.createReviewArea(resource,model);
	}
	
	/**
	 * Create a new instance of ReviewArea.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ReviewArea
	 * @param model the Jena Model.
	 */
	public static ReviewArea createReviewArea(String uri, Model model) throws JastorException {
		ReviewArea obj = edu.mit.dig.saveface.model.siocTypes.ReviewAreaImpl.createReviewArea(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ReviewArea.  Leaves the model unchanged.
	 * @param uri The uri of the ReviewArea
	 * @param model the Jena Model.
	 */
	public static ReviewArea getReviewArea(String uri, Model model) throws JastorException {
		return getReviewArea(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ReviewArea.  Leaves the model unchanged.
	 * @param resource The resource of the ReviewArea
	 * @param model the Jena Model.
	 */
	public static ReviewArea getReviewArea(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ReviewArea.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ReviewAreaImpl obj = (edu.mit.dig.saveface.model.siocTypes.ReviewAreaImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ReviewAreaImpl.getReviewArea(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ReviewArea for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ReviewArea
	 * @param model the Jena Model
	 * @return a List of ReviewArea
	 */
	public static java.util.List getAllReviewArea(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ReviewArea.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getReviewArea(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of BlogPost.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the BlogPost
	 * @param model the Jena Model.
	 */
	public static BlogPost createBlogPost(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.BlogPostImpl.createBlogPost(resource,model);
	}
	
	/**
	 * Create a new instance of BlogPost.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the BlogPost
	 * @param model the Jena Model.
	 */
	public static BlogPost createBlogPost(String uri, Model model) throws JastorException {
		BlogPost obj = edu.mit.dig.saveface.model.siocTypes.BlogPostImpl.createBlogPost(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of BlogPost.  Leaves the model unchanged.
	 * @param uri The uri of the BlogPost
	 * @param model the Jena Model.
	 */
	public static BlogPost getBlogPost(String uri, Model model) throws JastorException {
		return getBlogPost(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of BlogPost.  Leaves the model unchanged.
	 * @param resource The resource of the BlogPost
	 * @param model the Jena Model.
	 */
	public static BlogPost getBlogPost(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.BlogPost.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.BlogPostImpl obj = (edu.mit.dig.saveface.model.siocTypes.BlogPostImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.BlogPostImpl.getBlogPost(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of BlogPost for every resource in the model with rdf:Type http://rdfs.org/sioc/types#BlogPost
	 * @param model the Jena Model
	 * @return a List of BlogPost
	 */
	public static java.util.List getAllBlogPost(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,BlogPost.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBlogPost(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Concept.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Concept
	 * @param model the Jena Model.
	 */
	public static Concept createConcept(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ConceptImpl.createConcept(resource,model);
	}
	
	/**
	 * Create a new instance of Concept.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Concept
	 * @param model the Jena Model.
	 */
	public static Concept createConcept(String uri, Model model) throws JastorException {
		Concept obj = edu.mit.dig.saveface.model.siocTypes.ConceptImpl.createConcept(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Concept.  Leaves the model unchanged.
	 * @param uri The uri of the Concept
	 * @param model the Jena Model.
	 */
	public static Concept getConcept(String uri, Model model) throws JastorException {
		return getConcept(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Concept.  Leaves the model unchanged.
	 * @param resource The resource of the Concept
	 * @param model the Jena Model.
	 */
	public static Concept getConcept(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Concept.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ConceptImpl obj = (edu.mit.dig.saveface.model.siocTypes.ConceptImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ConceptImpl.getConcept(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Concept for every resource in the model with rdf:Type http://www.w3.org/2008/05/skos#Concept
	 * @param model the Jena Model
	 * @return a List of Concept
	 */
	public static java.util.List getAllConcept(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Concept.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getConcept(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AnnotationSet.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AnnotationSet
	 * @param model the Jena Model.
	 */
	public static AnnotationSet createAnnotationSet(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.AnnotationSetImpl.createAnnotationSet(resource,model);
	}
	
	/**
	 * Create a new instance of AnnotationSet.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AnnotationSet
	 * @param model the Jena Model.
	 */
	public static AnnotationSet createAnnotationSet(String uri, Model model) throws JastorException {
		AnnotationSet obj = edu.mit.dig.saveface.model.siocTypes.AnnotationSetImpl.createAnnotationSet(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AnnotationSet.  Leaves the model unchanged.
	 * @param uri The uri of the AnnotationSet
	 * @param model the Jena Model.
	 */
	public static AnnotationSet getAnnotationSet(String uri, Model model) throws JastorException {
		return getAnnotationSet(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AnnotationSet.  Leaves the model unchanged.
	 * @param resource The resource of the AnnotationSet
	 * @param model the Jena Model.
	 */
	public static AnnotationSet getAnnotationSet(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.AnnotationSet.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.AnnotationSetImpl obj = (edu.mit.dig.saveface.model.siocTypes.AnnotationSetImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.AnnotationSetImpl.getAnnotationSet(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AnnotationSet for every resource in the model with rdf:Type http://rdfs.org/sioc/types#AnnotationSet
	 * @param model the Jena Model
	 * @return a List of AnnotationSet
	 */
	public static java.util.List getAllAnnotationSet(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AnnotationSet.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAnnotationSet(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Briefcase.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Briefcase
	 * @param model the Jena Model.
	 */
	public static Briefcase createBriefcase(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.BriefcaseImpl.createBriefcase(resource,model);
	}
	
	/**
	 * Create a new instance of Briefcase.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Briefcase
	 * @param model the Jena Model.
	 */
	public static Briefcase createBriefcase(String uri, Model model) throws JastorException {
		Briefcase obj = edu.mit.dig.saveface.model.siocTypes.BriefcaseImpl.createBriefcase(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Briefcase.  Leaves the model unchanged.
	 * @param uri The uri of the Briefcase
	 * @param model the Jena Model.
	 */
	public static Briefcase getBriefcase(String uri, Model model) throws JastorException {
		return getBriefcase(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Briefcase.  Leaves the model unchanged.
	 * @param resource The resource of the Briefcase
	 * @param model the Jena Model.
	 */
	public static Briefcase getBriefcase(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Briefcase.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.BriefcaseImpl obj = (edu.mit.dig.saveface.model.siocTypes.BriefcaseImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.BriefcaseImpl.getBriefcase(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Briefcase for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Briefcase
	 * @param model the Jena Model
	 * @return a List of Briefcase
	 */
	public static java.util.List getAllBriefcase(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Briefcase.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBriefcase(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of OfferList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the OfferList
	 * @param model the Jena Model.
	 */
	public static OfferList createOfferList(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.OfferListImpl.createOfferList(resource,model);
	}
	
	/**
	 * Create a new instance of OfferList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the OfferList
	 * @param model the Jena Model.
	 */
	public static OfferList createOfferList(String uri, Model model) throws JastorException {
		OfferList obj = edu.mit.dig.saveface.model.siocTypes.OfferListImpl.createOfferList(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of OfferList.  Leaves the model unchanged.
	 * @param uri The uri of the OfferList
	 * @param model the Jena Model.
	 */
	public static OfferList getOfferList(String uri, Model model) throws JastorException {
		return getOfferList(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of OfferList.  Leaves the model unchanged.
	 * @param resource The resource of the OfferList
	 * @param model the Jena Model.
	 */
	public static OfferList getOfferList(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.OfferList.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.OfferListImpl obj = (edu.mit.dig.saveface.model.siocTypes.OfferListImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.OfferListImpl.getOfferList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of OfferList for every resource in the model with rdf:Type http://rdfs.org/sioc/types#OfferList
	 * @param model the Jena Model
	 * @return a List of OfferList
	 */
	public static java.util.List getAllOfferList(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,OfferList.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getOfferList(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MessageBoard.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MessageBoard
	 * @param model the Jena Model.
	 */
	public static MessageBoard createMessageBoard(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.MessageBoardImpl.createMessageBoard(resource,model);
	}
	
	/**
	 * Create a new instance of MessageBoard.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MessageBoard
	 * @param model the Jena Model.
	 */
	public static MessageBoard createMessageBoard(String uri, Model model) throws JastorException {
		MessageBoard obj = edu.mit.dig.saveface.model.siocTypes.MessageBoardImpl.createMessageBoard(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MessageBoard.  Leaves the model unchanged.
	 * @param uri The uri of the MessageBoard
	 * @param model the Jena Model.
	 */
	public static MessageBoard getMessageBoard(String uri, Model model) throws JastorException {
		return getMessageBoard(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MessageBoard.  Leaves the model unchanged.
	 * @param resource The resource of the MessageBoard
	 * @param model the Jena Model.
	 */
	public static MessageBoard getMessageBoard(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.MessageBoard.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.MessageBoardImpl obj = (edu.mit.dig.saveface.model.siocTypes.MessageBoardImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.MessageBoardImpl.getMessageBoard(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MessageBoard for every resource in the model with rdf:Type http://rdfs.org/sioc/types#MessageBoard
	 * @param model the Jena Model
	 * @return a List of MessageBoard
	 */
	public static java.util.List getAllMessageBoard(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MessageBoard.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMessageBoard(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of WishList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the WishList
	 * @param model the Jena Model.
	 */
	public static WishList createWishList(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.WishListImpl.createWishList(resource,model);
	}
	
	/**
	 * Create a new instance of WishList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the WishList
	 * @param model the Jena Model.
	 */
	public static WishList createWishList(String uri, Model model) throws JastorException {
		WishList obj = edu.mit.dig.saveface.model.siocTypes.WishListImpl.createWishList(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of WishList.  Leaves the model unchanged.
	 * @param uri The uri of the WishList
	 * @param model the Jena Model.
	 */
	public static WishList getWishList(String uri, Model model) throws JastorException {
		return getWishList(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of WishList.  Leaves the model unchanged.
	 * @param resource The resource of the WishList
	 * @param model the Jena Model.
	 */
	public static WishList getWishList(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.WishList.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.WishListImpl obj = (edu.mit.dig.saveface.model.siocTypes.WishListImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.WishListImpl.getWishList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of WishList for every resource in the model with rdf:Type http://rdfs.org/sioc/types#WishList
	 * @param model the Jena Model
	 * @return a List of WishList
	 */
	public static java.util.List getAllWishList(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,WishList.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getWishList(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MailMessage.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MailMessage
	 * @param model the Jena Model.
	 */
	public static MailMessage createMailMessage(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.MailMessageImpl.createMailMessage(resource,model);
	}
	
	/**
	 * Create a new instance of MailMessage.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MailMessage
	 * @param model the Jena Model.
	 */
	public static MailMessage createMailMessage(String uri, Model model) throws JastorException {
		MailMessage obj = edu.mit.dig.saveface.model.siocTypes.MailMessageImpl.createMailMessage(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MailMessage.  Leaves the model unchanged.
	 * @param uri The uri of the MailMessage
	 * @param model the Jena Model.
	 */
	public static MailMessage getMailMessage(String uri, Model model) throws JastorException {
		return getMailMessage(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MailMessage.  Leaves the model unchanged.
	 * @param resource The resource of the MailMessage
	 * @param model the Jena Model.
	 */
	public static MailMessage getMailMessage(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.MailMessage.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.MailMessageImpl obj = (edu.mit.dig.saveface.model.siocTypes.MailMessageImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.MailMessageImpl.getMailMessage(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MailMessage for every resource in the model with rdf:Type http://rdfs.org/sioc/types#MailMessage
	 * @param model the Jena Model
	 * @return a List of MailMessage
	 */
	public static java.util.List getAllMailMessage(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MailMessage.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMailMessage(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AudioChannel.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AudioChannel
	 * @param model the Jena Model.
	 */
	public static AudioChannel createAudioChannel(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.AudioChannelImpl.createAudioChannel(resource,model);
	}
	
	/**
	 * Create a new instance of AudioChannel.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AudioChannel
	 * @param model the Jena Model.
	 */
	public static AudioChannel createAudioChannel(String uri, Model model) throws JastorException {
		AudioChannel obj = edu.mit.dig.saveface.model.siocTypes.AudioChannelImpl.createAudioChannel(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AudioChannel.  Leaves the model unchanged.
	 * @param uri The uri of the AudioChannel
	 * @param model the Jena Model.
	 */
	public static AudioChannel getAudioChannel(String uri, Model model) throws JastorException {
		return getAudioChannel(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AudioChannel.  Leaves the model unchanged.
	 * @param resource The resource of the AudioChannel
	 * @param model the Jena Model.
	 */
	public static AudioChannel getAudioChannel(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.AudioChannel.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.AudioChannelImpl obj = (edu.mit.dig.saveface.model.siocTypes.AudioChannelImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.AudioChannelImpl.getAudioChannel(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AudioChannel for every resource in the model with rdf:Type http://rdfs.org/sioc/types#AudioChannel
	 * @param model the Jena Model
	 * @return a List of AudioChannel
	 */
	public static java.util.List getAllAudioChannel(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AudioChannel.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAudioChannel(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Tag.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Tag
	 * @param model the Jena Model.
	 */
	public static Tag createTag(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.TagImpl.createTag(resource,model);
	}
	
	/**
	 * Create a new instance of Tag.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Tag
	 * @param model the Jena Model.
	 */
	public static Tag createTag(String uri, Model model) throws JastorException {
		Tag obj = edu.mit.dig.saveface.model.siocTypes.TagImpl.createTag(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Tag.  Leaves the model unchanged.
	 * @param uri The uri of the Tag
	 * @param model the Jena Model.
	 */
	public static Tag getTag(String uri, Model model) throws JastorException {
		return getTag(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Tag.  Leaves the model unchanged.
	 * @param resource The resource of the Tag
	 * @param model the Jena Model.
	 */
	public static Tag getTag(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Tag.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.TagImpl obj = (edu.mit.dig.saveface.model.siocTypes.TagImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.TagImpl.getTag(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Tag for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Tag
	 * @param model the Jena Model
	 * @return a List of Tag
	 */
	public static java.util.List getAllTag(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Tag.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTag(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ReadingList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ReadingList
	 * @param model the Jena Model.
	 */
	public static ReadingList createReadingList(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ReadingListImpl.createReadingList(resource,model);
	}
	
	/**
	 * Create a new instance of ReadingList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ReadingList
	 * @param model the Jena Model.
	 */
	public static ReadingList createReadingList(String uri, Model model) throws JastorException {
		ReadingList obj = edu.mit.dig.saveface.model.siocTypes.ReadingListImpl.createReadingList(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ReadingList.  Leaves the model unchanged.
	 * @param uri The uri of the ReadingList
	 * @param model the Jena Model.
	 */
	public static ReadingList getReadingList(String uri, Model model) throws JastorException {
		return getReadingList(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ReadingList.  Leaves the model unchanged.
	 * @param resource The resource of the ReadingList
	 * @param model the Jena Model.
	 */
	public static ReadingList getReadingList(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ReadingList.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ReadingListImpl obj = (edu.mit.dig.saveface.model.siocTypes.ReadingListImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ReadingListImpl.getReadingList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ReadingList for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ReadingList
	 * @param model the Jena Model
	 * @return a List of ReadingList
	 */
	public static java.util.List getAllReadingList(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ReadingList.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getReadingList(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Weblog.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Weblog
	 * @param model the Jena Model.
	 */
	public static Weblog createWeblog(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.WeblogImpl.createWeblog(resource,model);
	}
	
	/**
	 * Create a new instance of Weblog.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Weblog
	 * @param model the Jena Model.
	 */
	public static Weblog createWeblog(String uri, Model model) throws JastorException {
		Weblog obj = edu.mit.dig.saveface.model.siocTypes.WeblogImpl.createWeblog(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Weblog.  Leaves the model unchanged.
	 * @param uri The uri of the Weblog
	 * @param model the Jena Model.
	 */
	public static Weblog getWeblog(String uri, Model model) throws JastorException {
		return getWeblog(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Weblog.  Leaves the model unchanged.
	 * @param resource The resource of the Weblog
	 * @param model the Jena Model.
	 */
	public static Weblog getWeblog(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Weblog.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.WeblogImpl obj = (edu.mit.dig.saveface.model.siocTypes.WeblogImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.WeblogImpl.getWeblog(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Weblog for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Weblog
	 * @param model the Jena Model
	 * @return a List of Weblog
	 */
	public static java.util.List getAllWeblog(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Weblog.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getWeblog(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Poll.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Poll
	 * @param model the Jena Model.
	 */
	public static Poll createPoll(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.PollImpl.createPoll(resource,model);
	}
	
	/**
	 * Create a new instance of Poll.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Poll
	 * @param model the Jena Model.
	 */
	public static Poll createPoll(String uri, Model model) throws JastorException {
		Poll obj = edu.mit.dig.saveface.model.siocTypes.PollImpl.createPoll(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Poll.  Leaves the model unchanged.
	 * @param uri The uri of the Poll
	 * @param model the Jena Model.
	 */
	public static Poll getPoll(String uri, Model model) throws JastorException {
		return getPoll(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Poll.  Leaves the model unchanged.
	 * @param resource The resource of the Poll
	 * @param model the Jena Model.
	 */
	public static Poll getPoll(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Poll.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.PollImpl obj = (edu.mit.dig.saveface.model.siocTypes.PollImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.PollImpl.getPoll(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Poll for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Poll
	 * @param model the Jena Model
	 * @return a List of Poll
	 */
	public static java.util.List getAllPoll(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Poll.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPoll(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of BoardPost.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the BoardPost
	 * @param model the Jena Model.
	 */
	public static BoardPost createBoardPost(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.BoardPostImpl.createBoardPost(resource,model);
	}
	
	/**
	 * Create a new instance of BoardPost.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the BoardPost
	 * @param model the Jena Model.
	 */
	public static BoardPost createBoardPost(String uri, Model model) throws JastorException {
		BoardPost obj = edu.mit.dig.saveface.model.siocTypes.BoardPostImpl.createBoardPost(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of BoardPost.  Leaves the model unchanged.
	 * @param uri The uri of the BoardPost
	 * @param model the Jena Model.
	 */
	public static BoardPost getBoardPost(String uri, Model model) throws JastorException {
		return getBoardPost(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of BoardPost.  Leaves the model unchanged.
	 * @param resource The resource of the BoardPost
	 * @param model the Jena Model.
	 */
	public static BoardPost getBoardPost(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.BoardPost.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.BoardPostImpl obj = (edu.mit.dig.saveface.model.siocTypes.BoardPostImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.BoardPostImpl.getBoardPost(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of BoardPost for every resource in the model with rdf:Type http://rdfs.org/sioc/types#BoardPost
	 * @param model the Jena Model
	 * @return a List of BoardPost
	 */
	public static java.util.List getAllBoardPost(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,BoardPost.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBoardPost(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of InstantMessage.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the InstantMessage
	 * @param model the Jena Model.
	 */
	public static InstantMessage createInstantMessage(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.InstantMessageImpl.createInstantMessage(resource,model);
	}
	
	/**
	 * Create a new instance of InstantMessage.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the InstantMessage
	 * @param model the Jena Model.
	 */
	public static InstantMessage createInstantMessage(String uri, Model model) throws JastorException {
		InstantMessage obj = edu.mit.dig.saveface.model.siocTypes.InstantMessageImpl.createInstantMessage(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of InstantMessage.  Leaves the model unchanged.
	 * @param uri The uri of the InstantMessage
	 * @param model the Jena Model.
	 */
	public static InstantMessage getInstantMessage(String uri, Model model) throws JastorException {
		return getInstantMessage(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of InstantMessage.  Leaves the model unchanged.
	 * @param resource The resource of the InstantMessage
	 * @param model the Jena Model.
	 */
	public static InstantMessage getInstantMessage(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.InstantMessage.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.InstantMessageImpl obj = (edu.mit.dig.saveface.model.siocTypes.InstantMessageImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.InstantMessageImpl.getInstantMessage(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of InstantMessage for every resource in the model with rdf:Type http://rdfs.org/sioc/types#InstantMessage
	 * @param model the Jena Model
	 * @return a List of InstantMessage
	 */
	public static java.util.List getAllInstantMessage(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,InstantMessage.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getInstantMessage(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Category.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Category
	 * @param model the Jena Model.
	 */
	public static Category createCategory(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.CategoryImpl.createCategory(resource,model);
	}
	
	/**
	 * Create a new instance of Category.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Category
	 * @param model the Jena Model.
	 */
	public static Category createCategory(String uri, Model model) throws JastorException {
		Category obj = edu.mit.dig.saveface.model.siocTypes.CategoryImpl.createCategory(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Category.  Leaves the model unchanged.
	 * @param uri The uri of the Category
	 * @param model the Jena Model.
	 */
	public static Category getCategory(String uri, Model model) throws JastorException {
		return getCategory(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Category.  Leaves the model unchanged.
	 * @param resource The resource of the Category
	 * @param model the Jena Model.
	 */
	public static Category getCategory(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Category.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.CategoryImpl obj = (edu.mit.dig.saveface.model.siocTypes.CategoryImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.CategoryImpl.getCategory(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Category for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Category
	 * @param model the Jena Model
	 * @return a List of Category
	 */
	public static java.util.List getAllCategory(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Category.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCategory(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of BestAnswer.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the BestAnswer
	 * @param model the Jena Model.
	 */
	public static BestAnswer createBestAnswer(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.BestAnswerImpl.createBestAnswer(resource,model);
	}
	
	/**
	 * Create a new instance of BestAnswer.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the BestAnswer
	 * @param model the Jena Model.
	 */
	public static BestAnswer createBestAnswer(String uri, Model model) throws JastorException {
		BestAnswer obj = edu.mit.dig.saveface.model.siocTypes.BestAnswerImpl.createBestAnswer(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of BestAnswer.  Leaves the model unchanged.
	 * @param uri The uri of the BestAnswer
	 * @param model the Jena Model.
	 */
	public static BestAnswer getBestAnswer(String uri, Model model) throws JastorException {
		return getBestAnswer(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of BestAnswer.  Leaves the model unchanged.
	 * @param resource The resource of the BestAnswer
	 * @param model the Jena Model.
	 */
	public static BestAnswer getBestAnswer(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.BestAnswer.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.BestAnswerImpl obj = (edu.mit.dig.saveface.model.siocTypes.BestAnswerImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.BestAnswerImpl.getBestAnswer(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of BestAnswer for every resource in the model with rdf:Type http://rdfs.org/sioc/types#BestAnswer
	 * @param model the Jena Model
	 * @return a List of BestAnswer
	 */
	public static java.util.List getAllBestAnswer(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,BestAnswer.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBestAnswer(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AddressBook.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AddressBook
	 * @param model the Jena Model.
	 */
	public static AddressBook createAddressBook(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.AddressBookImpl.createAddressBook(resource,model);
	}
	
	/**
	 * Create a new instance of AddressBook.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AddressBook
	 * @param model the Jena Model.
	 */
	public static AddressBook createAddressBook(String uri, Model model) throws JastorException {
		AddressBook obj = edu.mit.dig.saveface.model.siocTypes.AddressBookImpl.createAddressBook(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AddressBook.  Leaves the model unchanged.
	 * @param uri The uri of the AddressBook
	 * @param model the Jena Model.
	 */
	public static AddressBook getAddressBook(String uri, Model model) throws JastorException {
		return getAddressBook(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AddressBook.  Leaves the model unchanged.
	 * @param resource The resource of the AddressBook
	 * @param model the Jena Model.
	 */
	public static AddressBook getAddressBook(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.AddressBook.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.AddressBookImpl obj = (edu.mit.dig.saveface.model.siocTypes.AddressBookImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.AddressBookImpl.getAddressBook(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AddressBook for every resource in the model with rdf:Type http://rdfs.org/sioc/types#AddressBook
	 * @param model the Jena Model
	 * @return a List of AddressBook
	 */
	public static java.util.List getAllAddressBook(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AddressBook.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAddressBook(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of BookmarkFolder.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the BookmarkFolder
	 * @param model the Jena Model.
	 */
	public static BookmarkFolder createBookmarkFolder(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.BookmarkFolderImpl.createBookmarkFolder(resource,model);
	}
	
	/**
	 * Create a new instance of BookmarkFolder.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the BookmarkFolder
	 * @param model the Jena Model.
	 */
	public static BookmarkFolder createBookmarkFolder(String uri, Model model) throws JastorException {
		BookmarkFolder obj = edu.mit.dig.saveface.model.siocTypes.BookmarkFolderImpl.createBookmarkFolder(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of BookmarkFolder.  Leaves the model unchanged.
	 * @param uri The uri of the BookmarkFolder
	 * @param model the Jena Model.
	 */
	public static BookmarkFolder getBookmarkFolder(String uri, Model model) throws JastorException {
		return getBookmarkFolder(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of BookmarkFolder.  Leaves the model unchanged.
	 * @param resource The resource of the BookmarkFolder
	 * @param model the Jena Model.
	 */
	public static BookmarkFolder getBookmarkFolder(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.BookmarkFolder.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.BookmarkFolderImpl obj = (edu.mit.dig.saveface.model.siocTypes.BookmarkFolderImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.BookmarkFolderImpl.getBookmarkFolder(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of BookmarkFolder for every resource in the model with rdf:Type http://rdfs.org/sioc/types#BookmarkFolder
	 * @param model the Jena Model
	 * @return a List of BookmarkFolder
	 */
	public static java.util.List getAllBookmarkFolder(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,BookmarkFolder.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBookmarkFolder(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Playlist.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Playlist
	 * @param model the Jena Model.
	 */
	public static Playlist createPlaylist(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.PlaylistImpl.createPlaylist(resource,model);
	}
	
	/**
	 * Create a new instance of Playlist.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Playlist
	 * @param model the Jena Model.
	 */
	public static Playlist createPlaylist(String uri, Model model) throws JastorException {
		Playlist obj = edu.mit.dig.saveface.model.siocTypes.PlaylistImpl.createPlaylist(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Playlist.  Leaves the model unchanged.
	 * @param uri The uri of the Playlist
	 * @param model the Jena Model.
	 */
	public static Playlist getPlaylist(String uri, Model model) throws JastorException {
		return getPlaylist(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Playlist.  Leaves the model unchanged.
	 * @param resource The resource of the Playlist
	 * @param model the Jena Model.
	 */
	public static Playlist getPlaylist(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Playlist.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.PlaylistImpl obj = (edu.mit.dig.saveface.model.siocTypes.PlaylistImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.PlaylistImpl.getPlaylist(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Playlist for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Playlist
	 * @param model the Jena Model
	 * @return a List of Playlist
	 */
	public static java.util.List getAllPlaylist(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Playlist.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPlaylist(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of FavouriteThings.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the FavouriteThings
	 * @param model the Jena Model.
	 */
	public static FavouriteThings createFavouriteThings(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.FavouriteThingsImpl.createFavouriteThings(resource,model);
	}
	
	/**
	 * Create a new instance of FavouriteThings.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the FavouriteThings
	 * @param model the Jena Model.
	 */
	public static FavouriteThings createFavouriteThings(String uri, Model model) throws JastorException {
		FavouriteThings obj = edu.mit.dig.saveface.model.siocTypes.FavouriteThingsImpl.createFavouriteThings(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of FavouriteThings.  Leaves the model unchanged.
	 * @param uri The uri of the FavouriteThings
	 * @param model the Jena Model.
	 */
	public static FavouriteThings getFavouriteThings(String uri, Model model) throws JastorException {
		return getFavouriteThings(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of FavouriteThings.  Leaves the model unchanged.
	 * @param resource The resource of the FavouriteThings
	 * @param model the Jena Model.
	 */
	public static FavouriteThings getFavouriteThings(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.FavouriteThings.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.FavouriteThingsImpl obj = (edu.mit.dig.saveface.model.siocTypes.FavouriteThingsImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.FavouriteThingsImpl.getFavouriteThings(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of FavouriteThings for every resource in the model with rdf:Type http://rdfs.org/sioc/types#FavouriteThings
	 * @param model the Jena Model
	 * @return a List of FavouriteThings
	 */
	public static java.util.List getAllFavouriteThings(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,FavouriteThings.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getFavouriteThings(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MailingList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MailingList
	 * @param model the Jena Model.
	 */
	public static MailingList createMailingList(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.MailingListImpl.createMailingList(resource,model);
	}
	
	/**
	 * Create a new instance of MailingList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MailingList
	 * @param model the Jena Model.
	 */
	public static MailingList createMailingList(String uri, Model model) throws JastorException {
		MailingList obj = edu.mit.dig.saveface.model.siocTypes.MailingListImpl.createMailingList(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MailingList.  Leaves the model unchanged.
	 * @param uri The uri of the MailingList
	 * @param model the Jena Model.
	 */
	public static MailingList getMailingList(String uri, Model model) throws JastorException {
		return getMailingList(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MailingList.  Leaves the model unchanged.
	 * @param resource The resource of the MailingList
	 * @param model the Jena Model.
	 */
	public static MailingList getMailingList(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.MailingList.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.MailingListImpl obj = (edu.mit.dig.saveface.model.siocTypes.MailingListImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.MailingListImpl.getMailingList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MailingList for every resource in the model with rdf:Type http://rdfs.org/sioc/types#MailingList
	 * @param model the Jena Model
	 * @return a List of MailingList
	 */
	public static java.util.List getAllMailingList(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MailingList.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMailingList(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Question.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Question
	 * @param model the Jena Model.
	 */
	public static Question createQuestion(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.QuestionImpl.createQuestion(resource,model);
	}
	
	/**
	 * Create a new instance of Question.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Question
	 * @param model the Jena Model.
	 */
	public static Question createQuestion(String uri, Model model) throws JastorException {
		Question obj = edu.mit.dig.saveface.model.siocTypes.QuestionImpl.createQuestion(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Question.  Leaves the model unchanged.
	 * @param uri The uri of the Question
	 * @param model the Jena Model.
	 */
	public static Question getQuestion(String uri, Model model) throws JastorException {
		return getQuestion(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Question.  Leaves the model unchanged.
	 * @param resource The resource of the Question
	 * @param model the Jena Model.
	 */
	public static Question getQuestion(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Question.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.QuestionImpl obj = (edu.mit.dig.saveface.model.siocTypes.QuestionImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.QuestionImpl.getQuestion(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Question for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Question
	 * @param model the Jena Model
	 * @return a List of Question
	 */
	public static java.util.List getAllQuestion(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Question.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getQuestion(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SurveyCollection.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SurveyCollection
	 * @param model the Jena Model.
	 */
	public static SurveyCollection createSurveyCollection(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.SurveyCollectionImpl.createSurveyCollection(resource,model);
	}
	
	/**
	 * Create a new instance of SurveyCollection.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SurveyCollection
	 * @param model the Jena Model.
	 */
	public static SurveyCollection createSurveyCollection(String uri, Model model) throws JastorException {
		SurveyCollection obj = edu.mit.dig.saveface.model.siocTypes.SurveyCollectionImpl.createSurveyCollection(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SurveyCollection.  Leaves the model unchanged.
	 * @param uri The uri of the SurveyCollection
	 * @param model the Jena Model.
	 */
	public static SurveyCollection getSurveyCollection(String uri, Model model) throws JastorException {
		return getSurveyCollection(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SurveyCollection.  Leaves the model unchanged.
	 * @param resource The resource of the SurveyCollection
	 * @param model the Jena Model.
	 */
	public static SurveyCollection getSurveyCollection(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.SurveyCollection.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.SurveyCollectionImpl obj = (edu.mit.dig.saveface.model.siocTypes.SurveyCollectionImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.SurveyCollectionImpl.getSurveyCollection(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SurveyCollection for every resource in the model with rdf:Type http://rdfs.org/sioc/types#SurveyCollection
	 * @param model the Jena Model
	 * @return a List of SurveyCollection
	 */
	public static java.util.List getAllSurveyCollection(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SurveyCollection.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSurveyCollection(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Answer.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Answer
	 * @param model the Jena Model.
	 */
	public static Answer createAnswer(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.AnswerImpl.createAnswer(resource,model);
	}
	
	/**
	 * Create a new instance of Answer.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Answer
	 * @param model the Jena Model.
	 */
	public static Answer createAnswer(String uri, Model model) throws JastorException {
		Answer obj = edu.mit.dig.saveface.model.siocTypes.AnswerImpl.createAnswer(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Answer.  Leaves the model unchanged.
	 * @param uri The uri of the Answer
	 * @param model the Jena Model.
	 */
	public static Answer getAnswer(String uri, Model model) throws JastorException {
		return getAnswer(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Answer.  Leaves the model unchanged.
	 * @param resource The resource of the Answer
	 * @param model the Jena Model.
	 */
	public static Answer getAnswer(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Answer.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.AnswerImpl obj = (edu.mit.dig.saveface.model.siocTypes.AnswerImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.AnswerImpl.getAnswer(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Answer for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Answer
	 * @param model the Jena Model
	 * @return a List of Answer
	 */
	public static java.util.List getAllAnswer(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Answer.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAnswer(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MicroblogPost.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MicroblogPost
	 * @param model the Jena Model.
	 */
	public static MicroblogPost createMicroblogPost(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.MicroblogPostImpl.createMicroblogPost(resource,model);
	}
	
	/**
	 * Create a new instance of MicroblogPost.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MicroblogPost
	 * @param model the Jena Model.
	 */
	public static MicroblogPost createMicroblogPost(String uri, Model model) throws JastorException {
		MicroblogPost obj = edu.mit.dig.saveface.model.siocTypes.MicroblogPostImpl.createMicroblogPost(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MicroblogPost.  Leaves the model unchanged.
	 * @param uri The uri of the MicroblogPost
	 * @param model the Jena Model.
	 */
	public static MicroblogPost getMicroblogPost(String uri, Model model) throws JastorException {
		return getMicroblogPost(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MicroblogPost.  Leaves the model unchanged.
	 * @param resource The resource of the MicroblogPost
	 * @param model the Jena Model.
	 */
	public static MicroblogPost getMicroblogPost(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.MicroblogPost.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.MicroblogPostImpl obj = (edu.mit.dig.saveface.model.siocTypes.MicroblogPostImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.MicroblogPostImpl.getMicroblogPost(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MicroblogPost for every resource in the model with rdf:Type http://rdfs.org/sioc/types#MicroblogPost
	 * @param model the Jena Model
	 * @return a List of MicroblogPost
	 */
	public static java.util.List getAllMicroblogPost(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MicroblogPost.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMicroblogPost(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ProjectDirectory.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ProjectDirectory
	 * @param model the Jena Model.
	 */
	public static ProjectDirectory createProjectDirectory(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ProjectDirectoryImpl.createProjectDirectory(resource,model);
	}
	
	/**
	 * Create a new instance of ProjectDirectory.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ProjectDirectory
	 * @param model the Jena Model.
	 */
	public static ProjectDirectory createProjectDirectory(String uri, Model model) throws JastorException {
		ProjectDirectory obj = edu.mit.dig.saveface.model.siocTypes.ProjectDirectoryImpl.createProjectDirectory(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ProjectDirectory.  Leaves the model unchanged.
	 * @param uri The uri of the ProjectDirectory
	 * @param model the Jena Model.
	 */
	public static ProjectDirectory getProjectDirectory(String uri, Model model) throws JastorException {
		return getProjectDirectory(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ProjectDirectory.  Leaves the model unchanged.
	 * @param resource The resource of the ProjectDirectory
	 * @param model the Jena Model.
	 */
	public static ProjectDirectory getProjectDirectory(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ProjectDirectory.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ProjectDirectoryImpl obj = (edu.mit.dig.saveface.model.siocTypes.ProjectDirectoryImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ProjectDirectoryImpl.getProjectDirectory(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ProjectDirectory for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ProjectDirectory
	 * @param model the Jena Model
	 * @return a List of ProjectDirectory
	 */
	public static java.util.List getAllProjectDirectory(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ProjectDirectory.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getProjectDirectory(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ResumeBank.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ResumeBank
	 * @param model the Jena Model.
	 */
	public static ResumeBank createResumeBank(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ResumeBankImpl.createResumeBank(resource,model);
	}
	
	/**
	 * Create a new instance of ResumeBank.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ResumeBank
	 * @param model the Jena Model.
	 */
	public static ResumeBank createResumeBank(String uri, Model model) throws JastorException {
		ResumeBank obj = edu.mit.dig.saveface.model.siocTypes.ResumeBankImpl.createResumeBank(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ResumeBank.  Leaves the model unchanged.
	 * @param uri The uri of the ResumeBank
	 * @param model the Jena Model.
	 */
	public static ResumeBank getResumeBank(String uri, Model model) throws JastorException {
		return getResumeBank(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ResumeBank.  Leaves the model unchanged.
	 * @param resource The resource of the ResumeBank
	 * @param model the Jena Model.
	 */
	public static ResumeBank getResumeBank(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ResumeBank.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ResumeBankImpl obj = (edu.mit.dig.saveface.model.siocTypes.ResumeBankImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ResumeBankImpl.getResumeBank(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ResumeBank for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ResumeBank
	 * @param model the Jena Model
	 * @return a List of ResumeBank
	 */
	public static java.util.List getAllResumeBank(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ResumeBank.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getResumeBank(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Wiki.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Wiki
	 * @param model the Jena Model.
	 */
	public static Wiki createWiki(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.WikiImpl.createWiki(resource,model);
	}
	
	/**
	 * Create a new instance of Wiki.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Wiki
	 * @param model the Jena Model.
	 */
	public static Wiki createWiki(String uri, Model model) throws JastorException {
		Wiki obj = edu.mit.dig.saveface.model.siocTypes.WikiImpl.createWiki(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Wiki.  Leaves the model unchanged.
	 * @param uri The uri of the Wiki
	 * @param model the Jena Model.
	 */
	public static Wiki getWiki(String uri, Model model) throws JastorException {
		return getWiki(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Wiki.  Leaves the model unchanged.
	 * @param resource The resource of the Wiki
	 * @param model the Jena Model.
	 */
	public static Wiki getWiki(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Wiki.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.WikiImpl obj = (edu.mit.dig.saveface.model.siocTypes.WikiImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.WikiImpl.getWiki(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Wiki for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Wiki
	 * @param model the Jena Model
	 * @return a List of Wiki
	 */
	public static java.util.List getAllWiki(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Wiki.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getWiki(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ChatChannel.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ChatChannel
	 * @param model the Jena Model.
	 */
	public static ChatChannel createChatChannel(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ChatChannelImpl.createChatChannel(resource,model);
	}
	
	/**
	 * Create a new instance of ChatChannel.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ChatChannel
	 * @param model the Jena Model.
	 */
	public static ChatChannel createChatChannel(String uri, Model model) throws JastorException {
		ChatChannel obj = edu.mit.dig.saveface.model.siocTypes.ChatChannelImpl.createChatChannel(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ChatChannel.  Leaves the model unchanged.
	 * @param uri The uri of the ChatChannel
	 * @param model the Jena Model.
	 */
	public static ChatChannel getChatChannel(String uri, Model model) throws JastorException {
		return getChatChannel(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ChatChannel.  Leaves the model unchanged.
	 * @param resource The resource of the ChatChannel
	 * @param model the Jena Model.
	 */
	public static ChatChannel getChatChannel(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ChatChannel.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ChatChannelImpl obj = (edu.mit.dig.saveface.model.siocTypes.ChatChannelImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ChatChannelImpl.getChatChannel(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ChatChannel for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ChatChannel
	 * @param model the Jena Model
	 * @return a List of ChatChannel
	 */
	public static java.util.List getAllChatChannel(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ChatChannel.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getChatChannel(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ImageGallery.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ImageGallery
	 * @param model the Jena Model.
	 */
	public static ImageGallery createImageGallery(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ImageGalleryImpl.createImageGallery(resource,model);
	}
	
	/**
	 * Create a new instance of ImageGallery.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ImageGallery
	 * @param model the Jena Model.
	 */
	public static ImageGallery createImageGallery(String uri, Model model) throws JastorException {
		ImageGallery obj = edu.mit.dig.saveface.model.siocTypes.ImageGalleryImpl.createImageGallery(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ImageGallery.  Leaves the model unchanged.
	 * @param uri The uri of the ImageGallery
	 * @param model the Jena Model.
	 */
	public static ImageGallery getImageGallery(String uri, Model model) throws JastorException {
		return getImageGallery(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ImageGallery.  Leaves the model unchanged.
	 * @param resource The resource of the ImageGallery
	 * @param model the Jena Model.
	 */
	public static ImageGallery getImageGallery(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ImageGallery.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ImageGalleryImpl obj = (edu.mit.dig.saveface.model.siocTypes.ImageGalleryImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ImageGalleryImpl.getImageGallery(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ImageGallery for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ImageGallery
	 * @param model the Jena Model
	 * @return a List of ImageGallery
	 */
	public static java.util.List getAllImageGallery(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ImageGallery.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getImageGallery(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of EventCalendar.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EventCalendar
	 * @param model the Jena Model.
	 */
	public static EventCalendar createEventCalendar(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.EventCalendarImpl.createEventCalendar(resource,model);
	}
	
	/**
	 * Create a new instance of EventCalendar.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EventCalendar
	 * @param model the Jena Model.
	 */
	public static EventCalendar createEventCalendar(String uri, Model model) throws JastorException {
		EventCalendar obj = edu.mit.dig.saveface.model.siocTypes.EventCalendarImpl.createEventCalendar(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of EventCalendar.  Leaves the model unchanged.
	 * @param uri The uri of the EventCalendar
	 * @param model the Jena Model.
	 */
	public static EventCalendar getEventCalendar(String uri, Model model) throws JastorException {
		return getEventCalendar(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of EventCalendar.  Leaves the model unchanged.
	 * @param resource The resource of the EventCalendar
	 * @param model the Jena Model.
	 */
	public static EventCalendar getEventCalendar(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.EventCalendar.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.EventCalendarImpl obj = (edu.mit.dig.saveface.model.siocTypes.EventCalendarImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.EventCalendarImpl.getEventCalendar(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EventCalendar for every resource in the model with rdf:Type http://rdfs.org/sioc/types#EventCalendar
	 * @param model the Jena Model
	 * @return a List of EventCalendar
	 */
	public static java.util.List getAllEventCalendar(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,EventCalendar.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEventCalendar(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Microblog.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Microblog
	 * @param model the Jena Model.
	 */
	public static Microblog createMicroblog(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.MicroblogImpl.createMicroblog(resource,model);
	}
	
	/**
	 * Create a new instance of Microblog.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Microblog
	 * @param model the Jena Model.
	 */
	public static Microblog createMicroblog(String uri, Model model) throws JastorException {
		Microblog obj = edu.mit.dig.saveface.model.siocTypes.MicroblogImpl.createMicroblog(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Microblog.  Leaves the model unchanged.
	 * @param uri The uri of the Microblog
	 * @param model the Jena Model.
	 */
	public static Microblog getMicroblog(String uri, Model model) throws JastorException {
		return getMicroblog(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Microblog.  Leaves the model unchanged.
	 * @param resource The resource of the Microblog
	 * @param model the Jena Model.
	 */
	public static Microblog getMicroblog(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Microblog.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.MicroblogImpl obj = (edu.mit.dig.saveface.model.siocTypes.MicroblogImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.MicroblogImpl.getMicroblog(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Microblog for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Microblog
	 * @param model the Jena Model
	 * @return a List of Microblog
	 */
	public static java.util.List getAllMicroblog(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Microblog.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMicroblog(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Comment.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Comment
	 * @param model the Jena Model.
	 */
	public static Comment createComment(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.CommentImpl.createComment(resource,model);
	}
	
	/**
	 * Create a new instance of Comment.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Comment
	 * @param model the Jena Model.
	 */
	public static Comment createComment(String uri, Model model) throws JastorException {
		Comment obj = edu.mit.dig.saveface.model.siocTypes.CommentImpl.createComment(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Comment.  Leaves the model unchanged.
	 * @param uri The uri of the Comment
	 * @param model the Jena Model.
	 */
	public static Comment getComment(String uri, Model model) throws JastorException {
		return getComment(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Comment.  Leaves the model unchanged.
	 * @param resource The resource of the Comment
	 * @param model the Jena Model.
	 */
	public static Comment getComment(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.Comment.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.CommentImpl obj = (edu.mit.dig.saveface.model.siocTypes.CommentImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.CommentImpl.getComment(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Comment for every resource in the model with rdf:Type http://rdfs.org/sioc/types#Comment
	 * @param model the Jena Model
	 * @return a List of Comment
	 */
	public static java.util.List getAllComment(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Comment.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getComment(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SubscriptionList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SubscriptionList
	 * @param model the Jena Model.
	 */
	public static SubscriptionList createSubscriptionList(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.SubscriptionListImpl.createSubscriptionList(resource,model);
	}
	
	/**
	 * Create a new instance of SubscriptionList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SubscriptionList
	 * @param model the Jena Model.
	 */
	public static SubscriptionList createSubscriptionList(String uri, Model model) throws JastorException {
		SubscriptionList obj = edu.mit.dig.saveface.model.siocTypes.SubscriptionListImpl.createSubscriptionList(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SubscriptionList.  Leaves the model unchanged.
	 * @param uri The uri of the SubscriptionList
	 * @param model the Jena Model.
	 */
	public static SubscriptionList getSubscriptionList(String uri, Model model) throws JastorException {
		return getSubscriptionList(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SubscriptionList.  Leaves the model unchanged.
	 * @param resource The resource of the SubscriptionList
	 * @param model the Jena Model.
	 */
	public static SubscriptionList getSubscriptionList(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.SubscriptionList.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.SubscriptionListImpl obj = (edu.mit.dig.saveface.model.siocTypes.SubscriptionListImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.SubscriptionListImpl.getSubscriptionList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SubscriptionList for every resource in the model with rdf:Type http://rdfs.org/sioc/types#SubscriptionList
	 * @param model the Jena Model
	 * @return a List of SubscriptionList
	 */
	public static java.util.List getAllSubscriptionList(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SubscriptionList.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSubscriptionList(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of VideoChannel.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the VideoChannel
	 * @param model the Jena Model.
	 */
	public static VideoChannel createVideoChannel(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.VideoChannelImpl.createVideoChannel(resource,model);
	}
	
	/**
	 * Create a new instance of VideoChannel.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the VideoChannel
	 * @param model the Jena Model.
	 */
	public static VideoChannel createVideoChannel(String uri, Model model) throws JastorException {
		VideoChannel obj = edu.mit.dig.saveface.model.siocTypes.VideoChannelImpl.createVideoChannel(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of VideoChannel.  Leaves the model unchanged.
	 * @param uri The uri of the VideoChannel
	 * @param model the Jena Model.
	 */
	public static VideoChannel getVideoChannel(String uri, Model model) throws JastorException {
		return getVideoChannel(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of VideoChannel.  Leaves the model unchanged.
	 * @param resource The resource of the VideoChannel
	 * @param model the Jena Model.
	 */
	public static VideoChannel getVideoChannel(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.VideoChannel.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.VideoChannelImpl obj = (edu.mit.dig.saveface.model.siocTypes.VideoChannelImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.VideoChannelImpl.getVideoChannel(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of VideoChannel for every resource in the model with rdf:Type http://rdfs.org/sioc/types#VideoChannel
	 * @param model the Jena Model
	 * @return a List of VideoChannel
	 */
	public static java.util.List getAllVideoChannel(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,VideoChannel.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getVideoChannel(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ArgumentativeDiscussion.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ArgumentativeDiscussion
	 * @param model the Jena Model.
	 */
	public static ArgumentativeDiscussion createArgumentativeDiscussion(Resource resource, Model model) throws JastorException {
		return edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussionImpl.createArgumentativeDiscussion(resource,model);
	}
	
	/**
	 * Create a new instance of ArgumentativeDiscussion.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ArgumentativeDiscussion
	 * @param model the Jena Model.
	 */
	public static ArgumentativeDiscussion createArgumentativeDiscussion(String uri, Model model) throws JastorException {
		ArgumentativeDiscussion obj = edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussionImpl.createArgumentativeDiscussion(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ArgumentativeDiscussion.  Leaves the model unchanged.
	 * @param uri The uri of the ArgumentativeDiscussion
	 * @param model the Jena Model.
	 */
	public static ArgumentativeDiscussion getArgumentativeDiscussion(String uri, Model model) throws JastorException {
		return getArgumentativeDiscussion(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ArgumentativeDiscussion.  Leaves the model unchanged.
	 * @param resource The resource of the ArgumentativeDiscussion
	 * @param model the Jena Model.
	 */
	public static ArgumentativeDiscussion getArgumentativeDiscussion(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussion.class.hashCode()) + resource.toString();
		edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussionImpl obj = (edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussionImpl)objects.get(code);
		if (obj == null) {
			obj = edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussionImpl.getArgumentativeDiscussion(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ArgumentativeDiscussion for every resource in the model with rdf:Type http://rdfs.org/sioc/types#ArgumentativeDiscussion
	 * @param model the Jena Model
	 * @return a List of ArgumentativeDiscussion
	 */
	public static java.util.List getAllArgumentativeDiscussion(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ArgumentativeDiscussion.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getArgumentativeDiscussion(stmt.getSubject(),model));
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
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ArgumentativeDiscussion"))) {
			return getArgumentativeDiscussion(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#VideoChannel"))) {
			return getVideoChannel(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#SubscriptionList"))) {
			return getSubscriptionList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Comment"))) {
			return getComment(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Microblog"))) {
			return getMicroblog(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#EventCalendar"))) {
			return getEventCalendar(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ImageGallery"))) {
			return getImageGallery(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ChatChannel"))) {
			return getChatChannel(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Wiki"))) {
			return getWiki(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ResumeBank"))) {
			return getResumeBank(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ProjectDirectory"))) {
			return getProjectDirectory(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#MicroblogPost"))) {
			return getMicroblogPost(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Answer"))) {
			return getAnswer(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#SurveyCollection"))) {
			return getSurveyCollection(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Question"))) {
			return getQuestion(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#MailingList"))) {
			return getMailingList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#FavouriteThings"))) {
			return getFavouriteThings(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Playlist"))) {
			return getPlaylist(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#BookmarkFolder"))) {
			return getBookmarkFolder(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#AddressBook"))) {
			return getAddressBook(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#BestAnswer"))) {
			return getBestAnswer(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Category"))) {
			return getCategory(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2008/05/skos#Concept"))) {
			return getConcept(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#InstantMessage"))) {
			return getInstantMessage(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#BoardPost"))) {
			return getBoardPost(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Poll"))) {
			return getPoll(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Weblog"))) {
			return getWeblog(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ReadingList"))) {
			return getReadingList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Tag"))) {
			return getTag(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#AudioChannel"))) {
			return getAudioChannel(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#MailMessage"))) {
			return getMailMessage(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#WishList"))) {
			return getWishList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#MessageBoard"))) {
			return getMessageBoard(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#OfferList"))) {
			return getOfferList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#Briefcase"))) {
			return getBriefcase(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#AnnotationSet"))) {
			return getAnnotationSet(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#BlogPost"))) {
			return getBlogPost(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#ReviewArea"))) {
			return getReviewArea(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://rdfs.org/sioc/types#WikiArticle"))) {
			return getWikiArticle(res,model);
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
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussion.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ArgumentativeDiscussion.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.VideoChannel.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.VideoChannel.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.SubscriptionList.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.SubscriptionList.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Comment.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Comment.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Microblog.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Microblog.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.EventCalendar.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.EventCalendar.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ImageGallery.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ImageGallery.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ChatChannel.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ChatChannel.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Wiki.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Wiki.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ResumeBank.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ResumeBank.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ProjectDirectory.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ProjectDirectory.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.MicroblogPost.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.MicroblogPost.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Answer.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Answer.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.SurveyCollection.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.SurveyCollection.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Question.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Question.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.MailingList.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.MailingList.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.FavouriteThings.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.FavouriteThings.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Playlist.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Playlist.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.BookmarkFolder.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.BookmarkFolder.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.AddressBook.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.AddressBook.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.BestAnswer.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.BestAnswer.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Category.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Category.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Concept.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Concept.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.InstantMessage.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.InstantMessage.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.BoardPost.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.BoardPost.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Poll.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Poll.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Weblog.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Weblog.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ReadingList.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ReadingList.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Tag.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Tag.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.AudioChannel.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.AudioChannel.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.MailMessage.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.MailMessage.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.WishList.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.WishList.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.MessageBoard.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.MessageBoard.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.OfferList.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.OfferList.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.Briefcase.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.Briefcase.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.AnnotationSet.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.AnnotationSet.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.BlogPost.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.BlogPost.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.ReviewArea.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.ReviewArea.class);
		}
		if (type.equals(edu.mit.dig.saveface.model.siocTypes.WikiArticle.TYPE)) {
			types.add(edu.mit.dig.saveface.model.siocTypes.WikiArticle.class);
		}
		return types;
	}
}