/*
 * generated by Xtext 2.14.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.unice.polytech.robotproject.xtextdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.unice.polytech.robotproject.xtextdsl.parser.antlr.internal;

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
import fr.unice.polytech.robotproject.xtextdsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Robot";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRobot
entryRuleRobot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotRule()); }
	iv_ruleRobot=ruleRobot
	{ $current=$iv_ruleRobot.current; }
	EOF;

// Rule Robot
ruleRobot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRobotAccess().getRobotAction_0(),
					$current);
			}
		)
		otherlv_1='Robot'
		{
			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_0_0());
					}
					lv_instructions_3_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"instructions",
							lv_instructions_3_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_1_0());
					}
					lv_instructions_4_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"instructions",
							lv_instructions_4_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getTimedInstructionParserRuleCall_0());
		}
		this_TimedInstruction_0=ruleTimedInstruction
		{
			$current = $this_TimedInstruction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1());
		}
		this_Grab_1=ruleGrab
		{
			$current = $this_Grab_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2());
		}
		this_Release_2=ruleRelease
		{
			$current = $this_Release_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getFunctionParserRuleCall_3());
		}
		this_Function_3=ruleFunction
		{
			$current = $this_Function_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_4());
		}
		this_Call_4=ruleCall
		{
			$current = $this_Call_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getIfParserRuleCall_5());
		}
		this_If_5=ruleIf
		{
			$current = $this_If_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInstructionBlock
entryRuleInstructionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionBlockRule()); }
	iv_ruleInstructionBlock=ruleInstructionBlock
	{ $current=$iv_ruleInstructionBlock.current; }
	EOF;

// Rule InstructionBlock
ruleInstructionBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInstructionBlockAccess().getInstructionBlockAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInstructionBlockAccess().getInstructionsInstructionParserRuleCall_2_0_0());
					}
					lv_instructions_2_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
						}
						add(
							$current,
							"instructions",
							lv_instructions_2_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getInstructionBlockAccess().getInstructionsInstructionParserRuleCall_2_1_0());
					}
					lv_instructions_3_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
						}
						add(
							$current,
							"instructions",
							lv_instructions_3_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getInstructionBlockInstructionBlockParserRuleCall_2_0());
				}
				lv_instructionBlock_2_0=ruleInstructionBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"instructionBlock",
						lv_instructionBlock_2_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.InstructionBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIfAccess().getIfAction_0(),
					$current);
			}
		)
		otherlv_1='if'
		{
			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getConditionConditionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getTrueBlockInstructionBlockParserRuleCall_3_0());
				}
				lv_trueBlock_3_0=ruleInstructionBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"trueBlock",
						lv_trueBlock_3_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.InstructionBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='else'
			{
				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfAccess().getFalseBlockInstructionBlockParserRuleCall_4_1_0());
					}
					lv_falseBlock_5_0=ruleInstructionBlock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfRule());
						}
						set(
							$current,
							"falseBlock",
							lv_falseBlock_5_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.InstructionBlock");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleRelease
entryRuleRelease returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReleaseRule()); }
	iv_ruleRelease=ruleRelease
	{ $current=$iv_ruleRelease.current; }
	EOF;

// Rule Release
ruleRelease returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getReleaseAccess().getReleaseAction_0(),
					$current);
			}
		)
		otherlv_1='release'
		{
			newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
		}
	)
;

// Entry rule entryRuleGrab
entryRuleGrab returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGrabRule()); }
	iv_ruleGrab=ruleGrab
	{ $current=$iv_ruleGrab.current; }
	EOF;

// Rule Grab
ruleGrab returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGrabAccess().getGrabAction_0(),
					$current);
			}
		)
		otherlv_1='grab'
		{
			newLeafNode(otherlv_1, grammarAccess.getGrabAccess().getGrabKeyword_1());
		}
	)
;

// Entry rule entryRuleTimedInstruction
entryRuleTimedInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimedInstructionRule()); }
	iv_ruleTimedInstruction=ruleTimedInstruction
	{ $current=$iv_ruleTimedInstruction.current; }
	EOF;

// Rule TimedInstruction
ruleTimedInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTimedInstructionAccess().getMoveStraightParserRuleCall_0());
		}
		this_MoveStraight_0=ruleMoveStraight
		{
			$current = $this_MoveStraight_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTimedInstructionAccess().getTurnParserRuleCall_1());
		}
		this_Turn_1=ruleTurn
		{
			$current = $this_Turn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTimedInstructionAccess().getWaitParserRuleCall_2());
		}
		this_Wait_2=ruleWait
		{
			$current = $this_Wait_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMoveStraight
entryRuleMoveStraight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveStraightRule()); }
	iv_ruleMoveStraight=ruleMoveStraight
	{ $current=$iv_ruleMoveStraight.current; }
	EOF;

// Rule MoveStraight
ruleMoveStraight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='moveStraight'
		{
			newLeafNode(otherlv_0, grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0());
				}
				lv_distance_1_0=ruleDistance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMoveStraightRule());
					}
					set(
						$current,
						"distance",
						lv_distance_1_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Distance");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getMoveStraightAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_3_0());
				}
				lv_duration_3_0=ruleDuration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMoveStraightRule());
					}
					set(
						$current,
						"duration",
						lv_duration_3_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Duration");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleWait
entryRuleWait returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWaitRule()); }
	iv_ruleWait=ruleWait
	{ $current=$iv_ruleWait.current; }
	EOF;

// Rule Wait
ruleWait returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getWaitAccess().getWaitAction_0(),
					$current);
			}
		)
		otherlv_1='wait'
		{
			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
		}
		otherlv_2='for'
		{
			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getForKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitAccess().getDurationDurationParserRuleCall_3_0());
				}
				lv_duration_3_0=ruleDuration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitRule());
					}
					set(
						$current,
						"duration",
						lv_duration_3_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Duration");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleTurn
entryRuleTurn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnRule()); }
	iv_ruleTurn=ruleTurn
	{ $current=$iv_ruleTurn.current; }
	EOF;

// Rule Turn
ruleTurn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='turn'
		{
			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0());
				}
				lv_angle_1_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTurnRule());
					}
					set(
						$current,
						"angle",
						lv_angle_1_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_3_0());
				}
				lv_duration_3_0=ruleDuration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTurnRule());
					}
					set(
						$current,
						"duration",
						lv_duration_3_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Duration");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleDistance
entryRuleDistance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDistanceRule()); }
	iv_ruleDistance=ruleDistance
	{ $current=$iv_ruleDistance.current; }
	EOF;

// Rule Distance
ruleDistance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0());
				}
				lv_value_0_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistanceRule());
					}
					set(
						$current,
						"value",
						lv_value_0_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDistanceAccess().getDistanceUnitDistanceUnitEnumRuleCall_1_0());
				}
				lv_distanceUnit_1_0=ruleDistanceUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistanceRule());
					}
					set(
						$current,
						"distanceUnit",
						lv_distanceUnit_1_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.DistanceUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAngle
entryRuleAngle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAngleRule()); }
	iv_ruleAngle=ruleAngle
	{ $current=$iv_ruleAngle.current; }
	EOF;

// Rule Angle
ruleAngle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAngleAccess().getValueEIntParserRuleCall_0_0_0());
					}
					lv_value_0_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAngleRule());
						}
						set(
							$current,
							"value",
							lv_value_0_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAngleAccess().getAngleUnitAngleUnitEnumRuleCall_0_1_0());
					}
					lv_angleUnit_1_0=ruleAngleUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAngleRule());
						}
						set(
							$current,
							"angleUnit",
							lv_angleUnit_1_0,
							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.AngleUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		    |
		{
			newCompositeNode(grammarAccess.getAngleAccess().getHomeDirectionParserRuleCall_1());
		}
		this_HomeDirection_2=ruleHomeDirection
		{
			$current = $this_HomeDirection_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleHomeDirection
entryRuleHomeDirection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHomeDirectionRule()); }
	iv_ruleHomeDirection=ruleHomeDirection
	{ $current=$iv_ruleHomeDirection.current; }
	EOF;

// Rule HomeDirection
ruleHomeDirection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHomeDirectionAccess().getHomeDirectionAction_0(),
					$current);
			}
		)
		otherlv_1='home'
		{
			newLeafNode(otherlv_1, grammarAccess.getHomeDirectionAccess().getHomeKeyword_1());
		}
	)
;

// Entry rule entryRuleDuration
entryRuleDuration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDurationRule()); }
	iv_ruleDuration=ruleDuration
	{ $current=$iv_ruleDuration.current; }
	EOF;

// Rule Duration
ruleDuration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0());
				}
				lv_value_0_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDurationRule());
					}
					set(
						$current,
						"value",
						lv_value_0_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_0());
				}
				lv_timeUnit_1_0=ruleTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDurationRule());
					}
					set(
						$current,
						"timeUnit",
						lv_timeUnit_1_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.TimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleCall
entryRuleCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallRule()); }
	iv_ruleCall=ruleCall
	{ $current=$iv_ruleCall.current; }
	EOF;

// Rule Call
ruleCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='call'
		{
			newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCallRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCallAccess().getDestinationFunctionCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionAccess().getSensorActivationParserRuleCall_0());
		}
		this_SensorActivation_0=ruleSensorActivation
		{
			$current = $this_SensorActivation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionAccess().getDetectedObjectIsParserRuleCall_1());
		}
		this_DetectedObjectIs_1=ruleDetectedObjectIs
		{
			$current = $this_DetectedObjectIs_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDetectedObjectIs
entryRuleDetectedObjectIs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDetectedObjectIsRule()); }
	iv_ruleDetectedObjectIs=ruleDetectedObjectIs
	{ $current=$iv_ruleDetectedObjectIs.current; }
	EOF;

// Rule DetectedObjectIs
ruleDetectedObjectIs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='detected'
		{
			newLeafNode(otherlv_0, grammarAccess.getDetectedObjectIsAccess().getDetectedKeyword_0());
		}
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getDetectedObjectIsAccess().getIsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDetectedObjectIsAccess().getRightOperandDetectedTypeEnumRuleCall_2_0());
				}
				lv_rightOperand_2_0=ruleDetectedType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDetectedObjectIsRule());
					}
					set(
						$current,
						"rightOperand",
						lv_rightOperand_2_0,
						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.DetectedType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSensorActivation
entryRuleSensorActivation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorActivationRule()); }
	iv_ruleSensorActivation=ruleSensorActivation
	{ $current=$iv_ruleSensorActivation.current; }
	EOF;

// Rule SensorActivation
ruleSensorActivation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSensorActivationAccess().getSensorActivationAction_0(),
					$current);
			}
		)
		otherlv_1='sensorActivated'
		{
			newLeafNode(otherlv_1, grammarAccess.getSensorActivationAccess().getSensorActivatedKeyword_1());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule TimeUnit
ruleTimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ms'
			{
				$current = grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='s'
			{
				$current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule DistanceUnit
ruleDistanceUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='cm'
		{
			$current = grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration());
		}
	)
;

// Rule AngleUnit
ruleAngleUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='deg'
		{
			$current = grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration());
		}
	)
;

// Rule DetectedType
ruleDetectedType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ball'
			{
				$current = grammarAccess.getDetectedTypeAccess().getBALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDetectedTypeAccess().getBALLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='nothing'
			{
				$current = grammarAccess.getDetectedTypeAccess().getNULLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDetectedTypeAccess().getNULLEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='wall'
			{
				$current = grammarAccess.getDetectedTypeAccess().getWALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDetectedTypeAccess().getWALLEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
