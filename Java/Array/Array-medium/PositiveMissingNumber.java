public class PositiveMissingNumber {
    public static void main(String[] args) {
        int nums[] = { 0, -9, 1, 3, -4, 5 };

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int nums[]) {
        int ans = -1;
        Boolean check[] = new Boolean[nums.length];

        for (int i = 0; i < check.length; i++) {
            check[i] = false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                check[nums[i]] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (check[i] == false) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}
