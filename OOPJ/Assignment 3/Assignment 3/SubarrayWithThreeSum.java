// Write a Java program to print all sub-arrays with 0 sum present in a given array of integers. 
/*Example: 
Input : 
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 } 
nums2 = { 1, 2, -3, 4, 5, 6 } 
nums3= { 1, 2, -2, 3, 4, 5, 6 } 
Output: 
Sub-arrays with 0 sum : [1, 3, -7, 3] 
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2] 
Sub-arrays with 0 sum : [1, 2, -3] 
Sub-arrays with 0 sum : [2, -2] */

import java.util.Scanner;

class SubarrayWithThreeSum {
    public static void main(String[] args) {
      
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

    
        int target = 6;

      
        System.out.println("Results for nums1:");
        findSubarrayWithSum(nums1, target);

        System.out.println("\nResults for nums2:");
        findSubarrayWithSum(nums2, target);

        System.out.println("\nResults for nums3:");
        findSubarrayWithSum(nums3, target);
    }

    public static void findSubarrayWithSum(int[] nums, int target) {
        int sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > target && start < end) {
                sum -= nums[start];
                start++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                System.out.print("Subarray: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
                return; 
            }
        }

        System.out.println("No subarray found with sum " + target);
    }
}