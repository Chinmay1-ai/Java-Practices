package com.task;

public class Task_10 {

	public static void main(String[] args) {

		String str = "ChinmayPawar@123";
		String temp = "";
		String temp1 = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				temp1 += ch;
			} else {
				temp += ch;
			}
		}

		System.out.println("String after the Removal of Vowels : " + temp);
		System.out.println("Vowels that are Remove : " + temp1);
	}
}
