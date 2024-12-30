
public class SumOfSubarrayRanges {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2 }; // Output = 13
        System.out.println(bruteForce(arr));
    }

    // Brute force approach
    // Time complexity O(n^2)
    public static int bruteForce(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int largest = arr[i];
            int smallest = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                largest = Math.max(largest, arr[j]);
                smallest = Math.min(smallest, arr[j]);

                sum = sum + (largest - smallest);
            }
        }

        return sum;
    }
}