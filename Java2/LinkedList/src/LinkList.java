public class LinkList {
    private Node head;
    private Node tail;
    private int size=0;
    private class Node{
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
    void insertAtStart(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    void insertAtEnd(int data){
        Node node = new Node(data);
        if (tail==null){
            insertAtStart(data);
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    void insertAtIndex(int index,int data){
        Node temp = head;
        if (index==0){
            insertAtStart(data);
        }
        if (index==size){
            insertAtEnd(data);
        }
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(data);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    void insertRec(int data, int index) {
        head = insertRec(data, index, head);
    }
    private Node insertRec(int data, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(data, node);
            size++;
            return temp;
        }
        if (node == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        node.next = insertRec(data, --index, node.next);
        return node;
    }

    void deleteFirst(){
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
    }
    void deleteLast(){
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertAtStart(4);
        ll.insertAtStart(3);
        ll.insertAtStart(2);
        ll.insertAtEnd(5);
        ll.insertRec(40,2);

//        ll.deleteFirst();
//        ll.deleteLast();
        ll.display();
    }
}