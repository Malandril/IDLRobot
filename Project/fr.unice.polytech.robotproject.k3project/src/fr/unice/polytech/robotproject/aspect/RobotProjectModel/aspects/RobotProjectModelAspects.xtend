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

@Aspect(className=Instruction)
abstract class InstructionAspect {
	@Step
	def void execute(PolyRob rob);
}

@Aspect(className=MoveStraight)
class MoveAspect extends InstructionAspect {
	@Step
	def void execute(PolyRob rob){
		var duration = 1000;
		if(null !== _self.duration) {
			duration = _self.duration.value*1000;
		} 
		var pos = rob.position;
		println("Moving distance: " + _self.amount.value + " for " + duration + " ms");
		rob.goStraight((_self.amount.value / duration) as int , duration);
		var dist = Math.sqrt(pos.x * rob.position.x + rob.position.y * pos.y);
		println("distance = "+dist);		
	}
}

@Aspect(className=Turn)
class TurnAspect extends InstructionAspect {
	def void execute(PolyRob rob){
		var duration = 1000;
		if(null !== _self.duration) {
			duration = _self.duration.value;
		}
		println("Turning: " + _self.amount.value + " in " + duration + " ms");
		rob.turnRight((_self.amount.value / duration) as int , duration);
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



