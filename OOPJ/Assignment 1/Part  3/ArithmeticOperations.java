//Q2. Write a Java program that takes two integers as input and performs all arithmetic operations on them. 
import java.util.*;

class ArithmeticOperations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("results of addition is " + c);
		
		int d = a - b;
		System.out.println("results of Subtraction is " + d);
		
		long e = a * b;
		System.out.println("results of Multiplication is " + e);
		
		double f = a / b;
		System.out.println("results of Division is " + f);
		
		double g = a % b;
		System.out.println("results of Modulus is " + g);
		
		sc.close();
	}
}