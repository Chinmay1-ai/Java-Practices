
//Accept a number and check whether it is a multiple of 5 and 11 or not.

package com.if_else;

public class Q8 {
	public static void main(String[] args) {
		int i = 110;

		if (i % 5 == 0 && i % 11 == 0) {
			System.out.println("The number is Multiple of Both 11 and 5 = " +i);
		} else {
			System.out.println("The Number is not divisible of 5 and 11");
		}
	}
}
