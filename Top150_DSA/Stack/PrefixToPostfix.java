import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-+a*b^-^cde+f*ghi";
        System.out.println(prefixToPostfix(str));
    }

    public static String prefixToPostfix(String str) {
        Stack<String> stack = new Stack<>();
        int i = str.length() - 1;
        while (i >= 0) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String t2 = stack.pop();
                String t1 = stack.pop();
                String temp = t2 + t1 + ch;

                stack.push(temp);
            }

            i--;
        }

        return stack.peek();
    }
}
