import java.util.HashSet;

class Node {
    int num;
    Node next;

    Node(int val) {
        num = val;
        next = null;
    }
}

public class FindIntersectionOfTwoLL {

    public static Node bruteForce(Node head1, Node head2) {
        HashSet<Node> set = new HashSet<>();
        Node temp = head1;

        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = head2;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    // utility function to check presence of intersection
    static Node bruteForce2(Node head1, Node head2) {
        int diff = bruteForce2Helper(head1, head2);
        if (diff < 0)
            while (diff++ != 0)
                head2 = head2.next;
        else
            while (diff-- != 0)
                head1 = head1.next;
        while (head1 != null) {
            if (head1 == head2)
                return head1;
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1;

    }

    static int bruteForce2Helper(Node head1, Node head2) {
        int len1 = 0, len2 = 0;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                ++len1;
                head1 = head1.next;
            }
            if (head2 != null) {
                ++len2;
                head2 = head2.next;
            }

        }
        return len1 - len2;// if difference is neg-> length of list2 > length of list1 else vice-versa
    }

    public static Node optimised(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2) {
                return temp1;
            }

            if (temp1 == null) {
                temp1 = head2;
            }
            if (temp2 == null) {
                temp2 = head1;
            }
        }

        return temp1;
    }

    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    static void printList(Node head) {
        while (head.next != null) {
            System.out.print(head.num + "->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    public static void main(String[] args) {
        // creation of both lists
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec = insertNode(headSec, 3);
        Node head2 = headSec;
        headSec.next = head;
        // printing of the lists
        System.out.print("List1: ");
        printList(head1);
        System.out.print("List2: ");
        printList(head2);
        // checking if intersection is present
        Node answerNode = optimised(head1, head2);
        if (answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is " + answerNode.num);

    }
}