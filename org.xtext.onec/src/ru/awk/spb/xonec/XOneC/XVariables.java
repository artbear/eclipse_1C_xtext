/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XVariables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XVariables#getVariables <em>Variables</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XVariables#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXVariables()
 * @model
 * @generated
 */
public interface XVariables extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXVariables_Variables()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<XVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXVariables_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XVariables#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

} // XVariables
