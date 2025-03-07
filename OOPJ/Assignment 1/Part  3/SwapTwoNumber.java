//Write a Java program to swap two numbers using a temporary variable and without using a temporary variable. 

import java.util.*;


class SwapTwoNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		a = a + b;
		b= a- b;
		a= a- b;
		
		System.out.println("Value of First Number: "+ a);
		System.out.println("Value of Second Number: "+ b);
	}
}

		
		