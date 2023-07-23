package com.OOPs.finalQuestions;

public class FinalVariable {
	
	//this variable  is declared final so that it can not be modified after
	//being initialized.
	//Mainly, final variables are used for constant values, as we dont need to
	//change them
	static final String baseURL = "http://localhost/api";

	//We can only create the getter method for the final variables
	//We cannot make a setter method as the variable is final
	public String getBaseURL() {
		return baseURL;
	}
	
	public static void main(String[] args) {
		System.out.println(FinalVariable.baseURL);
		FinalVariable obj= new FinalVariable();
		
		//Shows error as the variable is final and cannot be reassigned
//		FinalVariable.baseURL="Hello";
//		obj.baseURL = "Hello";
		
		
		System.out.println(obj.getBaseURL());
	}
	
}
