/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBlock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XBlock#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXBlock()
 * @model
 * @generated
 */
public interface XBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXBlock_Operators()
	 * @model containment="true"
	 * @generated
	 */
	EList<XOperator> getOperators();

} // XBlock
