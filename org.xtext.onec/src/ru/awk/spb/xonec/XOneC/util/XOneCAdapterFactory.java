/**
 */
package ru.awk.spb.xonec.XOneC.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.awk.spb.xonec.XOneC.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.awk.spb.xonec.XOneC.XOneCPackage
 * @generated
 */
public class XOneCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XOneCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOneCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XOneCPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XOneCSwitch<Adapter> modelSwitch =
		new XOneCSwitch<Adapter>() {
			@Override
			public Adapter caseXModule(XModule object) {
				return createXModuleAdapter();
			}
			@Override
			public Adapter caseXVariable(XVariable object) {
				return createXVariableAdapter();
			}
			@Override
			public Adapter caseXMethod(XMethod object) {
				return createXMethodAdapter();
			}
			@Override
			public Adapter caseXParams(XParams object) {
				return createXParamsAdapter();
			}
			@Override
			public Adapter caseXParam(XParam object) {
				return createXParamAdapter();
			}
			@Override
			public Adapter caseXOperator(XOperator object) {
				return createXOperatorAdapter();
			}
			@Override
			public Adapter caseXVariables(XVariables object) {
				return createXVariablesAdapter();
			}
			@Override
			public Adapter caseXBlock(XBlock object) {
				return createXBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XModule <em>XModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XModule
	 * @generated
	 */
	public Adapter createXModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XVariable <em>XVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XVariable
	 * @generated
	 */
	public Adapter createXVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XMethod <em>XMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XMethod
	 * @generated
	 */
	public Adapter createXMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XParams <em>XParams</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XParams
	 * @generated
	 */
	public Adapter createXParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XParam <em>XParam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XParam
	 * @generated
	 */
	public Adapter createXParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XOperator <em>XOperator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XOperator
	 * @generated
	 */
	public Adapter createXOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XVariables <em>XVariables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XVariables
	 * @generated
	 */
	public Adapter createXVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.awk.spb.xonec.XOneC.XBlock <em>XBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.awk.spb.xonec.XOneC.XBlock
	 * @generated
	 */
	public Adapter createXBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XOneCAdapterFactory
