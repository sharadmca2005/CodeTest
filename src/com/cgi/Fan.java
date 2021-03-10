package com.cgi;

import com.cgi.constants.FanStatus;
import com.cgi.model.State;
import com.cgi.model.impl.HighState;
import com.cgi.model.impl.LowState;
import com.cgi.model.impl.MediumState;
import com.cgi.model.impl.OffState;

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
		this.setCurrentState(currentState.nextState());
		this.printState();
	}

	public void pullReverse() {
		this.setCurrentState(currentState.previousState());
		this.printState();
	}
	
	private void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
	
	private void printState() {
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
