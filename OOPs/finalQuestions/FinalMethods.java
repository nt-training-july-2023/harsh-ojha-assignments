package com.OOPs.finalQuestions;

import java.net.Socket;

class Parent{
	
	//declaring a non-final method
	void nonFinal() {
		System.out.println("I am a non-final method");
	}
	
	//declaring a final method
	final void finalMethod() {
		System.out.println("I am a final method");
	}
}
//Inheriting the parent class 
//If we declare parent class as final , then we can not extend it
class Child extends Parent{
	
	//This is giving error, as we can not override final methods
//	@Override
//	void finalMethod() {}
	
	//But we can override non final methods
	@Override
	void nonFinal() {
		System.out.println("I am non final method overriden");
	}
	
	//So here lies the reason, that if we declare a class as final then
	//we cannot even extend it resulting in no overriding allowed
	//So instead of declaring class as final we can declare methods
	//as final methods which we dont want to be overriden by the
	//child classes. while the non-final methods can be overriden
	
}

public class FinalMethods {
	
	public static void main(String[] args) {
		Parent objParent = new Parent();
		Child objChild  = new Child();
		
		objParent.finalMethod();
		objParent.nonFinal();
		
		objChild.finalMethod();
		objChild.nonFinal();
	}
}
