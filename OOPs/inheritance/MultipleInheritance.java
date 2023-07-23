package com.OOPs.inheritance;

//Multiple inheritance is not supported in Java due to 
//method ambiguity , But we can achieve multiple inheritance
//using interfaces..

//that is, A class or an interface can implement or extend multiple interfaces

interface A{
	
	void greet();
	
}

interface B{
	void sayHello();
	
}

//Here we can see that interface C have extended or inherited both the interfaces
//A and B. Hence, supporting multiple inheritance
interface C extends A,B{
	void Thank();
}

//Here a concrete class can also implement multiple interfaces
//supporting multiple inheritance.
//the only condition is that it should implement every method present in the 
//Both of the interfaces
public class MultipleInheritance implements A,B{
	
	//Abstract classes can also implement or inherit multiple interfaces..

	@Override
	public void sayHello() {
		System.out.println("Hello");
		
	}

	@Override
	public void greet() {
		System.out.println("Good Morning");
		
	}
	
}
