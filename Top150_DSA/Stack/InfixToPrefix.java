import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPrefix(str));
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '(') {
                sb.append(')');
            } else if (ch == ')') {
                sb.append('(');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String infixToPrefix(String exp) {
        Stack<Character> st = new Stack<>();
        String result = new String("");

        exp = reverse(exp);

        int i = 0;
        while (i < exp.length()) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result += st.peek();
                    st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && precedence(ch) < precedence(st.peek())) {
                    result += st.peek();
                    st.pop();
                }
                st.push(ch);
            }

            i++;
        }

        while (!st.isEmpty()) {
            result += st.peek();
            st.pop();
        }

        exp = reverse(result);
        return exp;

    }
}
