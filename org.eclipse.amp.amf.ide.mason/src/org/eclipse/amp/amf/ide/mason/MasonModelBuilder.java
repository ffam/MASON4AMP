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

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.metaabm.gen.AMFGenPlugin;
import org.metaabm.gen.mason.MasonGenActivator;

public class MasonModelBuilder extends MetaABMBuilder {

	public final static String MASON_BUILDER_ID = "masonBuilder";

	private static MetaABMBuilder masonBuilder;

	public MasonModelBuilder() {
		super("Generating Mason", AMFGenPlugin.PLUGIN_ID + ".mason", "model/generate_mason.mwe", true);
	}

	public void loadPlugins() {
		MasonGenActivator.getDefault().getBundle();
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static MetaABMBuilder getMasonBuilderDefault() {
		if (masonBuilder == null) {
			masonBuilder = new MasonModelBuilder();
		}
		return masonBuilder;
	}

}
