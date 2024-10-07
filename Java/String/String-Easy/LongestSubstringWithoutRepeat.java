import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

/**
 * LongestSubstringWithoutRepeat
 */
public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Max length of substring without repeating characters: " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        List<Character> list = new ArrayList<Character>();
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.remove((Character) s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}