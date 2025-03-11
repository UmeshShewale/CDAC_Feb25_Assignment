// Q8. Merge Two Sorted Arrays 
//○  Merge two sorted arrays into a single sorted array without using extra space

import java.util.*;
class MergedArray{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Size of first Array");
	int x= sc.nextInt();
	System.out.println("Enter a Size of second Array");
	int y= sc.nextInt();
	
	int z = x +y;
	
	int a [] = new int[z];
	int b[] = new int [y];
	
	for (int i =0; i < x; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	for (int i =0; i < y; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		b [i] = sc.nextInt();
	}
	
	for (int i = x -1; i < a.length ; i ++){
		for (int j =0; j < y; j ++){
			a [x -1] = b[j];
		}
	}
	
	int max = a[0];
	for (int i =0; i < a.length; i ++){
		for (int j = 0; j < a.length - 1 - i; j++) { 
			if ( a[j] > a[j +1]){
				a[j]= a[j] + a[j +1]; 
				a[j + 1]= a[j] - a[j +1];
				a[j]= a[j] - a[j +1];
			}
		}
	}
	System.out.println(" Merged Array is : " );
	for (int i =0; i < a.length; i ++){
		
		System.out.print( i + "  ");
		
	}
	}
}