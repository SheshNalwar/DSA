import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        int start = 0;
        int end = nums.length - 1;

        mergeSort(nums, start, end);
        System.out.println(Arrays.toString(nums));

    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static int[] merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k] = nums[left];
                left++;
            } else {
                temp[k] = nums[right];
                right++;
            }
            k++;
        }

        while (left <= mid) {
            temp[k] = nums[left];
            k++;
            left++;
        }

        while (right <= high) {
            temp[k] = nums[right];
            k++;
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }

        return nums;
    }
}
