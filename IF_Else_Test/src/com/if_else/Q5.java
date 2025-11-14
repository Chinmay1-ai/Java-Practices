
//Print Message Based on Age Group

package com.if_else;

public class Q5 {
	public static void main(String[] args) {
		 int age = 22;
	        if(age >= 0 && age <= 12) {
	            System.out.println("Child");
	        } else if(age <= 19) {
	            System.out.println("Teenager");
	        } else if(age <= 59) {
	            System.out.println("Adult");
	        } else {
	            System.out.println("Senior Citizen");
	        }
	}

}
