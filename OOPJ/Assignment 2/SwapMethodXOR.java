// Q1:  Write a program to swap two numbers  without using a third variable  and without using arithmetic operators like  +  or  -  . 
// Hint  : Use bitwise XOR  ^  operator.

import java.util.*;

class SwapMethodXOR{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
	
		System.out.println("Enter a second Number");
		int b = sc.nextInt();
	
		a = a^b;
		b = b^a;
		a=  a^b;
	
		System.out.println("First Number is " + a);
		System.out.println("Second Number is " + b);
		sc.close();
	}
	
	
}
