package com.miniproject;

public class UpiPayment implements Payment {

	@Override
	public void payAmount(double amount) {
		System.out.println("Payment of ₹" + amount + " done via UPI");
	}
}
