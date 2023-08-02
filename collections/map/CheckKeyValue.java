package com.collections.map;

import java.util.HashMap;

public class CheckKeyValue {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(10, 100);
		hashMap.put(11, 121);
		hashMap.put(5, 25);
		hashMap.put(9, 81);
		System.out.println(hashMap);
		//Key Check
		System.out.println(hashMap.containsKey(15));
		System.out.println(hashMap.containsKey(5));
		//Value Check
		System.out.println(hashMap.containsValue(99));
		System.out.println(hashMap.containsValue(81));
		
	}
}
