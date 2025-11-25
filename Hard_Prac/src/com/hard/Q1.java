
//Count how many EVEN digits are inside a number

package com.hard;

public class Q1 {
	public static void main(String[] args) {
		int num = 45865632;
		int count = 0;

		while (num > 0) {

			int digit = num % 10;

			if (digit % 2 == 0) {
				count++;
			}

			num = num / 10;
		}
		System.out.println("The Even Number inside the number is = " + count);

	}
}
