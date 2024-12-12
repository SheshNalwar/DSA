
import java.util.Arrays;

// Worst case time complexity = O(N^2)
// Average case time complexity = O(N^2)
// Best case time complexity = O(N^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) { // Iterate over the array till second last index of array
            int min = i;
            for (int j = i + 1; j < n; j++) { // Find the minimum element from unsorted array
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap the minimum element and current element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}