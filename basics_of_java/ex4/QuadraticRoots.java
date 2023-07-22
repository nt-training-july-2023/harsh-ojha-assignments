package com.basics_of_java.ex4;

import java.util.Scanner;

public class QuadraticRoots {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Format- ax2+bx+c=0");
		System.out.println("Enter value of a: ");
		float a= scanner.nextFloat();
		
		System.out.println("Enter value of b: ");
		float b=scanner.nextFloat();
		
		System.out.println("Enter value of c: ");
		float c=scanner.nextFloat();
		
		double d = (b*b-(4*a*c));
		System.out.println("D: "+d);
		
		if(d<0) {
			System.out.println("D<0, No roots");
		}
		else {
			double r1=(((-1)*b)+ (Math.sqrt(d)))/(2*a);
			double r2=(((-1)*b)- (Math.sqrt(d)))/(2*a);
			
			System.out.println("Root1: "+r1);
			System.out.println("Root2: "+r2);
		}
	}
}
