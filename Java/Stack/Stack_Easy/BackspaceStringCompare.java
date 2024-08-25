/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
 */
package Java.Stack.Stack_Easy;

import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !st1.isEmpty()) {
                st1.pop();
            } else if (s.charAt(i) != '#') {
                st1.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && !st2.isEmpty()) {
                st2.pop();
            } else if (t.charAt(i) != '#') {
                st2.push(t.charAt(i));
            }
        }

        if (st1.size() != st2.size()) {
            return false;
        } else {
            while (!st1.isEmpty()) {
                if (st1.peek() != st2.peek()) {
                    return false;
                } else {
                    st1.pop();
                    st2.pop();
                }
            }
            return true;
        }
    }

}
