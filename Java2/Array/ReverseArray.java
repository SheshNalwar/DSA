import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        recursionReverse(arr,0, arr.length-1);
//        twoPointerReverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void twoPointerReverse(int arr[]){
        int start=0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void recursionReverse(int arr[],int start,int end){
        if (start>=end){
            return;
        }
        swap(arr, start, end);
        recursionReverse(arr,start+1,end-1);
    }
}