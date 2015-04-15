/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XModule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XModule#getMethods <em>Methods</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XModule#getBlock <em>Block</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XModule#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXModule()
 * @model
 * @generated
 */
public interface XModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXModule_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<XMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(XBlock)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXModule_Block()
	 * @model containment="true"
	 * @generated
	 */
	XBlock getBlock();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XModule#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(XBlock value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ru.awk.spb.xonec.XOneC.XVariables}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXModule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<XVariables> getVariables();

} // XModule
