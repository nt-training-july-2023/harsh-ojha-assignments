package com.collections.comparable_comparator;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Harsh",22,18000);
		Employee e2 = new Employee("Rohit",24 , 22000);
		Employee e3 = new Employee("Nabi", 26, 20000);
		Employee e4 = new Employee("Madhur",22, 18000);
		
		System.out.println(e1.compareTo(e3));
		System.out.println(e2.compareTo(e1));
		System.out.println(e4.compareTo(e1));
		
		List<Employee> list = new ArrayList<>();
		list.add(e4);
		list.add(e3);
		list.add(e1);
		list.add(e2);
		
		System.out.println(list);
		list.sort(new EmpAgeComparator());
		System.out.println(list);	
		}
}
