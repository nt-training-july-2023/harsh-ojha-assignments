package com.OOPs.polymorphism;

//Declaring a parent class to be inherited
class Parent{
	
	void greet(String name){
		System.out.println("Hello, "+name+"! How are you?");
	}
	
}
//extending or inheriting the parent class
public class MethodOverriding extends Parent {
	
	//This method is overridden from the its parent class.
	//now whenever this method is called. Its new implementation will be executed
	
	//This is checked during the runtime hence known as runtime polymorphism
	//or method overriding
	
	@Override
	void greet(String name) {
		System.out.println("Hello "+name+"! Good Morning");
	}
	
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		
		obj.greet("Harsh");
	}
	
}

	
