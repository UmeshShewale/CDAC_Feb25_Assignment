//Q2.  Reverse an Array 
//○  Reverse the given array in place. 

import java.util.*;
class ReverseArray{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[6];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	sc.close();
	
	int []b = new int[6];
	int count = 0;
	
	for (int i = a.length -1 ; i >= 0 ; i --){
		 
		 b [count] = a[i];
		 
		 count ++;
		 
	}
	System.out.println(" Reverse Array is : " ); 
	
	for (int i =0; i < b.length ; i ++){
		System.out.print( b[i] + " " );
	}
}
}