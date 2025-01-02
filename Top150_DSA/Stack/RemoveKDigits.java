/*
 * 402. Remove K Digits

Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Example 2:
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

Example 3:
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        // Step 1: Build the stack by removing larger digits when possible
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        // Step 2: Remove remaining digits if `k` is still greater than 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Step 3: Build the result from the stack
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        res.reverse(); // Reverse the result as stack gives characters in reverse order

        // Step 4: Remove leading zeros
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        // Step 5: Return "0" if the result is empty
        return res.length() == 0 ? "0" : res.toString();
    }
}