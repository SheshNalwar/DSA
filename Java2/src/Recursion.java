import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(ar,0, ar.length-1)));
    }
    static void oneton(int n){
        if (n == 0) {
            return;
        }
        oneton(n-1);
        System.out.println(n);
    }
    static void ntone(int n){
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        ntone(n-1);
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    static int[] reverseArray(int ar[],int start,int end){
        if (start>end){
            return ar;
        }
        swap(ar, start, end);
        reverseArray(ar, start+1, end-1);
        return ar;
    }
    static int[] swap(int ar[],int i,int j){
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        return ar;
    }

}
