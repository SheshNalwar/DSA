import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 7, 5, 9, 2, 8 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] selectionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int mini = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }

        return nums;
    }
}
