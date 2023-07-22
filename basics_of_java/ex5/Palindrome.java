package com.basics_of_java.ex5;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		
		int check=n;
		int rev=0;
		
		while(n>0) {
			int temp=n%10;
			rev=(rev*10)+temp;
			n=n/10;
		}
		if(check==rev) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
