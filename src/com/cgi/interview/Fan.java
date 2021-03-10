package com.cgi.interview;

/**
 * Fan with green and red pull with current state off
 * 
 * @author 17048
 *
 */
public class Fan {
	private State currentState;

	public Fan() {
		currentState = new OffState();
	}

	public void pullForward() {
		setCurrentState(currentState.nextState());
	}

	public void pullReverse() {
		setCurrentState(currentState.previousState());
	}
	
	private void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
	
	public void printState() {
		if(currentState instanceof OffState) {
			System.out.println(FanStatus.OffState);
		} else if(currentState instanceof LowState) {
			System.out.println(FanStatus.LowState);
		} else if(currentState instanceof MediumState) {
			System.out.println(FanStatus.MediumState);
		} else if(currentState instanceof HighState) {
			System.out.println(FanStatus.HighState);
		}
	}
}
