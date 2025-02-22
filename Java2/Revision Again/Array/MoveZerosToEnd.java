import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int[] temp = moveZeros(arr);
        System.out.println(Arrays.toString(temp));
    }

    public static int[] moveZeros(int[] arr){
        int[] temp = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            temp[j] = arr[i];
            j++;
        }

        for (int i = j; i < temp.length; i++) {
            temp[i] = 0;
        }

        return temp;
    }
}
