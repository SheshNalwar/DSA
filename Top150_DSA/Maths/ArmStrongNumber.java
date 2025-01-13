public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(armstrongNumber(num));
    }

    public static boolean armstrongNumber(int num) {
        int length = String.valueOf(num).length();

        int n = num;

        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, length);

            n = n / 10;
        }

        return sum == num ? true : false;

    }

}
