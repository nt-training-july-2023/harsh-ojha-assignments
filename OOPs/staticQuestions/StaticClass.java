package com.OOPs.staticQuestions;

class OuterClass{
		
		//declaring a non-static string
		String name;
		
		//declaring a static string
		static String college="IET";
		
		void name() {
			System.out.println(name);
		}
		
		static void college() {
			System.out.println(college);
		}
		
		//This is an static inner class. It can be instantiated without
		//Instantiating the Outer Class
		static class InnerClass{
			void sayName() {
				
				//It cannot call non - static members or methods
//				System.out.println(name);
//				name();
				
				//It can only access static members of the outer class
				college();
				System.out.println("I am static inner class method ");
				
			}
		}
	}


public class StaticClass {
	public static void main(String[] args) {
		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		obj.sayName();
	}
}