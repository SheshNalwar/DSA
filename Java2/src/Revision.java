import java.util.Arrays;
import java.util.Stack;

public class Revision {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int array2[]={1,2,3,5,4};
        int array3[]={2,2,1};
        String s = "fried";
        String t = "fired";
        System.out.println(palindromeStringPointers("abba"));
    }
    static int linearSearch(int ar[],int target){
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]==target){
                System.out.print("Found at index ");
                return i;
            }
        }
        return -1;
    }
    static boolean sortedorNotArray(int ar[]){
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]>ar[i+1]){
                return false;
            }
        }
        return true;
    }
    static int[] reverseArray(int ar[]){
        int start = 0;
        int end = ar.length-1;
        while (start<end){
            int temp = ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
        return ar;
    }
    static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
    static boolean containsDuplicate(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i==j)continue;
                if (ar[i]==ar[j])return true;
            }
        }
        return false;
    }
    static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                        (c == ']' && top == '[') ||
                        (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
       return stack.isEmpty();
    }
    static boolean palindromeString(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length()/2; i++) {
            stack.push(s.charAt(i));
        }
        int start = s.length()%2==0 ? s.length()/2 : (s.length()/2)+1;
        for (int i = start; i < s.length(); i++) {
            if (stack.peek()==s.charAt(i))stack.pop();
        }
        return stack.isEmpty();
    }
    static boolean palindromeStringPointers(String s){
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else return false;
        }
        return true;
    }
}
