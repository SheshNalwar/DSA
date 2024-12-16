/* Count next greater element
 * Given an array of N integers and Q queries of indices. Return a list NGEs[] where NGEs[i] stores the count of elements strictly greater than the current element (arr[indices[i]]) to the right of indices[i].

Examples :

Input:  arr[]     = [3, 4, 2, 7, 5, 8, 10, 6]
        queries = 2
        indices[] = [0, 5]
Output:  6, 1
Explanation: The next greater elements to the right of 3(index 0) are 4,7,5,8,10,6. The next greater elements to the right of 8(index 5) is only 10.

Input:  arr[]     = [1, 2, 3, 4, 1]
        queries = 2
        indices[] = [0, 3]
Output:  3, 0
Explanation: The count of numbers to the right of index 0 which are greater than arr[0] is 3 i.e. (2, 3, 4). Similarly, the count of numbers to the right of index 3 which are greater than arr[3] is 0, since there are no greater elements than 4 to the right of the array.
 */

import java.util.Arrays;

public class CountNextGreaterElements {
    public static void main(String[] args) {
        int N = 8;
        int[] arr = { 3, 4, 2, 7, 5, 8, 10, 6 };
        int queries = 2;
        int[] indices = { 0, 5 };

        int res[] = count_NGEs(N, arr, queries, indices);
        System.out.println(Arrays.toString(res));

    }

    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        int[] result = new int[queries];

        for (int q = 0; q < queries; q++) {
            int index = indices[q];
            int count = 0;

            // Count elements strictly greater than arr[index] to the right
            for (int j = index + 1; j < N; j++) {
                if (arr[j] > arr[index]) {
                    count++;
                }
            }

            result[q] = count;
        }

        return result;

    }

}
