package com.basics_of_java.ex7;

import java.util.Arrays;

//In this program, I have explored the java.lang.String class docs
//and found some methods and implemented them
public class StringExplored {
	public static void main(String[] args) {
		String string = "Hello Harsh! How are You?";
		
		//this method converts the string to all lowercase characters
		System.out.println(string.toLowerCase());
		
		//this method returns the last index of the matching character or substring
		System.out.println(string.lastIndexOf("o"));
		
		//this method returns boolean after comparing the first not matching character
		//in the two strings gives +ve if object string is larger and gives
		//-ve if argument string is larger and the value is the difference of the first
		//not matching characters in their uni-code or ASCII values
		System.out.println(string.compareTo("Bello"));
		
		//this method gives the array which has each character of the array
		//in the same index including white spaces
		char[] arr = string.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		//returns true if the substring is contained inside the string
		//else returns false
		System.out.println(string.contains("llo"));
		
		//this method returns the array filled with substrings after dividing
		//or splitting the string from the character or substring given the
		//argument of the split method
		String[] arr2 = string.split(" ");
		System.out.println(Arrays.toString(arr2));
		
	}
}
