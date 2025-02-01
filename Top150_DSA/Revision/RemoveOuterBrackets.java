public class RemoveOuterBrackets {

    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOuterBrackets(str));
    }

    public static String removeOuterBrackets(String str) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                if (depth > 0) {
                    sb.append(ch);
                }
                depth++;
            } else if (ch == ')') {
                depth--;
                if (depth > 0) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}