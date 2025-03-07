// Q3. Implement a Java program to demonstrate implicit and explicit type casting. 

import java.util.*;

class ImplicitExplict{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// IMPLICIT TYPE CASTING (Widening)
		System.out.println("Enter first Number(should be less than 128): ");
		byte a = sc.nextByte();
		
		System.out.println("IMPLICIT TYPE CASTING (Widening)");
		short b = a;
		System.out.println("Value of byte to short is " + a);
		
		int c = b;
		int d = a;
		System.out.println("Value of byte to int & short to int is " + d + " & " + c);
		
		long e = a;
		long f= b;
		long g = d;
		System.out.println("Value of byte to long & short to long & int to long is " + e + " & " + f + " & " + g);
		
		float h = g;
		float j= d;
		System.out.println("Value of int to float & long to float is " + h + " & " + j );
		
		double k = g;
		double i = d;
		double l = h;
		System.out.println("Value of int to double & long to double & float to double is " + k+ " & " + i + " & " + h);
		
		
		// EXPLICIT TYPE CASTING (Narrowing)
		System.out.println("Enter Second Number");
		double a1 = sc.nextDouble();
		
		System.out.println("EXPLICIT TYPE CASTING (Narrowing)");
		
		float b1 = (float) a1;
		System.out.println("Value of double to float : " + b1);
		
		int c1 = (int) a1;
		System.out.println("Value of double to int : " + c1);
		
		short d1 = (short) a1;
		System.out.println("Value of double to short : " + d1);
		
		byte e1 = (byte) a1;
		System.out.println("Value of double to byte : " + e1);
		
		}
		
	}
		
		
		