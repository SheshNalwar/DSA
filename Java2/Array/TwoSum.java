//Two sum problem

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Indices are : "+Arrays.toString(twoSumOptimized(arr, 7)));
    }

    public static int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static int[] twoSumOptimized(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int sum = arr[left]+arr[right];
            if (sum==target){
                return new int[]{left+1,right+1};
            }else if (sum<=target){
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }
}