/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.robotproject.xtextdsl.serializer;

import com.google.inject.Inject;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Angle;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Distance;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Duration;
import fr.unice.polytech.robotproject.model.RobotProjectModel.GoTo;
import fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight;
import fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot;
import fr.unice.polytech.robotproject.model.RobotProjectModel.RobotProjectModelPackage;
import fr.unice.polytech.robotproject.model.RobotProjectModel.Turn;
import fr.unice.polytech.robotproject.xtextdsl.services.MyDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RobotProjectModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RobotProjectModelPackage.ANGLE:
				sequence_Angle(context, (Angle) semanticObject); 
				return; 
			case RobotProjectModelPackage.DISTANCE:
				sequence_Distance(context, (Distance) semanticObject); 
				return; 
			case RobotProjectModelPackage.DURATION:
				sequence_Duration(context, (Duration) semanticObject); 
				return; 
			case RobotProjectModelPackage.GO_TO:
				sequence_GoTo(context, (GoTo) semanticObject); 
				return; 
			case RobotProjectModelPackage.MOVE_STRAIGHT:
				if (rule == grammarAccess.getMoveStraightRule()) {
					sequence_MoveStraight(context, (MoveStraight) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInstructionRule()
						|| rule == grammarAccess.getMovementRule()) {
					sequence_MoveStraight_Movement(context, (MoveStraight) semanticObject); 
					return; 
				}
				else break;
			case RobotProjectModelPackage.NAMED_BLOCK:
				sequence_NamedBlock(context, (NamedBlock) semanticObject); 
				return; 
			case RobotProjectModelPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case RobotProjectModelPackage.TURN:
				if (rule == grammarAccess.getInstructionRule()
						|| rule == grammarAccess.getMovementRule()) {
					sequence_Movement_Turn(context, (Turn) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTurnRule()) {
					sequence_Turn(context, (Turn) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Angle returns Angle
	 *
	 * Constraint:
	 *     (value=EInt angleUnit=AngleUnit?)
	 */
	protected void sequence_Angle(ISerializationContext context, Angle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Distance returns Distance
	 *
	 * Constraint:
	 *     (value=EInt distanceUnit=DistanceUnit)
	 */
	protected void sequence_Distance(ISerializationContext context, Distance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.AMOUNT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.AMOUNT__VALUE));
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.DISTANCE__DISTANCE_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.DISTANCE__DISTANCE_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDistanceAccess().getDistanceUnitDistanceUnitEnumRuleCall_1_0(), semanticObject.getDistanceUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Duration returns Duration
	 *
	 * Constraint:
	 *     (value=EInt timeUnit=TimeUnit)
	 */
	protected void sequence_Duration(ISerializationContext context, Duration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.AMOUNT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.AMOUNT__VALUE));
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.DURATION__TIME_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.DURATION__TIME_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_1_0(), semanticObject.getTimeUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns GoTo
	 *     GoTo returns GoTo
	 *
	 * Constraint:
	 *     destination=[NamedBlock|EString]
	 */
	protected void sequence_GoTo(ISerializationContext context, GoTo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.GO_TO__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.GO_TO__DESTINATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoToAccess().getDestinationNamedBlockEStringParserRuleCall_1_0_1(), semanticObject.eGet(RobotProjectModelPackage.Literals.GO_TO__DESTINATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MoveStraight returns MoveStraight
	 *
	 * Constraint:
	 *     distance=Distance
	 */
	protected void sequence_MoveStraight(ISerializationContext context, MoveStraight semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.MOVE_STRAIGHT__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.MOVE_STRAIGHT__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns MoveStraight
	 *     Movement returns MoveStraight
	 *
	 * Constraint:
	 *     (distance=Distance duration=Duration?)
	 */
	protected void sequence_MoveStraight_Movement(ISerializationContext context, MoveStraight semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Turn
	 *     Movement returns Turn
	 *
	 * Constraint:
	 *     (angle=Angle duration=Duration?)
	 */
	protected void sequence_Movement_Turn(ISerializationContext context, Turn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns NamedBlock
	 *     NamedBlock returns NamedBlock
	 *
	 * Constraint:
	 *     (name=EString (instructions+=Instruction instructions+=Instruction*)?)
	 */
	protected void sequence_NamedBlock(ISerializationContext context, NamedBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (instructions+=Instruction instructions+=Instruction*)?
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Turn returns Turn
	 *
	 * Constraint:
	 *     angle=Angle
	 */
	protected void sequence_Turn(ISerializationContext context, Turn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotProjectModelPackage.Literals.TURN__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotProjectModelPackage.Literals.TURN__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
}
