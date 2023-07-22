package com.basics_of_java.ex6;

import java.util.Arrays;

public class MatrixAdd {
	public static void main(String[] args) {
		
		int[][] arr1= {
				{1,2,3},
				{4,5,6}
				};
		
		int [][] arr2= {
				{1,2,3},
				{4,5,6}
		};
		
		int[][] sum = new int[2][3];
		
		for(int i =0; i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int[] ar:sum) {
			System.out.println(Arrays.toString(ar));
		}
	}
}
