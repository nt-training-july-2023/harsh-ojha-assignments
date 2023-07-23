package com.OOPs.InnerClasses;

//Outer class
class Outer{
	int x;
	void name() {
		System.out.println("Outer class method");
	}
	
	//Inner Class
	class Inner{
		void name() {
			System.out.println("Inner class method");
		}
		
		//Inner class can access all the methods and variable of the outer class
		void outerName() {
			name();
		}
		int outerX() {
			return x;
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name();
		
		Outer.Inner inner = outer.new Inner();
		inner.name();
		
		outer.x=34;
		System.out.println(inner.outerX());
	}
	
}
