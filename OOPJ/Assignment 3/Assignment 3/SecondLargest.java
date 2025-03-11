//3.  Find the Second Largest Element 
//○  Find the second-largest element in the given array. 

import java.util.*;
class SecondLargest{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[6];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	sc.close();
	
	for ( int i = 1 ; i < a.length ; i++){
		for (int j = 0; j < a.length - 1 - i; j++) { 
			if (a[j] > a[j +1]){
				int b = a[j];
				a[j] = a[j +1];
				a[j + 1] = b;
			}
		}
	}
	System.out.println("Swapped Arraay is : ");
	for ( int i = 1 ; i < a.length ; i++){
		System.out.println(a[i] + " ");
	}
	
	int secondLargest = a[a.length -2];
	System.out.println("Second Largest is : " +secondLargest);
}
}
                   
