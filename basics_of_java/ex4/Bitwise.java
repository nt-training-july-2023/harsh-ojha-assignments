package com.basics_of_java.ex4;

public class Bitwise {
	public static void main(String[] args) {
		int i =1024;
		
		//print 1024/2^3
		System.out.println(i>>3);
		
		//print 1024 * 2^2
		System.out.println(i<<2);
	}
}
