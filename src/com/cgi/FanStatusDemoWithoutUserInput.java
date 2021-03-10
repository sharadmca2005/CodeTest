package com.cgi;

public class FanStatusDemoWithoutUserInput {

	public static void main(String[] args) {
		Fan fan = new Fan();
		
		//Low Speed
		fan.pullForward();
		
		//Medium Speed
		fan.pullForward();
		
		//High Speed
		fan.pullForward();
		
		//Off
		fan.pullForward();
		
		//High
		fan.pullReverse();
		
		//Medium
		fan.pullReverse();
		
		//Low
		fan.pullReverse();
	}

}
