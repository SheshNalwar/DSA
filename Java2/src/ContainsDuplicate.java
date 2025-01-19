import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={1,2,3,2};
        System.out.println(isDuplicate2(arr));
        System.out.println(isDuplicate2(arr2));
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
    static boolean isDuplicate2(int []arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i :arr) {
            if (hashSet.contains(i)){
                return true;
            }
            hashSet.add(i);
        }
        return false;
    }
}
