import java.util.LinkedList;

public class ArrayToSinglyLL {

    private Node head;
    private int size;

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayToSinglyLL obj = new ArrayToSinglyLL();
        obj.arrayToSinglyLL(arr);
        obj.display();
        obj.delete(2);
        obj.display();
    }

    ArrayToSinglyLL() {
        this.size = 0;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void arrayToSinglyLL(int[] arr) {
        head = new Node(arr[0]);
        Node current = head; // Use a pointer to keep track of the last node

        for (int i = 1; i < arr.length; i++) { // Start from the second element
            Node newNode = new Node(arr[i]);
            current.next = newNode; // Link the current node to the new node
            current = newNode; // Move the pointer to the new node
            size++;
        }
        size++; // Include the head node in the size
    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void delete(int val) {
        if (head == null)
            return; // If the list is empty, do nothing
        if (head.data == val) {
            head = head.next; // If the head node has the value, remove it
            size--;
            return;

        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == val) {
                current.next = current.next.next; // If the next node has the value, remove it
                size--;
                return;
            }
            current = current.next;
        }
    }

}