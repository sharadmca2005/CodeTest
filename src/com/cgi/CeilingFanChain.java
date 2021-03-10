package com.cgi;

import com.cgi.constants.FanStatus;
import com.cgi.model.Cord;
import com.cgi.model.State;
import com.cgi.model.impl.HighState;
import com.cgi.model.impl.LowState;
import com.cgi.model.impl.MediumState;
import com.cgi.model.impl.OffState;

public class CeilingFanChain {
	private State currentState;

	public CeilingFanChain() {
		currentState = new OffState();
	}
	
	public void pull(Cord cord) {
		setCurrentState(cord.pull(currentState));
		printState();
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
