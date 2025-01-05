import java.util.Stack;

public class ReverseADLL {

    // Time complexity O(N) space complexity O(1)
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        DLLNode last = null;
        DLLNode current = head;
        while (current != null) {
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }

        return last.prev;
    }

    // Time complexity O(2N) space complexity O(N) using stack
    public DLLNode reverseDLL(DLLNode head) {
        Stack<Integer> stack = new Stack<>();
        DLLNode temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (!stack.isEmpty()) {
            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;
    }
}