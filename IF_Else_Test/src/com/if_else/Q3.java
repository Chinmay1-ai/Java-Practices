
//Find Grade of a Student

package com.if_else;

public class Q3 {
public static void main(String[] args) {
	 int marks = 89;
     if(marks >= 90 && marks <= 100) {
         System.out.println("Grade A");
     }else if(marks >= 75) {
         System.out.println("Grade B");
     } else if(marks >= 50) {
         System.out.println("Grade C");
     }else if(marks >= 35) {
         System.out.println("Grade D");
     }else {
         System.out.println("Fail");
     }
}
}
