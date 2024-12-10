public class RotateString {

    public static void main(String[] args) {
        String s = "abc";
        String goal = "bca";

        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        int m = s.length();
        int n = goal.length();

        if (m != n) {
            return false;
        }

        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < m; i++) {
            leftRotateString(str);

            if (str.toString().equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public static void leftRotateString(StringBuilder str) {
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            str.setCharAt(i - 1, str.charAt(i));
        }

        str.setCharAt(str.length() - 1, ch);
    }

}