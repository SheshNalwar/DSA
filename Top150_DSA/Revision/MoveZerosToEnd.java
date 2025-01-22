import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 5 };
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] moveZeros(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            arr[index++] = arr[i];
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }
}