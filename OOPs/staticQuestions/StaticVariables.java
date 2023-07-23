package com.OOPs.staticQuestions;

public class StaticVariables {
	
	//We have declared this variable as static.
	//That is, this the property of the class, rather than being a property
	//of individual objects. It is common
	private static String className="Python Batch-3";
	
	//This variable is not static, as each student will have different names
	private String studentName;

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		StaticVariables.className = className;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static void main(String[] args) {
		
		//We can access the static variable using class without instantiating the class
		//We can use this because we are using it in the same class
		//As this variable is private , we cannot access it without 
		//getters and setters outside of this class
		System.out.println(StaticVariables.className);
		
		//We can also call the getter and setter for the static variable using class
		System.out.println(StaticVariables.getClassName());
		
		StaticVariables.setClassName("Java Batch-2");
		System.out.println(StaticVariables.className);
		
		//or(Only in this class, as the variable is private)
		StaticVariables.className = "C++ Batch-4";
		System.out.println(StaticVariables.className);
	}
	
}
