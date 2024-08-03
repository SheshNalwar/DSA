public class CircularLL {
    Node head;
    Node tail;

    private class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }
    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node temp = head;
        do {
            Node nextNode = temp.next;
            if (nextNode.data == data) {
                temp.next = nextNode.next;
                if (nextNode == tail) {
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }
    void display() {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.print("head");
        } else {
            System.out.print("List is empty");
        }
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insert(4);
        cll.insert(5);
        cll.insert(7);
        cll.insert(8);
        cll.insert(9);
        cll.insert(19);
        cll.display();
        cll.delete(19);
        cll.display();
    }
}
