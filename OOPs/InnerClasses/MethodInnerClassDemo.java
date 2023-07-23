package com.OOPs.InnerClasses;


public class MethodInnerClassDemo {

	void outerClassMethod() {
		
		//Declaring a class inside a method of the outer class
		class MethodInnerClass{
			void innerClassMethod(){
				System.out.println("I am method of Method inner class");
			}
		}
		//Method inner class can only be instantiated inside the method only
		MethodInnerClass obj = new MethodInnerClass();
		
		//Calling the method of the inner class
		obj.innerClassMethod();
		
	}
	
	public static void main(String[] args) {
		//Instantiating Outer class
		MethodInnerClassDemo obj = new MethodInnerClassDemo();
		
		//Calling the OuterClass method
		obj.outerClassMethod();
		
	}
}
