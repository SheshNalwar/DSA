//Find Pivot Index

/*
 * Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
 */
public class PivotIndex {

    public static void main(String[] args) {
        int nums[] = { 1, 7, 3, 6, 5, 6 };
        int output = 3;
        int result = findPivot(nums);
        System.out.println("Output: " + result);
        if (output == result) {
            System.out.println("Solution is accepted");
        }

    }

    public static int findPivot(int nums[]) {
        // time complexity = O(n) and space complexity = O(1)
        int leftSum = 0, rightSum = 0, totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - nums[i] - leftSum; // calculate the rightSum

            if (leftSum == rightSum) { // check if the pivot is found
                return i;
            }

            leftSum += nums[i]; // updating the leftSum
        }

        return -1;
    }
}