import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int array[]={2,0,2,1,1,0};
        System.out.println(Arrays.toString(brute(array)));
    }
    static int[] brute(int ar[]){
        int zeros=0;
        int ones=0;
        int twos=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]==0)zeros++;
            else if (ar[i]==1) {
                ones++;
            }else twos++;
        }
        for (int i = 0; i < zeros; i++) ar[i]=0;
        for (int i = zeros; i < zeros+ones; i++) ar[i]=1;
        for (int i = zeros+ones; i < ar.length; i++) ar[i]=2;
        return ar;
    }

}
