public class MostConsecutiveOnes {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        int result = consecutiveOnes(arr);
        System.out.println(result);
    }

    public static int consecutiveOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}