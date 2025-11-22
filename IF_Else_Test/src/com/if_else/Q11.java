
//Accept a character and check if it is uppercase, lowercase, digit, or special character.

package com.if_else;

public class Q11 {
	public static void main(String[] args) {
		char a = '*';

		if (a >= 'A' && a <= 'Z') {
			System.out.println("Uppercase");
		} else if (a >= 'a' && a <= 'z') {
			System.out.println("Lowercase");
		} else if (a >= '0' && a <= '9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
	}
}
