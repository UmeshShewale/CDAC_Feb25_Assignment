//  Sum of Two Matrices 
//○  Given two matrices of the same size, compute their sum.

import java.util.*;

class SumofTwoMatrices {
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
	int b [][] = new int[c][d];
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.println("Enter element of Array at " + i + j+ " : ");
			b [i][j] = sc.nextInt();
		}
	}	
	System.out.println("Element of Array");
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.print(a[i][j]+ " ");
			
		}
		System.out.println();
	}	
	System.out.println("Element of Array");
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.print(b[i][j]+ " ");
			
		}
		System.out.println();
	}	
	
	int e[][] = new int[c][d];
	
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			e[i][j] = a[i][j] + b[i][j];
		}
	}	
	System.out.println("Sum array is : ");
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.print(e[i][j]+ " ");
			
		}
		System.out.println();
	}	
	
			
	}
}