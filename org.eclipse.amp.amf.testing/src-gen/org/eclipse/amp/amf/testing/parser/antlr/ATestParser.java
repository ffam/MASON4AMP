/*
* generated by Xtext
*/
package org.eclipse.amp.amf.testing.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;

public class ATestParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ATestGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.amp.amf.testing.parser.antlr.internal.InternalATestParser createParser(XtextTokenStream stream) {
		return new org.eclipse.amp.amf.testing.parser.antlr.internal.InternalATestParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ATestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ATestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
