import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(array)));
    }
    static int[] rotate(int ar[]){
        int temp = ar[0];
        for (int i = 0; i < ar.length-1; i++) {
            ar[i] = ar[i + 1];
        }
        ar[ar.length-1]=temp;
        return ar;
    }
}
