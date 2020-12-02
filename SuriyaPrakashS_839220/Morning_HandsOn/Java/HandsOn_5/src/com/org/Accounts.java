package com.org;

public class Accounts {
	private int accNo;
	private String accName;
	private double accBalance;
	public Accounts(int accNo, String accName, double accBalance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Accounts [accNo=" + accNo + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	
	public int hashcode() {
		return accNo;
	}
	
	public boolean equals(Object object) {
		Accounts other=(Accounts) object;
		return this.accNo==other.getAccNo();
	}

}
