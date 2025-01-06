
public class ReverseLinkedList {
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

    // Using recursion:- Time Complexity - O(N)
    public static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newhead = reverseLL(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newhead;
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
        ReverseLinkedList obj = new ReverseLinkedList();
        Node head = obj.new Node(1);
        head.next = obj.new Node(2);
        head.next.next = obj.new Node(3);
        head.next.next.next = obj.new Node(4);
        head.next.next.next.next = obj.new Node(5);

        Node newHead = reverseLL(head);
        print(newHead);

    }
}
