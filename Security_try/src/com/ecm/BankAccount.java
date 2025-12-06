package com.ecm;

public class BankAccount {

	private String accHolder;
	private int accBalance;
	private int accNo;
	int amount;
	int Balance = 80000;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}

//	deposit(), withdraw(), getBalance().

	public void Withdraw(int amount , String accHolder) {
		
        if(Balance > amount) {
			System.out.println("The Amount Has been Withdrawn");
		}else {
			System.out.println("Low Balance....!!");
		}
		
        System.out.println("The Remaining Balance in "+accHolder+ " accout is "+(Balance-amount));
        System.out.println("-----------------------------------------------------------");
					
	}

	public void Deposit(String accHolder, int accNo , int amount) {
        
		System.out.println("The Amount has been Deposited");
		System.out.println("The Balance in "+accHolder+" is "+(Balance+amount));
        System.out.println("-----------------------------------------------------------");

	
	}

	
	public void GetBalance(String accHolder , int accNo) {
			
		System.out.println("The Balance in "+accHolder+" is "+Balance);
        System.out.println("-----------------------------------------------------------");

	}

}
