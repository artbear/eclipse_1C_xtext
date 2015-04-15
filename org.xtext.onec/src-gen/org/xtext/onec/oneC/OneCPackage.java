/**
 */
package org.xtext.onec.oneC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

import ru.awk.spb.xonec.XOneC.XOneCPackage;

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
 * @see org.xtext.onec.oneC.OneCFactory
 * @model kind="package"
 * @generated
 */
public interface OneCPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "oneC";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/onec/OneC";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "oneC";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OneCPackage eINSTANCE = org.xtext.onec.oneC.impl.OneCPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.LetImpl <em>Let</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.LetImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getLet()
   * @generated
   */
  int LET = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__NAME = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__VALUE = XOneCPackage.XOPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__LEFT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__RIGHT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__PARAMS = XOneCPackage.XOPERATOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__INDEX = XOneCPackage.XOPERATOR_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Let</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.FormalParamsImpl <em>Formal Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.FormalParamsImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getFormalParams()
   * @generated
   */
  int FORMAL_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Formal Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.ForImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getFor()
   * @generated
   */
  int FOR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__NAME = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__VALUE = XOneCPackage.XOPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Boundary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__BOUNDARY = XOneCPackage.XOPERATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__BLOCK = XOneCPackage.XOPERATOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.XExpressionImpl <em>XExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.XExpressionImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXExpression()
   * @generated
   */
  int XEXPRESSION = 3;

  /**
   * The number of structural features of the '<em>XExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.IfImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getIf()
   * @generated
   */
  int IF = 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CONDITION = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__BLOCK = XOneCPackage.XOPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alterblock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__ALTERBLOCK = XOneCPackage.XOPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.OperatorImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 5;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.XModuleImpl <em>XModule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.XModuleImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXModule()
   * @generated
   */
  int XMODULE = 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMODULE__METHODS = XOneCPackage.XMODULE__METHODS;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMODULE__BLOCK = XOneCPackage.XMODULE__BLOCK;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMODULE__VARIABLES = XOneCPackage.XMODULE__VARIABLES;

  /**
   * The number of structural features of the '<em>XModule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMODULE_FEATURE_COUNT = XOneCPackage.XMODULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.ParametrImpl <em>Parametr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.ParametrImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getParametr()
   * @generated
   */
  int PARAMETR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETR__NAME = XOneCPackage.XPARAM__NAME;

  /**
   * The feature id for the '<em><b>By Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETR__BY_VAL = XOneCPackage.XPARAM__BY_VAL;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETR__VALUE = XOneCPackage.XPARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parametr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETR_FEATURE_COUNT = XOneCPackage.XPARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.ReturnImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__VALUE = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.RaiseImpl <em>Raise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.RaiseImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getRaise()
   * @generated
   */
  int RAISE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE__VALUE = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Raise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.ContinuieImpl <em>Continuie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.ContinuieImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getContinuie()
   * @generated
   */
  int CONTINUIE = 10;

  /**
   * The number of structural features of the '<em>Continuie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUIE_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.BreakImpl <em>Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.BreakImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getBreak()
   * @generated
   */
  int BREAK = 11;

  /**
   * The number of structural features of the '<em>Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.GoToImpl <em>Go To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.GoToImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getGoTo()
   * @generated
   */
  int GO_TO = 12;

  /**
   * The number of structural features of the '<em>Go To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_FEATURE_COUNT = XOneCPackage.XOPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.DateLiteralImpl <em>Date Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.DateLiteralImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getDateLiteral()
   * @generated
   */
  int DATE_LITERAL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_LITERAL__VALUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.OtherExprImpl <em>Other Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.OtherExprImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getOtherExpr()
   * @generated
   */
  int OTHER_EXPR = 14;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_EXPR__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_EXPR__THEN = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_EXPR__ELSE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Other Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_EXPR_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.XConstructorCallImpl <em>XConstructor Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.XConstructorCallImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXConstructorCall()
   * @generated
   */
  int XCONSTRUCTOR_CALL = 15;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__CONSTRUCTOR = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Explicit Constructor Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XConstructor Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.XBooleanLiteralImpl <em>XBoolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.XBooleanLiteralImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXBooleanLiteral()
   * @generated
   */
  int XBOOLEAN_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOLEAN_LITERAL__IS_TRUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XBoolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOLEAN_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.TryImpl <em>Try</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.TryImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getTry()
   * @generated
   */
  int TRY = 17;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY__BLOCK = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alterblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY__ALTERBLOCK = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Try</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.UndefinedLiteralImpl <em>Undefined Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.UndefinedLiteralImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getUndefinedLiteral()
   * @generated
   */
  int UNDEFINED_LITERAL = 18;

  /**
   * The number of structural features of the '<em>Undefined Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEFINED_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.onec.oneC.impl.XNullLiteralLiteralImpl <em>XNull Literal Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.onec.oneC.impl.XNullLiteralLiteralImpl
   * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXNullLiteralLiteral()
   * @generated
   */
  int XNULL_LITERAL_LITERAL = 19;

  /**
   * The number of structural features of the '<em>XNull Literal Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNULL_LITERAL_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Let <em>Let</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let</em>'.
   * @see org.xtext.onec.oneC.Let
   * @generated
   */
  EClass getLet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.onec.oneC.Let#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.onec.oneC.Let#getName()
   * @see #getLet()
   * @generated
   */
  EAttribute getLet_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Let#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.onec.oneC.Let#getValue()
   * @see #getLet()
   * @generated
   */
  EReference getLet_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Let#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.onec.oneC.Let#getLeft()
   * @see #getLet()
   * @generated
   */
  EReference getLet_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Let#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.onec.oneC.Let#getRight()
   * @see #getLet()
   * @generated
   */
  EReference getLet_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Let#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.xtext.onec.oneC.Let#getParams()
   * @see #getLet()
   * @generated
   */
  EReference getLet_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.Let#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Index</em>'.
   * @see org.xtext.onec.oneC.Let#getIndex()
   * @see #getLet()
   * @generated
   */
  EReference getLet_Index();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.FormalParams <em>Formal Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Params</em>'.
   * @see org.xtext.onec.oneC.FormalParams
   * @generated
   */
  EClass getFormalParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.FormalParams#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.onec.oneC.FormalParams#getParams()
   * @see #getFormalParams()
   * @generated
   */
  EReference getFormalParams_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see org.xtext.onec.oneC.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.onec.oneC.For#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.onec.oneC.For#getName()
   * @see #getFor()
   * @generated
   */
  EAttribute getFor_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.For#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.onec.oneC.For#getValue()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.For#getBoundary <em>Boundary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boundary</em>'.
   * @see org.xtext.onec.oneC.For#getBoundary()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Boundary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.For#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.onec.oneC.For#getBlock()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression</em>'.
   * @see org.xtext.onec.oneC.XExpression
   * @generated
   */
  EClass getXExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.xtext.onec.oneC.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.If#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see org.xtext.onec.oneC.If#getCondition()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.If#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block</em>'.
   * @see org.xtext.onec.oneC.If#getBlock()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.If#getAlterblock <em>Alterblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alterblock</em>'.
   * @see org.xtext.onec.oneC.If#getAlterblock()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Alterblock();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see org.xtext.onec.oneC.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.XModule <em>XModule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XModule</em>'.
   * @see org.xtext.onec.oneC.XModule
   * @generated
   */
  EClass getXModule();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Parametr <em>Parametr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametr</em>'.
   * @see org.xtext.onec.oneC.Parametr
   * @generated
   */
  EClass getParametr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Parametr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.onec.oneC.Parametr#getValue()
   * @see #getParametr()
   * @generated
   */
  EReference getParametr_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.xtext.onec.oneC.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Return#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.onec.oneC.Return#getValue()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Raise <em>Raise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raise</em>'.
   * @see org.xtext.onec.oneC.Raise
   * @generated
   */
  EClass getRaise();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.Raise#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.onec.oneC.Raise#getValue()
   * @see #getRaise()
   * @generated
   */
  EReference getRaise_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Continuie <em>Continuie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continuie</em>'.
   * @see org.xtext.onec.oneC.Continuie
   * @generated
   */
  EClass getContinuie();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Break <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break</em>'.
   * @see org.xtext.onec.oneC.Break
   * @generated
   */
  EClass getBreak();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.GoTo <em>Go To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go To</em>'.
   * @see org.xtext.onec.oneC.GoTo
   * @generated
   */
  EClass getGoTo();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.DateLiteral <em>Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Literal</em>'.
   * @see org.xtext.onec.oneC.DateLiteral
   * @generated
   */
  EClass getDateLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.onec.oneC.DateLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.onec.oneC.DateLiteral#getValue()
   * @see #getDateLiteral()
   * @generated
   */
  EAttribute getDateLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.OtherExpr <em>Other Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Expr</em>'.
   * @see org.xtext.onec.oneC.OtherExpr
   * @generated
   */
  EClass getOtherExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.OtherExpr#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.xtext.onec.oneC.OtherExpr#getIf()
   * @see #getOtherExpr()
   * @generated
   */
  EReference getOtherExpr_If();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.OtherExpr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.xtext.onec.oneC.OtherExpr#getThen()
   * @see #getOtherExpr()
   * @generated
   */
  EReference getOtherExpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.onec.oneC.OtherExpr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.xtext.onec.oneC.OtherExpr#getElse()
   * @see #getOtherExpr()
   * @generated
   */
  EReference getOtherExpr_Else();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.XConstructorCall <em>XConstructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XConstructor Call</em>'.
   * @see org.xtext.onec.oneC.XConstructorCall
   * @generated
   */
  EClass getXConstructorCall();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.onec.oneC.XConstructorCall#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see org.xtext.onec.oneC.XConstructorCall#getConstructor()
   * @see #getXConstructorCall()
   * @generated
   */
  EAttribute getXConstructorCall_Constructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.onec.oneC.XConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Constructor Call</em>'.
   * @see org.xtext.onec.oneC.XConstructorCall#isExplicitConstructorCall()
   * @see #getXConstructorCall()
   * @generated
   */
  EAttribute getXConstructorCall_ExplicitConstructorCall();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.XConstructorCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.xtext.onec.oneC.XConstructorCall#getArguments()
   * @see #getXConstructorCall()
   * @generated
   */
  EReference getXConstructorCall_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.XBooleanLiteral <em>XBoolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBoolean Literal</em>'.
   * @see org.xtext.onec.oneC.XBooleanLiteral
   * @generated
   */
  EClass getXBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.onec.oneC.XBooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see org.xtext.onec.oneC.XBooleanLiteral#isIsTrue()
   * @see #getXBooleanLiteral()
   * @generated
   */
  EAttribute getXBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.Try <em>Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try</em>'.
   * @see org.xtext.onec.oneC.Try
   * @generated
   */
  EClass getTry();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.Try#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block</em>'.
   * @see org.xtext.onec.oneC.Try#getBlock()
   * @see #getTry()
   * @generated
   */
  EReference getTry_Block();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.onec.oneC.Try#getAlterblock <em>Alterblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alterblock</em>'.
   * @see org.xtext.onec.oneC.Try#getAlterblock()
   * @see #getTry()
   * @generated
   */
  EReference getTry_Alterblock();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.UndefinedLiteral <em>Undefined Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Undefined Literal</em>'.
   * @see org.xtext.onec.oneC.UndefinedLiteral
   * @generated
   */
  EClass getUndefinedLiteral();

  /**
   * Returns the meta object for class '{@link org.xtext.onec.oneC.XNullLiteralLiteral <em>XNull Literal Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNull Literal Literal</em>'.
   * @see org.xtext.onec.oneC.XNullLiteralLiteral
   * @generated
   */
  EClass getXNullLiteralLiteral();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OneCFactory getOneCFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.LetImpl <em>Let</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.LetImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getLet()
     * @generated
     */
    EClass LET = eINSTANCE.getLet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LET__NAME = eINSTANCE.getLet_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__VALUE = eINSTANCE.getLet_Value();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__LEFT = eINSTANCE.getLet_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__RIGHT = eINSTANCE.getLet_Right();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__PARAMS = eINSTANCE.getLet_Params();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__INDEX = eINSTANCE.getLet_Index();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.FormalParamsImpl <em>Formal Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.FormalParamsImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getFormalParams()
     * @generated
     */
    EClass FORMAL_PARAMS = eINSTANCE.getFormalParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMS__PARAMS = eINSTANCE.getFormalParams_Params();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.ForImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR__NAME = eINSTANCE.getFor_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__VALUE = eINSTANCE.getFor_Value();

    /**
     * The meta object literal for the '<em><b>Boundary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__BOUNDARY = eINSTANCE.getFor_Boundary();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__BLOCK = eINSTANCE.getFor_Block();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.XExpressionImpl <em>XExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.XExpressionImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXExpression()
     * @generated
     */
    EClass XEXPRESSION = eINSTANCE.getXExpression();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.IfImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__CONDITION = eINSTANCE.getIf_Condition();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__BLOCK = eINSTANCE.getIf_Block();

    /**
     * The meta object literal for the '<em><b>Alterblock</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__ALTERBLOCK = eINSTANCE.getIf_Alterblock();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.OperatorImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.XModuleImpl <em>XModule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.XModuleImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXModule()
     * @generated
     */
    EClass XMODULE = eINSTANCE.getXModule();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.ParametrImpl <em>Parametr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.ParametrImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getParametr()
     * @generated
     */
    EClass PARAMETR = eINSTANCE.getParametr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETR__VALUE = eINSTANCE.getParametr_Value();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.ReturnImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__VALUE = eINSTANCE.getReturn_Value();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.RaiseImpl <em>Raise</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.RaiseImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getRaise()
     * @generated
     */
    EClass RAISE = eINSTANCE.getRaise();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAISE__VALUE = eINSTANCE.getRaise_Value();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.ContinuieImpl <em>Continuie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.ContinuieImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getContinuie()
     * @generated
     */
    EClass CONTINUIE = eINSTANCE.getContinuie();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.BreakImpl <em>Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.BreakImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getBreak()
     * @generated
     */
    EClass BREAK = eINSTANCE.getBreak();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.GoToImpl <em>Go To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.GoToImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getGoTo()
     * @generated
     */
    EClass GO_TO = eINSTANCE.getGoTo();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.DateLiteralImpl <em>Date Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.DateLiteralImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getDateLiteral()
     * @generated
     */
    EClass DATE_LITERAL = eINSTANCE.getDateLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_LITERAL__VALUE = eINSTANCE.getDateLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.OtherExprImpl <em>Other Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.OtherExprImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getOtherExpr()
     * @generated
     */
    EClass OTHER_EXPR = eINSTANCE.getOtherExpr();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_EXPR__IF = eINSTANCE.getOtherExpr_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_EXPR__THEN = eINSTANCE.getOtherExpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_EXPR__ELSE = eINSTANCE.getOtherExpr_Else();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.XConstructorCallImpl <em>XConstructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.XConstructorCallImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXConstructorCall()
     * @generated
     */
    EClass XCONSTRUCTOR_CALL = eINSTANCE.getXConstructorCall();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCONSTRUCTOR_CALL__CONSTRUCTOR = eINSTANCE.getXConstructorCall_Constructor();

    /**
     * The meta object literal for the '<em><b>Explicit Constructor Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getXConstructorCall_ExplicitConstructorCall();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCONSTRUCTOR_CALL__ARGUMENTS = eINSTANCE.getXConstructorCall_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.XBooleanLiteralImpl <em>XBoolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.XBooleanLiteralImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXBooleanLiteral()
     * @generated
     */
    EClass XBOOLEAN_LITERAL = eINSTANCE.getXBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getXBooleanLiteral_IsTrue();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.TryImpl <em>Try</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.TryImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getTry()
     * @generated
     */
    EClass TRY = eINSTANCE.getTry();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY__BLOCK = eINSTANCE.getTry_Block();

    /**
     * The meta object literal for the '<em><b>Alterblock</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY__ALTERBLOCK = eINSTANCE.getTry_Alterblock();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.UndefinedLiteralImpl <em>Undefined Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.UndefinedLiteralImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getUndefinedLiteral()
     * @generated
     */
    EClass UNDEFINED_LITERAL = eINSTANCE.getUndefinedLiteral();

    /**
     * The meta object literal for the '{@link org.xtext.onec.oneC.impl.XNullLiteralLiteralImpl <em>XNull Literal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.onec.oneC.impl.XNullLiteralLiteralImpl
     * @see org.xtext.onec.oneC.impl.OneCPackageImpl#getXNullLiteralLiteral()
     * @generated
     */
    EClass XNULL_LITERAL_LITERAL = eINSTANCE.getXNullLiteralLiteral();

  }

} //OneCPackage
