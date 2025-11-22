package com.prac;

public class Q8 {
	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				continue;
			}
			if (c == 'Q') {
				break;
			}
			System.out.println(c);
		}
	}
}
