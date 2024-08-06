/*  287. Find the Duplicate Number
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
 */

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.print("Duplicate number: " + findDuplicate(nums));
    }

    public static int findDuplicate(int nums[]) {
        Arrays.sort(nums);
        int val = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                val = nums[i];
            }
        }
        return val;
    }
}
