package com.lambda_io.lambda;

import java.util.Scanner;

@FunctionalInterface
interface ReplaceVowels{
	String replace(String raw);
	
}

public class LambdaStringReplacement {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String inputString = scanner.nextLine();
		
		ReplaceVowels obj = (input)->
			input.replaceAll("[aeiouAEIOU]", "#");
		
		System.out.println("Original String: "+inputString);
		System.out.println("Result String: " +obj.replace(inputString));
		
		scanner.close();
		
	}
}
	
