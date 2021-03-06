/*
* generated by Xtext
*/
package org.eclipse.amp.amf.parameters.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.amp.amf.parameters.services.AParGrammarAccess;

public class AParParser extends AbstractContentAssistParser {
	
	@Inject
	private AParGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal.InternalAParParser createParser() {
		org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal.InternalAParParser result = new org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal.InternalAParParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_3(), "rule__Model__Group_3__0");
					put(grammarAccess.getSingleParameterAccess().getGroup(), "rule__SingleParameter__Group__0");
					put(grammarAccess.getSweepParameterAccess().getGroup(), "rule__SweepParameter__Group__0");
					put(grammarAccess.getSweepLinkAccess().getGroup(), "rule__SweepLink__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_0(), "rule__Model__NameAssignment_0");
					put(grammarAccess.getModelAccess().getModelAssignment_2(), "rule__Model__ModelAssignment_2");
					put(grammarAccess.getModelAccess().getIncorporatesAssignment_3_1(), "rule__Model__IncorporatesAssignment_3_1");
					put(grammarAccess.getModelAccess().getParametersAssignment_4(), "rule__Model__ParametersAssignment_4");
					put(grammarAccess.getImportAccess().getImportURIAssignment(), "rule__Import__ImportURIAssignment");
					put(grammarAccess.getIncorporatesAccess().getImportURIAssignment(), "rule__Incorporates__ImportURIAssignment");
					put(grammarAccess.getSingleParameterAccess().getAttributeAssignment_0(), "rule__SingleParameter__AttributeAssignment_0");
					put(grammarAccess.getSingleParameterAccess().getValueAssignment_2(), "rule__SingleParameter__ValueAssignment_2");
					put(grammarAccess.getSweepParameterAccess().getAttributeAssignment_0(), "rule__SweepParameter__AttributeAssignment_0");
					put(grammarAccess.getSweepParameterAccess().getStartValueAssignment_2(), "rule__SweepParameter__StartValueAssignment_2");
					put(grammarAccess.getSweepParameterAccess().getEndValueAssignment_4(), "rule__SweepParameter__EndValueAssignment_4");
					put(grammarAccess.getSweepParameterAccess().getIncrementAssignment_6(), "rule__SweepParameter__IncrementAssignment_6");
					put(grammarAccess.getSweepLinkAccess().getParametersAssignment_2(), "rule__SweepLink__ParametersAssignment_2");
					put(grammarAccess.getIntValueAccess().getValueAssignment(), "rule__IntValue__ValueAssignment");
					put(grammarAccess.getRealValueAccess().getValueAssignment(), "rule__RealValue__ValueAssignment");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal.InternalAParParser typedParser = (org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal.InternalAParParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AParGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AParGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
