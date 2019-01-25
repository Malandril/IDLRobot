package fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.robotproject.model.RobotProjectModel.Instruction
import fr.unice.polytech.robotproject.model.RobotProjectModel.Move
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot

import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.InstructionAspect.*
import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.MoveAspect.*
import static extension fr.unice.polytech.robotproject.aspect.RobotProjectModel.aspects.RobotAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob


@Aspect(className=Instruction)
abstract class InstructionAspect {
	def void execute(PolyRob rob);
}

@Aspect(className=Move)
class MoveAspect extends InstructionAspect {
	@Main
	def void execute(PolyRob rob){
		println("Moving distance: "+_self.distance)
		rob.goStraight(5,_self.distance*1000)
	}
}

@Aspect(className=Robot)
class RobotAspect {
	@Main
    def void main() {
		var rob = new PolyRob("127.0.0.1", 19997);
    	println("Starting main");
    	rob.start()
    	for(i :_self.instructions){
    		i.execute(rob);
    	}
    	rob.stopSimulation()
    }
}



