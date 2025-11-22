package com.prac;

public class Q7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
