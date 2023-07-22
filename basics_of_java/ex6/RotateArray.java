package com.basics_of_java.ex6;

public class RotateArray {
	public static void main(String arrs[]){
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		rotate(arr,3);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	 static void rotate(int[] arr,int steps){
		reverse(arr,0,arr.length-1-steps);
		reverse(arr,arr.length-steps,arr.length-1);
		reverse(arr,0,arr.length-1);
		
	}
	
	 static void reverse(int[] arr,int start,int end){
		while(start<end){
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;end--;
		}
	}
}
