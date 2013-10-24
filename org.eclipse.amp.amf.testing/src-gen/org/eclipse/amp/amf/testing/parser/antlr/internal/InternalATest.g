/*
* generated by Xtext
*/
grammar InternalATest;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.amp.amf.testing.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.amp.amf.testing.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;

}

@parser::members {

 	private ATestGrammarAccess grammarAccess;
 	
    public InternalATestParser(TokenStream input, ATestGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected ATestGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)?(
(
		lv_description_2_0=RULE_DESC_STRING
		{
			newLeafNode(lv_description_2_0, grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_2_0, 
        		"DESC_STRING");
	    }

)
)?(((	otherlv_3='tests' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getTestsKeyword_3_0_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_3_0_0_1_0()); 
	    }
		lv_tests_4_0=ruleTests		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"tests",
        		lv_tests_4_0, 
        		"Tests");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0_1_0()); 
	    }
		lv_contraints_5_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"contraints",
        		lv_contraints_5_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
    |(	otherlv_6='contains' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getContainsKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getContainsTestMemberParserRuleCall_3_1_1_0()); 
	    }
		lv_contains_7_0=ruleTestMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"contains",
        		lv_contains_7_0, 
        		"TestMember");
	        afterParserOrEnumRuleCall();
	    }

)
)*))?)
;





// Entry rule entryRuleTests
entryRuleTests returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTestsRule()); }
	 iv_ruleTests=ruleTests 
	 { $current=$iv_ruleTests.current; } 
	 EOF 
;

// Rule Tests
ruleTests returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_importURI_0_0=RULE_STRING
		{
			newLeafNode(lv_importURI_0_0, grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTestsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importURI",
        		lv_importURI_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleTestMember
entryRuleTestMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTestMemberRule()); }
	 iv_ruleTestMember=ruleTestMember 
	 { $current=$iv_ruleTestMember.current; } 
	 EOF 
;

// Rule TestMember
ruleTestMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_importURI_0_0=RULE_STRING
		{
			newLeafNode(lv_importURI_0_0, grammarAccess.getTestMemberAccess().getImportURISTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTestMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importURI",
        		lv_importURI_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	 iv_ruleConstraint=ruleConstraint 
	 { $current=$iv_ruleConstraint.current; } 
	 EOF 
;

// Rule Constraint
ruleConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 
	    }
		lv_measure_0_0=ruleMeasure		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"measure",
        		lv_measure_0_0, 
        		"Measure");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstraintRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 
	}

)
)	otherlv_3='.' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getFullStopKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstraintRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 
	}

)
)(	otherlv_5='=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstraintRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 
	}

)
))?	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6());
    }
(	otherlv_8='=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0());
    }
	otherlv_9='[' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 
	    }
		lv_minValue_10_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"minValue",
        		lv_minValue_10_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getCommaKeyword_7_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 
	    }
		lv_maxValue_12_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"maxValue",
        		lv_maxValue_12_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=']' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5());
    }
))
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
    }
    this_IntValue_0=ruleIntValue
    { 
        $current = $this_IntValue_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
    }
    this_StringValue_1=ruleStringValue
    { 
        $current = $this_StringValue_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 
    }
    this_RealValue_2=ruleRealValue
    { 
        $current = $this_RealValue_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
    }
    this_BooleanValue_3=ruleBooleanValue
    { 
        $current = $this_BooleanValue_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleIntValue
entryRuleIntValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	 iv_ruleIntValue=ruleIntValue 
	 { $current=$iv_ruleIntValue.current; } 
	 EOF 
;

// Rule IntValue
ruleIntValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_INTEGER
		{
			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INTEGER");
	    }

)
)
;





// Entry rule entryRuleRealValue
entryRuleRealValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRealValueRule()); }
	 iv_ruleRealValue=ruleRealValue 
	 { $current=$iv_ruleRealValue.current; } 
	 EOF 
;

// Rule RealValue
ruleRealValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_REAL
		{
			newLeafNode(lv_value_0_0, grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRealValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"REAL");
	    }

)
)
;





// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	 iv_ruleStringValue=ruleStringValue 
	 { $current=$iv_ruleStringValue.current; } 
	 EOF 
;

// Rule StringValue
ruleStringValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_STRING
		{
			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleBooleanValue
entryRuleBooleanValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanValueRule()); }
	 iv_ruleBooleanValue=ruleBooleanValue 
	 { $current=$iv_ruleBooleanValue.current; } 
	 EOF 
;

// Rule BooleanValue
ruleBooleanValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
	    }
		lv_value_0_0=ruleBOOLEAN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"BOOLEAN");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Rule Measure
ruleMeasure returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Count' 
	{
        $current = grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Average' 
	{
        $current = grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Sum' 
	{
        $current = grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Minimum' 
	{
        $current = grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='Maximum' 
	{
        $current = grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 
    }
));



// Rule BOOLEAN
ruleBOOLEAN returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='true' 
	{
        $current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='false' 
	{
        $current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
    }
));



RULE_INTEGER : '-'? ('0'..'9')+;

RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

