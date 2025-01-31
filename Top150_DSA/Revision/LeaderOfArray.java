import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderOfArray {
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> list = leaderOfArray(arr);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static ArrayList<Integer> leaderOfArray(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n - 1];
        list.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        } 

        return list;
    }
}
