/*  Write a Java program to find the maximum product of two integers in a given array of 
integers. 
Example: 
Input : 
nums = { 2, 3, 5, 7, -7, 5, 8, -5 } 
Output: 
Pair is (7, 8), Maximum Product: 56 */

public class MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        findMaxProduct(nums);
    }

    public static void findMaxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int product1 = max1 * max2; 
        int product2 = min1 * min2; 

        if (product1 > product2) {
            System.out.println("Pair is (" + max1 + ", " + max2 + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + min1 + ", " + min2 + "), Maximum Product: " + product2);
        }
    }
}