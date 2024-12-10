/*
 * 796. Rotate String

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false
 
 */

public class RotateString {

    public static void main(String[] args) {
        String s = "abc";
        String goal = "bca";

        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        int m = s.length();
        int n = goal.length();

        if (m != n) {
            return false;
        }

        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < m; i++) {
            leftRotateString(str);

            if (str.toString().equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public static void leftRotateString(StringBuilder str) {
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            str.setCharAt(i - 1, str.charAt(i));
        }

        str.setCharAt(str.length() - 1, ch);
    }

}