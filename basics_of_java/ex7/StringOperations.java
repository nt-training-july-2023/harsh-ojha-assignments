package com.basics_of_java.ex7;

public class StringOperations {
	public static void main(String[] args) {
		String string = "Hello Harsh ";
		
		// this method return the length of the string
		//i.e. the number of characters including white spaces
		int  n = string.length();
		System.out.println(n);
		
		String string2 = "How are You? How are You?";
		
		//this method concats the two strings
		System.out.println(string.concat(string2));

		//+ operator on string also concats two strings
		System.out.println(string+string2);
		
		//charAt method returns the character present at that index
		System.out.println(string.charAt(3));
		
		// this method returns a boolean if the string starts with 
		//the character of string given in the argument
		System.out.println(string.startsWith("Hel"));
		System.out.println(string.startsWith("Hep"));
		
		//this method return the index of first matching character or string
		System.out.println(string.indexOf("H"));
		
		//this method replaces all the character or substring of the string
		System.out.println(string.replace("H", "B"));
		System.out.println(string2.replace("are", "is"));
	}
}
