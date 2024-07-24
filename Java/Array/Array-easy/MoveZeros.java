// Move Zeros 
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]  
*/

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros(int nums[]) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

}