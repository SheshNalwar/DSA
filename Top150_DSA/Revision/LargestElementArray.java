public class LargestElementArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -10, 5, 3, 9 };
        System.out.println(findLargest(arr));
    }

    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}