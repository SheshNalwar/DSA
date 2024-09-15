/**
 * SubarrayWithGivenSum
 * 
 * Problem
 * Given an unsorted array A of size N of non-negative integers, find a
 * continuous
 * subarray which adds to a given number S.
 * 
 * Constraints
 * 1 <= N <= 105
 * 0 <= Ai <= 1010
 * 
 * Example
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements from 2nd position to 4th position is 12.
 * 
 * Solution
 * Brute Force Solution
 * ● Find sum of all possible subarrays. If any of the sum equates to S, output
 * the starting and ending index of the subarray.
 * Time Complexity : O(n2
 * )
 * 
 * Optimized Approach
 * Steps:
 * 1. Keep the pointers st and en, and a variable currSum that stores the sum
 * from st to en.
 * 2. initialize st = 0, en = 0
 * 3. Increment en till currSum + a[en + 1] > S
 * 4. When 3rd condition occurs, start increasing st until currSum <= S.
 * 
 * 5. Whenever the condition (currSum = S) is satisfied, store st and en and
 * BREAK from the loop.
 * 
 * Time Complexity: O(n)
 */
public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 8 };
        int sum = 5;
    }

    public static void subarrayWithGivenSum(int nums[], int sum) {
        int i = 0, j = 0, st = -1, end = -1, currSum = 0;
        while (j < nums.length && currSum + nums[j] <= sum) {
            currSum += nums[j];
            j++;
        }

    }
}