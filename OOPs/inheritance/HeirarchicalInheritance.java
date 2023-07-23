package com.OOPs.inheritance;

class MasterClass {
	void details() {
		System.out.println("I am from parent class");
	}
}

//child1 extending parent class
class Child1 extends MasterClass{
	
}

//child2 class also extending parent class
class Child2 extends MasterClass{
	
}

//another child class extending the same parent class
public class HeirarchicalInheritance extends MasterClass{
	//this is called hierarchical inheritance
	//Each child class can access the methods and attributes of the parent class
	
	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		Child2 obj2 = new Child2();
		HeirarchicalInheritance obj3 = new HeirarchicalInheritance();
		
		obj1.details();
		obj2.details();
		obj3.details();
		
	}

}
