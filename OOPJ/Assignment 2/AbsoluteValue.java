// Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise operators. 
//Hint  :  mask = num >> 31; abs = (num + mask) ^ mask; 

import java.util.*;

class AbsoluteValue{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		int b = n >> 31; 
		int abs = (n + b)^b;
		
		System.out.println(b);
		System.out.println(abs);
	}
	
}