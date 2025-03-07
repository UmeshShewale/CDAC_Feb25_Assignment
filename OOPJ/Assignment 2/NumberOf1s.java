//Write a program to count the  number of 1s (set bits)  in a binary representation of a number using bitwise operations. 
//Hint  : Use  n & (n - 1) 

import java.util.*;

class NumberOf1s{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		int count = 0;
		
		while (n > 0){
				n = (n &(n-1));
				count ++;
		}
		System.out.println("number of 1s (set bits) : " + count);
	}
}
// 1000(8) & 0111(7)
//result(&): 0000
//1100 &  1011
//1000 &0111
//0000