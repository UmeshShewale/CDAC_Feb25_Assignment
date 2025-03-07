//Q17:  Implement a Java program that finds the  minimum of four numbers  using nested ternary operators

import java.util.*;

class MinimumOfFourNumber{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int a= sc.nextInt();
		System.out.println("Enter a Value");
		int b= sc.nextInt();
		System.out.println("Enter a Value");
		int c= sc.nextInt();
		System.out.println("Enter a Value");
		int d= sc.nextInt();
		
		int s = (a < b && a < c && a < d) ? a : (b < c && b < d) ? b : (c < d) ? c : d;
                       
		
		System.out.println("Smallest Number is: " + s);
	}
}