/*
 * There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.


Example 1:
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
 */

public class MaxPointsCards {
    public static void main(String[] args) {
        int cardPoints[] = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        System.out.println("Max Score: " + maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < cardPoints.length - k; i++) {
            max1 += cardPoints[i];
        }
        for (int i = cardPoints.length - 1; i >= cardPoints.length - k; i--) {
            max2 += cardPoints[i];
        }

        int maxPoints = 0;
        maxPoints = Math.max(max1, max2);
        return maxPoints;
    }

}
