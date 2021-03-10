package com.cgi.interview;

/**
 * This class is use to provide next and previous state when Fan is Off
 * 
 * @author Sharad
 *
 */
public class OffState implements State{

	/**
	 * Return Low State
	 */
	@Override
	public State nextState() {
		return new LowState();
	}

	/**
	 * Return High State
	 */
	@Override
	public State previousState() {
		return new HighState();
	}

}
