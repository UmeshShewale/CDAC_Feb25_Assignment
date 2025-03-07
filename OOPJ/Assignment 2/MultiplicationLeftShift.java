// Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
//Hint  : Use bitwise left shift (  << )

import java.util.*;

class MultiplicationLeftShift{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		n <<= 3;
		
		System.out.println("multiplation by 8: " + n);
	}
}