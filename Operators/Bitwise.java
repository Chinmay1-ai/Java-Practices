package Operators;

public class Bitwise {
public static void main(String[] args) {
	int a = 12;
	int b = 15;
	
	int c = 11;
	int d = 13;
	
	int e = 17;
	int f = 7;
	int g = 49;
	
	
	System.out.println("Binary Conversion of 12 = "+Integer.toBinaryString(a));
	System.out.println("Binary Conversion of 15 = "+Integer.toBinaryString(b));
	
	System.out.println("Binary Conversion of 11 = "+Integer.toBinaryString(c));
	System.out.println("Binary Conversion of 13 = "+Integer.toBinaryString(d));
	
	System.out.println("Binary Conversion of 17 = "+Integer.toBinaryString(e));
	System.out.println("Binary Conversion of 7 = "+Integer.toBinaryString(f));
	System.out.println("Binary Conversion of 49 = "+Integer.toBinaryString(g));
	
	System.out.println( 12 & 15 );
	System.out.println( 11 | 13 & 12);
	System.out.println( 17 & 7 & 49);
}
}
