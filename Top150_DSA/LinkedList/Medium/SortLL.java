import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

public class SortLL {

    // Brute force
    // Time complexity O(2N), Space complexity O(N)
    public static Node bruteForce(Node head) {
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);
        temp = head;

        int i = 0;
        while (temp != null) {
            temp.data = list.get(i++);
            temp = temp.next;
        }

        return head;
    }

    // optimal solution
    // Time complexity O(Nlogn), Space complexity O(1)
    public static Node mergeSortLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = findMiddle(head);
        Node leftHead = head;
        Node rightHead = middle.next;
        middle.next = null;

        leftHead = mergeSortLL(leftHead);
        rightHead = mergeSortLL(rightHead);

        return mergeLL(leftHead, rightHead);
    }

    // Merge two linkedList
    public static Node mergeLL(Node leftNode, Node rightNode) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (leftNode != null && rightNode != null) {
            if (leftNode.data <= rightNode.data) {
                temp.next = leftNode;
                leftNode = leftNode.next;
            } else {
                temp.next = rightNode;
                rightNode = rightNode.next;
            }
            temp = temp.next;
        }

        if (leftNode != null) {
            temp.next = leftNode;
        } else {
            temp.next = rightNode;
        }

        return dummyNode.next;
    }

    // find the middle node of linked list
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
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

        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println("Before sorting");
        print(head);
        System.out.println("Sorted linked list");
        Node newHead = mergeSortLL(head);
        print(newHead);
    }
}
