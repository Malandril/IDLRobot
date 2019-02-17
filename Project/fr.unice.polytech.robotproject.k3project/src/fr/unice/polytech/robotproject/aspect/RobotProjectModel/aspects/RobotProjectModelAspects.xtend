package fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob
import fr.unice.polytech.deantoni.vrep.polybot.utils.Blob
import fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D
import fr.unice.polytech.robotproject.model.RobotProjectModel.Amount
import fr.unice.polytech.robotproject.model.RobotProjectModel.Angle
import fr.unice.polytech.robotproject.model.RobotProjectModel.Call
import fr.unice.polytech.robotproject.model.RobotProjectModel.Condition
import fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedObjectIs
import fr.unice.polytech.robotproject.model.RobotProjectModel.DetectedType
import fr.unice.polytech.robotproject.model.RobotProjectModel.Distance
import fr.unice.polytech.robotproject.model.RobotProjectModel.Duration
import fr.unice.polytech.robotproject.model.RobotProjectModel.Function
import fr.unice.polytech.robotproject.model.RobotProjectModel.Grab
import fr.unice.polytech.robotproject.model.RobotProjectModel.HomeDirection
import fr.unice.polytech.robotproject.model.RobotProjectModel.If
import fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
import fr.unice.polytech.robotproject.model.RobotProjectModel.InstructionBlock
import fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight
import fr.unice.polytech.robotproject.model.RobotProjectModel.Release
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot
import fr.unice.polytech.robotproject.model.RobotProjectModel.SensorActivation
import fr.unice.polytech.robotproject.model.RobotProjectModel.TimedInstruction
import fr.unice.polytech.robotproject.model.RobotProjectModel.Turn
import fr.unice.polytech.robotproject.model.RobotProjectModel.Wait
import java.util.List

import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.FunctionAspect.*
import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.InstructionAspect.*
import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.RobotAspect.*
import fr.unice.polytech.robotproject.model.RobotProjectModel.Print

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
	def int computeValue(PolyRob rob){
		return _self.value *_self.angleUnit.value
	}
}


@Aspect(className=Distance)
class DistanceAspect {
	def int computeValue(){
		return _self.value *_self.distanceUnit.value
	}
}

@Aspect(className=HomeDirection)
class HomeDirectionAspect extends AngleAspect{
	Position2D safePlace = new Position2D(-45, 500);
	
	def int computeValue(PolyRob rob){
		var robPos = rob.position
		var robOrientation = rob.orientation
		var angleToReach = Math.atan2(_self.safePlace.y - robPos.y, _self.safePlace.x - robPos.x)
		var angleToDo = robOrientation - angleToReach;
		if (angleToDo > Math.PI) {
			angleToDo = angleToDo - 2*Math.PI ; 
		}
		println("Home angle "+ angleToDo)
		return (angleToDo * 180 / Math.PI * _self.angleUnit.value) as int;
	}

}

@Aspect(className=If)
class IfAspect extends InstructionAspect {
	@Step
	def void execute(PolyRob rob){
		if(ConditionAspect.eval(_self.condition,rob)){
			_self.execute_block(rob, _self.trueBlock)
		} else if(_self.falseBlock !==null){
			_self.execute_block(rob, _self.falseBlock)
		}
		
	}
	
	def void execute_block(PolyRob rob,InstructionBlock block){
		for(i : block.instructions){
			i.execute(rob)
		}
	}
}

@Aspect(className=Function)
class FunctionAspect extends InstructionAspect {
   
    def void execute(PolyRob rob) {
    }
    
    def void execute_block(PolyRob rob){
    	for(i : _self.instructionBlock.instructions){
    		i.execute(rob)
    	}
    }
}


@Aspect(className=Call)
class CallAspect extends InstructionAspect {
	@Step
	def void execute(PolyRob rob){
		rob.displayFunction(_self.destination.name)
		rob.printToStatusbar("Calling function " + _self.destination.name)
		_self.destination.execute_block(rob);
	}
}


@Aspect(className=Grab)
class GrabAspect extends InstructionAspect {
	@Step
	def void execute(PolyRob rob){
		rob.printToStatusbar("Closing claws")
		RobotAspect.closedGrip = false;
		rob.closeGrip();
	}
}


@Aspect(className=Release)
class ReleaseAspect extends InstructionAspect {
	@Step
	def void execute(PolyRob rob){
		rob.printToStatusbar("Opening claws")
		RobotAspect.closedGrip = false;
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
		// rob.printToStatusbar("Moving: " + distance + " in " + duration + " ms");
		rob.goStraight((distance / duration) as int , duration);
		var dist = Math.sqrt(Math.pow(pos.x - rob.position.x,2) + Math.pow(pos.y - rob.position.y,2));
		rob.printToStatusbar("Moved: " + dist);
	}
}


@Aspect(className=Wait)
class WaitAspect extends TimedInstructionAspect {
	@Step
	def void execute(PolyRob rob){
		var duration = _self.durationValue();
		rob.printToStatusbar("Waiting for: " + duration + " ms");
		rob.stepSimulation(duration);
		rob.printToStatusbar("Finished waiting");		
	}
}


@Aspect(className=Turn)
class TurnAspect extends TimedInstructionAspect {
	@Step
	def void execute(PolyRob rob){
		var duration = _self.durationValue()
		var angle = AngleAspect.computeValue(_self.angle, rob)
		var orientation = rob.orientation
		// rob.printToStatusbar("Turning: " + _self.angle.value + " in " + duration + " ms");
		rob.turnRight((angle / duration) as int , duration);
		rob.printToStatusbar("Turned: " + (rob.orientation - orientation)*180/Math.PI)
	}
}





@Aspect(className=Condition)
abstract class ConditionAspect  {
	def boolean eval(PolyRob rob);
}

@Aspect(className=DetectedObjectIs)
class DetectedObjectIsAspect extends ConditionAspect {
	
	def boolean eval(PolyRob rob){
		val detected = _self.detectType(rob)
		if(detected != DetectedType.NULL){
			rob.displayDetected(detected.getName+" distance: "+rob.detectedObjectDistance)
			rob.printToStatusbar("Detected: " + detected.getName)
		}
		return detected == _self.rightOperand
	}
	def double computeDistance(int x1,int y1,int x2,int y2){
		Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))
	}
	def DetectedType detectType(PolyRob rob){
		if(rob.hasDetectedAnObject()&&!RobotAspect.closedGrip){
			println("dist "+ rob.detectedObjectDistance)
			var blobs = rob.viewableBlobs
			var pos = rob.position
			var orientation = rob.orientation
			
			for(blob : blobs){
				var angle=Math.atan2(pos.y - blob.positionY,pos.x - blob.positionX) + Math.PI
				println(orientation+" "+angle)
				if(Math.abs(angle-orientation)<0.6 && _self.computeDistance(pos.x, pos.y, blob.positionX, blob.positionY) <= 400){
					println('this is a ball')
					return DetectedType.BALL
				}
			}
			return DetectedType.WALL
		}
		return DetectedType.NULL
	}
}


@Aspect(className=SensorActivation)
class SensorActivationAspect extends ConditionAspect {
	def boolean eval(PolyRob rob){
		return rob.hasDetectedAnObject()
	}
}

@Aspect(className=Print)
class PrintAspect extends InstructionAspect {
	@Step
	def void execute(PolyRob rob){
		rob.printToStatusbar(_self.string)
	}
}


@Aspect(className=Robot)
class RobotAspect {
	
	public static boolean closedGrip = false;
	
	@Main
    def void main() {
    	try{
			var rob = new PolyRob("127.0.0.1", 19997);
			println("Starting main");
	    	rob.start();
	    	rob.openGrip();
	    	rob.stepSimulationOnce()
	    	for(i :_self.instructions){
	    		i.execute(rob);
	    		
	    	}
	    	rob.stopSimulation()
		}catch(RuntimeException e){
			e.printStackTrace;
		}
    	
    }
}
