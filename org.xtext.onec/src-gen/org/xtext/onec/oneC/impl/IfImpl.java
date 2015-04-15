/**
 */
package org.xtext.onec.oneC.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.xtext.onec.oneC.If;
import org.xtext.onec.oneC.OneCPackage;

import ru.awk.spb.xonec.XOneC.XBlock;

import ru.awk.spb.xonec.XOneC.impl.XOperatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.onec.oneC.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.impl.IfImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.onec.oneC.impl.IfImpl#getAlterblock <em>Alterblock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends XOperatorImpl implements If
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<XExpression> condition;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected EList<XBlock> block;

  /**
   * The cached value of the '{@link #getAlterblock() <em>Alterblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterblock()
   * @generated
   * @ordered
   */
  protected XBlock alterblock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OneCPackage.Literals.IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<XExpression>(XExpression.class, this, OneCPackage.IF__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XBlock> getBlock()
  {
    if (block == null)
    {
      block = new EObjectContainmentEList<XBlock>(XBlock.class, this, OneCPackage.IF__BLOCK);
    }
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlock getAlterblock()
  {
    return alterblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlterblock(XBlock newAlterblock, NotificationChain msgs)
  {
    XBlock oldAlterblock = alterblock;
    alterblock = newAlterblock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OneCPackage.IF__ALTERBLOCK, oldAlterblock, newAlterblock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlterblock(XBlock newAlterblock)
  {
    if (newAlterblock != alterblock)
    {
      NotificationChain msgs = null;
      if (alterblock != null)
        msgs = ((InternalEObject)alterblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OneCPackage.IF__ALTERBLOCK, null, msgs);
      if (newAlterblock != null)
        msgs = ((InternalEObject)newAlterblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OneCPackage.IF__ALTERBLOCK, null, msgs);
      msgs = basicSetAlterblock(newAlterblock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OneCPackage.IF__ALTERBLOCK, newAlterblock, newAlterblock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OneCPackage.IF__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case OneCPackage.IF__BLOCK:
        return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
      case OneCPackage.IF__ALTERBLOCK:
        return basicSetAlterblock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OneCPackage.IF__CONDITION:
        return getCondition();
      case OneCPackage.IF__BLOCK:
        return getBlock();
      case OneCPackage.IF__ALTERBLOCK:
        return getAlterblock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OneCPackage.IF__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends XExpression>)newValue);
        return;
      case OneCPackage.IF__BLOCK:
        getBlock().clear();
        getBlock().addAll((Collection<? extends XBlock>)newValue);
        return;
      case OneCPackage.IF__ALTERBLOCK:
        setAlterblock((XBlock)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OneCPackage.IF__CONDITION:
        getCondition().clear();
        return;
      case OneCPackage.IF__BLOCK:
        getBlock().clear();
        return;
      case OneCPackage.IF__ALTERBLOCK:
        setAlterblock((XBlock)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OneCPackage.IF__CONDITION:
        return condition != null && !condition.isEmpty();
      case OneCPackage.IF__BLOCK:
        return block != null && !block.isEmpty();
      case OneCPackage.IF__ALTERBLOCK:
        return alterblock != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
