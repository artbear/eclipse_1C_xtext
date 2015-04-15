/**
 */
package ru.awk.spb.xonec.XOneC.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.awk.spb.xonec.XOneC.XOneCFactory;
import ru.awk.spb.xonec.XOneC.XParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XParam</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XParamTest extends TestCase {

	/**
	 * The fixture for this XParam test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XParam fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XParamTest.class);
	}

	/**
	 * Constructs a new XParam test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParamTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XParam test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XParam fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XParam test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XParam getFixture() {
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
		setFixture(XOneCFactory.eINSTANCE.createXParam());
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

} //XParamTest
