
//Print numbers 1 to 100 but skip numbers divisible by 3 and stop when number becomes 70

package com.prac;

public class Q9 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			if (i == 70) {
				break;
			}
			System.out.println(i);
		}
	}
}
