/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.robotproject.xtextdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.robotproject.xtextdsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import fr.unice.polytech.robotproject.xtextdsl.services.MyDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getTimedInstructionAccess().getAlternatives(), "rule__TimedInstruction__Alternatives");
			builder.put(grammarAccess.getAngleAccess().getAlternatives(), "rule__Angle__Alternatives");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getDetectedTypeAccess().getAlternatives(), "rule__DetectedType__Alternatives");
			builder.put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_3(), "rule__Robot__Group_3__0");
			builder.put(grammarAccess.getInstructionBlockAccess().getGroup(), "rule__InstructionBlock__Group__0");
			builder.put(grammarAccess.getInstructionBlockAccess().getGroup_2(), "rule__InstructionBlock__Group_2__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup_4(), "rule__If__Group_4__0");
			builder.put(grammarAccess.getReleaseAccess().getGroup(), "rule__Release__Group__0");
			builder.put(grammarAccess.getGrabAccess().getGroup(), "rule__Grab__Group__0");
			builder.put(grammarAccess.getMoveStraightAccess().getGroup(), "rule__MoveStraight__Group__0");
			builder.put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
			builder.put(grammarAccess.getTurnAccess().getGroup(), "rule__Turn__Group__0");
			builder.put(grammarAccess.getDistanceAccess().getGroup(), "rule__Distance__Group__0");
			builder.put(grammarAccess.getAngleAccess().getGroup_0(), "rule__Angle__Group_0__0");
			builder.put(grammarAccess.getHomeDirectionAccess().getGroup(), "rule__HomeDirection__Group__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getDetectedObjectIsAccess().getGroup(), "rule__DetectedObjectIs__Group__0");
			builder.put(grammarAccess.getSensorActivationAccess().getGroup(), "rule__SensorActivation__Group__0");
			builder.put(grammarAccess.getRobotAccess().getInstructionsAssignment_3_0(), "rule__Robot__InstructionsAssignment_3_0");
			builder.put(grammarAccess.getRobotAccess().getInstructionsAssignment_3_1(), "rule__Robot__InstructionsAssignment_3_1");
			builder.put(grammarAccess.getInstructionBlockAccess().getInstructionsAssignment_2_0(), "rule__InstructionBlock__InstructionsAssignment_2_0");
			builder.put(grammarAccess.getInstructionBlockAccess().getInstructionsAssignment_2_1(), "rule__InstructionBlock__InstructionsAssignment_2_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getInstructionBlockAssignment_2(), "rule__Function__InstructionBlockAssignment_2");
			builder.put(grammarAccess.getIfAccess().getConditionAssignment_2(), "rule__If__ConditionAssignment_2");
			builder.put(grammarAccess.getIfAccess().getTrueBlockAssignment_3(), "rule__If__TrueBlockAssignment_3");
			builder.put(grammarAccess.getIfAccess().getFalseBlockAssignment_4_1(), "rule__If__FalseBlockAssignment_4_1");
			builder.put(grammarAccess.getMoveStraightAccess().getDistanceAssignment_1(), "rule__MoveStraight__DistanceAssignment_1");
			builder.put(grammarAccess.getMoveStraightAccess().getDurationAssignment_3(), "rule__MoveStraight__DurationAssignment_3");
			builder.put(grammarAccess.getWaitAccess().getDurationAssignment_3(), "rule__Wait__DurationAssignment_3");
			builder.put(grammarAccess.getTurnAccess().getAngleAssignment_1(), "rule__Turn__AngleAssignment_1");
			builder.put(grammarAccess.getTurnAccess().getDurationAssignment_3(), "rule__Turn__DurationAssignment_3");
			builder.put(grammarAccess.getDistanceAccess().getValueAssignment_0(), "rule__Distance__ValueAssignment_0");
			builder.put(grammarAccess.getDistanceAccess().getDistanceUnitAssignment_1(), "rule__Distance__DistanceUnitAssignment_1");
			builder.put(grammarAccess.getAngleAccess().getValueAssignment_0_0(), "rule__Angle__ValueAssignment_0_0");
			builder.put(grammarAccess.getAngleAccess().getAngleUnitAssignment_0_1(), "rule__Angle__AngleUnitAssignment_0_1");
			builder.put(grammarAccess.getDurationAccess().getValueAssignment_0(), "rule__Duration__ValueAssignment_0");
			builder.put(grammarAccess.getDurationAccess().getTimeUnitAssignment_1(), "rule__Duration__TimeUnitAssignment_1");
			builder.put(grammarAccess.getCallAccess().getDestinationAssignment_1(), "rule__Call__DestinationAssignment_1");
			builder.put(grammarAccess.getPrintAccess().getStringAssignment_2(), "rule__Print__StringAssignment_2");
			builder.put(grammarAccess.getDetectedObjectIsAccess().getRightOperandAssignment_2(), "rule__DetectedObjectIs__RightOperandAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
