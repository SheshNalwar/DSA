public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, };
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - 1 != arr[i - 1]) {
                return arr[i] - 1;
            }
        }

        return -1;
    }
}
