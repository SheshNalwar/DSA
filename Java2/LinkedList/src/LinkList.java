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
        insertRec(data,index,head);
    }
    void insertRec(int data, int index, Node temp) {
        if (index<=1){
            Node node = new Node(data);
            node.next=temp.next;
            temp.next=node;
            return;
        }
        if (temp==null){
            System.out.println("Null");
        }
        insertRec(data,index-1,temp.next);
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
    void displayRec(){
        displayRec(head);
        System.out.print("null");
    }
    void displayRec(Node temp){
        if (temp==null){
            return;
        }
        System.out.print(temp.data+" -> ");
        displayRec(temp.next);
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertAtStart(4);
        ll.insertAtStart(3);
        ll.insertAtStart(2);
        ll.insertAtStart(1);
        ll.insertRec(27,2);
//        ll.deleteFirst();
//        ll.deleteLast();
        ll.displayRec();
    }
}
