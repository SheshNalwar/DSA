public class ArrayStack {
    int[] ar;
    int top = -1;
    final int DEFAULT_SIZE = 10;

    public ArrayStack() {
        this.ar = new int[DEFAULT_SIZE];
    }

    public ArrayStack(int size) {
        this.ar = new int[size];
    }

    int push(int item) {
        if (top == ar.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        ar[++top] = item;
        return item;
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return ar[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        boolean val = stack.isEmpty();
        System.out.println(val);
        stack.display();
    }
}
