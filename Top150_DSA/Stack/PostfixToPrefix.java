import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "abcd^e-fgh*+^*+i-";
        System.out.println(postfixToPrefix(str));
    }

    public static String postfixToPrefix(String str) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String temp = ch + operand1 + operand2;
                stack.push(temp);
            }

            i++;
        }

        return stack.peek();
    }
}
