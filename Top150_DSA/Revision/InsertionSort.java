import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 9 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }

        return nums;
    }
}
