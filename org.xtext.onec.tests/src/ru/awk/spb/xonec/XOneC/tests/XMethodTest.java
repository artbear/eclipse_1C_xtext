/**
 */
package ru.awk.spb.xonec.XOneC.tests;

import junit.textui.TestRunner;

import ru.awk.spb.xonec.XOneC.XMethod;
import ru.awk.spb.xonec.XOneC.XOneCFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XMethod</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMethodTest extends XVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMethodTest.class);
	}

	/**
	 * Constructs a new XMethod test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XMethod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMethod getFixture() {
		return (XMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XOneCFactory.eINSTANCE.createXMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //XMethodTest
