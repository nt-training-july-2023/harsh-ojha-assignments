package com.exception_handling;

/**
 * This is AreaCalculator class. It calculates area of three shapes-- Rectangle,
 * Triangle and Square. It has 3 methods for 3 shapes
 * 
 * @author Harsh Ojha
 * @version 1.0
 */

public class AreaCalculator {

	/**
	 * This method calculates the area of rectangle, taking sides as input and
	 * returns the area
	 * 
	 * @param a One side of the rectangle
	 * @param b Adjacent side of the rectangle
	 * @return It returns the area (side1 * side2)
	 */
	public double areaOfRectanble(float a, float b) {
		return (a * b);

	}

	/**
	 * This method calculates the area of triangle using the base and height of the
	 * triangle and return the area.
	 * 
	 * @param base   Base of the triangle
	 * @param height height(altitude of the triangle)
	 * @return It returns the area of triangle (0.5*base*height)
	 */
	public double areaOfTriangle(float base, float height) {
		return (0.5 * base * height);

	}

	/**
	 * This method calculates the area of the square using its side and returns it.
	 * 
	 * @param side Length of the side of square
	 * @return It returns the area of the square (side*side)
	 */
	public double areaOfSquare(float side) {
		return side * side;

	}

	public static void main(String[] args) {
		AreaCalculator obj = new AreaCalculator();

		System.out.println(obj.areaOfRectanble(1.2f, 5));
		System.out.println(obj.areaOfSquare(2.5f));
		System.out.println(obj.areaOfTriangle(6, 1.5f));
	}

}
