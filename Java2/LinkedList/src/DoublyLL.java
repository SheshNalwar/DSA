public class DoublyLL {
    Node head;
    private void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        newNode.prev=null;
        head.prev=null;
        if (head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    private void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data+"-> ");
            temp=temp.next;
        }
    }
    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        DoublyLL dll2 = new DoublyLL();
        dll.insertFirst(20);
        dll2.insertFirst(40);
        dll.display();
    }
}
