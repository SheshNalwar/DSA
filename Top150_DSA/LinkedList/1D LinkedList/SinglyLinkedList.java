
public class SinglyLinkedList {

    private Node head;

    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            head.next = null;
        } else {
            node.next = head;
            head = node;
        }

        size += 1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            head.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
        size += 1;
    }

    public void insertInBetween(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        Node node = new Node(val);
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size -= 1;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) { // Case 2: List with only one node
            head = null; // Remove the only node
            size -= 1;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) { // Traverse to the second-to-last node
            temp = temp.next;
        }

        temp.next = null; // Remove the last node
        size -= 1;
    }

    public void deleteInBetween(int index) {
        if (head == null) { // Case 1: Empty list
            System.out.println("List is empty");
            return;
        }

        if (index == 0) { // Case 3: Deleting the first node
            deleteFirst();
            return;
        }

        if (index == size - 1) { // Case 4: Deleting the last node
            deleteLast();
            return;
        }

        // Case 5: Deleting a node in the middle
        Node temp = head;
        for (int i = 1; i < index; i++) { // Traverse to the node before the target
            temp = temp.next;
        }
        temp.next = temp.next.next; // Bypass the target node
        size -= 1;
    }

    public int searchElement(int val) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value == val) {
                return index; // Return the index of the found element
            }
            temp = temp.next;
            index += 1;
        }
        return -1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertInBetween(7, 3);
        list.insertLast(6);
        list.deleteFirst();
        list.display();
        list.insertLast(8);
        list.display();
        list.deleteLast();
        list.display();
        list.deleteInBetween(2);
        list.display();
        System.out.println(list.searchElement(7));
    }
}
