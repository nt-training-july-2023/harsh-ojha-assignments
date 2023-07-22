package com.basics_of_java.ex7;


public class DifferenceBetweenEqualsAndOperator {
	public static void main(String[] args) {
		String str1 = "Harsh";
		String str2 = "Harsh";
		
		//equals method compares the value stored inside the string
		//that is , the actual string, in this case "Harsh"\
		//hence this will return true
		System.out.println(str1.equals(str2));
		
		//== operator compares the references of the variable
		//whenever a new string is initialized with the assignment operator
		//then it is stored in the string pool, when another string is declared
		//then the string pool is checked , if the value is already stored in the pool
		//then the new variable will also reference the same object 
		
		//Therefore in this case, this method will also return true
		System.out.println(str1==str2);
		
		//Now we are initializing string with the "new" keyword,
		//telling java explicitly to create the string not in the string pool
		//but in the heap memory where all the objects are stored
		
		String string1 = new String("Ojha");
		String string2 = new String("Ojha");
		
		//now this time, the equals method will return true
		//because it compares the value of the two string
		System.out.println(string1.equals(string2));
		
		//but the == operator will return false because it compares the 
		//references of the objects, which in this case are not the same
		//because strings are initialized using the new keyword
		System.out.println(string1==string2);
		
	}
}
