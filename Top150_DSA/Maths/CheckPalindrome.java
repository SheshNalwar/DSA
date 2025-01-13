
public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palindrome(n));
    }

    public static boolean palindrome(int n) {
        int temp = n;

        int reverse = 0;

        while (n > 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }

        if (temp == reverse) {
            return true;
        }
        return false;

    }
}
