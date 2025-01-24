import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = optimal(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static int[] betterSolution(int[] nums, int target) {
        int i = 0;
        int j = i + 1;

        while (j < nums.length) {
            if (nums[i] + nums[j] == target) {
                return new int[] { i, j };
            }
            i++;
            j++;
        }
        return new int[] {};
    }

    // two pointer solution
    public static int[] optimal(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[] { i, j };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {};
    }

}
