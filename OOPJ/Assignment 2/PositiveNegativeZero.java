//Q16:  Write a program that determines whether a given number is  positive, negative, or zero  using only the  ternary operator 

import java.util.*;

class PositiveNegativeZero{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		String s = (n >0 )?  "Positive" :((n < 0) ? "Negative" : "zero");
		
		System.out.println(" Given number is: " + s);
	}
}