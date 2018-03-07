/**
 */
package Editpolicymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Editpolicymodel.NaryRule#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see Editpolicymodel.EditpolicymodelPackage#getNaryRule()
 * @model abstract="true"
 * @generated
 */
public interface NaryRule<T> extends AbstractRule<T> {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see Editpolicymodel.EditpolicymodelPackage#getNaryRule_Rules()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	EList<T> getRules();

} // NaryRule
