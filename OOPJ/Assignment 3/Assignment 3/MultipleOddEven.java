 //Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
//Display the following: 
//○  Number of even numbers. 
//○  Number of odd numbers. 
//○  Number of multiples of 3 

import java.util.Scanner;

public class MultipleOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[20];
        System.out.println("Enter the 20 elements of the array:");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
		}
		sc.close();
		
        EvenNumber a1 = new EvenNumber();
		OddNumber b1 = new OddNumber();
		MultipleOfThree c1 = new MultipleOfThree();

        a1.evenNumber(a);
		b1.oddNumber(a);
		c1.multipleOfThree(a);
    }
}

class EvenNumber{
		
		void evenNumber(int []a ){
			System.out.println("Even Number are : ");
			for (int i = 0; i < a.length; i ++){
				if (a[i]% 2 == 0){
					System.out.print(a[i] + " ");
				}
			}
		System.out.println();
		}	
}

class OddNumber{
		
		void oddNumber(int []a ){
			System.out.println("Odd number are : ");
			for (int i = 0; i < a.length; i ++){
				if (a[i]% 2 != 0){
					System.out.print(a[i] + " ");
				}
			}
		System.out.println();
		}
	
	
}


class MultipleOfThree{
		
		void multipleOfThree(int []a ){
			System.out.println( "Multiple of 3 are : ");
			for (int i = 0; i < a.length; i ++){
				if (a[i]% 3 == 0){
					System.out.print(a[i] + " ");
				}
			}
		System.out.println();
		}
	
	
}