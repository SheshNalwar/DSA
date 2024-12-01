
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j - 1]; // swap the elements
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        return arr;
    }
}
