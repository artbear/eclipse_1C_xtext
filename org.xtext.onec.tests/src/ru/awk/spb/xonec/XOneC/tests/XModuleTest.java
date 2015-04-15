/**
 */
package ru.awk.spb.xonec.XOneC.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.awk.spb.xonec.XOneC.XModule;
import ru.awk.spb.xonec.XOneC.XOneCFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XModule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XModuleTest extends TestCase {

	/**
	 * The fixture for this XModule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XModule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XModuleTest.class);
	}

	/**
	 * Constructs a new XModule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XModuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XModule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XModule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XModule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XModule getFixture() {
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
		setFixture(XOneCFactory.eINSTANCE.createXModule());
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

} //XModuleTest
