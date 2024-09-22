/*
 * Challenge 3 - 2D matrix Search
Problem
Given a nxm matrix.
Write an algorithm to find that the given value exists in the matrix or not.
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Constraints
1 <= N,M <= 1,000

Sample Test Case:
Consider the following matrix:
[
[1, 4, 7, 11, 15],
[2, 5, 8, 12, 19],
[3, 6, 9, 16, 22],
[10, 13, 14, 17, 24],
[18, 21, 23, 26, 30]
]

Given target = 5, return true.
Given target = 20, return false.

Brute Force Approach
Linear search in a 2D Array.

Time complexity : O(N*M)

Optimised Approach [IMP]
    1. Start from the top right element.
    2. You are at (r,c)
    if(matrix[r][c] == target)
    return true
    If (matrix[r][c] > target)
    c--
    else
    r++;

At (r,c), you can go to (r-1,c) or (r,c-1), depending on the value of matrix[i][j]
and target.

Time complexity : O(N + M)
 */
public class MatrixSearch {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 7, 11 }, { 2, 5, 8, 12 }, { 3, 6, 9, 16 }, { 10, 13, 14, 17 } };
        int target = 20;
        System.out.println(search(matrix, target));
    }

    public static boolean search(int matrix[][], int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
