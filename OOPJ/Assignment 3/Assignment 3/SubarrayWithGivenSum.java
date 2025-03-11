//  Find a Subarray with Given Sum 
//○  Given an array of integers, find the subarray that sums to a given value S. 

import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum (S):");
        int S = sc.nextInt();

        sc.close();
        findSubarrayWithSum(arr, S);
    }

    public static void findSubarrayWithSum(int[] arr, int S) {
        int n = arr.length;
        int start = 0; 
        int currentSum = 0; 

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > S && start < end) {
                currentSum -= arr[start];
                start++;
            }
			
            if (currentSum == S) {
                System.out.println("Subarray found from index " + start + " to " + end);
                System.out.print("Subarray: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;
            }
        }

        
        System.out.println("No subarray found with sum " + S);
    }
}