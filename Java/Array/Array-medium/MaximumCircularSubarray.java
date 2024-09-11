/**
 * MaximumCircularSubarray
 */

/*
 * Given a circular integer array nums of length n, return the maximum possible
 * sum of a non-empty subarray of nums.
 * 
 * A circular array means the end of the array connects to the beginning of the
 * array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the
 * previous element of nums[i] is nums[(i - 1 + n) % n].
 * 
 * A subarray may only include each element of the fixed buffer nums at most
 * once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does
 * not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 * 
 * Example 1:
 * Input: nums = [1,-2,3,-2]
 * Output: 3
 * Explanation: Subarray [3] has maximum sum 3.
 * 
 * Example 2:
 * Input: nums = [5,-3,5]
 * Output: 10
 * Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.
 */
public class MaximumCircularSubarray {
    public static void main(String[] args) {
        int nums[] = { 4, -4, 6, -6, 10, -11, 12 };
        System.out.println("Maximum Sum Circular Subarray : " + maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int nums[]) {
        int wrapSum = 0;
        int nonWrapSum = kadanes(nums);
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }

        wrapSum = totalSum + kadanes(nums);

        return Math.max(nonWrapSum, wrapSum);
    }

    public static int kadanes(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}