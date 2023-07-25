package com.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidDimensionException extends RuntimeException{
	public InvalidDimensionException(String message) {
		super(message);
	}
}

public class RectangleArea {
	
	Scanner scanner = new Scanner(System.in);
	
	float[] getSides() throws InvalidDimensionException{
		float[] arr = new float[2];
		
		try {
			System.out.println("Enter length: ");
			arr[0] = scanner.nextFloat();
			
			System.out.println("Enter width: ");
			arr[1] = scanner.nextFloat();
			
			if(arr[0]<=0 || arr[1]<=0) {
				throw new InvalidDimensionException("Dimensions cannot be negative or zero");
			}
			return arr;
		}
		catch (InputMismatchException e) {
			throw new InvalidDimensionException("Enter Correct Dimensions");
		}
	}
	
	void calculateArea() {
		float[] arr = getSides();
		
		System.out.println("Area of Rectangle is: "+ (arr[0]*arr[1]));

	}
	
	public static void main(String[] args) {
		RectangleArea obj = new RectangleArea();
		obj.calculateArea();	}
}
