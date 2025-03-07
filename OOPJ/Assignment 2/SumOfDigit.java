//Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus (  %  ) and division (  /  ) operators 

import java.util.*;

class SumOfDigit{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
	
		int sum = 0;
		int b = a;
		
		while( b > 0){
			sum = sum +(b % 10);
			b = b/10;
		}
		
		System.out.println("Sum of digits of " + a + " is: " + sum);
		sc.close();
	}
}
		
		