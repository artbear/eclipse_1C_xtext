/**
 */
package org.xtext.onec.oneC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.onec.oneC.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneCFactoryImpl extends EFactoryImpl implements OneCFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OneCFactory init()
  {
    try
    {
      OneCFactory theOneCFactory = (OneCFactory)EPackage.Registry.INSTANCE.getEFactory(OneCPackage.eNS_URI);
      if (theOneCFactory != null)
      {
        return theOneCFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OneCFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneCFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OneCPackage.LET: return createLet();
      case OneCPackage.FORMAL_PARAMS: return createFormalParams();
      case OneCPackage.FOR: return createFor();
      case OneCPackage.XEXPRESSION: return createXExpression();
      case OneCPackage.IF: return createIf();
      case OneCPackage.OPERATOR: return createOperator();
      case OneCPackage.XMODULE: return createXModule();
      case OneCPackage.PARAMETR: return createParametr();
      case OneCPackage.RETURN: return createReturn();
      case OneCPackage.RAISE: return createRaise();
      case OneCPackage.CONTINUIE: return createContinuie();
      case OneCPackage.BREAK: return createBreak();
      case OneCPackage.GO_TO: return createGoTo();
      case OneCPackage.DATE_LITERAL: return createDateLiteral();
      case OneCPackage.OTHER_EXPR: return createOtherExpr();
      case OneCPackage.XCONSTRUCTOR_CALL: return createXConstructorCall();
      case OneCPackage.XBOOLEAN_LITERAL: return createXBooleanLiteral();
      case OneCPackage.TRY: return createTry();
      case OneCPackage.UNDEFINED_LITERAL: return createUndefinedLiteral();
      case OneCPackage.XNULL_LITERAL_LITERAL: return createXNullLiteralLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Let createLet()
  {
    LetImpl let = new LetImpl();
    return let;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParams createFormalParams()
  {
    FormalParamsImpl formalParams = new FormalParamsImpl();
    return formalParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression createXExpression()
  {
    XExpressionImpl xExpression = new XExpressionImpl();
    return xExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XModule createXModule()
  {
    XModuleImpl xModule = new XModuleImpl();
    return xModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametr createParametr()
  {
    ParametrImpl parametr = new ParametrImpl();
    return parametr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Raise createRaise()
  {
    RaiseImpl raise = new RaiseImpl();
    return raise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Continuie createContinuie()
  {
    ContinuieImpl continuie = new ContinuieImpl();
    return continuie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Break createBreak()
  {
    BreakImpl break_ = new BreakImpl();
    return break_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoTo createGoTo()
  {
    GoToImpl goTo = new GoToImpl();
    return goTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateLiteral createDateLiteral()
  {
    DateLiteralImpl dateLiteral = new DateLiteralImpl();
    return dateLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherExpr createOtherExpr()
  {
    OtherExprImpl otherExpr = new OtherExprImpl();
    return otherExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XConstructorCall createXConstructorCall()
  {
    XConstructorCallImpl xConstructorCall = new XConstructorCallImpl();
    return xConstructorCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBooleanLiteral createXBooleanLiteral()
  {
    XBooleanLiteralImpl xBooleanLiteral = new XBooleanLiteralImpl();
    return xBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try createTry()
  {
    TryImpl try_ = new TryImpl();
    return try_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UndefinedLiteral createUndefinedLiteral()
  {
    UndefinedLiteralImpl undefinedLiteral = new UndefinedLiteralImpl();
    return undefinedLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNullLiteralLiteral createXNullLiteralLiteral()
  {
    XNullLiteralLiteralImpl xNullLiteralLiteral = new XNullLiteralLiteralImpl();
    return xNullLiteralLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneCPackage getOneCPackage()
  {
    return (OneCPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OneCPackage getPackage()
  {
    return OneCPackage.eINSTANCE;
  }

} //OneCFactoryImpl
