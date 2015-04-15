/**
 */
package ru.awk.spb.xonec.XOneC.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.awk.spb.xonec.XOneC.XOneCFactory;
import ru.awk.spb.xonec.XOneC.XVariable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XVariable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XVariableTest extends TestCase {

	/**
	 * The fixture for this XVariable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XVariable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XVariableTest.class);
	}

	/**
	 * Constructs a new XVariable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XVariableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XVariable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XVariable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XVariable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XVariable getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XOneCFactory.eINSTANCE.createXVariable());
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

} //XVariableTest
