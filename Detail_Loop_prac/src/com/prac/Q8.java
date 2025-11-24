package com.prac;

public class Q8 {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;

		System.out.print(first + " " + second + " ");       /* Just print 0 1 */

		for (int i = 3; i <= 10; i++) {                     

			int next = first + second;   
			
			/*
			 * next = 0 + 1 = 1 
			 * next = 1 + 1 = 2 
			 * next = 1 + 2 = 3 
			 * next = 2 + 3 = 5 
			 * next = 3 + 5 = 8 
			 * next = 5 + 8 = 13 
			 * next = 8 + 13 = 21 
			 * next = 13 + 21 = 34 
			 * next = 21 + 34 = 55 
			 * next = 34 + 55 = 89
			 */

			System.out.print(next + " ");

			first = second;
			second = next;
		}
	}
}
