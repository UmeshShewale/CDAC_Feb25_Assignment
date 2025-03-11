//  Matrix Multiplication 
//○  Multiply two matrices and return the resultant matrix.

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of first matrix (m1): ");
        int m1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix (n1): ");
        int n1 = sc.nextInt();

        System.out.print("Enter number of rows of second matrix (m2): ");
        int m2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix (n2): ");
        int n2 = sc.nextInt();

        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible! Columns of first matrix must match rows of second matrix.");
            return;
        }

        int[][] matrix1 = new int[m1][n1];
        int[][] matrix2 = new int[m2][n2];
        int[][] result = new int[m1][n2]; 

        System.out.println("\nEnter elements of first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements of second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) { 
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("\nResultant Matrix after Multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
