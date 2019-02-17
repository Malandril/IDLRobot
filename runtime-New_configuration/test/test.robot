Robot{
	call main
	function main{
		moveStraight 2 cm in 200 ms
		if detected is wall {
			call detected_wall
		}
		if detected is ball{
			call detected_ball
		}
		call main
	}
	function detected_wall {
		turn 90 in 1 s
		moveStraight 4 cm in 1 s
		if detected is ball{
			call detected_ball
		}else{
			turn 90 in 1 s
		}
	}
	function detected_ball {
		release
		moveStraight 18 cm in 2 s
		grab
		moveStraight 7 cm in 1100 ms
		call go_home
	}
	function go_home{
		turn home in 2 s
		moveStraight 8 cm in 800 ms
		moveStraight 2 cm in 500 ms
		if detected is nothing {
			call go_home
		} else {
			if detected is wall{
				release
				moveStraight 5 cm in 2s
				moveStraight -8 cm in 2s
				turn 135 in 4 s
			}
		}
	}
}