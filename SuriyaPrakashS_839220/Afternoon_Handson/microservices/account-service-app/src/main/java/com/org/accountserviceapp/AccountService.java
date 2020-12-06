package com.org.accountserviceapp;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
	public Account fetchAccountById(long accNo) {
		Account account= new Account();
		account.setAccNumber(accNo);
		account.setAmount(new Double(Math.random()*accNo).intValue());
		return account;
	}

}
