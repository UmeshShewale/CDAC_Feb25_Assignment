//Develop a program that takes user input for a character and prints whether it is a vowel or consonant. 

import java.util.*;


class VowelConsonant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Letter: ");
		char ch = sc.next().charAt(0);
		
		
		char a [] = {'a', 'e' , 'i' , 'o' , 'u'};
		
		for (int i = 0 ; i < a.length; i++ ){
				if ( ch == a[i]){
					System.out.println( ch +" is a Vowel");
					break;
				}else {
					System.out.println( ch +" is a consonant");
					break;
				}
		}
	}
	
}