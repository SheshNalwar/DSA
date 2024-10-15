import java.util.Stack;

/**
 * MinRemoveToMakeValid
 * Given a string s of '(' , ')' and lowercase English characters.
 * 
 * Your task is to remove the minimum number of parentheses ( '(' or ')', in any
 * positions ) so that the resulting parentheses string is valid and return any
 * valid string.
 * 
 * Formally, a parentheses string is valid if and only if:
 * 
 * It is the empty string, contains only lowercase characters, or
 * It can be written as AB (A concatenated with B), where A and B are valid
 * strings, or
 * It can be written as (A), where A is a valid string.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 */
public class MinRemoveToMakeValid {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";

        System.out.println(minRemoveToMakeValid(s));
    }

    public static String minRemoveToMakeValid(String str) {
        Stack<Integer> st = new Stack<>();
        StringBuilder s = new StringBuilder(str);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                if (!st.isEmpty() && s.charAt(st.peek()) == '(') {
                    st.pop();
                } else {
                    st.push(i);
                }
            }
        }

        while (!st.isEmpty()) {
            s.deleteCharAt(st.peek());
            st.pop();
        }

        return s.toString();

    }
}