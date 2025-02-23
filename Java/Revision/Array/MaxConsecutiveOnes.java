public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] prices = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        System.out.println(maxConsecutiveOnes(prices));
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
