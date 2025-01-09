import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
        int start=0;
        int end = arr.length-1;
        while (start<end){
            swap(start,end,arr);
            start++;
            end--;
        }
        return arr;
    }
    static int[] swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
