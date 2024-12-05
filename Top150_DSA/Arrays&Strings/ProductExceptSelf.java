/*
 * 238. Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
 */

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int arr[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        Arrays.fill(temp, 1);

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            temp[i] *= product;
            product *= nums[i];
        }

        product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            temp[i] *= product;
            product *= nums[i];
        }

        return temp;
    }

}
