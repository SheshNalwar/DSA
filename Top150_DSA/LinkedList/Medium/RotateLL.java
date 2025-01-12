public class RotateLL {

    public static Node solution(Node head, int k) {
        int length = 0;
        Node tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        if (k % length == 0) {
            return head;
        }

        k = k % length;
        tail.next = head;

        Node newTail = findNthNode(head, length - k);
        head = newTail.next;
        newTail.next = null;

        return head;
    }

    public static Node findNthNode(Node head, int k) {
        Node temp = head;
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
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

        Node newHead = solution(head, 2);
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