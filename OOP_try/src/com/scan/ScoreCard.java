package com.scan;

import java.util.Scanner;

public class ScoreCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Marks of Math");
		int math = sc.nextInt();
		if (math < 0 || math > 100) {
			System.out.println("Itna Padhai matt karo");
		}

		System.out.println("Enter the Marks of Physics");
		int physics = sc.nextInt();
		if (physics < 0 || physics > 100) {
			System.out.println("Itna Padhai matt karo");
		}

		System.out.println("Enter the Marks of Chemistry");
		int chemistry = sc.nextInt();
		if (chemistry < 0 || chemistry > 100) {
			System.out.println("Itna Padhai matt karo");
		}

		System.out.println("Enter the Marks of Graphics");
		int graphics = sc.nextInt();
		if (graphics < 0 || graphics > 100) {
			System.out.println("Itna Padhai matt karo");
		}

		System.out.println("Enter the Marks of Mechanics");
		int mechanics = sc.nextInt();
		if (mechanics < 0 || mechanics > 100) {
			System.out.println("Itna Padhai matt karo");
		}

		int total = math + physics + chemistry + graphics + mechanics;

		float percentage = ((float) total / 500) * 100;

		System.out.println("The total Marks Student has obtain = 500/" + total);
		System.out.println("The Percentage of Student is = " + percentage);

		boolean isPass = true;

		if (math < 35) {
			System.out.println("Failed in Maths");
			isPass = false;
		}

		if (physics < 35) {
			System.out.println("Failed in Physics");
			isPass = false;
		}

		if (chemistry < 35) {
			System.out.println("Failed in Chemistry");
			isPass = false;
		}

		if (graphics < 35) {
			System.out.println("Failed in Graphics");
			isPass = false;
		}

		if (mechanics < 35) {
			System.out.println("Failed in Mechanics");
			isPass = false;
		}

		if (isPass) {
			System.out.println("The Student is Pass.....!!");
		} else {
			System.out.println("The Student is Fail...!!");
		}
	}
}
