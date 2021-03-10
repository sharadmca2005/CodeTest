package com.cgi.model;

/**
 * Interface for Green and Red Cord to pull
 * 
 * @author Sharad
 *
 */
public interface Cord {
	public State pull(State fanState);
}
