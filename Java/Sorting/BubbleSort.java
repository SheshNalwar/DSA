import java.util.Arrays;

// Worst case time complexity = O(N^2)
// Average case time complexity = O(N^2)
// Best case time complexity = O(N)

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22 };
        // int[] arr = { 1, 2, 3, 4, 5 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); // [12, 22, 25, 34, 64]
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) { // Iterate over the array in decrement
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // swap the elements
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1; // to check if there were any swaps
                }
            }
            if (didSwap == 0) { // if no swaps, then exit the loop to optimize in O(N) time complexity
                break;
            }
        }

        return arr;
    }
}
