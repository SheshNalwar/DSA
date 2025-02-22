import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = optimal(arr);
       for (int i = 0; i < k; i++) {
        System.out.print(arr[i]  + " " );
       }
    }

    public static int optimal(int arr[]){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static int[] bruteForce(int[] arr) {
        int temp[] = new int[arr.length];

        int i = 1;
        int j = 1;
        temp[0]=arr[0];
        while (i < arr.length) {
            if (arr[i] == arr[i-1]) {
                i++;
                continue;
            }
            temp[j] = arr[i];
            i++;
            j++;
        }

        return temp;
    }
}
