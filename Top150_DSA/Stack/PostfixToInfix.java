import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "abcd^e-fgh*+^*+i-";
        System.out.println(postfixToInfix(str));
    }

    public static String postfixToInfix(String str) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                stack.push(String.valueOf(c));
            } else {
                String t2 = stack.pop();
                String t1 = stack.pop();
                String temp = "(" + t1 + c + t2 + ")";
                stack.push(temp);
            }

            i++;
        }

        return stack.peek();
    }
}
