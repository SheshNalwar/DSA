public class LongestSubarrayWithKSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        int k = 10;
        System.out.println(subarrayKSum(arr, k));
    }

    public static int optimal(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int n = arr.length;
        int sum = arr[0];

        while (right < n) {
            while (left <= right && sum > k) {
               
            }
        }
    }

    public static int subarrayKSum(int[] arr, int k) {
        int length = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    length = Math.max(j - i + 1, length);
                }
            }
        }

        return length;
    }
}
