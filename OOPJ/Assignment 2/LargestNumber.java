// Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator (  ? :  ).

import java.util.*;

class LargestNumber{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
		
		System.out.println("Enter a first Number");
		int b = sc.nextInt();
		
		System.out.println("Enter a first Number");
		int c = sc.nextInt();
		
		int largest = (a > b) ?((a >c) ? a : c) : ((b > c) ? b : c);
		System.out.println(largest + " is the largest number.");
		
		sc.close();
	}
}