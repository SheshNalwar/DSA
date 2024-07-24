public class LinkListImpli {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(20); //0
        l1.add(21); //1
        l1.add(22); //2
        l1.add(100,28); /* It will Catch */
        l1.add(1,28);
        l1.removeLast();
        int array[]={1,2,3,4,5,6,7,8};
        l1.addAll(array);
        l1.printLinkedList();
    }
}
