// Q10:  Write a program to determine if a  character is a vowel  or a consonant using the ternary operator.

import java.util.*;

class VowelConsonantChecker{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Letter");
		char ch = sc.next().toLowerCase().charAt(0);
		
		char b [] = {'a' , 'e' , 'i' , 'o', 'u' };
		
		boolean isVowel = (b[0]==ch || b[1]==ch || b[2]==ch || b[3]==ch || b[4]==ch) ? true : false ;
		
		System.out.println("The letter '" + ch + "' is a " + (isVowel ? "vowel" : "consonant") + ".");
		
	}
	
}
		
		
		
		
		