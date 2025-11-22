
//number is even, if even, check whether it’s greater than 50.

package com.if_else;

public class Q7 {
	public static void main(String[] args) {
		int n = 27;
		if (n % 2 == 0) {
			if (n > 50) {
				System.out.println("Even and greater than 50");
			} else {
				System.out.println("Even but not greater than 50");
			}
		} else {
			System.out.println("Not even");

		}
	}
}
