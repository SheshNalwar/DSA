public class ArithmeticSubarray {
    public static void main(String[] args) {
        int nums[] = { 10, 7, 4, 6, 8, 10, 11 };
        System.out.println("Arithmetic Sum of subarray : " + arithmeticSubarray(nums));
    }

    public static int arithmeticSubarray(int nums[]) {
        int ans = 2;
        int previous = nums[1] - nums[0];
        int curr = 2;
        for (int j = 2; j < nums.length; j++) {
            if (previous == nums[j] - nums[j - 1]) {
                curr++;
            } else {
                previous = nums[j] - nums[j - 1];
                curr = 2;
            }

            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
