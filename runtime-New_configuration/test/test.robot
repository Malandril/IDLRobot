Robot{
	GoTo main
	NamedBlock main{
		MoveStraight 10 cm in 1 s
		GoTo test if SensorActivated
		GoTo main
	}
	NamedBlock test {
		Turn 90 in 1 s
		MoveStraight 5 cm in 1 s
	}
	
}