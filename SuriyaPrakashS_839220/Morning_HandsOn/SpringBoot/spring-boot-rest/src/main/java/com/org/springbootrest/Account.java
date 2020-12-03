package com.org.springbootrest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	private long accNumber;
	private double balance;

	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
