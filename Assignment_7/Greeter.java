package com.user;

public class Greeter {
	public String name;
	public Greeter(String aName){
		name = aName;
	}
	public String sayHello() {
		return name+" hello";
	}
	public String sayGoodBye() {
		return name+" good bye";
	}
}
