package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ListTasks {
	public static void main(String[] args) {
		Random random = new Random();
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i<20;i++) {
			int temp = random.nextInt(201);
			list.add(temp);
		}
		
		System.out.println("List generated:"+"\n"+ list);
		Collections.reverse(list);
		System.out.println("Reversed:"+"\n"+list);
		
		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			if(temp>50) {
				list.set(i, temp+5);
			}
		}
		
		System.out.println("Updated List after adding 5 to elements >50:"+"\n"+list);
		
		System.out.println("Elements less than 60:");
		for (Integer integer : list) {
			if (integer<60) {
				System.out.print(integer+" ");
			}
		}
	}
}
