public class LinkList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void insertAtEnd(int data) {
        Node node = new Node(data);
        if (tail == null) {
            insertAtStart(data);
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void insertAtIndex(int index, int data) {
        Node temp = head;
        if (index == 0) {
            insertAtStart(data);
        }
        if (index == size) {
            insertAtEnd(data);
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void insertRec(int data, int index) {
        insertRec(data, index, head);
    }

    void insertRec(int data, int index, Node temp) {
        if (index <= 1) {
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
            return;
        }
        if (temp == null) {
            System.out.println("Null");
        }
        insertRec(data, index - 1, temp.next);
    }

    void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    void deleteLast() {
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    void displayRec() {
        displayRec(head);
        System.out.print("null");
    }

    void displayRec(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " -> ");
        displayRec(temp.next);
    }

    // Questions :
    void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
    }

    public static LinkList mergeSortedList(LinkList list1, LinkList list2) {
        Node firstHead = list1.head;
        Node secondHead = list2.head;
        LinkList merged = new LinkList();
        while (firstHead != null && secondHead != null) {
            if (firstHead.data < secondHead.data) {
                merged.insertAtEnd(firstHead.data);
                firstHead = firstHead.next;
            } else {
                merged.insertAtEnd(secondHead.data);
                secondHead = secondHead.next;
            }
        }
        while (firstHead != null) {
            merged.insertAtEnd(firstHead.data);
            firstHead = firstHead.next;
        }
        while (secondHead != null) {
            merged.insertAtEnd(secondHead.data);
            secondHead = secondHead.next;
        }
        return merged;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        int counter = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = head;
                do {
                    temp = temp.next;
                    counter++;
                } while (temp != slow);
                return counter;
            }
        }
        return 0;
    }

    public int middleNode(Node head){
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public void recursivereverseLL(Node node){
        if (node==tail){
            head=tail;
            return;
        }
        recursivereverseLL(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    public static void main(String[] args) {
        LinkList first = new LinkList();
        LinkList second = new LinkList();
        first.insertAtEnd(1);
        first.insertAtEnd(2);
        first.insertAtEnd(4);
        first.insertAtEnd(5);
        first.insertAtEnd(6);
        first.insertAtEnd(7);
        second.insertAtEnd(1);
        second.insertAtEnd(3);
        second.insertAtEnd(4);
//        int middle = first.middleNode(first.head);
        System.out.println("Before Reversing : ");
        first.display();
        first.recursivereverseLL(first.head);
        System.out.println();
        System.out.println("After Reversing : ");
        first.display();
//        System.out.println(middle);

        // LinkList merged = LinkList.mergeSortedList(first, second);
        // merged.display();
    }
}
