// Q4:  Write a program to find whether a given number is  divisible by 3  without using the modulus (  %  ) or division (  /  ) operators. 
//Hint  : Use  subtraction and bitwise shifts. 

import java.util.*;

class Divisible{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
		
		int b = Math.abs(a);
		
		while (b > 2){
			b = b +(~3 + 1);
			
		}
		if (b == 0){
			System.out.println( a+ " is divisible by 3");
		} else {
			System.out.println( a+ " is not divisible by 3");
		}
	}
}