//  Find Missing Number in an Array 
//○  Given an array of size n-1 containing numbers from 1 to n, find the missing number. 

import java.util.*;
class MissingNumber{
	
public static void main(String args[]){
	
	int a[] ={1, 2, 3, 4, 6, 7, 8, 9};
	int n = a.length + 1;
	
	int sum = n*(n +1)/2 ;
	
	int sumofArray = 0;
	
	for ( int i : a){
		sumofArray = sumofArray + i;
	}
	
	int missingNumber = sum - sumofArray;
	
	System.out.println("Missing Number in an Array: " + missingNumber);
	
}
}