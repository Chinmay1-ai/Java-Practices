package com.noret;

public class Logic {

	int first;
	int second;
	int num;
	int rev = 0;
	int num1;

	public void FiboSeries(int first, int second) {
		System.out.print("Fibonici Series  =  " + first + " " + second + " ");

		for (int i = 3; i <= 10; i++) {
			int n = first + second;
			System.out.print(n + " ");
			first = second;
			second = n;
		}
	}

	public void RevNum(int num) {

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("");
		System.out.println("The Reversed Number is " + rev);
	}

	public void Primchk(int num1) {
		boolean isPrime = true;
		if (num1 <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("The number is Prime");
		} else {
			System.out.println("The Number is not Prime");
		}
	}
}
