// Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of them are  true. Hint  : Use logical operators (  &&  ,  || )

import java.util.*;

class LogicalOperators{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a First Value(True/ False)");
		boolean a = sc.nextBoolean();
		
		System.out.println("Enter a Second Value(True/ False)");
		boolean b = sc.nextBoolean();
		
		System.out.println("Enter a Third Value(True/ False)");
		boolean c = sc.nextBoolean();
		
		boolean result = (a && b) || (a && c) || (b && c);
		
		System.out.println("Result: " + result);
		
		 sc.close();
		 
	}
	
}
		
		