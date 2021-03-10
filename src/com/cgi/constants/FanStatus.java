package com.cgi.constants;

public enum FanStatus {
	LowState("Low Speed"), HighState("High Speed"), MediumState("Medium Speed"), OffState("Off Speed");
	
	private String status;
	
	public String getStatus() {
		return this.status;
	}
	
	private FanStatus(String status) {
		this.status = status;
	}
}
