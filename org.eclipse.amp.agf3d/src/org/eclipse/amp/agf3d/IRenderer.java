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

package org.eclipse.amp.agf3d;

import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;

/**
 * 
 * @author mparker
 *
 */
public interface IRenderer {

    void renderShape(IFigure3D figure, RenderContext context, Object object);
}
