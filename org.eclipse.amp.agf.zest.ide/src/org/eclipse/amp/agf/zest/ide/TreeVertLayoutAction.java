/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
*/
package org.eclipse.amp.agf.zest.ide;

import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class TreeVertLayoutAction.
 */
public class TreeVertLayoutAction extends ZestLayoutAction {

    /**
     * @return
     * @see org.eclipse.amp.agf.zest.ide.ZestLayoutAction#createLayout()
     */
    @Override
    protected LayoutAlgorithm createLayout() {
        return new TreeLayoutAlgorithm();
    }

}
