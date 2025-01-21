import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int array[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println(Arrays.toString(moveZeros(array)));
    }
    static int[] moveZeros(int ar[]){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]!=0){
                temp.add(ar[i]);
            }
        }
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            ar[i]= temp.get(i);
        }
        for (int i = size; i < ar.length; i++) {
            ar[i]=0;
        }
        return ar;
    }
}
