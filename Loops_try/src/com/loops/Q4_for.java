
//Print all odd numbers between 1 and 50.


package com.loops;

public class Q4_for {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
