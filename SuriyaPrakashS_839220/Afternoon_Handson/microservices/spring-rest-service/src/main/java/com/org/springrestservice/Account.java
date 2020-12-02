package com.org.springrestservice;

public class Account {
	private int accNo;
	private double accBal;
	private String ifsc;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, double accBal, String ifsc) {
		super();
		this.accNo = accNo;
		this.accBal = accBal;
		this.ifsc = ifsc;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accBal=" + accBal + ", ifsc=" + ifsc + "]";
	}
	

}
