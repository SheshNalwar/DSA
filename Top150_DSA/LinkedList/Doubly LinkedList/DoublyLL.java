
public class DoublyLL {
    private Node head;
    private int size;

    DoublyLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        DoublyLL dll = new DoublyLL();
        dll.insert(arr);
        dll.display();
        dll.deleteKthElement(2);
        dll.display();

    }

    public void insert(int[] arr) {
        head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], null, prev);
            prev.next = newNode;
            prev = newNode;
        }
        size += 1;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            size -= 1;
        } else {
            head = head.next;
            head.prev = null;
            size -= 1;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            head.prev = null;
            size -= 1;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node back = temp.prev;
            back.next = null;
            temp.prev = null;
            temp.next = null;
        }
    }

    public void deleteKthElement(int k) {
        if (head == null) {
            return;
        } else if (k == 1) {
            head = null;
            head.prev = null;
            size -= 1;
        } else {
            int count = 0;
            Node temp = head;
            while (temp.next != null) {
                count++;
                if (count == k) {
                    break;
                }
                temp = temp.next;

            }
            Node back = temp.prev;
            Node front = temp.next;

            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;
            size -= 1;
        }
    }

    public void deleteByValue(int val) {

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
