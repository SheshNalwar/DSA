public class TreeImpli {
    public static void main(String[] args) {
        Tree node = new Tree();
        Tree leftNode = new Tree();
        Tree rightNode = new Tree();
        node.left=leftNode;
        node.data=27;
        node.right=rightNode;

        leftNode.left=null;
        leftNode.data=25;
        leftNode.right=null;

        rightNode.left=null;
        rightNode.data=28;
        rightNode.right=null;
        System.out.println(node.left.data);
        System.out.println(node.data);
        System.out.println(node.right.data);
    }
}
