package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class KeyValueSeparator {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"Hello");
		hashMap.put(2,"Hi");
		hashMap.put(12,"Good Morning");
		hashMap.put(10,"Bye");
		
		Set<Integer> keySet = hashMap.keySet();
		System.out.println("Keys: "+keySet);
		
		Collection<String> valueCollection = hashMap.values();
		System.out.println(valueCollection);

		
	}
}
