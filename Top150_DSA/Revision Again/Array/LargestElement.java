public class LargestElement {

    public static void main(String[] args) {
        int  arr[] = {2,5,1,3,0};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}