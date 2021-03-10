package com.cgi.interview;

/**
 * This class is use to provide next and previous state when Fan is on low speed
 * Fan will go in medium state in case of forward while go on off status in case of reverse
 * 
 * @author Sharad
 * 
 */
public class LowState implements State {

	/**
	 * Return Mediun State
	 */
	@Override
	public State nextState() {
		return new MediumState();
	}

	/**
	 * Return Off State
	 */
	@Override
	public State previousState() {
		return new OffState();
	}

}
