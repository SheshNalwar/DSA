import java.util.Arrays;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 1 };
        int res[] = sortArray(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                cnt0++;
            else if (nums[i] == 1)
                cnt1++;
            else
                cnt2++;
        }

        for (int i = 0; i < cnt0; i++) {
            nums[i] = 0;
        }

        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            nums[i] = 1;
        }

        for (int i = cnt0 + cnt1; i < n; i++) {
            nums[i] = 2;
        }

        return nums;
    }
}
