import java.util.Arrays;

public class LeaderArray {
    public static void main(String[] args) {
        int array[]={4, 7, 1, 0};
        System.out.println(Arrays.toString(leader(array)));
    }
    static int[] leader(int ar[]){
        int result []= new int[ar.length];
        int high = ar[ar.length-1];
        for (int i = ar.length-1; i > 0; i--) {
            if (ar[i]>high){
                result[i]=ar[i];
            }
        }
        return result;
    }
}
