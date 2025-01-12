import java.awt.*;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int ar[]={3,2,4};
        System.out.println(Arrays.toString(twoSum(ar,6)));
    }
    static int[] twoSum(int ar[],int target){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]+ar[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
