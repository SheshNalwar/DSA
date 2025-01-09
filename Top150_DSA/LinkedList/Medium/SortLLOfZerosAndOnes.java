public class SortLLOfZerosAndOnes {

    // brute force
    // Time complexity O(2N)
    // Space complexity O(1)
    public static Node bruteForce(Node head) {
        Node temp = head;
        int count0 = 0, count1 = 0, count2 = 0;

        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (count0 > 0) {
                temp.data = 0;
                count0--;
            } else if (count1 > 0) {
                temp.data = 1;
                count1--;
            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }

    // Optimal approach
    // Time complexity - O(N)
    // Space complexity - O(1)
    public static Node optimal(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twoHead = new Node(-1);
        Node two = twoHead;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }

            temp = temp.next;
        }

        zeroHead = zeroHead.next;
        oneHead = oneHead.next;
        twoHead = twoHead.next;
        head = zeroHead;
        zero.next = oneHead;
        one.next = twoHead;
        two.next = null;

        return head;
    }

    // print the linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(1);
        System.out.println("Before sorting");
        print(head);
        System.out.println("Sorted linked list");
        Node newHead = optimal(head);
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
