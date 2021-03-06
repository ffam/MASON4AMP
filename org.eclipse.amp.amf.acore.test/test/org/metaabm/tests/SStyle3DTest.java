/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.tests;

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SStyle3D;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SStyle3 D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SStyle3DTest extends SStyleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SStyle3DTest.class);
	}

	/**
	 * Constructs a new SStyle3 D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SStyle3DTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SStyle3 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SStyle3D getFixture() {
		return (SStyle3D) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMFactory.eINSTANCE.createSStyle3D());
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

} //SStyle3DTest
