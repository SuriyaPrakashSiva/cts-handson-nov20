package com.org.springrestservice;



import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api/account")
public class AccountController {
	@RequestMapping(value="/hello",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String greetings() {
		return "Hello Account Holder!!!";
	}
	
	@RequestMapping(value="/details",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAccount() {
		Account account = new Account(12345,45000.0,"KKBK00898");
		return account;
	}
	
	@RequestMapping(value="/debit/{aNo}/{amt}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Account debitAmount(@PathVariable("aNo")int accNo,@PathVariable("amt")double amount) {
		Account account =new Account(accNo,amount,"NA");
		return account;
	}
}
