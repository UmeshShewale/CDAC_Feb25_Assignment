//Q20:  Implement a Java program that  returns the absolute value  of a given number using the ternary operator (without using  Math.abs() 
import java.util.*;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
		
		int absoluteValue = (num < 0) ? -num : num;
		
		System.out.println("The absolute value of " + num + " is: " + absoluteValue);
		
		sc.close();
	}
}