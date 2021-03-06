/**
 */
package editpolicymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editpolicymodel.Policy#getOverride <em>Override</em>}</li>
 *   <li>{@link editpolicymodel.Policy#getAction <em>Action</em>}</li>
 *   <li>{@link editpolicymodel.Policy#getActionType <em>Action Type</em>}</li>
 *   <li>{@link editpolicymodel.Policy#getFeatureRule <em>Feature Rule</em>}</li>
 *   <li>{@link editpolicymodel.Policy#getConstraintRule <em>Constraint Rule</em>}</li>
 * </ul>
 *
 * @see editpolicymodel.editpolicymodelPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Override</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' attribute.
	 * @see #setOverride(Boolean)
	 * @see editpolicymodel.editpolicymodelPackage#getPolicy_Override()
	 * @model default="false"
	 * @generated
	 */
	Boolean getOverride();

	/**
	 * Sets the value of the '{@link editpolicymodel.Policy#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(Boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>"Create"</code>.
	 * The literals are from the enumeration {@link editpolicymodel.ActionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see editpolicymodel.ActionEnum
	 * @see #setAction(ActionEnum)
	 * @see editpolicymodel.editpolicymodelPackage#getPolicy_Action()
	 * @model default="Create"
	 * @generated
	 */
	ActionEnum getAction();

	/**
	 * Sets the value of the '{@link editpolicymodel.Policy#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see editpolicymodel.ActionEnum
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionEnum value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link editpolicymodel.TypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see editpolicymodel.TypeEnum
	 * @see #setActionType(TypeEnum)
	 * @see editpolicymodel.editpolicymodelPackage#getPolicy_ActionType()
	 * @model required="true"
	 * @generated
	 */
	TypeEnum getActionType();

	/**
	 * Sets the value of the '{@link editpolicymodel.Policy#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see editpolicymodel.TypeEnum
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(TypeEnum value);

	/**
	 * Returns the value of the '<em><b>Feature Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Rule</em>' containment reference.
	 * @see #setFeatureRule(FeatureRule)
	 * @see editpolicymodel.editpolicymodelPackage#getPolicy_FeatureRule()
	 * @model containment="true"
	 * @generated
	 */
	FeatureRule getFeatureRule();

	/**
	 * Sets the value of the '{@link editpolicymodel.Policy#getFeatureRule <em>Feature Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Rule</em>' containment reference.
	 * @see #getFeatureRule()
	 * @generated
	 */
	void setFeatureRule(FeatureRule value);

	/**
	 * Returns the value of the '<em><b>Constraint Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Rule</em>' containment reference.
	 * @see #setConstraintRule(ConstraintRule)
	 * @see editpolicymodel.editpolicymodelPackage#getPolicy_ConstraintRule()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintRule getConstraintRule();

	/**
	 * Sets the value of the '{@link editpolicymodel.Policy#getConstraintRule <em>Constraint Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Rule</em>' containment reference.
	 * @see #getConstraintRule()
	 * @generated
	 */
	void setConstraintRule(ConstraintRule value);

} // Policy
