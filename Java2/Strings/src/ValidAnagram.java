import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean anag = anagram("rat","car");
//        System.out.println(anag);
    }
    public static boolean anagram(String a, String b){
        HashMap<Character, Integer> count = new HashMap<>();
        for (char x : a.toCharArray()) {
//            count.put(x, count.getOrDefault(x, 0) + 1);
            System.out.println(x);
        }
        for (char x : b.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
