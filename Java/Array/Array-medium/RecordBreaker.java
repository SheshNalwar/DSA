/* Record Breaker

 * Isyana is given the number of visitors at her local theme park on N consecutive
days. The number of visitors on the i-th day is Vi

. A day is record breaking if it satisfies both of the following conditions:
● The number of visitors on the day is strictly larger than the number of
visitors on each of the previous days.
● Either it is the last day, or the number of visitors on the day is strictly larger
than the number of visitors on the following day.
Note that the very first day could be a record breaking day!
Please help Isyana find out the number of record breaking days.

Input
The first line of the input gives the number of test cases, T. T test cases follow.
Each test case begins with a line containing the integer N. The second line
contains N integers. The i-th integer is Vi
.
Output
For each test case, output one line containing Case #x: y, where x is the test case
number (starting from 1) and y is the number of record breaking days.

Constraints
Time limit: 20 seconds per test set.
Memory limit: 1GB.
1 ≤ T ≤ 100.
0 ≤ Vi ≤ 2 × 105
.
Test set 1
1 ≤ N ≤ 1000.

Test set 2
1 ≤ N ≤ 2 × 105 for at most 10 test cases.
For the remaining cases, 1 ≤ N ≤ 1000.
 */

import java.util.Scanner;

public class RecordBreaker {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 7, 2, 0, 2, 2 };

        System.out.println(recordBreaker(arr));
    }

    public static int recordBreaker(int nums[]) {
        int ans = 0;
        int max = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max && nums[i] > nums[i + 1]) {
                ans++;
            }

            max = Math.max(max, nums[i]);
        }

        return ans;
    }
}
