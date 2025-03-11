//  Remove Duplicates from a Sorted Array 
//○  Remove duplicate elements from a sorted array without using extra space.

import java.util.*;
class RemoveDulpicate{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[5];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	sc.close();
	// sorted array
	for ( int i = 0 ; i < a.length ; i++){
		for (int j = 0; j < a.length - 1 - i; j++) { 
			if ( a[j] > a[j +1]){
				a[j]= a[j] + a[j +1]; 
				a[j + 1]= a[j] - a[j +1];
				a[j]= a[j] - a[j +1];
			}
		}
	}
	System.out.println("Sorted Arraay is : ");
	for ( int i = 0 ; i < a.length ; i++){
		System.out.println(a[i] + " ");
	}
	
	// Remove Duplicate
	
	int c =0;
	int count =0;
	for (int j = 1; j < a.length; j++) {
			if (a[j] != a[c]){
				c++;
				a[c]= a[j];
				count++;
			}
			
		}
	
	
	for ( int i = 0 ; i < a.length ; i++){
		if (i > count){
			a[i]= 0;
		}
	} 
	System.out.println("Removed duplicate array is : ");
	for ( int i = 0 ; i < a.length ; i++){
		System.out.println(a[i] + " ");
	}
}
}	