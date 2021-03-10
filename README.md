# CodeTest

3 Speed/State and 1 Off
	Low
		NextState -> Medium
		PreviousState -> Off
	Medium
		NextState -> High
		PreviousState -> Low
	High
		NextState -> Off
		PreviousState -> Medium
	Off
		NextState -> Low
		PreviousState -> High

2 Cord
	Green -> Pull in forward direction
	Red -> Pull in reverse direction
			

Fan
	Current State is Off
	2 Pull
		1st - Forward for next state - Increase speed
		2nd - Reverse for previous state - decrease speed
		