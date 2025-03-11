//1.  Find the Largest and Smallest Element 
//○  Given an array, find the smallest and largest elements in it. 

import java.util.*;
class SmallestLargestValue{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[5];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	
	int min = a[0];
	int max = a[0];
	
	for (int i =0; i < a.length ; i ++){
		if (a[i] < min){
			min = a[i];
		}
		if (a[i] > max){
			max = a[i];
		}
	}
	System.out.println("The smallest number in array is : " + min);
	
	System.out.println("The Largest number in array is : " + max);
	
	}
}