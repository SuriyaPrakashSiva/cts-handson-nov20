package com.org.springbootjpacrud.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springbootjpacrud.entity.Customer;
import com.org.springbootjpacrud.exception.CustomerNotFoundException;
import com.org.springbootjpacrud.repository.CustomerRepoistory;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepoistory dao;
	
	public List<Customer> fetchAllCustomer() throws CustomerNotFoundException{
		if(dao.findAll().isEmpty())
			throw new CustomerNotFoundException("No customers found!");
		else
			return dao.findAll();
	}
	
	public Customer addCustomer(Customer customer) {
		Customer addedCustomer=dao.save(customer);
		return addedCustomer;
	}
	
	public Customer fetchCustomer(int id) throws CustomerNotFoundException{
		Optional<Customer> option= dao.findById(id);
		if(option.isPresent()) {
			return option.get();
		}
		else 
			throw new CustomerNotFoundException("Sorry customer with an id "+id+" not found");
	}
	
	public Customer updateCustomer(int id, LocalDate dob) throws CustomerNotFoundException {
		Customer customer=fetchCustomer(id);
		customer.setCustomerDob(dob);
		customer= dao.save(customer);
		return customer;
	}
	
	public String deleteCustomer(int id) throws CustomerNotFoundException{
		Customer customer=fetchCustomer(id);
		dao.deleteById(id);
		return "Delete Succesful";
	}
	
	

}
