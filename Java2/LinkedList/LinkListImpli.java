// package Java2.LinkedList;

class Node {
    int data;
    Node pudcha;
    Node(int data) {
        this.data = data;
        this.pudcha = null;
    }
}

public class LinkListImpli {
    public static void main(String[] args) {
        Node n1 = new Node(20); 
        Node n2 = new Node(7);
        n1.pudcha=n2; 
        System.out.println(n1.data+n2.data);
    }
}
