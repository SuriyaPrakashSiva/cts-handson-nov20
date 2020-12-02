package com.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		service.getEmployee(1);
		service.getAllEmployee(2,"Arthur");
		service.loadedEmployee(7, 35000);
		service.updateEmployee(123);
	}

}