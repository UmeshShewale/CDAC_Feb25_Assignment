//  Q4. Count Even and Odd Numbers 
//○  Count the number of even and odd numbers in an array

import java.util.*;
class OddEvenCount{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int a [] = new int[6];
	
	for (int i =0; i < a.length ; i ++){
		
		System.out.println(" Enter the value of Array " + i + " : ");
		a [i] = sc.nextInt();
	}
	sc.close();
	int evencount = 0;
	int oddcount = 0;
	for ( int i = 0 ; i < a.length ; i++){
		if (a[i]%2 == 0){ 
		evencount++;
		} else {
		oddcount++;
		}
	}
		System.out.println("Count of evennumber is " + evencount);
		System.out.println("Count of oddnumber is " + oddcount);
	}

}

	