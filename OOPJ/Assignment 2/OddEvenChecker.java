//Q23:  Given a number, find whether it is  odd or even  using the  &  bitwise operator and print the result without using  if-else 

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
		
		String result = (num & 1) == 1 ? "Odd" : "Even";
		
		System.out.println("The number is: " + result);

        sc.close();
	}
}