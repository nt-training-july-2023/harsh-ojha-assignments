package com.OOPs.inheritance;

class One{
	void details() {
		System.out.println("I am Class One");
	}
}

//Class two extending class one
//Single-level inheritance
class Two extends One{
	void details() {
		System.out.println("I am Class Two");
	}
}

//class three extending class two
//Multi-Level Inheritance
class Three extends Two{
	void details() {
		System.out.println("I am Class Three");
	}
}

//this class also extends class Two
//Hierarchical Inheritance
public class HybridInheritance extends Two {
	
	//Combinations of multiple Inheritance types is known as Hybrid Inheritance
	
	void details() {
		System.out.println("I am Class HybridInheritance");
	}
	
	public static void main(String[] args) {
		One obj1 = new One();
		Two obj2 = new Two();
		Three obj3 = new Three();
		HybridInheritance obj4 = new HybridInheritance();
		
		obj1.details();
		obj2.details();
		obj3.details();
		obj4.details();
		
	}
}
