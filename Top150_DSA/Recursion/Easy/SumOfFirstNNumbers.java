
public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        sumOfFirstNNumbers(n, sum);
    }

    public static void sumOfFirstNNumbers(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }

        sum += n;

        sumOfFirstNNumbers(n - 1, sum);

    }
}
