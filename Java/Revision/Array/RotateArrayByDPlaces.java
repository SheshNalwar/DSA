import java.util.Arrays;

public class RotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        rotateByD(arr, k);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] rotateByD(int[] arr, int k) {
        int temp[] = new int[k];
        int n = arr.length;
        k = k % n;
        if (k > n) {
            return new int[] {};
        }
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        int j = 0;
        for (int i = k; i < n; i++) {
            arr[j] = arr[i];
            j++;
        }

        j = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[j];
            j++;
        }
        return arr;
    }
}
