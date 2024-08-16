// 532. K-diff Pairs in an Array
/*
 * Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.

Example 1:
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
*/

import java.util.Arrays;

public class K_Difference {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5 };
        int k = 2;
        System.out.println("No of k-diff pairs in array: " + findDiff(nums, k));

    }

    public static int findDiff(int nums[], int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = i + 1;
        int pairs = 0;
        int n = nums.length;

        while (j < n && i < n) {
            if (i == j) {
                j++;
            } else {
                if (nums[j] - nums[i] == k) {
                    pairs++;
                    i++;
                    while (i < n && nums[i] == nums[i - 1]) {
                        i++;
                    }
                } else if (nums[j] - nums[i] > k) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        return pairs;
    }
}
