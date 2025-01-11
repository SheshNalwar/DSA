public class Add1ToLL {

    public static Node add1ToLL(Node head) {
        int carry = helper(head);
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public static int helper(Node temp) {
        if (temp == null) {
            return 1;
        }

        int carry = helper(temp.next);
        temp.data += carry;
        if (temp.data < 10) {
            return 0;
        }

        temp.data = 0;
        return 1;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node newHead = add1ToLL(head);
        print(newHead);
    }
}

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}