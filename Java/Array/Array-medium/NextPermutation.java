// 31. Next Permutation
/*
 A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]
 */

//  Algorithm: 
// 1. find the breakpoint where a[i] < a[i+1]
// 2. find the index where the element is just greater than a[i] and is smallest in the remaining array
// 3. swap the elements a[i] and greater element than a[i]
// 4. reverse the remaining array

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int nums[]) {
        if (nums.length <= 1)
            return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i])
                j--;
            swap(nums, i, j);

        }
        reverse(nums, i + 1, nums.length - 1);
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}
