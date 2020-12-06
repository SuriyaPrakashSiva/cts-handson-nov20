package com.org.accountserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountRest {
	@Autowired
	private AccountService service;
	
	@GetMapping("{accNo}")
	public Account fetchAccountByID(@PathVariable long accNo) {
		return service.fetchAccountById(accNo);
	}

}
