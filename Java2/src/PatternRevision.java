public class PatternRevision {
    public static void main(String[] args) {
        pattern11(5);
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
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
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
            for (int j=0;j<2*n-(2*i+1);j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i%2==0)num=1;
            else num=0;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num=1-num;
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        int num=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int i = 0;i<n;i++){
            for (char ch2 = 'a';ch2<='a'+i;ch2++){
                System.out.print(ch2+" ");
            }
            System.out.println();
        }
    }
}
