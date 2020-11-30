package com.org.exercise;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entry = 0;
		EmployeeService service = new EmployeeService();
		do {
			Scanner read = new Scanner(System.in);
			System.out
					.println("1.Add 2: Display Id 3: Display All 4: Sort by id 5: Sort by dob 6: Sort by name 7: Exit");
			entry = read.nextInt();
			switch (entry) {
			case 1:
				service.addEmployee(new Employee(read.nextInt(), read.next(), read.nextDouble()));
				break;

			case 2:
				System.out.println(service.findEmployeeById(read.nextInt()));
				break;
			case 3:
				System.out.println(service.allEmployees());
				break;
			case 4:
				System.out.println(service.sortedEmployeesById());
				break;
			case 6:
				System.out.println(service.sortedEmployeesByName());
				break;
			case 5:
				System.out.println(service.sortedEmployeesByDOB());
				break;
			}

		} while (entry != 7);

	}

}
