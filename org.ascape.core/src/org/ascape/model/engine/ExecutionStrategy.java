/*
 * Copyright 1998-2007 The Brookings Institution, NuTech Solutions,Inc., Metascape LLC, and contributors. 
 * All rights reserved.
 * This program and the accompanying materials are made available solely under of the BSD license "ascape-license.txt".
 * Any referenced or included libraries carry licenses of their respective copyright holders. 
 */

package org.ascape.model.engine;

import java.io.Serializable;

/*
 * User: Miles Parker  
 * Date: Sep 25, 2003
 * Time: 4:53:02 PM
 * To change this template use Options | File Templates.
 */

/**
 * The Class ExecutionStrategy.
 */
public abstract class ExecutionStrategy implements Cloneable, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new execution strategy.
     */
    public ExecutionStrategy() {
    }

    /**
     * Checks if is supports parallel.
     * 
     * @return true, if is supports parallel
     */
    public boolean isSupportsParallel() {
        return false;
    }

    /**
     * Execute.
     */
    public abstract void execute();

    /**
     * Reset.
     */
    public abstract void reset();

    /**
     * Chain.
     * 
     * @param strategy
     *            the strategy
     * @return the execution strategy
     */
    public ExecutionStrategy chain(ExecutionStrategy strategy) {
        ChainedStrategy compoundStrategy = new ChainedStrategy(this, strategy);
        return compoundStrategy;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    public Object clone() {
        try {
            ExecutionStrategy clone = (ExecutionStrategy) super.clone();
            //shallow copy
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use Options | File Templates.
            throw new RuntimeException("Imagine that");
        }
    }
}
