import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int ar[]={3,2,4};
        System.out.println(Arrays.toString(twoSumMapping(ar,6)));
    }
    static int[] twoSum(int ar[],int target){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]+ar[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    static int[] twoSumMapping(int ar[],int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (hashMap.containsKey(target - ar[i])) {
                return new int[] {hashMap.get(target - ar[i]), i};
            }
            hashMap.put(ar[i], i);
        }
        return new int[] {};
    }
}
