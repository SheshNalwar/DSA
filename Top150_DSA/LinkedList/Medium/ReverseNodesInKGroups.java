public class ReverseNodesInKGroups {

    public static Node solution(Node head, int k) {
        if (head == null || head.next == null || k <= 0)
            return head;

        Node temp = head;
        Node prevLast = null;
        while (temp != null) {
            Node KthNode = findKthNode(temp, k);
            if (KthNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }
            Node nextNode = KthNode.next;
            KthNode.next = null;
            reverseLL(temp);
            if (temp == head) {
                head = KthNode;
            } else {
                prevLast.next = KthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

    public static Node findKthNode(Node head, int k) {
        k -= 1;
        while (head != null && k > 0) {
            k--;
            head = head.next;
        }

        return head;
    }

    public static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;

        Node prev = null;
        while (temp != null) {

            Node front = temp.next;

            temp.next = prev;

            prev = temp;

            temp = front;
        }
        return prev;
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