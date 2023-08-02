package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTasks {
	
	public static HashMap<Integer, String> empDetailsHashMap = new HashMap<>();
	
	public static void addElement(Integer empId, String empName) {
		empDetailsHashMap.put(empId, empName);
	}
	
	
	public static void main(String[] args) {
		addElement(101, "Harsh Ojha");
		addElement(102, "Rohit");
		addElement(104, "Nabi");
		addElement(103, "Madhur");
		addElement(110, "Madhur");
		addElement(112, "Diksha");
		System.out.println("Emp List: "+ empDetailsHashMap);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name to search:");
		String name = scanner.nextLine();
		scanner.close();
		
		for (Map.Entry<Integer, String> entry : empDetailsHashMap.entrySet()) {
			if(entry.getValue().equals(name)) {
				System.out.print(name + " has the EmpId: ");
				System.out.println(entry.getKey());
			}
		}
		
	}
}
