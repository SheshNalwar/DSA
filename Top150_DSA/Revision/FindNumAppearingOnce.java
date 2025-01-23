import java.util.Arrays;

public class FindNumAppearingOnce {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        int result = findNumAppearingOnce(arr);
        System.out.println(result);
    }

    public static int findNumAppearingOnce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1)
                return num;
        }

        return -1;
    }
}