package com.org.walletserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {
	
	@Autowired
	private RestTemplate rest;
	public Wallet addAmountToWallet(long accNo) {
		Wallet wallet = new Wallet();
		AccountStructure account=rest.getForObject("http://ACCOUNTSERVICEAPP/account/"+accNo,AccountStructure.class);
		wallet.setBalance(wallet.getBalance() + (account.getAmount() * 0.5));
		return wallet;
	}
}
