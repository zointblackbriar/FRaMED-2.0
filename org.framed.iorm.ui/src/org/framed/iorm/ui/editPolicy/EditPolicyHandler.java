package org.framed.iorm.ui.editPolicy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.commands.Command;
import org.framed.iorm.featuremodel.FRaMEDConfiguration;
import org.framed.iorm.model.Model;
import org.framed.iorm.model.*;
import model.*;;



/**
 * This class provides canExecute(Command cmd) which checks whether a given command may execute according to editPolicies
 *
 * @author Christian Deussen
 *
 */
public class EditPolicyHandler {

	/**
	 * current configuration
	 */
	private FRaMEDConfiguration configuration;


	/**
	 * xmi model
	 */
	private Model model;
	/**
	 * list of Policy-Rules which need to be evaluated
	 */
	private Set<Policy> policies;

	public EditPolicyHandler(FRaMEDConfiguration configuration)
	{
		this.configuration = configuration;
		model = this.loadModel();

		this.loadPolicyRules();
	}

	/**
	 * loads all Policies which are activated by current configuration
	 */
	private void loadPolicyRules()
	{

		/*
		  System.out.println("-------------------------------");
		  for (FRaMEDFeature feature : this.configuration.getFeatures()) {
			  System.out.println("EditPolicyHandler feature: " + feature.getName().getName());
		  }
		  System.out.println("-------------------------------");
		

		policies = new HashSet<>();

		EditPolicyConfigurationVisitor editPolicyConfigurationVisitor = new EditPolicyConfigurationVisitor(configuration);
		for (Mapping mapping : (Mapping[]) model.getConfiguration()
				.getMappings().toArray()) {
			if (editPolicyConfigurationVisitor.abstractMappingRuleVisitor(mapping.getRule()))
				policies.add(mapping.getPolicy());
		}
		 */
	}

	/**
	 * canExecute is called to check whether a command is allowed to execute in a given situation
	 * checks each policy
	 *
	 * this function
	 * @param cmd
	 * @return Boolean
	 */
	public boolean canExecute(Command cmd)
	{
		/*
		EditPolicyRuleVisitor editPolicyRuleVisitor = new EditPolicyRuleVisitor(cmd, this.isStepOut);

		for (Policy policy : policies) {
			if (!editPolicyRuleVisitor.abstractRuleVisitor(policy.getRule())) {
				System.out.println("Not Allowed because of: " + policy.getName());
				return false;
			}
		}
				*/

		return true;
	}


	/*
	 * Load editPolicy ecore Model from file.
	 */
	private Model loadModel()
	{
		/*
		//String("platform:/plugin/org.framed.orm.editPolicy.model/model/noRules.xmi");
		//String filename = new String("platform:/plugin/org.framed.orm.editPolicy.model/model/basicRules.xmi");
		//String filename = new String("platform:/plugin/org.framed.orm.editPolicy.model/model/featureRules.xmi");
		String filename = new String("platform:/plugin/org.framed.orm.editPolicy.model/model/allRules.xmi");

		try {
			ResourceSet set = new ResourceSetImpl();
			Resource res = set.createResource(URI.createURI(filename));
			res.load(Collections.EMPTY_MAP);
			// if there are file contents in this directory
			if (res.getContents().size() > 0
					&& res.getContents().get(0) instanceof Model) {
				// load test file and add it to test list

				return (Model) res.getContents().get(0);
			}
		} catch (Exception e) {
			System.err.println("Was not able to load xmi:  \"" + filename + "\" due : " + e.toString());
			for (StackTraceElement el : e.getStackTrace())
				System.err.println(el.toString());
		}
				*/

		return null;
	}

	/**
	 * This method reloads the configuration. it is called when
	 * configuration has changed.
	 *
	 **/
	/*
	public void update(final ORMGraphicalEditor.EditorType type) {
		this.loadPolicyRules();
	}
			*/

}