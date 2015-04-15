/**
 */
package ru.awk.spb.xonec.XOneC.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.awk.spb.xonec.XOneC.XBlock;
import ru.awk.spb.xonec.XOneC.XOneCFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XBlock</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XBlockTest extends TestCase {

	/**
	 * The fixture for this XBlock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBlock fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XBlockTest.class);
	}

	/**
	 * Constructs a new XBlock test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBlockTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XBlock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XBlock fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XBlock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBlock getFixture() {
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
		setFixture(XOneCFactory.eINSTANCE.createXBlock());
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

} //XBlockTest
