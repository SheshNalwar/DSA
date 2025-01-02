import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };

        int[] res = nextSmallerElement(arr);
        System.out.println(Arrays.toString(res));

    }

    public static int[] nextSmallerElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int nse[] = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nse[i] = -1;
            } else {
                nse[i] = stack.peek();
            }
            stack.push(nums[i]);
        }

        return nse;
    }
}
