/*
 * 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
 */

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() == 0)
            return false;
        Stack<Character> st = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                char ch = st.pop();
                if ((c == ')' && ch != '(') || (c == ']' && ch != '[') || (c == '}' && ch != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
