//Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
//Hint  :  n & (n - 1) == 0  for positive numbers. 

import java.util.*;

class PowerOfTwoChecker{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		boolean b = (( n > 0) && ( n & (n-1)) == 0);
		
		System.out.println("Is " + n + " a power of 2? " + b);
		 
	}
	
}
		
		