/*
1209. Remove All Adjacent Duplicates in String II

 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.

Example 1:
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.

Example 2:
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"

Example 3:
Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"
 */

package Java.Stack.Stack_Easy;

import java.util.Stack;

public class RemoveAdjacentDuplicates2 {

    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.size() > 0 && st.peek() == ch) {
                count.push(count.peek() + 1);
            } else {
                count.push(1);
            }
            st.push(ch);

            if (count.peek() == k) {
                for (int j = 0; j < k; j++) {
                    st.pop();
                    count.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (st.size() != 0) {
            ans.insert(0, st.pop());
        }

        return ans.toString();

    }
}
