
public class CustomStack {
    int data[];
    int ptr=-1;
    final int DEFAULT_SIZE = 10;
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        System.out.println(stack.push(4));
        System.out.println(stack.push(3));
        System.out.println(stack.push(2));
        System.out.println(stack.push(1));
        System.out.println(stack.pop());
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public int push(int item){
        if (isFull()){
            return -1;
        }
        ptr++;
        data[ptr]=item;
        return item;
    }
    private boolean isFull(){
       return ptr==data.length-1;
    }
    public int pop(){
        if (isEmpty()) return -1;
        return data[ptr--];
    }
    public int peek(){
        if (isEmpty()) return -1;
        return data[ptr];
    }
    private boolean isEmpty(){
       return ptr==-1;
    }


}
