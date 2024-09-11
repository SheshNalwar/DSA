public class PairSum {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 7, 11, 14, 16, 20, 21 };
        int k = 31;

        System.out.println(pairSum(nums, k));
    }

    public static boolean pairSum(int nums[], int k) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == k) {
                System.out.println(low + " " + high);
                return true;
            } else if (sum > k) {
                high--;
            } else {
                low++;
            }
        }

        return false;
    }
}
