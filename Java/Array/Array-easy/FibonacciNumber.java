/* Fibonacci Number
 The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 2;
        int output = 1;
        int res = fib(n);

        if (output == res) {
            System.out.println("Output" + res);
            System.out.println("Solution accepted");
        }

    }

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
