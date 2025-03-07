// Q22:  Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input and prints the result using only  switch-case

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble(); 

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble(); 

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0); 

        double result = 0; 

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; 
        }

        System.out.println("Result: " + result);

        sc.close(); 
    }
}