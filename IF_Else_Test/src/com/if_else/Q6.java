
//Classify Temperature

package com.if_else;

public class Q6 {
	public static void main(String[] args) {
		int t = 40;
		if (t >= 35) {
			System.out.println("Hot");
		} else if (t >= 25) {
			System.out.println("Warm");
		} else if (t >= 15) {
			System.out.println("Cool");
		} else {
			System.out.println("Cold");
		}
	}
}
