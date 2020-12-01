package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public void store() {
		System.out.println("***store() inside EmployeeService***");
	}
	public void delete() {
		System.out.println("***delete() inside EmployeeService***");
	}
	
	public void getEmployee(int num) {
		System.out.println("***getEmployee(int) inside EmployeeService***");
	}
	public String getEmployees(int num,Double salary) {
		System.out.println("***getEmployees(int,any) inside EmployeeService***");
		return "OUTPUT";
	}
	public void updateEmployee(int id, String name) {
		System.out.println("***updateEmployee(int,String) inside EmployeeService***");
	}
	

	

}
