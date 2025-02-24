import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;

        int temp[] = optimal(arr, target);
        System.out.println(Arrays.toString(temp));
    }

    public static int[] optimal(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];

            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }

            map.put(arr[i], i);
        }

        return new int[] {};
    }

    public static int[] bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

}
