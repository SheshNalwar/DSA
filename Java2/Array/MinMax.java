import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = { 1, 21, 3, 44, 5 };
        Arrays.sort(arr);
        System.out.println("Min:"+arr[0]+" Max:"+arr[arr.length-1]);
    }
}
