package fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot

import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.InstructionAspect.*
import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.FunctionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob
import fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight
import fr.unice.polytech.robotproject.model.RobotProjectModel.Turn
import fr.unice.polytech.robotproject.model.RobotProjectModel.Distance
import fr.unice.polytech.robotproject.model.RobotProjectModel.Duration
import fr.unice.polytech.robotproject.model.RobotProjectModel.Angle
import fr.unice.polytech.robotproject.model.RobotProjectModel.Amount
import fr.unice.polytech.robotproject.model.RobotProjectModel.Call
import fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction
import fr.unice.polytech.robotproject.model.RobotProjectModel.Function
import fr.unice.polytech.robotproject.model.RobotProjectModel.Wait
import fr.unice.polytech.robotproject.model.RobotProjectModel.Grab
import fr.unice.polytech.robotproject.model.RobotProjectModel.Release
import fr.unice.polytech.robotproject.model.RobotProjectModel.Condition
import fr.unice.polytech.robotproject.model.RobotProjectModel.SensorActivation
import fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock
import fr.unice.polytech.robotproject.model.RobotProjectModel.If
import java.util.List
import fr.unice.polytech.deantoni.vrep.polybot.utils.Blob
import fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D

@Aspect(className=Instruction)
abstract class InstructionAspect {
	@Step
	def void execute(PolyRob rob)
}


@Aspect(className=Duration)
class DurationAspect {
	def int computeValue(){
		return _self.value *_self.timeUnit.value
	}
}


@Aspect(className=Angle)
class AngleAspect {
	def int computeValue(){
		return _self.value *_self.angleUnit.value
	}
}


@Aspect(className=Distance)
class DistanceAspect {
	def int computeValue(){
		return _self.value *_self.distanceUnit.value
	}
}

@Aspect(className=InstructionBlock)
abstract class InstructionBlockAspect extends InstructionAspect {
	def void execute(PolyRob rob){
	}
	 def void execute_block(PolyRob rob){
    	for(i :_self.instructions){
    		i.execute(rob);
    	}
    }
}


@Aspect(className=Call)
class CallAspect extends InstructionAspect {
	def void execute(PolyRob rob){
		_self.destination.execute_block(rob);
	}
}


@Aspect(className=If)
class IfAspect extends InstructionBlockAspect {
	def void execute(PolyRob rob){
		if(_self.condition === null || ConditionAspect.eval(_self.condition,rob)){
			println("Condition is true if")
			_self.execute_block(rob);
		}else{
			println("Condition is false not if")
		}
	}
}

@Aspect(className=Grab)
class GrabAspect extends InstructionAspect {
	def void execute(PolyRob rob){
		rob.closeGrip();
	}
}


@Aspect(className=Release)
class ReleaseAspect extends InstructionAspect {
	def void execute(PolyRob rob){
		rob.openGrip();
	}
}


@Aspect(className=TimedInstruction)
class TimedInstructionAspect extends InstructionAspect {
	
	def int durationValue(){
		if(null !== _self.duration) {
			return DurationAspect.computeValue(_self.duration);
		}else{
			return 1000;
		}
	}
	
}


@Aspect(className=MoveStraight)
class MoveStraightAspect extends TimedInstructionAspect {
	@Step
	def void execute(PolyRob rob){
		var pos = rob.position;
		var distance = DistanceAspect.computeValue(_self.distance)
		var duration = _self.durationValue()
		println("Moving distance: " + distance + " for " + duration + " ms");
		rob.goStraight((distance / duration) as int , duration);
		var dist = Math.sqrt(Math.pow(pos.x - rob.position.x,2) + Math.pow(pos.y - rob.position.y,2));
		println("distance = "+dist);		
	}
}


@Aspect(className=Wait)
class WaitAspect extends TimedInstructionAspect {
	@Step
	def void execute(PolyRob rob){
		var duration = _self.durationValue();
		println("Waiting for: " + duration + " ms");
		rob.stepSimulation(duration);
		println("Finished waiting ");		
	}
}


@Aspect(className=Turn)
class TurnAspect extends TimedInstructionAspect {
	def void execute(PolyRob rob){
		var duration = _self.durationValue()
		var angle = AngleAspect.computeValue(_self.angle)
		println("Turning: " + _self.angle.value + " in " + duration + " ms");
		rob.turnRight((angle / duration) as int , duration);
	}
}


@Aspect(className=Function)
class FunctionAspect extends InstructionBlockAspect {
    def void execute(PolyRob rob) {
    }
    
}
class Viewable {
	public static List<Blob> blobs;
	 
	def public static boolean checkIfDetectedObjectIsAPaintBomb(Position2D objectCoordinate) {
		var addIt = true;
		for(Blob b: blobs) {
			if ((Math.abs(b.positionX - objectCoordinate.x) <= 50) && (Math.abs(b.positionY - objectCoordinate.y) <= 50)) {
				System.out.println("detected object is a paint bomb");
				addIt = false;
			}
		}
		return addIt;
	}
}

@Aspect(className=Robot)
class RobotAspect {
	
	@Main
    def void main() {
		var rob = new PolyRob("127.0.0.1", 19997);
    	println("Starting main");
    	Viewable.blobs = rob.viewableBlobs;
    	rob.start();
    	for(i :_self.instructions){
    		i.execute(rob);
    	}
    	rob.stopSimulation()
    }
}

@Aspect(className=Condition)
abstract class ConditionAspect  {
	def boolean eval(PolyRob rob);
}


@Aspect(className=SensorActivation)
class SensorActivationAspect extends ConditionAspect {
	def boolean eval(PolyRob rob){
		var objDist = rob.getDetectedObjectDistance();
		System.out.println("object distance: "+objDist+ "("+rob.orientation+") --> "+rob.position.x+","+rob.position.y);

		Position2D objectCoordinate = new Position2D(
											(int)Math.round(robPos.x+Math.cos(robOrientation)*objDist),
											(int)Math.round(robPos.y+Math.sin(robOrientation)*objDist)
		Viewable.checkIfDetectedObjectIsAPaintBomb(rob.position)
		println()
		rob.hasDetectedAnObject();
	}
}
