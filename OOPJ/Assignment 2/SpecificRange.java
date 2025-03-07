// Implement a Java program that checks if a number is  within a specific range (20 to 50)  without using  if-else Hint  : Use  logical AND (  &&  ) in a print statement 

import java.util.*;

class SpecificRange{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
	
		Boolean result = ((a > 20) && (a < 50));
		
		System.out.println("Is the number within the range (20 to 50)? " + result);
		}
	}
		
		
		
	
		