import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int  arr[] = {1, 2, 3, 4, 4};
        System.out.println(solutionTwo(arr));
    }


    public static int solutionOne(int arr[]) {

        Arrays.sort(arr);
        int i = arr.length - 2;

        while(i > 0) {
            if (arr[i]  < arr[i + 1]) {
                return arr[i];
            }
            i--;
        }

        return arr[arr.length-1];
        
    }

    public static int solutionTwo(int arr[]) {
        int largest = arr[0];
        int secondLarge = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLarge = largest;
                largest = arr[i];
            }
        }
        return secondLarge;
    }
}
