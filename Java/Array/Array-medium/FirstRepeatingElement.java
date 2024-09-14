/**
 * FirstRepeatingElement
 * 
 * Problem
 * Given an array arr[] of size N. The task is to find the first repeating
 * element in an
 * array of integers, i.e., an element that occurs more than once and whose
 * index of
 * first occurrence is smallest.
 * 
 * Constraints
 * 1 <= N <= 106
 * 0 <= Ai <= 106
 * 
 * Example
 * 
 * Input:
 * 7
 * 1 5 3 4 3 5 6
 * 
 * Output:
 * 2
 * 
 * Explanation:
 * 5 is appearing twice and its first appearance is at index 2 which is less
 * than 3
 * whose first occurring index is 3.
 * Solution
 * Base idea: To check if an element is repeating, we maintain an array idx[],
 * which
 * stores the first occurrence (index) of a particular element a[i].
 */
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int nums[] = { 1, 5, 3, 4, 3, 5, 6 };
        System.out.println(firstRepeatingElement(nums));
    }

    public static int firstRepeatingElement(int nums[]) {
        int minidx = Integer.MAX_VALUE;
        int idx[] = new int[1000001];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (idx[nums[i]] != -1) {
                minidx = Math.min(minidx, idx[nums[i]]);
            } else {
                idx[nums[i]] = i;
            }
        }

        if (minidx == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minidx + 1;
        }

    }
}