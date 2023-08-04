package com.spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Employee> fetchAll() {
		return empRepository.findAll();
	}

	@Override
	public Employee getById(Integer id) {
		return empRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Not Found"));
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee employee = empRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Not Found"));
		empRepository.delete(employee);
		
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}

}
