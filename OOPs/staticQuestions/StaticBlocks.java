package com.OOPs.staticQuestions;

//Static blocks are executed only once when the class is loaded into memory
//Not at instantiation of object
public class StaticBlocks {
	//Initializing a static variable
	static String variable;
	
	//1st static block.
	static {
		System.out.println("Static Block 1");
	}
	
	//2nd static block
	//static blocks are used for initialization of the variables or objects that
	//we need after the class is loaded
	static {
		variable = "Declared variable";
	}
	
	//Gets executed after last static block is finished executing
	public static void main(String[] args) {
		System.out.println("Main method called");
		System.out.println(StaticBlocks.variable + " Called inside main method");
	}
	
	//last static block
	static {
		System.out.println("Last static block");
	}
	
	//As I can see in the console that each static block is executed in the order
	//that they are written inside the class
	//and at last . The main method is called
}
