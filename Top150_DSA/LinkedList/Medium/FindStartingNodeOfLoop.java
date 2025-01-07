import java.util.HashMap;

public class FindStartingNodeOfLoop {

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

    // Brute force approach
    // Time Complexity - O(N) Space Complexity - O(N)
    public static Node bruteForce(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();

        Node temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return temp;
            }

            map.put(temp, 1);
            temp = temp.next;
        }

        return null;
    }

    // Optimal Solution
    // Time Complexity O(N) Space Complexity O(1)
    public static Node optimalSolution(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }

        }

        return null;
    }

    public static void main(String[] args) {
        FindStartingNodeOfLoop obj = new FindStartingNodeOfLoop();
        // Create a sample linked list with a loop
        Node node1 = obj.new Node(1);
        Node node2 = obj.new Node(2);
        node1.next = node2;
        Node node3 = obj.new Node(3);
        node2.next = node3;
        Node node4 = obj.new Node(4);
        node3.next = node4;
        Node node5 = obj.new Node(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        Node head = node1;

        // Detect the loop in the linked list
        Node loopStartNode = optimalSolution(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}