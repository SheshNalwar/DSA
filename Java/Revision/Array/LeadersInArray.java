import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        System.out.println(leadersArray(arr));
    }

    public static ArrayList<Integer> leadersArray(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(arr[arr.length - 1]);

        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        return ans;
    }
}
