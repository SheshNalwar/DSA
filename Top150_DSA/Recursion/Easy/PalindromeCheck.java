public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palindrome(str, 0, str.length() - 1));
    }

    public static boolean palindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return palindrome(str, left + 1, right - 1);
    }
}
