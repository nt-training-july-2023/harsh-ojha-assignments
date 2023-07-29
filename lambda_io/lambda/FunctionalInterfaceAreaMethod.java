package com.lambda_io.lambda;

import java.util.Scanner;

@FunctionalInterface
interface AreaCalculator{
	abstract void calculateArea();
}

public class FunctionalInterfaceAreaMethod {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		AreaCalculator square = () ->{
			
			System.out.println("Enter Side of square");
			float side = scanner.nextFloat();
			System.out.print("Area of Square is: ");
			System.out.println(side*side); 
		};
		
		AreaCalculator cube = () ->{
			
			System.out.println("Enter Side of cube");
			float side = scanner.nextFloat();
			System.out.print("Area of Square is: ");
			System.out.println(6*side*side); 
		};
		
		AreaCalculator rectangle = () ->{
			
			System.out.println("Enter length of rectangle");
			float lenght = scanner.nextFloat();
			
			System.out.println("Enter width of rectangle");
			float width = scanner.nextFloat();
			
			System.out.print("Area of Rectangle is: ");
			System.out.println(width*lenght);
		};
		
		AreaCalculator cylinder = () ->{
			
			System.out.println("Enter height of cylinder");
			float height = scanner.nextFloat();
			
			System.out.println("Enter radius of cylinder");
			float radius = scanner.nextFloat();
			
			System.out.print("Area of Cylinder is: ");
			System.out.println(2*Math.PI*radius*(radius+height));
		};
	
		
		AreaCalculator sphere = () ->{
			System.out.println("Enter radius of sphere");
			float radius = scanner.nextFloat();
			
			System.out.print("Area of Rectangle is: ");
			System.out.println(4*Math.PI*radius*radius);
		};
		
		square.calculateArea();
		cube.calculateArea();
		cylinder.calculateArea();
		sphere.calculateArea();
		rectangle.calculateArea();
		
		scanner.close();
		
		
	}
	
}
