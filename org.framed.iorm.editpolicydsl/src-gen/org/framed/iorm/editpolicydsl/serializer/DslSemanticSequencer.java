/*
 * generated by Xtext 2.13.0
 */
package org.framed.iorm.editpolicydsl.serializer;

import Editpolicymodel.AndRule;
import Editpolicymodel.EditpolicymodelPackage;
import Editpolicymodel.FalseRule;
import Editpolicymodel.ImplicationRule;
import Editpolicymodel.IsFeature;
import Editpolicymodel.IsStepIn;
import Editpolicymodel.Model;
import Editpolicymodel.NotRule;
import Editpolicymodel.OrRule;
import Editpolicymodel.Policy;
import Editpolicymodel.Rule;
import Editpolicymodel.TrueRule;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.framed.iorm.editpolicydsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EditpolicymodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EditpolicymodelPackage.AND_RULE:
				if (rule == grammarAccess.getConstraintExpressionRule()
						|| rule == grammarAccess.getImplicationConstraintRule()
						|| action == grammarAccess.getImplicationConstraintAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrConstraintRule()
						|| action == grammarAccess.getOrConstraintAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndConstraintRule()
						|| action == grammarAccess.getAndConstraintAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotConstraintExpressionRule()
						|| rule == grammarAccess.getPrimaryConstraintRule()) {
					sequence_AndConstraint(context, (AndRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureExpressionRule()
						|| rule == grammarAccess.getImplicationFeatureRule()
						|| action == grammarAccess.getImplicationFeatureAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrFeatureRule()
						|| action == grammarAccess.getOrFeatureAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndFeatureRule()
						|| action == grammarAccess.getAndFeatureAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotFeatureExpressionRule()
						|| rule == grammarAccess.getPrimaryFeatureRule()) {
					sequence_AndFeature(context, (AndRule) semanticObject); 
					return; 
				}
				else break;
			case EditpolicymodelPackage.FALSE_RULE:
				sequence_FalseRule(context, (FalseRule) semanticObject); 
				return; 
			case EditpolicymodelPackage.IMPLICATION_RULE:
				if (rule == grammarAccess.getConstraintExpressionRule()
						|| rule == grammarAccess.getImplicationConstraintRule()
						|| action == grammarAccess.getImplicationConstraintAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrConstraintRule()
						|| action == grammarAccess.getOrConstraintAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndConstraintRule()
						|| action == grammarAccess.getAndConstraintAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotConstraintExpressionRule()
						|| rule == grammarAccess.getPrimaryConstraintRule()) {
					sequence_ImplicationConstraint(context, (ImplicationRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getImplicationFeatureRule()) {
					sequence_ImplicationFeature(context, (ImplicationRule) semanticObject); 
					return; 
				}
				else break;
			case EditpolicymodelPackage.IS_FEATURE:
				sequence_IsFeature(context, (IsFeature) semanticObject); 
				return; 
			case EditpolicymodelPackage.IS_STEP_IN:
				sequence_StepIn(context, (IsStepIn) semanticObject); 
				return; 
			case EditpolicymodelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case EditpolicymodelPackage.NOT_RULE:
				if (rule == grammarAccess.getConstraintExpressionRule()
						|| rule == grammarAccess.getImplicationConstraintRule()
						|| action == grammarAccess.getImplicationConstraintAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrConstraintRule()
						|| action == grammarAccess.getOrConstraintAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndConstraintRule()
						|| action == grammarAccess.getAndConstraintAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotConstraintExpressionRule()
						|| rule == grammarAccess.getPrimaryConstraintRule()) {
					sequence_NotConstraintExpression(context, (NotRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureExpressionRule()
						|| rule == grammarAccess.getImplicationFeatureRule()
						|| action == grammarAccess.getImplicationFeatureAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrFeatureRule()
						|| action == grammarAccess.getOrFeatureAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndFeatureRule()
						|| action == grammarAccess.getAndFeatureAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotFeatureExpressionRule()
						|| rule == grammarAccess.getPrimaryFeatureRule()) {
					sequence_NotFeatureExpression(context, (NotRule) semanticObject); 
					return; 
				}
				else break;
			case EditpolicymodelPackage.OR_RULE:
				if (rule == grammarAccess.getConstraintExpressionRule()
						|| rule == grammarAccess.getImplicationConstraintRule()
						|| action == grammarAccess.getImplicationConstraintAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrConstraintRule()
						|| action == grammarAccess.getOrConstraintAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndConstraintRule()
						|| action == grammarAccess.getAndConstraintAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotConstraintExpressionRule()
						|| rule == grammarAccess.getPrimaryConstraintRule()) {
					sequence_OrConstraint(context, (OrRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureExpressionRule()
						|| rule == grammarAccess.getImplicationFeatureRule()
						|| action == grammarAccess.getImplicationFeatureAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrFeatureRule()
						|| action == grammarAccess.getOrFeatureAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndFeatureRule()
						|| action == grammarAccess.getAndFeatureAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotFeatureExpressionRule()
						|| rule == grammarAccess.getPrimaryFeatureRule()) {
					sequence_OrFeature(context, (OrRule) semanticObject); 
					return; 
				}
				else break;
			case EditpolicymodelPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case EditpolicymodelPackage.RULE:
				if (rule == grammarAccess.getFeatureRuleRule()
						|| rule == grammarAccess.getIsFeatureRuleRule()
						|| rule == grammarAccess.getFeatureExpressionRule()
						|| rule == grammarAccess.getImplicationFeatureRule()
						|| action == grammarAccess.getImplicationFeatureAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrFeatureRule()
						|| action == grammarAccess.getOrFeatureAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndFeatureRule()
						|| action == grammarAccess.getAndFeatureAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotFeatureExpressionRule()
						|| rule == grammarAccess.getPrimaryFeatureRule()) {
					sequence_IsFeatureRule(context, (Rule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConstraintRuleRule()
						|| rule == grammarAccess.getStepInRuleRule()
						|| rule == grammarAccess.getConstraintExpressionRule()
						|| rule == grammarAccess.getImplicationConstraintRule()
						|| action == grammarAccess.getImplicationConstraintAccess().getImplicationRuleLeftRuleAction_1_0()
						|| rule == grammarAccess.getOrConstraintRule()
						|| action == grammarAccess.getOrConstraintAccess().getOrRuleRulesAction_1_0()
						|| rule == grammarAccess.getAndConstraintRule()
						|| action == grammarAccess.getAndConstraintAccess().getAndRuleRulesAction_1_0()
						|| rule == grammarAccess.getNotConstraintExpressionRule()
						|| rule == grammarAccess.getPrimaryConstraintRule()) {
					sequence_StepInRule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case EditpolicymodelPackage.TRUE_RULE:
				sequence_TrueRule(context, (TrueRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns AndRule
	 *     ImplicationConstraint returns AndRule
	 *     ImplicationConstraint.ImplicationRule_1_0 returns AndRule
	 *     OrConstraint returns AndRule
	 *     OrConstraint.OrRule_1_0 returns AndRule
	 *     AndConstraint returns AndRule
	 *     AndConstraint.AndRule_1_0 returns AndRule
	 *     NotConstraintExpression returns AndRule
	 *     PrimaryConstraint returns AndRule
	 *
	 * Constraint:
	 *     (rules+=AndConstraint_AndRule_1_0 rules+=NotConstraintExpression)
	 */
	protected void sequence_AndConstraint(ISerializationContext context, AndRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureExpression returns AndRule
	 *     ImplicationFeature returns AndRule
	 *     ImplicationFeature.ImplicationRule_1_0 returns AndRule
	 *     OrFeature returns AndRule
	 *     OrFeature.OrRule_1_0 returns AndRule
	 *     AndFeature returns AndRule
	 *     AndFeature.AndRule_1_0 returns AndRule
	 *     NotFeatureExpression returns AndRule
	 *     PrimaryFeature returns AndRule
	 *
	 * Constraint:
	 *     (rules+=AndFeature_AndRule_1_0 rules+=NotFeatureExpression)
	 */
	protected void sequence_AndFeature(ISerializationContext context, AndRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FalseRule returns FalseRule
	 *
	 * Constraint:
	 *     {FalseRule}
	 */
	protected void sequence_FalseRule(ISerializationContext context, FalseRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns ImplicationRule
	 *     ImplicationConstraint returns ImplicationRule
	 *     ImplicationConstraint.ImplicationRule_1_0 returns ImplicationRule
	 *     OrConstraint returns ImplicationRule
	 *     OrConstraint.OrRule_1_0 returns ImplicationRule
	 *     AndConstraint returns ImplicationRule
	 *     AndConstraint.AndRule_1_0 returns ImplicationRule
	 *     NotConstraintExpression returns ImplicationRule
	 *     PrimaryConstraint returns ImplicationRule
	 *
	 * Constraint:
	 *     (leftRule=ImplicationConstraint_ImplicationRule_1_0 rightRule=OrConstraint)
	 */
	protected void sequence_ImplicationConstraint(ISerializationContext context, ImplicationRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__LEFT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__LEFT_RULE));
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__RIGHT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__RIGHT_RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplicationConstraintAccess().getImplicationRuleLeftRuleAction_1_0(), semanticObject.getLeftRule());
		feeder.accept(grammarAccess.getImplicationConstraintAccess().getRightRuleOrConstraintParserRuleCall_1_2_0(), semanticObject.getRightRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImplicationFeature returns ImplicationRule
	 *
	 * Constraint:
	 *     (leftRule=ImplicationFeature_ImplicationRule_1_0 rightRule=OrFeature)
	 */
	protected void sequence_ImplicationFeature(ISerializationContext context, ImplicationRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__LEFT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__LEFT_RULE));
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__RIGHT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.BINARY_RULE__RIGHT_RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplicationFeatureAccess().getImplicationRuleLeftRuleAction_1_0(), semanticObject.getLeftRule());
		feeder.accept(grammarAccess.getImplicationFeatureAccess().getRightRuleOrFeatureParserRuleCall_1_2_0(), semanticObject.getRightRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureRule returns Rule
	 *     IsFeatureRule returns Rule
	 *     FeatureExpression returns Rule
	 *     ImplicationFeature returns Rule
	 *     ImplicationFeature.ImplicationRule_1_0 returns Rule
	 *     OrFeature returns Rule
	 *     OrFeature.OrRule_1_0 returns Rule
	 *     AndFeature returns Rule
	 *     AndFeature.AndRule_1_0 returns Rule
	 *     NotFeatureExpression returns Rule
	 *     PrimaryFeature returns Rule
	 *
	 * Constraint:
	 *     rule=IsFeature
	 */
	protected void sequence_IsFeatureRule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsFeatureRuleAccess().getRuleIsFeatureParserRuleCall_1_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IsFeature returns IsFeature
	 *
	 * Constraint:
	 *     {IsFeature}
	 */
	protected void sequence_IsFeature(ISerializationContext context, IsFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (policies+=Policy policies+=Policy*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns NotRule
	 *     ImplicationConstraint returns NotRule
	 *     ImplicationConstraint.ImplicationRule_1_0 returns NotRule
	 *     OrConstraint returns NotRule
	 *     OrConstraint.OrRule_1_0 returns NotRule
	 *     AndConstraint returns NotRule
	 *     AndConstraint.AndRule_1_0 returns NotRule
	 *     NotConstraintExpression returns NotRule
	 *     PrimaryConstraint returns NotRule
	 *
	 * Constraint:
	 *     rule=PrimaryConstraint
	 */
	protected void sequence_NotConstraintExpression(ISerializationContext context, NotRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.UNARY_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.UNARY_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotConstraintExpressionAccess().getRulePrimaryConstraintParserRuleCall_1_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureExpression returns NotRule
	 *     ImplicationFeature returns NotRule
	 *     ImplicationFeature.ImplicationRule_1_0 returns NotRule
	 *     OrFeature returns NotRule
	 *     OrFeature.OrRule_1_0 returns NotRule
	 *     AndFeature returns NotRule
	 *     AndFeature.AndRule_1_0 returns NotRule
	 *     NotFeatureExpression returns NotRule
	 *     PrimaryFeature returns NotRule
	 *
	 * Constraint:
	 *     rule=PrimaryFeature
	 */
	protected void sequence_NotFeatureExpression(ISerializationContext context, NotRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.UNARY_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.UNARY_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotFeatureExpressionAccess().getRulePrimaryFeatureParserRuleCall_1_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns OrRule
	 *     ImplicationConstraint returns OrRule
	 *     ImplicationConstraint.ImplicationRule_1_0 returns OrRule
	 *     OrConstraint returns OrRule
	 *     OrConstraint.OrRule_1_0 returns OrRule
	 *     AndConstraint returns OrRule
	 *     AndConstraint.AndRule_1_0 returns OrRule
	 *     NotConstraintExpression returns OrRule
	 *     PrimaryConstraint returns OrRule
	 *
	 * Constraint:
	 *     (rules+=OrConstraint_OrRule_1_0 rules+=AndConstraint)
	 */
	protected void sequence_OrConstraint(ISerializationContext context, OrRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureExpression returns OrRule
	 *     ImplicationFeature returns OrRule
	 *     ImplicationFeature.ImplicationRule_1_0 returns OrRule
	 *     OrFeature returns OrRule
	 *     OrFeature.OrRule_1_0 returns OrRule
	 *     AndFeature returns OrRule
	 *     AndFeature.AndRule_1_0 returns OrRule
	 *     NotFeatureExpression returns OrRule
	 *     PrimaryFeature returns OrRule
	 *
	 * Constraint:
	 *     (rules+=OrFeature_OrRule_1_0 rules+=AndFeature)
	 */
	protected void sequence_OrFeature(ISerializationContext context, OrRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Policy returns Policy
	 *
	 * Constraint:
	 *     (override?='override' action=ActionEnum actionType=ActionTypeEnum featureRule=FeatureExpression constraintRule=ConstraintExpression)
	 */
	protected void sequence_Policy(ISerializationContext context, Policy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.POLICY__OVERRIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.POLICY__OVERRIDE));
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.POLICY__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.POLICY__ACTION));
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.POLICY__ACTION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.POLICY__ACTION_TYPE));
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.POLICY__FEATURE_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.POLICY__FEATURE_RULE));
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.POLICY__CONSTRAINT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.POLICY__CONSTRAINT_RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0(), semanticObject.getOverride());
		feeder.accept(grammarAccess.getPolicyAccess().getActionActionEnumEnumRuleCall_1_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getPolicyAccess().getActionTypeActionTypeEnumEnumRuleCall_2_0(), semanticObject.getActionType());
		feeder.accept(grammarAccess.getPolicyAccess().getFeatureRuleFeatureExpressionParserRuleCall_4_0(), semanticObject.getFeatureRule());
		feeder.accept(grammarAccess.getPolicyAccess().getConstraintRuleConstraintExpressionParserRuleCall_6_0(), semanticObject.getConstraintRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns Rule
	 *     StepInRule returns Rule
	 *     ConstraintExpression returns Rule
	 *     ImplicationConstraint returns Rule
	 *     ImplicationConstraint.ImplicationRule_1_0 returns Rule
	 *     OrConstraint returns Rule
	 *     OrConstraint.OrRule_1_0 returns Rule
	 *     AndConstraint returns Rule
	 *     AndConstraint.AndRule_1_0 returns Rule
	 *     NotConstraintExpression returns Rule
	 *     PrimaryConstraint returns Rule
	 *
	 * Constraint:
	 *     rule=StepIn
	 */
	protected void sequence_StepInRule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditpolicymodelPackage.Literals.RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditpolicymodelPackage.Literals.RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStepInRuleAccess().getRuleStepInParserRuleCall_1_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StepIn returns IsStepIn
	 *
	 * Constraint:
	 *     {IsStepIn}
	 */
	protected void sequence_StepIn(ISerializationContext context, IsStepIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns TrueRule
	 *     FeatureRule returns TrueRule
	 *     TrueRule returns TrueRule
	 *     FeatureExpression returns TrueRule
	 *     ImplicationFeature returns TrueRule
	 *     ImplicationFeature.ImplicationRule_1_0 returns TrueRule
	 *     OrFeature returns TrueRule
	 *     OrFeature.OrRule_1_0 returns TrueRule
	 *     AndFeature returns TrueRule
	 *     AndFeature.AndRule_1_0 returns TrueRule
	 *     NotFeatureExpression returns TrueRule
	 *     PrimaryFeature returns TrueRule
	 *     ConstraintExpression returns TrueRule
	 *     ImplicationConstraint returns TrueRule
	 *     ImplicationConstraint.ImplicationRule_1_0 returns TrueRule
	 *     OrConstraint returns TrueRule
	 *     OrConstraint.OrRule_1_0 returns TrueRule
	 *     AndConstraint returns TrueRule
	 *     AndConstraint.AndRule_1_0 returns TrueRule
	 *     NotConstraintExpression returns TrueRule
	 *     PrimaryConstraint returns TrueRule
	 *
	 * Constraint:
	 *     {TrueRule}
	 */
	protected void sequence_TrueRule(ISerializationContext context, TrueRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
