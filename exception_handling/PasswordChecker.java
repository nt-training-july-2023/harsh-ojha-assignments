package com.exception_handling;

import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
	public InvalidPasswordException(String message) {
		super(message);
	}
}

public class PasswordChecker {
	
	public static void main(String[] args) throws InvalidPasswordException {
		Scanner scanner = new Scanner(System.in);
		String newLine = System.getProperty("line.separator");
		
		System.out.println("Enter Password: ");
		String password = scanner.nextLine();
	
		
		if(password.length()<8) {
			throw new InvalidPasswordException("Password must have minimum 8 characters");
		}
		
		boolean hasNumber = false;
		boolean hasAlpha = false;
		
		for(int i =0; i<password.length();i++) {
			char character = password.charAt(i);
			if(Character.isAlphabetic(character)) {
				hasAlpha = true;
			} else if(Character.isDigit(character)) {
				hasNumber =true;
			}
		}
		
		if(hasAlpha && hasNumber) {
			System.out.println("Password Set Successfully");
		} else {
			
			throw new InvalidPasswordException("Password must have 8 characters"
					+newLine
			+"Password must be combination of Alphabets and Numbers");
		}
	
		
		
		
	}
}
