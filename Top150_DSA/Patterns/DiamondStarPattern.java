/*
 * 
 * Input Format: N = 3
Result: 
  *  
 ***
***** 
*****  
 ***
  *   
Input Format: N = 6
Result:   
     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *
 */

public class DiamondStarPattern {

    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* " + " ");
            }
            System.out.println();
        }
    }
}