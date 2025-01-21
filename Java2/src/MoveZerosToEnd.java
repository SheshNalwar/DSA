import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int array[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println(Arrays.toString(optimized(array)));
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
    static int[] optimized(int ar[]){
        int j = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]==0){
                j=i;
                break;
            }
        }
        for (int i = j+1; i < ar.length; i++) {
            if (ar[i]!=0){
                swap(i,j,ar);
                j++;
            }
        }
        return ar;
    }
    static void swap(int i, int j, int ar[]){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
