public class FindMissingNumber {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        int n = nums.length;
        int sum = 0;
        int expectedSum = n * (n + 1) / 2;
        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
        }

        int res = expectedSum - sum;
        System.out.println(res);
    }
}
