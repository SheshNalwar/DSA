import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}
