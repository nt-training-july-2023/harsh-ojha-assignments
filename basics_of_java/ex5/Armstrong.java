package com.basics_of_java.ex5;

public class Armstrong {
	public static void main(String[] args) {
		int n =1634;
		int temp = n;
		int digits=0;
		while(temp>0) {
			temp=temp/10;
			digits ++;
		} 
		temp=n;
		
		int sum=0;
		while(temp>0) {
			int let=temp%10;
			temp = temp/10;
			int pov=1;
			int i=0;
			while(i<digits) {
				pov = pov*let;
				i++;
			}
			sum=sum+pov;
		}
		if (sum==n) {
			System.out.println("True");
		} else{System.out.println("False");}
	}

	}
