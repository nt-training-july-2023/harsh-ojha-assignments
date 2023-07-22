package com.basics_of_java.ex6;

public class AverageofArray {
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1,1,8};
		
		float sum = 0; 
		
		for (int i =0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Average = "+(sum/arr.length));
	}

}
