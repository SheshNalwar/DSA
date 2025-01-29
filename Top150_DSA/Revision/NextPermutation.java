import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] nextPermutation(int[] nums) {
        // find the breakpoint where a[i] < a[i+1]
        // find the index where the element is just greater than a[i] and is smallest in
        // the remaining array
        // swap the elements a[i] and greater element than a[i]
        // reverse the remaining array

        if (nums == null || nums.length <= 1)
            return nums;

        int idx = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0, nums.length - 1);
            return nums;
        }

        for (int j = nums.length - 1; j >= idx; j--) {
            if (nums[j] > nums[idx]) {
                swap(nums, idx, j);
            }
        }

        reverse(nums, idx + 1, nums.length - 1);

        return nums;
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}