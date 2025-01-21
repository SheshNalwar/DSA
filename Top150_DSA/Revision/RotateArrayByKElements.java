import java.util.Arrays;

public class RotateArrayByKElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotateArrayByK(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] rotateArrayByK(int[] arr, int k) {
        int n = arr.length;
        if (k == 0 || n == 0) {
            return arr;
        }

        k = k % n;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }

        return arr;

    }
}
