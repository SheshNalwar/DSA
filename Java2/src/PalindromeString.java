import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(palindrome("abba"));
    }
    static boolean palindrome(String s){
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            stack.push(s.charAt(i));
        }
        int start = (n % 2 == 0) ? n/2 : (n/2)+1;
        for (int i = start; i < n; i++) {
            Character c = stack.peek();
            if (s.charAt(i)==c){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
