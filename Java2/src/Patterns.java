public class Patterns {
    public static void main(String[] args) {
        pattern14(5);
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            int space = n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j< 2*n -(2*i +1);j++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        int num=1;
        for (int i = 1; i <= n; i++) {
            if (i%2==0)num=0;
            else num=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num=1-num;
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        int total = n*2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            int space = total-2;
            total=space;
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for (int i = n; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
}
