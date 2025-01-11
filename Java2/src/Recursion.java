public class Recursion {
    public static void main(String[] args) {
        int sum = sum(5);
        System.out.println(sum);
    }
    static void oneton(int n){
        if (n == 0) {
            return;
        }
        oneton(n-1);
        System.out.println(n);
    }
    static void ntone(int n){
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        ntone(n-1);
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return n + sum(n-1);
    }

}
