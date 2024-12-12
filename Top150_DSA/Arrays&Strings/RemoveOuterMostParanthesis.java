public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        String str = "(()())(())";

        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String s) {
        int depth = 0;
        int index = 0;
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (depth > 0) {
                    result[index] = c;
                    index++;
                }
                depth++;
            } else if (c == ')') {
                depth--;
                if (depth > 0) {
                    result[index] = c;
                    index++;
                }
            }
        }
        return new String(result, 0, index);
    }
}
