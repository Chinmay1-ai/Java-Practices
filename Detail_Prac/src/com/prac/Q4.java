package com.prac;

public class Q4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			if (i % 10 == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
}
