public class LargestOddNumberString {
    public static void main(String[] args) {
        String str = "35427";
        System.out.println(largestOddNumber(str));
    }

    public static String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0) {
            int n = num.charAt(i);
            if (n % 2 == 1)
                return num.substring(0, i + 1);
            i--;
        }

        return "";
    }
}
