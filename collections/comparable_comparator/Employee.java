package com.collections.comparable_comparator;

public class Employee implements Comparable<Employee>{

	private String name;
	private int age;
	private float salary;
	
	public Employee(String name,int age, float salary) {
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		if(employee.salary>this.salary) {
			return -1;
		} else if(employee.salary == this.salary) {
			return 0;
		} else {
			return 1;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
