/*
 * 242. Valid Anagram

Given two strings s and t, return true if t is an 
anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.getOrDefault(c, 0) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }

}
