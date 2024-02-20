package com.user;

public class Advisor {
	String message[];
	public Advisor(String a[]){
		message = a;
	}
	public String getAdvice() {
		return message[1];
	}
	//message = new String[5];
	
}
