/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage
 * @generated
 */
public interface XOneCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XOneCFactory eINSTANCE = ru.awk.spb.xonec.XOneC.impl.XOneCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XModule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XModule</em>'.
	 * @generated
	 */
	XModule createXModule();

	/**
	 * Returns a new object of class '<em>XVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XVariable</em>'.
	 * @generated
	 */
	XVariable createXVariable();

	/**
	 * Returns a new object of class '<em>XMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMethod</em>'.
	 * @generated
	 */
	XMethod createXMethod();

	/**
	 * Returns a new object of class '<em>XParams</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XParams</em>'.
	 * @generated
	 */
	XParams createXParams();

	/**
	 * Returns a new object of class '<em>XParam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XParam</em>'.
	 * @generated
	 */
	XParam createXParam();

	/**
	 * Returns a new object of class '<em>XVariables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XVariables</em>'.
	 * @generated
	 */
	XVariables createXVariables();

	/**
	 * Returns a new object of class '<em>XBlock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBlock</em>'.
	 * @generated
	 */
	XBlock createXBlock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XOneCPackage getXOneCPackage();

} //XOneCFactory
