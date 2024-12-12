public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(subarraySum(arr));
    }

    public static int subarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i;
            }
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.print("Subarray is: [");
        for (int j = ansStart; j <= ansEnd; j++) {
            System.out.print(nums[j] + ", ");
        }
        System.out.println("]");

        return maxSum;
    }
}
