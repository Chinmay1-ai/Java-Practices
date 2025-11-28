package com.call;

import com.oop.Bank;

public class BankMain {
public static void main(String[] args) {
	 Bank bank = new Bank();

     bank.bankName = "State Bank of India";
     bank.branch = "Pune";
     bank.accountNumber = 987654321123L;
     bank.accountHolder = "Rohit Sharma";
     bank.balance = 45890.55;
     bank.ifsc = "SBI000129";
     bank.accountType = "Savings";
     bank.isActive = true;
     bank.city = "Pune";
     bank.mobile = 9876543210L;

     System.err.println("----- Bank Details -----");
     System.out.println("Bank: " + b.bankName);
     System.out.println("Branch: " + b.branch);
     System.out.println("Account Number: " + b.accountNumber);
     System.out.println("Account Holder: " + b.accountHolder);
     System.out.println("Balance: " + b.balance);
     System.out.println("IFSC: " + b.ifsc);
     System.out.println("Account Type: " + b.accountType);
     System.out.println("Active: " + b.isActive);
     System.out.println("City: " + b.city);
     System.out.println("Mobile: " + b.mobile);
}
}
