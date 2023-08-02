package com.collections.map;

import java.util.HashMap;

public class RemoveEntry {
	static HashMap<String,Integer> hashMap = new HashMap<>();
	
	public static void deleteEntry(String key, Integer value) {
		if(hashMap.remove(key, value)) {
			System.out.println("Entry deleted successfully.");
		} else {
			System.out.println("Entry Not Found");
		}
	}
	
	public static void main(String[] args) {
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Ten", 10);
		hashMap.put("Fifteen", 15);
		
		deleteEntry("One", 2);
		deleteEntry("Twenty", 19);
		deleteEntry("Three", 3);
		
		System.out.println(hashMap);
	}
}
