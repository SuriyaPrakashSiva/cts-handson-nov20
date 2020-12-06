package com.org.walletserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet")
public class WalletRest {
	@Autowired
	private WalletService service;
	
	@GetMapping("{num}")
	public Wallet addAmountToWallet(@PathVariable long num) {
		return service.addAmountToWallet(num);
	}

}
