import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isomorphic("egg","ady"));
    }
    static boolean isomorphic(String s,String t){
        if (s.length()!=t.length())return false;
        HashMap<Character, Integer> sChars = new HashMap<>();
        HashMap<Character, Integer> tChars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sChars.containsKey(s.charAt(i))) {
                sChars.put(s.charAt(i), i);
            }
            if (!tChars.containsKey(t.charAt(i))) {
                tChars.put(t.charAt(i), i);
            }
            if (!sChars.get(s.charAt(i)).equals(tChars.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
