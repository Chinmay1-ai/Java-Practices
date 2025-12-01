package com.noret;

public class Digits {

	int num;

	public void CountOdd(int num) {
		int count = 0;
		while (num > 0) {

			int d = num % 10;
			if (d % 2 != 0) {
				count++;
			}

			num = num / 10;
		}
		System.out.println("Total odd Numbers are " + count);
	}
}
