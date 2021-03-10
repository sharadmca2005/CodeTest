package com.cgi.interview;

/**
 * Interface to handle previous and next fan speed status 
 * 
 * @author srivash
 *
 */
public interface State {
	//Move Fan Status to next state
	State nextState();
	
	//Move Fan status to previous state
	State previousState();
}
