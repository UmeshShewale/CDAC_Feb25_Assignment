//  Find the Diagonal Sum 
//○  Compute the sum of both diagonals in a square matrix. 

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int primarySum = 0, secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];    
        }

       
        int totalSum = primarySum + secondarySum;
        if (n % 2 != 0) {
            totalSum -= matrix[n / 2][n / 2];
        }

    
        System.out.println("\nPrimary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        System.out.println("Total Diagonal Sum: " + totalSum);
    }
}
