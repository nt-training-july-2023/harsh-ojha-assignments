package com.basics_of_java.ex6;

public class LargestinArray {
	public static void main(String[] args) {
		int[] arr= {24,54654,7,7,8,86,764,534,3};
		int max= arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max= " + max);
	}
}
