import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteriodCollision {

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 1, 2, -3, -7, 17, 15, -16 };
        int nums[] = asteriodCollision(arr);
        System.out.println(Arrays.toString(nums));

        int[] temp = asteriodCollision2(arr);
        System.out.println(Arrays.toString(temp));
    }

    // Solution using ArrayList
    public static int[] asteriodCollision(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int asteroid = arr[i];
            boolean destroyed = false;

            while (!list.isEmpty() && asteroid < 0 && list.get(list.size() - 1) > 0) {
                int lastElement = list.get(list.size() - 1);
                if (Math.abs(asteroid) > lastElement) {
                    list.remove(list.size() - 1); // Remove the last element
                } else if (Math.abs(asteroid) == lastElement) {
                    list.remove(list.size() - 1); // Both are destroyed
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Current asteroid is destroyed
                    break;
                }
            }

            if (!destroyed) {
                list.add(asteroid); // Add current asteroid if not destroyed
            }
        }

        // Convert the List to an array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // Solution using Stack
    public static int[] asteriodCollision2(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                stack.push(arr[i]); // Push positive asteroid onto the stack
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(arr[i])) {
                    stack.pop(); // Remove smaller positive asteroids
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(arr[i])) {
                    stack.pop(); // Destroy both asteroids if equal
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(arr[i]); // Push the negative asteroid if it survives
                }
            }
        }

        // Convert stack to an array
        int[] nums = new int[stack.size()];
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = stack.pop(); // Pop elements in reverse order
        }

        return nums;
    }

}
