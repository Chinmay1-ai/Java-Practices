
//Accept three sides of a triangle and check whether it is valid or not  (sum of any two sides > third side).

package com.if_else;

public class Q10 {
	public static void main(String[] args) {
		int a = 50;
		int b = 50;
		int c = 50;

		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}
}
