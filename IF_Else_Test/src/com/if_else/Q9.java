
//Accept a person's salary and apply tax:
//Salary < 50,000 → No Tax
//50,000 to 1,00,000 → 10% Tax
//Above 1,00,000 → 20% Tax

package com.if_else;

public class Q9 {
	public static void main(String[] args) {
		int salary = 30000;

		if (salary <= 50000) {
			System.out.println("The Person has to pay no Tax");
		} else if (salary <= 100000) {
			System.out.println("The Person has to pay 10% Tax");
		} else {
			System.out.println("The Person has to pay 20% Tax");
		}
	}
}
