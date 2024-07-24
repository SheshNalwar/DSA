public class RemoveNthNodeFromEnd {
    static Node removeNthFromEnd(Node head, int n) {
        if (head == null || n <= 0) return head;
        Node dummy = new Node(0);
        dummy.pudcha = head;
        Node first = dummy;
        Node second = dummy;
        for (int i = 0; i <= n; i++) {
            if (first != null) {
                first = first.pudcha;
            } else {
                return head;
            }
        }
        while (first != null) {
            first = first.pudcha;
            second = second.pudcha;
        }
        second.pudcha = second.pudcha.pudcha;
        return dummy.pudcha;
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        int array[]={1,2,3,4,5,6,7,8};
        l1.addAll(array);
        Node newHead = removeNthFromEnd(l1.getHead(), 2);
        l1.head = newHead;
        l1.printLinkedList();
    }
}