import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
    }

    public static String longestCommonPrefix(String str) {
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            str.append(first[i]);
        }

        return str.toString();
    }
}