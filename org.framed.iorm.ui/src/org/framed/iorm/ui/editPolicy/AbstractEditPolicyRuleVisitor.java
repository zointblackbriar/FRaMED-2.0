package org.framed.iorm.ui.editPolicy;

import org.framed.iorm.featuremodel.FRaMEDConfiguration;

import Editpolicymodel.AbstractRule;
import Editpolicymodel.AndRule;
import Editpolicymodel.FalseRule;
import Editpolicymodel.NotRule;
import Editpolicymodel.OrRule;
import Editpolicymodel.TrueRule;

/**
 * This class provides the rule-parse for the editPolicy-Mapping-configuration. Using VisitorPattern
 *
 * @author Christian Deussen
 *
 */
public abstract class AbstractEditPolicyRuleVisitor<T> {

	/**
	 * current configuration of editor
	 */
	@SuppressWarnings("unused")
	private FRaMEDConfiguration configuration;

	public AbstractEditPolicyRuleVisitor(FRaMEDConfiguration framedConfiguration)
	{
		this.configuration = framedConfiguration;
	}
	
	/**
	 * root Visitor of mappingRule:
	 * dispatches to specific rule
	 *
	 * returns whether the given rule is enabled according to configuration
	 *
	 * @param rule
	 * @return Boolean
	 */
	
	public boolean checkRule(AbstractRule<T> rule)
	{
		if (rule instanceof AndRule)
			return andRuleVisitor((AndRule)rule);
		
		if (rule instanceof OrRule)
			return orRuleVisitor((OrRule)rule);
		
		if (rule instanceof NotRule)
			return notRuleVisitor((NotRule)rule);
		
		if (rule instanceof TrueRule)
			return true;		
		
		if (rule instanceof FalseRule)
			return false;

		System.out.println("checkRule for " + rule.getClass().toString() + " not implemented");
		return true;
	}
	
	private boolean andRuleVisitor(AndRule rule) {
		return checkRule(rule.getLeftRule()) && checkRule(rule.getRightRule());
	}
	
	private boolean orRuleVisitor(OrRule rule) {
		return checkRule(rule.getLeftRule()) && checkRule(rule.getRightRule());
	}
	
	private boolean notRuleVisitor(NotRule rule) {
		return checkRule(rule.getRule());
	}	
}
