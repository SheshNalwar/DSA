public class LargestOddNumberStirng {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(largestOddNumber(str));
    }

    public static String largestOddNumber(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            int n = str.charAt(i);
            if (n % 2 == 1) {
                return str.substring(0, i + 1);
            }
        }

        return "";
    }
}
