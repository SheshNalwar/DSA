
public class SegregateOddEvenNodes {

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

    // Solution
    // Time Complexity O(N/2) * 2 = O(N)
    // Space Complexity O(1)
    public static Node optimal(Node head) {

        if (head == null || head.next == null) {
            return head;

        }
        Node odd = head;
        Node even = head.next;

        Node evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
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
        SegregateOddEvenNodes list = new SegregateOddEvenNodes();
        // Create a linked list with
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        Node newHead = optimal(head);
        printLinkedList(newHead);
    }
}
