package com.org.springbootjpacrud.exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException() {
		super("Customer Not Found!");
		// TODO Auto-generated constructor stub
	}


	public CustomerNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

}
