public class NextPermutation {

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };

        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {
        // find the breakpoint where a[i] < a[i+1]
        // find the index where the element is just greater than a[i] and is smallest in
        // the remaining array
        // swap the elements a[i] and greater element than a[i]
        // reverse the remaining array

        if (nums == null || nums.length <= 1)
            return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);

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