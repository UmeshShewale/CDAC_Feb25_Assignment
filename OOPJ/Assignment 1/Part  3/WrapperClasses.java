//Q4. Create a Java program that converts a given integer to a double and vice versa using wrapper classes.
import java.util.*;


class WrapperClasses{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer Number: ");
		Integer a = sc.nextInt();
		 
		Double b = a.doubleValue();
		System.out.println("Value of Integer to Double by wrapper classes : " + b);
		 
		System.out.println("Enter Double Number:  ");
		Double c = sc.nextDouble();
		
		Integer d = c.intValue();
		System.out.println("Value of Double to Integer by wrapper classes : " + d);
		 
		
		}
}