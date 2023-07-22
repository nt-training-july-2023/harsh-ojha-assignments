package com.basics_of_java.ex5;

public class Reverse {
	public static void main(String[] args) {
		int n =12345678;
		int rev=0;
		
		while(n>0) {
			int temp=n%10;
			rev=(rev*10)+temp;
			n=n/10;
		}
		System.out.println(rev);
	}
}
