package com.org.springbootjpacrud.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springbootjpacrud.entity.Customer;
import com.org.springbootjpacrud.repository.CustomerRepoistory;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepoistory dao;
	
	public List<Customer> fetchAllCustomer(){
		return dao.findAll();
	}
	
	public Customer addCustomer(Customer customer) {
		Customer addedCustomer=dao.save(customer);
		return addedCustomer;
	}
	
	public Customer fetchCustomer(int id) {
		Optional<Customer> option= dao.findById(id);
		return option.orElse(null);
	}
	
	public Customer updateCustomer(int id, LocalDate dob) {
		Customer customer=fetchCustomer(id);
		if(customer!=null) {
			customer.setCustomerDob(dob);
			return dao.save(customer);
		}
		else
			return null;
	}
	
	public String deleteCustomer(int id) {
		dao.deleteById(id);
		return "Deleted Customer";
	}
	
	

}
