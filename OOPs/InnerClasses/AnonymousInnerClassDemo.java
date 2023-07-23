package com.OOPs.InnerClasses;

//Creating an anonymous inner class
abstract class AnonymousInnerClass{
	abstract void anonymousClassMethod();
}

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		
		//Declaring and Instantiating anonymous class simultaneously
		AnonymousInnerClass obj = new AnonymousInnerClass() {
			
			//Overriding or implementing the anonymous class method while instantiating
			@Override
			void anonymousClassMethod() {
				System.out.println("Hello");
				
			}
		};
		//Calling the method
		obj.anonymousClassMethod();
	}
}
