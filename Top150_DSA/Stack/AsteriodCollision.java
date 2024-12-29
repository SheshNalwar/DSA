import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsteriodCollision {

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 1, 2, -3, -7, 17, 15, -16 };
        int nums[] = asteriodCollision(arr);
        System.out.println(Arrays.toString(nums));
    }

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
}
