public class LongestSubarrayWithSum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 1, 9 };
        int target = 10;
        System.out.println(longestSubarrayWithSum2(nums, target));
    }

    public static int longestSubarrayWithSum(int nums[], int target) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                if (sum == target) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        return len;
    }

    public static int longestSubarrayWithSum2(int nums[], int target) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == target) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        return len;
    }
}
