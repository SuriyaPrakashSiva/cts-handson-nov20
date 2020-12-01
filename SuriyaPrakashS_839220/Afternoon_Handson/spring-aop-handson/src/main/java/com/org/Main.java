package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service=(EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		service.getEmployee(1);
		service.getEmployees(1, 50000.0);
		service.updateEmployee(1, "Arthur");
	}

}
