package com.collections.comparable_comparator;

import java.util.Comparator;

public class EmpAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getAge()>o2.getAge()) {
			return 1;
		} else if (o1.getAge()==o2.getAge()) {
			return 0;
		} else {
			return -1;
		}
	}
	
}
