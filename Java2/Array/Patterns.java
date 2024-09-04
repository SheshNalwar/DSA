public class Patterns {
    public static void main(String[] args) {
        pascalTriangle(5);
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

    static void pascalTriangle(int n) {
        int number=1;
        for(int i = 0; i < n; i++) {
            for(int space = 1; space < n - i; ++space) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    number = 1;
                else
                    number = number * (i - j + 1) / j;
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
    
}
