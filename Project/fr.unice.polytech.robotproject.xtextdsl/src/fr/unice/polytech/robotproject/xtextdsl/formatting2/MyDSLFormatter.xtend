/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.robotproject.xtextdsl.formatting2

import com.google.inject.Inject
import fr.unice.polytech.robotproject.model.RobotProjectModel.Movement
import fr.unice.polytech.robotproject.model.RobotProjectModel.Robot
import fr.unice.polytech.robotproject.xtextdsl.services.MyDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Robot robot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (instruction : robot.instructions) {
			instruction.format
		}
	}

	def dispatch void format(Movement movement, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		movement.duration.format
	}
	
	// TODO: implement for MoveStraight, Turn, NamedBlock
}
