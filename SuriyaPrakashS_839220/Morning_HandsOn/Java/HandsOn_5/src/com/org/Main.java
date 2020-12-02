package com.org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountsService service=new AccountsService();
		int choice;
		int aNo;
		String aName;
		double aBalance;
		Scanner read= new Scanner(System.in);
		do {
			System.out.println("1.Add Account 2.Remove Account 3.Dislpay Account 4.Display All Account 5.Display Low Balance Account 6.Exit");
			choice=read.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Account Number:");
				aNo=read.nextInt();
				System.out.println("Account Name:");
				aName=read.next();
				System.out.println("Account balance:");
				aBalance=read.nextDouble();
				try {
				service.addAccount(aNo, aName, aBalance);
				}catch(AccountAlreadyExistsException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Account Number:");
				aNo=read.nextInt();
				try {
				service.deleteAccount(aNo);
				}catch(AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Account Number:");
				aNo=read.nextInt();
				try {
				service.displayAccount(aNo);
				}catch(AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				service.displayAllAccounts();
				break;
			case 5:
				service.displayLowBalanceAccount();
				break;
			case 6:
				System.out.println("Exit");
			}
		}while(choice!=6);
	}

}
