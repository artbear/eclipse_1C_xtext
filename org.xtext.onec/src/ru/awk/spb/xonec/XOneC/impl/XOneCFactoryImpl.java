/**
 */
package ru.awk.spb.xonec.XOneC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.awk.spb.xonec.XOneC.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XOneCFactoryImpl extends EFactoryImpl implements XOneCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XOneCFactory init() {
		try {
			XOneCFactory theXOneCFactory = (XOneCFactory)EPackage.Registry.INSTANCE.getEFactory(XOneCPackage.eNS_URI);
			if (theXOneCFactory != null) {
				return theXOneCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XOneCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOneCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XOneCPackage.XMODULE: return createXModule();
			case XOneCPackage.XVARIABLE: return createXVariable();
			case XOneCPackage.XMETHOD: return createXMethod();
			case XOneCPackage.XPARAMS: return createXParams();
			case XOneCPackage.XPARAM: return createXParam();
			case XOneCPackage.XVARIABLES: return createXVariables();
			case XOneCPackage.XBLOCK: return createXBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XModule createXModule() {
		XModuleImpl xModule = new XModuleImpl();
		return xModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XVariable createXVariable() {
		XVariableImpl xVariable = new XVariableImpl();
		return xVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMethod createXMethod() {
		XMethodImpl xMethod = new XMethodImpl();
		return xMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParams createXParams() {
		XParamsImpl xParams = new XParamsImpl();
		return xParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParam createXParam() {
		XParamImpl xParam = new XParamImpl();
		return xParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XVariables createXVariables() {
		XVariablesImpl xVariables = new XVariablesImpl();
		return xVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBlock createXBlock() {
		XBlockImpl xBlock = new XBlockImpl();
		return xBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOneCPackage getXOneCPackage() {
		return (XOneCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XOneCPackage getPackage() {
		return XOneCPackage.eINSTANCE;
	}

} //XOneCFactoryImpl
