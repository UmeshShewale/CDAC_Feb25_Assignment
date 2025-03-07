// Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise operators. 
//Hint  : Use  n & 1  to check.

import java.util.*;

class EvenOdd{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
	
		
		if ((a & 1) == 0) 
			System.out.println(a + " is Even.");
		
		if ((a & 1) == 1) {
			System.out.println(a + " is Odd.");
		}
	}
}