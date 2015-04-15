/**
 */
package org.xtext.onec.oneC.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.onec.oneC.*;

import ru.awk.spb.xonec.XOneC.XOperator;
import ru.awk.spb.xonec.XOneC.XParam;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.onec.oneC.OneCPackage
 * @generated
 */
public class OneCSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OneCPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneCSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OneCPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case OneCPackage.LET:
      {
        Let let = (Let)theEObject;
        T result = caseLet(let);
        if (result == null) result = caseXOperator(let);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.FORMAL_PARAMS:
      {
        FormalParams formalParams = (FormalParams)theEObject;
        T result = caseFormalParams(formalParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.FOR:
      {
        For for_ = (For)theEObject;
        T result = caseFor(for_);
        if (result == null) result = caseXOperator(for_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.XEXPRESSION:
      {
        XExpression xExpression = (XExpression)theEObject;
        T result = caseXExpression(xExpression);
        if (result == null) result = caseXbase_XExpression(xExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseXOperator(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = caseXOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.XMODULE:
      {
        XModule xModule = (XModule)theEObject;
        T result = caseXModule(xModule);
        if (result == null) result = caseXOneC_XModule(xModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.PARAMETR:
      {
        Parametr parametr = (Parametr)theEObject;
        T result = caseParametr(parametr);
        if (result == null) result = caseXParam(parametr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseXOperator(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.RAISE:
      {
        Raise raise = (Raise)theEObject;
        T result = caseRaise(raise);
        if (result == null) result = caseXOperator(raise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.CONTINUIE:
      {
        Continuie continuie = (Continuie)theEObject;
        T result = caseContinuie(continuie);
        if (result == null) result = caseXOperator(continuie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.BREAK:
      {
        Break break_ = (Break)theEObject;
        T result = caseBreak(break_);
        if (result == null) result = caseXOperator(break_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.GO_TO:
      {
        GoTo goTo = (GoTo)theEObject;
        T result = caseGoTo(goTo);
        if (result == null) result = caseXOperator(goTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.DATE_LITERAL:
      {
        DateLiteral dateLiteral = (DateLiteral)theEObject;
        T result = caseDateLiteral(dateLiteral);
        if (result == null) result = caseXExpression(dateLiteral);
        if (result == null) result = caseXbase_XExpression(dateLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.OTHER_EXPR:
      {
        OtherExpr otherExpr = (OtherExpr)theEObject;
        T result = caseOtherExpr(otherExpr);
        if (result == null) result = caseXbase_XExpression(otherExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.XCONSTRUCTOR_CALL:
      {
        XConstructorCall xConstructorCall = (XConstructorCall)theEObject;
        T result = caseXConstructorCall(xConstructorCall);
        if (result == null) result = caseXExpression(xConstructorCall);
        if (result == null) result = caseXbase_XExpression(xConstructorCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.XBOOLEAN_LITERAL:
      {
        XBooleanLiteral xBooleanLiteral = (XBooleanLiteral)theEObject;
        T result = caseXBooleanLiteral(xBooleanLiteral);
        if (result == null) result = caseXExpression(xBooleanLiteral);
        if (result == null) result = caseXbase_XExpression(xBooleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.TRY:
      {
        Try try_ = (Try)theEObject;
        T result = caseTry(try_);
        if (result == null) result = caseOperator(try_);
        if (result == null) result = caseXOperator(try_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.UNDEFINED_LITERAL:
      {
        UndefinedLiteral undefinedLiteral = (UndefinedLiteral)theEObject;
        T result = caseUndefinedLiteral(undefinedLiteral);
        if (result == null) result = caseXExpression(undefinedLiteral);
        if (result == null) result = caseXbase_XExpression(undefinedLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OneCPackage.XNULL_LITERAL_LITERAL:
      {
        XNullLiteralLiteral xNullLiteralLiteral = (XNullLiteralLiteral)theEObject;
        T result = caseXNullLiteralLiteral(xNullLiteralLiteral);
        if (result == null) result = caseXExpression(xNullLiteralLiteral);
        if (result == null) result = caseXbase_XExpression(xNullLiteralLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLet(Let object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalParams(FormalParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor(For object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XModule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XModule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXModule(XModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parametr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parametr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametr(Parametr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturn(Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRaise(Raise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continuie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continuie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinuie(Continuie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreak(Break object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoTo(GoTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateLiteral(DateLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherExpr(OtherExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XConstructor Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XConstructor Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXConstructorCall(XConstructorCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBoolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBoolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBooleanLiteral(XBooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTry(Try object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Undefined Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Undefined Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUndefinedLiteral(UndefinedLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XNull Literal Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XNull Literal Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXNullLiteralLiteral(XNullLiteralLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XOperator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XOperator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXOperator(XOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXbase_XExpression(org.eclipse.xtext.xbase.XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XModule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XModule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXOneC_XModule(ru.awk.spb.xonec.XOneC.XModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XParam</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XParam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXParam(XParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //OneCSwitch
