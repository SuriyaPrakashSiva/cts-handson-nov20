package com.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceImpl service= (EmployeeServiceImpl)context.getBean("employeeServiceImpl");
		Employee emp=new Employee();
		emp.setId(11);
		emp.setName("Arthur");
		emp.setSalary(30000);
		service.storeEmployee(emp);
	}

}
