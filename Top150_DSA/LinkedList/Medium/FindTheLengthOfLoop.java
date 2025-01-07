public class FindTheLengthOfLoop {
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

    public static int optimalSolution(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow, head);
            }
        }
        return 0;
    }

    public static int findLength(Node slow, Node fast) {
        int count = 0;

        while (slow != fast) {
            count++;
            fast = fast.next;
        }

        return count;
    }

    public static void main(String[] args) {
        FindTheLengthOfLoop obj = new FindTheLengthOfLoop();
        // Create a sample linked list with a loop
        Node head = obj.new Node(1);
        Node second = obj.new Node(2);
        Node third = obj.new Node(3);
        Node fourth = obj.new Node(4);
        Node fifth = obj.new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // This creates a loop
        fifth.next = second;

        int loopLength = optimalSolution(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }

}
