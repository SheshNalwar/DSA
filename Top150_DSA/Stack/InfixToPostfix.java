import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(str));
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

    public static String infixToPostfix(String exp) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < exp.length()) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result = result + ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result = result + stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result = result + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
            i++;
        }

        while (!stack.isEmpty()) {
            result += stack.peek();
            stack.pop();
        }

        return result;
    }
}