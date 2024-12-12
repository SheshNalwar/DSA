import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        boolean p = isValid("{}");
        System.out.println(p);
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
