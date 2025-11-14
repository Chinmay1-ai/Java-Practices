
//Check the Type of Triangle

package com.if_else;

public class Q4 {
public static void main(String[] args) {
	 int a = 20;
     int b = 20;
     int c = 10;
     if(a == b && b == c) {
         System.out.println("Equilateral");
     }else if(a == b || b == c || a == c) {
         System.out.println("Isosceles");
     }else {
         System.out.println("Scalene");
     }
}
}
