/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XParam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XParam#getName <em>Name</em>}</li>
 *   <li>{@link ru.awk.spb.xonec.XOneC.XParam#isByVal <em>By Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXParam()
 * @model
 * @generated
 */
public interface XParam extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXParam_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XParam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>By Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Val</em>' attribute.
	 * @see #setByVal(boolean)
	 * @see ru.awk.spb.xonec.XOneC.XOneCPackage#getXParam_ByVal()
	 * @model
	 * @generated
	 */
	boolean isByVal();

	/**
	 * Sets the value of the '{@link ru.awk.spb.xonec.XOneC.XParam#isByVal <em>By Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Val</em>' attribute.
	 * @see #isByVal()
	 * @generated
	 */
	void setByVal(boolean value);

} // XParam
