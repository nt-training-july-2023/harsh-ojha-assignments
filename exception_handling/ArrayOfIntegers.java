package com.exception_handling;

import java.util.Scanner;

public class ArrayOfIntegers {

	public static void main(String[] args) {
		int[] list = new int[10];
		
		for(int i = 0 ; i<10;i+=2) {
			list[i] = (i+1);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Index to display the Integer: ");
		int index = scanner.nextInt();
		try {
			if(list[index] != 0) {
				
				System.out.println(list[index]);
			} else {
				throw new NullPointerException("No Integer at index: "+index);
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException(index);
		}
		
	}
}

