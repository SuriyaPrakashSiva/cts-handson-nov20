package com.org.walletserviceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.walletserviceapp.model.AccountStructure;
import com.org.walletserviceapp.model.Wallet;
import com.org.walletserviceapp.util.WalletUtil;

@Service
public class WalletService {
	
	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private WalletUtil util;
	
	public Wallet addAmountToWallet(long accNo) {
		Wallet wallet = new Wallet();
		wallet.setName("Arthur");
		//AccountStructure account=rest.getForObject("http://ACCOUNTSERVICEAPP/account/"+accNo,AccountStructure.class);
		AccountStructure account=util.fetchAccountById(accNo);
		wallet.setBalance(wallet.getBalance() + (account.getAmount() * 0.5));
		return wallet;
	}
}
