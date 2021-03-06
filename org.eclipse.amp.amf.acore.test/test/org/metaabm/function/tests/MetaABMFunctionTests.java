/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.function.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>function</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaABMFunctionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MetaABMFunctionTests("function Tests");
		suite.addTestSuite(FOperatorTest.class);
		suite.addTestSuite(FLogicalOperatorTest.class);
		suite.addTestSuite(FGenericFunctionTest.class);
		suite.addTestSuite(FGenericLogicalTest.class);
		suite.addTestSuite(FImplementedLibraryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMFunctionTests(String name) {
		super(name);
	}

} //MetaABMFunctionTests
