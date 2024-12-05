import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int arr[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        Arrays.fill(temp, 1);

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            temp[i] *= product;
            product *= nums[i];
        }

        product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            temp[i] *= product;
            product *= nums[i];
        }

        return temp;
    }

}
