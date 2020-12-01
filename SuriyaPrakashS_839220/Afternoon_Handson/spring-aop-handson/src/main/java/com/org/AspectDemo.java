package com.org;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class AspectDemo {
	@After("execution(public * com.org.EmployeeService.*(..))")
	public void log() {
		System.out.println("---log method is called---");
	}
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void log1() {
		System.out.println("---int parameter is executed---");
	}
	@After("execution(public * com.org.EmployeeService.*(int,*))")
	public void log2() {
		System.out.println("---int and any  parameter is executed---");
	}
	@After("execution(public * com.org.EmployeeService.*(int,String))")
	public void log3() {
		System.out.println("---int and String  parameter is executed---");
	}
	@After("execution(public String com.org.EmployeeService.*(..))")
	public void log4() {
		System.out.println("---String parameter is executed---");
	}

}
