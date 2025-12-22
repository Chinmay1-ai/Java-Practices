package com.movieapp;

public class MovieService {

	public void selectMovie() {
		System.out.println("Movie Selected : AVENGERS");
	}

	public double calculateTicketPrice(int seats) {
		double priceperTicket = 200;
		return seats * priceperTicket;
	}

	public void bookTicket(Payment p, double amount) {
		p.pay(amount);
		System.out.println("Ticket Booked Succesfully");
	}
}
