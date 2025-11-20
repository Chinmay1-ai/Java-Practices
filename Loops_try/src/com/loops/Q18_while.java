
//Print the sum of odd numbers from 1 to 100.

package com.loops;

public class Q18_while {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Print the sum of odd numbers from 1 to 100 = " + sum);
	}
}
