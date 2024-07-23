class Node {
    int data;
    Node pudcha;
    Node(int data) {
        this.data = data;
        this.pudcha = null;
    }
}
class LinkedList{
    Node head;
    void printLinkedList(){
        Node curr = this.head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.pudcha;
        }
    }
    void add(int elem){
        Node temp = new Node(elem);
        if (head == null) {
            head=temp;
        }else{
            Node current = head;
            while (current.pudcha!=null){
                current=current.pudcha;
            }
            current.pudcha=temp;
        }
    }
    void addFirst(int elem){
        Node newNode = new Node(elem);
        if (head==null){
            head=newNode;
        }else {
            newNode.pudcha=head;
            head=newNode;
        }
    }
    void add(int index,int elem){
        try{
            if (index==0){
                addFirst(elem);
            }else{
                Node newNode = new Node(elem);
                Node curr = this.head;
                for (int i = 0; i < index - 1; i++) {
                    curr=curr.pudcha;
                }
                newNode.pudcha=curr.pudcha;
                curr.pudcha=newNode;
            }
        }catch (NullPointerException e){
            System.out.println("Sambhal Ke Bhai");
        }
    }
    void removeLast(){
        if (head == null) {
            System.out.println("Array is already Empty");
        }else if (head.pudcha==null){
            head=null;
        }else{
            Node temp = head;
            while (temp.pudcha.pudcha!=null){
                temp=temp.pudcha;
            }
            temp.pudcha=null;
        }
    }
    void addAll(int arr[]){
        for (int elem:arr){
            add(elem);
        }
    }
    

}
public class LinkListImpli {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(20); //0
        l1.add(21); //1
        l1.add(22); //2
        l1.add(100,28);
        l1.add(1,28);
        l1.removeLast();
        int array[]={1,2,3,4,5,6,7,8};
        l1.addAll(array);
        l1.printLinkedList();
    }

}
