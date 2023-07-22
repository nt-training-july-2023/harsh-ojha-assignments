package com.basics_of_java.ex5;

import java.util.Scanner;

public class SumNnumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a natural number");
		int n = scanner.nextInt();
		
		int sum = 0;
		for (int i=1;i<=n;i++) {
		sum+=i;
		} 
		System.out.println("Sum:" +sum);
	}
}
