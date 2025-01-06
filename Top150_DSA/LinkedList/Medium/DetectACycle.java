
public class DetectACycle {
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

    // Optimal Approach
    // Time Complexity - O(N)
    public static boolean detectACycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        DetectACycle obj = new DetectACycle();
        Node head = obj.new Node(1);
        Node second = obj.new Node(2);
        Node third = obj.new Node(3);
        Node fourth = obj.new Node(4);
        Node fifth = obj.new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        System.out.println(detectACycle(head));

    }
}
