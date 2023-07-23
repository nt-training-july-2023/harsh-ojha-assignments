package com.OOPs.inheritance;


class First{
	void firstDetails(){
		System.out.println("I am the first class");
	}
}

//Second class extending first class
class Second extends First{
	void secondDetails() {
		System.out.println("I am the second class");
	}
}

//Third class extending second class
class Third extends Second{
	void thirdDetails() {
		System.out.println("I am the Thrid class");
	}
}

//child class extending third class
//This is called Multi Level inheritance
public class MultiLevelInheritance extends Third{
	void finalDetails() {
		System.out.println("I am the child class");
		
	}
	
	public static void main(String[] args) {
		MultiLevelInheritance obj = new MultiLevelInheritance();
		
		//The child class object can use every method and attributes
		//of each parent level classes
		obj.firstDetails();
		obj.secondDetails();
		obj.thirdDetails();
		obj.finalDetails();
		
	}
}
