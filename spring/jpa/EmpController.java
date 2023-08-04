package com.spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping
	List<Employee> getAllEmployee(){
		return empService.fetchAll();
	}
	
	@GetMapping("/{id}")
	Employee getEmpById(@PathVariable Integer id) {
		try {
			
			return empService.getById(id);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
	@PostMapping
	 List<Employee> saveEmployee(@RequestBody List<Employee> list){
		for (Employee employee : list) {
			empService.saveEmployee(employee);
		}
		return list;
	}
	
	@PutMapping
	Employee updateEmployee (@RequestBody Employee emp) {
		return empService.updateEmployee(emp);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<?> deleteEmployee(@PathVariable Integer id){
		try {
			empService.deleteEmployee(id);
			return ResponseEntity.ok("Deleted Succesfully");			
		} catch(IllegalArgumentException e){
			return ResponseEntity.ok("No emp found with id: " +id);
		}
	}
}
