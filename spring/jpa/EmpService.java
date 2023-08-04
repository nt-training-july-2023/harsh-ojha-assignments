package com.spring.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

public interface EmpService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> fetchAll();
	Employee getById(Integer id);
	Employee updateEmployee(Employee emp);
	void deleteEmployee(Integer id);
	
	
}
