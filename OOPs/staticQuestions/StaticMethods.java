package com.OOPs.staticQuestions;

public class StaticMethods {
	
	//Declaring a non-static variable
	String nonStaticString="I am non-Static String";
	
	//declaring a static variable
	static String staticString = "I am Static String";
	
	//defining a non-static method
	void nonStaticMethod() {
		
		//We can use non-static variable inside a non-static method
		System.out.println(nonStaticString);
		//We can also access static variables using non-static methods
		System.out.println(staticString);
	}
	
	//defining a static method
	static void staticMethod() {
		//Here it gives an error, that non- static variables cannot be 
		//accessed inside a static method
//		System.out.println(nonStaticString);
		
		//We can access only static members inside a static method
		System.out.println(staticString);
	}
	
	public static void main(String[] args) {
		
		//Calling static method using the class without instantiating it
		StaticMethods.staticMethod();
		
		StaticMethods obj = new StaticMethods();
		obj.nonStaticMethod();
		
		//We can also call static methods using the object of the class
		obj.staticMethod();
		//This is giving me warning to call the static method from the Class
		//only as it is the property of the class rather than the object
	}
}
