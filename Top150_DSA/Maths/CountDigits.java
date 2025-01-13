
public class CountDigits {

    public static int solution(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(solution(n));
    }
}