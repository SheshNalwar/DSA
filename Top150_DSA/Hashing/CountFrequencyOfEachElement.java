import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachElement {

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        frequency(arr, n);
    }

    public static void frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}