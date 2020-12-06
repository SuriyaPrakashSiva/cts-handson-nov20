package com.org.springbootjpacrud.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	private String name;
	private LocalDate dob;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, LocalDate customerDob) {
		super();
		this.customerId = customerId;
		this.name = customerName;
		this.dob = customerDob;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String customerName) {
		this.name = customerName;
	}

	public LocalDate getCustomerDob() {
		return dob;
	}

	public void setCustomerDob(LocalDate customerDob) {
		this.dob = customerDob;
	}

}
