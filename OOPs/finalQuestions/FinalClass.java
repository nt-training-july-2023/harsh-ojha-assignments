package com.OOPs.finalQuestions;

//Declaring a final class
//A final class can not be Inherited
public final class FinalClass {
	//There are few advantages final classes:
	
	// final class can not inherited so that its methods can not be overriden
	//Hence they are more secure
	
	//final class has better performance as the java compiler knows that the
	//class is declared final and it has no other method implementations
	
	int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public FinalClass() {
		System.out.println("An object of final class is created");
	}
	
	void details(){
		System.out.println("I am a final class");
	}
	
	public static void main(String[] args) {
		//Instantiating the final class
		FinalClass obj = new FinalClass();
		
		obj.details();
		
		//setting the variable a
		obj.setA(10);
		System.out.println(obj.getA());
	}
}

//class  Demo extends FinalClass{
//
//}
//Showing error that Class Demo cannot be subclass of a final class

