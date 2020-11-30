package com.org;

import java.util.HashSet;

public class AccountsService {
	private HashSet<Accounts> accountSet=new HashSet<>();

	public HashSet<Accounts> getAccountSet() {
		return accountSet;
	}

	public void setAccountSet(HashSet<Accounts> accountSet) {
		this.accountSet = accountSet;
	}
	
	public void addAccount(int aNo,String aName,double aBalance) {
		Accounts account = new Accounts(aNo,aName,aBalance);
		try {
			if(accountSet.contains(account))
				throw new AccountAlreadyExistsException("Account Already Exists!");
			else
				accountSet.add(account);
			
		}
		catch(AccountAlreadyExistsException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void deleteAccount(int aNo) {
		int flag=0;
		try {
		for (Accounts accounts : accountSet) {
			if(accounts.getAccNo()==aNo) {
				System.out.println(accounts.toString());
				accountSet.remove(accounts);
				flag=1;
			}
			else if(flag==0)
				throw new AccountNotFoundException("Account Doesn't Exist!");
				
		}
		}catch(AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void displayAccount(int aNo) {
		int flag=0;
		try {
			for (Accounts accounts : accountSet) {
				if(accounts.getAccNo()==aNo) {
					System.out.println(accounts.toString());
					flag=1;
				}
				else if(flag==0) {
					throw new AccountNotFoundException("Account Doesn't Exist!");
				}
			}
		}catch(AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void displayAllAccounts() {
		for (Accounts accounts : accountSet) {
			System.out.println(accounts.toString());
		}
	}
	
	public void displayLowBalanceAccount() {
		for (Accounts accounts : accountSet) {
			if(accounts.getAccBalance()<1000) {
				System.out.println(accounts.toString());
			}
		}
	}
	
}
