/*

Input Format: N = 3
Result: 
C
B C
A B C

Input Format: N = 6
Result:   
F
E F
D E F
C D E F
B C D E F
A B C D E F
 */
public class AlphaTrianglePatternReverse {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= (char) ('A' + n - 1); ch++) {

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
