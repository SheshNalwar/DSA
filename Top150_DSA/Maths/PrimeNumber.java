public class PrimeNumber {

    public static void main(String[] args) {
        int n = 3;

        System.out.println(primeNumber(n));
    }

    public static boolean primeNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        }

        return false;
    }
}