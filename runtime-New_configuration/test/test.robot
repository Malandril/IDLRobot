Robot{
	release
	call main
	function main{
		moveStraight 1 cm in 100 ms
		if sensorActivated {
			call test
		}
		call main
	}
	function test {
		turn 90 in 1 s
		moveStraight 2 cm in 100 ms
	}
	
}