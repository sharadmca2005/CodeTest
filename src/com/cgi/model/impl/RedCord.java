package com.cgi.model.impl;

import com.cgi.model.Cord;
import com.cgi.model.State;

/**
 * Red Cord - After every pull it will go to previous state of fan
 * 
 * @author Sharad
 *
 */
public class RedCord implements Cord {

	@Override
	public State pull(State fanState) {
		return fanState.previousState();
	}

}
