package com.collections.map;

import java.util.HashMap;
import java.util.TreeMap;

public class CRUDonMaps {
	
	static HashMap<Integer, String> hashMap = new HashMap<>();
	static TreeMap<Integer, String> treeMap = new TreeMap<>();
	
	public static void main(String[] args) {
		hashMap.put(01,"India");
		hashMap.put(02,"China");
		hashMap.put(06,"Russia");
		hashMap.put(07,"USA");
		
		System.out.println(hashMap);
		System.out.println(hashMap.remove(07));
		System.out.println(hashMap.remove(07));
		System.out.println(hashMap.replace(02, "Japan"));
		
		
		treeMap.put(2001,"2001");
		treeMap.put(1997,"1997");
		treeMap.put(1947,"1947");
		treeMap.put(1980,"1980");

		System.out.println(treeMap);
		System.out.println(treeMap.remove(1947));
		System.out.println(treeMap.remove(1947));
		System.out.println(treeMap.replace(2001, "Birthday"));
	}
}
