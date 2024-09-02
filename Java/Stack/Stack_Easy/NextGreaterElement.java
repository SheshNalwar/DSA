/*
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 */

package Java.Stack.Stack_Easy;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 4, 2 }; // output : [-1,3,-1]
        System.out.println(Arrays.toString(nextGreaterElement(nums1)));
    }

    public static int[] nextGreaterElement(int nums[]) {
        int[] arr = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (st.empty()) {
                arr[i] = -1;
            } else {
                arr[i] = st.peek();
            }
            st.push(nums[i]);
        }

        return arr;
    }
}
