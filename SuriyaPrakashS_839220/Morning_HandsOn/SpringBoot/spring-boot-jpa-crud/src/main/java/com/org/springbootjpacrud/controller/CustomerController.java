package com.org.springbootjpacrud.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootjpacrud.entity.Customer;
import com.org.springbootjpacrud.exception.CustomerNotFoundException;
import com.org.springbootjpacrud.service.CustomerService;
import com.org.springbootjpacrud.util.ResponseMessage;
@RequestMapping("customer")
@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping
	public ResponseEntity<Object> fetchAllCustomerAPI(){
		ResponseEntity<Object> response = null;
		try {
			response=ResponseEntity.status(200).body(service.fetchAllCustomer());
		}catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatus(404);
			error.setDescription(e.getMessage());
			response=ResponseEntity.status(404).body(error);
		}
		return response;
	}
	
	@GetMapping("{customerID}")
	public ResponseEntity<Object> fetchCustomerByIdAPI(@PathVariable("customerID") int customerID) {
		ResponseEntity<Object> response=null;
		try {
			Customer customer=service.fetchCustomer(customerID);
			response=ResponseEntity.status(200).body(customer);
		}catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatus(404);
			error.setDescription(e.getMessage());
			response=ResponseEntity.status(404).body(error);
		}
		return response;

	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer addCustomerAPI(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@PutMapping("{customerID}/{customerDOB}")
	public ResponseEntity<Object> updateCustomerAPI(@PathVariable("customerID") int customerID,@PathVariable("customerDOB") String customerDOB){
		ResponseEntity<Object> response = null;
		try {
			Customer customer=service.updateCustomer(customerID, LocalDate.parse(customerDOB));
			response=ResponseEntity.status(200).body(customer);
		}catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatus(404);
			error.setDescription(e.getMessage());
			response=ResponseEntity.status(404).body(error);
		}
		return response;
	}
	
	@DeleteMapping("{customerID}")
	public ResponseEntity<Object> deleteCustomerAPI(@PathVariable("customerID") int customerID) {
		ResponseEntity<Object> response = null;
		try {
			String msg=service.deleteCustomer(customerID);
			response=ResponseEntity.status(200).body(msg);
			
		}catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatus(404);
			error.setDescription(e.getMessage());
			response=ResponseEntity.status(404).body(error);
		}
		return response;
	}
}
