import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22 };
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static int[] merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
                k++;
            } else {
                temp[k] = arr[right];
                right++;
                k++;
            }
        }

        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        int tempIndex = 0;
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return arr;
    }

}