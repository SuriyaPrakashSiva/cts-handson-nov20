package com.org.walletserviceapp.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.walletserviceapp.model.AccountStructure;

//fiegn Client
@FeignClient("http://ACCOUNTSERVICEAPP")
public interface WalletUtil {
	@GetMapping("/account/{accNo}")
	public AccountStructure fetchAccountById(@PathVariable long accNo);

}
