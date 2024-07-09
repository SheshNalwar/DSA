import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Indices are : " + Arrays.toString(threeSum(arr, 7)));

    }
    public static int[] threeSum(int nums[], int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        return new int[] { i, j, k };
                    }
                }
            }
        }
        return new int[] {};
    }
}
