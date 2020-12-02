package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public void store() {
		System.out.println("**** store() inside EmployeeService ****");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ****");
	}
	
	public void getEmployee(int id) {
		System.out.println("***getEmployee() inside EmployeeService***");
	}
	public void getAllEmployee(int id,String name) {
		System.out.println("***getAllEmployee() inside EmployeeService***");
	}
	public void loadedEmployee(int id,double salary) {
		System.out.println("***loadedEmployee() inside EmployeeService***");
	}
	public String updateEmployee(int id) {
		System.out.println("***updateEmployee() inside EmployeeService***" );
		return "Employee Updated";
	}
}
