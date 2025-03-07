/*Q18:  Given a student’s percentage, print Pass if the percentage is 40 or above; otherwise, print Fail  , using only the ternary operator.*/

import java.util.*;

class PassFail{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int n= sc.nextInt();
		
		String result = (n >= 40) ? "Pass" : "Fail";
		
		System.out.println("Final result is " + result);
	}
}