

package edu.mit.dig.saveface.model.siocTypes;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
*/
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link edu.mit.dig.saveface.model.siocTypes.Concept}
 * Use the edu.mit.dig.saveface.model.siocTypes.Factory to create instances of this class.
 * <p>(URI: http://www.w3.org/2008/05/skos#Concept)</p>
 * <br>
 */
public class ConceptImpl extends com.ibm.adtech.jastor.ThingImpl implements edu.mit.dig.saveface.model.siocTypes.Concept {
	

 

	ConceptImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static ConceptImpl getConcept(Resource resource, Model model) throws JastorException {
		return new ConceptImpl(resource, model);
	}
	    
	static ConceptImpl createConcept(Resource resource, Model model) throws JastorException { 
		ConceptImpl impl = new ConceptImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Concept.TYPE)))
			impl._model.add(impl._resource, RDF.type, Concept.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	edu.mit.dig.saveface.model.siocTypes.Factory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,RDF.type, edu.mit.dig.saveface.model.siocTypes.Concept.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof ConceptListener))
			throw new IllegalArgumentException("ThingListener must be instance of ConceptListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((ConceptListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof ConceptListener))
			throw new IllegalArgumentException("ThingListener must be instance of ConceptListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
		}

	//}
	


}