// Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
//Hint  : Use bitwise  - (~x) 

import java.util.Scanner;

public class IncrementWithoutPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();
		
		int b = -~a;
		
		System.out.println("Incremented number: " + b);
		
		sc.close();
	}
}