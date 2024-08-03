public class DoublyLinkList {
    private Node head;
    private int size=0;
    private class Node{
        private int data;
        private Node next;
        private  Node prev;
        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    void insertAtStart(int data){
        Node node = new Node(data);
        node.next=head;
        if (head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("Reverse");
        while (last!=null){
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        DoublyLinkList dll = new DoublyLinkList();
        dll.insertAtStart(5);
        dll.insertAtStart(4);
        dll.insertAtStart(3);
        dll.insertAtStart(2);
        dll.insertAtStart(1);
        dll.display();
    }
}
