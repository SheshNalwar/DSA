// Running Sum of 1d Array

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        runningSum(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] runningSum(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
