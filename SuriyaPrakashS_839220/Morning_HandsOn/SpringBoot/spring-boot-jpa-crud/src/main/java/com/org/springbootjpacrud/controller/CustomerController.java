package com.org.springbootjpacrud.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootjpacrud.entity.Customer;
import com.org.springbootjpacrud.service.CustomerService;
@RequestMapping("customer")
@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping
	public List<Customer> fetchAllCustomerAPI(){
		return(service.fetchAllCustomer());
	}
	
	@GetMapping("{customerID}")
	public Customer fetchCustomerByIdAPI(@PathVariable("customerID") int customerID) {
		return service.fetchCustomer(customerID);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer addCustomerAPI(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@PutMapping("{customerID}/{customerDOB}")
	public Customer updateCustomerAPI(@PathVariable("customerID") int customerID,@PathVariable("customerDOB") String customerDOB){
		return service.updateCustomer(customerID, LocalDate.parse(customerDOB));
	}
	
	@DeleteMapping("{customerID}")
	public String deleteCustomerAPI(@PathVariable("customerID") int customerID) {
		return service.deleteCustomer(customerID);
	}
}
