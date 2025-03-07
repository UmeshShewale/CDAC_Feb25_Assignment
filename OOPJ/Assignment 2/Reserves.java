// Q25:  Implement a program that reverses an  integer number  without using string conversion (  StringBuilder  or  toCharArray  ). 
//Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 

import java.util.Scanner;

public class Reserves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt(); 
		
		int result =0;
		
		while(num1 !=0){
			result = result* 10 + num1 %10;
			num1= num1/10;
		}
		System.out.println("Reverses of given integer number: " + result );
		sc.close();
	}
}