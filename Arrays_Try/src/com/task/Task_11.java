package com.task;

public class Task_11 {

	public static void main(String[] args) {

		String str = "Hello World";
		String result = "";
		String word = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == ' ') {
				result += word + " ";
				word = "";
			} else {
				word = ch + word;
			}
		}

		result += word;

		System.out.println(result);
	}
}
