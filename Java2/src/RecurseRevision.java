public class RecurseRevision {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static void onetoN(int n){
        if (n==0)return;
        onetoN(n-1);
        System.out.println(n);
    }
    static void nToNe(int n) {
        if (n == 0) return;
        System.out.println(n);
        nToNe(n-1);
    }
    static int sumOfirstN(int n){
        if (n == 0) return 0;
        return n + sumOfirstN(n-1);
    }
    static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
