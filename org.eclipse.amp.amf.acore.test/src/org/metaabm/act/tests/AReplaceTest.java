/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act.tests;

import junit.textui.TestRunner;

import org.metaabm.act.AReplace;
import org.metaabm.act.MetaABMActFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>AReplace</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class AReplaceTest extends AConnectTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AReplaceTest.class);
    }

    /**
     * Constructs a new AReplace test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AReplaceTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this AReplace test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected AReplace getFixture() {
        return (AReplace) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMActFactory.eINSTANCE.createAReplace());
        getFixture().setLabel("Label");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} // AReplaceTest
