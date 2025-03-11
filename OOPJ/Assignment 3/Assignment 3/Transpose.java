//19.  Transpose of a Matrix 
//○  Given a matrix, return its transpose (swap rows and columns). 

import java.util.*;

class Transpose{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of rows "); 
	int c = sc.nextInt();
	
	System.out.println("Enter number of columns ");
	int d = sc.nextInt();
	
	int a [][] = new int[c][d];
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.println("Enter element of Array at " + i + j+ " : ");
			a[i][j] = sc.nextInt();
		}
	}	
	System.out.println("Element of Array");
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.print(a[i][j]);
			
		}
		System.out.println();
	}	
	
	int b[][] = new int[d][c];
	
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			b[i][j] = a[j][i];
		}
	}	
	System.out.println("Transpose array is : ");
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.print(b[i][j]);
			
		}
		System.out.println();
	}	
	
			
	}
}