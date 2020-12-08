package com.org.employeeserviceclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.employeeserviceclient.entity.Employee;
import com.org.employeeserviceclient.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeContoller {
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.fectchAllEmployee();
	}
	
	@GetMapping(value="{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return service.fetchEmployeeById(id);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployees(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PutMapping(value = "{id}/{salary}")
	public Employee updateEmployee(@PathVariable("id") int id,@PathVariable("salary") double salary) {
		return service.updateEmployeeOnSalary(id, salary);
	}
	
	@DeleteMapping(value = "{id}")
	public List<Employee> deleteEmployee(@PathVariable int id){
		return service.deleteEmployee(id);
	}

}
