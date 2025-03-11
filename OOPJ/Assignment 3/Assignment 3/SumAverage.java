// Find Sum and Average 
//○  Compute the sum and average of all elements in the array.

import java.util.*;
class SumAverage{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[6];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	sc.close();
	 
	int sum= 0;
	for ( int i = 0 ; i < a.length ; i++){
		sum= sum +a[i];
	}
	
	double average = (double)sum/a.length;
	System.out.println("Sum of array member is " + sum);
	System.out.println("Average of array member is " + average);
	
}
}