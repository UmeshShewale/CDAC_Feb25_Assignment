//   Rotate a Matrix by 90 Degrees 
//○  Rotate a given N x N matrix by 90 degrees clockwise.

import java.util.*;

class NintyDegreeRotate{
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
	
	int b [][] = new int[d][c];
	
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			b[j][i] = a[i][j];
		}
	}
	for (int i = 0; i < d; i++) {
            for (int j = 0, k = c - 1; j < k; j++, k--) {
                int temp = b[i][j];
                b[i][j] = b[i][k];
                b[i][k] = temp;
            }
        }
		
	System.out.println("Element of Array");
	for (int i = 0; i < c; i++){
		for (int j = 0; j < d; j++){
			System.out.print(b[i][j]);
			
		}
		System.out.println();
	}	
	
	}
}