
public class MaximumSubarraySum {
    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(bruteForce(arr));
        System.out.println(optimal(arr));
        printSubArray(arr);
    }

    public static void printSubArray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;

        int ansStart = 0;
        int ansEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Kadane's Algorithm
    public static int optimal(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static int bruteForce(int[] arr) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
