/*
 * Example 1:
Input: N = 3
Output: 
* * *
* * *
* * *

Example 2:
Input: N = 6
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
 */
public class RectangularStarPattern {
    public static void main(String[] args) {
        int n = 5; // number of rows
        pattern(n);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}