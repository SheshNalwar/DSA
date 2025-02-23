public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int j = 0; j < arr.length; j++) {
            if (target == arr[j]) {
                return j;
            }
        }

        return -1;
    }
}
