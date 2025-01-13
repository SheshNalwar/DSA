
public class ReverseNumber {

    public static int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n = n / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
    }
}
