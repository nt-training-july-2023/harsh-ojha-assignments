package com.OOPs;

//declaring an abstract class Animal 
//An abstract class can not be instantiated
abstract class Animal{
	//We provided the body for existence method
	void existence() {
		System.out.println("Animals live on earth");
	}
	
	//we initialized the name of animal variable
	String nameOfAnimal;
	
	//getter
	String getNameOfAnimal() {
		return nameOfAnimal;
	}

	//setter
	void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	//We have not provided the body of this method
	//the concrete class extending this abstract class has to provide its implementation
	abstract void movementStyle();
}

//This is concrete class which extends the abstract class
// it has to implement the abstract methods of the abstract class
//A concrete class can be instantiated
public class AbstractClass extends Animal{

	//Overriden method of the abstract class
	@Override
	void movementStyle() {
		System.out.println("Humans can walk/run");

		
	}
	
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		
		
		System.out.println(obj.nameOfAnimal);
		
		obj.setNameOfAnimal("Humans");
		System.out.println(obj.getNameOfAnimal());
		
		obj.existence();
		obj.movementStyle();
		
	}

}
