/**
 * AddStrings
 */
public class AddStrings {

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "78";

        System.out.println(addString(str1, str2));
    }

    public static String addString(String str1, String str2) {

        int n1 = str1.length() - 1;
        int n2 = str2.length() - 1;
        int carry = 0;
        int base = 10;
        StringBuilder ans = new StringBuilder();

        while (n1 >= 0 || n2 >= 0) {
            int s = 0, s1 = 0, s2 = 0;
            if (n1 >= 0) {
                s1 = str1.charAt(n1--) - '0';
            }
            if (n2 >= 0) {
                s2 = str2.charAt(n2--) - '0';
            }
            s = s1 + s2 + carry;
            if (s >= base) {
                carry = 1;
                s = s - base;
            } else {
                carry = 0;
            }

            ans.append(s);
        }

        if (carry == 1) {
            ans.append(carry);
        }
        return ans.reverse().toString();

    }
}