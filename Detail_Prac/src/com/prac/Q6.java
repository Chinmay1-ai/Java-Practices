package com.prac;

public class Q6 {
	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c >= 'J' && c <= 'N') {
				continue;
			}
			System.out.println(c);
		}
	}
}
