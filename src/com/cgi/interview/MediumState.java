package com.cgi.interview;

/**
 * This class is use to provide next and previous state when Fan is on medium speed
 * Fan will go in high speed status in case of forward while go on low status in case of reverse
 * 
 * @author Sharad
 * 
 */
public class MediumState implements State {

	/**
	 * Return High State
	 */
	@Override
	public State nextState() {
		return new HighState();
	}

	/**
	 * Return Low State
	 */
	@Override
	public State previousState() {
		return new LowState();
	}

}
