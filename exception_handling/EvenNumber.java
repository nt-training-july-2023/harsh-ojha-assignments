package com.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEvenNumberException extends RuntimeException{
	public NotEvenNumberException(String message) {
		super(message);
	}
}

public class EvenNumber {
		
	Scanner scanner = new Scanner(System.in);
	
	void isEven() throws NotEvenNumberException{
		
		try {
			System.out.println("Enter an even number: ");
			int number = scanner.nextInt();
			
			
			if(number%2 != 0) {
				throw new NotEvenNumberException(number+" is not an even number");
			}
			System.out.println(number+" is an even number");
			
		} catch (InputMismatchException e) {
			throw new NotEvenNumberException("Enter Correct value");
		}
	}
	
	public static void main(String[] args) {
		EvenNumber obj = new EvenNumber();
		obj.isEven();
	}
	
}
