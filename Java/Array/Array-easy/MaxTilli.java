public class MaxTilli {
    public static void main(String[] args) {
        int nums[] = { 0, -9, 1, 3, -4, 5 };
        maxTillI(nums);
    }

    public static void maxTillI(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            System.out.print(max + " ");
        }
    }
}
