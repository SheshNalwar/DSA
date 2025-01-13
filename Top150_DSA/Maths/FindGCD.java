public class FindGCD {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;

        System.out.println(bruteForce(num1, num2));
    }

    public static int bruteForce(int n1, int n2) {
        int gcd = 1;

        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}