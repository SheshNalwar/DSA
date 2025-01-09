public class DeleteMiddleNode {
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

    // brute force
    // Time complexity = O(N) + O(N/2) == O(N)
    public static Node bruteForce(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int res = n / 2;

        temp = head;
        while (temp != null) {
            res--;
            if (res == 0) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        return head;

    }

    // Optimal
    // Time complexity = O(N/2)
    public static Node optimal(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;
        fast = fast.next.next; // skip one step of slow to reach the node before middle

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
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
        DeleteMiddleNode obj = new DeleteMiddleNode();
        Node head = obj.new Node(1);
        head.next = obj.new Node(2);
        head.next.next = obj.new Node(3);
        head.next.next.next = obj.new Node(4);
        head.next.next.next.next = obj.new Node(5);
        System.out.println("Before deleting node");
        print(head);

        Node newHead = optimal(head);
        System.out.println("After deleting node");
        print(newHead);
    }
}