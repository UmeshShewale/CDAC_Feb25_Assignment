// Rotate an Array 
//○  Rotate the array to the right by k positions.

import java.util.*;
class RotateArrayKPosition{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[5];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	
	System.out.println(" Enter index from which array to be rotate  ");
	int b = sc.nextInt();
	sc.close();
	
	int start = 0;
	int end = a.length-1  ;
	
	while(start < end ){
		
		a[start] = a[start]+ a[end];
		a[end] = a[start] - a[end];
		a[start] = a[start]- a[end];
		
		end --;
		start++;
	}
	
	start = 0;
    end = b - 1;
    while (start < end) {
        a[start] = a[start]+ a[end];
		a[end] = a[start] - a[end];
		a[start] = a[start]- a[end];
		
		end --;
		start++;
	}
	
	start = b;
    end = a.length-1;
    while (start < end) {
        a[start] = a[start]+ a[end];
		a[end] = a[start] - a[end];
		a[start] = a[start]- a[end];
		
		end --;
		start++;
	}
	
	System.out.print("Rotate array is ");
	for (int i =0; i < a.length ; i ++){
		System.out.print(a[i] + " " );
	}
	}
	 

}