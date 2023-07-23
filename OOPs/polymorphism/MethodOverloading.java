package com.OOPs.polymorphism;

public class MethodOverloading {
	
	//declaring a method which take two integer parameters and prints their sum 
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	//Now making another method with the same name but it takes different parameters.
	//It takes two String and prints the concated string
	public void add(String a , String b) {
		System.out.println(a+b);
	}
	
	//This is called MethodOverloading or Compile Time Polymorphism 
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		//Method with same name performing different operations
		obj.add(6,14);
		obj.add("Hello ","World");
	}
	
}
