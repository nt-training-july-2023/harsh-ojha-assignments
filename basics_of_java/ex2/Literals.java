package com.basics_of_java.ex2;

public class Literals {
	public static void main(String[] args) {
		float a=56;
		float b = 23f;
		float f = 23.43f;
//		float c=83.33d; error
		double d=34.534f;
		double g=34f;
		double e=34.534;
		System.out.println(g);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(e);
		
		
		d=32.543f;
		System.out.println(d);
		
		// on printing floats it adds .0 on integer but print floating numbers 
		// with literal 'f' as it is.
		// In case of printing double, when there is no literal given or there is 'd' 
		// literal then it prints the double value as it is.
		//If there is integer assigned to the double then it will just add .0 and
		// when 'f' literal is given with the double value then multiple digits after 
		//last decimal place are added randomly.
	}
}
