package com.org;

import java.util.HashSet;

public class AccountsService {
	private HashSet<Accounts> accountSet = new HashSet<>();

	public HashSet<Accounts> getAccountSet() {
		return accountSet;
	}

	public void setAccountSet(HashSet<Accounts> accountSet) {
		this.accountSet = accountSet;
	}

	public void addAccount(int aNo, String aName, double aBalance) throws AccountAlreadyExistsException {
		Accounts account = new Accounts(aNo, aName, aBalance);
			for (Accounts accounts : accountSet) {
				if (accounts.getAccNo() == account.getAccNo()) {
					throw new AccountAlreadyExistsException("Account Already Exists!");
				}
			}
			accountSet.add(account);

	}

	public void deleteAccount(int aNo) throws AccountNotFoundException {
		Accounts dumAcc = null;
			for (Accounts accounts : accountSet) {
				if (accounts.getAccNo() == aNo) {
					dumAcc = accounts;
				}
			}
			if(dumAcc==null) {
				throw new AccountNotFoundException("Account Doesn't Exist!");
			}
			else {
				for (Accounts accounts : accountSet) {
					if(accounts.getAccNo()==aNo)
						accountSet.remove(accounts);
				}
			}
	}

	public void displayAccount(int aNo) throws AccountNotFoundException {
		int flag = 0;
		
			for (Accounts accounts : accountSet) {
				if (accounts.getAccNo() == aNo) {
					System.out.println(accounts.toString());
					flag = 1;
				} else if (flag == 0) {
					throw new AccountNotFoundException("Account Doesn't Exist!");
				}
			}
		
	}

	public void displayAllAccounts() {
		for (Accounts accounts : accountSet) {
			System.out.println(accounts.toString());
		}
	}

	public void displayLowBalanceAccount() {
		for (Accounts accounts : accountSet) {
			if (accounts.getAccBalance() < 1000) {
				System.out.println(accounts.toString());
			}
		}
	}

}
