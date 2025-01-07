import java.util.Stack;

public class PalindromeLinkedList {
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

    // bruteforce
    // timecomplexity O(N)
    // spacecomplexity O(N)
    public static boolean bruteForce(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.data != stack.peek()) {
                return false;
            }

            stack.pop();
            temp = temp.next;
        }

        return true;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println();
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = list.new Node(1);
        head.next = list.new Node(5);
        head.next.next = list.new Node(2);
        head.next.next.next = list.new Node(5);
        head.next.next.next.next = list.new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (bruteForce(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}
