import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(isDuplicate(arr));
    }
    static boolean isDuplicate(int []arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
