package com.OOPs.finalQuestions;

public class FinalBlankVariable {
	//Declaring a final variable but not assigning a value
	final int first;
	final int second;
	
	//Initializing this variable while declaring
	final int third =100;
	
	//Initializing first final variable using constructor
	public FinalBlankVariable(int value) {
		first = value;
	}
	
	//Initializing using Initializing block
	{
		System.out.println("Initializing Second Final Variable");
		second = 50;
	}
	
	public static void main(String[] args) {
		
		FinalBlankVariable obj = new FinalBlankVariable(12);
		System.out.println(obj.first);
		System.out.println(obj.second);
		System.out.println(obj.third);
		
	}
}
