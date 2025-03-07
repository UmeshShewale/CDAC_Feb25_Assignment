// Q15: Implement a program to swap  odd and even bits  of a number using bitwise operators. 
//Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 

import java.util.*;

class SwapOddEvenBits{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		int evenBits = (n & 0xAAAAAAAA) >>1;
		int oddBits = (n & 0x55555555) << 1 
		result = evenBits | oddBits;
		
		System.out.println("Number after swapping odd and even bits: " + result);
		
	}
}