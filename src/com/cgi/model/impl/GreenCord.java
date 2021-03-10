package com.cgi.model.impl;

import com.cgi.model.Cord;
import com.cgi.model.State;

/**
 * Green Cord - After every pull it will go to next state of fan
 * 
 * @author Sharad
 *
 */
public class GreenCord implements Cord {

	@Override
	public State pull(State fanState) {
		return fanState.nextState();
	}

}
