/*
 * Nearest Smaller Element

Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
More formally,

    G[i] for an element A[i] = an element A[j] such that 
    j is maximum possible AND 
    j < i AND
    A[j] < A[i]
Elements for which no smaller element exist, consider next smaller element as -1.

Return the integar array G such that G[i] contains nearest smaller number than A[i].If no such element occurs G[i] should be -1.


Input 1:
    A = [4, 5, 2, 10, 8]
Output 1:
    G = [-1, 4, -1, 2, 2]
    
Input 2:
    A = [3, 2, 1]
Output 2:
    [-1, -1, -1]
    
 */

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 };
        int res[] = prevSmaller(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int n = A.length;
        int ans[] = new int[n];

        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= A[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(A[i]);
        }

        return ans;
    }

}