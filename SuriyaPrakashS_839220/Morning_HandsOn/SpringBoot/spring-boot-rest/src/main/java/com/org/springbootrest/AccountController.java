package com.org.springbootrest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class AccountController {
/*	@RequestMapping(value="/balance",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance() {
		Account account=new Account();
		account.setAccNumber(111);
		account.setBalance(35000);
		return account;
	}
*/
	@GetMapping(value="{accNo}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance(@PathVariable("accNo") int accNo) {
		System.out.println("Http method is GET");
		Account account = new Account();
		account.setAccNumber(accNo);;
		account.setBalance(new Double(Math.random()*accNo).doubleValue());;
		return account;
	}
	@PostMapping(value="{accNo}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Account postBalance(@PathVariable("accNo") int accNo) {
		System.out.println("Http method is POST");
		Account account = new Account();
		account.setAccNumber(accNo);;
		account.setBalance(new Double(Math.random()*accNo).doubleValue());;
		return account;
	}
	@PutMapping(value="{accNo}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Account putBalance(@PathVariable("accNo") int accNo) {
		System.out.println("Http method is PUT");
		Account account = new Account();
		account.setAccNumber(accNo);;
		account.setBalance(new Double(Math.random()*accNo).doubleValue());;
		return account;
	}
	@DeleteMapping(value="{accNo}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Account deleteBalance(@PathVariable("accNo") int accNo) {
		System.out.println("Http method is DELETE");
		Account account = new Account();
		account.setAccNumber(accNo);;
		account.setBalance(new Double(Math.random()*accNo).doubleValue());;
		return account;
	}
}
