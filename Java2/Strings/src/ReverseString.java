public class ReverseString {
    public static void main(String[] args) {
        optimized("Umesh");
    }
    static void optimized(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
    static void brute(String s){
        String reversed = "";
        char [] characters = s.toCharArray();
        for (int i = s.length()-1; i >=0; i--) {
            reversed+=characters[i];
        }
        System.out.println(reversed);
    }
}
