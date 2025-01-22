public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int n = arr.length;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println(missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        return totalSum - sum;
    }
}
