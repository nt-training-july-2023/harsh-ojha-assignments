package com.multiThreading;

import java.util.ArrayList;
import java.util.Scanner;

public class MutiTasking {
	public static void main(String[] args) {
		System.out.println("Enter an Integer to perform Tasks");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			list.add(i);
		}
		
		Thread reverseList = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ArrayList<Integer> reversed = new ArrayList<>();
				for(int i=n-1;i>=0;i--) {
					reversed.add(list.get(i));
				}
				System.out.println("Reversed List: "+reversed);
			}
		});
		
		Thread fibonacci = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int a = 0;
				int b = 1;
				System.out.print("Fibonacci Sequence: ");
				for (int i =0;i<n;i++) {
					int c=a+b;
					System.out.print(c+" ");
					a=b;
					b=c;
				}
			}
		});
		
		Thread show = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Numbers from 1 to "+n);
				for (int i = 1; i <= n; i++) {
					System.out.print(i+" ");
				}
			}
		});
		
		Thread sum = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Sum of numbers upto "+n+" is: "+(n*(n+1)/2));
			}
		});
		
		sum.start();
		reverseList.start();
		show.start();
		fibonacci.start();
		
		
	}
	
}
