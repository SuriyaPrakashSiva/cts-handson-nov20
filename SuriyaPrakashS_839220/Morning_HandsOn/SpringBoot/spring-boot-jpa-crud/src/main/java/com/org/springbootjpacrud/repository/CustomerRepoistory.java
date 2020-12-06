package com.org.springbootjpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootjpacrud.entity.Customer;

public interface CustomerRepoistory extends JpaRepository<Customer, Integer> {

}
