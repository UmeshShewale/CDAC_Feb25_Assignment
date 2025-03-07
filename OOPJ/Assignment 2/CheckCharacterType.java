// Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or not a letter  using only the ternary operator.

import java.util.*;

class CheckCharacterType{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Value");
		char ch= sc.next().charAt(0);
		
		String result = (Character.isLetter(ch)) ? (Character.isUpperCase(ch) ? "Uppercase" : "Lowercase") :"Not a letter";
		
		String result1 = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
            
		System.out.println("The character is: " + result);
		
	}
}
                         
                        