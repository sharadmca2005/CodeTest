package com.cgi.interview;

/**
 * This class is use to provide next and previous state when Fan is on high speed
 * Fan will go in off status in case of forward while go on medium status in case of reverse
 * 
 * @author Sharad
 * 
 */
public class HighState implements State {

	/**
	 * Return Off State
	 */
	@Override
	public State nextState() {
		return new OffState();
	}

	/**
	 * Return Medium State
	 */
	@Override
	public State previousState() {
		return new MediumState();
	}

}
