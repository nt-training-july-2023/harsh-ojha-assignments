package com.basics_of_java.ex4;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Base:-");
		float base = scanner.nextFloat();
		
		System.out.println("Enter Height:-");
		float height = scanner.nextFloat();
	
	
		System.out.println("Area:- " +base *height/2);
	}
}
