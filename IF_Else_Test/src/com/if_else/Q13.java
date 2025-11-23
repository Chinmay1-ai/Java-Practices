package com.if_else;

public class Q13 {
	public static void main(String[] args) {
		int month = 4;

		if (month >= 1 && month <= 4) {
			System.out.println("Summer");
		} else if (month >= 5 && month <= 8) {
			System.out.println("Rainy");
		} else if (month >= 9 && month <= 12) {
			System.out.println("Winter");
		} else {
			System.out.println("Invalid Seasonn");
		}
	}
}
