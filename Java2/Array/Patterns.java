public class Patterns {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    static void pattern5(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int total = i > n ? 2 * n - i - 1 : i;
            for (int j = 1; j <= total; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
