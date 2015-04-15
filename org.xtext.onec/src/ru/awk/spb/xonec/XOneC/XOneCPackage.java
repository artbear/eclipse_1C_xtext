/**
 */
package ru.awk.spb.xonec.XOneC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.awk.spb.xonec.XOneC.XOneCFactory
 * @model kind="package"
 * @generated
 */
public interface XOneCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XOneC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ru.spb.awk.onecx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XOneC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XOneCPackage eINSTANCE = ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XModuleImpl <em>XModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XModuleImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXModule()
	 * @generated
	 */
	int XMODULE = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODULE__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODULE__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODULE__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>XModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XVariableImpl <em>XVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XVariableImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXVariable()
	 * @generated
	 */
	int XVARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVARIABLE__PUBLIC = 1;

	/**
	 * The number of structural features of the '<em>XVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl <em>XMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XMethodImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXMethod()
	 * @generated
	 */
	int XMETHOD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__NAME = XVARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__PUBLIC = XVARIABLE__PUBLIC;

	/**
	 * The feature id for the '<em><b>Ret Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__RET_VAL = XVARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__VARIABLES = XVARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__PARAMS = XVARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__CONTEXT = XVARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__BLOCK = XVARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_FEATURE_COUNT = XVARIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XParamsImpl <em>XParams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XParamsImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXParams()
	 * @generated
	 */
	int XPARAMS = 3;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAMS__PARAMS = 0;

	/**
	 * The number of structural features of the '<em>XParams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAMS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XParamImpl <em>XParam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XParamImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXParam()
	 * @generated
	 */
	int XPARAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>By Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAM__BY_VAL = 1;

	/**
	 * The number of structural features of the '<em>XParam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XOperatorImpl <em>XOperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XOperatorImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXOperator()
	 * @generated
	 */
	int XOPERATOR = 5;

	/**
	 * The number of structural features of the '<em>XOperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATOR_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XVariablesImpl <em>XVariables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XVariablesImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXVariables()
	 * @generated
	 */
	int XVARIABLES = 6;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVARIABLES__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVARIABLES__CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>XVariables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVARIABLES_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link ru.awk.spb.xonec.XOneC.impl.XBlockImpl <em>XBlock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.awk.spb.xonec.XOneC.impl.XBlockImpl
	 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXBlock()
	 * @generated
	 */
	int XBLOCK = 7;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBLOCK__OPERATORS = 0;

	/**
	 * The number of structural features of the '<em>XBlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBLOCK_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XModule <em>XModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XModule</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XModule
	 * @generated
	 */
	EClass getXModule();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.awk.spb.xonec.XOneC.XModule#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XModule#getMethods()
	 * @see #getXModule()
	 * @generated
	 */
	EReference getXModule_Methods();

	/**
	 * Returns the meta object for the containment reference '{@link ru.awk.spb.xonec.XOneC.XModule#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XModule#getBlock()
	 * @see #getXModule()
	 * @generated
	 */
	EReference getXModule_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.awk.spb.xonec.XOneC.XModule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XModule#getVariables()
	 * @see #getXModule()
	 * @generated
	 */
	EReference getXModule_Variables();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XVariable <em>XVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XVariable</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XVariable
	 * @generated
	 */
	EClass getXVariable();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XVariable#getName()
	 * @see #getXVariable()
	 * @generated
	 */
	EAttribute getXVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XVariable#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XVariable#isPublic()
	 * @see #getXVariable()
	 * @generated
	 */
	EAttribute getXVariable_Public();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XMethod <em>XMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMethod</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XMethod
	 * @generated
	 */
	EClass getXMethod();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XMethod#isRetVal <em>Ret Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ret Val</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XMethod#isRetVal()
	 * @see #getXMethod()
	 * @generated
	 */
	EAttribute getXMethod_RetVal();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.awk.spb.xonec.XOneC.XMethod#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XMethod#getVariables()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link ru.awk.spb.xonec.XOneC.XMethod#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XMethod#getParams()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_Params();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XMethod#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XMethod#getContext()
	 * @see #getXMethod()
	 * @generated
	 */
	EAttribute getXMethod_Context();

	/**
	 * Returns the meta object for the containment reference '{@link ru.awk.spb.xonec.XOneC.XMethod#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XMethod#getBlock()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_Block();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XParams <em>XParams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XParams</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XParams
	 * @generated
	 */
	EClass getXParams();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.awk.spb.xonec.XOneC.XParams#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XParams#getParams()
	 * @see #getXParams()
	 * @generated
	 */
	EReference getXParams_Params();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XParam <em>XParam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XParam</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XParam
	 * @generated
	 */
	EClass getXParam();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XParam#getName()
	 * @see #getXParam()
	 * @generated
	 */
	EAttribute getXParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XParam#isByVal <em>By Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Val</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XParam#isByVal()
	 * @see #getXParam()
	 * @generated
	 */
	EAttribute getXParam_ByVal();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XOperator <em>XOperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOperator</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XOperator
	 * @generated
	 */
	EClass getXOperator();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XVariables <em>XVariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XVariables</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XVariables
	 * @generated
	 */
	EClass getXVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.awk.spb.xonec.XOneC.XVariables#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XVariables#getVariables()
	 * @see #getXVariables()
	 * @generated
	 */
	EReference getXVariables_Variables();

	/**
	 * Returns the meta object for the attribute '{@link ru.awk.spb.xonec.XOneC.XVariables#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XVariables#getContext()
	 * @see #getXVariables()
	 * @generated
	 */
	EAttribute getXVariables_Context();

	/**
	 * Returns the meta object for class '{@link ru.awk.spb.xonec.XOneC.XBlock <em>XBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBlock</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XBlock
	 * @generated
	 */
	EClass getXBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.awk.spb.xonec.XOneC.XBlock#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see ru.awk.spb.xonec.XOneC.XBlock#getOperators()
	 * @see #getXBlock()
	 * @generated
	 */
	EReference getXBlock_Operators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XOneCFactory getXOneCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XModuleImpl <em>XModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XModuleImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXModule()
		 * @generated
		 */
		EClass XMODULE = eINSTANCE.getXModule();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMODULE__METHODS = eINSTANCE.getXModule_Methods();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMODULE__BLOCK = eINSTANCE.getXModule_Block();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMODULE__VARIABLES = eINSTANCE.getXModule_Variables();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XVariableImpl <em>XVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XVariableImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXVariable()
		 * @generated
		 */
		EClass XVARIABLE = eINSTANCE.getXVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XVARIABLE__NAME = eINSTANCE.getXVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XVARIABLE__PUBLIC = eINSTANCE.getXVariable_Public();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XMethodImpl <em>XMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XMethodImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXMethod()
		 * @generated
		 */
		EClass XMETHOD = eINSTANCE.getXMethod();

		/**
		 * The meta object literal for the '<em><b>Ret Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMETHOD__RET_VAL = eINSTANCE.getXMethod_RetVal();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__VARIABLES = eINSTANCE.getXMethod_Variables();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__PARAMS = eINSTANCE.getXMethod_Params();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMETHOD__CONTEXT = eINSTANCE.getXMethod_Context();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__BLOCK = eINSTANCE.getXMethod_Block();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XParamsImpl <em>XParams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XParamsImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXParams()
		 * @generated
		 */
		EClass XPARAMS = eINSTANCE.getXParams();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPARAMS__PARAMS = eINSTANCE.getXParams_Params();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XParamImpl <em>XParam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XParamImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXParam()
		 * @generated
		 */
		EClass XPARAM = eINSTANCE.getXParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPARAM__NAME = eINSTANCE.getXParam_Name();

		/**
		 * The meta object literal for the '<em><b>By Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPARAM__BY_VAL = eINSTANCE.getXParam_ByVal();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XOperatorImpl <em>XOperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XOperatorImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXOperator()
		 * @generated
		 */
		EClass XOPERATOR = eINSTANCE.getXOperator();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XVariablesImpl <em>XVariables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XVariablesImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXVariables()
		 * @generated
		 */
		EClass XVARIABLES = eINSTANCE.getXVariables();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XVARIABLES__VARIABLES = eINSTANCE.getXVariables_Variables();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XVARIABLES__CONTEXT = eINSTANCE.getXVariables_Context();

		/**
		 * The meta object literal for the '{@link ru.awk.spb.xonec.XOneC.impl.XBlockImpl <em>XBlock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.awk.spb.xonec.XOneC.impl.XBlockImpl
		 * @see ru.awk.spb.xonec.XOneC.impl.XOneCPackageImpl#getXBlock()
		 * @generated
		 */
		EClass XBLOCK = eINSTANCE.getXBlock();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBLOCK__OPERATORS = eINSTANCE.getXBlock_Operators();

	}

} //XOneCPackage
