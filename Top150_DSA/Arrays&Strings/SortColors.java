/*
 * 75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 
 */

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swaping(nums, mid, high);
                high--;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                swaping(nums, low, mid);
                low++;
                mid++;
            }
        }

        // Brute force approach

        // for(int i = 0 ; i < nums.length; i++){
        // for(int j = i; j < nums.length; j++){
        // if(nums[i] > nums[j]){
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // }
        // }
        // }

    }

    public static void swaping(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
