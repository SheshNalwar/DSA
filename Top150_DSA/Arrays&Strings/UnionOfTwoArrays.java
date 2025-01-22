import java.util.ArrayList;
import java.util.Arrays;

/*
 * Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.
Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}
Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5} 
 */

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 6 };
        int[] arr2 = { 2, 3, 4, 4, 5 };
        ArrayList<Integer> Union = findUnion(arr1, arr2);
        System.out.println(Union);
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }

        }
        while (i < n) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
