package com.org.employeeserviceclient.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.employeeserviceclient.entity.Employee;
import com.org.employeeserviceclient.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	

	
	public List<Employee> fectchAllEmployee(){
		List<Employee> list=new ArrayList<Employee>();
		list=empRepo.findAll();
		return list;
	}
	
	public Employee fetchEmployeeById(int id) {
		
		Optional<Employee> option= empRepo.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;
	}
	
	public Employee addEmployee(Employee emp) {
		Employee employee=empRepo.save(emp);
		return employee;
	}
	
	
	
	public Employee updateEmployeeOnSalary(int id,double salary) {
		Employee employee=fetchEmployeeById(id);
		if(employee!=null) {
			employee.setSalary(salary);
			return empRepo.save(employee);
		}
		else
			return null;
	}
	
	public List<Employee> deleteEmployee(int id){
		empRepo.deleteById(id);
		List<Employee> list=fectchAllEmployee();
		return list;
	}

}
