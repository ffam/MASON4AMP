/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.ide.mason;

import org.eclipse.amp.amf.ide.Configurator;
import org.eclipse.amp.amf.ide.AMFLaunchAction;

public class MasonLaunchAction extends AMFLaunchAction {

    public final static Configurator MASON_CONFIGURATOR = new MasonRuntimeConfigurator();

    public Configurator getConfigurator() {
        return MASON_CONFIGURATOR;
    }

    @Override
    public String getTargetName() {
        // TODO Auto-generated method stub
        return "metaABM for Mason";
    }
}
