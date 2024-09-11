/*   Maximum subarray sum
 * Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

/**
 * MaximumSubarray
 */

// Kadane's Algorithm
public class MaximumSubarray {

    public static void main(String[] args) {
        int nums[] = { -1, 4, -6, 7, -4 };
        System.out.println("\nMaximum sum of subarray: " + maximumSubarraySum(nums));
    }

    public static int maximumSubarraySum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;

        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}