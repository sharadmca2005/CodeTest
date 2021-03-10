package com.cgi.interview;

public class FanTest {

	public static void main(String[] args) {
		Fan fan = new Fan();
		
		fan.printState();
		
		//Low Speed
		fan.pullForward();
		fan.printState();
		
		//Medium Speed
		fan.pullForward();
		fan.printState();
		
		//High Speed
		fan.pullForward();
		fan.printState();
		
		//Off
		fan.pullForward();
		fan.printState();
		
		//High
		fan.pullReverse();
		fan.printState();
		
		//Medium
		fan.pullReverse();
		fan.printState();
		
		//Low
		fan.pullReverse();
		fan.printState();
	}

}
