public class StringPermutation {

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";

        permutation(str, ans);
    }

    public static void permutation(String str, String ans) {

        // Base condition
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Rest of string excluding the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            permutation(ros, ans + ch);
        }
    }
}