import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack(); // Create an instance of MinStack
        minStack.push(2); // Push 2
        minStack.push(3); // Push 3
        minStack.push(4); // Push 4
        System.out.println("Minimum: " + minStack.getMin()); // Output: 2

        minStack.pop(); // Pop 4
        minStack.push(1); // Push 1
        System.out.println("Top: " + minStack.top()); // Output: 1

        minStack.push(2); // Push 2
        minStack.push(0); // Push 0
        System.out.println("Minimum: " + minStack.getMin()); // Output: 0

        minStack.pop(); // Pop 0
        System.out.println("Minimum after popping: " + minStack.getMin()); // Output: 1
    }

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int a = minStack.peek();
        int temp = stack.pop();
        if (temp == a) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
