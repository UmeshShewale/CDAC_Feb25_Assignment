 /*Given two sorted arrays A and B of size p and q, write a Java program to merge elements of 
A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B 
with remaining elements. 
Example: 
Input : 
int[] A = { 1, 5, 6, 7, 8, 10 } 
int[] B = { 2, 4, 9 } 
Output: 
Sorted Arrays: 
A: [1, 2, 4, 5, 6, 7] 
B: [8, 9, 10] */

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};

        int p = A.length;
        int q = B.length;

        mergeAndRedistribute(A, B, p, q);

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void mergeAndRedistribute(int[] A, int[] B, int p, int q) {
        int[] C = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < p) {
            C[k++] = A[i++];
        }

        while (j < q) {
            C[k++] = B[j++];
        }

        for (i = 0; i < p; i++) {
            A[i] = C[i];
        }
        for (j = 0; j < q; j++) {
            B[j] = C[p + j];
        }
    }
}