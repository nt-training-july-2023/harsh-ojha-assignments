package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ThresholdMap {
	public static HashMap<Integer, String> hashMap = new HashMap<>();
	
	public static void addEntry(int key,String value) {
		hashMap.put(key, value);
	}
	
	public static void clearIfThreshold(int threshold){
		if(hashMap.size()>=threshold) {
			System.out.println("Threshold Reached.");
			for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
				System.out.println(entry.getKey()+"->"+entry.getValue());
			} 
			System.out.println("Map Cleared.");
			hashMap.clear();
		} else {
			System.out.println("Threshold not reached.");
		}
	}
	
	public static void main(String[] args) {
		addEntry(1,"Harsh");
		addEntry(2,"Garv");
		addEntry(3,"Raj");
		addEntry(4,"Sam");
		
		clearIfThreshold(5);
		
		addEntry(5, "Ram");
		clearIfThreshold(5);
		System.out.println(hashMap);
	}
}
