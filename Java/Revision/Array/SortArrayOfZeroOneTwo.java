import java.util.Arrays;

public class SortArrayOfZeroOneTwo {

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0, 1 };
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 2) {
                swaping(arr, mid, high);
                high--;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 0) {
                swaping(arr, low, mid);
                mid++;
                low++;
            }
        }

        return arr;
    }

    public static void swaping(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}