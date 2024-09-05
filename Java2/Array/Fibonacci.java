public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
    }
    static void fibo(int n){
        int first = 0;
        int second  = 1;
        int third;
        for (int i = 1; i <= n; i++) {
            System.out.print(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
    }
    static int fiborecurs(int n){
        if (n <=1) {
            return n;
        }
        return fiborecurs(n-1)+fiborecurs(n-2);
    }
}
