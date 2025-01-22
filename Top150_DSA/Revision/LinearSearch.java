public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
