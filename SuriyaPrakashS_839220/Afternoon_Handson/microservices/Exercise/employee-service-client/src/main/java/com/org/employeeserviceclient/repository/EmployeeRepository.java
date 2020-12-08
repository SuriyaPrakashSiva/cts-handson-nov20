package com.org.employeeserviceclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.employeeserviceclient.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
