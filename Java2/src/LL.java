public class LL {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data, Node next1) {
            this.data = data;
            this.next = next1;
        }

        Node(int data) {
            this.data = data;
        }
        void print() {
            Node current = this;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node newNode = new Node(1);
        Node newNode2 = new Node(2, null);
        newNode.next = newNode2;
        newNode.print();
    }
}
