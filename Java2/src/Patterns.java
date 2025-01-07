public class Patterns {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i < 2*n; i++) {
            int col=i>n?2*n-i-1:i;
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        int start =1;
        for (int i = 0; i < n; i++) {
            if (i%2==0) start=0;
            else start=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num=num+1;
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 0; i <= n; i++) {
            for (char ch='A';ch<='A'+i ;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
