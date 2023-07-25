package com.exception_handling;

import java.util.Scanner;

public class ListOfStrings {
	public static void main(String[] args) {
		String[] list = new String[10];
		
		for(int i = 0 ; i<10;i+=2) {
			list[i] = "You are at index: " + i;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Index to display the String: ");
		int index = scanner.nextInt();
		try {
			if(list[index] != null) {
				
				System.out.println(list[index]);
			} else {
				throw new NullPointerException("Null String at index: "+index);
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException(index);
		}
		
	}
}
