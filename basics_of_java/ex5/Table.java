package com.basics_of_java.ex5;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter integer :");
		int n = scanner.nextInt();
		
		for(int i=1;i<11;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
