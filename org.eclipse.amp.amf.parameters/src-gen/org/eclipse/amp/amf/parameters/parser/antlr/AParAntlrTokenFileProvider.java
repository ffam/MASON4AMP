/*
* generated by Xtext
*/
package org.eclipse.amp.amf.parameters.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AParAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.tokens");
	}
}