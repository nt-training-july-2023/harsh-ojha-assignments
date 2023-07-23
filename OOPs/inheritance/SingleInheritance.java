package com.OOPs.inheritance;

class Parent{
	void parentDetails(){
		System.out.println("I am parent class method");
	}
}

//Single Inheritance, Extending a single class
public class SingleInheritance extends Parent {
	void childDetails() {
		System.out.println("I am child class method");
	}
	
	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		
		obj.childDetails();
		obj.parentDetails();
	}
}
