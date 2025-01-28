public class PrintSubarrayWIthMaximumSum {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        printSubarrayWIthMaximumSum(arr);
    }

    public static void printSubarrayWIthMaximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        for (int j = start; j <= end; j++) {
            System.out.print(arr[j] + " ,");
        }

        System.out.println();
        System.out.println(maxSum);
    }
}
