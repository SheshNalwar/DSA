
public class RemoveNthNodeFromLast {
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

    // Brute force method
    // Time Complexity: O(Length)+O(Length-N)
    // Space Complexity: O(1)
    public static Node bruteForce(Node head, int N) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count == N) {
            Node newHead = head;
            head = head.next;
            newHead.next = null;
            return newHead;
        }

        int res = count - N;
        temp = head;

        while (res > 1) {
            temp = temp.next;
            res--;
        }

        Node deletedNode = temp.next;
        temp.next = deletedNode.next;
        deletedNode.next = null;

        return deletedNode;
    }

    public static Node optimal(Node head, int N) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            Node newHead = head;
            head = head.next;
            newHead.next = null;

            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        Node deleteNode = slow.next;
        slow.next = slow.next.next;
        deleteNode.next = null;

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
        RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
        Node head = obj.new Node(1);
        head.next = obj.new Node(2);
        head.next.next = obj.new Node(3);
        head.next.next.next = obj.new Node(4);
        head.next.next.next.next = obj.new Node(5);

        System.out.println("Before deleting node");
        print(head);

        Node newHead = optimal(head, 2);
        System.out.println("After deleting node");
        print(newHead);
    }
}
