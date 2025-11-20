
//Print all odd numbers between 1 and 50.

package com.loops;

public class Q14_while {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
