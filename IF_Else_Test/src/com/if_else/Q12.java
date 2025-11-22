
//Accept time in 24-hour format and print:
//0–11 → Good Morning
//12–16 → Good Afternoon
//17–20 → Good Evening
//21–23 → Good Night

package com.if_else;

public class Q12 {
	public static void main(String[] args) {
		float time = 8.00f;

		if (time >= 0 && time <= 11) {
			System.out.println("Good Morning");
		} else if (time <= 16) {
			System.out.println("Good Afternoon");
		} else if (time <= 20) {
			System.out.println("Good Evening");
		} else if (time <= 23) {
			System.out.println("Good Night");
		} else {
			System.out.println("Invalid Time");
		}
	}
}
