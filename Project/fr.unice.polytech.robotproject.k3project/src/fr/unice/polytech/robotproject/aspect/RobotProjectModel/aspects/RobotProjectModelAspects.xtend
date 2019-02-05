package fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot

import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.InstructionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob
import fr.unice.polytech.robotproject.model.RobotProjectModel.MoveStraight
import fr.unice.polytech.robotproject.model.RobotProjectModel.Turn
import fr.unice.polytech.robotproject.model.RobotProjectModel.Distance
import fr.unice.polytech.robotproject.model.RobotProjectModel.Duration
import fr.unice.polytech.robotproject.model.RobotProjectModel.Angle
import fr.unice.polytech.robotproject.model.RobotProjectModel.Amount
import fr.unice.polytech.robotproject.model.RobotProjectModel.GoTo
import fr.unice.polytech.robotproject.model.RobotProjectModel.Movement
import fr.unice.polytech.robotproject.model.RobotProjectModel.NamedBlock

@Aspect(className=Instruction)
abstract class InstructionAspect {
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


@Aspect(className=GoTo)
class GoToAspect extends InstructionAspect {
	def void execute(PolyRob rob){
		NamedBlockAspect.real_execute(_self.destination,rob);
	}
}

@Aspect(className=Movement)
class MovementAspect extends InstructionAspect {
	
	def int durationValue(){
		if(null !== _self.duration) {
			return DurationAspect.computeValue(_self.duration);
		}else{
			return 1000;
		}
	}
	
}

@Aspect(className=MoveStraight)
class MoveStraightAspect extends MovementAspect {
	@Step
	def void execute(PolyRob rob){
		var pos = rob.position;
		var distance = DistanceAspect.computeValue(_self.distance)
		var duration = _self.durationValue()
		println("Moving distance: " + distance + " for " + duration + " ms");
		rob.goStraight((distance / duration) as int , duration);
		var dist = Math.sqrt(Math.pow(pos.x - rob.position.x,2) + Math.pow(pos.y - rob.position.y,2));
		println("distance2 = "+dist);		
	}
}

@Aspect(className=Turn)
class TurnAspect extends MovementAspect {
	def void execute(PolyRob rob){
		var duration = _self.durationValue()
		var angle = AngleAspect.computeValue(_self.angle)
		println("Turning: " + _self.angle.value + " in " + duration + " ms");
		rob.turnRight((angle / duration) as int , duration);
	}
}

@Aspect(className=NamedBlock)
class NamedBlockAspect extends InstructionAspect {
    def void execute(PolyRob rob) {
    	
    }
    
    def void real_execute(PolyRob rob) {
    	println("Executing block "+_self.name);
    	for(i :_self.instructions){
    		i.execute(rob);
    	}
    }
}


@Aspect(className=Robot)
class RobotAspect {
	@Main
    def void main() {
		var rob = new PolyRob("127.0.0.1", 19997);
    	println("Starting main");
    	rob.start();
    	for(i :_self.instructions){
    		i.execute(rob);
    	}
    	rob.stopSimulation()
    }
}



