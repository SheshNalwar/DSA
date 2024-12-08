public class PrintSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        subarray(arr);
    }

    public static void subarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]);
                    if (k < j) {
                        System.out.print(",");
                    }
                }
                System.out.println("]");
            }
        }
    }
}
