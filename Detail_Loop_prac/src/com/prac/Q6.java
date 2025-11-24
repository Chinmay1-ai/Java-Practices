package com.prac;

public class Q6 {
	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;

		while (num > 0) {
			int digit = num % 10;         //   1234 % 10 = 4     it will give end digit
			rev = rev * 10 + digit;       //   0 * 10+ 4 = 4     add this in reverse
			num = num / 10;               //   1234 / 10 = 123   Remove the last digit
		}
		
//this iteration will continue until the removal of last digit completion
		/*
		 * Ex. 
		 * 1234 / 10 = 123 
		 * 123 / 10 = 12 
		 * 12 / 10 = 1 
		 * 1 / 10 = 0
		 */
//when the num is 0 the iteration will stop and we will get our reverse string	
		
		System.out.println("Reverse String of 1234 is " + rev);
	}
}
