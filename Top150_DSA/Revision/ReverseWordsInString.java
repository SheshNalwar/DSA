public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str) {
        String ans = "";
        String temp = "";
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            char ch = str.charAt(left);

            if (ch != ' ') {
                temp += ch;
            } else {
                if (!ans.isEmpty()) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }

            left++;
        }

        if (temp != "") {
            if (!ans.isEmpty()) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
            temp = "";
        }

        return ans;
    }
}
