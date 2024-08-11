public class StackImplimentation {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        int top = stack.top + 1;
        System.out.println(top);
        stack.display();
    }
}

class Stack {
    private static final int size = 10;
    protected int top = -1;
    int[] data = new int[size];

    void push(int n) {
        this.data[++top] = n;
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
