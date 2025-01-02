import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int nums[] = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };
        int res[] = previousGreaterElement(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] previousGreaterElement(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[i] >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                pge[i] = -1;
            } else {
                pge[i] = st.peek();
            }
            st.push(nums[i]);
        }

        return pge;
    }
}
